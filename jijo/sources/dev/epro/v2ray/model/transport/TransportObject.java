package dev.epro.v2ray.model.transport;

import dev.epro.v2ray.model.transport.ds.DomainSocketObject;
import dev.epro.v2ray.model.transport.grpc.GrpcObject;
import dev.epro.v2ray.model.transport.http.HttpObject;
import dev.epro.v2ray.model.transport.kcp.KcpObject;
import dev.epro.v2ray.model.transport.quic.QuicObject;
import dev.epro.v2ray.model.transport.tcp.TcpObject;
import dev.epro.v2ray.model.transport.ws.WebSocketObject;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class TransportObject {
    DomainSocketObject dsSettings;
    GrpcObject grpcSettings;
    HttpObject httpSettings;
    KcpObject kcpSettings;
    QuicObject quicSettings;
    TcpObject tcpSettings;
    WebSocketObject wsSettings;

    static {
        NativeUtil.classesInit0(17);
    }

    public native DomainSocketObject getDsSettings();

    public native GrpcObject getGrpcSettings();

    public native HttpObject getHttpSettings();

    public native KcpObject getKcpSettings();

    public native QuicObject getQuicSettings();

    public native TcpObject getTcpSettings();

    public native WebSocketObject getWsSettings();

    public native void setDsSettings(DomainSocketObject domainSocketObject);

    public native void setGrpcSettings(GrpcObject grpcObject);

    public native void setHttpSettings(HttpObject httpObject);

    public native void setKcpSettings(KcpObject kcpObject);

    public native void setQuicSettings(QuicObject quicObject);

    public native void setTcpSettings(TcpObject tcpObject);

    public native void setWsSettings(WebSocketObject webSocketObject);

    public native String toString();
}
