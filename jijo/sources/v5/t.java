package v5;

import android.os.Handler;
import android.os.Message;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class t extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        boolean z9;
        ArrayList arrayList = (ArrayList) v.D.get();
        ArrayList arrayList2 = (ArrayList) v.F.get();
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 == 1) {
                z9 = true;
            }
        }
        ArrayList arrayList3 = (ArrayList) v.E.get();
        z9 = arrayList.size() <= 0 && arrayList2.size() <= 0;
        while (arrayList3.size() > 0) {
            ArrayList arrayList4 = (ArrayList) arrayList3.clone();
            arrayList3.clear();
            int size = arrayList4.size();
            for (int i11 = 0; i11 < size; i11++) {
                v vVar = (v) arrayList4.get(i11);
                if (vVar.f17879x == 0) {
                    vVar.n();
                } else {
                    arrayList2.add(vVar);
                }
            }
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        ArrayList arrayList5 = (ArrayList) v.H.get();
        ArrayList arrayList6 = (ArrayList) v.G.get();
        int size2 = arrayList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            v vVar2 = (v) arrayList2.get(i12);
            if (vVar2.f17873q) {
                long j10 = jCurrentAnimationTimeMillis - vVar2.f17874s;
                long j11 = vVar2.f17879x;
                if (j10 > j11) {
                    vVar2.f17869b = jCurrentAnimationTimeMillis - (j10 - j11);
                    vVar2.f17875t = 1;
                    arrayList5.add(vVar2);
                }
            } else {
                vVar2.f17873q = true;
                vVar2.f17874s = jCurrentAnimationTimeMillis;
            }
        }
        int size3 = arrayList5.size();
        if (size3 > 0) {
            for (int i13 = 0; i13 < size3; i13++) {
                v vVar3 = (v) arrayList5.get(i13);
                vVar3.n();
                vVar3.f17876u = true;
                arrayList2.remove(vVar3);
            }
            arrayList5.clear();
        }
        int size4 = arrayList.size();
        int i14 = 0;
        while (i14 < size4) {
            v vVar4 = (v) arrayList.get(i14);
            if (vVar4.i(jCurrentAnimationTimeMillis)) {
                arrayList6.add(vVar4);
            }
            if (arrayList.size() == size4) {
                i14++;
            } else {
                size4--;
                arrayList6.remove(vVar4);
            }
        }
        if (arrayList6.size() > 0) {
            for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                ((v) arrayList6.get(i15)).k();
            }
            arrayList6.clear();
        }
        if (z9 && (!arrayList.isEmpty() || !arrayList2.isEmpty())) {
            sendEmptyMessageDelayed(1, Math.max(0L, v.J - (AnimationUtils.currentAnimationTimeMillis() - jCurrentAnimationTimeMillis)));
        }
    }
}
