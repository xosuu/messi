package v0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.k;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o0.d0;
import o0.v0;
import p0.g;
import p0.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends o0.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Rect f17672n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d5.e f17673o = new d5.e();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d5.e f17674p = new d5.e();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f17679h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f17680i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f17681j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f17675d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f17676e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f17677f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f17678g = new int[2];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17682k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17683l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f17684m = Integer.MIN_VALUE;

    public b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f17680i = view;
        this.f17679h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = v0.f16075a;
        if (d0.c(view) == 0) {
            d0.s(view, 1);
        }
    }

    @Override // o0.c
    public final k b(View view) {
        if (this.f17681j == null) {
            this.f17681j = new a(this);
        }
        return this.f17681j;
    }

    @Override // o0.c
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    @Override // o0.c
    public final void d(View view, g gVar) {
        this.f16016a.onInitializeAccessibilityNodeInfo(view, gVar.f16195a);
        s(gVar);
    }

    public final boolean j(int i10) {
        if (this.f17683l != i10) {
            return false;
        }
        this.f17683l = Integer.MIN_VALUE;
        u(i10, false);
        w(i10, 8);
        return true;
    }

    public final AccessibilityEvent k(int i10, int i11) {
        View view = this.f17680i;
        if (i10 == -1) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i11);
        g gVarP = p(i10);
        accessibilityEventObtain2.getText().add(gVarP.e());
        AccessibilityNodeInfo accessibilityNodeInfo = gVarP.f16195a;
        accessibilityEventObtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityEventObtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityEventObtain2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityEventObtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityEventObtain2.setChecked(accessibilityNodeInfo.isChecked());
        r(accessibilityEventObtain2, i10);
        if (accessibilityEventObtain2.getText().isEmpty() && accessibilityEventObtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain2.setClassName(accessibilityNodeInfo.getClassName());
        l.a(accessibilityEventObtain2, view, i10);
        accessibilityEventObtain2.setPackageName(view.getContext().getPackageName());
        return accessibilityEventObtain2;
    }

    public final g l(int i10) {
        AccessibilityNodeInfo accessibilityNodeInfo;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        g gVar = new g(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        gVar.g("android.view.View");
        Rect rect = f17672n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        gVar.f16196b = -1;
        View view = this.f17680i;
        accessibilityNodeInfoObtain.setParent(view);
        t(i10, gVar);
        if (gVar.e() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f17676e;
        gVar.d(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & NotificationCompat.FLAG_HIGH_PRIORITY) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(view.getContext().getPackageName());
        gVar.f16197c = i10;
        accessibilityNodeInfoObtain.setSource(view, i10);
        if (this.f17682k == i10) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            gVar.a(NotificationCompat.FLAG_HIGH_PRIORITY);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            gVar.a(64);
        }
        boolean z9 = this.f17683l == i10;
        if (z9) {
            gVar.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            gVar.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z9);
        int[] iArr = this.f17678g;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.f17675d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            gVar.d(rect3);
            if (gVar.f16196b != -1) {
                g gVar2 = new g(AccessibilityNodeInfo.obtain());
                int i11 = gVar.f16196b;
                while (true) {
                    accessibilityNodeInfo = gVar2.f16195a;
                    if (i11 == -1) {
                        break;
                    }
                    gVar2.f16196b = -1;
                    accessibilityNodeInfo.setParent(view, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    t(i11, gVar2);
                    gVar2.d(rect2);
                    rect3.offset(rect2.left, rect2.top);
                    i11 = gVar2.f16196b;
                }
                accessibilityNodeInfo.recycle();
            }
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f17677f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                AccessibilityNodeInfo accessibilityNodeInfo2 = gVar.f16195a;
                accessibilityNodeInfo2.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                break;
                            }
                            parent = view2.getParent();
                        } else if (parent != null) {
                            accessibilityNodeInfo2.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return gVar;
    }

    public abstract void m(ArrayList arrayList);

    public final void n() {
        View view;
        ViewParent parent;
        if (!this.f17679h.isEnabled() || (parent = (view = this.f17680i).getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventK = k(-1, 2048);
        p0.b.b(accessibilityEventK, 1);
        parent.requestSendAccessibilityEvent(view, accessibilityEventK);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o(int r20, android.graphics.Rect r21) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.b.o(int, android.graphics.Rect):boolean");
    }

    public final g p(int i10) {
        if (i10 != -1) {
            return l(i10);
        }
        View view = this.f17680i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
        g gVar = new g(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = v0.f16075a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        m(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            gVar.f16195a.addChild(view, ((Integer) arrayList.get(i11)).intValue());
        }
        return gVar;
    }

    public abstract boolean q(int i10, int i11);

    public void r(AccessibilityEvent accessibilityEvent, int i10) {
    }

    public void s(g gVar) {
    }

    public abstract void t(int i10, g gVar);

    public void u(int i10, boolean z9) {
    }

    public final boolean v(int i10) {
        int i11;
        View view = this.f17680i;
        if ((!view.isFocused() && !view.requestFocus()) || (i11 = this.f17683l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            j(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f17683l = i10;
        u(i10, true);
        w(i10, 8);
        return true;
    }

    public final void w(int i10, int i11) {
        View view;
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f17679h.isEnabled() || (parent = (view = this.f17680i).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, k(i10, i11));
    }
}
