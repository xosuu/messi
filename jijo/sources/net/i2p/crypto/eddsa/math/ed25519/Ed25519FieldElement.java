package net.i2p.crypto.eddsa.math.ed25519;

import java.util.Arrays;
import net.i2p.crypto.eddsa.Utils;
import net.i2p.crypto.eddsa.math.Field;
import net.i2p.crypto.eddsa.math.FieldElement;

/* JADX INFO: loaded from: classes.dex */
public class Ed25519FieldElement extends FieldElement {
    private static final byte[] ZERO = new byte[32];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final int[] f16003t;

    public Ed25519FieldElement(Field field, int[] iArr) {
        super(field);
        if (iArr.length != 10) {
            throw new IllegalArgumentException("Invalid radix-2^51 representation");
        }
        this.f16003t = iArr;
    }

    @Override // net.i2p.crypto.eddsa.math.FieldElement
    public FieldElement add(FieldElement fieldElement) {
        int[] iArr = ((Ed25519FieldElement) fieldElement).f16003t;
        int[] iArr2 = new int[10];
        for (int i10 = 0; i10 < 10; i10++) {
            iArr2[i10] = this.f16003t[i10] + iArr[i10];
        }
        return new Ed25519FieldElement(this.f16001f, iArr2);
    }

    @Override // net.i2p.crypto.eddsa.math.FieldElement
    public FieldElement cmov(FieldElement fieldElement, int i10) {
        Ed25519FieldElement ed25519FieldElement = (Ed25519FieldElement) fieldElement;
        int i11 = -i10;
        int[] iArr = new int[10];
        for (int i12 = 0; i12 < 10; i12++) {
            int[] iArr2 = this.f16003t;
            int i13 = iArr2[i12];
            iArr[i12] = i13;
            iArr[i12] = ((iArr2[i12] ^ ed25519FieldElement.f16003t[i12]) & i11) ^ i13;
        }
        return new Ed25519FieldElement(this.f16001f, iArr);
    }

    public boolean equals(Object obj) {
        return (obj instanceof Ed25519FieldElement) && 1 == Utils.equal(toByteArray(), ((Ed25519FieldElement) obj).toByteArray());
    }

    public int hashCode() {
        return Arrays.hashCode(this.f16003t);
    }

    @Override // net.i2p.crypto.eddsa.math.FieldElement
    public FieldElement invert() {
        FieldElement fieldElementSquare = square();
        FieldElement fieldElementMultiply = multiply(fieldElementSquare.square().square());
        FieldElement fieldElementMultiply2 = fieldElementSquare.multiply(fieldElementMultiply);
        FieldElement fieldElementMultiply3 = fieldElementMultiply.multiply(fieldElementMultiply2.square());
        FieldElement fieldElementSquare2 = fieldElementMultiply3.square();
        for (int i10 = 1; i10 < 5; i10++) {
            fieldElementSquare2 = fieldElementSquare2.square();
        }
        FieldElement fieldElementMultiply4 = fieldElementSquare2.multiply(fieldElementMultiply3);
        FieldElement fieldElementSquare3 = fieldElementMultiply4.square();
        for (int i11 = 1; i11 < 10; i11++) {
            fieldElementSquare3 = fieldElementSquare3.square();
        }
        FieldElement fieldElementMultiply5 = fieldElementSquare3.multiply(fieldElementMultiply4);
        FieldElement fieldElementSquare4 = fieldElementMultiply5.square();
        for (int i12 = 1; i12 < 20; i12++) {
            fieldElementSquare4 = fieldElementSquare4.square();
        }
        FieldElement fieldElementSquare5 = fieldElementSquare4.multiply(fieldElementMultiply5).square();
        for (int i13 = 1; i13 < 10; i13++) {
            fieldElementSquare5 = fieldElementSquare5.square();
        }
        FieldElement fieldElementMultiply6 = fieldElementSquare5.multiply(fieldElementMultiply4);
        FieldElement fieldElementSquare6 = fieldElementMultiply6.square();
        for (int i14 = 1; i14 < 50; i14++) {
            fieldElementSquare6 = fieldElementSquare6.square();
        }
        FieldElement fieldElementMultiply7 = fieldElementSquare6.multiply(fieldElementMultiply6);
        FieldElement fieldElementSquare7 = fieldElementMultiply7.square();
        for (int i15 = 1; i15 < 100; i15++) {
            fieldElementSquare7 = fieldElementSquare7.square();
        }
        FieldElement fieldElementSquare8 = fieldElementSquare7.multiply(fieldElementMultiply7).square();
        for (int i16 = 1; i16 < 50; i16++) {
            fieldElementSquare8 = fieldElementSquare8.square();
        }
        FieldElement fieldElementSquare9 = fieldElementSquare8.multiply(fieldElementMultiply6).square();
        for (int i17 = 1; i17 < 5; i17++) {
            fieldElementSquare9 = fieldElementSquare9.square();
        }
        return fieldElementSquare9.multiply(fieldElementMultiply2);
    }

    @Override // net.i2p.crypto.eddsa.math.FieldElement
    public boolean isNonZero() {
        return Utils.equal(toByteArray(), ZERO) == 0;
    }

    @Override // net.i2p.crypto.eddsa.math.FieldElement
    public FieldElement multiply(FieldElement fieldElement) {
        int[] iArr = ((Ed25519FieldElement) fieldElement).f16003t;
        int i10 = iArr[1];
        int i11 = i10 * 19;
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = i14 * 19;
        int i16 = iArr[5];
        int i17 = iArr[6];
        int i18 = iArr[7];
        int i19 = iArr[8];
        int i20 = i19 * 19;
        int i21 = iArr[9];
        int i22 = i21 * 19;
        int[] iArr2 = this.f16003t;
        int i23 = iArr2[1];
        int i24 = iArr2[3];
        int i25 = i24 * 2;
        int i26 = iArr2[5];
        int i27 = i26 * 2;
        int i28 = iArr2[7];
        int i29 = i28 * 2;
        int i30 = iArr2[9];
        int i31 = i30 * 2;
        int i32 = iArr2[0];
        int i33 = iArr[0];
        long j10 = ((long) i32) * ((long) i33);
        long j11 = ((long) i32) * ((long) i10);
        long j12 = ((long) i32) * ((long) i12);
        long j13 = ((long) i32) * ((long) i13);
        long j14 = ((long) i32) * ((long) i14);
        long j15 = ((long) i32) * ((long) i16);
        long j16 = ((long) i32) * ((long) i17);
        long j17 = ((long) i32) * ((long) i18);
        long j18 = ((long) i32) * ((long) i19);
        long j19 = ((long) i32) * ((long) i21);
        long j20 = ((long) i23) * ((long) i33);
        long j21 = i23 * 2;
        long j22 = ((long) i10) * j21;
        long j23 = ((long) i23) * ((long) i12);
        long j24 = ((long) i13) * j21;
        long j25 = ((long) i23) * ((long) i14);
        long j26 = ((long) i16) * j21;
        long j27 = ((long) i23) * ((long) i17);
        long j28 = ((long) i18) * j21;
        long j29 = ((long) i23) * ((long) i19);
        long j30 = i22;
        long j31 = j21 * j30;
        int i34 = iArr2[2];
        long j32 = ((long) i34) * ((long) i33);
        long j33 = ((long) i34) * ((long) i10);
        long j34 = ((long) i34) * ((long) i12);
        long j35 = ((long) i34) * ((long) i13);
        long j36 = ((long) i34) * ((long) i14);
        long j37 = ((long) i34) * ((long) i16);
        long j38 = ((long) i34) * ((long) i17);
        long j39 = ((long) i34) * ((long) i18);
        long j40 = i20;
        long j41 = ((long) i34) * j40;
        long j42 = ((long) i34) * j30;
        long j43 = ((long) i24) * ((long) i33);
        long j44 = i25;
        long j45 = ((long) i10) * j44;
        long j46 = ((long) i24) * ((long) i12);
        long j47 = ((long) i13) * j44;
        long j48 = ((long) i24) * ((long) i14);
        long j49 = ((long) i16) * j44;
        long j50 = ((long) i24) * ((long) i17);
        long j51 = i18 * 19;
        long j52 = j44 * j51;
        long j53 = ((long) i24) * j40;
        long j54 = j44 * j30;
        int i35 = iArr2[4];
        long j55 = ((long) i35) * ((long) i33);
        long j56 = ((long) i35) * ((long) i10);
        long j57 = ((long) i35) * ((long) i12);
        long j58 = ((long) i35) * ((long) i13);
        long j59 = ((long) i35) * ((long) i14);
        long j60 = ((long) i35) * ((long) i16);
        long j61 = i17 * 19;
        long j62 = ((long) i35) * j61;
        long j63 = ((long) i35) * j51;
        long j64 = ((long) i35) * j40;
        long j65 = ((long) i35) * j30;
        long j66 = ((long) i26) * ((long) i33);
        long j67 = i27;
        long j68 = ((long) i10) * j67;
        long j69 = ((long) i26) * ((long) i12);
        long j70 = ((long) i13) * j67;
        long j71 = ((long) i26) * ((long) i14);
        long j72 = i16 * 19;
        long j73 = j67 * j72;
        long j74 = ((long) i26) * j61;
        long j75 = j67 * j51;
        long j76 = ((long) i26) * j40;
        long j77 = j67 * j30;
        int i36 = iArr2[6];
        long j78 = ((long) i36) * ((long) i33);
        long j79 = ((long) i36) * ((long) i10);
        long j80 = ((long) i36) * ((long) i12);
        long j81 = ((long) i36) * ((long) i13);
        long j82 = i15;
        long j83 = ((long) i36) * j82;
        long j84 = ((long) i36) * j72;
        long j85 = ((long) i36) * j61;
        long j86 = ((long) i36) * j51;
        long j87 = ((long) i36) * j40;
        long j88 = ((long) i36) * j30;
        long j89 = ((long) i28) * ((long) i33);
        long j90 = i29;
        long j91 = ((long) i10) * j90;
        long j92 = ((long) i28) * ((long) i12);
        long j93 = i13 * 19;
        long j94 = j90 * j93;
        long j95 = ((long) i28) * j82;
        long j96 = j90 * j72;
        long j97 = ((long) i28) * j61;
        long j98 = j90 * j51;
        long j99 = ((long) i28) * j40;
        long j100 = j90 * j30;
        int i37 = iArr2[8];
        long j101 = ((long) i37) * ((long) i10);
        long j102 = i12 * 19;
        long j103 = ((long) i37) * j102;
        long j104 = ((long) i37) * j82;
        long j105 = ((long) i37) * j51;
        long j106 = ((long) i37) * j40;
        long j107 = ((long) i30) * ((long) i33);
        long j108 = i31;
        long j109 = ((long) i30) * j102;
        long j110 = ((long) i30) * j82;
        long j111 = ((long) i30) * j61;
        long j112 = j108 * j51;
        long j113 = ((long) i30) * j40;
        long j114 = j10 + j31 + j41 + j52 + j62 + j73 + j83 + j94 + j103 + (((long) i11) * j108);
        long j115 = j11 + j20 + j42 + j53 + j63 + j74 + j84 + j95 + (((long) i37) * j93) + j109;
        long j116 = j12 + j22 + j32 + j54 + j64 + j75 + j85 + j96 + j104 + (j93 * j108);
        long j117 = j13 + j23 + j33 + j43 + j65 + j76 + j86 + j97 + (((long) i37) * j72) + j110;
        long j118 = j14 + j24 + j34 + j45 + j55 + j77 + j87 + j98 + (((long) i37) * j61) + (j72 * j108);
        long j119 = j15 + j25 + j35 + j46 + j56 + j66 + j88 + j99 + j105 + j111;
        long j120 = j16 + j26 + j36 + j47 + j57 + j68 + j78 + j100 + j106 + j112;
        long j121 = j17 + j27 + j37 + j48 + j58 + j69 + j79 + j89 + (((long) i37) * j30) + j113;
        long j122 = j18 + j28 + j38 + j49 + j59 + j70 + j80 + j91 + (((long) i37) * ((long) i33));
        long j123 = j19 + j29 + j39 + j50 + j60 + j71 + j81 + j92 + j101 + j107;
        long j124 = (j114 + 33554432) >> 26;
        long j125 = j115 + j124;
        long j126 = j114 - (j124 << 26);
        long j127 = (j118 + 33554432) >> 26;
        long j128 = j119 + j127;
        long j129 = (j125 + 16777216) >> 25;
        long j130 = j116 + j129;
        long j131 = j125 - (j129 << 25);
        long j132 = (j128 + 16777216) >> 25;
        long j133 = j120 + j132;
        long j134 = j128 - (j132 << 25);
        long j135 = (j130 + 33554432) >> 26;
        long j136 = j117 + j135;
        long j137 = j130 - (j135 << 26);
        long j138 = (j133 + 33554432) >> 26;
        long j139 = j121 + j138;
        long j140 = j133 - (j138 << 26);
        long j141 = (j136 + 16777216) >> 25;
        long j142 = (j118 - (j127 << 26)) + j141;
        long j143 = j136 - (j141 << 25);
        long j144 = (j139 + 16777216) >> 25;
        long j145 = j122 + (j108 * j30) + j144;
        long j146 = j139 - (j144 << 25);
        long j147 = (j142 + 33554432) >> 26;
        long j148 = j134 + j147;
        long j149 = j142 - (j147 << 26);
        long j150 = (j145 + 33554432) >> 26;
        long j151 = j123 + j150;
        long j152 = j145 - (j150 << 26);
        long j153 = (j151 + 16777216) >> 25;
        long j154 = (19 * j153) + j126;
        long j155 = (j154 + 33554432) >> 26;
        return new Ed25519FieldElement(this.f16001f, new int[]{(int) (j154 - (j155 << 26)), (int) (j131 + j155), (int) j137, (int) j143, (int) j149, (int) j148, (int) j140, (int) j146, (int) j152, (int) (j151 - (j153 << 25))});
    }

    @Override // net.i2p.crypto.eddsa.math.FieldElement
    public FieldElement negate() {
        int[] iArr = new int[10];
        for (int i10 = 0; i10 < 10; i10++) {
            iArr[i10] = -this.f16003t[i10];
        }
        return new Ed25519FieldElement(this.f16001f, iArr);
    }

    @Override // net.i2p.crypto.eddsa.math.FieldElement
    public FieldElement pow22523() {
        FieldElement fieldElementSquare = square();
        FieldElement fieldElementMultiply = multiply(fieldElementSquare.square().square());
        FieldElement fieldElementMultiply2 = fieldElementMultiply.multiply(fieldElementSquare.multiply(fieldElementMultiply).square());
        FieldElement fieldElementSquare2 = fieldElementMultiply2.square();
        for (int i10 = 1; i10 < 5; i10++) {
            fieldElementSquare2 = fieldElementSquare2.square();
        }
        FieldElement fieldElementMultiply3 = fieldElementSquare2.multiply(fieldElementMultiply2);
        FieldElement fieldElementSquare3 = fieldElementMultiply3.square();
        for (int i11 = 1; i11 < 10; i11++) {
            fieldElementSquare3 = fieldElementSquare3.square();
        }
        FieldElement fieldElementMultiply4 = fieldElementSquare3.multiply(fieldElementMultiply3);
        FieldElement fieldElementSquare4 = fieldElementMultiply4.square();
        for (int i12 = 1; i12 < 20; i12++) {
            fieldElementSquare4 = fieldElementSquare4.square();
        }
        FieldElement fieldElementSquare5 = fieldElementSquare4.multiply(fieldElementMultiply4).square();
        for (int i13 = 1; i13 < 10; i13++) {
            fieldElementSquare5 = fieldElementSquare5.square();
        }
        FieldElement fieldElementMultiply5 = fieldElementSquare5.multiply(fieldElementMultiply3);
        FieldElement fieldElementSquare6 = fieldElementMultiply5.square();
        for (int i14 = 1; i14 < 50; i14++) {
            fieldElementSquare6 = fieldElementSquare6.square();
        }
        FieldElement fieldElementMultiply6 = fieldElementSquare6.multiply(fieldElementMultiply5);
        FieldElement fieldElementSquare7 = fieldElementMultiply6.square();
        for (int i15 = 1; i15 < 100; i15++) {
            fieldElementSquare7 = fieldElementSquare7.square();
        }
        FieldElement fieldElementSquare8 = fieldElementSquare7.multiply(fieldElementMultiply6).square();
        for (int i16 = 1; i16 < 50; i16++) {
            fieldElementSquare8 = fieldElementSquare8.square();
        }
        return multiply(fieldElementSquare8.multiply(fieldElementMultiply5).square().square());
    }

    @Override // net.i2p.crypto.eddsa.math.FieldElement
    public FieldElement square() {
        int[] iArr = this.f16003t;
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
        int i20 = i11 * 2;
        int i21 = i13 * 2;
        int i22 = i14 * 2;
        int i23 = i15 * 2;
        int i24 = i17 * 2;
        int i25 = i15 * 38;
        int i26 = i17 * 38;
        int i27 = i18 * 19;
        int i28 = i19 * 38;
        long j10 = i10;
        long j11 = j10 * j10;
        long j12 = i10 * 2;
        long j13 = i11;
        long j14 = j12 * j13;
        long j15 = i12;
        long j16 = j12 * j15;
        long j17 = i13;
        long j18 = j12 * j17;
        long j19 = i14;
        long j20 = j12 * j19;
        long j21 = i15;
        long j22 = j12 * j21;
        long j23 = i16;
        long j24 = j12 * j23;
        long j25 = i17;
        long j26 = j12 * j25;
        long j27 = i18;
        long j28 = j12 * j27;
        long j29 = i19;
        long j30 = j12 * j29;
        long j31 = i20;
        long j32 = j13 * j31;
        long j33 = j31 * j15;
        long j34 = i21;
        long j35 = j31 * j34;
        long j36 = j31 * j19;
        long j37 = i23;
        long j38 = j31 * j37;
        long j39 = j31 * j23;
        long j40 = i24;
        long j41 = j31 * j40;
        long j42 = j31 * j27;
        long j43 = i28;
        long j44 = j15 * j15;
        long j45 = i12 * 2;
        long j46 = j45 * j17;
        long j47 = j45 * j19;
        long j48 = j45 * j21;
        long j49 = j45 * j23;
        long j50 = j45 * j25;
        long j51 = i27;
        long j52 = j45 * j51;
        long j53 = j15 * j43;
        long j54 = j17 * j34;
        long j55 = j34 * j19;
        long j56 = j34 * j23;
        long j57 = i26;
        long j58 = j19 * j19;
        long j59 = i22;
        long j60 = j59 * j21;
        long j61 = i16 * 19;
        long j62 = j59 * j61;
        long j63 = j19 * j57;
        long j64 = j19 * j43;
        long j65 = ((long) i25) * j21;
        long j66 = j37 * j61;
        long j67 = j37 * j57;
        long j68 = j61 * j23;
        long j69 = j23 * j57;
        long j70 = j11 + (j31 * j43) + j52 + (j34 * j57) + j62 + j65;
        long j71 = j14 + j53 + (j34 * j51) + j63 + j66;
        long j72 = j18 + j33 + j64 + (j37 * j51) + j69;
        long j73 = j20 + j35 + j44 + (j37 * j43) + (((long) (i16 * 2)) * j51) + (j57 * j25);
        long j74 = (j70 + 33554432) >> 26;
        long j75 = j71 + j74;
        long j76 = j70 - (j74 << 26);
        long j77 = (j73 + 33554432) >> 26;
        long j78 = j22 + j36 + j46 + (j23 * j43) + (j40 * j51) + j77;
        long j79 = (j75 + 16777216) >> 25;
        long j80 = j16 + j32 + (j34 * j43) + (j59 * j51) + j67 + j68 + j79;
        long j81 = j75 - (j79 << 25);
        long j82 = (j78 + 16777216) >> 25;
        long j83 = j24 + j38 + j47 + j54 + (j40 * j43) + (j51 * j27) + j82;
        long j84 = j78 - (j82 << 25);
        long j85 = (j80 + 33554432) >> 26;
        long j86 = j72 + j85;
        long j87 = j80 - (j85 << 26);
        long j88 = (j83 + 33554432) >> 26;
        long j89 = j26 + j39 + j48 + j55 + (j27 * j43) + j88;
        long j90 = (j86 + 16777216) >> 25;
        long j91 = (j73 - (j77 << 26)) + j90;
        long j92 = (j89 + 16777216) >> 25;
        long j93 = j28 + j41 + j49 + (j34 * j37) + j58 + (j43 * j29) + j92;
        long j94 = j89 - (j92 << 25);
        long j95 = (j91 + 33554432) >> 26;
        long j96 = j84 + j95;
        long j97 = j91 - (j95 << 26);
        long j98 = (j93 + 33554432) >> 26;
        long j99 = j30 + j42 + j50 + j56 + j60 + j98;
        long j100 = j93 - (j98 << 26);
        long j101 = (j99 + 16777216) >> 25;
        long j102 = (19 * j101) + j76;
        long j103 = (j102 + 33554432) >> 26;
        return new Ed25519FieldElement(this.f16001f, new int[]{(int) (j102 - (j103 << 26)), (int) (j81 + j103), (int) j87, (int) (j86 - (j90 << 25)), (int) j97, (int) j96, (int) (j83 - (j88 << 26)), (int) j94, (int) j100, (int) (j99 - (j101 << 25))});
    }

    @Override // net.i2p.crypto.eddsa.math.FieldElement
    public FieldElement squareAndDouble() {
        int[] iArr = this.f16003t;
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
        int i20 = i11 * 2;
        int i21 = i13 * 2;
        int i22 = i14 * 2;
        int i23 = i15 * 2;
        int i24 = i17 * 2;
        int i25 = i15 * 38;
        int i26 = i17 * 38;
        int i27 = i18 * 19;
        int i28 = i19 * 38;
        long j10 = i10;
        long j11 = j10 * j10;
        long j12 = i10 * 2;
        long j13 = i11;
        long j14 = j12 * j13;
        long j15 = i12;
        long j16 = j12 * j15;
        long j17 = i13;
        long j18 = j12 * j17;
        long j19 = i14;
        long j20 = j12 * j19;
        long j21 = i15;
        long j22 = j12 * j21;
        long j23 = i16;
        long j24 = j12 * j23;
        long j25 = i17;
        long j26 = j12 * j25;
        long j27 = i18;
        long j28 = j12 * j27;
        long j29 = i19;
        long j30 = j12 * j29;
        long j31 = i20;
        long j32 = j13 * j31;
        long j33 = j31 * j15;
        long j34 = i21;
        long j35 = j31 * j34;
        long j36 = j31 * j19;
        long j37 = i23;
        long j38 = j31 * j37;
        long j39 = j31 * j23;
        long j40 = i24;
        long j41 = j31 * j40;
        long j42 = j31 * j27;
        long j43 = i28;
        long j44 = j15 * j15;
        long j45 = i12 * 2;
        long j46 = j45 * j17;
        long j47 = j45 * j19;
        long j48 = j45 * j21;
        long j49 = j45 * j23;
        long j50 = j45 * j25;
        long j51 = i27;
        long j52 = j45 * j51;
        long j53 = j15 * j43;
        long j54 = j17 * j34;
        long j55 = j34 * j19;
        long j56 = j34 * j23;
        long j57 = i26;
        long j58 = j19 * j19;
        long j59 = i22;
        long j60 = j59 * j21;
        long j61 = i16 * 19;
        long j62 = j59 * j61;
        long j63 = j19 * j57;
        long j64 = j19 * j43;
        long j65 = ((long) i25) * j21;
        long j66 = j37 * j61;
        long j67 = j61 * j23;
        long j68 = j23 * j57;
        long j69 = j11 + (j31 * j43) + j52 + (j34 * j57) + j62 + j65;
        long j70 = j14 + j53 + (j34 * j51) + j63 + j66;
        long j71 = j16 + j32 + (j34 * j43) + (j59 * j51) + (j37 * j57) + j67;
        long j72 = j18 + j33 + j64 + (j37 * j51) + j68;
        long j73 = j20 + j35 + j44 + (j37 * j43) + (((long) (i16 * 2)) * j51) + (j57 * j25);
        long j74 = j22 + j36 + j46 + (j23 * j43) + (j40 * j51);
        long j75 = j24 + j38 + j47 + j54 + (j40 * j43) + (j51 * j27);
        long j76 = j26 + j39 + j48 + j55 + (j27 * j43);
        long j77 = j28 + j41 + j49 + (j34 * j37) + j58 + (j43 * j29);
        long j78 = j30 + j42 + j50 + j56 + j60;
        long j79 = j69 + j69;
        long j80 = j73 + j73;
        long j81 = (j79 + 33554432) >> 26;
        long j82 = j70 + j70 + j81;
        long j83 = j79 - (j81 << 26);
        long j84 = (j80 + 33554432) >> 26;
        long j85 = j74 + j74 + j84;
        long j86 = (j82 + 16777216) >> 25;
        long j87 = j71 + j71 + j86;
        long j88 = j82 - (j86 << 25);
        long j89 = (j85 + 16777216) >> 25;
        long j90 = j75 + j75 + j89;
        long j91 = j85 - (j89 << 25);
        long j92 = (j87 + 33554432) >> 26;
        long j93 = j72 + j72 + j92;
        long j94 = j87 - (j92 << 26);
        long j95 = (j90 + 33554432) >> 26;
        long j96 = j76 + j76 + j95;
        long j97 = (j93 + 16777216) >> 25;
        long j98 = (j80 - (j84 << 26)) + j97;
        long j99 = (j96 + 16777216) >> 25;
        long j100 = j77 + j77 + j99;
        long j101 = j96 - (j99 << 25);
        long j102 = (j98 + 33554432) >> 26;
        long j103 = j91 + j102;
        long j104 = j98 - (j102 << 26);
        long j105 = (j100 + 33554432) >> 26;
        long j106 = j78 + j78 + j105;
        long j107 = j100 - (j105 << 26);
        long j108 = (j106 + 16777216) >> 25;
        long j109 = (19 * j108) + j83;
        long j110 = (j109 + 33554432) >> 26;
        return new Ed25519FieldElement(this.f16001f, new int[]{(int) (j109 - (j110 << 26)), (int) (j88 + j110), (int) j94, (int) (j93 - (j97 << 25)), (int) j104, (int) j103, (int) (j90 - (j95 << 26)), (int) j101, (int) j107, (int) (j106 - (j108 << 25))});
    }

    @Override // net.i2p.crypto.eddsa.math.FieldElement
    public FieldElement subtract(FieldElement fieldElement) {
        int[] iArr = ((Ed25519FieldElement) fieldElement).f16003t;
        int[] iArr2 = new int[10];
        for (int i10 = 0; i10 < 10; i10++) {
            iArr2[i10] = this.f16003t[i10] - iArr[i10];
        }
        return new Ed25519FieldElement(this.f16001f, iArr2);
    }

    public String toString() {
        return "[Ed25519FieldElement val=" + Utils.bytesToHex(toByteArray()) + "]";
    }
}
