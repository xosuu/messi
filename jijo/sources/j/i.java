package j;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.internal.ads.fb1;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import k.r;
import k.s;
import k.x;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ j E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Menu f14238a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14246i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14247j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f14248k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f14249l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14250m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public char f14251n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14252o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public char f14253p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14254q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14255r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14256s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f14257t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14258u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14259v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14260w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f14261x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f14262y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public s f14263z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14239b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14240c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14241d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14242e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14243f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14244g = true;

    public i(j jVar, Menu menu) {
        this.E = jVar;
        this.f14238a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f14268c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z9 = false;
        menuItem.setChecked(this.f14256s).setVisible(this.f14257t).setEnabled(this.f14258u).setCheckable(this.f14255r >= 1).setTitleCondensed(this.f14249l).setIcon(this.f14250m);
        int i10 = this.f14259v;
        if (i10 >= 0) {
            menuItem.setShowAsAction(i10);
        }
        String str = this.f14262y;
        j jVar = this.E;
        if (str != null) {
            if (jVar.f14268c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (jVar.f14269d == null) {
                jVar.f14269d = j.a(jVar.f14268c);
            }
            Object obj = jVar.f14269d;
            String str2 = this.f14262y;
            h hVar = new h();
            hVar.f14236a = obj;
            Class<?> cls = obj.getClass();
            try {
                hVar.f14237b = cls.getMethod(str2, h.f14235c);
                menuItem.setOnMenuItemClickListener(hVar);
            } catch (Exception e10) {
                StringBuilder sbK = fb1.k("Couldn't resolve menu item onClick handler ", str2, " in class ");
                sbK.append(cls.getName());
                InflateException inflateException = new InflateException(sbK.toString());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }
        if (this.f14255r >= 2) {
            if (menuItem instanceof r) {
                ((r) menuItem).g(true);
            } else if (menuItem instanceof x) {
                x xVar = (x) menuItem;
                try {
                    Method method = xVar.f14623e;
                    i0.b bVar = xVar.f14622d;
                    if (method == null) {
                        xVar.f14623e = bVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    xVar.f14623e.invoke(bVar, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
        String str3 = this.f14261x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, j.f14264e, jVar.f14266a));
            z9 = true;
        }
        int i11 = this.f14260w;
        if (i11 > 0 && !z9) {
            menuItem.setActionView(i11);
        }
        s sVar = this.f14263z;
        if (sVar != null && (menuItem instanceof i0.b)) {
            ((i0.b) menuItem).a(sVar);
        }
        CharSequence charSequence = this.A;
        boolean z10 = menuItem instanceof i0.b;
        if (z10) {
            ((i0.b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            o0.n.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z10) {
            ((i0.b) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            o0.n.m(menuItem, charSequence2);
        }
        char c10 = this.f14251n;
        int i12 = this.f14252o;
        if (z10) {
            ((i0.b) menuItem).setAlphabeticShortcut(c10, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            o0.n.g(menuItem, c10, i12);
        }
        char c11 = this.f14253p;
        int i13 = this.f14254q;
        if (z10) {
            ((i0.b) menuItem).setNumericShortcut(c11, i13);
        } else if (Build.VERSION.SDK_INT >= 26) {
            o0.n.k(menuItem, c11, i13);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z10) {
                ((i0.b) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                o0.n.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z10) {
                ((i0.b) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                o0.n.i(menuItem, colorStateList);
            }
        }
    }
}
