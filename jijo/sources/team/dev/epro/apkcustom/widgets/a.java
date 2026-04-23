package team.dev.epro.apkcustom.widgets;

import android.graphics.Color;
import com.google.android.gms.ads.RequestConfiguration;
import team.dev.epro.apkcustom.App;
import xyz.easypro.ecrypt.utils.Crypt;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f17388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f17389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f17390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f17391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f17392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f17393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f17394g;

    static {
        App.f17099v.getString(R.string.bl);
        f17388a = new String[]{RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, Crypt.a(Crypt.xrc("@h;Hmi\u001a<k\u0019k;Kio\u001bmb\u0019=k\u001aimH;hHm?Ao")), Crypt.a(Crypt.xrc("@h;Hmi\u001a<k\u0019k;Kio\u001bmb\u0019=k\u001aimH;hHm?Ao")), Crypt.a(Crypt.xrc("Ah?MimKl;\u001cob\u001ci?Ojc\u0019=nAfoKoh\u0019loHl")), Crypt.a(Crypt.xrc("@h;Hmi\u001a<k\u0019k;Kio\u001bmb\u0019=k\u001aimH;hHm?Ao")), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, Crypt.a(Crypt.xrc("@h;Hmi\u001a<k\u0019k;Kio\u001bmb\u0019=k\u001aimH;hHm?Ao")), Crypt.a(Crypt.xrc("@h;Hmi\u001a<k\u0019k;Kio\u001bmb\u0019=k\u001aimH;hHm?Ao")), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, Crypt.a(Crypt.xrc("@h8\u001b:<K;8Mg9\u001dllO><@n8\u001dmlMjiM<?K9")), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, Crypt.a(Crypt.xrc("@h;Hmi\u001a<k\u0019k;Kio\u001bmb\u0019=k\u001aimH;hHm?Ao")), Crypt.a(Crypt.xrc("@h;Hmi\u001a<k\u0019k;Kio\u001bmb\u0019=k\u001aimH;hHm?Ao")), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, Crypt.a(Crypt.xrc("@h;Hmi\u001a<k\u0019k;Kio\u001bmb\u0019=k\u001aimH;hHm?Ao")), Crypt.a(Crypt.xrc("\u001b;nN=n\u001d>hL<8\u001e=;M>c\u001efcK9<Knh\u001bj>Ij")), Crypt.a(Crypt.xrc("@h;Hmi\u001a<k\u0019k;Kio\u001bmb\u0019=k\u001aimH;hHm?Ao")), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, Crypt.a(Crypt.xrc("@h;Hmi\u001a<k\u0019k;Kio\u001bmb\u0019=k\u001aimH;hHm?Ao")), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, Crypt.a(Crypt.xrc("@h;Hmi\u001a<k\u0019k;Kio\u001bmb\u0019=k\u001aimH;hHm?Ao")), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, Crypt.a(Crypt.xrc("\u001b;nN=n\u001d>hL<8\u001e=;M>c\u001efcK9<Knh\u001bj>Ij")), Crypt.a(Crypt.xrc("@h;Hmi\u001a<k\u0019k;Kio\u001bmb\u0019=k\u001aimH;hHm?Ao")), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED};
        String strA = Crypt.a(Crypt.xrc("Ilh\u001cn9AhiI9jJ=8@>hN<j\u001d>;HnmKmcN<"));
        f17389b = strA + App.f17099v.getString(R.color.b_).toLowerCase().substring(3);
        Color.parseColor(App.f17099v.getString(R.color.b_).toLowerCase());
        f17390c = strA + App.f17099v.getString(R.color.se).toLowerCase().substring(3);
        f17391d = Color.parseColor(App.f17099v.getString(R.color.se).toLowerCase());
        f17392e = strA + App.f17099v.getString(R.color.sl).toLowerCase().substring(3);
        f17393f = Color.parseColor(App.f17099v.getString(R.color.sl).toLowerCase());
        f17394g = Color.parseColor(App.f17099v.getString(R.color.bf).toLowerCase());
    }
}
