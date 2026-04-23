package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public abstract class w9 implements v9 {
    public static volatile ja G;
    public float A;
    public float B;
    public final DisplayMetrics E;
    public final c1.d F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MotionEvent f10110a;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public double f10119v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public double f10120w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public double f10121x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f10122y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f10123z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedList f10111b = new LinkedList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f10112d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f10113f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f10114h = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f10115q = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f10116s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f10117t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f10118u = 0;
    public boolean C = false;
    public boolean D = false;

    public w9(Context context) {
        try {
            l9.b();
            this.E = context.getResources().getDisplayMetrics();
            if (((Boolean) zzba.zzc().a(eg.f4136t2)).booleanValue()) {
                this.F = new c1.d();
            }
        } catch (Throwable unused) {
        }
    }

    public abstract long a(StackTraceElement[] stackTraceElementArr);

    public abstract j8 b(Context context, View view, Activity activity);

    public abstract j8 c(Context context);

    public abstract ka d(MotionEvent motionEvent);

    public final void e() {
        this.f10116s = 0L;
        this.f10112d = 0L;
        this.f10113f = 0L;
        this.f10114h = 0L;
        this.f10115q = 0L;
        this.f10117t = 0L;
        this.f10118u = 0L;
        LinkedList linkedList = this.f10111b;
        if (linkedList.isEmpty()) {
            MotionEvent motionEvent = this.f10110a;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            linkedList.clear();
        }
        this.f10110a = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0155 A[Catch: Exception -> 0x0151, TRY_LEAVE, TryCatch #6 {Exception -> 0x0151, blocks: (B:63:0x010a, B:66:0x0117, B:74:0x013f, B:77:0x0155), top: B:103:0x010a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String f(android.content.Context r24, java.lang.String r25, int r26, android.view.View r27, android.app.Activity r28) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w9.f(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity):java.lang.String");
    }

    @Override // com.google.android.gms.internal.ads.v9
    public final String zze(Context context, String str, View view) {
        return f(context, str, 3, view, null);
    }

    @Override // com.google.android.gms.internal.ads.v9
    public final String zzf(Context context, String str, View view, Activity activity) {
        return f(context, str, 3, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.v9
    public final String zzg(Context context) {
        char[] cArr = la.f6543a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return f(context, null, 1, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.v9
    public final String zzh(Context context, View view, Activity activity) {
        return f(context, null, 2, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.v9
    public final synchronized void zzk(MotionEvent motionEvent) {
        Long l9;
        try {
            if (this.C) {
                e();
                this.C = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f10119v = 0.0d;
                this.f10120w = motionEvent.getRawX();
                this.f10121x = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d10 = rawX - this.f10120w;
                double d11 = rawY - this.f10121x;
                this.f10119v += Math.sqrt((d11 * d11) + (d10 * d10));
                this.f10120w = rawX;
                this.f10121x = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        this.f10110a = motionEventObtain;
                        this.f10111b.add(motionEventObtain);
                        if (this.f10111b.size() > 6) {
                            ((MotionEvent) this.f10111b.remove()).recycle();
                        }
                        this.f10114h++;
                        this.f10116s = a(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.f10113f += (long) (motionEvent.getHistorySize() + 1);
                        ka kaVarD = d(motionEvent);
                        Long l10 = kaVarD.f6221d;
                        if (l10 != null && kaVarD.f6224g != null) {
                            this.f10117t = l10.longValue() + kaVarD.f6224g.longValue() + this.f10117t;
                        }
                        if (this.E != null && (l9 = kaVarD.f6222e) != null && kaVarD.f6225h != null) {
                            this.f10118u = l9.longValue() + kaVarD.f6225h.longValue() + this.f10118u;
                        }
                    } else if (action2 == 3) {
                        this.f10115q++;
                    }
                } catch (zzavf unused) {
                }
            } else {
                this.f10122y = motionEvent.getX();
                this.f10123z = motionEvent.getY();
                this.A = motionEvent.getRawX();
                this.B = motionEvent.getRawY();
                this.f10112d++;
            }
            this.D = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.v9
    public final synchronized void zzl(int i10, int i11, int i12) {
        try {
            if (this.f10110a != null) {
                if (((Boolean) zzba.zzc().a(eg.f4047k2)).booleanValue()) {
                    e();
                } else {
                    this.f10110a.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.E;
            if (displayMetrics != null) {
                float f10 = displayMetrics.density;
                this.f10110a = MotionEvent.obtain(0L, i12, 1, i10 * f10, i11 * f10, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.f10110a = null;
            }
            this.D = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.v9
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        c1.d dVar;
        if (!((Boolean) zzba.zzc().a(eg.f4136t2)).booleanValue() || (dVar = this.F) == null) {
            return;
        }
        dVar.f1500a = new ArrayList(Arrays.asList(stackTraceElementArr));
    }
}
