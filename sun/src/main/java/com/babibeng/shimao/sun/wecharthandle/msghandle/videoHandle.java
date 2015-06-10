package com.babibeng.shimao.sun.wecharthandle.msghandle;

import com.github.sd4324530.fastweixin.handle.MessageHandle;
import com.github.sd4324530.fastweixin.message.BaseMsg;
import com.github.sd4324530.fastweixin.message.req.VideoReqMsg;
import org.springframework.stereotype.Component;

/**
 * Created by wei on 15/6/9.
 */
@Component
public class VideoHandle implements MessageHandle<VideoReqMsg> {
    @Override
    public BaseMsg handle(VideoReqMsg message) {
        return null;
    }

    @Override
    public boolean beforeHandle(VideoReqMsg message) {
        return false;
    }
}
