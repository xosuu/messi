package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.ur0;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14789a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14790b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f14791d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f14792f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f14793h;

    public b0(ImageView imageView) {
        this.f14790b = imageView;
    }

    public static void b(String str) {
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            return;
        }
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception unused) {
        }
    }

    public final void a() {
        Drawable drawable = ((ImageView) this.f14790b).getDrawable();
        if (drawable != null) {
            r1.a(drawable);
        }
        if (drawable != null) {
            int i10 = Build.VERSION.SDK_INT;
            Object obj = this.f14791d;
            if (i10 <= 21 ? i10 == 21 : ((q3) obj) != null) {
                if (((q3) this.f14793h) == null) {
                    this.f14793h = new q3(0);
                }
                q3 q3Var = (q3) this.f14793h;
                q3Var.f14980c = null;
                q3Var.f14979b = false;
                q3Var.f14981d = null;
                q3Var.f14978a = false;
                ColorStateList colorStateListA = s0.f.a((ImageView) this.f14790b);
                if (colorStateListA != null) {
                    q3Var.f14979b = true;
                    q3Var.f14980c = colorStateListA;
                }
                PorterDuff.Mode modeB = s0.f.b((ImageView) this.f14790b);
                if (modeB != null) {
                    q3Var.f14978a = true;
                    q3Var.f14981d = modeB;
                }
                if (q3Var.f14979b || q3Var.f14978a) {
                    v.e(drawable, q3Var, ((ImageView) this.f14790b).getDrawableState());
                    return;
                }
            }
            q3 q3Var2 = (q3) this.f14792f;
            if (q3Var2 != null) {
                v.e(drawable, q3Var2, ((ImageView) this.f14790b).getDrawableState());
                return;
            }
            q3 q3Var3 = (q3) obj;
            if (q3Var3 != null) {
                v.e(drawable, q3Var3, ((ImageView) this.f14790b).getDrawableState());
            }
        }
    }

    public final void c(AttributeSet attributeSet, int i10) {
        Drawable drawable;
        Drawable drawable2;
        int iD;
        Context context = ((ImageView) this.f14790b).getContext();
        int[] iArr = e.a.f12599f;
        ur0 ur0VarK = ur0.K(context, attributeSet, iArr, i10);
        ImageView imageView = (ImageView) this.f14790b;
        o0.v0.p(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) ur0VarK.f9601d, i10);
        try {
            Drawable drawable3 = ((ImageView) this.f14790b).getDrawable();
            if (drawable3 == null && (iD = ur0VarK.D(1, -1)) != -1 && (drawable3 = p7.q.g(((ImageView) this.f14790b).getContext(), iD)) != null) {
                ((ImageView) this.f14790b).setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                r1.a(drawable3);
            }
            if (ur0VarK.H(2)) {
                ImageView imageView2 = (ImageView) this.f14790b;
                ColorStateList colorStateListV = ur0VarK.v(2);
                int i11 = Build.VERSION.SDK_INT;
                s0.f.c(imageView2, colorStateListV);
                if (i11 == 21 && (drawable2 = imageView2.getDrawable()) != null && s0.f.a(imageView2) != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView2.getDrawableState());
                    }
                    imageView2.setImageDrawable(drawable2);
                }
            }
            if (ur0VarK.H(3)) {
                ImageView imageView3 = (ImageView) this.f14790b;
                PorterDuff.Mode modeC = r1.c(ur0VarK.B(3, -1), null);
                int i12 = Build.VERSION.SDK_INT;
                s0.f.d(imageView3, modeC);
                if (i12 == 21 && (drawable = imageView3.getDrawable()) != null && s0.f.a(imageView3) != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView3.getDrawableState());
                    }
                    imageView3.setImageDrawable(drawable);
                }
            }
            ur0VarK.M();
        } catch (Throwable th) {
            ur0VarK.M();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0855  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0842 A[EDGE_INSN: B:61:0x0842->B:46:0x0842 BREAK  A[LOOP:0: B:39:0x07f1->B:45:0x0837], SYNTHETIC] */
    @Override // j9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instruction units count: 2308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.b0.d():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x003a A[EDGE_INSN: B:87:0x003a->B:18:0x003a BREAK  A[LOOP:3: B:12:0x0022->B:90:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(s1.b r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.b0.e(s1.b, int, int):void");
    }

    public final void f(int i10) {
        if (i10 != 0) {
            Drawable drawableG = p7.q.g(((ImageView) this.f14790b).getContext(), i10);
            if (drawableG != null) {
                r1.a(drawableG);
            }
            ((ImageView) this.f14790b).setImageDrawable(drawableG);
        } else {
            ((ImageView) this.f14790b).setImageDrawable(null);
        }
        a();
    }

    @Override // j9.a
    public final void g() {
    }

    public final void h(ColorStateList colorStateList) {
        if (((q3) this.f14792f) == null) {
            this.f14792f = new q3(0);
        }
        q3 q3Var = (q3) this.f14792f;
        q3Var.f14980c = colorStateList;
        q3Var.f14979b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (((q3) this.f14792f) == null) {
            this.f14792f = new q3(0);
        }
        q3 q3Var = (q3) this.f14792f;
        q3Var.f14981d = mode;
        q3Var.f14978a = true;
        a();
    }

    public final void j(s1.b bVar) {
        bVar.e("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bVar.e("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) this.f14792f) + "')");
    }
}
