package n4;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.material.appbar.AppBarLayout;
import f.d1;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15944c;

    public /* synthetic */ a(Object obj, int i10, Object obj2) {
        this.f15942a = i10;
        this.f15943b = obj;
        this.f15944c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f15942a;
        Object obj = this.f15944c;
        Object obj2 = this.f15943b;
        switch (i10) {
            case 0:
                AppBarLayout appBarLayout = (AppBarLayout) obj2;
                d5.g gVar = (d5.g) obj;
                int i11 = AppBarLayout.J;
                appBarLayout.getClass();
                int iFloatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gVar.setAlpha(iFloatValue);
                Iterator it = appBarLayout.C.iterator();
                while (it.hasNext()) {
                    fb1.t(it.next());
                    ColorStateList colorStateList = gVar.f12396a.f12377c;
                    if (colorStateList != null) {
                        colorStateList.withAlpha(iFloatValue).getDefaultColor();
                        throw null;
                    }
                }
                return;
            case 1:
                AppBarLayout appBarLayout2 = (AppBarLayout) obj2;
                int i12 = AppBarLayout.J;
                appBarLayout2.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((d5.g) obj).k(fFloatValue);
                Drawable drawable = appBarLayout2.G;
                if (drawable instanceof d5.g) {
                    ((d5.g) drawable).k(fFloatValue);
                }
                Iterator it2 = appBarLayout2.C.iterator();
                if (it2.hasNext()) {
                    fb1.t(it2.next());
                    throw null;
                }
                return;
            default:
                ((View) ((d1) ((m2.f) obj2).f15701b).f12804f.getParent()).invalidate();
                return;
        }
    }
}
