package com.babibeng.shimao.sun.wecharthandle.msghandle;

import com.github.sd4324530.fastweixin.handle.MessageHandle;
import com.github.sd4324530.fastweixin.message.BaseMsg;
import com.github.sd4324530.fastweixin.message.req.ImageReqMsg;
import org.springframework.stereotype.Component;

/**
 * Created by wei on 15/6/9.
 */
@Component
public class ImageHandle  implements MessageHandle<ImageReqMsg> {
   @Override
    public BaseMsg handle(ImageReqMsg message) {
        return null;
    }

    @Override
    public boolean beforeHandle(ImageReqMsg message) {
        return false;
    }
}
