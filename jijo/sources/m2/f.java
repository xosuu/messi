package m2;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.nonagon.signalgeneration.zzak;
import com.google.android.gms.ads.nonagon.signalgeneration.zzq;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.aa;
import com.google.android.gms.internal.ads.cu0;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.k21;
import com.google.android.gms.internal.ads.k7;
import com.google.android.gms.internal.ads.qu;
import com.google.android.gms.internal.ads.tp1;
import com.google.android.gms.internal.ads.ur0;
import com.google.android.gms.internal.ads.wt0;
import com.google.android.gms.internal.ads.yt0;
import com.google.android.gms.internal.ads.zzapq;
import com.google.android.material.behavior.SwipeDismissBehavior;
import f.y0;
import g4.s0;
import java.lang.reflect.InvocationHandler;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.c0;
import k.j0;
import l.c1;
import l.l2;
import o0.e0;
import o0.v0;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import p0.t;

/* JADX INFO: loaded from: classes.dex */
public class f implements k.m, l2, c0, c1, g0.m, WebMessageListenerBoundaryInterface, k7, k21, v3.d, u3.i, v3.c, s0, t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15701b;

    public /* synthetic */ f(int i10, Object obj) {
        this.f15700a = i10;
        this.f15701b = obj;
    }

    @Override // com.google.android.gms.internal.ads.k21
    public final void E(Throwable th) {
        zzu.zzo().i("SignalGeneratorImpl.initializeWebViewForSignalCollection", th);
        zzq.zzd(((zzak) this.f15701b).f2366w, null, "sgf", new Pair("sgf_reason", th.getMessage()), new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(((zzak) this.f15701b).O.get())));
        zzm.zzh("Failed to initialize webview for loading SDKCore. ", th);
        if (!((Boolean) zzba.zzc().a(eg.O8)).booleanValue() || ((zzak) this.f15701b).N.get() || ((zzak) this.f15701b).O.getAndIncrement() >= ((Integer) zzba.zzc().a(eg.P8)).intValue()) {
            return;
        }
        ((zzak) this.f15701b).w1();
    }

    @Override // com.google.android.gms.internal.ads.k21, com.google.android.gms.internal.ads.pl0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo4a(Object obj) {
        zzm.zze("Initialized webview successfully for SDKCore.");
        if (((Boolean) zzba.zzc().a(eg.O8)).booleanValue()) {
            zzq.zzd(((zzak) this.f15701b).f2366w, null, "sgs", new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(((zzak) this.f15701b).O.get())));
            ((zzak) this.f15701b).N.set(true);
        }
    }

    @Override // k.c0
    public final void b(k.o oVar, boolean z9) {
        if (oVar instanceof j0) {
            oVar.k().c(false);
        }
        c0 c0Var = ((androidx.appcompat.widget.b) this.f15701b).f377h;
        if (c0Var != null) {
            c0Var.b(oVar, z9);
        }
    }

    @Override // l.l2
    public final void c(k.o oVar, k.r rVar) {
        ((k.i) this.f15701b).f14522s.removeCallbacksAndMessages(null);
        int size = ((k.i) this.f15701b).f14524u.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (oVar == ((k.h) ((k.i) this.f15701b).f14524u.get(i10)).f14515b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        ((k.i) this.f15701b).f14522s.postAtTime(new k.g(this, i11 < ((k.i) this.f15701b).f14524u.size() ? (k.h) ((k.i) this.f15701b).f14524u.get(i11) : null, rVar, oVar, 0), oVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // v3.d
    public final void d(ConnectionResult connectionResult) {
        if (connectionResult.f2470b == 0) {
            v3.f fVar = (v3.f) this.f15701b;
            fVar.getRemoteService(null, fVar.g());
        } else {
            v3.c cVar = ((v3.f) this.f15701b).f17759v;
            if (cVar != null) {
                cVar.t(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void e(zzapq zzapqVar) {
        ((qu) this.f15701b).c(zzapqVar);
    }

    @Override // p0.t
    public final boolean f(View view) {
        if (!((SwipeDismissBehavior) this.f15701b).s(view)) {
            return false;
        }
        WeakHashMap weakHashMap = v0.f16075a;
        boolean z9 = e0.d(view) == 1;
        int i10 = ((SwipeDismissBehavior) this.f15701b).f11761d;
        v0.j(view, (!(i10 == 0 && z9) && (i10 != 1 || z9)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        ((SwipeDismissBehavior) this.f15701b).getClass();
        return true;
    }

    @Override // l.l2
    public final void g(k.o oVar, MenuItem menuItem) {
        ((k.i) this.f15701b).f14522s.removeCallbacksAndMessages(oVar);
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    public void h(int i10) {
    }

    @Override // k.c0
    public final boolean i(k.o oVar) {
        Object obj = this.f15701b;
        if (oVar == ((androidx.appcompat.widget.b) obj).f375d) {
            return false;
        }
        ((androidx.appcompat.widget.b) obj).K = ((j0) oVar).A.f14588a;
        c0 c0Var = ((androidx.appcompat.widget.b) obj).f377h;
        if (c0Var != null) {
            return c0Var.i(oVar);
        }
        return false;
    }

    @Override // g0.m
    public final int j(Object obj) {
        return ((f0.h) obj).f13019b;
    }

    @Override // g0.m
    public final boolean k(Object obj) {
        return ((f0.h) obj).f13020c;
    }

    public void l(int i10) {
    }

    public final int m(String str) {
        ((WorkDatabase) this.f15701b).c();
        try {
            Long lB = ((WorkDatabase) this.f15701b).j().b(str);
            int i10 = 0;
            int iIntValue = lB != null ? lB.intValue() : 0;
            if (iIntValue != Integer.MAX_VALUE) {
                i10 = iIntValue + 1;
            }
            ((WorkDatabase) this.f15701b).j().e(new l2.d(i10, str));
            ((WorkDatabase) this.f15701b).h();
            ((WorkDatabase) this.f15701b).f();
            return iIntValue;
        } catch (Throwable th) {
            ((WorkDatabase) this.f15701b).f();
            throw th;
        }
    }

    @Override // k.m
    public final boolean n(k.o oVar, MenuItem menuItem) {
        switch (this.f15700a) {
            case 2:
                break;
            default:
                k.m mVar = ((Toolbar) this.f15701b).f349d0;
                if (mVar == null || !mVar.n(oVar, menuItem)) {
                }
                break;
        }
        return false;
    }

    public final int o(int i10) {
        int iM;
        synchronized (f.class) {
            iM = m("next_job_scheduler_id");
            if (iM < 0 || iM > i10) {
                ((WorkDatabase) this.f15701b).j().e(new l2.d(1, "next_job_scheduler_id"));
                iM = 0;
            }
        }
        return iM;
    }

    /* JADX WARN: Type inference failed for: r4v23, types: [byte[], java.io.Serializable, java.lang.Object] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public final void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z9, InvocationHandler invocationHandler2) {
        a2.b bVar;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) q7.b.f(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        k.q[] qVarArr = new k.q[ports.length];
        int i10 = 0;
        for (int i11 = 0; i11 < ports.length; i11++) {
            qVarArr[i11] = new k.q(ports[i11]);
        }
        if (b2.n.f1248a.b()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) q7.b.f(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type != 0) {
                bVar = null;
                if (type == 1) {
                    ?? asArrayBuffer = webMessagePayloadBoundaryInterface.getAsArrayBuffer();
                    a2.b bVar2 = new a2.b();
                    Objects.requireNonNull(asArrayBuffer);
                    bVar2.f9d = asArrayBuffer;
                    bVar2.f8c = null;
                    bVar2.f7b = qVarArr;
                    bVar2.f6a = 1;
                    bVar = bVar2;
                }
            } else {
                bVar = new a2.b(webMessagePayloadBoundaryInterface.getAsString(), qVarArr);
            }
        } else {
            bVar = new a2.b(webMessageBoundaryInterface.getData(), qVarArr);
        }
        if (bVar != null) {
            JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) q7.b.f(JsReplyProxyBoundaryInterface.class, invocationHandler2);
            aa aaVar = (aa) this.f15701b;
            aaVar.getClass();
            if (bVar.f6a != 0) {
                StringBuilder sb = new StringBuilder("Wrong data accessor type detected. ");
                int i12 = bVar.f6a;
                sb.append(i12 != 0 ? i12 != 1 ? "Unknown" : "ArrayBuffer" : "String");
                sb.append(" expected, but got ");
                sb.append("String");
                throw new IllegalStateException(sb.toString());
            }
            try {
                JSONObject jSONObject = new JSONObject((String) bVar.f8c);
                String string = jSONObject.getString("method");
                String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
                if (string.equals("startSession")) {
                    cu0.a((cu0) aaVar.f2626b, string2);
                } else if (string.equals("finishSession")) {
                    cu0 cu0Var = (cu0) aaVar.f2626b;
                    yt0 yt0Var = (yt0) cu0Var.f3452c.get(string2);
                    if (yt0Var != null) {
                        yt0Var.a();
                        cu0Var.f3452c.remove(string2);
                    }
                } else {
                    wt0.f10343a.booleanValue();
                }
            } catch (JSONException unused) {
                tp1.E();
            }
        }
    }

    @Override // k.m
    public final void q(k.o oVar) {
        switch (this.f15700a) {
            case 2:
                if (((y0) this.f15701b).f12988c.f15068a.p()) {
                    ((y0) this.f15701b).f12989d.onPanelClosed(108, oVar);
                    return;
                } else {
                    if (((y0) this.f15701b).f12989d.onPreparePanel(0, null, oVar)) {
                        ((y0) this.f15701b).f12989d.onMenuOpened(108, oVar);
                        return;
                    }
                    return;
                }
            default:
                androidx.appcompat.widget.b bVar = ((Toolbar) this.f15701b).f343a.F;
                if (bVar == null || !bVar.i()) {
                    Iterator it = ((CopyOnWriteArrayList) ((Toolbar) this.f15701b).S.f9601d).iterator();
                    if (it.hasNext()) {
                        fb1.t(it.next());
                        throw null;
                    }
                }
                k.m mVar = ((Toolbar) this.f15701b).f349d0;
                if (mVar != null) {
                    mVar.q(oVar);
                    return;
                }
                return;
        }
    }

    @Override // v3.c
    public final void t(ConnectionResult connectionResult) {
        ((u3.h) this.f15701b).t(connectionResult);
    }

    @Override // g4.t0
    public final /* bridge */ /* synthetic */ Object zza() {
        return new g4.d((g4.c) ((g4.c) this.f15701b).f13696a);
    }

    public f(q7.b bVar) {
        this.f15700a = 8;
        this.f15701b = bVar;
    }

    public f(TextView textView) {
        this.f15700a = 15;
        if (textView != null) {
            this.f15701b = new z0.i(textView);
            return;
        }
        throw new NullPointerException("textView cannot be null");
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f15700a = 13;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f15701b = new r0.f(uri, clipDescription, uri2);
        } else {
            this.f15701b = new ur0(uri, clipDescription, uri2);
        }
    }
}
