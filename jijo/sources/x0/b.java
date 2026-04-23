package x0;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.drawerlayout.widget.DrawerLayout;
import java.util.WeakHashMap;
import o0.d0;
import o0.e0;
import o0.v0;
import p0.f;
import p0.g;

/* JADX INFO: loaded from: classes.dex */
public final class b extends o0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f18275d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f18276e;

    public b(DrawerLayout drawerLayout) {
        this.f18276e = drawerLayout;
    }

    @Override // o0.c
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return this.f16016a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        accessibilityEvent.getText();
        DrawerLayout drawerLayout = this.f18276e;
        View viewG = drawerLayout.g();
        if (viewG == null) {
            return true;
        }
        int iJ = drawerLayout.j(viewG);
        drawerLayout.getClass();
        WeakHashMap weakHashMap = v0.f16075a;
        Gravity.getAbsoluteGravity(iJ, e0.d(drawerLayout));
        return true;
    }

    @Override // o0.c
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
    }

    @Override // o0.c
    public final void d(View view, g gVar) {
        boolean z9 = DrawerLayout.R;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f16195a;
        View.AccessibilityDelegate accessibilityDelegate = this.f16016a;
        if (z9) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        } else {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoObtain);
            gVar.f16197c = -1;
            accessibilityNodeInfo.setSource(view);
            WeakHashMap weakHashMap = v0.f16075a;
            Object objF = d0.f(view);
            if (objF instanceof View) {
                gVar.f16196b = -1;
                accessibilityNodeInfo.setParent((View) objF);
            }
            Rect rect = this.f18275d;
            accessibilityNodeInfoObtain.getBoundsInScreen(rect);
            accessibilityNodeInfo.setBoundsInScreen(rect);
            accessibilityNodeInfo.setVisibleToUser(accessibilityNodeInfoObtain.isVisibleToUser());
            accessibilityNodeInfo.setPackageName(accessibilityNodeInfoObtain.getPackageName());
            gVar.g(accessibilityNodeInfoObtain.getClassName());
            gVar.i(accessibilityNodeInfoObtain.getContentDescription());
            accessibilityNodeInfo.setEnabled(accessibilityNodeInfoObtain.isEnabled());
            accessibilityNodeInfo.setFocused(accessibilityNodeInfoObtain.isFocused());
            accessibilityNodeInfo.setAccessibilityFocused(accessibilityNodeInfoObtain.isAccessibilityFocused());
            accessibilityNodeInfo.setSelected(accessibilityNodeInfoObtain.isSelected());
            gVar.a(accessibilityNodeInfoObtain.getActions());
            accessibilityNodeInfoObtain.recycle();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (DrawerLayout.l(childAt)) {
                    accessibilityNodeInfo.addChild(childAt);
                }
            }
        }
        gVar.g("androidx.drawerlayout.widget.DrawerLayout");
        accessibilityNodeInfo.setFocusable(false);
        accessibilityNodeInfo.setFocused(false);
        accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) f.f16180e.f16190a);
        accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) f.f16181f.f16190a);
    }

    @Override // o0.c
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (DrawerLayout.R || DrawerLayout.l(view)) {
            return this.f16016a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
        return false;
    }
}
