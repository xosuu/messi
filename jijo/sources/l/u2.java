package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class u2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static u2 f15017i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f15019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s.k f15020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s.l f15021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakHashMap f15022d = new WeakHashMap(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f15023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u f15025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f15016h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final s2 f15018j = new s2(6);

    public static synchronized u2 d() {
        try {
            if (f15017i == null) {
                u2 u2Var = new u2();
                f15017i = u2Var;
                j(u2Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f15017i;
    }

    public static synchronized PorterDuffColorFilter h(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        s2 s2Var = f15018j;
        s2Var.getClass();
        int i11 = (31 + i10) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) s2Var.a(Integer.valueOf(mode.hashCode() + i11));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
        }
        return porterDuffColorFilter;
    }

    public static void j(u2 u2Var) {
        if (Build.VERSION.SDK_INT < 24) {
            u2Var.a("vector", new r2(3));
            u2Var.a("animated-vector", new r2(1));
            u2Var.a("animated-selector", new r2(0));
            u2Var.a("drawable", new r2(2));
        }
    }

    public final void a(String str, r2 r2Var) {
        if (this.f15020b == null) {
            this.f15020b = new s.k();
        }
        this.f15020b.put(str, r2Var);
    }

    public final synchronized void b(Context context, long j10, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                s.e eVar = (s.e) this.f15022d.get(context);
                if (eVar == null) {
                    eVar = new s.e();
                    this.f15022d.put(context, eVar);
                }
                eVar.f(j10, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable c(Context context, int i10) {
        if (this.f15023e == null) {
            this.f15023e = new TypedValue();
        }
        TypedValue typedValue = this.f15023e;
        context.getResources().getValue(i10, typedValue, true);
        long j10 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableE = e(context, j10);
        if (drawableE != null) {
            return drawableE;
        }
        LayerDrawable layerDrawableC = null;
        if (this.f15025g != null) {
            if (i10 == R.drawable.at) {
                layerDrawableC = new LayerDrawable(new Drawable[]{f(context, R.drawable.as), f(context, 2131230777)});
            } else if (i10 == R.drawable.br) {
                layerDrawableC = u.c(this, context, R.dimen.aw);
            } else if (i10 == R.drawable.bq) {
                layerDrawableC = u.c(this, context, R.dimen.ax);
            } else if (i10 == R.drawable.bs) {
                layerDrawableC = u.c(this, context, R.dimen.ay);
            }
        }
        if (layerDrawableC != null) {
            layerDrawableC.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j10, layerDrawableC);
        }
        return layerDrawableC;
    }

    public final synchronized Drawable e(Context context, long j10) {
        s.e eVar = (s.e) this.f15022d.get(context);
        if (eVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) eVar.e(j10, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iB = s.d.b(eVar.f16600b, eVar.f16602f, j10);
            if (iB >= 0) {
                Object[] objArr = eVar.f16601d;
                Object obj = objArr[iB];
                Object obj2 = s.e.f16598h;
                if (obj != obj2) {
                    objArr[iB] = obj2;
                    eVar.f16599a = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i10) {
        return g(context, i10, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0189 A[Catch: all -> 0x00e1, TryCatch #0 {all -> 0x00e1, blocks: (B:3:0x0001, B:12:0x0026, B:14:0x002b, B:16:0x0031, B:18:0x0037, B:21:0x0045, B:25:0x0057, B:27:0x005b, B:28:0x0062, B:52:0x00dc, B:56:0x00e6, B:58:0x00ee, B:60:0x00f4, B:67:0x010f, B:65:0x010b, B:69:0x0115, B:73:0x012c, B:80:0x0162, B:81:0x0189, B:88:0x0196, B:31:0x007c, B:33:0x0080, B:35:0x008c, B:36:0x0094, B:41:0x00a0, B:43:0x00b3, B:46:0x00c2, B:47:0x00cb, B:48:0x00d2, B:50:0x00d5, B:24:0x0050, B:6:0x0007, B:8:0x0012, B:10:0x0016, B:92:0x019c, B:93:0x01a5), top: B:96:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.graphics.drawable.Drawable g(android.content.Context r12, int r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.u2.g(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized ColorStateList i(Context context, int i10) {
        ColorStateList colorStateList;
        s.l lVar;
        WeakHashMap weakHashMap = this.f15019a;
        ColorStateList colorStateListD = null;
        colorStateList = (weakHashMap == null || (lVar = (s.l) weakHashMap.get(context)) == null) ? null : (ColorStateList) lVar.c(i10, null);
        if (colorStateList == null) {
            u uVar = this.f15025g;
            if (uVar != null) {
                colorStateListD = uVar.d(context, i10);
            }
            if (colorStateListD != null) {
                if (this.f15019a == null) {
                    this.f15019a = new WeakHashMap();
                }
                s.l lVar2 = (s.l) this.f15019a.get(context);
                if (lVar2 == null) {
                    lVar2 = new s.l();
                    this.f15019a.put(context, lVar2);
                }
                lVar2.a(i10, colorStateListD);
            }
            colorStateList = colorStateListD;
        }
        return colorStateList;
    }

    public final synchronized void k(Context context) {
        s.e eVar = (s.e) this.f15022d.get(context);
        if (eVar != null) {
            eVar.b();
        }
    }

    public final synchronized void l(u uVar) {
        this.f15025g = uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
        /*
            r6 = this;
            l.u r0 = r6.f15025g
            r1 = 0
            if (r0 == 0) goto L78
            android.graphics.PorterDuff$Mode r2 = l.v.f15029b
            java.lang.Object r3 = r0.f15006a
            int[] r3 = (int[]) r3
            boolean r3 = l.u.a(r3, r8)
            r4 = 1
            r5 = -1
            if (r3 == 0) goto L19
            r8 = 2130968856(0x7f040118, float:1.7546377E38)
        L16:
            r0 = -1
        L17:
            r3 = 1
            goto L57
        L19:
            java.lang.Object r3 = r0.f15008d
            int[] r3 = (int[]) r3
            boolean r3 = l.u.a(r3, r8)
            if (r3 == 0) goto L27
            r8 = 2130968854(0x7f040116, float:1.7546373E38)
            goto L16
        L27:
            java.lang.Object r0 = r0.f15009f
            int[] r0 = (int[]) r0
            boolean r0 = l.u.a(r0, r8)
            r3 = 16842801(0x1010031, float:2.3693695E-38)
            if (r0 == 0) goto L3a
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
        L36:
            r8 = 16842801(0x1010031, float:2.3693695E-38)
            goto L16
        L3a:
            r0 = 2131230797(0x7f08004d, float:1.8077657E38)
            if (r8 != r0) goto L4e
            r8 = 1109603123(0x42233333, float:40.8)
            int r8 = java.lang.Math.round(r8)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = r8
            r8 = 16842800(0x1010030, float:2.3693693E-38)
            goto L17
        L4e:
            r0 = 2131230779(0x7f08003b, float:1.807762E38)
            if (r8 != r0) goto L54
            goto L36
        L54:
            r8 = 0
            r0 = -1
            r3 = 0
        L57:
            if (r3 == 0) goto L78
            int[] r1 = l.r1.f14985a
            android.graphics.drawable.Drawable r9 = r9.mutate()
            int r7 = l.o3.c(r7, r8)
            java.lang.Class<l.v> r8 = l.v.class
            monitor-enter(r8)
            android.graphics.PorterDuffColorFilter r7 = h(r7, r2)     // Catch: java.lang.Throwable -> L75
            monitor-exit(r8)
            r9.setColorFilter(r7)
            if (r0 == r5) goto L73
            r9.setAlpha(r0)
        L73:
            r1 = 1
            goto L78
        L75:
            r7 = move-exception
            monitor-exit(r8)
            throw r7
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.u2.m(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
