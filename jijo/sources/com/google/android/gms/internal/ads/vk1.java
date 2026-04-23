package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class vk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uk1 f9907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9908c;

    static {
        if (yn0.f10944a < 31) {
            new vk1(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        } else {
            int i10 = uk1.f9527b;
        }
    }

    public vk1(LogSessionId logSessionId, String str) {
        this.f9907b = new uk1(logSessionId);
        this.f9906a = str;
        this.f9908c = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk1)) {
            return false;
        }
        vk1 vk1Var = (vk1) obj;
        return Objects.equals(this.f9906a, vk1Var.f9906a) && Objects.equals(this.f9907b, vk1Var.f9907b) && Objects.equals(this.f9908c, vk1Var.f9908c);
    }

    public final int hashCode() {
        return Objects.hash(this.f9906a, this.f9907b, this.f9908c);
    }

    public vk1(String str) {
        tc1.W(yn0.f10944a < 31);
        this.f9906a = str;
        this.f9907b = null;
        this.f9908c = new Object();
    }
}
