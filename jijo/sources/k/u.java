package k;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class u extends FrameLayout implements j.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f14617a;

    /* JADX WARN: Multi-variable type inference failed */
    public u(View view) {
        super(view.getContext());
        this.f14617a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // j.c
    public final void b() {
        this.f14617a.onActionViewExpanded();
    }

    @Override // j.c
    public final void e() {
        this.f14617a.onActionViewCollapsed();
    }
}
