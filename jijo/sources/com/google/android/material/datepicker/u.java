package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import m1.e1;
import m1.g0;
import m1.q0;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class u extends g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CalendarConstraints f11908d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f11909f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11910h;

    public u(ContextThemeWrapper contextThemeWrapper, CalendarConstraints calendarConstraints, h hVar) {
        Month month = calendarConstraints.f11845a;
        Month month2 = calendarConstraints.f11848f;
        if (month.f11854a.compareTo(month2.f11854a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (month2.f11854a.compareTo(calendarConstraints.f11846b.f11854a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int i10 = r.f11899f;
        int i11 = l.f11879t0;
        this.f11910h = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.p_) * i10) + (o.g0(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.p_) : 0);
        this.f11908d = calendarConstraints;
        this.f11909f = hVar;
        if (this.f15477a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f15478b = true;
    }

    @Override // m1.g0
    public final int a() {
        return this.f11908d.f11851s;
    }

    @Override // m1.g0
    public final long b(int i10) {
        Calendar calendarA = x.a(this.f11908d.f11845a.f11854a);
        calendarA.add(2, i10);
        return new Month(calendarA).f11854a.getTimeInMillis();
    }

    @Override // m1.g0
    public final void e(e1 e1Var, int i10) {
        t tVar = (t) e1Var;
        CalendarConstraints calendarConstraints = this.f11908d;
        Calendar calendarA = x.a(calendarConstraints.f11845a.f11854a);
        calendarA.add(2, i10);
        Month month = new Month(calendarA);
        tVar.f11906t.setText(month.f());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) tVar.f11907u.findViewById(R.id.o2);
        if (materialCalendarGridView.a() == null || !month.equals(materialCalendarGridView.a().f11901a)) {
            new r(month, calendarConstraints);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // m1.g0
    public final e1 f(RecyclerView recyclerView, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.d6, (ViewGroup) recyclerView, false);
        if (!o.g0(recyclerView.getContext(), android.R.attr.windowFullscreen)) {
            return new t(linearLayout, false);
        }
        linearLayout.setLayoutParams(new q0(-1, this.f11910h));
        return new t(linearLayout, true);
    }
}
