package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.JsonReader;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.common.ConnectionResult;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class p80 implements c4, r7, v3.c, v3.b, MediationAdLoadCallback, k21, cw0, gi, yx, x11, rs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f7834b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f7835d;

    public p80(Context context) {
        this.f7833a = 4;
        this.f7835d = context;
        this.f7834b = null;
    }

    @Override // com.google.android.gms.internal.ads.k21
    public final void E(Throwable th) {
        switch (this.f7833a) {
            case 12:
                ((su) this.f7835d).mo1zza();
                break;
            case 15:
                s00 s00Var = (s00) this.f7835d;
                s00Var.f8749t.a(s00Var.f8748s.b(s00Var.f8746h, s00Var.f8747q, false, (String) this.f7834b, null, s00Var.b()));
                break;
            case 17:
                nu.f7387e.execute(new s9(22, (w20) this.f7835d));
                ((k21) this.f7834b).E(th);
                break;
            case 19:
                if (((Boolean) zzba.zzc().a(eg.I4)).booleanValue()) {
                    zzu.zzo().h("omid native display exp", th);
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.k21, com.google.android.gms.internal.ads.pl0
    /* JADX INFO: renamed from: a */
    public final void mo4a(Object obj) {
        qu quVar;
        switch (this.f7833a) {
            case 12:
                ((tu) this.f7834b).mo5zza(obj);
                return;
            case 15:
                s00 s00Var = (s00) this.f7835d;
                s00Var.f8749t.a(s00Var.f8748s.b(s00Var.f8746h, s00Var.f8747q, false, (String) this.f7834b, (String) obj, s00Var.b()));
                return;
            case 17:
                nu.f7387e.execute(new s9(22, (w20) this.f7835d));
                ((k21) this.f7834b).mo4a((r20) obj);
                return;
            case 19:
                ((i90) this.f7835d).f5530k.n((fx) obj);
                i90 i90Var = (i90) this.f7835d;
                n90 n90Var = i90Var.f5530k;
                synchronized (n90Var) {
                    quVar = n90Var.f7211n;
                }
                zh0 zh0VarW = i90Var.w((String) this.f7834b, true);
                if (zh0VarW != null && quVar != null) {
                    quVar.b(zh0VarW);
                    return;
                } else {
                    if (quVar != null) {
                        quVar.cancel(false);
                        return;
                    }
                    return;
                }
            case 23:
                ((fx) obj).M((String) this.f7834b, (wk) this.f7835d);
                return;
            default:
                ((fe0) obj).f4504y = true;
                ((te0) this.f7835d).f9145f.b((String) this.f7834b);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x037b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ff  */
    /* JADX WARN: Type inference failed for: r4v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1091)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // com.google.android.gms.internal.ads.c4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(byte[] r20, int r21, int r22, com.google.android.gms.internal.ads.e4 r23) {
        /*
            Method dump skipped, instruction units count: 1104
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p80.c(byte[], int, int, com.google.android.gms.internal.ads.e4):void");
    }

    public final g0 d(Object... objArr) {
        Constructor constructorG;
        synchronized (((AtomicBoolean) this.f7835d)) {
            if (!((AtomicBoolean) this.f7835d).get()) {
                try {
                    try {
                        constructorG = ((qz) ((b0) this.f7834b)).g();
                    } catch (ClassNotFoundException unused) {
                        ((AtomicBoolean) this.f7835d).set(true);
                        constructorG = null;
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
            constructorG = null;
        }
        if (constructorG == null) {
            return null;
        }
        try {
            return (g0) constructorG.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }

    public final vg0 e(ug0 ug0Var) throws zzdwl {
        vg0 vg0Var;
        zzt zztVarZzp;
        Context context;
        String str;
        int responseCode;
        InputStreamReader inputStreamReader;
        BufferedOutputStream bufferedOutputStream;
        p80 p80Var = this;
        String str2 = ug0Var.f9472a;
        int i10 = ug0Var.f9473b;
        Map map = ug0Var.f9474c;
        byte[] bArr = ug0Var.f9475d;
        String str3 = ug0Var.f9476e;
        ((y3.b) zzu.zzB()).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            vg0 vg0Var2 = new vg0();
            zzm.zzi("SDK version: " + ((String) p80Var.f7835d));
            zzm.zze("AdRequestServiceImpl: Sending request: " + str2);
            URL url = new URL(str2);
            HashMap map2 = new HashMap();
            int i11 = 0;
            while (true) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                try {
                    try {
                        zztVarZzp = zzu.zzp();
                        context = (Context) p80Var.f7834b;
                        str = (String) p80Var.f7835d;
                        vg0Var = vg0Var2;
                    } catch (Throwable th) {
                        httpURLConnection.disconnect();
                        throw th;
                    }
                } catch (zzdwl e10) {
                    e = e10;
                    vg0Var = vg0Var2;
                }
                try {
                    zztVarZzp.zzf(context, str, false, httpURLConnection, false, i10);
                    for (Map.Entry entry : map.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        httpURLConnection.setRequestProperty("Content-Type", str3);
                    }
                    int length = bArr.length;
                    BufferedOutputStream bufferedOutputStream2 = null;
                    if (length > 0) {
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setFixedLengthStreamingMode(length);
                        try {
                            bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            bufferedOutputStream.write(bArr);
                            y3.c.b(bufferedOutputStream);
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedOutputStream2 = bufferedOutputStream;
                            y3.c.b(bufferedOutputStream2);
                            throw th;
                        }
                    }
                    zzl zzlVar = new zzl(null);
                    zzlVar.zzc(httpURLConnection, bArr);
                    responseCode = httpURLConnection.getResponseCode();
                    for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                        String key = entry2.getKey();
                        List<String> value = entry2.getValue();
                        if (map2.containsKey(key)) {
                            ((List) map2.get(key)).addAll(value);
                        } else {
                            map2.put(key, new ArrayList(value));
                        }
                    }
                    zzlVar.zze(httpURLConnection, responseCode);
                    vg0Var.f9840a = responseCode;
                    vg0Var.f9841b = map2;
                    vg0Var.f9842c = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    if (responseCode >= 200 && responseCode < 300) {
                        try {
                            InputStreamReader inputStreamReader2 = new InputStreamReader(httpURLConnection.getInputStream());
                            try {
                                zzu.zzp();
                                String strZzN = zzt.zzN(inputStreamReader2);
                                y3.c.b(inputStreamReader2);
                                zzlVar.zzg(strZzN);
                                vg0Var.f9842c = strZzN;
                                if (TextUtils.isEmpty(strZzN)) {
                                    if (!((Boolean) zzba.zzc().a(eg.R4)).booleanValue()) {
                                        throw new zzdwl(3);
                                    }
                                }
                                ((y3.b) zzu.zzB()).getClass();
                                vg0Var.f9843d = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            } catch (Throwable th4) {
                                th = th4;
                                inputStreamReader = inputStreamReader2;
                                y3.c.b(inputStreamReader);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            inputStreamReader = null;
                        }
                    } else {
                        if (responseCode < 300 || responseCode >= 400) {
                            break;
                        }
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (TextUtils.isEmpty(headerField)) {
                            zzm.zzj("No location header to follow redirect.");
                            throw new zzdwl(1, "No location header to follow redirect");
                        }
                        URL url2 = new URL(headerField);
                        i11++;
                        if (i11 > ((Integer) zzba.zzc().a(eg.f4185y4)).intValue()) {
                            zzm.zzj("Too many redirects.");
                            throw new zzdwl(1, "Too many redirects");
                        }
                        httpURLConnection.disconnect();
                        vg0Var2 = vg0Var;
                        url = url2;
                        p80Var = this;
                    }
                } catch (zzdwl e11) {
                    e = e11;
                    if (!((Boolean) zzba.zzc().a(eg.f4178x7)).booleanValue()) {
                        throw e;
                    }
                    ((y3.b) zzu.zzB()).getClass();
                    vg0Var.f9843d = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    httpURLConnection.disconnect();
                    return vg0Var;
                }
            }
            zzm.zzj("Received error HTTP response code: " + responseCode);
            throw new zzdwl(1, "Received error HTTP response code: " + responseCode);
        } catch (IOException e12) {
            String strConcat = "Error while connecting to ad server: ".concat(String.valueOf(e12.getMessage()));
            zzm.zzj(strConcat);
            throw new zzdwl(strConcat, e12);
        }
    }

    public Set f(r30 r30Var) {
        return Collections.singleton(new n70(r30Var, nu.f7388f));
    }

    public Set g(r30 r30Var) {
        return Collections.singleton(new n70(r30Var, nu.f7388f));
    }

    public final void h(String str) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("message", str).put("action", (String) this.f7835d);
            fx fxVar = (fx) this.f7834b;
            if (fxVar != null) {
                fxVar.E(jSONObjectPut, "onError");
            }
        } catch (JSONException e10) {
            zzm.zzh("Error occurred while dispatching error event.", e10);
        }
    }

    public final void i(int i10, int i11, int i12, int i13, float f10, int i14) {
        try {
            ((fx) this.f7834b).E(new JSONObject().put("width", i10).put("height", i11).put("maxSizeWidth", i12).put("maxSizeHeight", i13).put("density", f10).put("rotation", i14), "onScreenInfoChanged");
        } catch (JSONException e10) {
            zzm.zzh("Error occurred while obtaining screen information.", e10);
        }
    }

    public final void j(int i10, int i11, int i12, int i13) {
        try {
            ((fx) this.f7834b).E(new JSONObject().put("x", i10).put("y", i11).put("width", i12).put("height", i13), "onSizeChanged");
        } catch (JSONException e10) {
            zzm.zzh("Error occurred while dispatching size change.", e10);
        }
    }

    public final void k(String str) {
        try {
            ((fx) this.f7834b).E(new JSONObject().put("state", str), "onStateChanged");
        } catch (JSONException e10) {
            zzm.zzh("Error occurred while dispatching state change.", e10);
        }
    }

    @Override // v3.b
    public final void m(int i10) {
        ((qu) this.f7834b).c(new RuntimeException(fb1.g("onConnectionSuspended: ", i10)));
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        switch (this.f7833a) {
            case 8:
                try {
                    ((so) this.f7834b).zzf(adError.zza());
                } catch (RemoteException e10) {
                    zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
                    return;
                }
                break;
            default:
                try {
                    ((xo) this.f7834b).zzf(adError.zza());
                } catch (RemoteException e11) {
                    zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e11);
                }
                break;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final Object onSuccess(Object obj) {
        int i10 = 8;
        switch (this.f7833a) {
            case 8:
                MediationBannerAd mediationBannerAd = (MediationBannerAd) obj;
                if (mediationBannerAd != null) {
                    try {
                        ((so) this.f7834b).j(new a4.b(mediationBannerAd.getView()));
                    } catch (RemoteException e10) {
                        zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
                    }
                } else {
                    zzm.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                    try {
                        ((so) this.f7834b).a("Adapter returned null.");
                    } catch (RemoteException e11) {
                        zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e11);
                        return null;
                    }
                }
                break;
            default:
                NativeAdMapper nativeAdMapper = (NativeAdMapper) obj;
                if (nativeAdMapper != null) {
                    try {
                        ((xo) this.f7834b).i1(new mo(nativeAdMapper));
                    } catch (RemoteException e12) {
                        zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e12);
                    }
                } else {
                    zzm.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                    try {
                        ((xo) this.f7834b).a("Adapter returned null.");
                    } catch (RemoteException e13) {
                        zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e13);
                        return null;
                    }
                }
                break;
        }
        return new rk0(i10, (wn) this.f7835d);
    }

    @Override // v3.b
    public final void r(Bundle bundle) {
        try {
            ((qu) this.f7834b).b(((cd) ((c.a) this.f7835d).f1490a).n());
        } catch (DeadObjectException e10) {
            ((qu) this.f7834b).c(e10);
        }
    }

    @Override // v3.c
    public final void t(ConnectionResult connectionResult) {
        synchronized (((l7) this.f7835d).f6524b) {
            ((qu) this.f7834b).c(new RuntimeException("Connection failed."));
        }
    }

    @Override // com.google.android.gms.internal.ads.rs0
    public final Object zza(Object obj) {
        switch (this.f7833a) {
            case 27:
                InputStreamReader inputStreamReader = new InputStreamReader((InputStream) obj);
                try {
                    try {
                        JsonReader jsonReader = new JsonReader(inputStreamReader);
                        HashMap map = new HashMap();
                        String strNextString = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        jsonReader.beginObject();
                        long jNextLong = -1;
                        int iNextInt = 0;
                        while (jsonReader.hasNext()) {
                            String strNextName = jsonReader.nextName();
                            if ("response".equals(strNextName)) {
                                iNextInt = jsonReader.nextInt();
                            } else if ("body".equals(strNextName)) {
                                strNextString = jsonReader.nextString();
                            } else if ("latency".equals(strNextName)) {
                                jNextLong = jsonReader.nextLong();
                            } else if ("headers".equals(strNextName)) {
                                map = new HashMap();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    map.put(jsonReader.nextName(), zzbs.zzd(jsonReader));
                                }
                                jsonReader.endObject();
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        vg0 vg0Var = new vg0();
                        vg0Var.f9840a = iNextInt;
                        if (strNextString != null) {
                            vg0Var.f9842c = strNextString;
                        }
                        vg0Var.f9843d = jNextLong;
                        vg0Var.f9841b = map;
                        y3.c.b(inputStreamReader);
                        return new rg0(vg0Var, (JSONObject) this.f7834b, (tr) this.f7835d);
                    } catch (Throwable th) {
                        y3.c.b(inputStreamReader);
                        throw th;
                    }
                } catch (IOException e10) {
                    e = e10;
                    throw new zzfep("Unable to parse Response", e);
                } catch (AssertionError e11) {
                    e = e11;
                    throw new zzfep("Unable to parse Response", e);
                } catch (IllegalStateException e12) {
                    e = e12;
                    throw new zzfep("Unable to parse Response", e);
                } catch (NumberFormatException e13) {
                    e = e13;
                    throw new zzfep("Unable to parse Response", e);
                }
            case 28:
                return e((ug0) obj);
            default:
                lh0 lh0Var = (lh0) this.f7834b;
                s7 s7Var = (s7) this.f7835d;
                lh0Var.getClass();
                ContentValues contentValues = new ContentValues();
                contentValues.put("timestamp", Long.valueOf(s7Var.f8812a));
                contentValues.put("gws_query_id", (String) s7Var.f8814c);
                contentValues.put("url", (String) s7Var.f8815d);
                contentValues.put("event_state", Integer.valueOf(s7Var.f8813b - 1));
                ((SQLiteDatabase) obj).insert("offline_buffered_pings", null, contentValues);
                zzu.zzp();
                Context context = lh0Var.f6627a;
                zzbr zzbrVarZzz = zzt.zzz(context);
                if (zzbrVarZzz != null) {
                    try {
                        zzbrVarZzz.zze(new a4.b(context));
                    } catch (RemoteException e14) {
                        zze.zzb("Failed to schedule offline ping sender.", e14);
                    }
                    break;
                }
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.c4
    public void zzb() {
        switch (this.f7833a) {
            case 3:
                break;
            default:
                Context context = (Context) this.f7834b;
                if (context != null && ((PopupWindow) this.f7835d) != null) {
                    if ((!(context instanceof Activity) || !((Activity) context).isDestroyed()) && ((PopupWindow) this.f7835d).isShowing()) {
                        ((PopupWindow) this.f7835d).dismiss();
                    }
                    this.f7834b = null;
                    this.f7835d = null;
                    break;
                }
                break;
        }
    }

    public void zzc() {
        switch (this.f7833a) {
            case 20:
                wz0 wz0Var = v90.A;
                Map mapZzm = ((ga0) this.f7834b).zzm();
                if (mapZzm == null) {
                    return;
                }
                int i10 = wz0Var.f10384f;
                int i11 = 0;
                while (i11 < i10) {
                    Object obj = mapZzm.get((String) wz0Var.get(i11));
                    i11++;
                    if (obj != null) {
                        ((ga0) this.f7834b).onClick((ViewGroup) this.f7835d);
                        return;
                    }
                }
                return;
            default:
                i90 i90Var = ((mb0) this.f7835d).f6897f;
                if (i90Var != null) {
                    String str = (String) this.f7834b;
                    synchronized (i90Var) {
                        i90Var.f5531l.l(str);
                    }
                    return;
                }
                return;
        }
    }

    public p80(Context context, String str) {
        this.f7833a = 28;
        this.f7834b = context;
        this.f7835d = str;
    }

    public /* synthetic */ p80(zy zyVar) {
        this.f7833a = 14;
        this.f7834b = zyVar;
    }

    public p80(i90 i90Var) {
        this.f7833a = 19;
        this.f7834b = "Google";
        this.f7835d = i90Var;
    }

    public p80(mb0 mb0Var) {
        this.f7833a = 22;
        this.f7834b = NativeCustomFormatAd.ASSET_NAME_VIDEO;
        this.f7835d = mb0Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        switch (this.f7833a) {
            case 8:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            default:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
        }
    }

    public /* synthetic */ p80(Object obj, int i10, Object obj2) {
        this.f7833a = i10;
        this.f7834b = obj;
        this.f7835d = obj2;
    }

    public /* synthetic */ p80(Object obj, Object obj2, int i10) {
        this.f7833a = i10;
        this.f7834b = obj2;
        this.f7835d = obj;
    }

    public /* synthetic */ p80(Object obj, Object obj2, int i10, int i11) {
        this.f7833a = i10;
        this.f7834b = obj;
        this.f7835d = obj2;
    }

    public p80(int i10) {
        this.f7833a = i10;
        if (i10 == 3) {
            this.f7834b = new ik0();
            this.f7835d = new b5();
        } else if (i10 != 24) {
            this.f7834b = new ByteArrayOutputStream(512);
            this.f7835d = new DataOutputStream((ByteArrayOutputStream) this.f7834b);
        }
    }

    public p80(lg lgVar) {
        this.f7833a = 6;
        this.f7835d = lgVar;
        this.f7834b = new HashMap();
    }

    public p80(qz qzVar) {
        this.f7833a = 1;
        this.f7834b = qzVar;
        this.f7835d = new AtomicBoolean(false);
    }

    @Override // com.google.android.gms.internal.ads.cw0
    public final hw0 zza() {
        AtomicInteger atomicInteger = yw.G;
        hw0 hw0VarZza = ((cw0) this.f7834b).zza();
        byte[] bArr = (byte[]) this.f7835d;
        return new vw(new ru0(bArr), bArr.length, hw0VarZza);
    }

    @Override // com.google.android.gms.internal.ads.r7
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public final File mo7zza() {
        if (((File) this.f7834b) == null) {
            this.f7834b = new File(((Context) this.f7835d).getCacheDir(), "volley");
        }
        return (File) this.f7834b;
    }

    @Override // com.google.android.gms.internal.ads.x11
    /* JADX INFO: renamed from: zza */
    public final n5.a mo2zza() {
        n5.a aVarR0;
        xq xqVar = (xq) this.f7834b;
        zzbug zzbugVar = (zzbug) this.f7835d;
        xqVar.getClass();
        long jLongValue = ((Long) zzba.zzc().a(eg.Ha)).longValue();
        hg0 hg0Var = (hg0) xqVar.f10632f;
        synchronized (hg0Var) {
            if (hg0Var.f6607b) {
                aVarR0 = tc1.r0(hg0Var.f6606a, jLongValue, TimeUnit.MILLISECONDS, hg0Var.f6612s);
            } else {
                hg0Var.f6607b = true;
                hg0Var.f5280u = zzbugVar;
                hg0Var.a();
                aVarR0 = tc1.r0(hg0Var.f6606a, jLongValue, TimeUnit.MILLISECONDS, hg0Var.f6612s);
                aVarR0.a(new yd0(3, hg0Var), nu.f7388f);
            }
        }
        return aVarR0;
    }

    @Override // com.google.android.gms.internal.ads.yx
    public final void zza(boolean z9, int i10, String str, String str2) {
        ea0 ea0Var = (ea0) this.f7834b;
        Map map = (Map) this.f7835d;
        ea0Var.getClass();
        HashMap map2 = new HashMap();
        map2.put("messageType", "validatorHtmlLoaded");
        map2.put("id", (String) map.get("id"));
        ea0Var.f3888b.b(map2);
    }
}
