package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h extends c1 {
    public static void i(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (o0.z0.b(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                i(arrayList, childAt);
            }
        }
    }

    public static void j(View view, s.b bVar) {
        WeakHashMap weakHashMap = o0.v0.f16075a;
        String strK = o0.j0.k(view);
        if (strK != null) {
            bVar.put(strK, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    j(childAt, bVar);
                }
            }
        }
    }

    public static void k(s.b bVar, Collection collection) {
        Iterator it = ((s.h) bVar.entrySet()).iterator();
        while (it.hasNext()) {
            View view = (View) ((Map.Entry) it.next()).getValue();
            WeakHashMap weakHashMap = o0.v0.f16075a;
            if (!collection.contains(o0.j0.k(view))) {
                it.remove();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:193:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x063e A[LOOP:6: B:237:0x0638->B:239:0x063e, LOOP_END] */
    @Override // androidx.fragment.app.c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.ArrayList r38, boolean r39) {
        /*
            Method dump skipped, instruction units count: 1618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.h.b(java.util.ArrayList, boolean):void");
    }
}
