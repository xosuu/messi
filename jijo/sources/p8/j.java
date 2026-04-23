package p8;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Process;
import android.os.RemoteException;
import j6.c0;
import java.util.LinkedList;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.MainActivity;
import team.dev.epro.apkcustom.sockets.SSHTunnelService;
import team.dev.epro.apkcustom.sockets.psiphon.PsiphonVPNService;
import team.dev.epro.apkcustom.sockets.socks.SocksVPNService;
import team.dev.epro.apkcustom.sockets.udp.UDPService;
import team.dev.epro.apkcustom.sockets.v2ray.V2RayVpnService;
import xyz.easypro.ecrypt.Easypro;
import xyz.easypro.ecrypt.utils.Crypt;

/* JADX INFO: loaded from: classes.dex */
public final class j implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f16341b;

    public /* synthetic */ j(MainActivity mainActivity, int i10) {
        this.f16340a = i10;
        this.f16341b = mainActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = this.f16340a;
        MainActivity mainActivity = this.f16341b;
        switch (i11) {
            case 0:
                Intent intent = new Intent(Crypt.a(Crypt.xrc("L9jA;iLhc\u001ago@:8I<iLj>@oo\u001e<9Lon\u001c9l\u001d=n\u001bgbO;lIk8K9;\u001dokI9jH9<O;cOj9O")));
                intent.addCategory(Crypt.a(Crypt.xrc("IjoO>8JjnOjcJ<o@kmKfnNkk@g<Hhc\u001aj<Ljb\u001af8J<j\u001e:n\u0019jlAj>Hn;\u001dnoAg<A;?L")));
                intent.setFlags(268435456);
                mainActivity.startActivity(intent);
                break;
            default:
                boolean zY = App.f17101x.Y(App.f17099v, SSHTunnelService.class);
                String strA = Crypt.a(Crypt.xrc("\u001ak<A:mO>lOmlKmnM;?\u001ek>JhnL<c\u001alj@f"));
                String strA2 = Crypt.a(Crypt.xrc("Ll8\u001b;<Ig?MmbI;lHl8JfiMg8H=>\u001dfnAk"));
                if (zY) {
                    App.f17100w.f17415a.edit().putBoolean(strA, false).commit();
                    b4.f.Q(mainActivity, new Intent(mainActivity, (Class<?>) SSHTunnelService.class).setAction(strA2));
                }
                if (App.f17101x.Y(App.f17099v, PsiphonVPNService.class)) {
                    App.f17100w.f17415a.edit().putBoolean(strA, false).commit();
                    b4.f.Q(mainActivity, new Intent(mainActivity, (Class<?>) PsiphonVPNService.class).setAction(strA2));
                }
                if (App.f17101x.Y(App.f17099v, SocksVPNService.class)) {
                    App.f17100w.f17415a.edit().putBoolean(Crypt.a(Crypt.xrc("\u001cn?\u001cmiH:oMg>IilLk>\u001aghH:9\u001a<l\u001cgc\u001b9")), false).commit();
                    b4.f.Q(mainActivity, new Intent(mainActivity, (Class<?>) SocksVPNService.class).setAction(strA2));
                }
                if (App.f17101x.Y(App.f17099v, UDPService.class)) {
                    App.f17100w.f17415a.edit().putBoolean(strA, false).commit();
                    b4.f.Q(mainActivity, new Intent(mainActivity, (Class<?>) UDPService.class).setAction(strA2));
                }
                if (App.f17101x.Y(App.f17099v, V2RayVpnService.class)) {
                    App.f17100w.f17415a.edit().putBoolean(strA, false).commit();
                    b4.f.Q(mainActivity, new Intent(mainActivity, (Class<?>) V2RayVpnService.class).setAction(strA2));
                }
                if (de.blinkt.openvpn.core.c.e()) {
                    c0.k(App.f17099v);
                    j6.f fVar = mainActivity.K0;
                    if (fVar != null) {
                        try {
                            fVar.I(false);
                        } catch (RemoteException unused) {
                            LinkedList linkedList = de.blinkt.openvpn.core.c.f12574a;
                        }
                    }
                }
                Process.killProcess(Process.myPid());
                System.exit(0);
                Easypro.stu();
                break;
        }
    }
}
