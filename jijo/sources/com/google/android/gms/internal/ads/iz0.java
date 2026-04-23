package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class iz0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f5729f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f5730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f5731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5734e;

    static {
        vg.a("media3.datasource");
    }

    public iz0(Uri uri, long j10, long j11) {
        this(uri, Collections.emptyMap(), j10, j11, 0);
    }

    public final String toString() {
        StringBuilder sbK = fb1.k("DataSpec[GET ", this.f5730a.toString(), ", ");
        sbK.append(this.f5732c);
        sbK.append(", ");
        sbK.append(this.f5733d);
        sbK.append(", null, ");
        return l.a0.h(sbK, this.f5734e, "]");
    }

    public iz0(Uri uri, Map map, long j10, long j11, int i10) {
        boolean z9 = false;
        boolean z10 = j10 >= 0;
        tc1.K(z10);
        tc1.K(z10);
        if (j11 > 0) {
            z9 = true;
        } else if (j11 == -1) {
            j11 = -1;
            z9 = true;
        }
        tc1.K(z9);
        uri.getClass();
        this.f5730a = uri;
        this.f5731b = Collections.unmodifiableMap(new HashMap(map));
        this.f5732c = j10;
        this.f5733d = j11;
        this.f5734e = i10;
    }
}
