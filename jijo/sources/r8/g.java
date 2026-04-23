package r8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.w;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import m1.e1;
import m1.g0;
import t8.a0;
import team.dev.epro.apkcustom.models.VPNServer;
import xyz.easypro.ecrypt.utils.Crypt;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class g extends g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f16566d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LayoutInflater f16567f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f16568h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a0 f16569q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View f16570s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f.b f16571t;

    public g(w wVar, List list) {
        new ArrayList();
        this.f16571t = new f.b(14, this);
        this.f16566d = wVar;
        this.f16568h = list;
        this.f16567f = LayoutInflater.from(wVar);
    }

    @Override // m1.g0
    public final int a() {
        List list = this.f16568h;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // m1.g0
    public final void e(e1 e1Var, int i10) {
        long j10;
        String str;
        h hVar = (h) e1Var;
        VPNServer vPNServer = (VPNServer) this.f16568h.get(i10);
        try {
            j10 = Long.parseLong(vPNServer.g());
        } catch (NumberFormatException unused) {
            j10 = 0;
        }
        hVar.f16574v.setText(vPNServer.c());
        hVar.f16575w.setText(vPNServer.e());
        if (j10 < 1024) {
            str = j10 + Crypt.a(Crypt.xrc("\u001cg<@jlMhcJk;Koc\u001dgoL<>\u001cn<Nlb\u001bjh\u001b;"));
        } else {
            double d10 = j10;
            double d11 = 1024;
            int iLog = (int) (Math.log(d10) / Math.log(d11));
            str = String.format(Crypt.a(Crypt.xrc("\u001ak<\u001bgmK<;@:o\u001bfcMooA:<K9jK<lI=8\u001bl")), Double.valueOf(d10 / Math.pow(d11, iLog)), Crypt.a(Crypt.xrc("Hm>\u001ej9\u001d>cLgc\u0019gk@9kN<>\u001bjj\u0019lkJ99Hi")).charAt(iLog - 1) + RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        }
        hVar.f16576x.setText(str);
        hVar.f16577y.setText(vPNServer.f().toUpperCase(Locale.getDefault()));
        Context context = this.f16566d;
        hVar.f16573u.setImageResource(context.getResources().getIdentifier(Crypt.a(Crypt.xrc("@=>\u001e=?If>\u001dfbN;cI>o\u00199>\u0019k?@lc@n;Jf")) + vPNServer.d().toLowerCase(), Crypt.a(Crypt.xrc("MimImo\u0019ln\u001dom\u0019lh\u0019=bK<8\u001b:c\u0019=l\u001b<>\u0019:")), context.getPackageName()));
        f.b bVar = this.f16571t;
        CardView cardView = hVar.f16572t;
        cardView.setOnClickListener(bVar);
        cardView.setTag(hVar);
    }

    @Override // m1.g0
    public final e1 f(RecyclerView recyclerView, int i10) {
        View viewInflate = this.f16567f.inflate(R.layout.bt, (ViewGroup) recyclerView, false);
        this.f16570s = viewInflate;
        h hVar = new h(viewInflate);
        hVar.f16572t = (CardView) viewInflate.findViewById(R.id.dy);
        hVar.f16573u = (ImageView) viewInflate.findViewById(R.id.kr);
        hVar.f16574v = (TextView) viewInflate.findViewById(R.id.vm);
        hVar.f16575w = (TextView) viewInflate.findViewById(R.id.vp);
        hVar.f16576x = (TextView) viewInflate.findViewById(R.id.w5);
        hVar.f16577y = (TextView) viewInflate.findViewById(R.id.vz);
        return hVar;
    }
}
