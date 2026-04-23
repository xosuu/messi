package c8;

import com.google.android.gms.internal.ads.bf;
import com.google.android.gms.internal.ads.cf;
import com.google.android.gms.internal.ads.dk1;
import com.google.android.gms.internal.ads.jd;
import com.google.android.gms.internal.ads.p60;
import com.google.android.gms.internal.ads.px;
import com.google.android.gms.internal.ads.qe0;
import com.google.android.gms.internal.ads.rf;
import com.google.android.gms.internal.ads.s60;
import com.google.android.gms.internal.ads.sf;

/* JADX INFO: loaded from: classes.dex */
public final class a implements s60, qe0, jd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1584b;

    public /* synthetic */ a() {
        this.f1583a = 4;
    }

    public synchronized void a() {
        boolean z9 = false;
        while (!this.f1584b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z9 = true;
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean b() {
        boolean z9;
        z9 = this.f1584b;
        this.f1584b = false;
        return z9;
    }

    public synchronized boolean c() {
        if (this.f1584b) {
            return false;
        }
        this.f1584b = true;
        notifyAll();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.jd
    public void k(rf rfVar) {
        int i10 = px.f7981n0;
        bf bfVarA = cf.A();
        boolean zB = ((cf) bfVarA.f9462b).B();
        boolean z9 = this.f1584b;
        if (zB != z9) {
            bfVarA.d();
            cf.C((cf) bfVarA.f9462b, z9);
        }
        int i11 = this.f1583a;
        bfVarA.d();
        cf.D((cf) bfVarA.f9462b, i11);
        cf cfVar = (cf) bfVarA.b();
        rfVar.d();
        sf.I((sf) rfVar.f9462b, cfVar);
    }

    @Override // com.google.android.gms.internal.ads.s60, com.google.android.gms.internal.ads.b60, com.google.android.gms.internal.ads.fq0
    /* JADX INFO: renamed from: zza */
    public void mo5zza(Object obj) {
        switch (this.f1583a) {
            case 1:
                ((p60) obj).k(this.f1584b);
                break;
            case 2:
                ((p60) obj).h(this.f1584b);
                break;
            default:
                ((dk1) obj).h(this.f1584b);
                break;
        }
    }

    public /* synthetic */ a(int i10, boolean z9) {
        this.f1583a = i10;
        this.f1584b = z9;
    }

    public /* synthetic */ a(boolean z9) {
        this.f1583a = 0;
        this.f1584b = z9;
    }
}
