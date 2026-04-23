package b0;

import android.view.View;
import java.util.Comparator;
import java.util.WeakHashMap;
import o0.j0;
import o0.v0;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1229a;

    public /* synthetic */ g(int i10) {
        this.f1229a = i10;
    }

    public final int a(View view, View view2) {
        switch (this.f1229a) {
            case 0:
                WeakHashMap weakHashMap = v0.f16075a;
                float fM = j0.m(view);
                float fM2 = j0.m(view2);
                if (fM > fM2) {
                    return -1;
                }
                return fM < fM2 ? 1 : 0;
            case 1:
            default:
                return view.getTop() - view2.getTop();
            case 2:
                z1.d dVar = (z1.d) view.getLayoutParams();
                z1.d dVar2 = (z1.d) view2.getLayoutParams();
                boolean z9 = dVar.f20676a;
                return z9 != dVar2.f20676a ? z9 ? 1 : -1 : dVar.f20680e - dVar2.f20680e;
        }
    }

    public final int b(String str, String str2) {
        switch (this.f1229a) {
            case 5:
                int iMin = Math.min(str.length(), str2.length());
                int i10 = 4;
                while (true) {
                    if (i10 < iMin) {
                        char cCharAt = str.charAt(i10);
                        char cCharAt2 = str2.charAt(i10);
                        if (cCharAt == cCharAt2) {
                            i10++;
                        } else if (cCharAt >= cCharAt2) {
                            return 1;
                        }
                    } else {
                        int length = str.length();
                        int length2 = str2.length();
                        if (length == length2) {
                            return 0;
                        }
                        if (length >= length2) {
                            return 1;
                        }
                    }
                }
                return -1;
            default:
                return str.compareTo(str2);
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1229a) {
        }
        return b((String) obj, (String) obj2);
    }
}
