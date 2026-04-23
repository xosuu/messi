package dev.epro.v2ray.model.transport.tls;

import java.util.List;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class TLSObject {
    Boolean allowInsecure;
    List<String> alpn;
    List<CertificateObject> certificates;
    Boolean disableSystemRoot;
    List<String> pinnedPeerCertificateChainSha256;
    String serverName;
    Boolean verifyClientCertificate;

    static {
        NativeUtil.classesInit0(220);
    }

    public native Boolean getAllowInsecure();

    public native List<String> getAlpn();

    public native List<CertificateObject> getCertificates();

    public native Boolean getDisableSystemRoot();

    public native List<String> getPinnedPeerCertificateChainSha256();

    public native String getServerName();

    public native Boolean getVerifyClientCertificate();

    public native void setAllowInsecure(Boolean bool);

    public native void setAlpn(List<String> list);

    public native void setCertificates(List<CertificateObject> list);

    public native void setDisableSystemRoot(Boolean bool);

    public native void setPinnedPeerCertificateChainSha256(List<String> list);

    public native void setServerName(String str);

    public native void setVerifyClientCertificate(Boolean bool);

    public native String toString();
}
