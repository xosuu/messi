package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import g4.a0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import o0.f1;
import o0.g0;
import o0.g1;
import o0.j0;
import o0.u1;
import o0.v0;
import o0.v1;
import o0.w1;
import o0.x1;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class o<S> extends androidx.fragment.app.m {
    public v A0;
    public CalendarConstraints B0;
    public l C0;
    public int D0;
    public CharSequence E0;
    public boolean F0;
    public int G0;
    public int H0;
    public CharSequence I0;
    public int J0;
    public CharSequence K0;
    public TextView L0;
    public CheckableImageButton M0;
    public d5.g N0;
    public Button O0;
    public boolean P0;
    public CharSequence Q0;
    public CharSequence R0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final LinkedHashSet f11893x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final LinkedHashSet f11894y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f11895z0;

    public o() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f11893x0 = new LinkedHashSet();
        this.f11894y0 = new LinkedHashSet();
    }

    public static int f0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.p8);
        Month month = new Month(x.b());
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.pd);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.pr);
        int i10 = month.f11857f;
        return ((i10 - 1) * dimensionPixelOffset2) + (dimensionPixelSize * i10) + (dimensionPixelOffset * 2);
    }

    public static boolean g0(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(a0.y(R.attr.u6, context, l.class.getCanonicalName()).data, new int[]{i10});
        boolean z9 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z9;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.s
    public final void A(Bundle bundle) {
        super.A(bundle);
        if (bundle == null) {
            bundle = this.f893s;
        }
        this.f11895z0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        fb1.m(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.B0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        fb1.m(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.D0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.E0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.G0 = bundle.getInt("INPUT_MODE_KEY");
        this.H0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.I0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.J0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.K0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence text = this.E0;
        if (text == null) {
            text = T().getResources().getText(this.D0);
        }
        this.Q0 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.R0 = text;
    }

    @Override // androidx.fragment.app.s
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.F0 ? R.layout.df : R.layout.de, viewGroup);
        Context context = viewInflate.getContext();
        if (this.F0) {
            viewInflate.findViewById(R.id.oc).setLayoutParams(new LinearLayout.LayoutParams(f0(context), -2));
        } else {
            viewInflate.findViewById(R.id.od).setLayoutParams(new LinearLayout.LayoutParams(f0(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.oo);
        WeakHashMap weakHashMap = v0.f16075a;
        g0.f(textView, 1);
        this.M0 = (CheckableImageButton) viewInflate.findViewById(R.id.oq);
        this.L0 = (TextView) viewInflate.findViewById(R.id.ou);
        this.M0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.M0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, p7.q.g(context, R.drawable.gs));
        stateListDrawable.addState(new int[0], p7.q.g(context, R.drawable.gu));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.M0.setChecked(this.G0 != 0);
        v0.q(this.M0, null);
        CheckableImageButton checkableImageButton2 = this.M0;
        this.M0.setContentDescription(checkableImageButton2.isChecked() ? checkableImageButton2.getContext().getString(R.string.oe) : checkableImageButton2.getContext().getString(R.string.og));
        this.M0.setOnClickListener(new n(this));
        this.O0 = (Button) viewInflate.findViewById(R.id.fu);
        e0();
        throw null;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.s
    public final void K(Bundle bundle) {
        super.K(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f11895z0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        CalendarConstraints calendarConstraints = this.B0;
        b bVar = new b();
        int i10 = b.f11861b;
        int i11 = b.f11861b;
        long j10 = calendarConstraints.f11845a.f11859q;
        long j11 = calendarConstraints.f11846b.f11859q;
        bVar.f11862a = Long.valueOf(calendarConstraints.f11848f.f11859q);
        int i12 = calendarConstraints.f11849h;
        Month month = this.C0.f11882k0;
        if (month != null) {
            bVar.f11862a = Long.valueOf(month.f11859q);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", calendarConstraints.f11847d);
        Month monthE = Month.e(j10);
        Month monthE2 = Month.e(j11);
        CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l9 = bVar.f11862a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(monthE, monthE2, dateValidator, l9 == null ? null : Month.e(l9.longValue()), i12));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.D0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.E0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.H0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.I0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.J0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.K0);
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.s
    public final void L() {
        v pVar;
        d5.e w1Var;
        d5.e w1Var2;
        super.L();
        Dialog dialog = this.f829s0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.F0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.N0);
            if (!this.P0) {
                View viewFindViewById = U().findViewById(R.id.jo);
                Integer numValueOf = viewFindViewById.getBackground() instanceof ColorDrawable ? Integer.valueOf(((ColorDrawable) viewFindViewById.getBackground()).getColor()) : null;
                int i10 = Build.VERSION.SDK_INT;
                boolean z9 = false;
                boolean z10 = numValueOf == null || numValueOf.intValue() == 0;
                int iH = a0.h(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z10) {
                    numValueOf = Integer.valueOf(iH);
                }
                Integer numValueOf2 = Integer.valueOf(iH);
                if (i10 >= 30) {
                    g1.a(window, false);
                } else {
                    f1.a(window, false);
                }
                int iD = i10 < 23 ? g0.a.d(a0.h(window.getContext(), android.R.attr.statusBarColor, -16777216), NotificationCompat.FLAG_HIGH_PRIORITY) : 0;
                int iD2 = i10 < 27 ? g0.a.d(a0.h(window.getContext(), android.R.attr.navigationBarColor, -16777216), NotificationCompat.FLAG_HIGH_PRIORITY) : 0;
                window.setStatusBarColor(iD);
                window.setNavigationBarColor(iD2);
                boolean z11 = a0.n(iD) || (iD == 0 && a0.n(numValueOf.intValue()));
                View decorView = window.getDecorView();
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 30) {
                    w1Var = new x1(window);
                } else {
                    w1Var = i11 >= 26 ? new w1(window, decorView) : i11 >= 23 ? new v1(window, decorView) : new u1(window, decorView);
                }
                w1Var.s(z11);
                boolean zN = a0.n(numValueOf2.intValue());
                if (a0.n(iD2) || (iD2 == 0 && zN)) {
                    z9 = true;
                }
                View decorView2 = window.getDecorView();
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 30) {
                    w1Var2 = new x1(window);
                } else {
                    w1Var2 = i12 >= 26 ? new w1(window, decorView2) : i12 >= 23 ? new v1(window, decorView2) : new u1(window, decorView2);
                }
                w1Var2.r(z9);
                int paddingTop = viewFindViewById.getPaddingTop();
                int i13 = viewFindViewById.getLayoutParams().height;
                androidx.activity.result.h hVar = new androidx.activity.result.h();
                hVar.f201f = this;
                hVar.f198a = i13;
                hVar.f200d = viewFindViewById;
                hVar.f199b = paddingTop;
                WeakHashMap weakHashMap = v0.f16075a;
                j0.u(viewFindViewById, hVar);
                this.P0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = r().getDimensionPixelOffset(R.dimen.pf);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.N0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView3 = window.getDecorView();
            Dialog dialog2 = this.f829s0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView3.setOnTouchListener(new u4.a(dialog2, rect));
        }
        T();
        int i14 = this.f11895z0;
        if (i14 == 0) {
            e0();
            throw null;
        }
        e0();
        CalendarConstraints calendarConstraints = this.B0;
        l lVar = new l();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i14);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.f11848f);
        lVar.W(bundle);
        this.C0 = lVar;
        boolean zIsChecked = this.M0.isChecked();
        if (zIsChecked) {
            e0();
            CalendarConstraints calendarConstraints2 = this.B0;
            pVar = new p();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i14);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
            pVar.W(bundle2);
        } else {
            pVar = this.C0;
        }
        this.A0 = pVar;
        this.L0.setText((zIsChecked && r().getConfiguration().orientation == 2) ? this.R0 : this.Q0);
        e0();
        l();
        throw null;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.s
    public final void M() {
        this.A0.f11911h0.clear();
        super.M();
    }

    @Override // androidx.fragment.app.m
    public final Dialog b0() {
        Context contextT = T();
        T();
        int i10 = this.f11895z0;
        if (i10 == 0) {
            e0();
            throw null;
        }
        Dialog dialog = new Dialog(contextT, i10);
        Context context = dialog.getContext();
        this.F0 = g0(context, android.R.attr.windowFullscreen);
        int i11 = a0.y(R.attr.ho, context, o.class.getCanonicalName()).data;
        d5.g gVar = new d5.g(context, null, R.attr.u6, R.style.a1r);
        this.N0 = gVar;
        gVar.j(context);
        this.N0.l(ColorStateList.valueOf(i11));
        d5.g gVar2 = this.N0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = v0.f16075a;
        gVar2.k(j0.i(decorView));
        return dialog;
    }

    public final void e0() {
        fb1.m(this.f893s.getParcelable("DATE_SELECTOR_KEY"));
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f11893x0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f11894y0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.S;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
