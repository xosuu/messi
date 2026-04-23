package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ip extends p80 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f5663f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Activity f5664h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f5665q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f5666s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f5667t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f5668u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f5669v;

    public ip(fx fxVar, Map map) {
        long j10;
        super(fxVar, 10, "createCalendarEvent");
        this.f5663f = map;
        this.f5664h = fxVar.zzi();
        this.f5665q = l("description");
        this.f5668u = l("summary");
        String str = (String) map.get("start_ticks");
        long j11 = -1;
        if (str == null) {
            j10 = -1;
        } else {
            try {
                j10 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                j10 = -1;
            }
        }
        this.f5666s = j10;
        String str2 = (String) this.f5663f.get("end_ticks");
        if (str2 != null) {
            try {
                j11 = Long.parseLong(str2);
            } catch (NumberFormatException unused2) {
            }
        }
        this.f5667t = j11;
        this.f5669v = l("location");
    }

    public final String l(String str) {
        Map map = this.f5663f;
        return TextUtils.isEmpty((CharSequence) map.get(str)) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : (String) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.p80, com.google.android.gms.internal.ads.gi
    public final void zzc() {
        Activity activity = this.f5664h;
        if (activity == null) {
            h("Activity context is not available.");
            return;
        }
        zzu.zzp();
        z3.a.m(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"), "Intent can not be null");
        if (!(!activity.getPackageManager().queryIntentActivities(r1, 0).isEmpty())) {
            h("This feature is not available on the device.");
            return;
        }
        zzu.zzp();
        AlertDialog.Builder builderZzK = zzt.zzK(activity);
        Resources resourcesB = zzu.zzo().b();
        builderZzK.setTitle(resourcesB != null ? resourcesB.getString(R.string.f1952s5) : "Create calendar event");
        builderZzK.setMessage(resourcesB != null ? resourcesB.getString(R.string.f1953s6) : "Allow Ad to create a calendar event?");
        builderZzK.setPositiveButton(resourcesB != null ? resourcesB.getString(R.string.f1950s3) : "Accept", new hp(this, 0));
        builderZzK.setNegativeButton(resourcesB != null ? resourcesB.getString(R.string.f1951s4) : "Decline", new hp(this, 1));
        builderZzK.create().show();
    }
}
