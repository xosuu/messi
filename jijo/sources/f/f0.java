package f;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;
import com.google.android.gms.internal.ads.ur0;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends h0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12834c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k0 f12835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f12836e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(k0 k0Var, ur0 ur0Var) {
        super(k0Var);
        this.f12835d = k0Var;
        this.f12836e = ur0Var;
    }

    @Override // f.h0
    public final IntentFilter c() {
        switch (this.f12834c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00e6 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8 A[ORIG_RETURN, RETURN] */
    @Override // f.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d() {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.f0.d():int");
    }

    @Override // f.h0
    public final void h() throws IllegalAccessException {
        int i10 = this.f12834c;
        k0 k0Var = this.f12835d;
        switch (i10) {
            case 0:
                k0Var.o(true, true);
                break;
            default:
                k0Var.o(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(k0 k0Var, Context context) {
        super(k0Var);
        this.f12835d = k0Var;
        this.f12836e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
