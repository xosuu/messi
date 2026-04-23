package net.i2p.crypto.eddsa.math.ed25519;

import net.i2p.crypto.eddsa.math.Encoding;
import net.i2p.crypto.eddsa.math.FieldElement;

/* JADX INFO: loaded from: classes.dex */
public class Ed25519LittleEndianEncoding extends Encoding {
    public static int load_3(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        return ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 1] & 255) << 8) | i11;
    }

    public static long load_4(byte[] bArr, int i10) {
        int i11 = ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
        return ((long) ((bArr[i10 + 3] << 24) | i11 | ((bArr[i10 + 2] & 255) << 16))) & 4294967295L;
    }

    @Override // net.i2p.crypto.eddsa.math.Encoding
    public FieldElement decode(byte[] bArr) {
        long jLoad_4 = load_4(bArr, 0);
        long jLoad_3 = load_3(bArr, 4) << 6;
        long jLoad_32 = load_3(bArr, 7) << 5;
        long jLoad_33 = load_3(bArr, 10) << 3;
        long jLoad_34 = load_3(bArr, 13) << 2;
        long jLoad_42 = load_4(bArr, 16);
        long jLoad_35 = load_3(bArr, 20) << 7;
        long jLoad_36 = load_3(bArr, 23) << 5;
        long jLoad_37 = load_3(bArr, 26) << 4;
        long jLoad_38 = (load_3(bArr, 29) & 8388607) << 2;
        long j10 = (jLoad_38 + 16777216) >> 25;
        long j11 = (19 * j10) + jLoad_4;
        long j12 = (jLoad_3 + 16777216) >> 25;
        long j13 = jLoad_32 + j12;
        long j14 = (jLoad_33 + 16777216) >> 25;
        long j15 = jLoad_34 + j14;
        long j16 = (jLoad_42 + 16777216) >> 25;
        long j17 = jLoad_35 + j16;
        long j18 = jLoad_42 - (j16 << 25);
        long j19 = (jLoad_36 + 16777216) >> 25;
        long j20 = jLoad_37 + j19;
        long j21 = (j11 + 33554432) >> 26;
        long j22 = (jLoad_3 - (j12 << 25)) + j21;
        long j23 = j11 - (j21 << 26);
        long j24 = (j13 + 33554432) >> 26;
        long j25 = (jLoad_33 - (j14 << 25)) + j24;
        long j26 = (j15 + 33554432) >> 26;
        long j27 = j18 + j26;
        long j28 = j15 - (j26 << 26);
        long j29 = (j17 + 33554432) >> 26;
        long j30 = (jLoad_36 - (j19 << 25)) + j29;
        long j31 = j17 - (j29 << 26);
        long j32 = (j20 + 33554432) >> 26;
        return new Ed25519FieldElement(this.f15998f, new int[]{(int) j23, (int) j22, (int) (j13 - (j24 << 26)), (int) j25, (int) j28, (int) j27, (int) j31, (int) j30, (int) (j20 - (j32 << 26)), (int) ((jLoad_38 - (j10 << 25)) + j32)});
    }

    @Override // net.i2p.crypto.eddsa.math.Encoding
    public byte[] encode(FieldElement fieldElement) {
        int[] iArr = ((Ed25519FieldElement) fieldElement).f16003t;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = iArr[8];
        int i19 = iArr[9];
        int i20 = (((i19 + ((i18 + ((i17 + ((i16 + ((i15 + ((i14 + ((i13 + ((i12 + ((i11 + ((i10 + (((i19 * 19) + 16777216) >> 25)) >> 26)) >> 25)) >> 26)) >> 25)) >> 26)) >> 25)) >> 26)) >> 25)) >> 26)) >> 25) * 19) + i10;
        int i21 = i20 >> 26;
        int i22 = i11 + i21;
        int i23 = i20 - (i21 << 26);
        int i24 = i22 >> 25;
        int i25 = i12 + i24;
        int i26 = i22 - (i24 << 25);
        int i27 = i25 >> 26;
        int i28 = i13 + i27;
        int i29 = i25 - (i27 << 26);
        int i30 = i28 >> 25;
        int i31 = i14 + i30;
        int i32 = i28 - (i30 << 25);
        int i33 = i31 >> 26;
        int i34 = i15 + i33;
        int i35 = i31 - (i33 << 26);
        int i36 = i34 >> 25;
        int i37 = i16 + i36;
        int i38 = i34 - (i36 << 25);
        int i39 = i37 >> 26;
        int i40 = i17 + i39;
        int i41 = i37 - (i39 << 26);
        int i42 = i40 >> 25;
        int i43 = i18 + i42;
        int i44 = i40 - (i42 << 25);
        int i45 = i43 >> 26;
        int i46 = i19 + i45;
        int i47 = i43 - (i45 << 26);
        int i48 = i46 - ((i46 >> 25) << 25);
        return new byte[]{(byte) i23, (byte) (i23 >> 8), (byte) (i23 >> 16), (byte) ((i23 >> 24) | (i26 << 2)), (byte) (i26 >> 6), (byte) (i26 >> 14), (byte) ((i26 >> 22) | (i29 << 3)), (byte) (i29 >> 5), (byte) (i29 >> 13), (byte) ((i29 >> 21) | (i32 << 5)), (byte) (i32 >> 3), (byte) (i32 >> 11), (byte) ((i32 >> 19) | (i35 << 6)), (byte) (i35 >> 2), (byte) (i35 >> 10), (byte) (i35 >> 18), (byte) i38, (byte) (i38 >> 8), (byte) (i38 >> 16), (byte) ((i38 >> 24) | (i41 << 1)), (byte) (i41 >> 7), (byte) (i41 >> 15), (byte) ((i41 >> 23) | (i44 << 3)), (byte) (i44 >> 5), (byte) (i44 >> 13), (byte) ((i44 >> 21) | (i47 << 4)), (byte) (i47 >> 4), (byte) (i47 >> 12), (byte) ((i47 >> 20) | (i48 << 6)), (byte) (i48 >> 2), (byte) (i48 >> 10), (byte) (i48 >> 18)};
    }

    @Override // net.i2p.crypto.eddsa.math.Encoding
    public boolean isNegative(FieldElement fieldElement) {
        return (encode(fieldElement)[0] & 1) != 0;
    }
}
