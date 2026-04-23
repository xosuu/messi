package v5;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class v extends b {
    public static final ThreadLocal C = new ThreadLocal();
    public static final b4.h D = new b4.h(10);
    public static final b4.h E = new b4.h(11);
    public static final b4.h F = new b4.h(12);
    public static final b4.h G = new b4.h(13);
    public static final b4.h H = new b4.h(14);
    public static final AccelerateDecelerateInterpolator I = new AccelerateDecelerateInterpolator();
    public static final long J = 10;
    public r[] A;
    public HashMap B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f17869b;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f17874s;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17870d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17871f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17872h = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f17873q = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f17875t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f17876u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f17877v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f17878w = 300;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f17879x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final AccelerateDecelerateInterpolator f17880y = I;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ArrayList f17881z = null;

    @Override // v5.b
    public final void c() {
        if (!((ArrayList) D.get()).contains(this) && !((ArrayList) E.get()).contains(this)) {
            this.f17873q = false;
            n();
        } else if (!this.f17877v) {
            l();
        }
        h(1.0f);
        k();
    }

    @Override // v5.b
    public final boolean d() {
        return this.f17875t == 1 || this.f17876u;
    }

    @Override // v5.b
    public void f() {
        if (Looper.myLooper() == null) {
            throw new AndroidRuntimeException("Animators may only be run on Looper threads");
        }
        this.f17871f = false;
        this.f17872h = 0;
        this.f17875t = 0;
        this.f17873q = false;
        ((ArrayList) E.get()).add(this);
        long jCurrentAnimationTimeMillis = 0;
        if (this.f17879x == 0) {
            if (this.f17877v && this.f17875t != 0) {
                jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.f17869b;
            }
            l();
            long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
            if (this.f17875t != 1) {
                this.f17870d = jCurrentAnimationTimeMillis;
                this.f17875t = 2;
            }
            this.f17869b = jCurrentAnimationTimeMillis2 - jCurrentAnimationTimeMillis;
            i(jCurrentAnimationTimeMillis2);
            this.f17875t = 0;
            this.f17876u = true;
            ArrayList arrayList = this.f17808a;
            if (arrayList != null) {
                ArrayList arrayList2 = (ArrayList) arrayList.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((a) arrayList2.get(i10)).a(this);
                }
            }
        }
        ThreadLocal threadLocal = C;
        t tVar = (t) threadLocal.get();
        if (tVar == null) {
            tVar = new t();
            threadLocal.set(tVar);
        }
        tVar.sendEmptyMessage(0);
    }

    public final void g(e3.d dVar) {
        if (this.f17881z == null) {
            this.f17881z = new ArrayList();
        }
        this.f17881z.add(dVar);
    }

    public void h(float f10) {
        float interpolation = this.f17880y.getInterpolation(f10);
        int length = this.A.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.A[i10].a(interpolation);
        }
        ArrayList arrayList = this.f17881z;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                e3.d dVar = (e3.d) ((u) this.f17881z.get(i11));
                int i12 = dVar.f12667a;
                View view = dVar.f12668b;
                switch (i12) {
                    case 0:
                        ((e3.e) view).invalidate();
                        break;
                    default:
                        ((e3.f) view).invalidate();
                        break;
                }
            }
        }
    }

    public final boolean i(long j10) {
        boolean z9 = true;
        if (this.f17875t == 0) {
            this.f17875t = 1;
            long j11 = this.f17870d;
            if (j11 < 0) {
                this.f17869b = j10;
            } else {
                this.f17869b = j10 - j11;
                this.f17870d = -1L;
            }
        }
        int i10 = this.f17875t;
        if (i10 != 1 && i10 != 2) {
            return false;
        }
        long j12 = this.f17878w;
        float fMin = j12 > 0 ? (j10 - this.f17869b) / j12 : 1.0f;
        if (fMin < 1.0f) {
            z9 = false;
        } else if (this.f17872h >= 0) {
            fMin = Math.min(fMin, 1.0f);
        } else {
            ArrayList arrayList = this.f17808a;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((a) this.f17808a.get(i11)).b();
                }
            }
            this.f17872h += (int) fMin;
            fMin %= 1.0f;
            this.f17869b += this.f17878w;
            z9 = false;
        }
        if (this.f17871f) {
            fMin = 1.0f - fMin;
        }
        h(fMin);
        return z9;
    }

    public v j() {
        v vVar = (v) super.clone();
        ArrayList arrayList = this.f17881z;
        if (arrayList != null) {
            vVar.f17881z = new ArrayList();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                vVar.f17881z.add(arrayList.get(i10));
            }
        }
        vVar.f17870d = -1L;
        vVar.f17871f = false;
        vVar.f17872h = 0;
        vVar.f17877v = false;
        vVar.f17875t = 0;
        vVar.f17873q = false;
        r[] rVarArr = this.A;
        if (rVarArr != null) {
            int length = rVarArr.length;
            vVar.A = new r[length];
            vVar.B = new HashMap(length);
            for (int i11 = 0; i11 < length; i11++) {
                r rVarClone = rVarArr[i11].clone();
                vVar.A[i11] = rVarClone;
                vVar.B.put(rVarClone.f17859a, rVarClone);
            }
        }
        return vVar;
    }

    public final void k() {
        ArrayList arrayList;
        ((ArrayList) D.get()).remove(this);
        ((ArrayList) E.get()).remove(this);
        ((ArrayList) F.get()).remove(this);
        this.f17875t = 0;
        if (this.f17876u && (arrayList = this.f17808a) != null) {
            ArrayList arrayList2 = (ArrayList) arrayList.clone();
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((a) arrayList2.get(i10)).c(this);
            }
        }
        this.f17876u = false;
    }

    public void l() {
        if (this.f17877v) {
            return;
        }
        int length = this.A.length;
        for (int i10 = 0; i10 < length; i10++) {
            r rVar = this.A[i10];
            if (rVar.f17867u == null) {
                Class cls = rVar.f17863h;
                rVar.f17867u = cls == Integer.class ? r.f17855w : cls == Float.class ? r.f17856x : null;
            }
            s sVar = rVar.f17867u;
            if (sVar != null) {
                rVar.f17864q.f14975g = sVar;
            }
        }
        this.f17877v = true;
    }

    public final void m(r... rVarArr) {
        int length = rVarArr.length;
        this.A = rVarArr;
        this.B = new HashMap(length);
        for (r rVar : rVarArr) {
            this.B.put(rVar.f17859a, rVar);
        }
        this.f17877v = false;
    }

    public final void n() {
        ArrayList arrayList;
        l();
        ((ArrayList) D.get()).add(this);
        if (this.f17879x <= 0 || (arrayList = this.f17808a) == null) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) arrayList.clone();
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((a) arrayList2.get(i10)).a(this);
        }
    }
}
