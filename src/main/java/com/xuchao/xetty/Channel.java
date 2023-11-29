package com.xuchao.xetty;

/**
 * 通道
 *
 * @author xuchao
 */
public interface Channel {

    Channel process(Object in, Object out);

    ChannelPipeline pipeline();

    interface ChannelProcessor {
        void doProcess(Object in, Object out);
    }

}
