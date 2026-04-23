package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import m1.c0;
import m1.h1;
import o0.v0;

/* JADX INFO: loaded from: classes.dex */
public final class l<S> extends v {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ int f11879t0 = 0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f11880i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public CalendarConstraints f11881j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public Month f11882k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f11883l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public android.support.v4.media.b f11884m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public RecyclerView f11885n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public RecyclerView f11886o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public View f11887p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public View f11888q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public View f11889r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public View f11890s0;

    @Override // androidx.fragment.app.s
    public final void A(Bundle bundle) {
        super.A(bundle);
        if (bundle == null) {
            bundle = this.f893s;
        }
        this.f11880i0 = bundle.getInt("THEME_RES_ID_KEY");
        fb1.m(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f11881j0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        fb1.m(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f11882k0 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.s
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        c0 c0Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(l(), this.f11880i0);
        this.f11884m0 = new android.support.v4.media.b(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.f11881j0.f11845a;
        int i12 = 1;
        int i13 = 0;
        if (o.g0(contextThemeWrapper, R.attr.windowFullscreen)) {
            i10 = xyz.easypro.httpcustom.R.layout.d9;
            i11 = 1;
        } else {
            i10 = xyz.easypro.httpcustom.R.layout.d4;
            i11 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i10, viewGroup, false);
        Resources resources = T().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(xyz.easypro.httpcustom.R.dimen.pt) + resources.getDimensionPixelOffset(xyz.easypro.httpcustom.R.dimen.pv) + resources.getDimensionPixelSize(xyz.easypro.httpcustom.R.dimen.pu);
        int dimensionPixelSize = resources.getDimensionPixelSize(xyz.easypro.httpcustom.R.dimen.pe);
        int i14 = r.f11899f;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(xyz.easypro.httpcustom.R.dimen.ps) * (i14 - 1)) + (resources.getDimensionPixelSize(xyz.easypro.httpcustom.R.dimen.p_) * i14) + resources.getDimensionPixelOffset(xyz.easypro.httpcustom.R.dimen.p7));
        GridView gridView = (GridView) viewInflate.findViewById(xyz.easypro.httpcustom.R.id.ob);
        v0.q(gridView, new f(this, i13));
        int i15 = this.f11881j0.f11849h;
        gridView.setAdapter((ListAdapter) (i15 > 0 ? new c(i15) : new c()));
        gridView.setNumColumns(month.f11857f);
        gridView.setEnabled(false);
        this.f11886o0 = (RecyclerView) viewInflate.findViewById(xyz.easypro.httpcustom.R.id.oe);
        l();
        this.f11886o0.setLayoutManager(new g(this, i11, i11));
        this.f11886o0.setTag("MONTHS_VIEW_GROUP_TAG");
        u uVar = new u(contextThemeWrapper, this.f11881j0, new h(this));
        this.f11886o0.setAdapter(uVar);
        int integer = contextThemeWrapper.getResources().getInteger(xyz.easypro.httpcustom.R.integer.ag);
        RecyclerView recyclerView3 = (RecyclerView) viewInflate.findViewById(xyz.easypro.httpcustom.R.id.oh);
        this.f11885n0 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f11885n0.setLayoutManager(new GridLayoutManager(integer));
            this.f11885n0.setAdapter(new z(this));
            this.f11885n0.g(new i(this));
        }
        if (viewInflate.findViewById(xyz.easypro.httpcustom.R.id.o4) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(xyz.easypro.httpcustom.R.id.o4);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            v0.q(materialButton, new f(this, 2));
            View viewFindViewById = viewInflate.findViewById(xyz.easypro.httpcustom.R.id.o6);
            this.f11887p0 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(xyz.easypro.httpcustom.R.id.o5);
            this.f11888q0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f11889r0 = viewInflate.findViewById(xyz.easypro.httpcustom.R.id.oh);
            this.f11890s0 = viewInflate.findViewById(xyz.easypro.httpcustom.R.id.oa);
            b0(1);
            materialButton.setText(this.f11882k0.f());
            this.f11886o0.h(new j(this, uVar, materialButton));
            materialButton.setOnClickListener(new f.b(6, this));
            this.f11888q0.setOnClickListener(new d(this, uVar, i12));
            this.f11887p0.setOnClickListener(new d(this, uVar, i13));
        }
        if (!o.g0(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (c0Var = new c0()).f15426a) != (recyclerView = this.f11886o0)) {
            h1 h1Var = c0Var.f15427b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f1062q0;
                if (arrayList != null) {
                    arrayList.remove(h1Var);
                }
                c0Var.f15426a.setOnFlingListener(null);
            }
            c0Var.f15426a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c0Var.f15426a.h(h1Var);
                c0Var.f15426a.setOnFlingListener(c0Var);
                new Scroller(c0Var.f15426a.getContext(), new DecelerateInterpolator());
                c0Var.f();
            }
        }
        this.f11886o0.a0(uVar.f11908d.f11845a.g(this.f11882k0));
        v0.q(this.f11886o0, new f(this, i12));
        return viewInflate;
    }

    @Override // androidx.fragment.app.s
    public final void K(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f11880i0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f11881j0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f11882k0);
    }

    public final void Z(Month month) {
        u uVar = (u) this.f11886o0.getAdapter();
        int iG = uVar.f11908d.f11845a.g(month);
        int iG2 = iG - uVar.f11908d.f11845a.g(this.f11882k0);
        boolean z9 = Math.abs(iG2) > 3;
        boolean z10 = iG2 > 0;
        this.f11882k0 = month;
        if (z9 && z10) {
            this.f11886o0.a0(iG - 3);
            this.f11886o0.post(new e(this, iG));
        } else if (!z9) {
            this.f11886o0.post(new e(this, iG));
        } else {
            this.f11886o0.a0(iG + 3);
            this.f11886o0.post(new e(this, iG));
        }
    }

    public final void b0(int i10) {
        this.f11883l0 = i10;
        if (i10 == 2) {
            this.f11885n0.getLayoutManager().i0(this.f11882k0.f11856d - ((z) this.f11885n0.getAdapter()).f11914d.f11881j0.f11845a.f11856d);
            this.f11889r0.setVisibility(0);
            this.f11890s0.setVisibility(8);
            this.f11887p0.setVisibility(8);
            this.f11888q0.setVisibility(8);
            return;
        }
        if (i10 == 1) {
            this.f11889r0.setVisibility(8);
            this.f11890s0.setVisibility(0);
            this.f11887p0.setVisibility(0);
            this.f11888q0.setVisibility(0);
            Z(this.f11882k0);
        }
    }
}
