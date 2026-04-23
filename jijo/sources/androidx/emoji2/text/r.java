package androidx.emoji2.text;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.provider.Settings;
import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.bo1;
import com.google.android.gms.internal.ads.bu0;
import com.google.android.gms.internal.ads.dh0;
import com.google.android.gms.internal.ads.du0;
import com.google.android.gms.internal.ads.ek1;
import com.google.android.gms.internal.ads.en1;
import com.google.android.gms.internal.ads.fk1;
import com.google.android.gms.internal.ads.gh0;
import com.google.android.gms.internal.ads.gk1;
import com.google.android.gms.internal.ads.qe0;
import com.google.android.gms.internal.ads.qf;
import com.google.android.gms.internal.ads.rs0;
import com.google.android.gms.internal.ads.sd;
import com.google.android.gms.internal.ads.ud;
import com.google.android.gms.internal.ads.vd;
import com.google.android.gms.internal.ads.yd;
import com.google.android.gms.internal.ads.zt0;
import f.x0;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class r implements rs0, qe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f632b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f633d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f634f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f635h;

    public /* synthetic */ r(ek1 ek1Var, bo1 bo1Var, gk1 gk1Var, IOException iOException, boolean z9) {
        this.f632b = ek1Var;
        this.f633d = bo1Var;
        this.f634f = gk1Var;
        this.f635h = iOException;
        this.f631a = z9;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z9) {
        z[] zVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (zVarArr = (z[]) editable.getSpans(selectionStart, selectionEnd, z.class)) != null && zVarArr.length > 0) {
            for (z zVar : zVarArr) {
                int spanStart = editable.getSpanStart(zVar);
                int spanEnd = editable.getSpanEnd(zVar);
                if ((z9 && spanStart == selectionStart) || ((!z9 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static r c(zt0 zt0Var, bu0 bu0Var, du0 du0Var, du0 du0Var2, boolean z9) {
        if (du0Var == du0.f3750f) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        zt0 zt0Var2 = zt0.f11320b;
        du0 du0Var3 = du0.f3748b;
        if (zt0Var == zt0Var2 && du0Var == du0Var3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (bu0Var == bu0.f3114b && du0Var == du0Var3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new r(zt0Var, bu0Var, du0Var, du0Var2, z9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b9, code lost:
    
        if (r6 >= r7) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.lang.CharSequence r10, int r11, int r12, androidx.emoji2.text.p r13) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.r.b(java.lang.CharSequence, int, int, androidx.emoji2.text.p):boolean");
    }

    @Override // com.google.android.gms.internal.ads.rs0
    public final Object zza(Object obj) {
        long j10;
        x0 x0Var = (x0) this.f632b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (((zzg) ((gh0) x0Var.f12985b).f12845a).zzS()) {
            return null;
        }
        yd ydVar = (yd) this.f635h;
        sd sdVar = (sd) this.f634f;
        ArrayList arrayList = (ArrayList) this.f633d;
        boolean z9 = this.f631a;
        gh0 gh0Var = (gh0) x0Var.f12985b;
        ud udVarP = vd.P();
        udVarP.d();
        vd.E((vd) udVarP.f9462b, arrayList);
        qf qfVar = Settings.Global.getInt(gh0Var.f4919c.getContentResolver(), "airplane_mode_on", 0) != 0 ? qf.ENUM_TRUE : qf.ENUM_FALSE;
        udVarP.d();
        vd.H((vd) udVarP.f9462b, qfVar);
        qf qfVarZzg = zzu.zzq().zzg(gh0Var.f4919c, gh0Var.f4921e);
        udVarP.d();
        vd.I((vd) udVarP.f9462b, qfVarZzg);
        dh0 dh0Var = gh0Var.f4922f;
        synchronized (dh0Var.f3666h) {
            j10 = dh0Var.f3661c;
        }
        udVarP.d();
        vd.C((vd) udVarP.f9462b, j10);
        long jB = gh0Var.f4922f.b();
        udVarP.d();
        vd.D((vd) udVarP.f9462b, jB);
        int iA = gh0Var.f4922f.a();
        udVarP.d();
        vd.J((vd) udVarP.f9462b, iA);
        udVarP.d();
        vd.L((vd) udVarP.f9462b, ydVar);
        udVarP.d();
        vd.F((vd) udVarP.f9462b, sdVar);
        qf qfVar2 = gh0Var.f4923g;
        udVarP.d();
        vd.K((vd) udVarP.f9462b, qfVar2);
        qf qfVar3 = z9 ? qf.ENUM_TRUE : qf.ENUM_FALSE;
        udVarP.d();
        vd.B((vd) udVarP.f9462b, qfVar3);
        long jD = gh0Var.f4922f.d();
        udVarP.d();
        vd.M((vd) udVarP.f9462b, jD);
        ((y3.b) zzu.zzB()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        udVarP.d();
        vd.A((vd) udVarP.f9462b, jCurrentTimeMillis);
        qf qfVar4 = Settings.Global.getInt(gh0Var.f4919c.getContentResolver(), "wifi_on", 0) != 0 ? qf.ENUM_TRUE : qf.ENUM_FALSE;
        udVarP.d();
        vd.G((vd) udVarP.f9462b, qfVar4);
        byte[] bArrD = ((vd) udVarP.b()).d();
        en1.E0(sQLiteDatabase, z9, true);
        en1.r0(sQLiteDatabase, ((gh0) x0Var.f12985b).f4922f.d(), bArrD);
        return null;
    }

    public /* synthetic */ r(x0 x0Var, boolean z9, ArrayList arrayList, sd sdVar, yd ydVar) {
        this.f632b = x0Var;
        this.f631a = z9;
        this.f633d = arrayList;
        this.f634f = sdVar;
        this.f635h = ydVar;
    }

    public r(Context context, com.google.android.gms.internal.ads.e eVar) {
        this.f632b = context.getApplicationContext();
        this.f633d = eVar;
    }

    public r(zt0 zt0Var, bu0 bu0Var, du0 du0Var, du0 du0Var2, boolean z9) {
        this.f634f = zt0Var;
        this.f635h = bu0Var;
        this.f632b = du0Var;
        this.f633d = du0Var2;
        this.f631a = z9;
    }

    public r(j2.h hVar, d5.e eVar, e eVar2) {
        this.f632b = eVar;
        this.f633d = hVar;
        this.f634f = eVar2;
        this.f631a = false;
        this.f635h = null;
    }

    @Override // com.google.android.gms.internal.ads.qe0
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public final void mo0zza(Object obj) {
        ((fk1) obj).i((IOException) this.f635h);
    }
}
