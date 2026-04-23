package f;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.fb1;
import java.util.LinkedList;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.MainActivity;
import team.dev.epro.apkcustom.sockets.SSHTunnelService;
import team.dev.epro.apkcustom.sockets.psiphon.PsiphonVPNService;
import team.dev.epro.apkcustom.sockets.socks.SocksVPNService;
import team.dev.epro.apkcustom.sockets.udp.UDPService;
import team.dev.epro.apkcustom.sockets.v2ray.V2RayVpnService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12963b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12964d;

    public /* synthetic */ s0(Object obj, int i10, Object obj2) {
        this.f12962a = i10;
        this.f12963b = obj;
        this.f12964d = obj2;
    }

    private final void a() {
        MainActivity mainActivity = (MainActivity) this.f12963b;
        ProgressDialog progressDialog = (ProgressDialog) this.f12964d;
        a9.b bVar = MainActivity.N0;
        mainActivity.getClass();
        if (App.f17101x.Y(App.f17099v, SSHTunnelService.class)) {
            fb1.s(App.f17100w.f17415a, "isStart", false);
            fb1.p(App.f17100w.f17415a, "countRotate", 0);
            fb1.p(App.f17100w.f17415a, "countRotate2", 0);
            fb1.p(App.f17100w.f17415a, "countRotate3", 0);
            fb1.p(App.f17100w.f17415a, "countRotate4", 0);
            App.f17100w.f17415a.edit().putInt("countRotateSNI", 0).apply();
            Intent intent = new Intent(App.f17099v, (Class<?>) SSHTunnelService.class);
            intent.setAction("stop");
            b4.f.Q(mainActivity, intent);
        }
        if (App.f17101x.Y(App.f17099v, PsiphonVPNService.class)) {
            App.f17100w.f17415a.edit().putBoolean("isStart", false).apply();
            Intent intent2 = new Intent(App.f17099v, (Class<?>) PsiphonVPNService.class);
            intent2.setAction("stop");
            b4.f.Q(mainActivity, intent2);
        }
        if (App.f17101x.Y(App.f17099v, V2RayVpnService.class)) {
            App.f17100w.f17415a.edit().putBoolean("isStart", false).apply();
            Intent intent3 = new Intent(App.f17099v, (Class<?>) V2RayVpnService.class);
            intent3.setAction("stop");
            b4.f.Q(mainActivity, intent3);
        }
        if (App.f17101x.Y(App.f17099v, UDPService.class)) {
            App.f17100w.f17415a.edit().putBoolean("isStart", false).apply();
            Intent intent4 = new Intent(App.f17099v, (Class<?>) UDPService.class);
            intent4.setAction("stop");
            b4.f.Q(mainActivity, intent4);
        }
        if (App.f17101x.Y(App.f17099v, SocksVPNService.class)) {
            App.f17100w.f17415a.edit().putBoolean("mVPNTether3", false).commit();
            b4.f.Q(mainActivity, new Intent(mainActivity, (Class<?>) SocksVPNService.class).setAction("stop"));
        }
        if (de.blinkt.openvpn.core.c.e()) {
            fb1.s(App.f17100w.f17415a, "vpn_service", false);
            fb1.p(App.f17100w.f17415a, "countRotate", 0);
            fb1.p(App.f17100w.f17415a, "countRotate2", 0);
            fb1.p(App.f17100w.f17415a, "countRotate3", 0);
            fb1.p(App.f17100w.f17415a, "countRotate4", 0);
            App.f17100w.f17415a.edit().putInt("countRotateSNI", 0).apply();
            j6.c0.k(mainActivity);
            try {
                mainActivity.K0.I(false);
            } catch (RemoteException unused) {
                LinkedList linkedList = de.blinkt.openvpn.core.c.f12574a;
            }
        }
        mainActivity.H.h();
        mainActivity.x(true);
        if (progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x026b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02a7  */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v68 */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:157:0x060a
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 2634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.s0.run():void");
    }
}
