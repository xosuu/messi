package l;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class b3 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14808b;

    public /* synthetic */ b3(int i10, Object obj) {
        this.f14807a = i10;
        this.f14808b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = this.f14807a;
        Object obj = this.f14808b;
        switch (i18) {
            case 0:
                SearchView searchView = (SearchView) obj;
                View view2 = searchView.J;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.D.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean zA = e4.a(searchView);
                    int dimensionPixelSize = searchView.f298d0 ? resources.getDimensionPixelSize(R.dimen.af) + resources.getDimensionPixelSize(R.dimen.ae) : 0;
                    SearchView.SearchAutoComplete searchAutoComplete = searchView.B;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchAutoComplete.setDropDownHorizontalOffset(zA ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    return;
                }
                return;
            default:
                ((BottomAppBar$Behavior) obj).getClass();
                throw null;
        }
    }
}
