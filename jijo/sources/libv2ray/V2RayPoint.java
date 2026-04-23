package libv2ray;

import go.Seq;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class V2RayPoint implements Seq.Proxy {
    private final int refnum;

    static {
        Libv2ray.touch();
    }

    public V2RayPoint(V2RayVPNServiceSupportsSet v2RayVPNServiceSupportsSet) {
        int i__NewV2RayPoint = __NewV2RayPoint(v2RayVPNServiceSupportsSet);
        this.refnum = i__NewV2RayPoint;
        Seq.trackGoRef(i__NewV2RayPoint, this);
    }

    private static native int __NewV2RayPoint(V2RayVPNServiceSupportsSet v2RayVPNServiceSupportsSet);

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof V2RayPoint)) {
            return false;
        }
        V2RayPoint v2RayPoint = (V2RayPoint) obj;
        V2RayVPNServiceSupportsSet supportSet = getSupportSet();
        V2RayVPNServiceSupportsSet supportSet2 = v2RayPoint.getSupportSet();
        if (supportSet == null) {
            if (supportSet2 != null) {
                return false;
            }
        } else if (!supportSet.equals(supportSet2)) {
            return false;
        }
        String packageName = getPackageName();
        String packageName2 = v2RayPoint.getPackageName();
        if (packageName == null) {
            if (packageName2 != null) {
                return false;
            }
        } else if (!packageName.equals(packageName2)) {
            return false;
        }
        String packageCodePath = getPackageCodePath();
        String packageCodePath2 = v2RayPoint.getPackageCodePath();
        if (packageCodePath == null) {
            if (packageCodePath2 != null) {
                return false;
            }
        } else if (!packageCodePath.equals(packageCodePath2)) {
            return false;
        }
        String domainName = getDomainName();
        String domainName2 = v2RayPoint.getDomainName();
        if (domainName == null) {
            if (domainName2 != null) {
                return false;
            }
        } else if (!domainName.equals(domainName2)) {
            return false;
        }
        String configureFileContent = getConfigureFileContent();
        String configureFileContent2 = v2RayPoint.getConfigureFileContent();
        if (configureFileContent == null) {
            if (configureFileContent2 != null) {
                return false;
            }
        } else if (!configureFileContent.equals(configureFileContent2)) {
            return false;
        }
        return getEnableLocalDNS() == v2RayPoint.getEnableLocalDNS() && getForwardIpv6() == v2RayPoint.getForwardIpv6() && getProxyOnly() == v2RayPoint.getProxyOnly();
    }

    public final native String getConfigureFileContent();

    public final native String getDomainName();

    public final native boolean getEnableLocalDNS();

    public final native boolean getForwardIpv6();

    public native boolean getIsRunning();

    public native boolean getIsTRunning();

    public final native String getPackageCodePath();

    public final native String getPackageName();

    public final native boolean getProxyOnly();

    public final native V2RayVPNServiceSupportsSet getSupportSet();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getSupportSet(), getPackageName(), getPackageCodePath(), getDomainName(), getConfigureFileContent(), Boolean.valueOf(getEnableLocalDNS()), Boolean.valueOf(getForwardIpv6()), Boolean.valueOf(getProxyOnly())});
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public native long queryStats(String str, String str2);

    public native void runLoop();

    public final native void setConfigureFileContent(String str);

    public final native void setDomainName(String str);

    public final native void setEnableLocalDNS(boolean z9);

    public final native void setForwardIpv6(boolean z9);

    public final native void setPackageCodePath(String str);

    public final native void setPackageName(String str);

    public final native void setProxyOnly(boolean z9);

    public final native void setSupportSet(V2RayVPNServiceSupportsSet v2RayVPNServiceSupportsSet);

    public native void stopLoop();

    public String toString() {
        return "V2RayPoint{SupportSet:" + getSupportSet() + ",PackageName:" + getPackageName() + ",PackageCodePath:" + getPackageCodePath() + ",DomainName:" + getDomainName() + ",ConfigureFileContent:" + getConfigureFileContent() + ",EnableLocalDNS:" + getEnableLocalDNS() + ",ForwardIpv6:" + getForwardIpv6() + ",ProxyOnly:" + getProxyOnly() + ",}";
    }

    public V2RayPoint(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }
}
