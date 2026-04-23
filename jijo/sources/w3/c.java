package w3;

import c2.n;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.ads.ur0;
import k4.l;
import m2.f;
import t3.e;
import u3.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ur0 f18154i = new ur0("ClientTelemetry.API", new b(0), new n(1));

    public final l d(TelemetryData telemetryData) {
        j jVar = new j();
        Feature[] featureArr = {e4.c.f12716a};
        jVar.f17585b = featureArr;
        jVar.f17586c = false;
        jVar.f17588e = new f(24, telemetryData);
        return c(2, new j(jVar, featureArr, false, jVar.f17587d));
    }
}
