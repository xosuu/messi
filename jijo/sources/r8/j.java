package r8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.HashMap;
import java.util.Set;
import team.dev.epro.apkcustom.App;
import xyz.easypro.ecrypt.utils.Crypt;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class j extends ArrayAdapter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f16580d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f16581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set f16582b;

    static {
        HashMap map = new HashMap();
        f16580d = map;
        map.put(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new i(R.string.sx, R.drawable.flag_custom));
        map.put(Crypt.a(Crypt.xrc("K99Lf;@>oAkcAkiOijNl?Noo\u0019:iN;i\u0019h")), new i(R.string.sy, R.drawable.flag_at));
        map.put(Crypt.a(Crypt.xrc("\u001dm<Ho<\u001a:;@=cIk8\u001ah>Il?\u0019nhOohK:?\u001bj")), new i(R.string.sz, R.drawable.flag_au));
        map.put(Crypt.a(Crypt.xrc("A<?@9<Ni;\u001c:<\u001akkJ;?\u001cgj\u001cnlJhjNn?K:")), new i(R.string.t0, R.drawable.flag_be));
        map.put(Crypt.a(Crypt.xrc("\u001aj<Hfm@9mLki\u001d:>OhbKooHo8@=cNj?\u001ao")), new i(R.string.t1, R.drawable.flag_bg));
        map.put(Crypt.a(Crypt.xrc("HjnHhm\u001dgbAmhAo<\u001e9jMh9J<cAg8@kl\u001ak")), new i(R.string.t2, R.drawable.flag_ca));
        map.put(Crypt.a(Crypt.xrc("\u001dg<JimAlbO<m@lhAn?Ai8\u001aooHl?L9?\u001bl")), new i(R.string.t3, R.drawable.flag_ch));
        map.put(Crypt.a(Crypt.xrc("Im<\u001cmcAm?H>lL<<Nm;Okc\u001dlm\u001bgl\u001bj>\u001ek")), new i(R.string.t4, R.drawable.flag_cz));
        map.put(Crypt.a(Crypt.xrc("Hgn\u001bjkIokKjiA=?LkcOj8A=<L:iInbL9")), new i(R.string.t5, R.drawable.flag_de));
        map.put(Crypt.a(Crypt.xrc("\u001d:l\u0019<iIg<H<<\u001a;c\u001bgi@=>Of;K<b\u001djoK<")), new i(R.string.t6, R.drawable.flag_dk));
        map.put(Crypt.a(Crypt.xrc("Lj<Jni\u001cj?H=8J:8L<>MonM98L<?Ak<L>")), new i(R.string.t7, R.drawable.flag_es));
        map.put(Crypt.a(Crypt.xrc("Im?\u001a;8\u0019o8JgiH>l\u001blmMfl\u001cnmNjh\u001e:mI=")), new i(R.string.t8, R.drawable.flag_fr));
        map.put(Crypt.a(Crypt.xrc("Aoo\u001enn@jmI>;\u00199nN;cMfiL>>Nji\u001cj?@l")), new i(R.string.t9, R.drawable.flag_gb));
        map.put(Crypt.a(Crypt.xrc("\u001c=oIk8\u001ckb\u001cfmO:cO>lHm<\u001dm;\u001bgo\u001dihNj")), new i(R.string.t_, R.drawable.flag_hk));
        map.put(Crypt.a(Crypt.xrc("NjhKf>\u001egjI:hL>bK;9K;kOfmIlo\u001b:kH>")), new i(R.string.ta, R.drawable.flag_hu));
        map.put(Crypt.a(Crypt.xrc("\u0019i;\u001em9H=cHjb\u0019<l\u001bko\u001agn\u001dlcKhbLgbN<")), new i(R.string.tb, R.drawable.flag_in));
        map.put(Crypt.a(Crypt.xrc("OjjKhcM>kLji@:cIijMohJgbI>lOfn\u001d;")), new i(R.string.tc, R.drawable.flag_it));
        map.put(Crypt.a(Crypt.xrc("ImnM=mL<nK:oAnbN>oMk>K;o\u001eg>O;oM>")), new i(R.string.td, R.drawable.flag_jp));
        map.put(Crypt.a(Crypt.xrc("@n?\u001ckmL=mHi8\u001afj\u001e:lIi>Oh<\u001bhkNm?H=")), new i(R.string.te, R.drawable.flag_nl));
        map.put(Crypt.a(Crypt.xrc("Jl>\u001co<No?Ag?Oln@kk@h>\u001e;8\u001a<cH:h\u001e=")), new i(R.string.tf, R.drawable.flag_no));
        map.put(Crypt.a(Crypt.xrc("Lmh\u001bgn\u001eoj\u001dnb\u001en;K;j\u001emjKm8Io?O9mIn")), new i(R.string.tg, R.drawable.flag_pl));
        map.put(Crypt.a(Crypt.xrc("K=jIl?\u001d:c\u001e=n\u001a<?A;m\u001chmH9>M=c@io\u001el")), new i(R.string.th, R.drawable.flag_ro));
        map.put(Crypt.a(Crypt.xrc("\u001ci<@<hOmlIhn\u0019foHjlLglJ<;\u001bg8KnhN:")), new i(R.string.ti, R.drawable.flag_rs));
        map.put(Crypt.a(Crypt.xrc("Lgc\u001b<h\u001em?\u001dk<Ao9O:n\u0019>l\u0019g8\u001b>;\u001c<cJ:")), new i(R.string.tj, R.drawable.flag_se));
        map.put(Crypt.a(Crypt.xrc("A<i\u001b>jLokK:m@;<LjjOfc\u001dk>Igi\u001dh<\u001eo")), new i(R.string.tk, R.drawable.flag_sg));
        map.put(Crypt.a(Crypt.xrc("L<;\u001bjnH;iJ>c\u001bm;KnjIhl@lcAhlH9j@;")), new i(R.string.tl, R.drawable.flag_sk));
        map.put(Crypt.a(Crypt.xrc("MibKocO:?\u001eoiK;m\u001d>bLgk@l9\u0019fjLi8Ih")), new i(R.string.tm, R.drawable.flag_us));
    }

    public final View a(int i10, ViewGroup viewGroup, boolean z9) {
        View viewInflate = ((LayoutInflater) this.f16581a.getSystemService(Crypt.a(Crypt.xrc("\u001ckjM9j\u001bmnJo8NgcN;hNf>MkcM>cIgc\u001d<")))).inflate(R.layout.ec, viewGroup, false);
        if (z9) {
            App app = App.f17099v;
            Object obj = d0.f.f12287a;
            viewInflate.setBackground(d0.c.b(app, R.drawable.ih));
        }
        String str = (String) getItem(i10);
        HashMap map = f16580d;
        if (((i) map.get(str)) != null) {
            ((ImageView) viewInflate.findViewById(R.id.rm)).setImageResource(((i) map.get(str)).f16579b);
            ((TextView) viewInflate.findViewById(R.id.rn)).setText(this.f16581a.getString(((i) map.get(str)).f16578a));
        }
        return viewInflate;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        return a(i10, viewGroup, true);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        return a(i10, viewGroup, false);
    }
}
