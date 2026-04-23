package l5;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15221a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15223c;

    public f(int i10, String str) {
        this.f15223c = i10;
        this.f15222b = str;
    }

    public static int a(String str) {
        long jB = b(str) + 4294967296L;
        int i10 = 0;
        while ((1 & jB) == 0) {
            i10++;
            jB >>= 1;
        }
        if (jB != (8589934591 >> i10)) {
            return 32;
        }
        return 32 - i10;
    }

    public static long b(String str) {
        String[] strArrSplit = str.split("\\.");
        return (Long.parseLong(strArrSplit[0]) << 24) + ((long) (Integer.parseInt(strArrSplit[1]) << 16)) + ((long) (Integer.parseInt(strArrSplit[2]) << 8)) + ((long) Integer.parseInt(strArrSplit[3]));
    }

    public final boolean c() {
        long jB = b(this.f15222b);
        long j10 = (4294967295 << (32 - this.f15223c)) & jB;
        if (j10 == jB) {
            return false;
        }
        this.f15222b = String.format(Locale.US, "%d.%d.%d.%d", Long.valueOf(((-16777216) & j10) >> 24), Long.valueOf((16711680 & j10) >> 16), Long.valueOf((65280 & j10) >> 8), Long.valueOf(j10 & 255));
        return true;
    }

    public final String toString() {
        switch (this.f15221a) {
            case 1:
                return String.format(Locale.ENGLISH, "%s/%d", this.f15222b, Integer.valueOf(this.f15223c));
            default:
                return super.toString();
        }
    }

    public f(String str, String str2) {
        this.f15222b = str;
        this.f15223c = a(str2);
    }

    public f(String str, int i10) {
        this.f15223c = i10;
        this.f15222b = str;
    }
}
