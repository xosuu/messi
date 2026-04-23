package g4;

import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.eh1;
import com.google.android.gms.internal.ads.en1;
import com.google.android.gms.internal.ads.or0;
import com.google.android.gms.internal.ads.q60;
import com.google.android.gms.internal.ads.tl0;
import com.google.android.gms.internal.ads.ts0;
import com.google.android.gms.internal.ads.u30;
import com.google.android.gms.internal.ads.uo0;
import com.google.android.gms.internal.ads.us0;
import com.google.android.gms.internal.ads.ws0;
import com.google.android.gms.internal.ads.xs0;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static c f13695m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f13696a = new d5.i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f13697b = new d5.i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f13698c = new d5.i();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f13699d = new d5.i();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f13700e = new d5.a(0.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f13701f = new d5.a(0.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f13702g = new d5.a(0.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f13703h = new d5.a(0.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f13704i = en1.l();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f13705j = en1.l();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f13706k = en1.l();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f13707l = en1.l();

    public static void b(b4.f fVar) {
        if (fVar instanceof d5.i) {
            ((d5.i) fVar).getClass();
        } else if (fVar instanceof d5.d) {
            ((d5.d) fVar).getClass();
        }
    }

    public static c c(androidx.fragment.app.w wVar) {
        c cVar;
        synchronized (c.class) {
            try {
                if (f13695m == null) {
                    k.q qVar = new k.q();
                    Application application = (Application) wVar.getApplicationContext();
                    application.getClass();
                    qVar.f14587b = application;
                    f13695m = qVar.A();
                }
                cVar = f13695m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public final d5.j a() {
        d5.j jVar = new d5.j();
        jVar.f12411a = (b4.f) this.f13696a;
        jVar.f12412b = (b4.f) this.f13697b;
        jVar.f12413c = (b4.f) this.f13698c;
        jVar.f12414d = (b4.f) this.f13699d;
        jVar.f12415e = (d5.c) this.f13700e;
        jVar.f12416f = (d5.c) this.f13701f;
        jVar.f12417g = (d5.c) this.f13702g;
        jVar.f12418h = (d5.c) this.f13703h;
        jVar.f12419i = (d5.e) this.f13704i;
        jVar.f12420j = (d5.e) this.f13705j;
        jVar.f12421k = (d5.e) this.f13706k;
        jVar.f12422l = (d5.e) this.f13707l;
        return jVar;
    }

    public final ts0 d(Bundle bundle) {
        ((q60) this.f13707l).zza();
        return new tl0((xs0) this.f13696a, ws0.f10328b, null, us0.f9603d, Collections.emptyList(), ((uo0) this.f13704i).a(new Bundle(), bundle)).d();
    }

    public final ts0 e() {
        Bundle bundle = new Bundle();
        int i10 = 0;
        if (((Boolean) zzba.zzc().a(eg.S1)).booleanValue()) {
            Bundle bundle2 = ((or0) this.f13706k).f7659s;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        ts0 ts0VarD = d(bundle);
        return ((xs0) this.f13696a).a(ws0.f10329d, ts0VarD, (n5.a) ((eh1) this.f13702g).zzb()).b(new u30(this, ts0VarD, bundle, i10)).d();
    }
}
