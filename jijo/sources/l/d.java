package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.gms.ads.internal.overlay.zzs;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14840b;

    public /* synthetic */ d(int i10, Object obj) {
        this.f14839a = i10;
        this.f14840b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i10 = this.f14839a;
        Object obj = this.f14840b;
        switch (i10) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.I = null;
                actionBarOverlayLayout.f260w = false;
                break;
            case 3:
                zzs zzsVar = (zzs) obj;
                zzsVar.setEnabled(true);
                zzsVar.f2085a.setEnabled(true);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f14839a;
        Object obj = this.f14840b;
        switch (i10) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.I = null;
                actionBarOverlayLayout.f260w = false;
                return;
            case 1:
                ((w1.q) obj).m();
                animator.removeListener(this);
                return;
            case 2:
                x1.e eVar = (x1.e) obj;
                ArrayList arrayList = new ArrayList(eVar.f18306h);
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ColorStateList colorStateList = ((s4.a) arrayList.get(i11)).f16708b.A;
                    if (colorStateList != null) {
                        h0.b.h(eVar, colorStateList);
                    }
                }
                return;
            case 3:
                zzs zzsVar = (zzs) obj;
                zzsVar.setEnabled(true);
                zzsVar.f2085a.setEnabled(true);
                return;
            case 4:
                ((HideBottomViewOnScrollBehavior) obj).f11757h = null;
                return;
            case 5:
            default:
                ((ExpandableTransformationBehavior) obj).getClass();
                return;
            case 6:
                fb1.t(obj);
                throw null;
            case 7:
                h5.l lVar = (h5.l) obj;
                lVar.q();
                lVar.f14042r.start();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i10 = this.f14839a;
        Object obj = this.f14840b;
        switch (i10) {
            case 2:
                x1.e eVar = (x1.e) obj;
                ArrayList arrayList = new ArrayList(eVar.f18306h);
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    com.google.android.material.checkbox.b bVar = ((s4.a) arrayList.get(i11)).f16708b;
                    ColorStateList colorStateList = bVar.A;
                    if (colorStateList != null) {
                        h0.b.g(eVar, colorStateList.getColorForState(bVar.E, colorStateList.getDefaultColor()));
                    }
                }
                return;
            case 3:
                zzs zzsVar = (zzs) obj;
                zzsVar.setEnabled(false);
                zzsVar.f2085a.setEnabled(false);
                return;
            case 4:
            case 5:
            default:
                super.onAnimationStart(animator);
                return;
            case 6:
                fb1.t(obj);
                throw null;
        }
    }
}
