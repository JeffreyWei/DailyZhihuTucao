package com.babibeng.shimao.sun.controller;

import com.babibeng.shimao.sun.util.WeChartConfig;
import com.github.sd4324530.fastweixin.api.MenuAPI;
import com.github.sd4324530.fastweixin.api.config.ApiConfig;
import com.github.sd4324530.fastweixin.api.entity.Menu;
import com.github.sd4324530.fastweixin.api.entity.MenuButton;
import com.github.sd4324530.fastweixin.api.enums.MenuType;
import com.github.sd4324530.fastweixin.api.enums.ResultType;
import com.github.sd4324530.fastweixin.api.response.GetMenuResponse;
import com.github.sd4324530.fastweixin.handle.EventHandle;
import com.github.sd4324530.fastweixin.handle.MessageHandle;
import com.github.sd4324530.fastweixin.message.Article;
import com.github.sd4324530.fastweixin.message.BaseMsg;
import com.github.sd4324530.fastweixin.message.NewsMsg;
import com.github.sd4324530.fastweixin.message.TextMsg;
import com.github.sd4324530.fastweixin.message.req.*;
import com.github.sd4324530.fastweixin.servlet.WeixinControllerSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wei on 15/6/5.
 */
//@RestController
@RequestMapping("/weixin")
public class WeixinController extends WeixinControllerSupport {

    @Autowired
    private WeChartConfig config;
    private Logger logger = LoggerFactory.getLogger(WeixinController.class);
    private String token;

    private ApiConfig getConfig() {
        return config.getWeCharApiConfig();
    }

    //设置TOKEN，用于绑定微信服务器
    @Override
    protected String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    //    //使用安全模式时设置：APPID
//    //不再强制重写，有加密需要时自行重写该方法
//    @Override
//    protected String getAppId() {
//        return "wxded5ba7134d7afc0";
//    }
//    //使用安全模式时设置：密钥
//    //不再强制重写，有加密需要时自行重写该方法
//    @Override
//    protected String getAESKey() {
//        return null;
//    }
    //重写父类方法，处理对应的微信消息
    @Override
    protected BaseMsg handleTextMsg(TextReqMsg msg) {
        String content = msg.getContent();
        BaseMsg result = null;
        logger.info("用户发送到服务器的内容:{}", content);
        if (content.equals("1")) {
            //图文新闻
            NewsMsg mes = new NewsMsg(new ArrayList<Article>() {{
                add(new Article("爱哩快看——瘦人的秘密", "瘦人的秘密", "https://ss3.baidu.com/9fo3dSag_xI4khGko9WTAnF6hhy/super/whfpf%3D425%2C260%2C50/sign=dd74fd8f9e504fc2a20ae34583e0d323/6c224f4a20a44623fbadd4e59d22720e0df3d7d6.jpg", "http://www.baidu.com"));
                add(new Article("小树快来这有雨", "这里有小鱼", "https://ss0.baidu.com/94o3dSag_xI4khGko9WTAnF6hhy/super/whfpf%3D425%2C260%2C50/sign=86969735bc014a90816b15fdcf4a0d20/241f95cad1c8a786519662896209c93d71cf50fc.jpg", "http://www.baidu.com"));
            }});
            result = mes;
        } else if (content.equals("2")) {
            createMenu(getConfig());
            result = new TextMsg("创建菜单成功");
        } else if (content.equals("3")) {
            MenuAPI api = new MenuAPI(getConfig());
            GetMenuResponse response = api.getMenu();
            result = new TextMsg("菜单:" + response.toJsonString());
        } else {
            result = new TextMsg("输入1显示新闻，2创建菜单，3列出现有菜单，输入其他显示菜单！");
        }
        return result;
    }

    @Override
    protected BaseMsg handleVoiceMsg(VoiceReqMsg msg) {

        return new TextMsg("收到用户的语音信息!");
    }

    @Override
    protected BaseMsg handleLocationMsg(LocationReqMsg msg) {
        logger.info(msg.toString());
        return handleDefaultMsg(msg);
    }

    /*1.1版本新增，重写父类方法，加入自定义微信消息处理器
     *不是必须的，上面的方法是统一处理所有的文本消息，如果业务觉复杂，上面的会显得比较乱
     *这个机制就是为了应对这种情况，每个MessageHandle就是一个业务，只处理指定的那部分消息
     */
    @Override
    protected List<MessageHandle> initMessageHandles() {
        List<MessageHandle> handles = new ArrayList<MessageHandle>();
        //handles.add(new MyMessageHandle());
        return handles;
    }

    //1.1版本新增，重写父类方法，加入自定义微信事件处理器，同上
    @Override
    protected List<EventHandle> initEventHandles() {
        List<EventHandle> handles = new ArrayList<EventHandle>();
        //handles.add(new MyEventHandle());
        return handles;
    }

    @Override
    protected BaseMsg handleMenuClickEvent(MenuEvent event) {
        logger.info(event.toString());
        return handleDefaultEvent(event);
    }


    private void createMenu(ApiConfig config) {
        MenuAPI menuAPI = new MenuAPI(config);

        //先删除之前的菜单
        menuAPI.deleteMenu();
        Menu request = new Menu();
        //准备一级主菜单
        MenuButton main1 = new MenuButton();
        main1.setType(MenuType.CLICK);
        main1.setKey("main1");
        main1.setName("测试");
        //准备子菜单
        MenuButton sub1 = new MenuButton();
        sub1.setKey("sub1");
        sub1.setName("授权");
        sub1.setType(MenuType.VIEW);
        sub1.setUrl("http://www.baidu.com");
        MenuButton sub2 = new MenuButton();
        sub2.setKey("sub2");
        sub2.setName("点击");
        sub2.setType(MenuType.CLICK);


        List<MenuButton> list = new ArrayList<MenuButton>();
        list.add(sub1);
        list.add(sub2);
        //将子菜单放入主菜单里
        main1.setSubButton(list);

        List<MenuButton> mainList = new ArrayList<MenuButton>();
        mainList.add(main1);
        //将主菜单加入请求对象
        request.setButton(mainList);
        //创建菜单
        ResultType resultType = menuAPI.createMenu(request);
        logger.info("创建菜单结果{}", resultType.toString());
    }
}