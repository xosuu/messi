package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.google.android.gms.internal.ads.ur0;
import k.f0;
import k.n;
import k.o;
import k.r;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements n, f0, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f211b = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f212a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        ur0 ur0Var = new ur0(context, 5, context.obtainStyledAttributes(attributeSet, f211b, R.attr.listViewStyle, 0));
        if (ur0Var.H(0)) {
            setBackgroundDrawable(ur0Var.y(0));
        }
        if (ur0Var.H(1)) {
            setDivider(ur0Var.y(1));
        }
        ur0Var.M();
    }

    @Override // k.n
    public final boolean a(r rVar) {
        return this.f212a.q(rVar, null, 0);
    }

    @Override // k.f0
    public final void d(o oVar) {
        this.f212a = oVar;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        a((r) getAdapter().getItem(i10));
    }
}
