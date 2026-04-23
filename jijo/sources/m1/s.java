package m1;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.iq1;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ThreadLocal f15609h = new ThreadLocal();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final q f15610q = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f15611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f15612b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f15613d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f15614f;

    public static e1 c(RecyclerView recyclerView, int i10, long j10) {
        int iH = recyclerView.f1051h.h();
        for (int i11 = 0; i11 < iH; i11++) {
            e1 e1VarI = RecyclerView.I(recyclerView.f1051h.g(i11));
            if (e1VarI.f15447c == i10 && !e1VarI.h()) {
                return null;
            }
        }
        w0 w0Var = recyclerView.f1042b;
        try {
            recyclerView.P();
            e1 e1VarI2 = w0Var.i(i10, j10);
            if (e1VarI2 != null) {
                if (!e1VarI2.g() || e1VarI2.h()) {
                    w0Var.a(e1VarI2, false);
                } else {
                    w0Var.f(e1VarI2.f15445a);
                }
            }
            recyclerView.Q(false);
            return e1VarI2;
        } catch (Throwable th) {
            recyclerView.Q(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f15612b == 0) {
            this.f15612b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        iq1 iq1Var = recyclerView.f1058n0;
        iq1Var.f5675a = i10;
        iq1Var.f5676b = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r17) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.s.b(long):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i10 = k0.m.f14637a;
            k0.l.a("RV Prefetch");
            ArrayList arrayList = this.f15611a;
            if (arrayList.isEmpty()) {
                this.f15612b = 0L;
                k0.l.b();
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i11 = 0; i11 < size; i11++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i11);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.f15612b = 0L;
                k0.l.b();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f15613d);
                this.f15612b = 0L;
                k0.l.b();
            }
        } catch (Throwable th) {
            this.f15612b = 0L;
            int i12 = k0.m.f14637a;
            k0.l.b();
            throw th;
        }
    }
}
