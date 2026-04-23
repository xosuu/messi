package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.zzu;

/* JADX INFO: loaded from: classes.dex */
public final class ae0 extends pb implements wl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f2663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2664b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f2665d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bt0 f2666f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qu f2667h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ be0 f2668q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae0(long j10, qu quVar, be0 be0Var, bt0 bt0Var, Object obj, String str) {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        this.f2663a = obj;
        this.f2664b = str;
        this.f2665d = j10;
        this.f2666f = bt0Var;
        this.f2667h = quVar;
        this.f2668q = be0Var;
    }

    @Override // com.google.android.gms.internal.ads.wl
    public final void a(String str) {
        synchronized (this.f2663a) {
            be0 be0Var = this.f2668q;
            String str2 = this.f2664b;
            ((y3.b) zzu.zzB()).getClass();
            be0Var.d(str2, (int) (SystemClock.elapsedRealtime() - this.f2665d), str, false);
            this.f2668q.f3008l.a(this.f2664b, "error");
            this.f2668q.f3011o.a(this.f2664b, "error");
            gt0 gt0Var = this.f2668q.f3012p;
            bt0 bt0Var = this.f2666f;
            bt0Var.i(str);
            bt0Var.x(false);
            gt0Var.b(bt0Var.zzm());
            this.f2667h.b(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 2) {
            zzf();
        } else {
            if (i10 != 3) {
                return false;
            }
            String string = parcel.readString();
            qb.b(parcel);
            a(string);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.wl
    public final void zzf() {
        synchronized (this.f2663a) {
            be0 be0Var = this.f2668q;
            String str = this.f2664b;
            ((y3.b) zzu.zzB()).getClass();
            be0Var.d(str, (int) (SystemClock.elapsedRealtime() - this.f2665d), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, true);
            this.f2668q.f3008l.c(this.f2664b);
            this.f2668q.f3011o.X(this.f2664b);
            gt0 gt0Var = this.f2668q.f3012p;
            bt0 bt0Var = this.f2666f;
            bt0Var.x(true);
            gt0Var.b(bt0Var.zzm());
            this.f2667h.b(Boolean.TRUE);
        }
    }
}
