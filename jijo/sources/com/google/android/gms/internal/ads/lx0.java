package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class lx0 extends ox0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ mx0 f6710q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx0(mx0 mx0Var, CharSequence charSequence) {
        super(charSequence);
        this.f6710q = mx0Var;
    }

    @Override // com.google.android.gms.internal.ads.ox0
    public final int d(int i10) {
        return i10 + 1;
    }

    @Override // com.google.android.gms.internal.ads.ox0
    public final int e(int i10) {
        CharSequence charSequence = this.f7696d;
        int length = charSequence.length();
        en1.j0(i10, length);
        while (i10 < length) {
            if (charSequence.charAt(i10) == ((ex0) ((dx0) this.f6710q.f7073a)).f4315a) {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
