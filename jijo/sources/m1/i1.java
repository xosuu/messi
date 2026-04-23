package m1;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f15499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f15500g;

    public i1(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f15500g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f15494a = -1;
        this.f15495b = Integer.MIN_VALUE;
        this.f15496c = false;
        this.f15497d = false;
        this.f15498e = false;
        int[] iArr = this.f15499f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
