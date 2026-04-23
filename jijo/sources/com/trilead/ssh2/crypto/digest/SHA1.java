package com.trilead.ssh2.crypto.digest;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.fb1;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class SHA1 implements Digest {
    private int H0;
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private long currentLen;
    private int currentPos;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int[] f12285w = new int[80];

    public SHA1() {
        reset();
    }

    private final void perform() {
        for (int i10 = 16; i10 < 80; i10++) {
            int[] iArr = this.f12285w;
            int i11 = ((iArr[i10 - 3] ^ iArr[i10 - 8]) ^ iArr[i10 - 14]) ^ iArr[i10 - 16];
            iArr[i10] = (i11 >>> 31) | (i11 << 1);
        }
        int i12 = this.H0;
        int i13 = this.H1;
        int i14 = this.H2;
        int i15 = this.H3;
        int i16 = this.H4;
        int i17 = ((i12 << 5) | (i12 >>> 27)) + ((i13 & i14) | ((~i13) & i15));
        int[] iArr2 = this.f12285w;
        int iE = fb1.e(i17, iArr2[0], 1518500249, i16);
        int i18 = (i13 << 30) | (i13 >>> 2);
        int iE2 = fb1.e(((iE << 5) | (iE >>> 27)) + ((i12 & i18) | ((~i12) & i14)), iArr2[1], 1518500249, i15);
        int i19 = (i12 << 30) | (i12 >>> 2);
        int iE3 = fb1.e(((iE2 << 5) | (iE2 >>> 27)) + (((~iE) & i18) | (iE & i19)), iArr2[2], 1518500249, i14);
        int i20 = (iE >>> 2) | (iE << 30);
        int iE4 = fb1.e(((iE3 << 5) | (iE3 >>> 27)) + ((iE2 & i20) | ((~iE2) & i19)), iArr2[3], 1518500249, i18);
        int i21 = (iE2 << 30) | (iE2 >>> 2);
        int iE5 = fb1.e(((iE4 << 5) | (iE4 >>> 27)) + (((~iE3) & i20) | (iE3 & i21)), iArr2[4], 1518500249, i19);
        int i22 = (iE3 << 30) | (iE3 >>> 2);
        int iE6 = fb1.e(((iE5 << 5) | (iE5 >>> 27)) + ((iE4 & i22) | ((~iE4) & i21)), iArr2[5], 1518500249, i20);
        int i23 = (iE4 >>> 2) | (iE4 << 30);
        int iE7 = fb1.e(((iE6 << 5) | (iE6 >>> 27)) + ((iE5 & i23) | ((~iE5) & i22)), iArr2[6], 1518500249, i21);
        int i24 = (iE5 >>> 2) | (iE5 << 30);
        int iE8 = fb1.e(((iE7 << 5) | (iE7 >>> 27)) + ((iE6 & i24) | ((~iE6) & i23)), iArr2[7], 1518500249, i22);
        int i25 = (iE6 >>> 2) | (iE6 << 30);
        int iE9 = fb1.e(((iE8 << 5) | (iE8 >>> 27)) + ((iE7 & i25) | ((~iE7) & i24)), iArr2[8], 1518500249, i23);
        int i26 = (iE7 >>> 2) | (iE7 << 30);
        int iE10 = fb1.e(((iE9 << 5) | (iE9 >>> 27)) + ((iE8 & i26) | ((~iE8) & i25)), iArr2[9], 1518500249, i24);
        int i27 = (iE8 >>> 2) | (iE8 << 30);
        int iE11 = fb1.e(((iE10 << 5) | (iE10 >>> 27)) + ((iE9 & i27) | ((~iE9) & i26)), iArr2[10], 1518500249, i25);
        int i28 = (iE9 >>> 2) | (iE9 << 30);
        int iE12 = fb1.e(((iE11 << 5) | (iE11 >>> 27)) + ((iE10 & i28) | ((~iE10) & i27)), iArr2[11], 1518500249, i26);
        int i29 = (iE10 >>> 2) | (iE10 << 30);
        int iE13 = fb1.e(((iE12 << 5) | (iE12 >>> 27)) + ((iE11 & i29) | ((~iE11) & i28)), iArr2[12], 1518500249, i27);
        int i30 = (iE11 >>> 2) | (iE11 << 30);
        int iE14 = fb1.e(((iE13 << 5) | (iE13 >>> 27)) + ((iE12 & i30) | ((~iE12) & i29)), iArr2[13], 1518500249, i28);
        int i31 = (iE12 >>> 2) | (iE12 << 30);
        int iE15 = fb1.e(((iE14 << 5) | (iE14 >>> 27)) + ((iE13 & i31) | ((~iE13) & i30)), iArr2[14], 1518500249, i29);
        int i32 = (iE13 >>> 2) | (iE13 << 30);
        int iE16 = fb1.e(((iE15 << 5) | (iE15 >>> 27)) + ((iE14 & i32) | ((~iE14) & i31)), iArr2[15], 1518500249, i30);
        int i33 = (iE14 >>> 2) | (iE14 << 30);
        int iE17 = fb1.e(((iE16 << 5) | (iE16 >>> 27)) + ((iE15 & i33) | ((~iE15) & i32)), iArr2[16], 1518500249, i31);
        int i34 = (iE15 >>> 2) | (iE15 << 30);
        int iE18 = fb1.e(((iE17 << 5) | (iE17 >>> 27)) + ((iE16 & i34) | ((~iE16) & i33)), iArr2[17], 1518500249, i32);
        int i35 = (iE16 >>> 2) | (iE16 << 30);
        int iE19 = fb1.e(((iE18 << 5) | (iE18 >>> 27)) + ((iE17 & i35) | ((~iE17) & i34)), iArr2[18], 1518500249, i33);
        int i36 = (iE17 >>> 2) | (iE17 << 30);
        int iE20 = fb1.e(((iE19 << 5) | (iE19 >>> 27)) + ((iE18 & i36) | ((~iE18) & i35)), iArr2[19], 1518500249, i34);
        int i37 = (iE18 << 30) | (iE18 >>> 2);
        int iE21 = fb1.e(((iE20 << 5) | (iE20 >>> 27)) + ((iE19 ^ i37) ^ i36), iArr2[20], 1859775393, i35);
        int i38 = (iE19 >>> 2) | (iE19 << 30);
        int iE22 = fb1.e(((iE21 << 5) | (iE21 >>> 27)) + ((iE20 ^ i38) ^ i37), iArr2[21], 1859775393, i36);
        int i39 = (iE20 >>> 2) | (iE20 << 30);
        int iE23 = fb1.e(((iE22 << 5) | (iE22 >>> 27)) + ((iE21 ^ i39) ^ i38), iArr2[22], 1859775393, i37);
        int i40 = (iE21 >>> 2) | (iE21 << 30);
        int iE24 = fb1.e(((iE23 << 5) | (iE23 >>> 27)) + ((iE22 ^ i40) ^ i39), iArr2[23], 1859775393, i38);
        int i41 = (iE22 >>> 2) | (iE22 << 30);
        int iE25 = fb1.e(((iE24 << 5) | (iE24 >>> 27)) + ((iE23 ^ i41) ^ i40), iArr2[24], 1859775393, i39);
        int i42 = (iE23 >>> 2) | (iE23 << 30);
        int iE26 = fb1.e(((iE25 << 5) | (iE25 >>> 27)) + ((iE24 ^ i42) ^ i41), iArr2[25], 1859775393, i40);
        int i43 = (iE24 >>> 2) | (iE24 << 30);
        int iE27 = fb1.e(((iE26 << 5) | (iE26 >>> 27)) + ((iE25 ^ i43) ^ i42), iArr2[26], 1859775393, i41);
        int i44 = (iE25 >>> 2) | (iE25 << 30);
        int iE28 = fb1.e(((iE27 << 5) | (iE27 >>> 27)) + ((iE26 ^ i44) ^ i43), iArr2[27], 1859775393, i42);
        int i45 = (iE26 >>> 2) | (iE26 << 30);
        int iE29 = fb1.e(((iE28 << 5) | (iE28 >>> 27)) + ((iE27 ^ i45) ^ i44), iArr2[28], 1859775393, i43);
        int i46 = (iE27 >>> 2) | (iE27 << 30);
        int iE30 = fb1.e(((iE29 << 5) | (iE29 >>> 27)) + ((iE28 ^ i46) ^ i45), iArr2[29], 1859775393, i44);
        int i47 = (iE28 >>> 2) | (iE28 << 30);
        int iE31 = fb1.e(((iE30 << 5) | (iE30 >>> 27)) + ((iE29 ^ i47) ^ i46), iArr2[30], 1859775393, i45);
        int i48 = (iE29 >>> 2) | (iE29 << 30);
        int iE32 = fb1.e(((iE31 << 5) | (iE31 >>> 27)) + ((iE30 ^ i48) ^ i47), iArr2[31], 1859775393, i46);
        int i49 = (iE30 >>> 2) | (iE30 << 30);
        int iE33 = fb1.e(((iE32 << 5) | (iE32 >>> 27)) + ((iE31 ^ i49) ^ i48), iArr2[32], 1859775393, i47);
        int i50 = (iE31 >>> 2) | (iE31 << 30);
        int iE34 = fb1.e(((iE33 << 5) | (iE33 >>> 27)) + ((iE32 ^ i50) ^ i49), iArr2[33], 1859775393, i48);
        int i51 = (iE32 >>> 2) | (iE32 << 30);
        int iE35 = fb1.e(((iE34 << 5) | (iE34 >>> 27)) + ((iE33 ^ i51) ^ i50), iArr2[34], 1859775393, i49);
        int i52 = (iE33 >>> 2) | (iE33 << 30);
        int iE36 = fb1.e(((iE35 << 5) | (iE35 >>> 27)) + ((iE34 ^ i52) ^ i51), iArr2[35], 1859775393, i50);
        int i53 = (iE34 >>> 2) | (iE34 << 30);
        int iE37 = fb1.e(((iE36 << 5) | (iE36 >>> 27)) + ((iE35 ^ i53) ^ i52), iArr2[36], 1859775393, i51);
        int i54 = (iE35 >>> 2) | (iE35 << 30);
        int iE38 = fb1.e(((iE37 << 5) | (iE37 >>> 27)) + ((iE36 ^ i54) ^ i53), iArr2[37], 1859775393, i52);
        int i55 = (iE36 >>> 2) | (iE36 << 30);
        int iE39 = fb1.e(((iE38 << 5) | (iE38 >>> 27)) + ((iE37 ^ i55) ^ i54), iArr2[38], 1859775393, i53);
        int i56 = (iE37 >>> 2) | (iE37 << 30);
        int iE40 = fb1.e(((iE39 << 5) | (iE39 >>> 27)) + ((iE38 ^ i56) ^ i55), iArr2[39], 1859775393, i54);
        int i57 = (iE38 >>> 2) | (iE38 << 30);
        int iE41 = fb1.e(((iE40 << 5) | (iE40 >>> 27)) + ((iE39 & i57) | (iE39 & i56) | (i57 & i56)), iArr2[40], -1894007588, i55);
        int i58 = (iE39 >>> 2) | (iE39 << 30);
        int iE42 = fb1.e(((iE41 << 5) | (iE41 >>> 27)) + ((iE40 & i58) | (iE40 & i57) | (i58 & i57)), iArr2[41], -1894007588, i56);
        int i59 = (iE40 >>> 2) | (iE40 << 30);
        int iE43 = fb1.e(((iE42 << 5) | (iE42 >>> 27)) + ((iE41 & i59) | (iE41 & i58) | (i59 & i58)), iArr2[42], -1894007588, i57);
        int i60 = (iE41 >>> 2) | (iE41 << 30);
        int iE44 = fb1.e(((iE43 << 5) | (iE43 >>> 27)) + ((iE42 & i60) | (iE42 & i59) | (i60 & i59)), iArr2[43], -1894007588, i58);
        int i61 = (iE42 >>> 2) | (iE42 << 30);
        int iE45 = fb1.e(((iE44 << 5) | (iE44 >>> 27)) + ((iE43 & i61) | (iE43 & i60) | (i61 & i60)), iArr2[44], -1894007588, i59);
        int i62 = (iE43 >>> 2) | (iE43 << 30);
        int iE46 = fb1.e(((iE45 << 5) | (iE45 >>> 27)) + ((iE44 & i62) | (iE44 & i61) | (i62 & i61)), iArr2[45], -1894007588, i60);
        int i63 = (iE44 >>> 2) | (iE44 << 30);
        int iE47 = fb1.e(((iE46 << 5) | (iE46 >>> 27)) + ((iE45 & i63) | (iE45 & i62) | (i63 & i62)), iArr2[46], -1894007588, i61);
        int i64 = (iE45 >>> 2) | (iE45 << 30);
        int iE48 = fb1.e(((iE47 << 5) | (iE47 >>> 27)) + ((iE46 & i64) | (iE46 & i63) | (i64 & i63)), iArr2[47], -1894007588, i62);
        int i65 = (iE46 >>> 2) | (iE46 << 30);
        int iE49 = fb1.e(((iE48 << 5) | (iE48 >>> 27)) + ((iE47 & i65) | (iE47 & i64) | (i65 & i64)), iArr2[48], -1894007588, i63);
        int i66 = (iE47 >>> 2) | (iE47 << 30);
        int iE50 = fb1.e(((iE49 << 5) | (iE49 >>> 27)) + ((iE48 & i66) | (iE48 & i65) | (i66 & i65)), iArr2[49], -1894007588, i64);
        int i67 = (iE48 >>> 2) | (iE48 << 30);
        int iE51 = fb1.e(((iE50 << 5) | (iE50 >>> 27)) + ((iE49 & i67) | (iE49 & i66) | (i67 & i66)), iArr2[50], -1894007588, i65);
        int i68 = (iE49 >>> 2) | (iE49 << 30);
        int iE52 = fb1.e(((iE51 << 5) | (iE51 >>> 27)) + ((iE50 & i68) | (iE50 & i67) | (i68 & i67)), iArr2[51], -1894007588, i66);
        int i69 = (iE50 >>> 2) | (iE50 << 30);
        int iE53 = fb1.e(((iE52 << 5) | (iE52 >>> 27)) + ((iE51 & i69) | (iE51 & i68) | (i69 & i68)), iArr2[52], -1894007588, i67);
        int i70 = (iE51 >>> 2) | (iE51 << 30);
        int iE54 = fb1.e(((iE53 << 5) | (iE53 >>> 27)) + ((iE52 & i70) | (iE52 & i69) | (i70 & i69)), iArr2[53], -1894007588, i68);
        int i71 = (iE52 >>> 2) | (iE52 << 30);
        int iE55 = fb1.e(((iE54 << 5) | (iE54 >>> 27)) + ((iE53 & i71) | (iE53 & i70) | (i71 & i70)), iArr2[54], -1894007588, i69);
        int i72 = (iE53 >>> 2) | (iE53 << 30);
        int i73 = (((i70 + ((iE55 << 5) | (iE55 >>> 27))) + (((iE54 & i72) | (iE54 & i71)) | (i72 & i71))) + iArr2[55]) - 1894007588;
        int i74 = (iE54 >>> 2) | (iE54 << 30);
        int iE56 = fb1.e(((i73 << 5) | (i73 >>> 27)) + ((iE55 & i74) | (iE55 & i72) | (i74 & i72)), iArr2[56], -1894007588, i71);
        int i75 = (iE55 >>> 2) | (iE55 << 30);
        int iE57 = fb1.e(((iE56 << 5) | (iE56 >>> 27)) + ((i73 & i75) | (i73 & i74) | (i75 & i74)), iArr2[57], -1894007588, i72);
        int i76 = (i73 >>> 2) | (i73 << 30);
        int iE58 = fb1.e(((iE57 << 5) | (iE57 >>> 27)) + ((iE56 & i76) | (iE56 & i75) | (i76 & i75)), iArr2[58], -1894007588, i74);
        int i77 = (iE56 >>> 2) | (iE56 << 30);
        int iE59 = fb1.e(((iE58 << 5) | (iE58 >>> 27)) + ((iE57 & i77) | (iE57 & i76) | (i77 & i76)), iArr2[59], -1894007588, i75);
        int i78 = (iE57 >>> 2) | (iE57 << 30);
        int iE60 = fb1.e(((iE59 << 5) | (iE59 >>> 27)) + ((iE58 ^ i78) ^ i77), iArr2[60], -899497514, i76);
        int i79 = (iE58 >>> 2) | (iE58 << 30);
        int iE61 = fb1.e(((iE60 << 5) | (iE60 >>> 27)) + ((iE59 ^ i79) ^ i78), iArr2[61], -899497514, i77);
        int i80 = (iE59 >>> 2) | (iE59 << 30);
        int iE62 = fb1.e(((iE61 << 5) | (iE61 >>> 27)) + ((iE60 ^ i80) ^ i79), iArr2[62], -899497514, i78);
        int i81 = (iE60 >>> 2) | (iE60 << 30);
        int iE63 = fb1.e(((iE62 << 5) | (iE62 >>> 27)) + ((iE61 ^ i81) ^ i80), iArr2[63], -899497514, i79);
        int i82 = (iE61 >>> 2) | (iE61 << 30);
        int iE64 = fb1.e(((iE63 << 5) | (iE63 >>> 27)) + ((iE62 ^ i82) ^ i81), iArr2[64], -899497514, i80);
        int i83 = (iE62 >>> 2) | (iE62 << 30);
        int iE65 = fb1.e(((iE64 << 5) | (iE64 >>> 27)) + ((iE63 ^ i83) ^ i82), iArr2[65], -899497514, i81);
        int i84 = (iE63 >>> 2) | (iE63 << 30);
        int iE66 = fb1.e(((iE65 << 5) | (iE65 >>> 27)) + ((iE64 ^ i84) ^ i83), iArr2[66], -899497514, i82);
        int i85 = (iE64 >>> 2) | (iE64 << 30);
        int iE67 = fb1.e(((iE66 << 5) | (iE66 >>> 27)) + ((iE65 ^ i85) ^ i84), iArr2[67], -899497514, i83);
        int i86 = (iE65 >>> 2) | (iE65 << 30);
        int iE68 = fb1.e(((iE67 << 5) | (iE67 >>> 27)) + ((iE66 ^ i86) ^ i85), iArr2[68], -899497514, i84);
        int i87 = (iE66 >>> 2) | (iE66 << 30);
        int iE69 = fb1.e(((iE68 << 5) | (iE68 >>> 27)) + ((iE67 ^ i87) ^ i86), iArr2[69], -899497514, i85);
        int i88 = (iE67 >>> 2) | (iE67 << 30);
        int iE70 = fb1.e(((iE69 << 5) | (iE69 >>> 27)) + ((iE68 ^ i88) ^ i87), iArr2[70], -899497514, i86);
        int i89 = (iE68 >>> 2) | (iE68 << 30);
        int iE71 = fb1.e(((iE70 << 5) | (iE70 >>> 27)) + ((iE69 ^ i89) ^ i88), iArr2[71], -899497514, i87);
        int i90 = (iE69 >>> 2) | (iE69 << 30);
        int iE72 = fb1.e(((iE71 << 5) | (iE71 >>> 27)) + ((iE70 ^ i90) ^ i89), iArr2[72], -899497514, i88);
        int i91 = (iE70 >>> 2) | (iE70 << 30);
        int iE73 = fb1.e(((iE72 << 5) | (iE72 >>> 27)) + ((iE71 ^ i91) ^ i90), iArr2[73], -899497514, i89);
        int i92 = (iE71 >>> 2) | (iE71 << 30);
        int iE74 = fb1.e(((iE73 << 5) | (iE73 >>> 27)) + ((iE72 ^ i92) ^ i91), iArr2[74], -899497514, i90);
        int i93 = (iE72 >>> 2) | (iE72 << 30);
        int iE75 = fb1.e(((iE74 << 5) | (iE74 >>> 27)) + ((iE73 ^ i93) ^ i92), iArr2[75], -899497514, i91);
        int i94 = (iE73 >>> 2) | (iE73 << 30);
        int iE76 = fb1.e(((iE75 << 5) | (iE75 >>> 27)) + ((iE74 ^ i94) ^ i93), iArr2[76], -899497514, i92);
        int i95 = (iE74 >>> 2) | (iE74 << 30);
        int iE77 = fb1.e(((iE76 << 5) | (iE76 >>> 27)) + ((iE75 ^ i95) ^ i94), iArr2[77], -899497514, i93);
        int i96 = (iE75 >>> 2) | (iE75 << 30);
        int iE78 = fb1.e(((iE77 << 5) | (iE77 >>> 27)) + ((iE76 ^ i96) ^ i95), iArr2[78], -899497514, i94);
        int i97 = (iE76 >>> 2) | (iE76 << 30);
        this.H0 = i12 + fb1.e(((iE78 << 5) | (iE78 >>> 27)) + ((iE77 ^ i97) ^ i96), iArr2[79], -899497514, i95);
        this.H1 = i13 + iE78;
        this.H2 = i14 + ((iE77 << 30) | (iE77 >>> 2));
        this.H3 = i15 + i97;
        this.H4 = i16 + i96;
    }

    private final void putInt(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    private static final String toHexString(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < bArr.length; i10++) {
            stringBuffer.append("0123456789ABCDEF".charAt((bArr[i10] >> 4) & 15));
            stringBuffer.append("0123456789ABCDEF".charAt(bArr[i10] & 15));
        }
        return stringBuffer.toString();
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final void digest(byte[] bArr) {
        digest(bArr, 0);
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final int getDigestLength() {
        return 20;
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final void reset() {
        this.H0 = 1732584193;
        this.H1 = -271733879;
        this.H2 = -1732584194;
        this.H3 = 271733878;
        this.H4 = -1009589776;
        this.currentPos = 0;
        this.currentLen = 0L;
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final void update(byte[] bArr) {
        update(bArr, 0, bArr.length);
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final void digest(byte[] bArr, int i10) {
        int i11 = this.currentPos;
        int i12 = i11 >> 2;
        int[] iArr = this.f12285w;
        iArr[i12] = ((iArr[i12] << 8) | NotificationCompat.FLAG_HIGH_PRIORITY) << ((3 - (i11 & 3)) << 3);
        int i13 = (i11 & (-4)) + 4;
        this.currentPos = i13;
        if (i13 == 64) {
            this.currentPos = 0;
            perform();
        } else if (i13 == 60) {
            this.currentPos = 0;
            iArr[15] = 0;
            perform();
        }
        for (int i14 = this.currentPos >> 2; i14 < 14; i14++) {
            this.f12285w[i14] = 0;
        }
        int[] iArr2 = this.f12285w;
        long j10 = this.currentLen;
        iArr2[14] = (int) (j10 >> 32);
        iArr2[15] = (int) j10;
        perform();
        putInt(bArr, i10, this.H0);
        putInt(bArr, i10 + 4, this.H1);
        putInt(bArr, i10 + 8, this.H2);
        putInt(bArr, i10 + 12, this.H3);
        putInt(bArr, i10 + 16, this.H4);
        reset();
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final void update(byte[] bArr, int i10, int i11) {
        int i12;
        int i13 = i11;
        if (i13 >= 4) {
            int i14 = this.currentPos;
            int i15 = i14 >> 2;
            int i16 = i14 & 3;
            if (i16 == 0) {
                int i17 = i10 + 4;
                this.f12285w[i15] = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8) | (bArr[i10 + 3] & 255);
                i13 -= 4;
                int i18 = i14 + 4;
                this.currentPos = i18;
                this.currentLen += 32;
                if (i18 == 64) {
                    perform();
                    this.currentPos = 0;
                }
                i12 = i17;
            } else if (i16 == 1) {
                int[] iArr = this.f12285w;
                i12 = i10 + 3;
                iArr[i15] = (bArr[i10 + 2] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10] & 255) << 16) | (iArr[i15] << 24);
                i13 -= 3;
                int i19 = i14 + 3;
                this.currentPos = i19;
                this.currentLen += 24;
                if (i19 == 64) {
                    perform();
                    this.currentPos = 0;
                }
            } else if (i16 == 2) {
                int[] iArr2 = this.f12285w;
                int i20 = i10 + 2;
                iArr2[i15] = (iArr2[i15] << 16) | (bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8);
                i13 -= 2;
                int i21 = i14 + 2;
                this.currentPos = i21;
                this.currentLen += 16;
                if (i21 == 64) {
                    perform();
                    this.currentPos = 0;
                }
                i12 = i20;
            } else if (i16 != 3) {
                i12 = i10;
            } else {
                int[] iArr3 = this.f12285w;
                i12 = i10 + 1;
                iArr3[i15] = (bArr[i10] & 255) | (iArr3[i15] << 8);
                i13--;
                int i22 = i14 + 1;
                this.currentPos = i22;
                this.currentLen += 8;
                if (i22 == 64) {
                    perform();
                    this.currentPos = 0;
                }
            }
            while (i13 >= 8) {
                int[] iArr4 = this.f12285w;
                int i23 = this.currentPos;
                int i24 = i12 + 4;
                iArr4[i23 >> 2] = ((bArr[i12 + 1] & 255) << 16) | ((bArr[i12] & 255) << 24) | ((bArr[i12 + 2] & 255) << 8) | (bArr[i12 + 3] & 255);
                int i25 = i23 + 4;
                this.currentPos = i25;
                if (i25 == 64) {
                    perform();
                    this.currentPos = 0;
                }
                int[] iArr5 = this.f12285w;
                int i26 = this.currentPos;
                int i27 = i12 + 7;
                int i28 = ((bArr[i12 + 5] & 255) << 16) | ((bArr[i24] & 255) << 24) | ((bArr[i12 + 6] & 255) << 8);
                i12 += 8;
                iArr5[i26 >> 2] = i28 | (bArr[i27] & 255);
                int i29 = i26 + 4;
                this.currentPos = i29;
                if (i29 == 64) {
                    perform();
                    this.currentPos = 0;
                }
                this.currentLen += 64;
                i13 -= 8;
            }
            while (i13 < 0) {
                int[] iArr6 = this.f12285w;
                int i30 = this.currentPos;
                int i31 = i12 + 3;
                int i32 = ((bArr[i12 + 1] & 255) << 16) | ((bArr[i12] & 255) << 24) | ((bArr[i12 + 2] & 255) << 8);
                i12 += 4;
                iArr6[i30 >> 2] = i32 | (bArr[i31] & 255);
                i13 -= 4;
                int i33 = i30 + 4;
                this.currentPos = i33;
                this.currentLen += 32;
                if (i33 == 64) {
                    perform();
                    this.currentPos = 0;
                }
            }
        } else {
            i12 = i10;
        }
        while (i13 > 0) {
            int i34 = this.currentPos;
            int i35 = i34 >> 2;
            int[] iArr7 = this.f12285w;
            int i36 = i12 + 1;
            iArr7[i35] = (iArr7[i35] << 8) | (bArr[i12] & 255);
            this.currentLen += 8;
            int i37 = i34 + 1;
            this.currentPos = i37;
            if (i37 == 64) {
                perform();
                this.currentPos = 0;
            }
            i13--;
            i12 = i36;
        }
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final void update(byte b10) {
        int i10 = this.currentPos;
        int i11 = i10 >> 2;
        int[] iArr = this.f12285w;
        iArr[i11] = (b10 & 255) | (iArr[i11] << 8);
        this.currentLen += 8;
        int i12 = i10 + 1;
        this.currentPos = i12;
        if (i12 == 64) {
            perform();
            this.currentPos = 0;
        }
    }
}
