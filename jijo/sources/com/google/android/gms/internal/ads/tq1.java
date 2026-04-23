package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class tq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c00 f9258a;

    public tq1(c00 c00Var) {
        this.f9258a = c00Var;
    }

    public final void a() throws zzcl {
        try {
            ((tq1) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(c00.class).newInstance(this.f9258a)).a();
        } catch (Exception e10) {
            if (!(e10 instanceof zzcl)) {
                throw new zzcl(e10);
            }
        }
    }
}
