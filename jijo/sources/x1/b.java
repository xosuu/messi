package x1;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s4.a f18296a;

    public b(s4.a aVar) {
        this.f18296a = aVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f18296a.f16708b.A;
        if (colorStateList != null) {
            h0.b.h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        com.google.android.material.checkbox.b bVar = this.f18296a.f16708b;
        ColorStateList colorStateList = bVar.A;
        if (colorStateList != null) {
            h0.b.g(drawable, colorStateList.getColorForState(bVar.E, colorStateList.getDefaultColor()));
        }
    }
}
