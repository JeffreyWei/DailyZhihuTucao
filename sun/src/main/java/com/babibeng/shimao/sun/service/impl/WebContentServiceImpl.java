package com.babibeng.shimao.sun.service.impl;

import com.alibaba.fastjson.JSON;
import com.babibeng.shimao.sun.dao.TucaoDetailMapper;
import com.babibeng.shimao.sun.dao.TucaoMainMapper;
import com.babibeng.shimao.sun.model.DailyInfo;
import com.babibeng.shimao.sun.model.DailyStoryInfo;
import com.babibeng.shimao.sun.model.TucaoDetail;
import com.babibeng.shimao.sun.model.TucaoMain;
import com.babibeng.shimao.sun.service.WebContentService;
import com.babibeng.shimao.sun.util.APPConfig;
import com.github.abel533.entity.Example;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import static com.babibeng.shimao.sun.util.WebPage.clearTag;
import static com.babibeng.shimao.sun.util.WebPage.getWebBody;

/**
 * Created by wei on 15/6/23.
 */
@Service
public class WebContentServiceImpl implements WebContentService {

    @Autowired
    private TucaoMainMapper tucaoMainMapper;

    @Autowired
    private TucaoDetailMapper tucaoDetailMapper;

    public static void main(String[] args) {
        WebContentServiceImpl service = new WebContentServiceImpl();
        Calendar start = Calendar.getInstance();
        start.set(2013, 5, 20);
        Calendar end = Calendar.getInstance();
        end.set(2015, 6, 23);
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        while(start.compareTo(end) <= 0) {
            String dateStr=format.format(start.getTime());
            System.out.println(dateStr+" result:"+service.getDailyZhihuContent(dateStr));
            //循环，每次天数加1
            start.set(Calendar.DATE, start.get(Calendar.DATE) + 1);
        }
    }

    /**
     * @param dateStr {dateStr}的数字应为 20131119
     * @return
     */
    @Override
    public boolean getDailyZhihuContent(String dateStr) {
        boolean success = true;
        //防止重复下载，进行重复检查
        Example example = new Example(TucaoMain.class);
        example.createCriteria().andEqualTo("downloaded", 1).andEqualTo("dateid", dateStr);
        List<TucaoMain> tucaoMainList = tucaoMainMapper.selectByExample(example);
        if (tucaoMainList.size() > 0) {
            return true;
        }
        try {
            String content = getWebBody(APPConfig.DailyZhihu.BEFORE + dateStr);
            DailyInfo info = JSON.parseObject(content, DailyInfo.class);
            TucaoMain tucaoMain = null;
            //保存main表数据
            for (DailyStoryInfo storyInfo : info.getStories()) {
                if (storyInfo.getTitle().indexOf("吐槽") > -1) {
                    tucaoMain = new TucaoMain(storyInfo.getId(), info.getDate());
                    tucaoMainMapper.insert(tucaoMain);
                    break;
                }
            }
            if (tucaoMain == null) {
                return false;
            }
            //解析吐槽帖子，保存信息
            content = getWebBody(APPConfig.DailyZhihu.STORY + tucaoMain.getId());

//             content = getWebBody("http://news-at.zhihu.com/api/4/news/" + storyID.toString());
            JSONObject detail = null;
            try {
                detail = new JSONObject(content);
                Document doc = Jsoup.parse(detail.getString("body"));
                Elements elements = doc.select("div.content");
                Elements links = doc.select("a");
                Elements titles = doc.select("h2.question-title");
                int count = elements.size();
                if (count == 0) {
                    return false;
                }
                int i = 0;
                for (; i < count; i++) {
                    try {

                        //判断content下面是否有img标签
                        if (!elements.get(i).select("img").isEmpty()) {
                            continue;
                        }
                        String comment = clearTag(elements.get(i).html());
                        String link = links.get(i).attr("href").toString();
                        String title = clearTag(titles.get(i).html());
                        TucaoDetail tucaoDetail = new TucaoDetail(tucaoMain.getId(), title, comment, link);
                        tucaoDetailMapper.insert(tucaoDetail);
                    } catch (Exception e) {

                    }
                }
                if (i > 0) {
                    //更新main表download字段
                    tucaoMain.setDownloaded(1);
                    tucaoMainMapper.updateByPrimaryKeySelective(tucaoMain);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            success = false;
        }
        return success;
    }

//    private String getWebBody(String URL, int timeout) {
//        String content = null;
//        try {
//            HttpClient httpClient = new HttpClient();
//            GetMethod method = new GetMethod(URL);
//            httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(timeout);
//            httpClient.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");
//
//            method.getParams().setCookiePolicy(CookiePolicy.BROWSER_COMPATIBILITY);
//            method.setRequestHeader("User-Agent", "Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; WOW64; Trident/5.0)");
//            method.addRequestHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
//            Document doc = null;
//            try {
//                httpClient.executeMethod(method);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            if (method.getStatusCode() == HttpStatus.SC_OK) {
//                try {
//                    doc = Jsoup.parse(method.getResponseBodyAsString());
//                } catch (IOException e) {
//                }
//            }
//            content = StringEscapeUtils.unescapeHtml(doc.body().html());
//
//        } catch (Exception e) {
//
//        }
//        return content;
//    }
//
//    private String getWebBody(String URL) {
//        return getWebBody(URL, 3000);
//    }
}
