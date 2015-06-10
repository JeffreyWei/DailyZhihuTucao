package com.babibeng.shimao.sun.wecharthandle.eventhandle;

import com.github.sd4324530.fastweixin.handle.EventHandle;
import com.github.sd4324530.fastweixin.message.BaseMsg;
import com.github.sd4324530.fastweixin.message.req.MenuEvent;
import org.springframework.stereotype.Component;

/**
 * Created by wei on 15/6/9.
 */
@Component
public class MenuEventHandle implements EventHandle<MenuEvent> {
    @Override
    public BaseMsg handle(MenuEvent event) {
        return null;
    }

    @Override
    public boolean beforeHandle(MenuEvent event) {
        return false;
    }
}
