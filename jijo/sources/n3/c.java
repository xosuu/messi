package n3;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.nonagon.signalgeneration.zzak;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.k21;
import com.google.android.gms.internal.ads.tq;
import com.google.android.gms.internal.ads.vt0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements k21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tq f15936b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f15937d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzak f15938f;

    public /* synthetic */ c(zzak zzakVar, tq tqVar, boolean z9, int i10) {
        this.f15935a = i10;
        this.f15936b = tqVar;
        this.f15937d = z9;
        this.f15938f = zzakVar;
    }

    @Override // com.google.android.gms.internal.ads.k21
    public final void E(Throwable th) {
        int i10 = this.f15935a;
        tq tqVar = this.f15936b;
        switch (i10) {
            case 0:
                try {
                    tqVar.a("Internal error: " + th.getMessage());
                } catch (RemoteException e10) {
                    zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
                    return;
                }
                break;
            default:
                try {
                    tqVar.a("Internal error: " + th.getMessage());
                } catch (RemoteException e11) {
                    zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e11);
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.k21, com.google.android.gms.internal.ads.pl0
    /* JADX INFO: renamed from: a */
    public final void mo4a(Object obj) {
        int i10 = this.f15935a;
        boolean z9 = this.f15937d;
        tq tqVar = this.f15936b;
        zzak zzakVar = this.f15938f;
        switch (i10) {
            case 0:
                ArrayList<Uri> arrayList = (ArrayList) obj;
                try {
                    tqVar.h0(arrayList);
                    if (zzakVar.f2368y || z9) {
                        for (Uri uri : arrayList) {
                            boolean zA1 = zzak.A1(uri, zzakVar.K, zzakVar.L);
                            vt0 vt0Var = zzakVar.f2367x;
                            if (zA1) {
                                vt0Var.a(zzak.B1(uri, zzakVar.H, "1").toString(), null);
                            } else {
                                if (((Boolean) zzba.zzc().a(eg.J6)).booleanValue()) {
                                    vt0Var.a(uri.toString(), null);
                                }
                            }
                            break;
                        }
                    }
                } catch (RemoteException e10) {
                    zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
                    return;
                }
                break;
            default:
                List<Uri> list = (List) obj;
                try {
                    ArrayList arrayList2 = zzak.R;
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (zzak.A1((Uri) it.next(), zzakVar.I, zzakVar.J)) {
                                zzakVar.E.getAndIncrement();
                            }
                        }
                    }
                    tqVar.h0(list);
                    if (zzakVar.f2369z || z9) {
                        for (Uri uri2 : list) {
                            boolean zA12 = zzak.A1(uri2, zzakVar.I, zzakVar.J);
                            vt0 vt0Var2 = zzakVar.f2367x;
                            if (zA12) {
                                vt0Var2.a(zzak.B1(uri2, zzakVar.H, "1").toString(), null);
                            } else {
                                if (((Boolean) zzba.zzc().a(eg.J6)).booleanValue()) {
                                    vt0Var2.a(uri2.toString(), null);
                                }
                            }
                            break;
                        }
                    }
                } catch (RemoteException e11) {
                    zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e11);
                }
                break;
        }
    }
}
