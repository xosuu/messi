package g5;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class h implements z1.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f13863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13864b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13865d;

    public h(TabLayout tabLayout) {
        this.f13863a = new WeakReference(tabLayout);
    }

    @Override // z1.f
    public final void a(int i10) {
        this.f13864b = this.f13865d;
        this.f13865d = i10;
        TabLayout tabLayout = (TabLayout) this.f13863a.get();
        if (tabLayout != null) {
            tabLayout.f11971j0 = this.f13865d;
        }
    }

    @Override // z1.f
    public final void b(int i10) {
        TabLayout tabLayout = (TabLayout) this.f13863a.get();
        if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
            return;
        }
        int i11 = this.f13865d;
        tabLayout.f((i10 < 0 || i10 >= tabLayout.getTabCount()) ? null : (g) tabLayout.f11959b.get(i10), i11 == 0 || (i11 == 2 && this.f13864b == 0));
    }

    @Override // z1.f
    public final void c(float f10, int i10, int i11) {
        TabLayout tabLayout = (TabLayout) this.f13863a.get();
        if (tabLayout != null) {
            int i12 = this.f13865d;
            tabLayout.h(i10, f10, i12 != 2 || this.f13864b == 1, (i12 == 2 && this.f13864b == 0) ? false : true);
        }
    }
}
