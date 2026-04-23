package f5;

import android.content.Intent;
import android.os.Build;
import android.os.Environment;
import b7.u;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.gson.JsonIOException;
import com.google.gson.internal.l;
import f7.e0;
import java.io.File;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import l.f3;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.activities.ConfigImport;
import team.dev.epro.apkcustom.sockets.SSHTunnelService;
import v8.g;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class b implements l, j9.a, f3, x8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13091b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f13090a = i10;
        this.f13091b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0087, code lost:
    
        if (r0[1] == 0) goto L12;
     */
    @Override // x8.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.net.Socket r12, java.lang.String r13, int r14, int r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.b.a(java.net.Socket, java.lang.String, int, int):void");
    }

    public final synchronized void b(e0 e0Var) {
        ((Set) this.f13091b).remove(e0Var);
    }

    @Override // j9.a
    public final void d() throws Throwable {
        String strC;
        switch (this.f13090a) {
            case 5:
                try {
                    Object obj = this.f13091b;
                    ((ConfigImport) obj).G = ((ConfigImport) obj).H.getData();
                    Object obj2 = this.f13091b;
                    if (z3.a.C((ConfigImport) obj2, ((ConfigImport) obj2).G) == null) {
                        strC = ((ConfigImport) this.f13091b).G.getPath();
                    } else {
                        Object obj3 = this.f13091b;
                        strC = z3.a.C((ConfigImport) obj3, ((ConfigImport) obj3).G);
                    }
                    File file = new File(strC);
                    File file2 = new File(Environment.getExternalStorageDirectory() + File.separator + ((ConfigImport) this.f13091b).getString(R.string.bl));
                    File[] fileArr = {new File(file2, file.getName())};
                    if (!file2.exists()) {
                        file2.mkdir();
                    }
                    if (fileArr[0].exists()) {
                        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(((ConfigImport) this.f13091b).getString(R.string.bl));
                        StringBuilder sb = new StringBuilder();
                        String name = file.getName();
                        if (name.indexOf(".") > 0) {
                            name = name.substring(0, name.lastIndexOf("."));
                        }
                        sb.append(name);
                        sb.append("_");
                        sb.append(UUID.randomUUID());
                        sb.append(".hc");
                        fileArr[0] = new File(externalStoragePublicDirectory, sb.toString());
                    }
                    if (!file.getCanonicalPath().equals(new File(file2, file.getName()).getCanonicalPath()) && Build.VERSION.SDK_INT < 30) {
                        ConfigImport.u((ConfigImport) this.f13091b, file.getPath());
                    } else {
                        fileArr[0] = file;
                        ConfigImport.u((ConfigImport) this.f13091b, file.getPath());
                    }
                } catch (Exception e10) {
                    App.f17101x.d(team.dev.epro.apkcustom.widgets.a.f17391d, e10.getLocalizedMessage());
                    return;
                }
                break;
        }
    }

    @Override // com.google.gson.internal.l
    public final Object f() {
        Object obj = this.f13091b;
        if (!(((Type) obj) instanceof ParameterizedType)) {
            throw new JsonIOException("Invalid EnumSet type: " + ((Type) this.f13091b).toString());
        }
        Type type = ((ParameterizedType) ((Type) obj)).getActualTypeArguments()[0];
        if (type instanceof Class) {
            return EnumSet.noneOf((Class) type);
        }
        throw new JsonIOException("Invalid EnumSet type: " + ((Type) this.f13091b).toString());
    }

    @Override // j9.a
    public final void g() {
        switch (this.f13090a) {
            case 5:
                break;
            default:
                SSHTunnelService.W = true;
                SSHTunnelService.f17280b0 = false;
                Intent intent = new Intent();
                intent.setAction("xyz.easypro.httpcustom.SSH_STATUS");
                ((SSHTunnelService) this.f13091b).sendBroadcast(intent);
                if (App.f17100w.f17415a.getBoolean("ssh_service", false)) {
                    if (App.f17100w.f17415a.getBoolean("keep_vpnservice", true)) {
                        boolean z9 = SSHTunnelService.W;
                        fb1.v(((SSHTunnelService) this.f13091b).f17290h, new StringBuilder("["), "] verify all hostname", "SSHTunnelService");
                        while (!((SSHTunnelService) this.f13091b).H) {
                            try {
                                Thread.sleep(1000L);
                                break;
                            } catch (InterruptedException unused) {
                            }
                            SSHTunnelService sSHTunnelService = (SSHTunnelService) this.f13091b;
                            if (sSHTunnelService.H || sSHTunnelService.F.isCancelled()) {
                                boolean z10 = SSHTunnelService.W;
                                fb1.v(((SSHTunnelService) this.f13091b).f17290h, new StringBuilder("["), "] verify all hostname done", "SSHTunnelService");
                            }
                        }
                        boolean z102 = SSHTunnelService.W;
                        fb1.v(((SSHTunnelService) this.f13091b).f17290h, new StringBuilder("["), "] verify all hostname done", "SSHTunnelService");
                    }
                    if (App.f17100w.f17415a.getBoolean("keep_vpnservice", true)) {
                        boolean z11 = SSHTunnelService.W;
                        fb1.v(((SSHTunnelService) this.f13091b).f17290h, new StringBuilder("["), "] setup vpn", "SSHTunnelService");
                        ((SSHTunnelService) this.f13091b).l();
                        fb1.v(((SSHTunnelService) this.f13091b).f17290h, new StringBuilder("["), "] setup vpn done", "SSHTunnelService");
                    }
                    if (App.f17100w.f17415a.getBoolean("chk_slowDns", false)) {
                        ((SSHTunnelService) this.f13091b).f17295v = new g((SSHTunnelService) this.f13091b);
                        if (!((SSHTunnelService) this.f13091b).f17295v.isAlive()) {
                            ((SSHTunnelService) this.f13091b).f17295v.start();
                        }
                        while (!((SSHTunnelService) this.f13091b).U) {
                            try {
                                Thread.sleep(1000L);
                                break;
                            } catch (InterruptedException unused2) {
                            }
                            SSHTunnelService sSHTunnelService2 = (SSHTunnelService) this.f13091b;
                            if (sSHTunnelService2.U || sSHTunnelService2.F.isCancelled()) {
                            }
                        }
                    }
                    if (App.f17100w.f17415a.getBoolean("autoIpHunter", false) && ((SSHTunnelService) this.f13091b).f17296w == null) {
                        v8.a aVar = App.f17099v.f17110s;
                        if (aVar != null) {
                            aVar.e();
                        }
                        ((SSHTunnelService) this.f13091b).f17296w = new v8.a((SSHTunnelService) this.f13091b);
                        ((SSHTunnelService) this.f13091b).f17296w.getClass();
                        ((SSHTunnelService) this.f13091b).f17296w.d();
                        App.f17099v.f17110s = ((SSHTunnelService) this.f13091b).f17296w;
                    }
                    int i10 = 1;
                    while (SSHTunnelService.W && !((SSHTunnelService) this.f13091b).b()) {
                        if (!App.f17100w.f17415a.getBoolean("ssh_service", false) || ((SSHTunnelService) this.f13091b).F.isCancelled()) {
                            if (!SSHTunnelService.f17279a0) {
                                SSHTunnelService.Y = false;
                                SSHTunnelService.f17279a0 = true;
                                boolean z12 = SSHTunnelService.W;
                                StringBuilder sb = new StringBuilder("[");
                                g1.a.w(((SSHTunnelService) this.f13091b).f17290h, sb, "] ");
                                sb.append(((SSHTunnelService) this.f13091b).getString(R.string.ww));
                                sb.append(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                                u.r("SSHTunnelService", sb.toString());
                                StringBuilder sb2 = new StringBuilder("[");
                                g1.a.w(((SSHTunnelService) this.f13091b).f17290h, sb2, "] ");
                                sb2.append(((SSHTunnelService) this.f13091b).getString(R.string.wp));
                                u.r("SSHTunnelService", sb2.toString());
                                StringBuilder sb3 = new StringBuilder("[");
                                g1.a.w(((SSHTunnelService) this.f13091b).f17290h, sb3, "] <font color=");
                                sb3.append(team.dev.epro.apkcustom.widgets.a.f17392e);
                                sb3.append(">");
                                sb3.append(((SSHTunnelService) this.f13091b).getString(R.string.bt));
                                u.r("SSHTunnelService", sb3.toString());
                            }
                            SSHTunnelService.W = false;
                            SSHTunnelService.Z = false;
                            SSHTunnelService.f17280b0 = true;
                            SSHTunnelService sSHTunnelService3 = (SSHTunnelService) this.f13091b;
                            sSHTunnelService3.getString(R.string.vv);
                            sSHTunnelService3.f17287b.cancel(R.string.bn);
                            sSHTunnelService3.f17287b.cancelAll();
                            Intent intent2 = new Intent();
                            intent2.setAction("xyz.easypro.httpcustom.SSH_STATUS");
                            ((SSHTunnelService) this.f13091b).sendBroadcast(intent2);
                            ((SSHTunnelService) this.f13091b).m();
                        } else {
                            boolean z13 = SSHTunnelService.W;
                            StringBuilder sb4 = new StringBuilder("[");
                            g1.a.w(((SSHTunnelService) this.f13091b).f17290h, sb4, "] ");
                            sb4.append(((SSHTunnelService) this.f13091b).getString(R.string.wu));
                            sb4.append(": ");
                            sb4.append(i10);
                            sb4.append(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                            u.r("SSHTunnelService", sb4.toString());
                            try {
                                Thread.sleep(1000L);
                            } catch (Exception unused3) {
                            }
                            i10++;
                        }
                        break;
                    }
                }
                break;
        }
    }

    public b() {
        this.f13090a = 4;
        this.f13091b = new LinkedHashSet();
    }

    public b(SwipeDismissBehavior swipeDismissBehavior) {
        this.f13090a = 0;
        swipeDismissBehavior.getClass();
        swipeDismissBehavior.f11763f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        swipeDismissBehavior.f11764g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        swipeDismissBehavior.f11761d = 0;
    }
}
