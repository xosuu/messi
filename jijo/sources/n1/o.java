package n1;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f15853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f15854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Executor f15855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Executor f15856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public r1.c f15857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15858h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f15860j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HashSet f15862l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f15851a = WorkDatabase.class;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15859i = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k.q f15861k = new k.q(12);

    public o(Context context, String str) {
        this.f15853c = context;
        this.f15852b = str;
    }

    public final void a(o1.a... aVarArr) {
        if (this.f15862l == null) {
            this.f15862l = new HashSet();
        }
        for (o1.a aVar : aVarArr) {
            this.f15862l.add(Integer.valueOf(aVar.f16089a));
            this.f15862l.add(Integer.valueOf(aVar.f16090b));
        }
        k.q qVar = this.f15861k;
        qVar.getClass();
        for (o1.a aVar2 : aVarArr) {
            int i10 = aVar2.f16089a;
            TreeMap treeMap = (TreeMap) ((HashMap) qVar.f14587b).get(Integer.valueOf(i10));
            if (treeMap == null) {
                treeMap = new TreeMap();
                ((HashMap) qVar.f14587b).put(Integer.valueOf(i10), treeMap);
            }
            int i11 = aVar2.f16090b;
            o1.a aVar3 = (o1.a) treeMap.get(Integer.valueOf(i11));
            if (aVar3 != null) {
                aVar3.toString();
                aVar2.toString();
            }
            treeMap.put(Integer.valueOf(i11), aVar2);
        }
    }
}
