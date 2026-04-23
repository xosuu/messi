package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class gv extends FrameLayout implements bv {
    public String[] A;
    public Bitmap B;
    public final ImageView C;
    public boolean D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pv f5070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f5071b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f5072d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lg f5073f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fv f5074h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f5075q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cv f5076s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5077t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f5078u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f5079v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5080w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f5081x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f5082y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f5083z;

    public gv(Context context, pv pvVar, int i10, boolean z9, lg lgVar, ov ovVar) {
        cv avVar;
        super(context);
        this.f5070a = pvVar;
        this.f5073f = lgVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f5071b = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        z3.a.l(pvVar.zzj());
        dv dvVar = pvVar.zzj().zza;
        qv qvVar = new qv(context, pvVar.zzn(), pvVar.O(), lgVar, pvVar.zzk());
        if (i10 == 2) {
            pvVar.e().getClass();
            avVar = new xv(context, ovVar, pvVar, qvVar, z9);
        } else {
            avVar = new av(context, pvVar, new qv(context, pvVar.zzn(), pvVar.O(), lgVar, pvVar.zzk()), z9, pvVar.e().b());
        }
        this.f5076s = avVar;
        View view = new View(context);
        this.f5072d = view;
        view.setBackgroundColor(0);
        frameLayout.addView(avVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) zzba.zzc().a(eg.f4189z)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) zzba.zzc().a(eg.f4161w)).booleanValue()) {
            i();
        }
        this.C = new ImageView(context);
        this.f5075q = ((Long) zzba.zzc().a(eg.B)).longValue();
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.f4180y)).booleanValue();
        this.f5080w = zBooleanValue;
        if (lgVar != null) {
            lgVar.b("spinner_used", true != zBooleanValue ? "0" : "1");
        }
        this.f5074h = new fv(this);
        avVar.v(this);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        if (zze.zzc()) {
            zze.zza("Set video bounds to x:" + i10 + ";y:" + i11 + ";w:" + i12 + ";h:" + i13);
        }
        if (i12 == 0 || i13 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
        layoutParams.setMargins(i10, i11, 0, 0);
        this.f5071b.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void b() {
        pv pvVar = this.f5070a;
        if (pvVar.zzi() == null || !this.f5078u || this.f5079v) {
            return;
        }
        pvVar.zzi().getWindow().clearFlags(NotificationCompat.FLAG_HIGH_PRIORITY);
        this.f5078u = false;
    }

    public final void c(String str, String... strArr) {
        HashMap map = new HashMap();
        cv cvVar = this.f5076s;
        Integer numZ = cvVar != null ? cvVar.z() : null;
        if (numZ != null) {
            map.put("playerId", numZ.toString());
        }
        map.put(NotificationCompat.CATEGORY_EVENT, str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.f5070a.j("onVideoEvent", map);
    }

    public final void d() {
        if (((Boolean) zzba.zzc().a(eg.I1)).booleanValue()) {
            this.f5074h.a();
        }
        c("ended", new String[0]);
        b();
    }

    public final void e() {
        if (((Boolean) zzba.zzc().a(eg.I1)).booleanValue()) {
            fv fvVar = this.f5074h;
            fvVar.f4670b = false;
            ew0 ew0Var = zzt.zza;
            ew0Var.removeCallbacks(fvVar);
            ew0Var.postDelayed(fvVar, 250L);
        }
        pv pvVar = this.f5070a;
        if (pvVar.zzi() != null && !this.f5078u) {
            boolean z9 = (pvVar.zzi().getWindow().getAttributes().flags & NotificationCompat.FLAG_HIGH_PRIORITY) != 0;
            this.f5079v = z9;
            if (!z9) {
                pvVar.zzi().getWindow().addFlags(NotificationCompat.FLAG_HIGH_PRIORITY);
                this.f5078u = true;
            }
        }
        this.f5077t = true;
    }

    public final void f() {
        cv cvVar = this.f5076s;
        if (cvVar != null && this.f5082y == 0) {
            c("canplaythrough", "duration", String.valueOf(cvVar.l() / 1000.0f), "videoWidth", String.valueOf(cvVar.n()), "videoHeight", String.valueOf(cvVar.m()));
        }
    }

    public final void finalize() throws Throwable {
        try {
            this.f5074h.a();
            cv cvVar = this.f5076s;
            if (cvVar != null) {
                nu.f7387e.execute(new s9(11, cvVar));
            }
        } finally {
            super.finalize();
        }
    }

    public final void g() {
        if (this.D && this.B != null) {
            ImageView imageView = this.C;
            if (imageView.getParent() == null) {
                imageView.setImageBitmap(this.B);
                imageView.invalidate();
                FrameLayout frameLayout = this.f5071b;
                frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.bringChildToFront(imageView);
            }
        }
        this.f5074h.a();
        this.f5082y = this.f5081x;
        zzt.zza.post(new ev(this, 2));
    }

    public final void h(int i10, int i11) {
        if (this.f5080w) {
            xf xfVar = eg.A;
            int iMax = Math.max(i10 / ((Integer) zzba.zzc().a(xfVar)).intValue(), 1);
            int iMax2 = Math.max(i11 / ((Integer) zzba.zzc().a(xfVar)).intValue(), 1);
            Bitmap bitmap = this.B;
            if (bitmap != null && bitmap.getWidth() == iMax && this.B.getHeight() == iMax2) {
                return;
            }
            this.B = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.D = false;
        }
    }

    public final void i() {
        cv cvVar = this.f5076s;
        if (cvVar == null) {
            return;
        }
        TextView textView = new TextView(cvVar.getContext());
        Resources resourcesB = zzu.zzo().b();
        textView.setText(String.valueOf(resourcesB == null ? "AdMob - " : resourcesB.getString(R.string.watermark_label_prefix)).concat(cvVar.r()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        FrameLayout frameLayout = this.f5071b;
        frameLayout.addView(textView, layoutParams);
        frameLayout.bringChildToFront(textView);
    }

    public final void j() {
        cv cvVar = this.f5076s;
        if (cvVar == null) {
            return;
        }
        long j10 = cvVar.j();
        if (this.f5081x == j10 || j10 <= 0) {
            return;
        }
        float f10 = j10 / 1000.0f;
        if (((Boolean) zzba.zzc().a(eg.G1)).booleanValue()) {
            String strValueOf = String.valueOf(f10);
            String strValueOf2 = String.valueOf(cvVar.q());
            String strValueOf3 = String.valueOf(cvVar.o());
            String strValueOf4 = String.valueOf(cvVar.p());
            String strValueOf5 = String.valueOf(cvVar.k());
            ((y3.b) zzu.zzB()).getClass();
            c("timeupdate", "time", strValueOf, "totalBytes", strValueOf2, "qoeCachedBytes", strValueOf3, "qoeLoadedBytes", strValueOf4, "droppedFrames", strValueOf5, "reportTime", String.valueOf(System.currentTimeMillis()));
        } else {
            c("timeupdate", "time", String.valueOf(f10));
        }
        this.f5081x = j10;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        int i10 = 0;
        fv fvVar = this.f5074h;
        if (z9) {
            fvVar.f4670b = false;
            ew0 ew0Var = zzt.zza;
            ew0Var.removeCallbacks(fvVar);
            ew0Var.postDelayed(fvVar, 250L);
        } else {
            fvVar.a();
            this.f5082y = this.f5081x;
        }
        zzt.zza.post(new fv(this, z9, i10));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        boolean z9 = false;
        int i11 = 1;
        fv fvVar = this.f5074h;
        if (i10 == 0) {
            fvVar.f4670b = false;
            ew0 ew0Var = zzt.zza;
            ew0Var.removeCallbacks(fvVar);
            ew0Var.postDelayed(fvVar, 250L);
            z9 = true;
        } else {
            fvVar.a();
            this.f5082y = this.f5081x;
        }
        zzt.zza.post(new fv(this, z9, i11));
    }
}
