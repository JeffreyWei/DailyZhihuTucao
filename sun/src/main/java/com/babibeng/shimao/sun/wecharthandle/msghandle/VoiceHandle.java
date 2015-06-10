package com.babibeng.shimao.sun.wecharthandle.msghandle;

import com.github.sd4324530.fastweixin.handle.MessageHandle;
import com.github.sd4324530.fastweixin.message.BaseMsg;
import com.github.sd4324530.fastweixin.message.TextMsg;
import com.github.sd4324530.fastweixin.message.req.VoiceReqMsg;
import org.springframework.stereotype.Component;

/**
 * Created by wei on 15/6/9.
 */
@Component
public class VoiceHandle  implements MessageHandle<VoiceReqMsg> {
   private  boolean isHandle=true;

    @Override
    public BaseMsg handle(VoiceReqMsg message) {
        isHandle=false;
        return new TextMsg("收到用户的语音信息!");
    }

    @Override
    public boolean beforeHandle(VoiceReqMsg message) {
        return isHandle;
    }
}
