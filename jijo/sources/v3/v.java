package v3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzk;

/* JADX INFO: loaded from: classes.dex */
public final class v extends f4.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f17797b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17798d;

    public v(f fVar, int i10) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 0);
        this.f17797b = fVar;
        this.f17798d = i10;
    }

    @Override // f4.a
    public final boolean m(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            int i11 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) f4.b.a(parcel, Bundle.CREATOR);
            f4.b.b(parcel);
            z3.a.m(this.f17797b, "onPostInitComplete can be called only once per call to getRemoteService");
            f fVar = this.f17797b;
            fVar.getClass();
            x xVar = new x(fVar, i11, strongBinder, bundle);
            u uVar = fVar.f17749l;
            uVar.sendMessage(uVar.obtainMessage(1, this.f17798d, -1, xVar));
            this.f17797b = null;
        } else if (i10 == 2) {
            parcel.readInt();
            f4.b.b(parcel);
            new Exception();
        } else {
            if (i10 != 3) {
                return false;
            }
            int i12 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            zzk zzkVar = (zzk) f4.b.a(parcel, zzk.CREATOR);
            f4.b.b(parcel);
            f fVar2 = this.f17797b;
            z3.a.m(fVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            z3.a.l(zzkVar);
            fVar2.B = zzkVar;
            if (fVar2.usesClientTelemetry()) {
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzkVar.f2534f;
                j jVarA = j.a();
                RootTelemetryConfiguration rootTelemetryConfiguration = connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.f2486a;
                synchronized (jVarA) {
                    if (rootTelemetryConfiguration == null) {
                        rootTelemetryConfiguration = j.f17773c;
                    } else {
                        RootTelemetryConfiguration rootTelemetryConfiguration2 = jVarA.f17774a;
                        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.f2515a < rootTelemetryConfiguration.f2515a) {
                        }
                    }
                    jVarA.f17774a = rootTelemetryConfiguration;
                }
            }
            Bundle bundle2 = zzkVar.f2531a;
            z3.a.m(this.f17797b, "onPostInitComplete can be called only once per call to getRemoteService");
            f fVar3 = this.f17797b;
            fVar3.getClass();
            x xVar2 = new x(fVar3, i12, strongBinder2, bundle2);
            u uVar2 = fVar3.f17749l;
            uVar2.sendMessage(uVar2.obtainMessage(1, this.f17798d, -1, xVar2));
            this.f17797b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
