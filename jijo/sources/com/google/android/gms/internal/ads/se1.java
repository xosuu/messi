package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class se1 implements zc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final se1 f8850a = new se1();

    @Override // com.google.android.gms.internal.ads.zc1
    public final boolean a(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 1999) {
            switch (i10) {
                case 1000:
                case 1001:
                case 1002:
                case 1003:
                case 1004:
                case 1005:
                case 1006:
                case 1007:
                case 1008:
                case 1009:
                case 1010:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
