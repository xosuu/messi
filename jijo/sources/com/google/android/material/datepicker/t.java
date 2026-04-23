package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.WeakHashMap;
import m1.e1;
import o0.v0;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class t extends e1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f11906t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final MaterialCalendarGridView f11907u;

    public t(LinearLayout linearLayout, boolean z9) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.o8);
        this.f11906t = textView;
        WeakHashMap weakHashMap = v0.f16075a;
        new o0.z(R.id.v7, 3).b(textView, Boolean.TRUE);
        this.f11907u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.o2);
        if (z9) {
            return;
        }
        textView.setVisibility(8);
    }
}
