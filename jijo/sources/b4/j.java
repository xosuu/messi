package b4;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.internal.ads.b60;
import com.google.android.gms.internal.ads.ds;
import com.google.android.gms.internal.ads.es;
import com.google.android.gms.internal.ads.fq0;
import com.google.android.gms.internal.ads.qx0;
import com.google.android.gms.internal.ads.s60;
import com.google.android.gms.internal.ads.sp0;
import com.google.android.gms.internal.ads.us;

/* JADX INFO: loaded from: classes.dex */
public final class j implements b, s60, b60, fq0, qx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1331b;

    public j() {
        this.f1330a = 8;
        this.f1331b = 2;
    }

    @Override // b4.b
    public final int a(Context context, String str) {
        return this.f1331b;
    }

    @Override // b4.b
    public final int b(Context context, String str, boolean z9) {
        return 0;
    }

    public final int c() {
        switch (this.f1330a) {
            case 1:
                int i10 = this.f1331b;
                if (i10 == 2) {
                    return 10;
                }
                if (i10 == 5) {
                    return 11;
                }
                if (i10 == 29) {
                    return 12;
                }
                if (i10 == 42) {
                    return 16;
                }
                if (i10 != 22) {
                    return i10 != 23 ? 0 : 15;
                }
                return 1073741824;
            default:
                return this.f1331b;
        }
    }

    @Override // com.google.android.gms.internal.ads.s60, com.google.android.gms.internal.ads.b60, com.google.android.gms.internal.ads.fq0
    /* JADX INFO: renamed from: zza */
    public final void mo5zza(Object obj) {
        switch (this.f1330a) {
            case 3:
                ((zzp) obj).zzdu(this.f1331b);
                break;
            case 4:
                ((sp0) obj).zzdu(this.f1331b);
                break;
            case 5:
                ((zzp) obj).zzdu(this.f1331b);
                break;
            case 6:
                ((us) obj).zze(this.f1331b);
                break;
            default:
                int i10 = this.f1331b;
                ds dsVar = (ds) ((es) obj);
                Parcel parcelM = dsVar.m();
                parcelM.writeInt(i10);
                dsVar.a0(parcelM, 7);
                break;
        }
    }

    public j(int i10) {
        this.f1330a = 10;
        this.f1331b = i10;
    }

    public /* synthetic */ j(int i10, int i11) {
        this.f1330a = i11;
        this.f1331b = i10;
    }

    public j(int i10, int i11, int i12) {
        this.f1330a = i12;
        if (i12 != 1) {
            this.f1331b = i10;
        } else {
            this.f1331b = i11;
        }
    }

    public /* synthetic */ j(j jVar) {
        this.f1330a = 9;
        this.f1331b = jVar.f1331b;
    }

    @Override // com.google.android.gms.internal.ads.qx0
    /* JADX INFO: renamed from: zza */
    public final Object mo3zza() {
        switch (this.f1330a) {
        }
        return Integer.valueOf(this.f1331b);
    }
}
