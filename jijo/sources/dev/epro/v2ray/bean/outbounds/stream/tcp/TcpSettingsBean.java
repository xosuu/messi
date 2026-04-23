package dev.epro.v2ray.bean.outbounds.stream.tcp;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class TcpSettingsBean {
    HeaderBean header = new HeaderBean();

    static {
        NativeUtil.classesInit0(81);
    }

    public native HeaderBean getHeader();

    public native void setHeader(HeaderBean headerBean);

    public native String toString();
}
