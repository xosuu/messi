package v3;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.ads.an1;
import com.google.android.gms.internal.ads.bt0;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.fi0;
import com.google.android.gms.internal.ads.ft0;
import com.google.android.gms.internal.ads.k21;
import com.google.android.gms.internal.ads.qu;
import com.google.android.gms.internal.ads.vm;
import com.google.android.gms.internal.ads.ym1;
import com.google.android.gms.internal.ads.zm1;
import com.google.android.gms.internal.ads.zzeex;
import java.lang.reflect.Modifier;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements k21, zm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17735b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f17736d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f17737f;

    public d0(fi0 fi0Var, qu quVar) {
        this.f17734a = 2;
        this.f17736d = fi0Var;
        this.f17737f = quVar;
        this.f17735b = false;
    }

    public static String c(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(cls.getName());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.k21
    public final void E(Throwable th) {
        bt0 bt0Var = (bt0) this.f17737f;
        if (bt0Var.zzk()) {
            ft0 ft0Var = (ft0) this.f17736d;
            bt0Var.e(th);
            bt0Var.x(false);
            ft0Var.a(bt0Var);
            if (this.f17735b) {
                ((ft0) this.f17736d).h();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.k21, com.google.android.gms.internal.ads.pl0
    /* JADX INFO: renamed from: a */
    public final void mo4a(Object obj) {
        bt0 bt0Var = (bt0) this.f17737f;
        bt0Var.x(true);
        ((ft0) this.f17736d).a(bt0Var);
        if (this.f17735b) {
            ((ft0) this.f17736d).h();
        }
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final /* bridge */ /* synthetic */ an1 b(ym1 ym1Var) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.gson.internal.l d(r5.a r9) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.d0.d(r5.a):com.google.gson.internal.l");
    }

    public final void e(k4.j jVar) {
        synchronized (this.f17736d) {
            try {
                if (((Queue) this.f17737f) == null) {
                    this.f17737f = new ArrayDeque();
                }
                ((Queue) this.f17737f).add(jVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void f(int i10) {
        if (this.f17735b) {
            return;
        }
        this.f17735b = true;
        k(new zze(i10, "Error from: " + ((fi0) this.f17736d).f4534a + ", code: " + i10, AdError.UNDEFINED_DOMAIN, null, null));
    }

    public final synchronized void g(zze zzeVar) {
        if (this.f17735b) {
            return;
        }
        this.f17735b = true;
        k(zzeVar);
    }

    public final void h(k4.l lVar) {
        k4.j jVar;
        synchronized (this.f17736d) {
            if (((Queue) this.f17737f) != null && !this.f17735b) {
                this.f17735b = true;
                while (true) {
                    synchronized (this.f17736d) {
                        try {
                            jVar = (k4.j) ((Queue) this.f17737f).poll();
                            if (jVar == null) {
                                this.f17735b = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    jVar.a(lVar);
                }
            }
        }
    }

    public final synchronized void i(int i10, String str) {
        try {
            if (this.f17735b) {
                return;
            }
            this.f17735b = true;
            if (str == null) {
                str = "Error from: " + ((fi0) this.f17736d).f4534a + ", code: " + i10;
            }
            k(new zze(i10, str, AdError.UNDEFINED_DOMAIN, null, null));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void j() {
        ((qu) this.f17737f).b(null);
    }

    public final synchronized void k(zze zzeVar) {
        int i10 = 1;
        if (true == ((Boolean) zzba.zzc().a(eg.Q4)).booleanValue()) {
            i10 = 3;
        }
        ((qu) this.f17737f).c(new zzeex(i10, zzeVar));
    }

    public final String toString() {
        switch (this.f17734a) {
            case 6:
                return ((Map) this.f17736d).toString();
            default:
                return super.toString();
        }
    }

    public d0(ft0 ft0Var, bt0 bt0Var, boolean z9) {
        this.f17734a = 3;
        this.f17736d = ft0Var;
        this.f17737f = bt0Var;
        this.f17735b = z9;
    }

    public d0(String str, boolean z9) {
        this.f17734a = 0;
        this.f17737f = "com.google.android.gms";
        this.f17736d = str;
        this.f17735b = z9;
    }

    public d0(int i10) {
        this.f17734a = i10;
        if (i10 != 5) {
            this.f17737f = zzb.zzb;
        } else {
            this.f17736d = new Object();
        }
    }

    public d0(Context context) {
        this.f17734a = 1;
        ExecutorService executorService = zzb.zzb;
        this.f17737f = executorService;
        executorService.execute(new vm(this, 7, context));
    }

    public d0(Map map, boolean z9, List list) {
        this.f17734a = 6;
        this.f17736d = map;
        this.f17735b = z9;
        this.f17737f = list;
    }
}
