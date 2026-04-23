package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f973b;

    static {
        int[] iArr = new int[k.values().length];
        f973b = iArr;
        try {
            iArr[k.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f973b[k.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f973b[k.ON_START.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f973b[k.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f973b[k.ON_RESUME.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f973b[k.ON_DESTROY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f973b[k.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        int[] iArr2 = new int[l.values().length];
        f972a = iArr2;
        try {
            iArr2[2] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f972a[3] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f972a[4] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f972a[0] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f972a[1] = 5;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
