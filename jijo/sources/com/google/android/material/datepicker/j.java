package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import m1.p0;
import m1.t0;

/* JADX INFO: loaded from: classes.dex */
public final class j extends t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f11876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f11877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f11878c;

    public j(l lVar, u uVar, MaterialButton materialButton) {
        this.f11878c = lVar;
        this.f11876a = uVar;
        this.f11877b = materialButton;
    }

    @Override // m1.t0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            recyclerView.announceForAccessibility(this.f11877b.getText());
        }
    }

    @Override // m1.t0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int iF0;
        l lVar = this.f11878c;
        if (i10 < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) lVar.f11886o0.getLayoutManager();
            View viewH0 = linearLayoutManager.H0(0, linearLayoutManager.v(), false);
            iF0 = viewH0 == null ? -1 : p0.D(viewH0);
        } else {
            iF0 = ((LinearLayoutManager) lVar.f11886o0.getLayoutManager()).F0();
        }
        u uVar = this.f11876a;
        Calendar calendarA = x.a(uVar.f11908d.f11845a.f11854a);
        calendarA.add(2, iF0);
        lVar.f11882k0 = new Month(calendarA);
        Calendar calendarA2 = x.a(uVar.f11908d.f11845a.f11854a);
        calendarA2.add(2, iF0);
        this.f11877b.setText(new Month(calendarA2).f());
    }
}
