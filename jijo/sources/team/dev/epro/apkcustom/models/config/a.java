package team.dev.epro.apkcustom.models.config;

import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @o5.b("cfg")
    b f17218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @o5.b("verCfg")
    Integer f17219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @o5.b("url")
    String f17220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @o5.b("app")
    String f17221d;

    public final String a() {
        return this.f17221d;
    }

    public final b b() {
        return this.f17218a;
    }

    public final String c() {
        return this.f17220c;
    }

    public final Integer d() {
        return this.f17219b;
    }

    public final void e(String str) {
        this.f17221d = str;
    }

    public final void f(b bVar) {
        this.f17218a = bVar;
    }

    public final void g(String str) {
        this.f17220c = str;
    }

    public final void h(Integer num) {
        this.f17219b = num;
    }

    public final String toString() {
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }
}
