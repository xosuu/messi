package g4;

import android.R;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Window;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.tp1;
import com.google.android.gms.internal.consent_sdk.zzg;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o0.f1;
import o0.g1;
import org.jasypt.digest.StandardStringDigester;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f13735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f13736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f13737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f13738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t0 f13739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Dialog f13740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o f13741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f13742h = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicReference f13743i = new AtomicReference();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference f13744j = new AtomicReference();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicReference f13745k = new AtomicReference();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f13746l = false;

    public k(Application application, q qVar, g gVar, m mVar, t0 t0Var) {
        this.f13735a = application;
        this.f13736b = qVar;
        this.f13737c = gVar;
        this.f13738d = mVar;
        this.f13739e = t0Var;
    }

    public final void a(androidx.fragment.app.w wVar, l5.a aVar) {
        Handler handler = c0.f13708a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Method must be call on main thread.");
        }
        int i10 = 0;
        if (!this.f13742h.compareAndSet(false, true)) {
            new zzg(3, true != this.f13746l ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.").a();
            aVar.a();
            return;
        }
        o oVar = this.f13741g;
        r rVar = oVar.f13769b;
        Objects.requireNonNull(rVar);
        oVar.f13768a.post(new n(rVar, i10));
        i iVar = new i(this, wVar);
        this.f13735a.registerActivityLifecycleCallbacks(iVar);
        this.f13745k.set(iVar);
        this.f13736b.f13775a = wVar;
        Dialog dialog = new Dialog(wVar, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.f13741g);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            new zzg(3, "Activity with null windows is passed in.").a();
            aVar.a();
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        if (Build.VERSION.SDK_INT >= 30) {
            g1.a(window, false);
        } else {
            f1.a(window, false);
        }
        this.f13744j.set(aVar);
        dialog.show();
        this.f13740f = dialog;
        this.f13741g.a("UMP_messagePresented", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }

    public final void b(l5.h hVar, l5.g gVar) {
        p pVar = (p) this.f13739e;
        q qVar = (q) pVar.f13772a.zza();
        Handler handler = c0.f13708a;
        tp1.K(handler);
        o oVar = new o(qVar, handler, ((s) pVar.f13773b).zza());
        this.f13741g = oVar;
        oVar.setBackgroundColor(0);
        oVar.getSettings().setJavaScriptEnabled(true);
        oVar.setWebViewClient(new i3.a(oVar));
        this.f13743i.set(new j(hVar, gVar));
        o oVar2 = this.f13741g;
        m mVar = this.f13738d;
        oVar2.loadDataWithBaseURL(mVar.f13753a, mVar.f13754b, "text/html", StandardStringDigester.MESSAGE_CHARSET, null);
        handler.postDelayed(new androidx.activity.e(22, this), 10000L);
    }
}
