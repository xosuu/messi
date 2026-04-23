package q2;

import com.google.android.gms.ads.RequestConfiguration;
import l.a0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static d f16411f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f16415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f16416e;

    public d(int i10, int i11, int i12) {
        String str;
        if (i10 != Integer.MIN_VALUE) {
            str = i10 + "/";
        } else {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        this.f16415d = str;
        this.f16412a = i11;
        this.f16413b = i12;
        this.f16414c = Integer.MIN_VALUE;
        this.f16416e = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    public static d a() {
        if (f16411f == null) {
            synchronized (d.class) {
                try {
                    if (f16411f == null) {
                        d dVar = new d();
                        dVar.f16415d = e.f16421h;
                        dVar.f16412a = 0;
                        dVar.f16413b = 0;
                        dVar.f16414c = 0;
                        f16411f = dVar;
                    }
                } finally {
                }
            }
        }
        return f16411f;
    }

    public final synchronized void b(long j10, long j11) {
        if (j11 != 0 && j10 >= 20000) {
            double d10 = ((j10 * 1.0d) / j11) * 8.0d;
            if (d10 >= 10.0d) {
                try {
                    int i10 = this.f16412a;
                    int i11 = this.f16413b;
                    double d11 = ((double) (i10 * i11)) + d10;
                    int i12 = i11 + 1;
                    int i13 = (int) (d11 / ((double) i12));
                    this.f16412a = i13;
                    this.f16413b = i12;
                    if (i12 == 5 || (((e) this.f16415d) == e.f16421h && i12 == 2)) {
                        e eVar = (e) this.f16415d;
                        this.f16414c = i13;
                        if (i13 <= 0) {
                            this.f16415d = e.f16421h;
                        } else if (i13 < 150) {
                            this.f16415d = e.f16417a;
                        } else if (i13 < 550) {
                            this.f16415d = e.f16418b;
                        } else if (i13 < 2000) {
                            this.f16415d = e.f16419d;
                        } else if (i13 > 2000) {
                            this.f16415d = e.f16420f;
                        }
                        if (i12 == 5) {
                            this.f16412a = 0;
                            this.f16413b = 0;
                        }
                        if (((e) this.f16415d) != eVar) {
                            a0.p(this.f16416e);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c() {
        int i10 = this.f16414c;
        int i11 = i10 == Integer.MIN_VALUE ? this.f16412a : i10 + this.f16413b;
        this.f16414c = i11;
        this.f16416e = ((String) this.f16415d) + i11;
    }

    public final void d() {
        if (this.f16414c == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}
