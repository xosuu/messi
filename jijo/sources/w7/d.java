package w7;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends b {
    public static boolean e(String str) {
        if (str.isEmpty()) {
            return false;
        }
        if (!str.isEmpty() && (str.charAt(0) == '-' || str.charAt(str.length() - 1) == '-')) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt < '0' || cCharAt > '9') && cCharAt != '-'))) {
                return false;
            }
        }
        return true;
    }
}
