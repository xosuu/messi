package f7;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f13242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f13243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f13244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f13245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f13246j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f13247k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f13248l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f13249m;

    static {
        c cVar = new c();
        cVar.f13231a = true;
        new d(cVar);
        c cVar2 = new c();
        cVar2.f13233c = true;
        long seconds = TimeUnit.SECONDS.toSeconds(Integer.MAX_VALUE);
        cVar2.f13232b = seconds <= 2147483647L ? (int) seconds : Integer.MAX_VALUE;
        new d(cVar2);
    }

    public d(boolean z9, boolean z10, int i10, int i11, boolean z11, boolean z12, boolean z13, int i12, int i13, boolean z14, boolean z15, boolean z16, String str) {
        this.f13237a = z9;
        this.f13238b = z10;
        this.f13239c = i10;
        this.f13240d = i11;
        this.f13241e = z11;
        this.f13242f = z12;
        this.f13243g = z13;
        this.f13244h = i12;
        this.f13245i = i13;
        this.f13246j = z14;
        this.f13247k = z15;
        this.f13248l = z16;
        this.f13249m = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static f7.d a(f7.p r22) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.d.a(f7.p):f7.d");
    }

    public final String toString() {
        String string = this.f13249m;
        if (string == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f13237a) {
                sb.append("no-cache, ");
            }
            if (this.f13238b) {
                sb.append("no-store, ");
            }
            int i10 = this.f13239c;
            if (i10 != -1) {
                sb.append("max-age=");
                sb.append(i10);
                sb.append(", ");
            }
            int i11 = this.f13240d;
            if (i11 != -1) {
                sb.append("s-maxage=");
                sb.append(i11);
                sb.append(", ");
            }
            if (this.f13241e) {
                sb.append("private, ");
            }
            if (this.f13242f) {
                sb.append("public, ");
            }
            if (this.f13243g) {
                sb.append("must-revalidate, ");
            }
            int i12 = this.f13244h;
            if (i12 != -1) {
                sb.append("max-stale=");
                sb.append(i12);
                sb.append(", ");
            }
            int i13 = this.f13245i;
            if (i13 != -1) {
                sb.append("min-fresh=");
                sb.append(i13);
                sb.append(", ");
            }
            if (this.f13246j) {
                sb.append("only-if-cached, ");
            }
            if (this.f13247k) {
                sb.append("no-transform, ");
            }
            if (this.f13248l) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                string = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            } else {
                sb.delete(sb.length() - 2, sb.length());
                string = sb.toString();
            }
            this.f13249m = string;
        }
        return string;
    }

    public d(c cVar) {
        this.f13237a = cVar.f13231a;
        this.f13238b = false;
        this.f13239c = -1;
        this.f13240d = -1;
        this.f13241e = false;
        this.f13242f = false;
        this.f13243g = false;
        this.f13244h = cVar.f13232b;
        this.f13245i = -1;
        this.f13246j = cVar.f13233c;
        this.f13247k = false;
        this.f13248l = false;
    }
}
