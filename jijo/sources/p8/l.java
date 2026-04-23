package p8;

import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import m1.p0;
import t8.a0;
import t8.z;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.MainActivity;
import team.dev.epro.apkcustom.dialogs.Cloud;
import team.dev.epro.apkcustom.sockets.SSHTunnelService;
import xyz.easypro.ecrypt.utils.Crypt;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class l implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f16343b;

    public /* synthetic */ l(MainActivity mainActivity, int i10) {
        this.f16342a = i10;
        this.f16343b = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Exception {
        MainActivity mainActivity;
        a0 a0Var;
        p0 p0Var;
        switch (this.f16342a) {
            case 0:
                int id = view.getId();
                String strA = Crypt.a(Crypt.xrc("JlbLio\u001emhIfbLgh@>o\u0019:m@o>@f9A<b\u001bgnHioNol\u001d=k@ooAfjA<<@:9\u001dgjNi<Jln\u0019>lAnoAfi\u001d>j\u0019nk\u001ahi\u001ag;@ok\u00199n\u0019:m\u001c=j"));
                String strA2 = Crypt.a(Crypt.xrc("JlbLio\u001emhIfbLgh@>o\u0019:m@o>@f9A<b\u001bgl\u001dilKf?L>cNmhIm9@g?Om9N=<@oj\u0019jc@9<\u001ckh@9>Mo;LnoImk\u001a:h\u001cojMfo\u001e;;\u001chb"));
                switch (id) {
                    case R.id.iu /* 2131296609 */:
                        this.f16343b.U.a(false);
                        this.f16343b.J0.a(new Intent(this.f16343b, (Class<?>) Cloud.class));
                        break;
                    case R.id.ix /* 2131296612 */:
                        if (de.blinkt.openvpn.core.c.e()) {
                            App.f17101x.d(team.dev.epro.apkcustom.widgets.a.f17391d, strA2);
                        } else if (SSHTunnelService.Y || SSHTunnelService.W || SSHTunnelService.X) {
                            App.f17101x.d(team.dev.epro.apkcustom.widgets.a.f17391d, strA);
                        } else {
                            this.f16343b.U.a(false);
                            MainActivity.u(this.f16343b, Crypt.a(Crypt.xrc("\u001dk;Koj\u001c><\u001dk?@n;A;;N;k\u001e=bAib\u001dnn\u0019n")));
                        }
                        break;
                    case R.id.iy /* 2131296613 */:
                        this.f16343b.U.a(false);
                        this.f16343b.f17116d0.putExtra(Crypt.a(Crypt.xrc("NihJ9m\u0019mlHiiAih\u001cnmOkjJjbKic\u001d:9Ig")), Crypt.a(Crypt.xrc("KghA;mM:;JgnAmkH>8\u001bg9Llk\u001b;hKkm\u0019=")));
                        MainActivity mainActivity2 = this.f16343b;
                        mainActivity2.startActivity(mainActivity2.f17116d0);
                        break;
                    case R.id.j0 /* 2131296615 */:
                        if (de.blinkt.openvpn.core.c.e()) {
                            App.f17101x.d(team.dev.epro.apkcustom.widgets.a.f17391d, strA2);
                        } else if (SSHTunnelService.Y || SSHTunnelService.W || SSHTunnelService.X) {
                            App.f17101x.d(team.dev.epro.apkcustom.widgets.a.f17391d, strA);
                        } else {
                            this.f16343b.U.a(false);
                            MainActivity.u(this.f16343b, Crypt.a(Crypt.xrc("H:k\u001dfmJmbA9>Of<AnmKoiL9jOjcJnoAm")));
                        }
                        break;
                }
                break;
            default:
                if (!App.f17100w.f17415a.getBoolean(Crypt.a(Crypt.xrc("\u001bnc\u001eibA=i\u001dioOkl\u001c:n\u001dgk\u001dnk\u0019f<\u001c:i\u001di")), true) && (a0Var = (mainActivity = this.f16343b).P) != null && mainActivity.f17114b0 == 0) {
                    if (mainActivity.f17113a0 == 0) {
                        RecyclerView recyclerView = a0Var.f17027k0;
                        if (!recyclerView.G && (p0Var = recyclerView.f1074x) != null) {
                            p0Var.s0(recyclerView, 0);
                        }
                        z zVar = a0Var.f17024h0;
                        if (zVar != null) {
                            ((MainActivity) zVar).A(2131231208);
                        }
                        break;
                    } else if (a0Var.c() != null) {
                        SwipeRefreshLayout swipeRefreshLayout = a0Var.f17028l0;
                        if (!swipeRefreshLayout.f1116d) {
                            swipeRefreshLayout.setEnabled(false);
                            a0Var.n0();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
