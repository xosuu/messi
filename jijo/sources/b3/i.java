package b3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.format.DateUtils;
import android.text.format.Time;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import b7.u;
import com.codetroopers.betterpickers.calendardatepicker.MonthAdapter$CalendarDay;
import java.security.InvalidParameterException;
import java.util.Calendar;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Locale;
import o0.d0;
import o0.v0;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends View {
    public static int U;
    public static int V;
    public static int W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static int f1276a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static int f1277b0;
    public boolean A;
    public int B;
    public SparseArray C;
    public int D;
    public int E;
    public final int F;
    public int G;
    public int H;
    public int I;
    public final Calendar J;
    public final Calendar K;
    public final g L;
    public int M;
    public h N;
    public final boolean O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1279b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f1280d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Paint f1281f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Paint f1282h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Paint f1283q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Paint f1284s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Paint f1285t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Formatter f1286u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final StringBuilder f1287v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1288w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1289x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1290y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f1291z;

    public i(Context context) {
        super(context);
        this.f1291z = 32;
        this.A = false;
        this.B = -1;
        this.D = -1;
        this.E = 1;
        this.F = 7;
        this.G = 7;
        this.H = -1;
        this.I = -1;
        this.M = 6;
        this.T = 0;
        Resources resources = context.getResources();
        this.K = Calendar.getInstance();
        this.J = Calendar.getInstance();
        this.f1278a = resources.getString(R.string.fu);
        this.f1279b = resources.getString(R.string.us);
        this.P = resources.getColor(R.color.bt);
        this.Q = resources.getColor(R.color.bs);
        this.R = resources.getColor(R.color.a9);
        this.S = resources.getColor(R.color.ac);
        resources.getColor(R.color.bt);
        StringBuilder sb = new StringBuilder(50);
        this.f1287v = sb;
        this.f1286u = new Formatter(sb, Locale.getDefault());
        U = resources.getDimensionPixelSize(R.dimen.c_);
        V = resources.getDimensionPixelSize(R.dimen.nt);
        W = resources.getDimensionPixelSize(R.dimen.ns);
        f1276a0 = resources.getDimensionPixelOffset(R.dimen.nu);
        f1277b0 = resources.getDimensionPixelSize(R.dimen.c9);
        this.f1291z = (resources.getDimensionPixelOffset(R.dimen.c7) - f1276a0) / 6;
        l lVar = (l) this;
        g gVar = new g(lVar, lVar);
        this.L = gVar;
        v0.q(this, gVar);
        d0.s(this, 1);
        this.O = true;
        c();
    }

    private String getMonthAndYearString() {
        this.f1287v.setLength(0);
        long timeInMillis = this.J.getTimeInMillis();
        String string = DateUtils.formatDateRange(getContext(), this.f1286u, timeInMillis, timeInMillis, 52, Time.getCurrentTimezone()).toString();
        return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    public final int a() {
        int i10 = this.T;
        int i11 = this.E;
        if (i10 < i11) {
            i10 += this.F;
        }
        return i10 - i11;
    }

    public final int b(float f10, float f11) {
        float f12 = 0;
        if (f10 >= f12) {
            int i10 = this.f1290y;
            if (f10 <= i10) {
                int i11 = ((int) (f11 - f1276a0)) / this.f1291z;
                float f13 = f10 - f12;
                int i12 = this.F;
                int iA = (i11 * i12) + (((int) ((f13 * i12) / i10)) - a()) + 1;
                if (iA >= 1 && iA <= this.G) {
                    return iA;
                }
            }
        }
        return -1;
    }

    public final void c() {
        Paint paint = new Paint();
        this.f1281f = paint;
        paint.setFakeBoldText(true);
        this.f1281f.setAntiAlias(true);
        this.f1281f.setTextSize(V);
        this.f1281f.setTypeface(Typeface.create(this.f1279b, 1));
        this.f1281f.setColor(this.P);
        Paint paint2 = this.f1281f;
        Paint.Align align = Paint.Align.CENTER;
        paint2.setTextAlign(align);
        Paint paint3 = this.f1281f;
        Paint.Style style = Paint.Style.FILL;
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.f1282h = paint4;
        paint4.setFakeBoldText(true);
        this.f1282h.setAntiAlias(true);
        this.f1282h.setTextAlign(align);
        this.f1282h.setStyle(style);
        Paint paint5 = new Paint();
        this.f1283q = paint5;
        paint5.setFakeBoldText(true);
        this.f1283q.setAntiAlias(true);
        this.f1283q.setColor(this.R);
        this.f1283q.setTextAlign(align);
        this.f1283q.setStyle(style);
        this.f1283q.setAlpha(60);
        Paint paint6 = new Paint();
        this.f1284s = paint6;
        paint6.setFakeBoldText(true);
        this.f1284s.setAntiAlias(true);
        this.f1284s.setColor(this.S);
        this.f1284s.setTextAlign(align);
        this.f1284s.setStyle(style);
        this.f1284s.setAlpha(60);
        Paint paint7 = new Paint();
        this.f1285t = paint7;
        paint7.setAntiAlias(true);
        this.f1285t.setTextSize(W);
        this.f1285t.setColor(this.P);
        this.f1285t.setTypeface(Typeface.create(this.f1278a, 0));
        this.f1285t.setStyle(style);
        this.f1285t.setTextAlign(align);
        this.f1285t.setFakeBoldText(true);
        Paint paint8 = new Paint();
        this.f1280d = paint8;
        paint8.setAntiAlias(true);
        this.f1280d.setTextSize(U);
        this.f1280d.setStyle(style);
        this.f1280d.setTextAlign(align);
        this.f1280d.setFakeBoldText(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r9) {
        /*
            r8 = this;
            b3.h r0 = r8.N
            r1 = 1
            if (r0 == 0) goto L72
            com.codetroopers.betterpickers.calendardatepicker.MonthAdapter$CalendarDay r2 = new com.codetroopers.betterpickers.calendardatepicker.MonthAdapter$CalendarDay
            int r3 = r8.f1289x
            int r4 = r8.f1288w
            r2.<init>(r3, r4, r9)
            b3.k r0 = (b3.k) r0
            b3.a r3 = r0.f1293b
            b3.d r3 = (b3.d) r3
            com.codetroopers.betterpickers.calendardatepicker.MonthAdapter$CalendarDay r4 = r3.M0
            int r4 = r2.compareTo(r4)
            if (r4 < 0) goto L72
            com.codetroopers.betterpickers.calendardatepicker.MonthAdapter$CalendarDay r4 = r3.N0
            int r4 = r2.compareTo(r4)
            if (r4 > 0) goto L72
            android.util.SparseArray r4 = r3.O0
            if (r4 != 0) goto L29
            goto L3c
        L29:
            int r5 = r2.f1616h
            int r6 = r2.f1617q
            int r7 = r2.f1618s
            int r5 = r5 * 10000
            int r6 = r6 * 100
            int r6 = r6 + r5
            int r6 = r6 + r7
            int r4 = r4.indexOfKey(r6)
            if (r4 < 0) goto L3c
            goto L72
        L3c:
            a3.a r4 = r3.P0
            r4.b()
            int r4 = r2.f1616h
            int r5 = r2.f1617q
            int r6 = r2.f1618s
            java.util.Calendar r7 = r3.f1257x0
            r7.set(r1, r4)
            r4 = 2
            r7.set(r4, r5)
            r4 = 5
            r7.set(r4, r6)
            java.util.HashSet r4 = r3.A0
            java.util.Iterator r4 = r4.iterator()
        L5a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L6a
            java.lang.Object r5 = r4.next()
            b3.c r5 = (b3.c) r5
            r5.a()
            goto L5a
        L6a:
            r3.g0(r1)
            r0.f1294d = r2
            r0.notifyDataSetChanged()
        L72:
            b3.g r0 = r8.L
            r0.w(r9, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.i.d(int):void");
    }

    public MonthAdapter$CalendarDay getAccessibilityFocus() {
        int i10 = this.L.f17682k;
        if (i10 >= 0) {
            return new MonthAdapter$CalendarDay(this.f1289x, this.f1288w, i10);
        }
        return null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        canvas.drawText(getMonthAndYearString(), this.f1290y / 2, (V / 3) + ((f1276a0 - W) / 2), this.f1281f);
        int i11 = f1276a0 - (W / 2);
        int i12 = this.f1290y;
        int i13 = this.F;
        int i14 = i13 * 2;
        int i15 = i12 / i14;
        for (int i16 = 0; i16 < i13; i16++) {
            int i17 = (this.E + i16) % i13;
            Calendar calendar = this.K;
            calendar.set(7, i17);
            canvas.drawText(calendar.getDisplayName(7, 1, Locale.getDefault()).toUpperCase(Locale.getDefault()), ((i16 * 2) + 1) * i15, i11, this.f1285t);
        }
        int i18 = (((this.f1291z + U) / 2) - 1) + f1276a0;
        int i19 = this.f1290y / i14;
        int iA = a();
        int i20 = 1;
        while (i20 <= this.G) {
            int i21 = ((iA * 2) + 1) * i19;
            int i22 = (this.f1291z + U) / 2;
            int i23 = (this.f1288w * 100) + (this.f1289x * 10000) + i20;
            int i24 = this.I;
            boolean z9 = (i24 < 0 || i20 <= i24) && ((i10 = this.H) < 0 || i20 >= i10);
            SparseArray sparseArray = this.C;
            if (sparseArray != null) {
                z9 = z9 && sparseArray.indexOfKey(i23) < 0;
            }
            l lVar = (l) this;
            if (lVar.B == i20) {
                canvas.drawCircle(i21, i18 - (U / 3), f1277b0, lVar.f1283q);
            }
            if (lVar.A && lVar.D == i20) {
                lVar.f1280d.setColor(lVar.R);
            } else if (z9) {
                lVar.f1280d.setColor(lVar.P);
            } else {
                lVar.f1280d.setColor(lVar.Q);
            }
            canvas.drawText(String.format("%d", Integer.valueOf(i20)), i21, i18, lVar.f1280d);
            iA++;
            if (iA == i13) {
                i18 += this.f1291z;
                iA = 0;
            }
            i20++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), (this.f1291z * this.M) + f1276a0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        this.f1290y = i10;
        this.L.n();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int iB;
        if (motionEvent.getAction() == 1 && (iB = b(motionEvent.getX(), motionEvent.getY())) >= 0) {
            d(iB);
        }
        return true;
    }

    @Override // android.view.View
    public void setAccessibilityDelegate(View.AccessibilityDelegate accessibilityDelegate) {
        if (this.O) {
            return;
        }
        super.setAccessibilityDelegate(accessibilityDelegate);
    }

    public void setDisabledDays(SparseArray<MonthAdapter$CalendarDay> sparseArray) {
        this.C = sparseArray;
    }

    public void setMonthParams(HashMap<String, Integer> map) {
        if (!map.containsKey("month") && !map.containsKey("year")) {
            throw new InvalidParameterException("You must specify month and year for this view");
        }
        setTag(map);
        if (map.containsKey("height")) {
            int iIntValue = map.get("height").intValue();
            this.f1291z = iIntValue;
            if (iIntValue < 10) {
                this.f1291z = 10;
            }
        }
        if (map.containsKey("selected_day")) {
            this.B = map.get("selected_day").intValue();
        }
        if (map.containsKey("range_min")) {
            this.H = map.get("range_min").intValue();
        }
        if (map.containsKey("range_max")) {
            this.I = map.get("range_max").intValue();
        }
        this.f1288w = map.get("month").intValue();
        this.f1289x = map.get("year").intValue();
        Time time = new Time(Time.getCurrentTimezone());
        time.setToNow();
        this.A = false;
        this.D = -1;
        int i10 = this.f1288w;
        Calendar calendar = this.J;
        calendar.set(2, i10);
        calendar.set(1, this.f1289x);
        calendar.set(5, 1);
        this.T = calendar.get(7);
        if (map.containsKey("week_start")) {
            this.E = map.get("week_start").intValue();
        } else {
            this.E = calendar.getFirstDayOfWeek();
        }
        this.G = u.l(this.f1288w, this.f1289x);
        int i11 = 0;
        while (i11 < this.G) {
            i11++;
            if (this.f1289x == time.year && this.f1288w == time.month && i11 == time.monthDay) {
                this.A = true;
                this.D = i11;
            }
        }
        int iA = a() + this.G;
        int i12 = this.F;
        this.M = (iA / i12) + (iA % i12 > 0 ? 1 : 0);
        this.L.n();
    }

    public void setOnDayClickListener(h hVar) {
        this.N = hVar;
    }

    public void setTheme(TypedArray typedArray) {
        typedArray.getColor(1, d0.f.b(getContext(), R.color.a1));
        this.R = typedArray.getColor(3, d0.f.b(getContext(), R.color.a9));
        this.P = typedArray.getColor(4, d0.f.b(getContext(), R.color.bs));
        this.Q = typedArray.getColor(8, d0.f.b(getContext(), R.color.bs));
        this.S = typedArray.getColor(7, d0.f.b(getContext(), R.color.ac));
        c();
    }
}
