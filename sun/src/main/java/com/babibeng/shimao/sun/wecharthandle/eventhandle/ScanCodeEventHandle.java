package com.babibeng.shimao.sun.wecharthandle.eventhandle;

import com.github.sd4324530.fastweixin.handle.EventHandle;
import com.github.sd4324530.fastweixin.message.BaseMsg;
import com.github.sd4324530.fastweixin.message.req.ScanCodeEvent;
import org.springframework.stereotype.Component;

/**
 * Created by wei on 15/6/9.
 */
@Component
public class ScanCodeEventHandle implements EventHandle<ScanCodeEvent> {
    @Override
    public BaseMsg handle(ScanCodeEvent event) {
        return null;
    }

    @Override
    public boolean beforeHandle(ScanCodeEvent event) {
        return false;
    }
}
