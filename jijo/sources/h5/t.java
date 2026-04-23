package h5;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;
import o0.d0;
import o0.v0;

/* JADX INFO: loaded from: classes.dex */
public final class t extends ArrayAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ColorStateList f14095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f14096b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f14097d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, Context context, int i10, String[] strArr) {
        super(context, i10, strArr);
        this.f14097d = uVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        u uVar = this.f14097d;
        ColorStateList colorStateList2 = uVar.f14104w;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f14096b = colorStateList;
        if (uVar.f14103v != 0 && uVar.f14104w != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{g0.a.b(uVar.f14104w.getColorForState(iArr3, 0), uVar.f14103v), g0.a.b(uVar.f14104w.getColorForState(iArr2, 0), uVar.f14103v), uVar.f14103v});
        }
        this.f14095a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i10, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            u uVar = this.f14097d;
            Drawable rippleDrawable = null;
            if (uVar.getText().toString().contentEquals(textView.getText()) && uVar.f14103v != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(uVar.f14103v);
                if (this.f14096b != null) {
                    h0.b.h(colorDrawable, this.f14095a);
                    rippleDrawable = new RippleDrawable(this.f14096b, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = v0.f16075a;
            d0.q(textView, rippleDrawable);
        }
        return view2;
    }
}
