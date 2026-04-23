package org.jasypt.properties;

import org.jasypt.encryption.StringEncryptor;
import org.jasypt.util.text.TextEncryptor;

/* JADX INFO: loaded from: classes.dex */
public final class PropertyValueEncryptionUtils {
    private static final String ENCRYPTED_VALUE_PREFIX = "ENC(";
    private static final String ENCRYPTED_VALUE_SUFFIX = ")";

    private PropertyValueEncryptionUtils() {
    }

    public static String decrypt(String str, StringEncryptor stringEncryptor) {
        return stringEncryptor.decrypt(getInnerEncryptedValue(str.trim()));
    }

    public static String encrypt(String str, StringEncryptor stringEncryptor) {
        StringBuffer stringBuffer = new StringBuffer(ENCRYPTED_VALUE_PREFIX);
        stringBuffer.append(stringEncryptor.encrypt(str));
        stringBuffer.append(ENCRYPTED_VALUE_SUFFIX);
        return stringBuffer.toString();
    }

    private static String getInnerEncryptedValue(String str) {
        return str.substring(4, str.length() - 1);
    }

    public static boolean isEncryptedValue(String str) {
        if (str == null) {
            return false;
        }
        String strTrim = str.trim();
        return strTrim.startsWith(ENCRYPTED_VALUE_PREFIX) && strTrim.endsWith(ENCRYPTED_VALUE_SUFFIX);
    }

    public static String decrypt(String str, TextEncryptor textEncryptor) {
        return textEncryptor.decrypt(getInnerEncryptedValue(str.trim()));
    }

    public static String encrypt(String str, TextEncryptor textEncryptor) {
        StringBuffer stringBuffer = new StringBuffer(ENCRYPTED_VALUE_PREFIX);
        stringBuffer.append(textEncryptor.encrypt(str));
        stringBuffer.append(ENCRYPTED_VALUE_SUFFIX);
        return stringBuffer.toString();
    }
}
