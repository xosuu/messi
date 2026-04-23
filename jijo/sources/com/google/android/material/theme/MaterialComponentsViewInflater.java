package com.google.android.material.theme;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.internal.ads.tp1;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.b;
import f.p0;
import h5.u;
import l.g0;
import l.p;
import l.r;
import x4.y;
import xyz.easypro.httpcustom.R;
import z4.a;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends p0 {
    @Override // f.p0
    public final p a(Context context, AttributeSet attributeSet) {
        return new u(context, attributeSet);
    }

    @Override // f.p0
    public final r b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // f.p0
    public final AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // f.p0
    public final g0 d(Context context, AttributeSet attributeSet) {
        a aVar = new a(j5.a.a(context, attributeSet, R.attr.zm, R.style.a1j), attributeSet);
        Context context2 = aVar.getContext();
        TypedArray typedArrayE = y.e(context2, attributeSet, l4.a.f15204q, R.attr.zm, R.style.a1j, new int[0]);
        if (typedArrayE.hasValue(0)) {
            s0.b.c(aVar, tp1.g(context2, typedArrayE, 0));
        }
        aVar.f20700q = typedArrayE.getBoolean(1, false);
        typedArrayE.recycle();
        return aVar;
    }

    @Override // f.p0
    public final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new i5.a(context, attributeSet);
    }
}
