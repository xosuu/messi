package dev.epro.v2ray.model.transport.tls;

import java.util.List;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class CertificateObject {
    List<String> certificate;
    String certificateFile;
    List<String> key;
    String keyFile;
    String usage;

    static {
        NativeUtil.classesInit0(116);
    }

    public native List<String> getCertificate();

    public native String getCertificateFile();

    public native List<String> getKey();

    public native String getKeyFile();

    public native String getUsage();

    public native void setCertificate(List<String> list);

    public native void setCertificateFile(String str);

    public native void setKey(List<String> list);

    public native void setKeyFile(String str);

    public native void setUsage(String str);

    public native String toString();
}
