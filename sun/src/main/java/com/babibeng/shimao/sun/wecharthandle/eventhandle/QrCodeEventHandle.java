package com.babibeng.shimao.sun.wecharthandle.eventhandle;

import com.github.sd4324530.fastweixin.handle.EventHandle;
import com.github.sd4324530.fastweixin.message.BaseMsg;
import com.github.sd4324530.fastweixin.message.req.QrCodeEvent;
import org.springframework.stereotype.Component;

/**
 * Created by wei on 15/6/9.
 */
@Component
public class QrCodeEventHandle implements EventHandle<QrCodeEvent> {
    @Override
    public BaseMsg handle(QrCodeEvent event) {
        return null;
    }

    @Override
    public boolean beforeHandle(QrCodeEvent event) {
        return false;
    }
}
