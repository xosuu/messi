package f7;

import com.google.android.gms.internal.ads.fb1;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f13250a = new ArrayList(20);

    public static void b(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt <= ' ' || cCharAt >= 127) {
                Object[] objArr = {Integer.valueOf(cCharAt), Integer.valueOf(i10), str};
                byte[] bArr = g7.b.f13888a;
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", objArr));
            }
        }
        if (str2 == null) {
            throw new NullPointerException(fb1.i("value for name ", str, " == null"));
        }
        int length2 = str2.length();
        for (int i11 = 0; i11 < length2; i11++) {
            char cCharAt2 = str2.charAt(i11);
            if ((cCharAt2 <= 31 && cCharAt2 != '\t') || cCharAt2 >= 127) {
                Object[] objArr2 = {Integer.valueOf(cCharAt2), Integer.valueOf(i11), str, str2};
                byte[] bArr2 = g7.b.f13888a;
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in %s value: %s", objArr2));
            }
        }
    }

    public final void a(String str, String str2) {
        ArrayList arrayList = this.f13250a;
        arrayList.add(str);
        arrayList.add(str2.trim());
    }

    public final void c(String str) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f13250a;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i10))) {
                arrayList.remove(i10);
                arrayList.remove(i10);
                i10 -= 2;
            }
            i10 += 2;
        }
    }
}
