package x4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ParcelableSparseArray;
import java.util.ArrayList;
import k.d0;
import k.j0;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class q implements d0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public int J;
    public int K;
    public int L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NavigationMenuView f18438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinearLayout f18439b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k.o f18440d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18441f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i f18442h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LayoutInflater f18443q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ColorStateList f18445t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f18447v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ColorStateList f18448w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Drawable f18449x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public RippleDrawable f18450y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f18451z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f18444s = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f18446u = 0;
    public boolean I = true;
    public int M = -1;
    public final f.b N = new f.b(7, this);

    @Override // k.d0
    public final void b(k.o oVar, boolean z9) {
    }

    @Override // k.d0
    public final boolean c(k.r rVar) {
        return false;
    }

    @Override // k.d0
    public final boolean d(j0 j0Var) {
        return false;
    }

    @Override // k.d0
    public final boolean f(k.r rVar) {
        return false;
    }

    @Override // k.d0
    public final void g(Parcelable parcelable) {
        k.r rVar;
        View actionView;
        ParcelableSparseArray parcelableSparseArray;
        k.r rVar2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f18438a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                i iVar = this.f18442h;
                iVar.getClass();
                int i10 = bundle2.getInt("android:menu:checked", 0);
                ArrayList arrayList = iVar.f18429d;
                if (i10 != 0) {
                    iVar.f18431h = true;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            break;
                        }
                        k kVar = (k) arrayList.get(i11);
                        if ((kVar instanceof m) && (rVar2 = ((m) kVar).f18435a) != null && rVar2.f14588a == i10) {
                            iVar.i(rVar2);
                            break;
                        }
                        i11++;
                    }
                    iVar.f18431h = false;
                    iVar.h();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = arrayList.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        k kVar2 = (k) arrayList.get(i12);
                        if ((kVar2 instanceof m) && (rVar = ((m) kVar2).f18435a) != null && (actionView = rVar.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray2.get(rVar.f14588a)) != null) {
                            actionView.restoreHierarchyState(parcelableSparseArray);
                        }
                    }
                }
            }
            SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f18439b.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    @Override // k.d0
    public final void h() {
        i iVar = this.f18442h;
        if (iVar != null) {
            iVar.h();
            iVar.d();
        }
    }

    @Override // k.d0
    public final int k() {
        return this.f18441f;
    }

    @Override // k.d0
    public final void l(Context context, k.o oVar) {
        this.f18443q = LayoutInflater.from(context);
        this.f18440d = oVar;
        this.L = context.getResources().getDimensionPixelOffset(R.dimen.d9);
    }

    @Override // k.d0
    public final boolean m() {
        return false;
    }

    @Override // k.d0
    public final Parcelable n() {
        Bundle bundle = new Bundle();
        if (this.f18438a != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f18438a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        i iVar = this.f18442h;
        if (iVar != null) {
            iVar.getClass();
            Bundle bundle2 = new Bundle();
            k.r rVar = iVar.f18430f;
            if (rVar != null) {
                bundle2.putInt("android:menu:checked", rVar.f14588a);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            ArrayList arrayList = iVar.f18429d;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                k kVar = (k) arrayList.get(i10);
                if (kVar instanceof m) {
                    k.r rVar2 = ((m) kVar).f18435a;
                    View actionView = rVar2 != null ? rVar2.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray2.put(rVar2.f14588a, parcelableSparseArray);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f18439b != null) {
            SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
            this.f18439b.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }
}
