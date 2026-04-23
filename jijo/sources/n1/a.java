package n1;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1.c f15823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f15824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k.q f15826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f15828f;

    public a(Context context, String str, r1.c cVar, k.q qVar, ArrayList arrayList, boolean z9, int i10, Executor executor, Executor executor2, boolean z10, boolean z11) {
        this.f15823a = cVar;
        this.f15824b = context;
        this.f15825c = str;
        this.f15826d = qVar;
        this.f15827e = z10;
        this.f15828f = z11;
    }

    public final boolean a(int i10, int i11) {
        if (i10 <= i11 || !this.f15828f) {
            return this.f15827e;
        }
        return false;
    }
}
