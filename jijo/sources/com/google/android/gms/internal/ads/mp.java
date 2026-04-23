package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.util.zzcd;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class mp extends p80 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f7026f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Activity f7027h;

    public mp(fx fxVar, Map map) {
        super(fxVar, 10, "storePicture");
        this.f7026f = map;
        this.f7027h = fxVar.zzi();
    }

    @Override // com.google.android.gms.internal.ads.p80, com.google.android.gms.internal.ads.c4
    public final void zzb() {
        Activity activity = this.f7027h;
        if (activity == null) {
            h("Activity context is not available");
            return;
        }
        zzu.zzp();
        if (!((Boolean) zzcd.zza(activity, new wf(0))).booleanValue() || z3.b.a(activity).f16692a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            h("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.f7026f.get("iurl");
        if (TextUtils.isEmpty(str)) {
            h("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            h("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        zzu.zzp();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            h("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources resourcesB = zzu.zzo().b();
        zzu.zzp();
        AlertDialog.Builder builderZzK = zzt.zzK(activity);
        builderZzK.setTitle(resourcesB != null ? resourcesB.getString(R.string.f1948s1) : "Save image");
        builderZzK.setMessage(resourcesB != null ? resourcesB.getString(R.string.f1949s2) : "Allow Ad to store image in Picture gallery?");
        builderZzK.setPositiveButton(resourcesB != null ? resourcesB.getString(R.string.f1950s3) : "Accept", new mh0(this, str, lastPathSegment));
        builderZzK.setNegativeButton(resourcesB != null ? resourcesB.getString(R.string.f1951s4) : "Decline", new lp(0, this));
        builderZzK.create().show();
    }
}
