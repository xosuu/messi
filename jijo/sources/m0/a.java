package m0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f15372e = new byte[1792];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f15373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f15376d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f15372e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f15373a = charSequence;
        this.f15374b = charSequence.length();
    }

    public final byte a() {
        int i10 = this.f15375c - 1;
        CharSequence charSequence = this.f15373a;
        char cCharAt = charSequence.charAt(i10);
        this.f15376d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f15375c);
            this.f15375c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f15375c--;
        char c10 = this.f15376d;
        return c10 < 1792 ? f15372e[c10] : Character.getDirectionality(c10);
    }
}
