package l;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes.dex */
public final class h2 extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14863b;

    public /* synthetic */ h2(int i10, Object obj) {
        this.f14862a = i10;
        this.f14863b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int i10 = this.f14862a;
        Object obj = this.f14863b;
        switch (i10) {
            case 0:
                k2 k2Var = (k2) obj;
                if (k2Var.L.isShowing()) {
                    k2Var.e();
                }
                break;
            case 1:
                t0.b bVar = (t0.b) obj;
                bVar.f16805a = true;
                bVar.notifyDataSetChanged();
                break;
            case 2:
                ((ViewPager) obj).f();
                break;
            default:
                ((TabLayout) obj).e();
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        int i10 = this.f14862a;
        Object obj = this.f14863b;
        switch (i10) {
            case 0:
                ((k2) obj).dismiss();
                break;
            case 1:
                t0.b bVar = (t0.b) obj;
                bVar.f16805a = false;
                bVar.notifyDataSetInvalidated();
                break;
            case 2:
                ((ViewPager) obj).f();
                break;
            default:
                ((TabLayout) obj).e();
                break;
        }
    }
}
