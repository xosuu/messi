package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.gms.internal.ads.en1;
import com.google.android.material.timepicker.g;
import d5.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import k.q;
import o0.d0;
import o0.e0;
import o0.m;
import o0.v0;
import r4.c;
import u.f;
import x4.y;
import xyz.easypro.httpcustom.R;
import z1.e;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f11813w = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f11815b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f11816d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f11817f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer[] f11818h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f11819q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f11820s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f11821t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f11822u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public HashSet f11823v;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(j5.a.a(context, attributeSet, R.attr.tt, R.style.a1q), attributeSet, R.attr.tt);
        this.f11814a = new ArrayList();
        this.f11815b = new q(this);
        this.f11816d = new LinkedHashSet();
        this.f11817f = new f(1, this);
        this.f11819q = false;
        this.f11823v = new HashSet();
        TypedArray typedArrayE = y.e(getContext(), attributeSet, l4.a.f15200m, R.attr.tt, R.style.a1q, new int[0]);
        setSingleSelection(typedArrayE.getBoolean(3, false));
        this.f11822u = typedArrayE.getResourceId(1, -1);
        this.f11821t = typedArrayE.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayE.getBoolean(0, true));
        typedArrayE.recycle();
        WeakHashMap weakHashMap = v0.f16075a;
        d0.s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (c(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && c(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = v0.f16075a;
            materialButton.setId(e0.a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f11815b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i10);
            int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i10 - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                m.g(layoutParams2, 0);
                m.h(layoutParams2, -iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                m.h(layoutParams2, 0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            m.g(layoutParams3, 0);
            m.h(layoutParams3, 0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i10, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            b(materialButton.getId(), materialButton.isChecked());
            j shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.f11814a.add(new c(shapeAppearanceModel.f12415e, shapeAppearanceModel.f12418h, shapeAppearanceModel.f12416f, shapeAppearanceModel.f12417g));
            materialButton.setEnabled(isEnabled());
            v0.q(materialButton, new e(this, 1));
        }
    }

    public final void b(int i10, boolean z9) {
        if (i10 == -1) {
            return;
        }
        HashSet hashSet = new HashSet(this.f11823v);
        if (z9 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f11820s && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else {
            if (z9 || !hashSet.contains(Integer.valueOf(i10))) {
                return;
            }
            if (!this.f11821t || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        }
        d(hashSet);
    }

    public final boolean c(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    public final void d(Set set) {
        HashSet hashSet = this.f11823v;
        this.f11823v = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id = ((MaterialButton) getChildAt(i10)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f11819q = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f11819q = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f11816d.iterator();
                while (it.hasNext()) {
                    ((g) it.next()).a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f11817f);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put((MaterialButton) getChildAt(i10), Integer.valueOf(i10));
        }
        this.f11818h = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        c cVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i10);
            if (materialButton.getVisibility() != 8) {
                g4.c cVarE = materialButton.getShapeAppearanceModel().e();
                c cVar2 = (c) this.f11814a.get(i10);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z9 = getOrientation() == 0;
                    d5.a aVar = c.f16531e;
                    if (i10 == firstVisibleChildIndex) {
                        cVar = z9 ? en1.v(this) ? new c(aVar, aVar, cVar2.f16533b, cVar2.f16534c) : new c(cVar2.f16532a, cVar2.f16535d, aVar, aVar) : new c(cVar2.f16532a, aVar, cVar2.f16533b, aVar);
                    } else if (i10 == lastVisibleChildIndex) {
                        cVar = z9 ? en1.v(this) ? new c(cVar2.f16532a, cVar2.f16535d, aVar, aVar) : new c(aVar, aVar, cVar2.f16533b, cVar2.f16534c) : new c(aVar, cVar2.f16535d, aVar, cVar2.f16534c);
                    } else {
                        cVar2 = null;
                    }
                    cVar2 = cVar;
                }
                if (cVar2 == null) {
                    cVarE.f13700e = new d5.a(0.0f);
                    cVarE.f13701f = new d5.a(0.0f);
                    cVarE.f13702g = new d5.a(0.0f);
                    cVarE.f13703h = new d5.a(0.0f);
                } else {
                    cVarE.f13700e = cVar2.f16532a;
                    cVarE.f13703h = cVar2.f16535d;
                    cVarE.f13701f = cVar2.f16533b;
                    cVarE.f13702g = cVar2.f16534c;
                }
                materialButton.setShapeAppearanceModel(cVarE.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f11820s || this.f11823v.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f11823v.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id = ((MaterialButton) getChildAt(i10)).getId();
            if (this.f11823v.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f11818h;
        return (numArr == null || i11 >= numArr.length) ? i11 : numArr[i11].intValue();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f11822u;
        if (i10 != -1) {
            d(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f11820s ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        e();
        a();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f11814a.remove(iIndexOfChild);
        }
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((MaterialButton) getChildAt(i10)).setEnabled(z9);
        }
    }

    public void setSelectionRequired(boolean z9) {
        this.f11821t = z9;
    }

    public void setSingleSelection(boolean z9) {
        if (this.f11820s != z9) {
            this.f11820s = z9;
            d(new HashSet());
        }
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
