package org.jasypt.commons;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jasypt.exceptions.EncryptionOperationNotPossibleException;

/* JADX INFO: loaded from: classes.dex */
public final class CommonUtils {
    public static final String STRING_OUTPUT_TYPE_BASE64 = "base64";
    public static final String STRING_OUTPUT_TYPE_HEXADECIMAL = "hexadecimal";
    private static final List STRING_OUTPUT_TYPE_HEXADECIMAL_NAMES = Arrays.asList("HEXADECIMAL", "HEXA", "0X", "HEX", "HEXADEC");
    private static char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private CommonUtils() {
    }

    public static byte[] appendArrays(byte[] bArr, byte[] bArr2) {
        validateNotNull(bArr, "Appended array cannot be null");
        validateNotNull(bArr2, "Appended array cannot be null");
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte[] fromHexadecimal(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() % 2 != 0) {
            throw new EncryptionOperationNotPossibleException();
        }
        try {
            byte[] bArr = new byte[str.length() / 2];
            for (int i10 = 0; i10 < str.length(); i10 += 2) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                stringBuffer.append(str.charAt(i10));
                int i11 = Integer.parseInt(stringBuffer.toString(), 16);
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                stringBuffer2.append(str.charAt(i10 + 1));
                bArr[i10 / 2] = (byte) (((i11 & 255) << 4) + (Integer.parseInt(stringBuffer2.toString(), 16) & 255));
            }
            return bArr;
        } catch (Exception unused) {
            throw new EncryptionOperationNotPossibleException();
        }
    }

    public static Boolean getStandardBooleanValue(String str) {
        if (str == null) {
            return null;
        }
        String upperCase = str.toUpperCase();
        if ("TRUE".equals(upperCase) || "ON".equals(upperCase) || "YES".equals(upperCase)) {
            return Boolean.TRUE;
        }
        if ("FALSE".equals(upperCase) || "OFF".equals(upperCase) || "NO".equals(upperCase)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static String getStandardStringOutputType(String str) {
        if (str == null) {
            return null;
        }
        return STRING_OUTPUT_TYPE_HEXADECIMAL_NAMES.contains(str.toUpperCase()) ? STRING_OUTPUT_TYPE_HEXADECIMAL : "base64";
    }

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean isNotEmpty(String str) {
        return (str == null || str.length() == 0) ? false : true;
    }

    public static int nextRandomInt() {
        return (int) (Math.random() * 2.147483647E9d);
    }

    public static String[] split(String str) {
        return split(str, null);
    }

    public static String substringAfter(String str, String str2) {
        int iIndexOf;
        return isEmpty(str) ? str : (str2 == null || (iIndexOf = str.indexOf(str2)) == -1) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str.substring(str2.length() + iIndexOf);
    }

    public static String substringBefore(String str, String str2) {
        if (isEmpty(str) || str2 == null) {
            return str;
        }
        if (str2.length() == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        int iIndexOf = str.indexOf(str2);
        return iIndexOf == -1 ? str : str.substring(0, iIndexOf);
    }

    public static String toHexadecimal(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b10 : bArr) {
            stringBuffer.append(hexDigits[(b10 & 255) >> 4]);
            stringBuffer.append(hexDigits[b10 & 15]);
        }
        return stringBuffer.toString();
    }

    public static void validateIsTrue(boolean z9, String str) {
        if (!z9) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void validateNotEmpty(String str, String str2) {
        if (isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void validateNotNull(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static String[] split(String str, String str2) {
        int i10;
        boolean z9;
        int i11;
        int i12;
        boolean z10;
        int i13;
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        if (str2 == null) {
            i12 = 0;
            z10 = false;
            i13 = 0;
            while (i12 < length) {
                if (Character.isWhitespace(str.charAt(i12))) {
                    if (z10) {
                        arrayList.add(str.substring(i13, i12));
                        z10 = false;
                    }
                    i13 = i12 + 1;
                    i12 = i13;
                } else {
                    i12++;
                    z10 = true;
                }
            }
        } else {
            if (str2.length() == 1) {
                char cCharAt = str2.charAt(0);
                i10 = 0;
                z9 = false;
                i11 = 0;
                while (i10 < length) {
                    if (str.charAt(i10) == cCharAt) {
                        if (z9) {
                            arrayList.add(str.substring(i11, i10));
                            z9 = false;
                        }
                        i11 = i10 + 1;
                        i10 = i11;
                    } else {
                        i10++;
                        z9 = true;
                    }
                }
            } else {
                i10 = 0;
                z9 = false;
                i11 = 0;
                while (i10 < length) {
                    if (str2.indexOf(str.charAt(i10)) >= 0) {
                        if (z9) {
                            arrayList.add(str.substring(i11, i10));
                            z9 = false;
                        }
                        i11 = i10 + 1;
                        i10 = i11;
                    } else {
                        i10++;
                        z9 = true;
                    }
                }
            }
            i12 = i10;
            z10 = z9;
            i13 = i11;
        }
        if (z10) {
            arrayList.add(str.substring(i13, i12));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
