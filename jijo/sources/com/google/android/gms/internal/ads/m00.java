package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m00 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vt0 f6797b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f6798d;

    public /* synthetic */ m00(vt0 vt0Var, String str, int i10) {
        this.f6796a = i10;
        this.f6797b = vt0Var;
        this.f6798d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6796a;
        String str = this.f6798d;
        vt0 vt0Var = this.f6797b;
        switch (i10) {
            case 0:
                vt0Var.a(str, null);
                break;
            default:
                vt0Var.f9966c.zza(str);
                break;
        }
    }
}
