package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzu;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mh0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6942b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6943d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6944f;

    public mh0(mp mpVar, String str, String str2) {
        this.f6941a = 2;
        this.f6942b = str;
        this.f6943d = str2;
        this.f6944f = mpVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = this.f6941a;
        Object obj = this.f6943d;
        Object obj2 = this.f6942b;
        Object obj3 = this.f6944f;
        switch (i11) {
            case 0:
                qh0 qh0Var = (qh0) obj2;
                Activity activity = (Activity) obj;
                zzm zzmVar = (zzm) obj3;
                qh0Var.getClass();
                HashMap map = new HashMap();
                map.put("dialog_action", "confirm");
                qh0Var.y1(map, qh0Var.f8185s, "rtsdc");
                activity.startActivity(zzu.zzq().zzf(activity));
                qh0Var.z1();
                if (zzmVar != null) {
                    zzmVar.zzb();
                }
                break;
            case 1:
                qh0 qh0Var2 = (qh0) obj2;
                qh0Var2.getClass();
                HashMap map2 = new HashMap();
                map2.put("dialog_action", "confirm");
                qh0Var2.y1(map2, qh0Var2.f8185s, "dialog_click");
                qh0Var2.A1((Activity) obj, (zzm) obj3);
                break;
            default:
                mp mpVar = (mp) obj3;
                DownloadManager downloadManager = (DownloadManager) mpVar.f7027h.getSystemService("download");
                try {
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse((String) obj2));
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, (String) obj);
                    zzu.zzp();
                    request.allowScanningByMediaScanner();
                    request.setNotificationVisibility(1);
                    downloadManager.enqueue(request);
                } catch (IllegalStateException unused) {
                    mpVar.h("Could not store picture.");
                }
                break;
        }
    }

    public /* synthetic */ mh0(qh0 qh0Var, Activity activity, zzm zzmVar, int i10) {
        this.f6941a = i10;
        this.f6942b = qh0Var;
        this.f6943d = activity;
        this.f6944f = zzmVar;
    }
}
