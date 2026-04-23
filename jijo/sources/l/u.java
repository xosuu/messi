package l;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.util.TreeMap;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class u implements g4.r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15007b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15008d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f15009f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f15010h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f15011q;

    public u(g4.s0 s0Var, g4.s0 s0Var2, g4.s0 s0Var3, g4.s0 s0Var4, g4.s0 s0Var5, g4.s0 s0Var6) {
        this.f15006a = s0Var;
        this.f15007b = s0Var2;
        this.f15008d = s0Var3;
        this.f15009f = s0Var4;
        this.f15010h = s0Var5;
        this.f15011q = s0Var6;
    }

    public static boolean a(int[] iArr, int i10) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList b(Context context, int i10) {
        int iC = o3.c(context, R.attr.gu);
        return new ColorStateList(new int[][]{o3.f14948b, o3.f14950d, o3.f14949c, o3.f14952f}, new int[]{o3.b(context, R.attr.gr), g0.a.b(iC, i10), g0.a.b(iC, i10), i10});
    }

    public static LayerDrawable c(u2 u2Var, Context context, int i10) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
        Drawable drawableF = u2Var.f(context, R.drawable.c3);
        Drawable drawableF2 = u2Var.f(context, R.drawable.c4);
        if ((drawableF instanceof BitmapDrawable) && drawableF.getIntrinsicWidth() == dimensionPixelSize && drawableF.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableF;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableF.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableF2 instanceof BitmapDrawable) && drawableF2.getIntrinsicWidth() == dimensionPixelSize && drawableF2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableF2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableF2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void e(Drawable drawable, int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterH;
        int[] iArr = r1.f14985a;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = v.f15029b;
        }
        PorterDuff.Mode mode2 = v.f15029b;
        synchronized (v.class) {
            porterDuffColorFilterH = u2.h(i10, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterH);
    }

    public final ColorStateList d(Context context, int i10) {
        if (i10 == R.drawable.ax) {
            return d0.f.c(context, R.color.v);
        }
        if (i10 == 2131230826) {
            return d0.f.c(context, R.color.y);
        }
        if (i10 != R.drawable.c5) {
            if (i10 == R.drawable.al) {
                return b(context, o3.c(context, R.attr.gr));
            }
            if (i10 == R.drawable.af) {
                return b(context, 0);
            }
            if (i10 == R.drawable.ak) {
                return b(context, o3.c(context, R.attr.gp));
            }
            if (i10 == 2131230821 || i10 == R.drawable.c2) {
                return d0.f.c(context, R.color.x);
            }
            if (a((int[]) this.f15007b, i10)) {
                return o3.d(context, R.attr.gv);
            }
            if (a((int[]) this.f15010h, i10)) {
                return d0.f.c(context, R.color.u);
            }
            if (a((int[]) this.f15011q, i10)) {
                return d0.f.c(context, R.color.t);
            }
            if (i10 == R.drawable.by) {
                return d0.f.c(context, R.color.w);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = o3.d(context, R.attr.hr);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = o3.f14948b;
            iArr2[0] = o3.b(context, R.attr.hr);
            iArr[1] = o3.f14951e;
            iArr2[1] = o3.c(context, R.attr.gt);
            iArr[2] = o3.f14952f;
            iArr2[2] = o3.c(context, R.attr.hr);
        } else {
            int[] iArr3 = o3.f14948b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = o3.f14951e;
            iArr2[1] = o3.c(context, R.attr.gt);
            iArr[2] = o3.f14952f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    @Override // g4.t0
    public final /* bridge */ /* synthetic */ Object zza() {
        Application application = (Application) ((g4.t0) this.f15006a).zza();
        return new g4.k(application, (g4.q) ((g4.t0) this.f15008d).zza(), (g4.g) ((g4.t0) this.f15009f).zza(), (g4.m) ((g4.t0) this.f15010h).zza(), (g4.t0) this.f15011q);
    }

    public u(Context context, String str) {
        String strConcat;
        this.f15006a = context.getApplicationContext();
        this.f15007b = str;
        this.f15008d = new TreeMap();
        String packageName = context.getPackageName();
        try {
            strConcat = packageName + "-" + z3.b.a(context).d(0, context.getPackageName()).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            zzm.zzh("Unable to get package version name for reporting", e10);
            strConcat = String.valueOf(packageName).concat("-missing");
        }
        this.f15011q = strConcat;
    }

    public u() {
        this.f15006a = new int[]{2131230836, 2131230834, 2131230760};
        this.f15007b = new int[]{2131230784, R.drawable.bz, R.drawable.b8, R.drawable.b3, R.drawable.b4, R.drawable.b7, R.drawable.b6};
        this.f15008d = new int[]{2131230833, 2131230835, 2131230777, R.drawable.c9, 2131230830, 2131230831, 2131230832};
        this.f15009f = new int[]{2131230809, R.drawable.as, 2131230808};
        this.f15010h = new int[]{R.drawable.c7, R.drawable.cg};
        this.f15011q = new int[]{R.drawable.ag, R.drawable.am, R.drawable.ah, R.drawable.an};
    }
}
