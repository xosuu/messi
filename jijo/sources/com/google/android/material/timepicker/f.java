package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.WeakHashMap;
import o0.d0;
import o0.e0;
import o0.v0;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends ConstraintLayout {
    public final e E;
    public int F;
    public final d5.g G;

    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.material.timepicker.e] */
    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ud);
        LayoutInflater.from(context).inflate(R.layout.cn, this);
        d5.g gVar = new d5.g();
        this.G = gVar;
        d5.h hVar = new d5.h(0.5f);
        g4.c cVarE = gVar.f12396a.f12375a.e();
        cVarE.f13700e = hVar;
        cVarE.f13701f = hVar;
        cVarE.f13702g = hVar;
        cVarE.f13703h = hVar;
        gVar.setShapeAppearanceModel(cVarE.a());
        this.G.l(ColorStateList.valueOf(-1));
        d5.g gVar2 = this.G;
        WeakHashMap weakHashMap = v0.f16075a;
        d0.q(this, gVar2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l4.a.f15210w, R.attr.ud, 0);
        this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.E = new Runnable() { // from class: com.google.android.material.timepicker.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f12044a.n();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = v0.f16075a;
            view.setId(e0.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            e eVar = this.E;
            handler.removeCallbacks(eVar);
            handler.post(eVar);
        }
    }

    public abstract void n();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            e eVar = this.E;
            handler.removeCallbacks(eVar);
            handler.post(eVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        this.G.l(ColorStateList.valueOf(i10));
    }
}
