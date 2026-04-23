package k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import l.l0;
import l.m0;
import l.q2;
import l.r0;
import o0.v0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14505b;

    public /* synthetic */ e(int i10, Object obj) {
        this.f14504a = i10;
        this.f14505b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Activity activity;
        int i10 = this.f14504a;
        Object obj = this.f14505b;
        switch (i10) {
            case 0:
                i iVar = (i) obj;
                if (iVar.a()) {
                    ArrayList arrayList = iVar.f14524u;
                    if (arrayList.size() > 0 && !((h) arrayList.get(0)).f14514a.K) {
                        View view = iVar.B;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((h) it.next()).f14514a.e();
                            }
                        } else {
                            iVar.dismiss();
                        }
                        break;
                    }
                }
                break;
            case 1:
                i0 i0Var = (i0) obj;
                if (i0Var.a()) {
                    q2 q2Var = i0Var.f14537u;
                    if (!q2Var.K) {
                        View view2 = i0Var.f14542z;
                        if (view2 != null && view2.isShown()) {
                            q2Var.e();
                        } else {
                            i0Var.dismiss();
                        }
                    }
                }
                break;
            case 2:
                androidx.appcompat.widget.c cVar = (androidx.appcompat.widget.c) obj;
                if (!cVar.getInternalPopup().a()) {
                    cVar.f393q.m(m0.b(cVar), m0.a(cVar));
                }
                ViewTreeObserver viewTreeObserver = cVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    l0.a(viewTreeObserver, this);
                }
                break;
            case 3:
                r0 r0Var = (r0) obj;
                androidx.appcompat.widget.c cVar2 = r0Var.T;
                WeakHashMap weakHashMap = v0.f16075a;
                if (o0.g0.b(cVar2) && cVar2.getGlobalVisibleRect(r0Var.R)) {
                    r0Var.s();
                    r0Var.e();
                } else {
                    r0Var.dismiss();
                }
                break;
            default:
                NavigationView navigationView = (NavigationView) obj;
                navigationView.getLocationOnScreen(navigationView.f11926x);
                int[] iArr = navigationView.f11926x;
                boolean z9 = iArr[1] == 0;
                x4.q qVar = navigationView.f11923u;
                if (qVar.I != z9) {
                    qVar.I = z9;
                    int i11 = (qVar.f18439b.getChildCount() == 0 && qVar.I) ? qVar.K : 0;
                    NavigationMenuView navigationMenuView = qVar.f18438a;
                    navigationMenuView.setPadding(0, i11, 0, navigationMenuView.getPaddingBottom());
                }
                navigationView.setDrawTopInsetForeground(z9 && navigationView.A);
                int i12 = iArr[0];
                navigationView.setDrawLeftInsetForeground(i12 == 0 || navigationView.getWidth() + i12 == 0);
                Context context = navigationView.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity = null;
                    } else if (context instanceof Activity) {
                        activity = (Activity) context;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (activity != null) {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
                    navigationView.setDrawBottomInsetForeground((displayMetrics.heightPixels - navigationView.getHeight() == iArr[1]) && (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0) && navigationView.B);
                    int i13 = displayMetrics.widthPixels;
                    navigationView.setDrawRightInsetForeground(i13 == iArr[0] || i13 - navigationView.getWidth() == iArr[0]);
                }
                break;
        }
    }
}
