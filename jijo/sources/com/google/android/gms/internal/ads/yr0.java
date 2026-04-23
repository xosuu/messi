package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zze;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class yr0 implements n40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f11022a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f11023b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ju f11024d;

    public yr0(Context context, ju juVar) {
        this.f11023b = context;
        this.f11024d = juVar;
    }

    public final Bundle a() {
        ju juVar = this.f11024d;
        Context context = this.f11023b;
        juVar.getClass();
        HashSet hashSet = new HashSet();
        synchronized (juVar.f6081a) {
            hashSet.addAll(juVar.f6085e);
            juVar.f6085e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", juVar.f6084d.b(context, juVar.f6083c.a()));
        Bundle bundle2 = new Bundle();
        Iterator it = juVar.f6086f.iterator();
        if (it.hasNext()) {
            fb1.t(it.next());
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((bu) it2.next()).a());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        b(hashSet);
        return bundle;
    }

    public final synchronized void b(HashSet hashSet) {
        this.f11022a.clear();
        this.f11022a.addAll(hashSet);
    }

    @Override // com.google.android.gms.internal.ads.n40
    public final synchronized void t(zze zzeVar) {
        if (zzeVar.zza != 3) {
            this.f11024d.g(this.f11022a);
        }
    }
}
