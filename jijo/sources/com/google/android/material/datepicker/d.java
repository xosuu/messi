package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;
import m1.p0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f11868b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f11869d;

    public /* synthetic */ d(l lVar, u uVar, int i10) {
        this.f11867a = i10;
        this.f11869d = lVar;
        this.f11868b = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f11867a;
        u uVar = this.f11868b;
        l lVar = this.f11869d;
        switch (i10) {
            case 0:
                int iF0 = ((LinearLayoutManager) lVar.f11886o0.getLayoutManager()).F0() - 1;
                if (iF0 >= 0) {
                    Calendar calendarA = x.a(uVar.f11908d.f11845a.f11854a);
                    calendarA.add(2, iF0);
                    lVar.Z(new Month(calendarA));
                }
                break;
            default:
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) lVar.f11886o0.getLayoutManager();
                View viewH0 = linearLayoutManager.H0(0, linearLayoutManager.v(), false);
                int iD = (viewH0 == null ? -1 : p0.D(viewH0)) + 1;
                if (iD < lVar.f11886o0.getAdapter().a()) {
                    Calendar calendarA2 = x.a(uVar.f11908d.f11845a.f11854a);
                    calendarA2.add(2, iD);
                    lVar.Z(new Month(calendarA2));
                }
                break;
        }
    }
}
