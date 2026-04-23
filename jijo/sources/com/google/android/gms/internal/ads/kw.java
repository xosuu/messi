package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class kw implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6403a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6404b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6405d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6406f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f6407h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f6408q;

    public /* synthetic */ kw(AudioTrack audioTrack, im1 im1Var, Handler handler, jk1 jk1Var, c8.a aVar) {
        this.f6404b = audioTrack;
        this.f6405d = im1Var;
        this.f6406f = handler;
        this.f6407h = jk1Var;
        this.f6408q = aVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.lang.Runnable
    public final void run() {
        byte b10 = -1;
        switch (this.f6403a) {
            case 0:
                HashMap map = new HashMap();
                map.put(NotificationCompat.CATEGORY_EVENT, "precacheCanceled");
                map.put("src", (String) this.f6404b);
                String str = (String) this.f6405d;
                if (!TextUtils.isEmpty(str)) {
                    map.put("cachedSrc", str);
                }
                String str2 = (String) this.f6406f;
                switch (str2.hashCode()) {
                    case -1947652542:
                        if (str2.equals("interrupted")) {
                            b10 = 3;
                        }
                        break;
                    case -1396664534:
                        if (str2.equals("badUrl")) {
                            b10 = 8;
                        }
                        break;
                    case -1347010958:
                        if (str2.equals("inProgress")) {
                            b10 = 2;
                        }
                        break;
                    case -918817863:
                        if (str2.equals("downloadTimeout")) {
                            b10 = 9;
                        }
                        break;
                    case -659376217:
                        if (str2.equals("contentLengthMissing")) {
                            b10 = 0;
                        }
                        break;
                    case -642208130:
                        if (str2.equals("playerFailed")) {
                            b10 = 5;
                        }
                        break;
                    case -354048396:
                        if (str2.equals("sizeExceeded")) {
                            b10 = 11;
                        }
                        break;
                    case -32082395:
                        if (str2.equals("externalAbort")) {
                            b10 = 10;
                        }
                        break;
                    case 3387234:
                        if (str2.equals("noop")) {
                            b10 = 4;
                        }
                        break;
                    case 96784904:
                        if (str2.equals("error")) {
                            b10 = 1;
                        }
                        break;
                    case 580119100:
                        if (str2.equals("expireFailed")) {
                            b10 = 6;
                        }
                        break;
                    case 725497484:
                        if (str2.equals("noCacheDir")) {
                            b10 = 7;
                        }
                        break;
                }
                String str3 = "internal";
                switch (b10) {
                    case 6:
                    case 7:
                        str3 = "io";
                        break;
                    case 8:
                    case 9:
                        str3 = "network";
                        break;
                    case 10:
                    case 11:
                        str3 = "policy";
                        break;
                }
                map.put("type", str3);
                map.put("reason", str2);
                String str4 = (String) this.f6407h;
                if (!TextUtils.isEmpty(str4)) {
                    map.put("message", str4);
                }
                lw.j((lw) this.f6408q, map);
                return;
            case 1:
                be0 be0Var = (be0) this.f6405d;
                String str5 = (String) this.f6404b;
                wl wlVar = (wl) this.f6406f;
                vr0 vr0Var = (vr0) this.f6407h;
                List list = (List) this.f6408q;
                be0Var.getClass();
                try {
                    try {
                        if (Objects.equals(str5, "com.google.ads.mediation.admob.AdMobAdapter")) {
                            wlVar.zzf();
                            return;
                        }
                        Context context = (Context) be0Var.f3003g.get();
                        if (context == null) {
                            context = be0Var.f3002f;
                        }
                        vr0Var.b(context, wlVar, list);
                        return;
                    } catch (RemoteException e10) {
                        zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
                        return;
                    }
                } catch (RemoteException e11) {
                    throw new zzfvq(e11);
                } catch (zzffn unused) {
                    wlVar.a("Failed to initialize adapter. " + str5 + " does not implement the initialize() method.");
                    return;
                }
            default:
                AudioTrack audioTrack = (AudioTrack) this.f6404b;
                im1 im1Var = (im1) this.f6405d;
                Handler handler = (Handler) this.f6406f;
                jk1 jk1Var = (jk1) this.f6407h;
                c8.a aVar = (c8.a) this.f6408q;
                Object obj = gm1.f4967a0;
                int i10 = 18;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (im1Var != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new vh0(im1Var, i10, jk1Var));
                    }
                    aVar.c();
                    synchronized (gm1.f4967a0) {
                        try {
                            int i11 = gm1.f4969c0 - 1;
                            gm1.f4969c0 = i11;
                            if (i11 == 0) {
                                gm1.f4968b0.shutdown();
                                gm1.f4968b0 = null;
                            }
                        } finally {
                        }
                        break;
                    }
                    return;
                } catch (Throwable th) {
                    if (im1Var != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new vh0(im1Var, i10, jk1Var));
                    }
                    aVar.c();
                    synchronized (gm1.f4967a0) {
                        try {
                            int i12 = gm1.f4969c0 - 1;
                            gm1.f4969c0 = i12;
                            if (i12 == 0) {
                                gm1.f4968b0.shutdown();
                                gm1.f4968b0 = null;
                            }
                            throw th;
                        } finally {
                        }
                    }
                }
        }
    }

    public kw(lw lwVar, String str, String str2, String str3, String str4) {
        this.f6404b = str;
        this.f6405d = str2;
        this.f6406f = str3;
        this.f6407h = str4;
        this.f6408q = lwVar;
    }

    public /* synthetic */ kw(be0 be0Var, String str, ae0 ae0Var, vr0 vr0Var, ArrayList arrayList) {
        this.f6405d = be0Var;
        this.f6404b = str;
        this.f6406f = ae0Var;
        this.f6407h = vr0Var;
        this.f6408q = arrayList;
    }
}
