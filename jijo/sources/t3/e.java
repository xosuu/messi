package t3;

import android.content.Context;
import c2.n;
import com.google.android.gms.internal.ads.ur0;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ur0 f16846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f16847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u3.a f16848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f16850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u3.d f16851h;

    public e(Context context, ur0 ur0Var, b bVar, d dVar) {
        if (context == null) {
            throw new NullPointerException("Null context is not permitted.");
        }
        if (ur0Var == null) {
            throw new NullPointerException("Api must not be null.");
        }
        if (dVar == null) {
            throw new NullPointerException("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        }
        this.f16844a = context.getApplicationContext();
        String str = null;
        if (z3.a.L()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f16845b = str;
        this.f16846c = ur0Var;
        this.f16847d = bVar;
        this.f16848e = new u3.a(ur0Var, bVar, str);
        u3.d dVarE = u3.d.e(this.f16844a);
        this.f16851h = dVarE;
        this.f16849f = dVarE.f17574t.getAndIncrement();
        this.f16850g = dVar.f16843a;
        e4.e eVar = dVarE.f17579y;
        eVar.sendMessage(eVar.obtainMessage(7, this));
    }

    public final n3.b b() {
        n3.b bVar = new n3.b(1);
        bVar.f15930a = null;
        Set setEmptySet = Collections.emptySet();
        if (((s.c) bVar.f15931b) == null) {
            bVar.f15931b = new s.c(0);
        }
        ((s.c) bVar.f15931b).addAll(setEmptySet);
        Context context = this.f16844a;
        bVar.f15933f = context.getClass().getName();
        bVar.f15932d = context.getPackageName();
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k4.l c(int r18, u3.j r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            k4.e r2 = new k4.e
            r2.<init>()
            u3.d r11 = r0.f16851h
            r11.getClass()
            int r5 = r1.f17587d
            e4.e r12 = r11.f17579y
            k4.l r13 = r2.f14669a
            if (r5 == 0) goto L91
            u3.a r6 = r0.f16848e
            boolean r3 = r11.a()
            r4 = 0
            if (r3 != 0) goto L20
            goto L77
        L20:
            v3.j r3 = v3.j.a()
            com.google.android.gms.common.internal.RootTelemetryConfiguration r3 = r3.f17774a
            r7 = 1
            if (r3 == 0) goto L5c
            boolean r8 = r3.f2516b
            if (r8 != 0) goto L2e
            goto L77
        L2e:
            java.util.concurrent.ConcurrentHashMap r8 = r11.f17576v
            java.lang.Object r8 = r8.get(r6)
            u3.o r8 = (u3.o) r8
            if (r8 == 0) goto L5a
            v3.h r9 = r8.f17593b
            boolean r10 = r9 instanceof v3.f
            if (r10 != 0) goto L3f
            goto L77
        L3f:
            boolean r10 = r9.hasConnectionInfo()
            if (r10 == 0) goto L5a
            boolean r10 = r9.isConnecting()
            if (r10 != 0) goto L5a
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r3 = u3.u.a(r8, r9, r5)
            if (r3 != 0) goto L52
            goto L77
        L52:
            int r4 = r8.f17603x
            int r4 = r4 + r7
            r8.f17603x = r4
            boolean r7 = r3.f2488d
            goto L5c
        L5a:
            boolean r7 = r3.f2517d
        L5c:
            u3.u r14 = new u3.u
            r3 = 0
            if (r7 == 0) goto L67
            long r8 = java.lang.System.currentTimeMillis()
            goto L68
        L67:
            r8 = r3
        L68:
            if (r7 == 0) goto L6e
            long r3 = android.os.SystemClock.elapsedRealtime()
        L6e:
            r15 = r3
            r3 = r14
            r4 = r11
            r7 = r8
            r9 = r15
            r3.<init>(r4, r5, r6, r7, r9)
            r4 = r14
        L77:
            if (r4 == 0) goto L91
            r12.getClass()
            u3.l r3 = new u3.l
            r3.<init>()
            r13.getClass()
            k4.i r5 = new k4.i
            r5.<init>(r3, r4)
            v3.d0 r3 = r13.f14683b
            r3.e(r5)
            r13.i()
        L91:
            u3.z r3 = new u3.z
            c2.n r4 = r0.f16850g
            r5 = r18
            r3.<init>(r5, r1, r2, r4)
            u3.w r1 = new u3.w
            java.util.concurrent.atomic.AtomicInteger r2 = r11.f17575u
            int r2 = r2.get()
            r1.<init>(r3, r2, r0)
            r2 = 4
            android.os.Message r1 = r12.obtainMessage(r2, r1)
            r12.sendMessage(r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.e.c(int, u3.j):k4.l");
    }
}
