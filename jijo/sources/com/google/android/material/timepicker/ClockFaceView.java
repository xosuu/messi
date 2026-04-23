package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.tp1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o0.v0;
import xyz.easypro.httpcustom.R;
import z.m;

/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends f implements d {
    public final ClockHandView H;
    public final Rect I;
    public final RectF J;
    public final Rect K;
    public final SparseArray L;
    public final c M;
    public final int[] N;
    public final float[] O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final String[] T;
    public float U;
    public final ColorStateList V;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.I = new Rect();
        this.J = new RectF();
        this.K = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.L = sparseArray;
        this.O = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l4.a.f15193f, R.attr.ud, R.style.a3c);
        Resources resources = getResources();
        ColorStateList colorStateListG = tp1.g(context, typedArrayObtainStyledAttributes, 1);
        this.V = colorStateListG;
        LayoutInflater.from(context).inflate(R.layout.cm, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.n5);
        this.H = clockHandView;
        this.P = resources.getDimensionPixelSize(R.dimen.mq);
        int colorForState = colorStateListG.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListG.getDefaultColor());
        this.N = new int[]{colorForState, colorForState, colorStateListG.getDefaultColor()};
        clockHandView.f12030d.add(this);
        int defaultColor = d0.f.c(context, R.color.qc).getDefaultColor();
        ColorStateList colorStateListG2 = tp1.g(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListG2 != null ? colorStateListG2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.M = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        this.T = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z9 = false;
        for (int i10 = 0; i10 < Math.max(this.T.length, size); i10++) {
            TextView textView = (TextView) sparseArray.get(i10);
            if (i10 >= this.T.length) {
                removeView(textView);
                sparseArray.remove(i10);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.cl, (ViewGroup) this, false);
                    sparseArray.put(i10, textView);
                    addView(textView);
                }
                textView.setText(this.T[i10]);
                textView.setTag(R.id.nk, Integer.valueOf(i10));
                int i11 = (i10 / 12) + 1;
                textView.setTag(R.id.n6, Integer.valueOf(i11));
                z9 = i11 > 1 ? true : z9;
                v0.q(textView, this.M);
                textView.setTextColor(this.V);
            }
        }
        ClockHandView clockHandView2 = this.H;
        if (clockHandView2.f12029b && !z9) {
            clockHandView2.f12040y = 1;
        }
        clockHandView2.f12029b = z9;
        clockHandView2.invalidate();
        this.Q = resources.getDimensionPixelSize(R.dimen.nh);
        this.R = resources.getDimensionPixelSize(R.dimen.ni);
        this.S = resources.getDimensionPixelSize(R.dimen.mx);
    }

    @Override // com.google.android.material.timepicker.f
    public final void n() {
        m mVar = new m();
        mVar.b(this);
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != R.id.fh && !"skip".equals(childAt.getTag())) {
                int i11 = (Integer) childAt.getTag(R.id.n6);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!map.containsKey(i11)) {
                    map.put(i11, new ArrayList());
                }
                ((List) map.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.F * 0.66f) : this.F;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap map2 = mVar.f20630c;
                if (!map2.containsKey(Integer.valueOf(id))) {
                    map2.put(Integer.valueOf(id), new z.h());
                }
                z.i iVar = ((z.h) map2.get(Integer.valueOf(id))).f20552d;
                iVar.f20596z = R.id.fh;
                iVar.A = iRound;
                iVar.B = size;
                size += 360.0f / list.size();
            }
        }
        mVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i12 = 0;
        while (true) {
            SparseArray sparseArray = this.L;
            if (i12 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i12)).setVisibility(0);
            i12++;
        }
    }

    public final void o() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.H.f12034s;
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        int i10 = 0;
        while (true) {
            sparseArray = this.L;
            int size = sparseArray.size();
            rectF = this.J;
            rect = this.I;
            if (i10 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f10) {
                    textView = textView2;
                    f10 = fHeight;
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            TextView textView3 = (TextView) sparseArray.get(i11);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.K);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.N, this.O, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.T.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        o();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.S / Math.max(Math.max(this.Q / displayMetrics.heightPixels, this.R / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
