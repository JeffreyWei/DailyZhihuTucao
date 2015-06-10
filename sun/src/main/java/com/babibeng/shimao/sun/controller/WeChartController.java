package com.babibeng.shimao.sun.controller;

import com.babibeng.shimao.sun.wecharthandle.eventhandle.MenuEventHandle;
import com.babibeng.shimao.sun.wecharthandle.msghandle.LocationHandle;
import com.babibeng.shimao.sun.wecharthandle.msghandle.TextHandle;
import com.babibeng.shimao.sun.wecharthandle.msghandle.VoiceHandle;
import com.github.sd4324530.fastweixin.handle.EventHandle;
import com.github.sd4324530.fastweixin.handle.MessageHandle;
import com.github.sd4324530.fastweixin.servlet.WeixinControllerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wei on 15/6/5.
 */
@RequestMapping("/weixin")
public class WeChartController extends WeixinControllerSupport {

    @Autowired
    private TextHandle textHandle;
    @Autowired
    private VoiceHandle voiceHandle;
    @Autowired
    private LocationHandle locationHandle;
    @Autowired
    private MenuEventHandle menuEventHandle;

    private String token;
    @Override
    protected String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }

    @Override
    protected List<MessageHandle> initMessageHandles() {
        List<MessageHandle> handles = new ArrayList<MessageHandle>();
        handles.add(textHandle);
        handles.add(voiceHandle);
        handles.add(locationHandle);
        return handles;
    }

    @Override
    protected List<EventHandle> initEventHandles() {
        List<EventHandle> handles = new ArrayList<EventHandle>();
        handles.add(menuEventHandle);
        return handles;
    }
}