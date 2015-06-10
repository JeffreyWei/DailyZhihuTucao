package com.babibeng.shimao.sun.wecharthandle.msghandle;

import com.github.sd4324530.fastweixin.handle.MessageHandle;
import com.github.sd4324530.fastweixin.message.BaseMsg;
import com.github.sd4324530.fastweixin.message.req.LinkReqMsg;
import org.springframework.stereotype.Component;

/**
 * Created by wei on 15/6/9.
 */
@Component
public class LinkHandle  implements MessageHandle<LinkReqMsg> {
    @Override
    public BaseMsg handle(LinkReqMsg message) {
        return null;
    }

    @Override
    public boolean beforeHandle(LinkReqMsg message) {
        return false;
    }
}
