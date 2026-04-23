package l;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;

/* JADX INFO: loaded from: classes.dex */
public final class a implements o0.e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14763a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f14765c;

    public a(ActionBarContextView actionBarContextView) {
        this.f14765c = actionBarContextView;
    }

    @Override // o0.e1
    public final void a() {
        if (this.f14763a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f14765c;
        actionBarContextView.f241q = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f14764b);
    }

    @Override // o0.e1
    public final void b(View view) {
        this.f14763a = true;
    }

    @Override // o0.e1
    public final void c() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f14763a = false;
    }
}
