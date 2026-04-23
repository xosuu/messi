package androidx.core.app;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence[] f505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f509g;

    public o0(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z9, int i10, Bundle bundle, HashSet hashSet) {
        this.f503a = str;
        this.f504b = charSequence;
        this.f505c = charSequenceArr;
        this.f506d = z9;
        this.f507e = i10;
        this.f508f = bundle;
        this.f509g = hashSet;
        if (i10 == 2 && !z9) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static RemoteInput a(o0 o0Var) {
        Set set;
        RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(o0Var.f503a).setLabel(o0Var.f504b).setChoices(o0Var.f505c).setAllowFreeFormInput(o0Var.f506d).addExtras(o0Var.f508f);
        if (Build.VERSION.SDK_INT >= 26 && (set = o0Var.f509g) != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                m0.d(builderAddExtras, (String) it.next(), true);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            n0.b(builderAddExtras, o0Var.f507e);
        }
        return builderAddExtras.build();
    }
}
