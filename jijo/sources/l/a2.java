package l;

import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public abstract class a2 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14767b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14768d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f14769f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z1 f14770h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public z1 f14771q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14772s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14773t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int[] f14774u = new int[2];

    public a2(View view) {
        this.f14769f = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f14766a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f14767b = tapTimeout;
        this.f14768d = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        z1 z1Var = this.f14771q;
        View view = this.f14769f;
        if (z1Var != null) {
            view.removeCallbacks(z1Var);
        }
        z1 z1Var2 = this.f14770h;
        if (z1Var2 != null) {
            view.removeCallbacks(z1Var2);
        }
    }

    public abstract k.h0 b();

    public abstract boolean c();

    public boolean d() {
        k.h0 h0VarB = b();
        if (h0VarB == null || !h0VarB.a()) {
            return true;
        }
        h0VarB.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.a2.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f14772s = false;
        this.f14773t = -1;
        z1 z1Var = this.f14770h;
        if (z1Var != null) {
            this.f14769f.removeCallbacks(z1Var);
        }
    }
}
