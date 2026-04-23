package d;

import android.content.Intent;
import androidx.fragment.app.k;
import com.google.android.gms.internal.ads.en1;
import d0.f;
import g4.a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import m6.d;
import m6.g;
import t3.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i {
    @Override // t3.i
    public final Intent j(androidx.activity.i iVar, Object obj) {
        String[] strArr = (String[]) obj;
        a0.f(iVar, "context");
        a0.f(strArr, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        a0.e(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return intentPutExtra;
    }

    @Override // t3.i
    public final k k(androidx.activity.i iVar, Object obj) {
        String[] strArr = (String[]) obj;
        a0.f(iVar, "context");
        a0.f(strArr, "input");
        if (strArr.length == 0) {
            return new k(g.f15780a);
        }
        for (String str : strArr) {
            if (f.a(iVar, str) != 0) {
                return null;
            }
        }
        int iW = en1.w(strArr.length);
        if (iW < 16) {
            iW = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
        for (String str2 : strArr) {
            linkedHashMap.put(str2, Boolean.TRUE);
        }
        return new k(linkedHashMap);
    }

    @Override // t3.i
    public final Object v(int i10, Intent intent) {
        g gVar = g.f15780a;
        if (i10 != -1 || intent == null) {
            return gVar;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return gVar;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i11 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i11 == 0));
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : stringArrayExtra) {
            if (str != null) {
                arrayList2.add(str);
            }
        }
        Iterator it = arrayList2.iterator();
        Iterator it2 = arrayList.iterator();
        ArrayList arrayList3 = new ArrayList(Math.min(d.u0(arrayList2), d.u0(arrayList)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList3.add(new l6.a(it.next(), it2.next()));
        }
        return m6.i.O0(arrayList3);
    }
}
