package dev.epro.v2ray.bean.outbounds.stream;

import dev.epro.v2ray.bean.outbounds.stream.kcp.KcpSettingsBean;
import dev.epro.v2ray.bean.outbounds.stream.quic.QuicSettingBean;
import dev.epro.v2ray.bean.outbounds.stream.tcp.TcpSettingsBean;
import dev.epro.v2ray.bean.outbounds.stream.ws.WsSettingsBean;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class StreamSettingsBean {
    HttpSettingsBean httpSettings;
    KcpSettingsBean kcpSettings;
    String network;
    QuicSettingBean quicSettings;
    String security;
    TcpSettingsBean tcpSettings;
    TlsSettingsBean tlsSettings;
    WsSettingsBean wsSettings;

    static {
        NativeUtil.classesInit0(138);
    }

    public StreamSettingsBean(String str, String str2, TcpSettingsBean tcpSettingsBean, KcpSettingsBean kcpSettingsBean, WsSettingsBean wsSettingsBean, HttpSettingsBean httpSettingsBean, TlsSettingsBean tlsSettingsBean, QuicSettingBean quicSettingBean) {
        this.network = str;
        this.security = str2;
        this.tcpSettings = tcpSettingsBean;
        this.kcpSettings = kcpSettingsBean;
        this.wsSettings = wsSettingsBean;
        this.httpSettings = httpSettingsBean;
        this.tlsSettings = tlsSettingsBean;
        this.quicSettings = quicSettingBean;
    }

    public native HttpSettingsBean getHttpSettings();

    public native KcpSettingsBean getKcpSettings();

    public native String getNetwork();

    public native QuicSettingBean getQuicSettings();

    public native String getSecurity();

    public native TcpSettingsBean getTcpSettings();

    public native TlsSettingsBean getTlsSettings();

    public native WsSettingsBean getWsSettings();

    public native void setHttpSettings(HttpSettingsBean httpSettingsBean);

    public native void setKcpSettings(KcpSettingsBean kcpSettingsBean);

    public native void setNetwork(String str);

    public native void setQuicSettings(QuicSettingBean quicSettingBean);

    public native void setSecurity(String str);

    public native void setTcpSettings(TcpSettingsBean tcpSettingsBean);

    public native void setTlsSettings(TlsSettingsBean tlsSettingsBean);

    public native void setWsSettings(WsSettingsBean wsSettingsBean);

    public native String toString();
}
