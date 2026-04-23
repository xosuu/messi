package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class n00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzg f7088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ai0 f7089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nc0 f7090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p21 f7091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p21 f7092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ScheduledExecutorService f7093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public dr f7094h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public dr f7095i;

    public n00(Context context, zzj zzjVar, ai0 ai0Var, nc0 nc0Var, mu muVar, p21 p21Var, ScheduledExecutorService scheduledExecutorService) {
        this.f7087a = context;
        this.f7088b = zzjVar;
        this.f7089c = ai0Var;
        this.f7090d = nc0Var;
        this.f7091e = muVar;
        this.f7092f = p21Var;
        this.f7093g = scheduledExecutorService;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) zzba.zzc().a(eg.n9));
    }

    public final n5.a a(String str, Random random) {
        return TextUtils.isEmpty(str) ? tc1.d0(str) : tc1.V(c(str, this.f7090d.f7243a, random), Throwable.class, new uk(this, str, 1), this.f7091e);
    }

    public final n5.a c(String str, InputEvent inputEvent, Random random) {
        try {
            if (!str.contains((CharSequence) zzba.zzc().a(eg.n9)) || this.f7088b.zzS()) {
                return tc1.d0(str);
            }
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((String) zzba.zzc().a(eg.o9), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (inputEvent != null) {
                return tc1.V(tc1.q0(h21.r(this.f7089c.a()), new hn(this, builderBuildUpon, str, inputEvent), this.f7092f), Throwable.class, new jn(this, 3, builderBuildUpon), this.f7091e);
            }
            builderBuildUpon.appendQueryParameter((String) zzba.zzc().a(eg.p9), "11");
            return tc1.d0(builderBuildUpon.toString());
        } catch (Exception e10) {
            return tc1.Z(e10);
        }
    }
}
