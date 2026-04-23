package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.fb1;

/* JADX INFO: loaded from: classes.dex */
public final class p<S> extends v {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f11896i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public CalendarConstraints f11897j0;

    @Override // androidx.fragment.app.s
    public final void A(Bundle bundle) {
        super.A(bundle);
        if (bundle == null) {
            bundle = this.f893s;
        }
        this.f11896i0 = bundle.getInt("THEME_RES_ID_KEY");
        fb1.m(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f11897j0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.s
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(l(), this.f11896i0));
        throw null;
    }

    @Override // androidx.fragment.app.s
    public final void K(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f11896i0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f11897j0);
    }
}
