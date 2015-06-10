package com.babibeng.shimao.sun.wecharthandle.eventhandle;

import com.github.sd4324530.fastweixin.handle.EventHandle;
import com.github.sd4324530.fastweixin.message.BaseMsg;
import com.github.sd4324530.fastweixin.message.req.LocationEvent;
import org.springframework.stereotype.Component;

/**
 * Created by wei on 15/6/9.
 */
@Component
public class LocationEventHandle implements EventHandle<LocationEvent> {
    @Override
    public BaseMsg handle(LocationEvent event) {
        return null;
    }

    @Override
    public boolean beforeHandle(LocationEvent event) {
        return false;
    }
}
