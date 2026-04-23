package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbd;
import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: loaded from: classes.dex */
public final class wm extends f.h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzbd f10228d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10227c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10229e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10230f = 0;

    public wm(zzbd zzbdVar) {
        this.f10228d = zzbdVar;
    }

    public final tm o() {
        tm tmVar = new tm(this);
        zze.zza("createNewReference: Trying to acquire lock");
        synchronized (this.f10227c) {
            zze.zza("createNewReference: Lock acquired");
            n(new um(tmVar, 0), new rk0(6, tmVar, 0));
            int i10 = this.f10230f;
            if (i10 < 0) {
                throw new IllegalStateException();
            }
            this.f10230f = i10 + 1;
        }
        zze.zza("createNewReference: Lock released");
        return tmVar;
    }

    public final void p() {
        zze.zza("markAsDestroyable: Trying to acquire lock");
        synchronized (this.f10227c) {
            zze.zza("markAsDestroyable: Lock acquired");
            if (this.f10230f < 0) {
                throw new IllegalStateException();
            }
            zze.zza("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f10229e = true;
            q();
        }
        zze.zza("markAsDestroyable: Lock released");
    }

    public final void q() {
        zze.zza("maybeDestroy: Trying to acquire lock");
        synchronized (this.f10227c) {
            try {
                zze.zza("maybeDestroy: Lock acquired");
                int i10 = this.f10230f;
                if (i10 < 0) {
                    throw new IllegalStateException();
                }
                if (this.f10229e && i10 == 0) {
                    zze.zza("No reference is left (including root). Cleaning up engine.");
                    n(new jp0(5, this), new pe(22));
                } else {
                    zze.zza("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zze.zza("maybeDestroy: Lock released");
    }

    public final void r() {
        zze.zza("releaseOneReference: Trying to acquire lock");
        synchronized (this.f10227c) {
            zze.zza("releaseOneReference: Lock acquired");
            if (this.f10230f <= 0) {
                throw new IllegalStateException();
            }
            zze.zza("Releasing 1 reference for JS Engine");
            this.f10230f--;
            q();
        }
        zze.zza("releaseOneReference: Lock released");
    }
}
