package org.jasypt.normalization;

import java.lang.reflect.Method;
import org.jasypt.exceptions.EncryptionInitializationException;

/* JADX INFO: loaded from: classes.dex */
public final class Normalizer {
    private static final String ICU_NORMALIZER_CLASS_NAME = "com.ibm.icu.text.Normalizer";
    private static final String JDK_NORMALIZER_CLASS_NAME = "java.text.Normalizer";
    private static final String JDK_NORMALIZER_FORM_CLASS_NAME = "java.text.Normalizer$Form";
    static /* synthetic */ Class class$java$lang$CharSequence;
    private static Object javaTextNormalizerFormNFCConstant;
    private static Method javaTextNormalizerMethod;
    private static Boolean useIcuNormalizer;

    private Normalizer() {
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            throw new NoClassDefFoundError().initCause(e10);
        }
    }

    public static void initializeIcu4j() throws ClassNotFoundException {
        Thread.currentThread().getContextClassLoader().loadClass(ICU_NORMALIZER_CLASS_NAME);
        useIcuNormalizer = Boolean.TRUE;
    }

    public static void initializeJavaTextNormalizer() throws Throwable {
        Class<?> clsLoadClass = Thread.currentThread().getContextClassLoader().loadClass(JDK_NORMALIZER_CLASS_NAME);
        Class<?> clsLoadClass2 = Thread.currentThread().getContextClassLoader().loadClass(JDK_NORMALIZER_FORM_CLASS_NAME);
        Class<?>[] clsArr = new Class[2];
        Class<?> clsClass$ = class$java$lang$CharSequence;
        if (clsClass$ == null) {
            clsClass$ = class$("java.lang.CharSequence");
            class$java$lang$CharSequence = clsClass$;
        }
        clsArr[0] = clsClass$;
        clsArr[1] = clsLoadClass2;
        javaTextNormalizerMethod = clsLoadClass.getMethod("normalize", clsArr);
        javaTextNormalizerFormNFCConstant = clsLoadClass2.getField("NFC").get(null);
        useIcuNormalizer = Boolean.FALSE;
    }

    public static String normalizeToNfc(String str) {
        return new String(normalizeToNfc(str.toCharArray()));
    }

    public static char[] normalizeWithIcu4j(char[] cArr) {
        int iNormalize;
        char[] cArr2 = new char[cArr.length * 2];
        while (true) {
            iNormalize = com.ibm.icu.text.Normalizer.normalize(cArr, cArr2, com.ibm.icu.text.Normalizer.NFC, 0);
            if (iNormalize <= cArr2.length) {
                break;
            }
            for (int i10 = 0; i10 < cArr2.length; i10++) {
                cArr2[i10] = 0;
            }
            cArr2 = new char[iNormalize];
        }
        char[] cArr3 = new char[iNormalize];
        System.arraycopy(cArr2, 0, cArr3, 0, iNormalize);
        for (int i11 = 0; i11 < cArr2.length; i11++) {
            cArr2[i11] = 0;
        }
        return cArr3;
    }

    public static char[] normalizeWithJavaNormalizer(char[] cArr) {
        if (javaTextNormalizerMethod == null || javaTextNormalizerFormNFCConstant == null) {
            throw new EncryptionInitializationException("Cannot use: java.text.Normalizer$Form, as JDK-based normalization has not been initialized! (check previous execution errors)");
        }
        try {
            return ((String) javaTextNormalizerMethod.invoke(null, new String(cArr), javaTextNormalizerFormNFCConstant)).toCharArray();
        } catch (Exception e10) {
            throw new EncryptionInitializationException("Could not perform a valid UNICODE normalization", e10);
        }
    }

    public static char[] normalizeToNfc(char[] cArr) throws Throwable {
        if (useIcuNormalizer == null) {
            try {
                try {
                    initializeIcu4j();
                } catch (ClassNotFoundException unused) {
                    initializeJavaTextNormalizer();
                }
            } catch (ClassNotFoundException unused2) {
                throw new EncryptionInitializationException("Cannot find a valid UNICODE normalizer: neither java.text.Normalizer nor com.ibm.icu.text.Normalizer have been found at the classpath. If you are using a version of the JDK older than JavaSE 6, you should include the icu4j library in your classpath.");
            } catch (IllegalAccessException unused3) {
                throw new EncryptionInitializationException("Cannot find a valid UNICODE normalizer: java.text.Normalizer$Form has been found at the classpath, but seems to have no 'NFC' value.");
            } catch (NoSuchFieldException unused4) {
                throw new EncryptionInitializationException("Cannot find a valid UNICODE normalizer: java.text.Normalizer$Form has been found at the classpath, but seems to have no 'NFC' value.");
            } catch (NoSuchMethodException unused5) {
                throw new EncryptionInitializationException("Cannot find a valid UNICODE normalizer: java.text.Normalizer has been found at the classpath, but has an incompatible signature for its 'normalize' method.");
            }
        }
        return useIcuNormalizer.booleanValue() ? normalizeWithIcu4j(cArr) : normalizeWithJavaNormalizer(cArr);
    }
}
