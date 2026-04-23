package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.Base64;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class n6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f7181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f7182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f7183e;

    public n6(int i10, String str, int i11, ArrayList arrayList, byte[] bArr) {
        this.f7179a = i10;
        this.f7181c = str;
        this.f7180b = i11;
        this.f7182d = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
        this.f7183e = bArr;
    }

    public final int a() {
        int i10 = this.f7180b;
        if (i10 != 2) {
            return i10 != 3 ? 0 : 512;
        }
        return 2048;
    }

    public final JSONObject b() throws JSONException {
        String strZzp;
        String strEncodeToString;
        Object obj = this.f7183e;
        Object obj2 = this.f7182d;
        JSONObject jSONObject = new JSONObject();
        try {
            String str = ((ApplicationInfo) obj).packageName;
            ew0 ew0Var = zzt.zza;
            Context context = z3.b.a((Context) obj2).f16692a;
            jSONObject.put("name", context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", ((ApplicationInfo) obj).packageName);
        zzu.zzp();
        Drawable applicationIcon = null;
        try {
            strZzp = zzt.zzp((Context) obj2);
        } catch (RemoteException unused2) {
            strZzp = null;
        }
        jSONObject.put("adMobAppId", strZzp);
        boolean zIsEmpty = this.f7181c.isEmpty();
        int i10 = this.f7180b;
        int i11 = this.f7179a;
        if (zIsEmpty) {
            try {
                s3.g gVarA = z3.b.a((Context) obj2);
                String str2 = ((ApplicationInfo) obj).packageName;
                Context context2 = gVarA.f16692a;
                ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo(str2, 0);
                context2.getPackageManager().getApplicationLabel(applicationInfo);
                applicationIcon = context2.getPackageManager().getApplicationIcon(applicationInfo);
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (applicationIcon == null) {
                strEncodeToString = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            } else {
                applicationIcon.setBounds(0, 0, i11, i10);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
                applicationIcon.draw(new Canvas(bitmapCreateBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f7181c = strEncodeToString;
        }
        if (!this.f7181c.isEmpty()) {
            jSONObject.put("icon", this.f7181c);
            jSONObject.put("iconWidthPx", i11);
            jSONObject.put("iconHeightPx", i10);
        }
        return jSONObject;
    }

    public n6(Context context) {
        this.f7181c = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.f7182d = context;
        this.f7183e = context.getApplicationInfo();
        this.f7179a = ((Integer) zzba.zzc().a(eg.f4083n8)).intValue();
        this.f7180b = ((Integer) zzba.zzc().a(eg.f4093o8)).intValue();
    }
}
