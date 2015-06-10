package com.babibeng.shimao.sun.wecharthandle.eventhandle;

import com.github.sd4324530.fastweixin.handle.EventHandle;
import com.github.sd4324530.fastweixin.message.BaseMsg;
import com.github.sd4324530.fastweixin.message.req.SendPicsInfoEvent;
import org.springframework.stereotype.Component;

/**
 * Created by wei on 15/6/9.
 */
@Component
public class SendPicsInfoEventHandle implements EventHandle<SendPicsInfoEvent> {
    @Override
    public BaseMsg handle(SendPicsInfoEvent event) {
        return null;
    }

    @Override
    public boolean beforeHandle(SendPicsInfoEvent event) {
        return false;
    }
}
