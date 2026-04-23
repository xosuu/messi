package org.joda.time.format;

import com.google.android.gms.internal.ads.fb1;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public class FormatUtils {
    private static final double LOG_10 = Math.log(10.0d);

    private FormatUtils() {
    }

    public static void appendPaddedInteger(StringBuffer stringBuffer, int i10, int i11) {
        try {
            appendPaddedInteger((Appendable) stringBuffer, i10, i11);
        } catch (IOException unused) {
        }
    }

    public static void appendUnpaddedInteger(StringBuffer stringBuffer, int i10) {
        try {
            appendUnpaddedInteger((Appendable) stringBuffer, i10);
        } catch (IOException unused) {
        }
    }

    public static int calculateDigitCount(long j10) {
        if (j10 < 0) {
            if (j10 != Long.MIN_VALUE) {
                return calculateDigitCount(-j10) + 1;
            }
            return 20;
        }
        if (j10 < 10) {
            return 1;
        }
        if (j10 < 100) {
            return 2;
        }
        if (j10 < 1000) {
            return 3;
        }
        if (j10 < 10000) {
            return 4;
        }
        return 1 + ((int) (Math.log(j10) / LOG_10));
    }

    public static String createErrorMessage(String str, int i10) {
        String strConcat = str.length() <= i10 + 35 ? str : str.substring(0, i10 + 32).concat("...");
        if (i10 <= 0) {
            return "Invalid format: \"" + strConcat + '\"';
        }
        if (i10 >= str.length()) {
            return fb1.i("Invalid format: \"", strConcat, "\" is too short");
        }
        StringBuilder sbK = fb1.k("Invalid format: \"", strConcat, "\" is malformed at \"");
        sbK.append(strConcat.substring(i10));
        sbK.append('\"');
        return sbK.toString();
    }

    public static int parseTwoDigits(CharSequence charSequence, int i10) {
        int iCharAt = charSequence.charAt(i10) - '0';
        return (charSequence.charAt(i10 + 1) + ((iCharAt << 3) + (iCharAt << 1))) - 48;
    }

    public static void writePaddedInteger(Writer writer, int i10, int i11) throws IOException {
        if (i10 < 0) {
            writer.write(45);
            if (i10 == Integer.MIN_VALUE) {
                while (i11 > 10) {
                    writer.write(48);
                    i11--;
                }
                writer.write("2147483648");
                return;
            }
            i10 = -i10;
        }
        if (i10 < 10) {
            while (i11 > 1) {
                writer.write(48);
                i11--;
            }
            writer.write(i10 + 48);
            return;
        }
        if (i10 >= 100) {
            int iLog = i10 < 1000 ? 3 : i10 < 10000 ? 4 : ((int) (Math.log(i10) / LOG_10)) + 1;
            while (i11 > iLog) {
                writer.write(48);
                i11--;
            }
            writer.write(Integer.toString(i10));
            return;
        }
        while (i11 > 2) {
            writer.write(48);
            i11--;
        }
        int i12 = ((i10 + 1) * 13421772) >> 27;
        writer.write(i12 + 48);
        writer.write(((i10 - (i12 << 3)) - (i12 << 1)) + 48);
    }

    public static void writeUnpaddedInteger(Writer writer, int i10) throws IOException {
        if (i10 < 0) {
            writer.write(45);
            if (i10 == Integer.MIN_VALUE) {
                writer.write("2147483648");
                return;
            }
            i10 = -i10;
        }
        if (i10 < 10) {
            writer.write(i10 + 48);
        } else {
            if (i10 >= 100) {
                writer.write(Integer.toString(i10));
                return;
            }
            int i11 = ((i10 + 1) * 13421772) >> 27;
            writer.write(i11 + 48);
            writer.write(((i10 - (i11 << 3)) - (i11 << 1)) + 48);
        }
    }

    public static void appendPaddedInteger(Appendable appendable, int i10, int i11) throws IOException {
        if (i10 < 0) {
            appendable.append('-');
            if (i10 == Integer.MIN_VALUE) {
                while (i11 > 10) {
                    appendable.append('0');
                    i11--;
                }
                appendable.append("2147483648");
                return;
            }
            i10 = -i10;
        }
        if (i10 < 10) {
            while (i11 > 1) {
                appendable.append('0');
                i11--;
            }
            appendable.append((char) (i10 + 48));
            return;
        }
        if (i10 >= 100) {
            int iLog = i10 < 1000 ? 3 : i10 < 10000 ? 4 : ((int) (Math.log(i10) / LOG_10)) + 1;
            while (i11 > iLog) {
                appendable.append('0');
                i11--;
            }
            appendable.append(Integer.toString(i10));
            return;
        }
        while (i11 > 2) {
            appendable.append('0');
            i11--;
        }
        int i12 = ((i10 + 1) * 13421772) >> 27;
        appendable.append((char) (i12 + 48));
        appendable.append((char) (((i10 - (i12 << 3)) - (i12 << 1)) + 48));
    }

    public static void appendUnpaddedInteger(Appendable appendable, int i10) throws IOException {
        if (i10 < 0) {
            appendable.append('-');
            if (i10 == Integer.MIN_VALUE) {
                appendable.append("2147483648");
                return;
            }
            i10 = -i10;
        }
        if (i10 < 10) {
            appendable.append((char) (i10 + 48));
        } else {
            if (i10 >= 100) {
                appendable.append(Integer.toString(i10));
                return;
            }
            int i11 = ((i10 + 1) * 13421772) >> 27;
            appendable.append((char) (i11 + 48));
            appendable.append((char) (((i10 - (i11 << 3)) - (i11 << 1)) + 48));
        }
    }

    public static void writeUnpaddedInteger(Writer writer, long j10) throws IOException {
        int i10 = (int) j10;
        if (i10 == j10) {
            writeUnpaddedInteger(writer, i10);
        } else {
            writer.write(Long.toString(j10));
        }
    }

    public static void appendUnpaddedInteger(StringBuffer stringBuffer, long j10) {
        try {
            appendUnpaddedInteger((Appendable) stringBuffer, j10);
        } catch (IOException unused) {
        }
    }

    public static void appendUnpaddedInteger(Appendable appendable, long j10) throws IOException {
        int i10 = (int) j10;
        if (i10 == j10) {
            appendUnpaddedInteger(appendable, i10);
        } else {
            appendable.append(Long.toString(j10));
        }
    }

    public static void writePaddedInteger(Writer writer, long j10, int i10) throws IOException {
        int i11 = (int) j10;
        if (i11 == j10) {
            writePaddedInteger(writer, i11, i10);
            return;
        }
        if (i10 <= 19) {
            writer.write(Long.toString(j10));
            return;
        }
        if (j10 < 0) {
            writer.write(45);
            if (j10 == Long.MIN_VALUE) {
                while (i10 > 19) {
                    writer.write(48);
                    i10--;
                }
                writer.write("9223372036854775808");
                return;
            }
            j10 = -j10;
        }
        int iLog = ((int) (Math.log(j10) / LOG_10)) + 1;
        while (i10 > iLog) {
            writer.write(48);
            i10--;
        }
        writer.write(Long.toString(j10));
    }

    public static void appendPaddedInteger(StringBuffer stringBuffer, long j10, int i10) {
        try {
            appendPaddedInteger((Appendable) stringBuffer, j10, i10);
        } catch (IOException unused) {
        }
    }

    public static void appendPaddedInteger(Appendable appendable, long j10, int i10) throws IOException {
        int i11 = (int) j10;
        if (i11 == j10) {
            appendPaddedInteger(appendable, i11, i10);
            return;
        }
        if (i10 <= 19) {
            appendable.append(Long.toString(j10));
            return;
        }
        if (j10 < 0) {
            appendable.append('-');
            if (j10 == Long.MIN_VALUE) {
                while (i10 > 19) {
                    appendable.append('0');
                    i10--;
                }
                appendable.append("9223372036854775808");
                return;
            }
            j10 = -j10;
        }
        int iLog = ((int) (Math.log(j10) / LOG_10)) + 1;
        while (i10 > iLog) {
            appendable.append('0');
            i10--;
        }
        appendable.append(Long.toString(j10));
    }
}
