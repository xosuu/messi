package g0;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char f13606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f13607b;

    public static void a(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z9, boolean z10) {
        double d10;
        double d11;
        double radians = Math.toRadians(f16);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d12 = f10;
        double d13 = f11;
        double d14 = (d13 * dSin) + (d12 * dCos);
        double d15 = d12;
        double d16 = f14;
        double d17 = d14 / d16;
        double d18 = f15;
        double d19 = ((d13 * dCos) + (((double) (-f10)) * dSin)) / d18;
        double d20 = d13;
        double d21 = f13;
        double d22 = ((d21 * dSin) + (((double) f12) * dCos)) / d16;
        double d23 = ((d21 * dCos) + (((double) (-f12)) * dSin)) / d18;
        double d24 = d17 - d22;
        double d25 = d19 - d23;
        double d26 = (d17 + d22) / 2.0d;
        double d27 = (d19 + d23) / 2.0d;
        double d28 = (d25 * d25) + (d24 * d24);
        if (d28 == 0.0d) {
            return;
        }
        double d29 = (1.0d / d28) - 0.25d;
        if (d29 < 0.0d) {
            float fSqrt = (float) (Math.sqrt(d28) / 1.99999d);
            a(path, f10, f11, f12, f13, f14 * fSqrt, f15 * fSqrt, f16, z9, z10);
            return;
        }
        double dSqrt = Math.sqrt(d29);
        double d30 = d24 * dSqrt;
        double d31 = dSqrt * d25;
        if (z9 == z10) {
            d10 = d26 - d31;
            d11 = d27 + d30;
        } else {
            d10 = d26 + d31;
            d11 = d27 - d30;
        }
        double dAtan2 = Math.atan2(d19 - d11, d17 - d10);
        double dAtan22 = Math.atan2(d23 - d11, d22 - d10) - dAtan2;
        int i10 = 0;
        if (z10 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d32 = d10 * d16;
        double d33 = d11 * d18;
        double d34 = (d32 * dCos) - (d33 * dSin);
        double d35 = (d33 * dCos) + (d32 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d36 = -d16;
        double d37 = d36 * dCos2;
        double d38 = d18 * dSin2;
        double d39 = (d37 * dSin3) - (d38 * dCos3);
        double d40 = d36 * dSin2;
        double d41 = d18 * dCos2;
        double d42 = (dCos3 * d41) + (dSin3 * d40);
        double d43 = dAtan22 / ((double) iCeil);
        double d44 = dAtan2;
        while (i10 < iCeil) {
            double d45 = d44 + d43;
            double dSin4 = Math.sin(d45);
            double dCos4 = Math.cos(d45);
            double d46 = d43;
            double d47 = (((d16 * dCos2) * dCos4) + d34) - (d38 * dSin4);
            double d48 = d34;
            double d49 = (d41 * dSin4) + (d16 * dSin2 * dCos4) + d35;
            double d50 = (d37 * dSin4) - (d38 * dCos4);
            double d51 = (dCos4 * d41) + (dSin4 * d40);
            double d52 = d45 - d44;
            double dTan = Math.tan(d52 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d52)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d39 * dSqrt2) + d15), (float) ((d42 * dSqrt2) + d20), (float) (d47 - (dSqrt2 * d50)), (float) (d49 - (dSqrt2 * d51)), (float) d47, (float) d49);
            i10++;
            d41 = d41;
            d40 = d40;
            iCeil = iCeil;
            dCos2 = dCos2;
            d44 = d45;
            d16 = d16;
            d42 = d51;
            d39 = d50;
            d15 = d47;
            d20 = d49;
            d43 = d46;
            d34 = d48;
        }
    }

    public static void b(f[] fVarArr, Path path) {
        int i10;
        int i11;
        float[] fArr;
        char c10;
        int i12;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        f[] fVarArr2 = fVarArr;
        float[] fArr2 = new float[6];
        char c11 = 'm';
        char c12 = 0;
        char c13 = 'm';
        int i13 = 0;
        while (i13 < fVarArr2.length) {
            f fVar = fVarArr2[i13];
            char c14 = fVar.f13606a;
            float[] fArr3 = fVar.f13607b;
            float f24 = fArr2[c12];
            float f25 = fArr2[1];
            float f26 = fArr2[2];
            float f27 = fArr2[3];
            float f28 = fArr2[4];
            float f29 = fArr2[5];
            switch (c14) {
                case 'A':
                case 'a':
                    i10 = 7;
                    break;
                case 'C':
                case 'c':
                    i10 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i10 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i10 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f28, f29);
                    f24 = f28;
                    f26 = f24;
                    f25 = f29;
                    f27 = f25;
                default:
                    i10 = 2;
                    break;
            }
            float f30 = f28;
            float f31 = f29;
            float f32 = f24;
            float f33 = f25;
            int i14 = 0;
            while (i14 < fArr3.length) {
                if (c14 != 'A') {
                    if (c14 != 'C') {
                        if (c14 == 'H') {
                            i11 = i14;
                            fArr = fArr3;
                            c10 = c14;
                            i12 = i13;
                            path.lineTo(fArr[i11], f33);
                            f32 = fArr[i11];
                        } else if (c14 == 'Q') {
                            i11 = i14;
                            fArr = fArr3;
                            c10 = c14;
                            i12 = i13;
                            int i15 = i11 + 1;
                            int i16 = i11 + 2;
                            int i17 = i11 + 3;
                            path.quadTo(fArr[i11], fArr[i15], fArr[i16], fArr[i17]);
                            f10 = fArr[i11];
                            f11 = fArr[i15];
                            f32 = fArr[i16];
                            f33 = fArr[i17];
                        } else if (c14 == 'V') {
                            i11 = i14;
                            fArr = fArr3;
                            c10 = c14;
                            i12 = i13;
                            path.lineTo(f32, fArr[i11]);
                            f33 = fArr[i11];
                        } else if (c14 != 'a') {
                            if (c14 != 'c') {
                                if (c14 == 'h') {
                                    i11 = i14;
                                    path.rLineTo(fArr3[i11], 0.0f);
                                    f32 += fArr3[i11];
                                } else if (c14 == 'q') {
                                    i11 = i14;
                                    float f34 = f33;
                                    float f35 = f32;
                                    int i18 = i11 + 1;
                                    int i19 = i11 + 2;
                                    int i20 = i11 + 3;
                                    path.rQuadTo(fArr3[i11], fArr3[i18], fArr3[i19], fArr3[i20]);
                                    float f36 = f35 + fArr3[i11];
                                    float f37 = fArr3[i18] + f34;
                                    float f38 = f35 + fArr3[i19];
                                    f33 = f34 + fArr3[i20];
                                    f27 = f37;
                                    f26 = f36;
                                    fArr = fArr3;
                                    c10 = c14;
                                    i12 = i13;
                                    f32 = f38;
                                } else if (c14 == 'v') {
                                    i11 = i14;
                                    path.rLineTo(0.0f, fArr3[i11]);
                                    f33 += fArr3[i11];
                                } else if (c14 == 'L') {
                                    i11 = i14;
                                    int i21 = i11 + 1;
                                    path.lineTo(fArr3[i11], fArr3[i21]);
                                    f32 = fArr3[i11];
                                    f33 = fArr3[i21];
                                } else if (c14 == 'M') {
                                    i11 = i14;
                                    f32 = fArr3[i11];
                                    f33 = fArr3[i11 + 1];
                                    if (i11 > 0) {
                                        path.lineTo(f32, f33);
                                    } else {
                                        path.moveTo(f32, f33);
                                        f31 = f33;
                                        f30 = f32;
                                    }
                                } else if (c14 == 'S') {
                                    i11 = i14;
                                    float f39 = f33;
                                    float f40 = f32;
                                    if (c13 == 'c' || c13 == 's' || c13 == 'C' || c13 == 'S') {
                                        f18 = (f39 * 2.0f) - f27;
                                        f19 = (f40 * 2.0f) - f26;
                                    } else {
                                        f19 = f40;
                                        f18 = f39;
                                    }
                                    int i22 = i11 + 1;
                                    int i23 = i11 + 2;
                                    int i24 = i11 + 3;
                                    path.cubicTo(f19, f18, fArr3[i11], fArr3[i22], fArr3[i23], fArr3[i24]);
                                    float f41 = fArr3[i11];
                                    float f42 = fArr3[i22];
                                    f32 = fArr3[i23];
                                    f33 = fArr3[i24];
                                    f27 = f42;
                                    f26 = f41;
                                } else if (c14 == 'T') {
                                    i11 = i14;
                                    float f43 = f33;
                                    float f44 = f32;
                                    if (c13 == 'q' || c13 == 't' || c13 == 'Q' || c13 == 'T') {
                                        f13 = (f44 * 2.0f) - f26;
                                        f14 = (f43 * 2.0f) - f27;
                                    } else {
                                        f13 = f44;
                                        f14 = f43;
                                    }
                                    int i25 = i11 + 1;
                                    path.quadTo(f13, f14, fArr3[i11], fArr3[i25]);
                                    f15 = fArr3[i11];
                                    f17 = fArr3[i25];
                                    f27 = f14;
                                    f26 = f13;
                                    fArr = fArr3;
                                    c10 = c14;
                                    i12 = i13;
                                    f32 = f15;
                                    f33 = f17;
                                } else if (c14 == 'l') {
                                    i11 = i14;
                                    int i26 = i11 + 1;
                                    path.rLineTo(fArr3[i11], fArr3[i26]);
                                    f32 += fArr3[i11];
                                    f33 += fArr3[i26];
                                } else if (c14 == c11) {
                                    i11 = i14;
                                    float f45 = fArr3[i11];
                                    f32 += f45;
                                    float f46 = fArr3[i11 + 1];
                                    f33 += f46;
                                    if (i11 > 0) {
                                        path.rLineTo(f45, f46);
                                    } else {
                                        path.rMoveTo(f45, f46);
                                        f31 = f33;
                                        f30 = f32;
                                    }
                                } else if (c14 == 's') {
                                    if (c13 == 'c' || c13 == 's' || c13 == 'C' || c13 == 'S') {
                                        f20 = f33 - f27;
                                        f21 = f32 - f26;
                                    } else {
                                        f21 = 0.0f;
                                        f20 = 0.0f;
                                    }
                                    int i27 = i14 + 1;
                                    int i28 = i14 + 2;
                                    int i29 = i14 + 3;
                                    i11 = i14;
                                    f12 = f33;
                                    float f47 = f32;
                                    path.rCubicTo(f21, f20, fArr3[i14], fArr3[i27], fArr3[i28], fArr3[i29]);
                                    f13 = f47 + fArr3[i11];
                                    f14 = f12 + fArr3[i27];
                                    f15 = f47 + fArr3[i28];
                                    f16 = fArr3[i29];
                                } else if (c14 != 't') {
                                    i11 = i14;
                                } else {
                                    if (c13 == 'q' || c13 == 't' || c13 == 'Q' || c13 == 'T') {
                                        f22 = f32 - f26;
                                        f23 = f33 - f27;
                                    } else {
                                        f23 = 0.0f;
                                        f22 = 0.0f;
                                    }
                                    int i30 = i14 + 1;
                                    path.rQuadTo(f22, f23, fArr3[i14], fArr3[i30]);
                                    float f48 = f22 + f32;
                                    float f49 = f23 + f33;
                                    f32 += fArr3[i14];
                                    f33 += fArr3[i30];
                                    f27 = f49;
                                    i11 = i14;
                                    fArr = fArr3;
                                    c10 = c14;
                                    i12 = i13;
                                    f26 = f48;
                                }
                                fArr = fArr3;
                                c10 = c14;
                                i12 = i13;
                            } else {
                                i11 = i14;
                                f12 = f33;
                                float f50 = f32;
                                int i31 = i11 + 2;
                                int i32 = i11 + 3;
                                int i33 = i11 + 4;
                                int i34 = i11 + 5;
                                path.rCubicTo(fArr3[i11], fArr3[i11 + 1], fArr3[i31], fArr3[i32], fArr3[i33], fArr3[i34]);
                                f13 = f50 + fArr3[i31];
                                f14 = f12 + fArr3[i32];
                                f15 = f50 + fArr3[i33];
                                f16 = fArr3[i34];
                            }
                            f17 = f16 + f12;
                            f27 = f14;
                            f26 = f13;
                            fArr = fArr3;
                            c10 = c14;
                            i12 = i13;
                            f32 = f15;
                            f33 = f17;
                        } else {
                            i11 = i14;
                            float f51 = f33;
                            float f52 = f32;
                            int i35 = i11 + 5;
                            int i36 = i11 + 6;
                            fArr = fArr3;
                            c10 = c14;
                            i12 = i13;
                            a(path, f52, f51, fArr3[i35] + f52, fArr3[i36] + f51, fArr3[i11], fArr3[i11 + 1], fArr3[i11 + 2], fArr3[i11 + 3] != 0.0f, fArr3[i11 + 4] != 0.0f);
                            f32 = f52 + fArr[i35];
                            f33 = f51 + fArr[i36];
                        }
                        i14 = i11 + i10;
                        c13 = c10;
                        c14 = c13;
                        fArr3 = fArr;
                        i13 = i12;
                        c11 = 'm';
                    } else {
                        i11 = i14;
                        fArr = fArr3;
                        c10 = c14;
                        i12 = i13;
                        int i37 = i11 + 2;
                        int i38 = i11 + 3;
                        int i39 = i11 + 4;
                        int i40 = i11 + 5;
                        path.cubicTo(fArr[i11], fArr[i11 + 1], fArr[i37], fArr[i38], fArr[i39], fArr[i40]);
                        f32 = fArr[i39];
                        f33 = fArr[i40];
                        f10 = fArr[i37];
                        f11 = fArr[i38];
                    }
                    f26 = f10;
                    f27 = f11;
                    i14 = i11 + i10;
                    c13 = c10;
                    c14 = c13;
                    fArr3 = fArr;
                    i13 = i12;
                    c11 = 'm';
                } else {
                    i11 = i14;
                    fArr = fArr3;
                    c10 = c14;
                    i12 = i13;
                    int i41 = i11 + 5;
                    int i42 = i11 + 6;
                    a(path, f32, f33, fArr[i41], fArr[i42], fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3] != 0.0f, fArr[i11 + 4] != 0.0f);
                    f32 = fArr[i41];
                    f33 = fArr[i42];
                }
                f27 = f33;
                f26 = f32;
                i14 = i11 + i10;
                c13 = c10;
                c14 = c13;
                fArr3 = fArr;
                i13 = i12;
                c11 = 'm';
            }
            int i43 = i13;
            fArr2[0] = f32;
            fArr2[1] = f33;
            fArr2[2] = f26;
            fArr2[3] = f27;
            fArr2[4] = f30;
            fArr2[5] = f31;
            i13 = i43 + 1;
            c13 = fVarArr[i43].f13606a;
            c11 = 'm';
            c12 = 0;
            fVarArr2 = fVarArr;
        }
    }
}
