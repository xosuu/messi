package z1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.k;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import p0.g;

/* JADX INFO: loaded from: classes.dex */
public final class e extends o0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f20682e;

    public /* synthetic */ e(View view, int i10) {
        this.f20681d = i10;
        this.f20682e = view;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    @Override // o0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
        /*
            r2 = this;
            int r0 = r2.f20681d
            android.view.View r1 = r2.f20682e
            switch(r0) {
                case 0: goto L18;
                case 1: goto L7;
                case 2: goto Lb;
                default: goto L7;
            }
        L7:
            super.c(r3, r4)
            return
        Lb:
            super.c(r3, r4)
            com.google.android.material.internal.CheckableImageButton r1 = (com.google.android.material.internal.CheckableImageButton) r1
            boolean r3 = r1.isChecked()
            r4.setChecked(r3)
            return
        L18:
            super.c(r3, r4)
            java.lang.Class<androidx.viewpager.widget.ViewPager> r3 = androidx.viewpager.widget.ViewPager.class
            java.lang.String r3 = r3.getName()
            r4.setClassName(r3)
            r3 = r1
            androidx.viewpager.widget.ViewPager r3 = (androidx.viewpager.widget.ViewPager) r3
            z1.a r3 = r3.f1143h
            if (r3 == 0) goto L33
            int r3 = r3.c()
            r0 = 1
            if (r3 <= r0) goto L33
            goto L34
        L33:
            r0 = 0
        L34:
            r4.setScrollable(r0)
            int r3 = r4.getEventType()
            r0 = 4096(0x1000, float:5.74E-42)
            if (r3 != r0) goto L56
            androidx.viewpager.widget.ViewPager r1 = (androidx.viewpager.widget.ViewPager) r1
            z1.a r3 = r1.f1143h
            if (r3 == 0) goto L56
            int r3 = r3.c()
            r4.setItemCount(r3)
            int r3 = r1.f1150q
            r4.setFromIndex(r3)
            int r3 = r1.f1150q
            r4.setToIndex(r3)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.e.c(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override // o0.c
    public final void d(View view, g gVar) {
        int i10;
        boolean z9 = false;
        z9 = false;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f16195a;
        int i11 = this.f20681d;
        View view2 = this.f20682e;
        View.AccessibilityDelegate accessibilityDelegate = this.f16016a;
        switch (i11) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                gVar.g(ViewPager.class.getName());
                a aVar = ((ViewPager) view2).f1143h;
                if (aVar != null && aVar.c() > 1) {
                    z9 = true;
                }
                gVar.k(z9);
                ViewPager viewPager = (ViewPager) view2;
                if (viewPager.canScrollHorizontally(1)) {
                    gVar.a(NotificationCompat.FLAG_BUBBLE);
                }
                if (viewPager.canScrollHorizontally(-1)) {
                    gVar.a(8192);
                }
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) view2;
                int i12 = MaterialButtonToggleGroup.f11813w;
                materialButtonToggleGroup.getClass();
                if (view instanceof MaterialButton) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < materialButtonToggleGroup.getChildCount(); i14++) {
                        if (materialButtonToggleGroup.getChildAt(i14) == view) {
                            i10 = i13;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i14) instanceof MaterialButton) && materialButtonToggleGroup.c(i14)) {
                                i13++;
                            }
                        }
                    }
                    i10 = -1;
                } else {
                    i10 = -1;
                }
                gVar.h(k.f(0, 1, i10, 1, false, ((MaterialButton) view).isChecked()));
                break;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) view2;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f11918h);
                accessibilityNodeInfo.setChecked(checkableImageButton.isChecked());
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCheckable(((NavigationMenuItemView) view2).J);
                break;
        }
    }

    @Override // o0.c
    public final boolean g(View view, int i10, Bundle bundle) {
        switch (this.f20681d) {
            case 0:
                if (super.g(view, i10, bundle)) {
                    return true;
                }
                View view2 = this.f20682e;
                if (i10 == 4096) {
                    ViewPager viewPager = (ViewPager) view2;
                    if (viewPager.canScrollHorizontally(1)) {
                        viewPager.setCurrentItem(viewPager.f1150q + 1);
                        return true;
                    }
                } else if (i10 == 8192) {
                    ViewPager viewPager2 = (ViewPager) view2;
                    if (viewPager2.canScrollHorizontally(-1)) {
                        viewPager2.setCurrentItem(viewPager2.f1150q - 1);
                        return true;
                    }
                }
                return false;
            default:
                return super.g(view, i10, bundle);
        }
    }
}
