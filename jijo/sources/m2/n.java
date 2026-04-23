package m2;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.util.Log;
import androidx.fragment.app.w;
import com.google.android.gms.internal.consent_sdk.zzg;
import g4.b1;
import g4.y;
import g4.z;
import g4.z0;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15720a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15721b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15722d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15723f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f15724h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f15725q;

    public /* synthetic */ n(z0 z0Var, w wVar, l5.e eVar, l5.c cVar, l5.b bVar) {
        this.f15721b = z0Var;
        this.f15722d = wVar;
        this.f15723f = eVar;
        this.f15724h = cVar;
        this.f15725q = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15720a) {
            case 0:
                try {
                    if (!(((n2.i) this.f15721b).f15915a instanceof n2.a)) {
                        String string = ((UUID) this.f15722d).toString();
                        c2.w wVarE = ((o) this.f15725q).f15728c.e(string);
                        if (wVarE == null || wVarE.a()) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((d2.b) ((o) this.f15725q).f15727b).g(string, (c2.g) this.f15723f);
                        ((Context) this.f15724h).startService(k2.c.b((Context) this.f15724h, string, (c2.g) this.f15723f));
                    }
                    ((n2.i) this.f15721b).j(null);
                    return;
                } catch (Throwable th) {
                    ((n2.i) this.f15721b).k(th);
                    return;
                }
            default:
                z0 z0Var = (z0) this.f15721b;
                Activity activity = (Activity) this.f15722d;
                l5.e eVar = (l5.e) this.f15723f;
                l5.c cVar = (l5.c) this.f15724h;
                final l5.b bVar = (l5.b) this.f15725q;
                Handler handler = z0Var.f13838b;
                g4.g gVar = z0Var.f13840d;
                final int i10 = 0;
                try {
                    c8.a aVar = eVar.f15220c;
                    if (aVar == null || !aVar.f1584b) {
                        z.K(z0Var.f13837a);
                    }
                    y yVarA = z0Var.a(z0Var.f13842f.a(activity, eVar));
                    b1 b1Var = z0Var.f13843g;
                    a2.b bVar2 = new a2.b();
                    bVar2.f6a = 0;
                    bVar2.f9d = l5.d.f15214a;
                    bVar2.f7b = b1Var;
                    bVar2.f8c = yVarA;
                    f0.d dVarA = bVar2.a();
                    gVar.f13721b.edit().putInt("consent_status", dVarA.f13014b).apply();
                    gVar.f13721b.edit().putString("privacy_options_requirement_status", ((l5.d) dVarA.f13015c).name()).apply();
                    g4.l lVar = z0Var.f13841e;
                    lVar.f13749b.set((g4.m) dVarA.f13016d);
                    z0Var.f13844h.f13800a.execute(new l0.a(z0Var, cVar, dVarA, 27, 0));
                    return;
                } catch (zzg e10) {
                    handler.post(new Runnable() { // from class: g4.y0
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i11 = i10;
                            l5.b bVar3 = bVar;
                            zzg zzgVar = e10;
                            switch (i11) {
                                case 0:
                                    zzgVar.a();
                                    bVar3.a();
                                    break;
                                default:
                                    zzgVar.a();
                                    bVar3.a();
                                    break;
                            }
                        }
                    });
                    return;
                } catch (RuntimeException e11) {
                    final int i11 = 1;
                    final zzg zzgVar = new zzg(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e11))));
                    handler.post(new Runnable() { // from class: g4.y0
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i112 = i11;
                            l5.b bVar3 = bVar;
                            zzg zzgVar2 = zzgVar;
                            switch (i112) {
                                case 0:
                                    zzgVar2.a();
                                    bVar3.a();
                                    break;
                                default:
                                    zzgVar2.a();
                                    bVar3.a();
                                    break;
                            }
                        }
                    });
                    return;
                }
        }
    }

    public n(o oVar, n2.i iVar, UUID uuid, c2.g gVar, Context context) {
        this.f15725q = oVar;
        this.f15721b = iVar;
        this.f15722d = uuid;
        this.f15723f = gVar;
        this.f15724h = context;
    }
}
