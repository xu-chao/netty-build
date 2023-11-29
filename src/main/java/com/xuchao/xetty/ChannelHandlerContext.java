package com.xuchao.xetty;

/**
 * ChannelHandlerContext
 *
 * @author xuchao
 */
public interface ChannelHandlerContext {

    Channel channel();

    ChannelHandler handler();

    ChannelPipeline pipeline();

    ChannelHandlerContext process(Object in, Object out);

    ChannelHandlerContext fireExceptionCaught(Throwable cause, Object in, Object out);

    ChannelHandlerContext fireChannelProcess(Object in, Object out);

}
