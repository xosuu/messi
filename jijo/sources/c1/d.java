package c1;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.fx0;
import com.google.android.gms.internal.ads.ik0;
import com.google.android.gms.internal.ads.n6;
import com.google.android.gms.internal.ads.q0;
import com.google.android.gms.internal.ads.y1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import l.a0;
import u.h;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f1500a;

    public d() {
        this.f1500a = Collections.emptyList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5 */
    public List a(n6 n6Var) {
        String str;
        int i10;
        ik0 ik0Var = new ik0((byte[]) n6Var.f7183e);
        ArrayList arrayList = this.f1500a;
        while (ik0Var.n() > 0) {
            int iV = ik0Var.v();
            int iV2 = ik0Var.f5634b + ik0Var.v();
            if (iV == 134) {
                arrayList = new ArrayList();
                int iV3 = ik0Var.v() & 31;
                for (int i11 = 0; i11 < iV3; i11++) {
                    String strA = ik0Var.a(3, fx0.f4681c);
                    int iV4 = ik0Var.v();
                    boolean z9 = (iV4 & NotificationCompat.FLAG_HIGH_PRIORITY) != 0;
                    if (z9) {
                        i10 = iV4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte bV = (byte) ik0Var.v();
                    ik0Var.j(1);
                    List listSingletonList = z9 ? Collections.singletonList((bV & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    q0 q0Var = new q0();
                    q0Var.f(str);
                    q0Var.f8044d = strA;
                    q0Var.D = i10;
                    q0Var.f8054n = listSingletonList;
                    arrayList.add(new y1(q0Var));
                }
            }
            ik0Var.i(iV2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    public d(List list, List list2, Random random) {
        int size;
        int i10 = org.minidns.iterative.a.f16153k;
        int i11 = org.minidns.a.f16123i;
        int iB = h.b(i11);
        if (iB == 0) {
            size = list.size();
        } else if (iB != 1) {
            size = list2.size() + list.size();
        } else {
            size = list2.size();
        }
        if (size == 0) {
            this.f1500a = Collections.emptyList();
            return;
        }
        if (a0.b(i11)) {
            Collections.shuffle(list, random);
        }
        if (a0.c(i11)) {
            Collections.shuffle(list2, random);
        }
        ArrayList arrayList = new ArrayList(size);
        arrayList.addAll(list);
        arrayList.addAll(list2);
        this.f1500a = Collections.unmodifiableList(arrayList);
    }
}
