package org.jasypt.contrib.org.apache.commons.codec_1_3.binary;

import org.jasypt.contrib.org.apache.commons.codec_1_3.BinaryDecoder;
import org.jasypt.contrib.org.apache.commons.codec_1_3.BinaryEncoder;
import org.jasypt.contrib.org.apache.commons.codec_1_3.DecoderException;
import org.jasypt.contrib.org.apache.commons.codec_1_3.EncoderException;

/* JADX INFO: loaded from: classes.dex */
public class Base64 implements BinaryEncoder, BinaryDecoder {
    static final int CHUNK_SIZE = 76;
    static final int EIGHTBIT = 8;
    static final int FOURBYTE = 4;
    static final int LOOKUPLENGTH = 64;
    static final byte PAD = 61;
    static final int SIGN = -128;
    static final int SIXTEENBIT = 16;
    static final int TWENTYFOURBITGROUP = 24;
    static final byte[] CHUNK_SEPARATOR = "\r\n".getBytes();
    static final int BASELENGTH = 255;
    private static byte[] base64Alphabet = new byte[BASELENGTH];
    private static byte[] lookUpBase64Alphabet = new byte[64];

    static {
        int i10 = 0;
        for (int i11 = 0; i11 < BASELENGTH; i11++) {
            base64Alphabet[i11] = -1;
        }
        for (int i12 = 90; i12 >= 65; i12--) {
            base64Alphabet[i12] = (byte) (i12 - 65);
        }
        for (int i13 = 122; i13 >= 97; i13--) {
            base64Alphabet[i13] = (byte) (i13 - 71);
        }
        for (int i14 = 57; i14 >= 48; i14--) {
            base64Alphabet[i14] = (byte) (i14 + 4);
        }
        byte[] bArr = base64Alphabet;
        bArr[43] = 62;
        bArr[47] = 63;
        for (int i15 = 0; i15 <= 25; i15++) {
            lookUpBase64Alphabet[i15] = (byte) (i15 + 65);
        }
        int i16 = 26;
        int i17 = 0;
        while (i16 <= 51) {
            lookUpBase64Alphabet[i16] = (byte) (i17 + 97);
            i16++;
            i17++;
        }
        int i18 = 52;
        while (i18 <= 61) {
            lookUpBase64Alphabet[i18] = (byte) (i10 + 48);
            i18++;
            i10++;
        }
        byte[] bArr2 = lookUpBase64Alphabet;
        bArr2[62] = 43;
        bArr2[63] = 47;
    }

    public static byte[] decodeBase64(byte[] bArr) {
        byte[] bArrDiscardNonBase64 = discardNonBase64(bArr);
        if (bArrDiscardNonBase64.length == 0) {
            return new byte[0];
        }
        int length = bArrDiscardNonBase64.length / 4;
        int length2 = bArrDiscardNonBase64.length;
        while (bArrDiscardNonBase64[length2 - 1] == 61) {
            length2--;
            if (length2 == 0) {
                return new byte[0];
            }
        }
        byte[] bArr2 = new byte[length2 - length];
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 4;
            byte b10 = bArrDiscardNonBase64[i12 + 2];
            byte b11 = bArrDiscardNonBase64[i12 + 3];
            byte[] bArr3 = base64Alphabet;
            byte b12 = bArr3[bArrDiscardNonBase64[i12]];
            byte b13 = bArr3[bArrDiscardNonBase64[i12 + 1]];
            if (b10 != 61 && b11 != 61) {
                byte b14 = bArr3[b10];
                byte b15 = bArr3[b11];
                bArr2[i10] = (byte) ((b12 << 2) | (b13 >> 4));
                bArr2[i10 + 1] = (byte) (((b13 & 15) << 4) | ((b14 >> 2) & 15));
                bArr2[i10 + 2] = (byte) ((b14 << 6) | b15);
            } else if (b10 == 61) {
                bArr2[i10] = (byte) ((b13 >> 4) | (b12 << 2));
            } else if (b11 == 61) {
                byte b16 = bArr3[b10];
                bArr2[i10] = (byte) ((b12 << 2) | (b13 >> 4));
                bArr2[i10 + 1] = (byte) (((b13 & 15) << 4) | ((b16 >> 2) & 15));
            }
            i10 += 3;
        }
        return bArr2;
    }

    public static byte[] discardNonBase64(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i10 = 0;
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if (isBase64(bArr[i11])) {
                bArr2[i10] = bArr[i11];
                i10++;
            }
        }
        byte[] bArr3 = new byte[i10];
        System.arraycopy(bArr2, 0, bArr3, 0, i10);
        return bArr3;
    }

    public static byte[] discardWhitespace(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i10 = 0;
        for (byte b10 : bArr) {
            if (b10 != 9 && b10 != 10 && b10 != 13 && b10 != 32) {
                bArr2[i10] = b10;
                i10++;
            }
        }
        byte[] bArr3 = new byte[i10];
        System.arraycopy(bArr2, 0, bArr3, 0, i10);
        return bArr3;
    }

    public static byte[] encodeBase64(byte[] bArr) {
        return encodeBase64(bArr, false);
    }

    public static byte[] encodeBase64Chunked(byte[] bArr) {
        return encodeBase64(bArr, true);
    }

    public static boolean isArrayByteBase64(byte[] bArr) {
        byte[] bArrDiscardWhitespace = discardWhitespace(bArr);
        if (bArrDiscardWhitespace.length == 0) {
            return true;
        }
        for (byte b10 : bArrDiscardWhitespace) {
            if (!isBase64(b10)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isBase64(byte b10) {
        return b10 == 61 || base64Alphabet[b10] != -1;
    }

    @Override // org.jasypt.contrib.org.apache.commons.codec_1_3.Decoder
    public Object decode(Object obj) throws DecoderException {
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        throw new DecoderException("Parameter supplied to Base64 decode is not a byte[]");
    }

    @Override // org.jasypt.contrib.org.apache.commons.codec_1_3.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        throw new EncoderException("Parameter supplied to Base64 encode is not a byte[]");
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z9) {
        int iCeil;
        int length = bArr.length * 8;
        int i10 = length % 24;
        int i11 = length / 24;
        int length2 = i10 != 0 ? (i11 + 1) * 4 : i11 * 4;
        if (z9) {
            byte[] bArr2 = CHUNK_SEPARATOR;
            iCeil = bArr2.length == 0 ? 0 : (int) Math.ceil(length2 / 76.0f);
            length2 += bArr2.length * iCeil;
        } else {
            iCeil = 0;
        }
        byte[] bArr3 = new byte[length2];
        int i12 = 0;
        int length3 = 0;
        int i13 = 0;
        int length4 = CHUNK_SIZE;
        while (i12 < i11) {
            int i14 = i12 * 3;
            byte b10 = bArr[i14];
            byte b11 = bArr[i14 + 1];
            byte b12 = bArr[i14 + 2];
            byte b13 = (byte) (b11 & 15);
            byte b14 = (byte) (b10 & 3);
            int i15 = b10 & (-128);
            int i16 = b10 >> 2;
            if (i15 != 0) {
                i16 ^= 192;
            }
            byte b15 = (byte) i16;
            int i17 = b11 & (-128);
            int i18 = b11 >> 4;
            if (i17 != 0) {
                i18 ^= 240;
            }
            byte b16 = (byte) i18;
            int i19 = b12 >> 6;
            if ((b12 & (-128)) != 0) {
                i19 ^= 252;
            }
            byte b17 = (byte) i19;
            byte[] bArr4 = lookUpBase64Alphabet;
            bArr3[length3] = bArr4[b15];
            bArr3[length3 + 1] = bArr4[(b14 << 4) | b16];
            bArr3[length3 + 2] = bArr4[(b13 << 2) | b17];
            bArr3[length3 + 3] = bArr4[b12 & 63];
            length3 += 4;
            if (z9 && length3 == length4) {
                byte[] bArr5 = CHUNK_SEPARATOR;
                System.arraycopy(bArr5, 0, bArr3, length3, bArr5.length);
                int i20 = i13 + 1;
                length4 = (bArr5.length * i20) + ((i13 + 2) * CHUNK_SIZE);
                length3 += bArr5.length;
                i13 = i20;
            }
            i12++;
        }
        int i21 = i12 * 3;
        if (i10 == 8) {
            byte b18 = bArr[i21];
            byte b19 = (byte) (b18 & 3);
            int i22 = b18 & (-128);
            int i23 = b18 >> 2;
            if (i22 != 0) {
                i23 ^= 192;
            }
            byte b20 = (byte) i23;
            byte[] bArr6 = lookUpBase64Alphabet;
            bArr3[length3] = bArr6[b20];
            bArr3[length3 + 1] = bArr6[b19 << 4];
            bArr3[length3 + 2] = PAD;
            bArr3[length3 + 3] = PAD;
        } else if (i10 == 16) {
            byte b21 = bArr[i21];
            byte b22 = bArr[i21 + 1];
            byte b23 = (byte) (b22 & 15);
            byte b24 = (byte) (b21 & 3);
            int i24 = b21 & (-128);
            int i25 = b21 >> 2;
            if (i24 != 0) {
                i25 ^= 192;
            }
            byte b25 = (byte) i25;
            int i26 = b22 & (-128);
            int i27 = b22 >> 4;
            if (i26 != 0) {
                i27 ^= 240;
            }
            byte b26 = (byte) i27;
            byte[] bArr7 = lookUpBase64Alphabet;
            bArr3[length3] = bArr7[b25];
            bArr3[length3 + 1] = bArr7[b26 | (b24 << 4)];
            bArr3[length3 + 2] = bArr7[b23 << 2];
            bArr3[length3 + 3] = PAD;
        }
        if (z9 && i13 < iCeil) {
            byte[] bArr8 = CHUNK_SEPARATOR;
            System.arraycopy(bArr8, 0, bArr3, length2 - bArr8.length, bArr8.length);
        }
        return bArr3;
    }

    @Override // org.jasypt.contrib.org.apache.commons.codec_1_3.BinaryDecoder
    public byte[] decode(byte[] bArr) {
        return decodeBase64(bArr);
    }

    @Override // org.jasypt.contrib.org.apache.commons.codec_1_3.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        return encodeBase64(bArr, false);
    }
}
