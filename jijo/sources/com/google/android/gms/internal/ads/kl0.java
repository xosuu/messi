package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class kl0 implements AppEventListener, u50, e50, n40, w40, zza, k40, o50, u40, q70 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ed0 f6319u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f6311a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f6312b = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f6313d = new AtomicReference();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f6314f = new AtomicReference();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f6315h = new AtomicReference();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f6316q = new AtomicBoolean(true);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f6317s = new AtomicBoolean(false);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicBoolean f6318t = new AtomicBoolean(false);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayBlockingQueue f6320v = new ArrayBlockingQueue(((Integer) zzba.zzc().a(eg.X7)).intValue());

    public kl0(ed0 ed0Var) {
        this.f6319u = ed0Var;
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void J(zzbvb zzbvbVar) {
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void L() {
        if (((Boolean) zzba.zzc().a(eg.R9)).booleanValue()) {
            tc1.l(this.f6311a, new il0(7));
        }
        tc1.l(this.f6315h, new k70(29));
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void V() {
        tc1.l(this.f6311a, new il0(3));
    }

    @Override // com.google.android.gms.internal.ads.u40
    public final void a(zze zzeVar) {
        tc1.l(this.f6315h, new a60(1, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void b(kr0 kr0Var) {
        this.f6316q.set(true);
        this.f6318t.set(false);
    }

    @Override // com.google.android.gms.internal.ads.o50
    public final void h(zzs zzsVar) {
        tc1.l(this.f6313d, new y50(zzsVar, 1));
    }

    public final synchronized zzbh j() {
        return (zzbh) this.f6311a.get();
    }

    public final void k(zzcb zzcbVar) {
        this.f6312b.set(zzcbVar);
        this.f6317s.set(true);
        z();
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void n(as asVar, String str, String str2) {
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (((Boolean) zzba.zzc().a(eg.R9)).booleanValue()) {
            return;
        }
        tc1.l(this.f6311a, new il0(7));
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final synchronized void onAppEvent(String str, String str2) {
        if (!this.f6316q.get()) {
            Object obj = this.f6312b.get();
            if (obj != null) {
                try {
                    ((zzcb) obj).zzc(str, str2);
                } catch (RemoteException e10) {
                    zzm.zzl("#007 Could not call remote method.", e10);
                } catch (NullPointerException e11) {
                    zzm.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e11);
                }
            }
            return;
        }
        if (!this.f6320v.offer(new Pair(str, str2))) {
            zzm.zze("The queue for app events is full, dropping the new event.");
            ed0 ed0Var = this.f6319u;
            if (ed0Var != null) {
                m20 m20VarA = ed0Var.a();
                m20VarA.f("action", "dae_action");
                m20VarA.f("dae_name", str);
                m20VarA.f("dae_data", str2);
                m20VarA.h();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.n40
    public final void t(zze zzeVar) {
        AtomicReference atomicReference = this.f6311a;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((zzbh) obj).zzf(zzeVar);
            } catch (RemoteException e10) {
                zzm.zzl("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                zzm.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((zzbh) obj2).zze(zzeVar.zza);
            } catch (RemoteException e12) {
                zzm.zzl("#007 Could not call remote method.", e12);
            } catch (NullPointerException e13) {
                zzm.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e13);
            }
        }
        Object obj3 = this.f6314f.get();
        if (obj3 != null) {
            try {
                ((com.google.android.gms.ads.internal.client.zzbk) obj3).zzb(zzeVar);
            } catch (RemoteException e14) {
                zzm.zzl("#007 Could not call remote method.", e14);
            } catch (NullPointerException e15) {
                zzm.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e15);
            }
        }
        this.f6316q.set(false);
        this.f6320v.clear();
    }

    public final void z() {
        if (this.f6317s.get() && this.f6318t.get()) {
            ArrayBlockingQueue arrayBlockingQueue = this.f6320v;
            Iterator it = arrayBlockingQueue.iterator();
            while (it.hasNext()) {
                tc1.l(this.f6312b, new i10(25, (Pair) it.next()));
            }
            arrayBlockingQueue.clear();
            this.f6316q.set(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zza() {
        tc1.l(this.f6311a, new k70(27));
        tc1.l(this.f6315h, new k70(28));
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zzb() {
        tc1.l(this.f6311a, new il0(2));
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zzc() {
        tc1.l(this.f6311a, new il0(4));
        il0 il0Var = new il0(5);
        AtomicReference atomicReference = this.f6315h;
        tc1.l(atomicReference, il0Var);
        tc1.l(atomicReference, new il0(6));
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.w40
    public final void zzr() {
        tc1.l(this.f6311a, new k70(26));
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final synchronized void zzs() {
        tc1.l(this.f6311a, new il0(0));
        tc1.l(this.f6314f, new il0(1));
        this.f6318t.set(true);
        z();
    }
}
