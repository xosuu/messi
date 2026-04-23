package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class c extends BaseAdapter {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f11863f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Calendar f11864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11865b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11866d;

    static {
        f11863f = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public c() {
        Calendar calendarC = x.c(null);
        this.f11864a = calendarC;
        this.f11865b = calendarC.getMaximum(7);
        this.f11866d = calendarC.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f11865b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        int i11 = this.f11865b;
        if (i10 >= i11) {
            return null;
        }
        int i12 = i10 + this.f11866d;
        if (i12 > i11) {
            i12 -= i11;
        }
        return Integer.valueOf(i12);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.d2, viewGroup, false);
        }
        int i11 = i10 + this.f11866d;
        int i12 = this.f11865b;
        if (i11 > i12) {
            i11 -= i12;
        }
        Calendar calendar = this.f11864a;
        calendar.set(7, i11);
        textView.setText(calendar.getDisplayName(7, f11863f, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.ns), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public c(int i10) {
        Calendar calendarC = x.c(null);
        this.f11864a = calendarC;
        this.f11865b = calendarC.getMaximum(7);
        this.f11866d = i10;
    }
}
