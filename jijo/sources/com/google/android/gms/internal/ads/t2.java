package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public abstract class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9034a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9035b;

    public t2() {
    }

    public static int b(int i10) {
        return (i10 >> 24) & 255;
    }

    public static String c(int i10) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i10 >> 24) & 255));
        sb.append((char) ((i10 >> 16) & 255));
        sb.append((char) ((i10 >> 8) & 255));
        sb.append((char) (i10 & 255));
        return sb.toString();
    }

    public final boolean a(int i10) {
        return (this.f9035b & i10) == i10;
    }

    public String toString() {
        switch (this.f9034a) {
            case 0:
                return c(this.f9035b);
            default:
                return super.toString();
        }
    }

    public t2(int i10) {
        this.f9035b = i10;
    }
}
