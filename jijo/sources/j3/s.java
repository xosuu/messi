package j3;

import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.internal.ads.ie0;
import com.google.android.gms.internal.ads.jb;
import com.google.android.gms.internal.ads.yl;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s extends yl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14351a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14352b;

    @Override // com.google.android.gms.internal.ads.zl
    public final void r0(List list) {
        int i10;
        ArrayList arrayList;
        switch (this.f14351a) {
            case 0:
                synchronized (((zzej) this.f14352b).f2026a) {
                    Object obj = this.f14352b;
                    ((zzej) obj).f2028c = false;
                    ((zzej) obj).f2029d = true;
                    arrayList = new ArrayList(((zzej) this.f14352b).f2027b);
                    ((zzej) this.f14352b).f2027b.clear();
                    break;
                }
                jb jbVarB = zzej.b(list);
                int size = arrayList.size();
                for (i10 = 0; i10 < size; i10++) {
                    ((OnInitializationCompleteListener) arrayList.get(i10)).onInitializationComplete(jbVarB);
                }
                return;
            default:
                ((ie0) this.f14352b).b(list);
                return;
        }
    }

    public s(ie0 ie0Var) {
        this.f14352b = ie0Var;
    }
}
