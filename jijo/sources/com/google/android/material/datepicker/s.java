package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class s implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f11904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f11905b;

    public s(u uVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f11905b = uVar;
        this.f11904a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        MaterialCalendarGridView materialCalendarGridView = this.f11904a;
        r rVarA = materialCalendarGridView.a();
        if (i10 < rVarA.a() || i10 > rVarA.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i10).longValue() >= ((DateValidatorPointForward) ((h) this.f11905b.f11909f).f11874a.f11881j0.f11847d).f11852a) {
            throw null;
        }
    }
}
