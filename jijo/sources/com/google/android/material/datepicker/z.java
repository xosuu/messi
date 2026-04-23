package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import m1.e1;
import m1.g0;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class z extends g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f11914d;

    public z(l lVar) {
        this.f11914d = lVar;
    }

    @Override // m1.g0
    public final int a() {
        return this.f11914d.f11881j0.f11850q;
    }

    @Override // m1.g0
    public final void e(e1 e1Var, int i10) {
        l lVar = this.f11914d;
        int i11 = lVar.f11881j0.f11845a.f11856d + i10;
        String str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i11));
        TextView textView = ((y) e1Var).f11913t;
        textView.setText(str);
        Context context = textView.getContext();
        textView.setContentDescription(x.b().get(1) == i11 ? String.format(context.getString(R.string.ny), Integer.valueOf(i11)) : String.format(context.getString(R.string.nz), Integer.valueOf(i11)));
        android.support.v4.media.b bVar = lVar.f11884m0;
        if (x.b().get(1) == i11) {
            Object obj = bVar.f98f;
        } else {
            Object obj2 = bVar.f96d;
        }
        throw null;
    }

    @Override // m1.g0
    public final e1 f(RecyclerView recyclerView, int i10) {
        return new y((TextView) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.d_, (ViewGroup) recyclerView, false));
    }
}
