package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public final class bu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3.a f3103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ju f3104b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3108f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3106d = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f3109g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f3110h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f3111i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f3112j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f3113k = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedList f3105c = new LinkedList();

    public bu(y3.a aVar, ju juVar, String str, String str2) {
        this.f3103a = aVar;
        this.f3104b = juVar;
        this.f3107e = str;
        this.f3108f = str2;
    }

    public final Bundle a() {
        Bundle bundle;
        synchronized (this.f3106d) {
            try {
                bundle = new Bundle();
                bundle.putString("seq_num", this.f3107e);
                bundle.putString("slotid", this.f3108f);
                bundle.putBoolean("ismediation", false);
                bundle.putLong("treq", this.f3112j);
                bundle.putLong("tresponse", this.f3113k);
                bundle.putLong("timp", this.f3109g);
                bundle.putLong("tload", this.f3110h);
                bundle.putLong("pcc", this.f3111i);
                bundle.putLong("tfetch", -1L);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (au auVar : this.f3105c) {
                    auVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("topen", auVar.f2789a);
                    bundle2.putLong("tclose", auVar.f2790b);
                    arrayList.add(bundle2);
                }
                bundle.putParcelableArrayList("tclick", arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }
}
