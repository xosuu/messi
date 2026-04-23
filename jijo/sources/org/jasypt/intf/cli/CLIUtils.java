package org.jasypt.intf.cli;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import org.jasypt.commons.CommonUtils;
import org.jasypt.exceptions.EncryptionOperationNotPossibleException;

/* JADX INFO: loaded from: classes.dex */
final class CLIUtils {
    private CLIUtils() {
    }

    public static Properties getArgumentValues(String str, String[] strArr, String[][] strArr2, String[][] strArr3) {
        HashSet hashSet = new HashSet();
        for (String[] strArr4 : strArr2) {
            hashSet.addAll(Arrays.asList(strArr4));
        }
        for (String[] strArr5 : strArr3) {
            hashSet.addAll(Arrays.asList(strArr5));
        }
        Properties properties = new Properties();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String strSubstringBefore = CommonUtils.substringBefore(strArr[i10], "=");
            String strSubstringAfter = CommonUtils.substringAfter(strArr[i10], "=");
            if (CommonUtils.isEmpty(strSubstringBefore) || CommonUtils.isEmpty(strSubstringAfter)) {
                StringBuffer stringBuffer = new StringBuffer("Bad argument: ");
                stringBuffer.append(strArr[i10]);
                throw new IllegalArgumentException(stringBuffer.toString());
            }
            if (!hashSet.contains(strSubstringBefore)) {
                StringBuffer stringBuffer2 = new StringBuffer("Bad argument: ");
                stringBuffer2.append(strArr[i10]);
                throw new IllegalArgumentException(stringBuffer2.toString());
            }
            if (strSubstringAfter.startsWith("\"") && strSubstringAfter.endsWith("\"")) {
                properties.setProperty(strSubstringBefore, strSubstringAfter.substring(1, strSubstringAfter.length() - 1));
            } else {
                properties.setProperty(strSubstringBefore, strSubstringAfter);
            }
        }
        for (String[] strArr6 : strArr2) {
            int i11 = 0;
            boolean z9 = false;
            while (true) {
                if (i11 >= strArr6.length) {
                    break;
                }
                if (properties.containsKey(strArr6[i11])) {
                    z9 = true;
                }
                i11++;
            }
            if (!z9) {
                showUsageAndExit(str, strArr2, strArr3);
            }
        }
        return properties;
    }

    public static boolean getVerbosity(String[] strArr) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String strSubstringBefore = CommonUtils.substringBefore(strArr[i10], "=");
            String strSubstringAfter = CommonUtils.substringAfter(strArr[i10], "=");
            if (!CommonUtils.isEmpty(strSubstringBefore) && !CommonUtils.isEmpty(strSubstringAfter) && "verbose".equals(strSubstringBefore)) {
                Boolean standardBooleanValue = CommonUtils.getStandardBooleanValue(strSubstringAfter);
                if (standardBooleanValue != null) {
                    return standardBooleanValue.booleanValue();
                }
                return false;
            }
        }
        return true;
    }

    public static void showArgumentDescription(Properties properties, boolean z9) {
        if (z9) {
            System.out.getClass();
            for (Map.Entry entry : properties.entrySet()) {
                PrintStream printStream = System.out;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(entry.getKey());
                stringBuffer.append(": ");
                stringBuffer.append(entry.getValue());
                printStream.getClass();
            }
            System.out.getClass();
        }
    }

    public static void showEnvironment(boolean z9) {
        if (z9) {
            PrintStream printStream = System.out;
            printStream.getClass();
            StringBuffer stringBuffer = new StringBuffer("Runtime: ");
            stringBuffer.append(System.getProperty("java.vm.vendor"));
            stringBuffer.append(" ");
            stringBuffer.append(System.getProperty("java.vm.name"));
            stringBuffer.append(" ");
            stringBuffer.append(System.getProperty("java.vm.version"));
            stringBuffer.append(" ");
            printStream.getClass();
            printStream.getClass();
        }
    }

    public static void showError(Throwable th, boolean z9) {
        if (z9) {
            PrintStream printStream = System.err;
            printStream.getClass();
            if ((th instanceof EncryptionOperationNotPossibleException) || th.getMessage() == null) {
                printStream.getClass();
            } else {
                th.getMessage();
                printStream.getClass();
            }
            printStream.getClass();
            return;
        }
        PrintStream printStream2 = System.err;
        printStream2.getClass();
        if (th instanceof EncryptionOperationNotPossibleException) {
            printStream2.getClass();
        } else if (th.getMessage() == null) {
            printStream2.getClass();
        } else {
            th.getMessage();
            printStream2.getClass();
        }
    }

    public static void showOutput(String str, boolean z9) {
        if (!z9) {
            System.out.getClass();
            return;
        }
        PrintStream printStream = System.out;
        printStream.getClass();
        printStream.getClass();
        printStream.getClass();
    }

    public static void showUsageAndExit(String str, String[][] strArr, String[][] strArr2) {
        PrintStream printStream = System.err;
        StringBuffer stringBuffer = new StringBuffer("\nUSAGE: ");
        stringBuffer.append(str);
        stringBuffer.append(" [ARGUMENTS]\n");
        printStream.getClass();
        printStream.getClass();
        printStream.getClass();
        printStream.getClass();
        printStream.getClass();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            PrintStream printStream2 = System.err;
            printStream2.getClass();
            String[] strArr3 = strArr[i10];
            if (strArr3.length == 1) {
                String str2 = strArr3[0];
                printStream2.getClass();
            } else {
                printStream2.getClass();
                for (int i11 = 0; i11 < strArr[i10].length; i11++) {
                    if (i11 > 0) {
                        System.err.getClass();
                    }
                    PrintStream printStream3 = System.err;
                    String str3 = strArr[i10][i11];
                    printStream3.getClass();
                }
                System.err.getClass();
            }
            System.err.getClass();
        }
        PrintStream printStream4 = System.err;
        printStream4.getClass();
        printStream4.getClass();
        for (int i12 = 0; i12 < strArr2.length; i12++) {
            PrintStream printStream5 = System.err;
            printStream5.getClass();
            String[] strArr4 = strArr2[i12];
            if (strArr4.length == 1) {
                String str4 = strArr4[0];
                printStream5.getClass();
            } else {
                printStream5.getClass();
                for (int i13 = 0; i13 < strArr2[i12].length; i13++) {
                    if (i13 > 0) {
                        System.err.getClass();
                    }
                    PrintStream printStream6 = System.err;
                    String str5 = strArr2[i12][i13];
                    printStream6.getClass();
                }
                System.err.getClass();
            }
            System.err.getClass();
        }
        System.exit(1);
    }
}
