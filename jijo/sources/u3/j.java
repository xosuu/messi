package u3;

import android.os.Parcel;
import android.view.View;
import com.google.android.gms.appset.zza;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import o0.v0;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f17585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f17588e;

    public /* synthetic */ j() {
        this.f17584a = 0;
        this.f17586c = true;
        this.f17587d = 0;
    }

    public final void a(int i10) {
        switch (this.f17584a) {
            case 2:
                WeakReference weakReference = ((BottomSheetBehavior) this.f17585b).U;
                if (weakReference != null && weakReference.get() != null) {
                    this.f17587d = i10;
                    if (!this.f17586c) {
                        View view = (View) ((BottomSheetBehavior) this.f17585b).U.get();
                        Runnable runnable = (Runnable) this.f17588e;
                        WeakHashMap weakHashMap = v0.f16075a;
                        o0.d0.m(view, runnable);
                        this.f17586c = true;
                    }
                    break;
                }
                break;
            default:
                WeakReference weakReference2 = ((SideSheetBehavior) this.f17585b).f11944n;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f17587d = i10;
                    if (!this.f17586c) {
                        View view2 = (View) ((SideSheetBehavior) this.f17585b).f11944n.get();
                        Runnable runnable2 = (Runnable) this.f17588e;
                        WeakHashMap weakHashMap2 = v0.f16075a;
                        o0.d0.m(view2, runnable2);
                        this.f17586c = true;
                    }
                    break;
                }
                break;
        }
    }

    public final void b(v3.h hVar, k4.e eVar) {
        Parcel parcelObtain;
        m2.f fVar = (m2.f) ((i) ((j) this.f17588e).f17588e);
        switch (fVar.f15700a) {
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                TelemetryData telemetryData = (TelemetryData) fVar.f15701b;
                w3.a aVar = (w3.a) ((w3.d) hVar).getService();
                aVar.getClass();
                parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(aVar.f12714b);
                int i10 = e4.b.f12715a;
                if (telemetryData == null) {
                    parcelObtain.writeInt(0);
                } else {
                    parcelObtain.writeInt(1);
                    telemetryData.writeToParcel(parcelObtain, 0);
                }
                try {
                    aVar.f12713a.transact(1, parcelObtain, null, 1);
                    parcelObtain.recycle();
                    eVar.f14669a.f(null);
                    return;
                } finally {
                    parcelObtain.recycle();
                }
            default:
                d4.d dVar = (d4.d) ((d4.b) hVar).getService();
                zza zzaVar = new zza(null, null);
                d4.g gVar = new d4.g(eVar);
                dVar.getClass();
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
                int i11 = d4.a.f12355a;
                parcelObtain2.writeInt(1);
                zzaVar.writeToParcel(parcelObtain2, 0);
                parcelObtain2.writeStrongBinder(gVar);
                parcelObtain = Parcel.obtain();
                try {
                    dVar.f12356a.transact(1, parcelObtain2, parcelObtain, 0);
                    parcelObtain.readException();
                    return;
                } finally {
                    parcelObtain2.recycle();
                }
        }
    }

    public j(j jVar, Feature[] featureArr, boolean z9, int i10) {
        this.f17584a = 1;
        this.f17588e = jVar;
        this.f17585b = featureArr;
        this.f17586c = featureArr != null && z9;
        this.f17587d = i10;
    }

    public j(SideSheetBehavior sideSheetBehavior) {
        this.f17584a = 3;
        this.f17585b = sideSheetBehavior;
        this.f17588e = new androidx.activity.b(6, this);
    }

    public j(BottomSheetBehavior bottomSheetBehavior) {
        this.f17584a = 2;
        this.f17585b = bottomSheetBehavior;
        this.f17588e = new androidx.activity.e(24, this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(BottomSheetBehavior bottomSheetBehavior, int i10) {
        this(bottomSheetBehavior);
        this.f17584a = 2;
    }
}
