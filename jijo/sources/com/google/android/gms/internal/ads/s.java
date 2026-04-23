package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8734h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f8735i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f8736j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f8737k;

    public s(ArrayList arrayList, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, String str) {
        this.f8727a = arrayList;
        this.f8728b = i10;
        this.f8729c = i11;
        this.f8730d = i12;
        this.f8731e = i13;
        this.f8732f = i14;
        this.f8733g = i15;
        this.f8734h = i16;
        this.f8735i = i17;
        this.f8736j = f10;
        this.f8737k = str;
    }

    public static s a(ik0 ik0Var) throws zzbo {
        byte[] bArr;
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f10;
        try {
            ik0Var.j(4);
            int iV = ik0Var.v() & 3;
            int i17 = iV + 1;
            if (i17 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iV2 = ik0Var.v() & 31;
            int i18 = 0;
            while (true) {
                bArr = en1.H;
                if (i18 >= iV2) {
                    break;
                }
                int iZ = ik0Var.z();
                int i19 = ik0Var.f5634b;
                ik0Var.j(iZ);
                byte[] bArr2 = ik0Var.f5633a;
                byte[] bArr3 = new byte[iZ + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i19, bArr3, 4, iZ);
                arrayList.add(bArr3);
                i18++;
            }
            int iV3 = ik0Var.v();
            for (int i20 = 0; i20 < iV3; i20++) {
                int iZ2 = ik0Var.z();
                int i21 = ik0Var.f5634b;
                ik0Var.j(iZ2);
                byte[] bArr4 = ik0Var.f5633a;
                byte[] bArr5 = new byte[iZ2 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i21, bArr5, 4, iZ2);
                arrayList.add(bArr5);
            }
            if (iV2 > 0) {
                tr0 tr0VarD = ds0.d(iV + 2, (byte[]) arrayList.get(0), ((byte[]) arrayList.get(0)).length);
                int i22 = tr0VarD.f9274e;
                int i23 = tr0VarD.f9275f;
                int i24 = tr0VarD.f9277h + 8;
                int i25 = tr0VarD.f9278i + 8;
                int i26 = tr0VarD.f9279j;
                int i27 = tr0VarD.f9280k;
                int i28 = tr0VarD.f9281l;
                float f11 = tr0VarD.f9276g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(tr0VarD.f9270a), Integer.valueOf(tr0VarD.f9271b), Integer.valueOf(tr0VarD.f9272c));
                i10 = i22;
                f10 = f11;
                i16 = i28;
                i15 = i27;
                i14 = i26;
                i13 = i25;
                i12 = i24;
                i11 = i23;
            } else {
                str = null;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = -1;
                i16 = -1;
                f10 = 1.0f;
            }
            return new s(arrayList, i17, i10, i11, i12, i13, i14, i15, i16, f10, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw zzbo.a("Error parsing AVC config", e10);
        }
    }
}
