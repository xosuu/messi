package k2;

import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.gms.internal.ads.av;
import com.google.android.gms.internal.ads.bv;
import com.google.android.gms.internal.ads.en1;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.gv;
import com.google.android.gms.internal.ads.ja;
import com.google.android.gms.internal.ads.sh1;
import com.google.android.gms.internal.ads.uh1;
import com.google.android.gms.internal.ads.x8;
import com.google.android.gms.internal.ads.xv;
import java.util.concurrent.Future;
import u3.o;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14664b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14665d;

    public /* synthetic */ e(int i10, int i11, Object obj) {
        this.f14663a = i11;
        this.f14665d = obj;
        this.f14664b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x8 x8VarO;
        switch (this.f14663a) {
            case 0:
                ((SystemForegroundService) this.f14665d).f1196h.cancel(this.f14664b);
                break;
            case 1:
                ((o) this.f14665d).f(this.f14664b);
                break;
            case 2:
                int i10 = this.f14664b;
                ja jaVar = (ja) this.f14665d;
                if (i10 > 0) {
                    try {
                        Thread.sleep(i10 * 1000);
                        break;
                    } catch (InterruptedException unused) {
                    }
                }
                try {
                    PackageInfo packageInfo = jaVar.f5850a.getPackageManager().getPackageInfo(jaVar.f5850a.getPackageName(), 0);
                    Context context = jaVar.f5850a;
                    x8VarO = en1.O(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
                } catch (Throwable unused2) {
                    x8VarO = null;
                }
                ((ja) this.f14665d).f5859j = x8VarO;
                if (this.f14664b < 4) {
                    if (x8VarO == null || !x8VarO.k0() || x8VarO.y0().equals("0000000000000000000000000000000000000000000000000000000000000000") || !x8VarO.l0() || !x8VarO.w0().D() || x8VarO.w0().A() == -2) {
                        ja jaVar2 = (ja) this.f14665d;
                        int i11 = this.f14664b + 1;
                        if (jaVar2.f5863n) {
                            Future<?> futureSubmit = jaVar2.f5851b.submit(new e(jaVar2, i11));
                            if (i11 == 0) {
                                jaVar2.f5860k = futureSubmit;
                            }
                            break;
                        }
                    }
                }
                break;
            case 3:
                bv bvVar = ((av) this.f14665d).B;
                if (bvVar != null) {
                    ((gv) bvVar).onWindowVisibilityChanged(this.f14664b);
                }
                break;
            case 4:
                bv bvVar2 = ((xv) this.f14665d).f10658q;
                if (bvVar2 != null) {
                    ((gv) bvVar2).onWindowVisibilityChanged(this.f14664b);
                }
                break;
            default:
                uh1 uh1Var = ((sh1) this.f14665d).f8875b;
                int i12 = this.f14664b;
                if (i12 == -3 || i12 == -2) {
                    if (i12 == -2) {
                        uh1Var.b(0);
                        uh1Var.c(2);
                    } else {
                        uh1Var.c(3);
                    }
                } else if (i12 == -1) {
                    uh1Var.b(-1);
                    uh1Var.a();
                } else if (i12 == 1) {
                    uh1Var.c(1);
                    uh1Var.b(1);
                } else {
                    fb1.u("Unknown focus change type: ", i12);
                }
                break;
        }
    }

    public e(ja jaVar, int i10) {
        this.f14663a = 2;
        this.f14664b = i10;
        this.f14665d = jaVar;
    }
}
