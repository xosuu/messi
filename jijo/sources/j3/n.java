package j3;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzfc;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzp;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.internal.ads.ls;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.pe;
import com.google.android.gms.internal.ads.rn;
import com.google.android.gms.internal.ads.rs;

/* JADX INFO: loaded from: classes.dex */
public final class n extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f14345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn f14347d;

    public n(Context context, String str, rn rnVar) {
        this.f14345b = context;
        this.f14346c = str;
        this.f14347d = rnVar;
    }

    @Override // j3.o
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.a(this.f14345b, "rewarded");
        return new zzfc();
    }

    @Override // j3.o
    public final Object b(zzce zzceVar) {
        return zzceVar.zzo(new a4.b(this.f14345b), this.f14346c, this.f14347d, 242402000);
    }

    @Override // j3.o
    public final Object c() {
        String str = this.f14346c;
        rn rnVar = this.f14347d;
        Context context = this.f14345b;
        try {
            IBinder iBinderZze = ((rs) zzq.zzb(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new pe(18))).zze(new a4.b(context), str, rnVar, 242402000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return iInterfaceQueryLocalInterface instanceof ns ? (ns) iInterfaceQueryLocalInterface : new ls(iBinderZze);
        } catch (RemoteException e10) {
            e = e10;
            zzm.zzl("#007 Could not call remote method.", e);
            return null;
        } catch (zzp e11) {
            e = e11;
            zzm.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}
