package u3;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class u implements k4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17617b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17618d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f17619f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f17620h;

    public u(d dVar, int i10, a aVar, long j10, long j11) {
        this.f17619f = dVar;
        this.f17618d = i10;
        this.f17620h = aVar;
        this.f17616a = j10;
        this.f17617b = j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.common.internal.ConnectionTelemetryConfiguration a(u3.o r4, v3.f r5, int r6) {
        /*
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r5 = r5.getTelemetryConfiguration()
            r0 = 0
            if (r5 == 0) goto L32
            boolean r1 = r5.f2487b
            if (r1 == 0) goto L32
            r1 = 0
            int[] r2 = r5.f2489f
            if (r2 != 0) goto L20
            int[] r2 = r5.f2491q
            if (r2 != 0) goto L15
            goto L27
        L15:
            int r3 = r2.length
            if (r1 >= r3) goto L27
            r3 = r2[r1]
            if (r3 != r6) goto L1d
            goto L32
        L1d:
            int r1 = r1 + 1
            goto L15
        L20:
            int r3 = r2.length
            if (r1 >= r3) goto L32
            r3 = r2[r1]
            if (r3 != r6) goto L2f
        L27:
            int r4 = r4.f17603x
            int r6 = r5.f2490h
            if (r4 >= r6) goto L2e
            return r5
        L2e:
            return r0
        L2f:
            int r1 = r1 + 1
            goto L20
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.u.a(u3.o, v3.f, int):com.google.android.gms.common.internal.ConnectionTelemetryConfiguration");
    }

    @Override // k4.b
    public final void i(k4.l lVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j10;
        long jCurrentTimeMillis;
        int iElapsedRealtime;
        if (((d) this.f17619f).a()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = v3.j.a().f17774a;
            if (rootTelemetryConfiguration == null || rootTelemetryConfiguration.f2516b) {
                o oVar = (o) ((d) this.f17619f).f17576v.get((a) this.f17620h);
                if (oVar != null) {
                    v3.h hVar = oVar.f17593b;
                    if (hVar instanceof v3.f) {
                        boolean z9 = this.f17616a > 0;
                        int gCoreServiceId = hVar.getGCoreServiceId();
                        if (rootTelemetryConfiguration != null) {
                            z9 &= rootTelemetryConfiguration.f2517d;
                            int i15 = rootTelemetryConfiguration.f2518f;
                            int i16 = rootTelemetryConfiguration.f2519h;
                            i10 = rootTelemetryConfiguration.f2515a;
                            if (hVar.hasConnectionInfo() && !hVar.isConnecting()) {
                                ConnectionTelemetryConfiguration connectionTelemetryConfigurationA = a(oVar, hVar, this.f17618d);
                                if (connectionTelemetryConfigurationA == null) {
                                    return;
                                }
                                boolean z10 = connectionTelemetryConfigurationA.f2488d && this.f17616a > 0;
                                i16 = connectionTelemetryConfigurationA.f2490h;
                                z9 = z10;
                            }
                            i11 = i15;
                            i12 = i16;
                        } else {
                            i10 = 0;
                            i11 = 5000;
                            i12 = 100;
                        }
                        d dVar = (d) this.f17619f;
                        if (lVar.d()) {
                            i13 = 0;
                            i14 = 0;
                        } else {
                            if (lVar.f14685d) {
                                i13 = 100;
                            } else {
                                Exception excA = lVar.a();
                                if (excA instanceof ApiException) {
                                    Status status = ((ApiException) excA).f2476a;
                                    int i17 = status.f2481a;
                                    ConnectionResult connectionResult = status.f2484f;
                                    i14 = connectionResult == null ? -1 : connectionResult.f2470b;
                                    i13 = i17;
                                } else {
                                    i13 = 101;
                                }
                            }
                            i14 = -1;
                        }
                        if (z9) {
                            long j11 = this.f17616a;
                            jCurrentTimeMillis = System.currentTimeMillis();
                            j10 = j11;
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f17617b);
                        } else {
                            j10 = 0;
                            jCurrentTimeMillis = 0;
                            iElapsedRealtime = -1;
                        }
                        MethodInvocation methodInvocation = new MethodInvocation(this.f17618d, i13, i14, j10, jCurrentTimeMillis, null, null, gCoreServiceId, iElapsedRealtime);
                        long j12 = i11;
                        e4.e eVar = dVar.f17579y;
                        eVar.sendMessage(eVar.obtainMessage(18, new v(methodInvocation, i10, j12, i12)));
                    }
                }
            }
        }
    }
}
