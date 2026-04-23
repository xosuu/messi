package com.codetroopers.betterpickers.radialtimepicker;

import a3.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.text.format.DateUtils;
import android.text.format.Time;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import e3.b;
import e3.c;
import e3.e;
import e3.f;
import v5.g;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class RadialPickerLayout extends FrameLayout implements View.OnTouchListener {
    public final f A;
    public final e B;
    public final e C;
    public final View D;
    public final int[] E;
    public boolean F;
    public int G;
    public boolean H;
    public boolean I;
    public int J;
    public float K;
    public float L;
    public final AccessibilityManager M;
    public g N;
    public final Handler O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1724b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1725d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f1726f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f1727h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1728q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1729s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1730t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1731u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1732v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1733w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b f1734x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e3.a f1735y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final f f1736z;

    public RadialPickerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G = -1;
        this.O = new Handler();
        setOnTouchListener(this);
        this.f1723a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f1724b = ViewConfiguration.getTapTimeout();
        this.H = false;
        b bVar = new b(context);
        this.f1734x = bVar;
        addView(bVar);
        e3.a aVar = new e3.a(context);
        this.f1735y = aVar;
        addView(aVar);
        f fVar = new f(context);
        this.f1736z = fVar;
        addView(fVar);
        f fVar2 = new f(context);
        this.A = fVar2;
        addView(fVar2);
        e eVar = new e(context);
        this.B = eVar;
        addView(eVar);
        e eVar2 = new e(context);
        this.C = eVar2;
        addView(eVar2);
        this.E = new int[361];
        int i10 = 8;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (true) {
            int i14 = 4;
            if (i11 >= 361) {
                this.f1725d = -1;
                this.F = true;
                View view = new View(context);
                this.D = view;
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                view.setBackgroundColor(getResources().getColor(R.color.aj));
                view.setVisibility(4);
                addView(view);
                this.M = (AccessibilityManager) context.getSystemService("accessibility");
                this.f1728q = false;
                return;
            }
            this.E[i11] = i12;
            if (i13 == i10) {
                i12 += 6;
                if (i12 == 360) {
                    i14 = 7;
                } else if (i12 % 30 == 0) {
                    i14 = 14;
                }
                i10 = i14;
                i13 = 1;
            } else {
                i13++;
            }
            i11++;
        }
    }

    public static int e(int i10, int i11) {
        int i12 = (i10 / 30) * 30;
        int i13 = i12 + 30;
        if (i11 != 1) {
            if (i11 == -1) {
                return i10 == i12 ? i12 - 30 : i12;
            }
            if (i10 - i12 < i13 - i10) {
                return i12;
            }
        }
        return i13;
    }

    private int getCurrentlyShowingValue() {
        int currentItemShowing = getCurrentItemShowing();
        if (currentItemShowing == 0) {
            return this.f1729s;
        }
        if (currentItemShowing == 1) {
            return this.f1730t;
        }
        return -1;
    }

    public final int a(float f10, float f11, boolean z9, Boolean[] boolArr) {
        int currentItemShowing = getCurrentItemShowing();
        if (currentItemShowing == 0) {
            return this.B.a(f10, f11, z9, boolArr);
        }
        if (currentItemShowing == 1) {
            return this.C.a(f10, f11, z9, boolArr);
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(int r5, boolean r6, boolean r7, boolean r8) {
        /*
            r4 = this;
            r0 = -1
            if (r5 != r0) goto L4
            return r0
        L4:
            int r1 = r4.getCurrentItemShowing()
            r2 = 1
            r3 = 0
            if (r7 != 0) goto L16
            if (r1 != r2) goto L16
            int[] r7 = r4.E
            if (r7 != 0) goto L13
            goto L1a
        L13:
            r0 = r7[r5]
            goto L1a
        L16:
            int r0 = e(r5, r3)
        L1a:
            if (r1 != 0) goto L21
            e3.e r5 = r4.B
            r7 = 30
            goto L24
        L21:
            e3.e r5 = r4.C
            r7 = 6
        L24:
            r5.c(r0, r6, r8)
            r5.invalidate()
            r5 = 360(0x168, float:5.04E-43)
            if (r1 != 0) goto L41
            boolean r8 = r4.f1731u
            if (r8 == 0) goto L3e
            if (r0 != 0) goto L39
            if (r6 == 0) goto L39
        L36:
            r3 = 360(0x168, float:5.04E-43)
            goto L47
        L39:
            if (r0 != r5) goto L46
            if (r6 != 0) goto L46
            goto L47
        L3e:
            if (r0 != 0) goto L46
            goto L36
        L41:
            if (r0 != r5) goto L46
            if (r1 != r2) goto L46
            goto L47
        L46:
            r3 = r0
        L47:
            int r5 = r3 / r7
            if (r1 != 0) goto L55
            boolean r7 = r4.f1731u
            if (r7 == 0) goto L55
            if (r6 != 0) goto L55
            if (r3 == 0) goto L55
            int r5 = r5 + 12
        L55:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.codetroopers.betterpickers.radialtimepicker.RadialPickerLayout.b(int, boolean, boolean, boolean):int");
    }

    public final void c(int i10, int i11) {
        if (i10 == 0) {
            d(0, i11);
            int i12 = (i11 % 12) * 30;
            boolean z9 = this.f1731u && i11 <= 12 && i11 != 0;
            e eVar = this.B;
            eVar.c(i12, z9, false);
            eVar.invalidate();
            return;
        }
        if (i10 == 1) {
            d(1, i11);
            e eVar2 = this.C;
            eVar2.c(i11 * 6, false, false);
            eVar2.invalidate();
        }
    }

    public final void d(int i10, int i11) {
        if (i10 == 0) {
            this.f1729s = i11;
            return;
        }
        if (i10 == 1) {
            this.f1730t = i11;
            return;
        }
        if (i10 == 2) {
            if (i11 == 0) {
                this.f1729s %= 12;
            } else if (i11 == 1) {
                this.f1729s = (this.f1729s % 12) + 12;
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        accessibilityEvent.getText().clear();
        Time time = new Time();
        time.hour = getHours();
        time.minute = getMinutes();
        accessibilityEvent.getText().add(DateUtils.formatDateTime(getContext(), time.normalize(true), this.f1731u ? 129 : 1));
        return true;
    }

    public int getCurrentItemShowing() {
        int i10 = this.f1733w;
        if (i10 == 0 || i10 == 1) {
            return i10;
        }
        return -1;
    }

    public int getHours() {
        return this.f1729s;
    }

    public int getIsCurrentlyAmOrPm() {
        int i10 = this.f1729s;
        if (i10 < 12) {
            return 0;
        }
        return i10 < 24 ? 1 : -1;
    }

    public int getMinutes() {
        return this.f1730t;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(NotificationCompat.FLAG_BUBBLE);
        accessibilityNodeInfo.addAction(8192);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        int iMin = Math.min(size, size2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, mode), View.MeasureSpec.makeMeasureSpec(iMin, mode2));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.codetroopers.betterpickers.radialtimepicker.RadialPickerLayout.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0048  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean performAccessibilityAction(int r5, android.os.Bundle r6) {
        /*
            r4 = this;
            boolean r6 = super.performAccessibilityAction(r5, r6)
            r0 = 1
            if (r6 == 0) goto L8
            return r0
        L8:
            r6 = 4096(0x1000, float:5.74E-42)
            r1 = 0
            if (r5 != r6) goto Lf
            r5 = 1
            goto L16
        Lf:
            r6 = 8192(0x2000, float:1.148E-41)
            if (r5 != r6) goto L15
            r5 = -1
            goto L16
        L15:
            r5 = 0
        L16:
            if (r5 == 0) goto L56
            int r6 = r4.getCurrentlyShowingValue()
            int r2 = r4.getCurrentItemShowing()
            if (r2 != 0) goto L27
            int r6 = r6 % 12
            r3 = 30
            goto L2c
        L27:
            if (r2 != r0) goto L2b
            r3 = 6
            goto L2c
        L2b:
            r3 = 0
        L2c:
            int r6 = r6 * r3
            int r5 = e(r6, r5)
            int r5 = r5 / r3
            if (r2 != 0) goto L41
            boolean r6 = r4.f1731u
            if (r6 == 0) goto L3d
            r6 = 23
        L3b:
            r3 = 0
            goto L44
        L3d:
            r6 = 12
            r3 = 1
            goto L44
        L41:
            r6 = 55
            goto L3b
        L44:
            if (r5 <= r6) goto L48
            r5 = r3
            goto L4b
        L48:
            if (r5 >= r3) goto L4b
            r5 = r6
        L4b:
            r4.c(r2, r5)
            e3.c r6 = r4.f1727h
            e3.j r6 = (e3.j) r6
            r6.m0(r2, r5, r1)
            return r0
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.codetroopers.betterpickers.radialtimepicker.RadialPickerLayout.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    public void setAmOrPm(int i10) {
        e3.a aVar = this.f1735y;
        aVar.setAmOrPm(i10);
        aVar.invalidate();
        d(2, i10);
    }

    public void setOnValueSelectedListener(c cVar) {
        this.f1727h = cVar;
    }

    public void setTheme(TypedArray typedArray) {
        this.f1734x.setTheme(typedArray);
        this.f1735y.setTheme(typedArray);
        this.f1736z.setTheme(typedArray);
        this.A.setTheme(typedArray);
        this.B.setTheme(typedArray);
        this.C.setTheme(typedArray);
    }
}
