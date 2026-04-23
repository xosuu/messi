package libv2ray;

/* JADX INFO: loaded from: classes.dex */
public interface V2RayVPNServiceSupportsSet {
    long onEmitStatus(long j10, String str);

    long prepare();

    long protect(long j10);

    long setup(String str);

    long shutdown();
}
