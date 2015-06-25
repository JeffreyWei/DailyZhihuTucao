package com.babibeng.shimao.sun.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wei on 15/6/24.
 */
public final class WebPage {
    public static String getWebBody(String URL) {
        String html = "";
        HttpURLConnection con = null;
        try {
            java.net.URL url = new URL(URL);
            con = (HttpURLConnection) url.openConnection();
            con.setReadTimeout(3000);
            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent", "Mozilla/5.0");

            if (con.getResponseCode() == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                html = response.toString();
            } else {
//                throw new IOException("Network Error - response code: " + con.getResponseCode());
            }
        } catch (Exception e) {

        } finally {
            con.disconnect();
        }
        return html;
    }
    public static String clearTag(String OriginStr) {
        Pattern p_html = Pattern.compile("<[^>]+>", Pattern.CASE_INSENSITIVE);
        Matcher m_html = p_html.matcher(OriginStr);
        return m_html.replaceAll("").trim(); //过滤html标签
    }
}
