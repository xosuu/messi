package l;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class a3 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f14775a;

    public a3(SearchView searchView) {
        this.f14775a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z9) {
        SearchView searchView = this.f14775a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f296b0;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z9);
        }
    }
}
