package com.babibeng.shimao.sun.wecharthandle.msghandle;

import com.github.sd4324530.fastweixin.handle.MessageHandle;
import com.github.sd4324530.fastweixin.message.BaseMsg;
import com.github.sd4324530.fastweixin.message.req.LocationReqMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by wei on 15/6/9.
 */
@Component
public class LocationHandle  implements MessageHandle<LocationReqMsg> {
    private Logger logger = LoggerFactory.getLogger(LocationHandle.class);
    private  boolean isHandle=true;
    @Override
    public BaseMsg handle(LocationReqMsg message) {
        logger.info(message.toString());
        isHandle=false;
        return null;
    }

    @Override
    public boolean beforeHandle(LocationReqMsg message) {
        return isHandle;
    }
}
