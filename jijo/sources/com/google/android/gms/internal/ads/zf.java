package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11227a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f11228b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f11229c = new ArrayList();

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f11228b.iterator();
        while (it.hasNext()) {
            String str = (String) zzba.zzc().a((yf) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        t3.i.P(arrayList2, xg.f("gad:dynamite_module:experiment_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
        t3.i.P(arrayList2, ih.f5592a);
        t3.i.P(arrayList2, ih.f5593b);
        t3.i.P(arrayList2, ih.f5594c);
        t3.i.P(arrayList2, ih.f5595d);
        t3.i.P(arrayList2, ih.f5596e);
        t3.i.P(arrayList2, ih.f5612u);
        t3.i.P(arrayList2, ih.f5597f);
        t3.i.P(arrayList2, ih.f5604m);
        t3.i.P(arrayList2, ih.f5605n);
        t3.i.P(arrayList2, ih.f5606o);
        t3.i.P(arrayList2, ih.f5607p);
        t3.i.P(arrayList2, ih.f5608q);
        t3.i.P(arrayList2, ih.f5609r);
        t3.i.P(arrayList2, ih.f5610s);
        t3.i.P(arrayList2, ih.f5611t);
        t3.i.P(arrayList2, ih.f5598g);
        t3.i.P(arrayList2, ih.f5599h);
        t3.i.P(arrayList2, ih.f5600i);
        t3.i.P(arrayList2, ih.f5601j);
        t3.i.P(arrayList2, ih.f5602k);
        t3.i.P(arrayList2, ih.f5603l);
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final ArrayList b() {
        ArrayList arrayListA = a();
        Iterator it = this.f11229c.iterator();
        while (it.hasNext()) {
            String str = (String) zzba.zzc().a((yf) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayListA.add(str);
            }
        }
        ArrayList arrayList = new ArrayList();
        t3.i.P(arrayList, wh.f10183a);
        arrayListA.addAll(arrayList);
        return arrayListA;
    }
}
