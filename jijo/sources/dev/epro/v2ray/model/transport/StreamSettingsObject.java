package dev.epro.v2ray.model.transport;

import dev.epro.v2ray.model.transport.ds.DomainSocketObject;
import dev.epro.v2ray.model.transport.grpc.GrpcObject;
import dev.epro.v2ray.model.transport.http.HttpObject;
import dev.epro.v2ray.model.transport.kcp.KcpObject;
import dev.epro.v2ray.model.transport.quic.QuicObject;
import dev.epro.v2ray.model.transport.sock.SockoptObject;
import dev.epro.v2ray.model.transport.tcp.TcpObject;
import dev.epro.v2ray.model.transport.tls.TLSObject;
import dev.epro.v2ray.model.transport.ws.WebSocketObject;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class StreamSettingsObject {
    DomainSocketObject dsSettings;
    GrpcObject grpcSettings;
    HttpObject httpSettings;
    KcpObject kcpSettings;
    String network;
    QuicObject quicSettings;
    String security;
    SockoptObject sockopt;
    TcpObject tcpSettings;
    TLSObject tlsSettings;
    WebSocketObject wsSettings;
    TLSObject xtlsSettings;

    static {
        NativeUtil.classesInit0(97);
    }

    public native DomainSocketObject getDsSettings();

    public native GrpcObject getGrpcSettings();

    public native HttpObject getHttpSettings();

    public native KcpObject getKcpSettings();

    public native String getNetwork();

    public native QuicObject getQuicSettings();

    public native String getSecurity();

    public native SockoptObject getSockopt();

    public native TcpObject getTcpSettings();

    public native TLSObject getTlsSettings();

    public native WebSocketObject getWsSettings();

    public native TLSObject getXtlsSettings();

    public native void setDsSettings(DomainSocketObject domainSocketObject);

    public native void setGrpcSettings(GrpcObject grpcObject);

    public native void setHttpSettings(HttpObject httpObject);

    public native void setKcpSettings(KcpObject kcpObject);

    public native void setNetwork(String str);

    public native void setQuicSettings(QuicObject quicObject);

    public native void setSecurity(String str);

    public native void setSockopt(SockoptObject sockoptObject);

    public native void setTcpSettings(TcpObject tcpObject);

    public native void setTlsSettings(TLSObject tLSObject);

    public native void setWsSettings(WebSocketObject webSocketObject);

    public native void setXtlsSettings(TLSObject tLSObject);

    public native String toString();
}
