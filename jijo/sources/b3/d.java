package b3;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.text.format.DateUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.w;
import b7.u;
import com.codetroopers.betterpickers.calendardatepicker.AccessibleDateAnimator;
import com.codetroopers.betterpickers.calendardatepicker.MonthAdapter$CalendarDay;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Locale;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class d extends androidx.fragment.app.m implements View.OnClickListener, a {
    public static final MonthAdapter$CalendarDay Y0 = new MonthAdapter$CalendarDay(1900, 0, 1);
    public static final MonthAdapter$CalendarDay Z0 = new MonthAdapter$CalendarDay(2100, 11, 31);

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final SimpleDateFormat f1255a1 = new SimpleDateFormat("yyyy", Locale.getDefault());

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final SimpleDateFormat f1256b1 = new SimpleDateFormat("dd", Locale.getDefault());
    public final HashSet A0;
    public AccessibleDateAnimator B0;
    public LinearLayout C0;
    public TextView D0;
    public LinearLayout E0;
    public TextView F0;
    public TextView G0;
    public TextView H0;
    public j I0;
    public o J0;
    public int K0;
    public int L0;
    public MonthAdapter$CalendarDay M0;
    public MonthAdapter$CalendarDay N0;
    public SparseArray O0;
    public a3.a P0;
    public boolean Q0;
    public String R0;
    public String S0;
    public String T0;
    public String U0;
    public int V0;
    public int W0;
    public int X0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Calendar f1257x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public x4.a f1258y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public f5.b f1259z0;

    public d() {
        Calendar calendar = Calendar.getInstance();
        this.f1257x0 = calendar;
        this.A0 = new HashSet();
        this.K0 = -1;
        this.L0 = calendar.getFirstDayOfWeek();
        this.M0 = Y0;
        this.N0 = Z0;
        this.Q0 = true;
        this.V0 = R.style.h7;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.s
    public final void A(Bundle bundle) {
        super.A(bundle);
        c().getWindow().setSoftInputMode(3);
        if (bundle != null) {
            int i10 = bundle.getInt("year");
            Calendar calendar = this.f1257x0;
            calendar.set(1, i10);
            calendar.set(2, bundle.getInt("month"));
            calendar.set(5, bundle.getInt("day"));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.fragment.app.s
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        int i12;
        if (this.f825o0) {
            this.f829s0.getWindow().requestFeature(1);
        }
        View viewInflate = layoutInflater.inflate(R.layout.as, viewGroup, false);
        this.C0 = (LinearLayout) viewInflate.findViewById(R.id.gs);
        this.D0 = (TextView) viewInflate.findViewById(R.id.gn);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.gp);
        this.E0 = linearLayout;
        linearLayout.setOnClickListener(this);
        this.F0 = (TextView) viewInflate.findViewById(R.id.go);
        this.G0 = (TextView) viewInflate.findViewById(R.id.gm);
        TextView textView = (TextView) viewInflate.findViewById(R.id.gq);
        this.H0 = textView;
        textView.setOnClickListener(this);
        if (bundle != null) {
            this.L0 = bundle.getInt("week_start");
            this.M0 = new MonthAdapter$CalendarDay(bundle.getLong("date_start"));
            this.N0 = new MonthAdapter$CalendarDay(bundle.getLong("date_end"));
            i10 = bundle.getInt("current_view");
            i11 = bundle.getInt("list_position");
            i12 = bundle.getInt("list_position_offset");
            this.V0 = bundle.getInt("theme");
            this.O0 = bundle.getSparseParcelableArray("disabled_days");
        } else {
            i10 = 0;
            i11 = -1;
            i12 = 0;
        }
        w wVarC = c();
        j jVar = new j(wVarC);
        jVar.f1265b = new MonthAdapter$CalendarDay();
        jVar.f1267f = new MonthAdapter$CalendarDay();
        jVar.f1268h = 0;
        jVar.f1269q = 0;
        jVar.f1272u = new e(jVar);
        jVar.f1264a = new Handler();
        jVar.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
        jVar.setDrawSelectorOnTop(false);
        jVar.setCacheColorHint(0);
        jVar.setDivider(null);
        jVar.setItemsCanFocus(true);
        jVar.setFastScrollEnabled(false);
        jVar.setVerticalScrollBarEnabled(false);
        jVar.setOnScrollListener(jVar);
        jVar.setFadingEdgeLength(0);
        jVar.setFriction(ViewConfiguration.getScrollFriction() * 1.0f);
        jVar.setController(this);
        this.I0 = jVar;
        this.J0 = new o(wVarC, this);
        Resources resourcesR = r();
        TypedArray typedArrayObtainStyledAttributes = c().obtainStyledAttributes(this.V0, a3.b.f18b);
        this.R0 = resourcesR.getString(R.string.fv);
        this.S0 = resourcesR.getString(R.string.vc);
        this.T0 = resourcesR.getString(R.string.a0q);
        this.U0 = resourcesR.getString(R.string.vg);
        int color = typedArrayObtainStyledAttributes.getColor(9, d0.f.b(c(), R.color.ak));
        int color2 = typedArrayObtainStyledAttributes.getColor(12, d0.f.b(c(), R.color.ak));
        int color3 = typedArrayObtainStyledAttributes.getColor(2, d0.f.b(c(), R.color.ak));
        int color4 = typedArrayObtainStyledAttributes.getColor(5, d0.f.b(c(), R.color.ak));
        int color5 = typedArrayObtainStyledAttributes.getColor(6, d0.f.b(c(), R.color.a9));
        this.W0 = typedArrayObtainStyledAttributes.getColor(10, d0.f.b(c(), R.color.ak));
        this.X0 = typedArrayObtainStyledAttributes.getColor(11, d0.f.b(c(), R.color.s_));
        AccessibleDateAnimator accessibleDateAnimator = (AccessibleDateAnimator) viewInflate.findViewById(R.id.cf);
        this.B0 = accessibleDateAnimator;
        accessibleDateAnimator.addView(this.I0);
        this.B0.addView(this.J0);
        this.B0.setDateMillis(this.f1257x0.getTimeInMillis());
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        int i13 = i10;
        alphaAnimation.setDuration(300L);
        this.B0.setInAnimation(alphaAnimation);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(300L);
        this.B0.setOutAnimation(alphaAnimation2);
        Button button = (Button) viewInflate.findViewById(R.id.hk);
        button.setTextColor(color5);
        button.setOnClickListener(new b(this, 0));
        Button button2 = (Button) viewInflate.findViewById(R.id.dw);
        button2.setTextColor(color5);
        button2.setOnClickListener(new b(this, 1));
        viewInflate.findViewById(R.id.q9).setBackgroundColor(color4);
        int i14 = 0;
        g0(false);
        f0(i13);
        if (i11 != -1) {
            if (i13 == 0) {
                j jVar2 = this.I0;
                jVar2.clearFocus();
                jVar2.post(new e(jVar2, i11));
                jVar2.onScrollStateChanged(jVar2, 0);
            } else if (i13 == 1) {
                o oVar = this.J0;
                oVar.getClass();
                oVar.post(new m(oVar, i11, i12, i14));
            }
        }
        this.P0 = new a3.a(wVarC);
        this.I0.setTheme(typedArrayObtainStyledAttributes);
        this.J0.setTheme(typedArrayObtainStyledAttributes);
        this.C0.setBackgroundColor(color);
        this.H0.setBackgroundColor(color);
        this.E0.setBackgroundColor(color);
        TextView textView2 = this.D0;
        if (textView2 != null) {
            textView2.setBackgroundColor(color2);
        }
        viewInflate.setBackgroundColor(color3);
        this.J0.setBackgroundColor(color3);
        this.I0.setBackgroundColor(color3);
        return viewInflate;
    }

    @Override // androidx.fragment.app.s
    public final void I() {
        this.Q = true;
        a3.a aVar = this.P0;
        aVar.f13c = null;
        aVar.f11a.getContentResolver().unregisterContentObserver(aVar.f12b);
    }

    @Override // androidx.fragment.app.s
    public final void J() {
        this.Q = true;
        this.P0.a();
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.s
    public final void K(Bundle bundle) {
        int firstVisiblePosition;
        super.K(bundle);
        Calendar calendar = this.f1257x0;
        bundle.putInt("year", calendar.get(1));
        bundle.putInt("month", calendar.get(2));
        bundle.putInt("day", calendar.get(5));
        bundle.putInt("week_start", this.L0);
        bundle.putLong("date_start", this.M0.e());
        bundle.putLong("date_end", this.N0.e());
        bundle.putInt("current_view", this.K0);
        bundle.putInt("theme", this.V0);
        int i10 = this.K0;
        if (i10 == 0) {
            firstVisiblePosition = this.I0.getMostVisiblePosition();
        } else if (i10 == 1) {
            firstVisiblePosition = this.J0.getFirstVisiblePosition();
            bundle.putInt("list_position_offset", this.J0.getFirstPositionOffset());
        } else {
            firstVisiblePosition = -1;
        }
        bundle.putInt("list_position", firstVisiblePosition);
        bundle.putSparseParcelableArray("disabled_days", this.O0);
    }

    public final MonthAdapter$CalendarDay e0() {
        MonthAdapter$CalendarDay monthAdapter$CalendarDay = new MonthAdapter$CalendarDay();
        Calendar calendar = this.f1257x0;
        monthAdapter$CalendarDay.f1616h = calendar.get(1);
        monthAdapter$CalendarDay.f1617q = calendar.get(2);
        monthAdapter$CalendarDay.f1618s = calendar.get(5);
        return monthAdapter$CalendarDay;
    }

    public final void f0(int i10) {
        long timeInMillis = this.f1257x0.getTimeInMillis();
        if (i10 == 0) {
            v5.l lVarP = u.p(this.E0, 0.9f, 1.05f);
            if (this.Q0) {
                lVarP.f17879x = 500L;
                this.Q0 = false;
            }
            this.I0.a();
            if (this.K0 != i10) {
                this.E0.setSelected(true);
                this.H0.setSelected(false);
                this.G0.setTextColor(this.W0);
                this.F0.setTextColor(this.W0);
                this.H0.setTextColor(this.X0);
                this.B0.setDisplayedChild(0);
                this.K0 = i10;
            }
            lVarP.f();
            String dateTime = DateUtils.formatDateTime(c(), timeInMillis, 16);
            this.B0.setContentDescription(this.R0 + ": " + dateTime);
            u.B(this.B0, this.S0);
            return;
        }
        if (i10 != 1) {
            return;
        }
        v5.l lVarP2 = u.p(this.H0, 0.85f, 1.1f);
        if (this.Q0) {
            lVarP2.f17879x = 500L;
            this.Q0 = false;
        }
        this.J0.a();
        if (this.K0 != i10) {
            this.E0.setSelected(false);
            this.H0.setSelected(true);
            this.G0.setTextColor(this.X0);
            this.F0.setTextColor(this.X0);
            this.H0.setTextColor(this.W0);
            this.B0.setDisplayedChild(1);
            this.K0 = i10;
        }
        lVarP2.f();
        String str = f1255a1.format(Long.valueOf(timeInMillis));
        this.B0.setContentDescription(this.T0 + ": " + ((Object) str));
        u.B(this.B0, this.U0);
    }

    public final void g0(boolean z9) {
        TextView textView = this.D0;
        Calendar calendar = this.f1257x0;
        if (textView != null) {
            textView.setText(calendar.getDisplayName(7, 2, Locale.getDefault()).toUpperCase(Locale.getDefault()));
        }
        this.F0.setText(calendar.getDisplayName(2, 1, Locale.getDefault()).toUpperCase(Locale.getDefault()));
        this.G0.setText(f1256b1.format(calendar.getTime()));
        this.H0.setText(f1255a1.format(calendar.getTime()));
        long timeInMillis = calendar.getTimeInMillis();
        this.B0.setDateMillis(timeInMillis);
        this.E0.setContentDescription(DateUtils.formatDateTime(c(), timeInMillis, 24));
        if (z9) {
            u.B(this.B0, DateUtils.formatDateTime(c(), timeInMillis, 20));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.P0.b();
        if (view.getId() == R.id.gq) {
            f0(1);
        } else if (view.getId() == R.id.gp) {
            f0(0);
        }
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        f5.b bVar = this.f1259z0;
        if (bVar == null || !((s8.h) bVar.f13091b).f16758b.f17200i0.getText().toString().equals("Expired")) {
            return;
        }
        ((s8.h) bVar.f13091b).f16758b.f17200i0.setChecked(false);
    }
}
