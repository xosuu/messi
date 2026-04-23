package t8;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.material.textfield.TextInputLayout;
import f.g0;
import g4.v0;
import xyz.easypro.ecrypt.NativeUtil;
import xyz.easypro.ecrypt.utils.Crypt;

/* JADX INFO: loaded from: classes.dex */
public class m extends androidx.fragment.app.s {
    public static final /* synthetic */ int P0 = 0;
    public RelativeLayout A0;
    public AdView B0;
    public InterstitialAd C0;
    public AdRequest D0;
    public RelativeLayout E0;
    public TextView F0;
    public g0 G0;
    public j6.f H0;
    public v0 J0;
    public androidx.activity.result.c K0;
    public Thread L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public l f17065k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public TextInputLayout f17066l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public EditText f17067m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public CheckBox f17068n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public CheckBox f17069o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public CheckBox f17070p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public CheckBox f17071q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public CheckBox f17072r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public CheckBox f17073s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public CheckBox f17074t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public CheckBox f17075u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public CheckBox f17076v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public CheckBox f17077w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public CheckBox f17078x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public Button f17079y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public CheckBox f17080z0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final String f17062h0 = Crypt.a(Crypt.xrc("Ljn\u001bfn\u001bo>L=kI:>\u001em;J>?JgnLncJ9;AgjLn9@=9LooNnb\u001b9h\u001dnk\u001cjjM<nA>?Og8AicHfiMfkMglK=8Nf>L:?I=lH<j\u001elh@om"));

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final String f17063i0 = Crypt.a(Crypt.xrc("N<8L9mMo;\u001bnh\u0019;<H;iH=jOg9LkkA<bA>8Hhn\u001ch8Njm\u001a;8I>;@;8\u001e>k@m;\u001a;9LgjKfbL<<A99\u001d9<\u001a;m@fk\u001ehm\u001clcJocIon@j<NijLn?\u001aj>H:h\u001ek>\u001eghJj9Mf?\u0019j8\u001dmhJn<\u001d9h\u001a<iM<j\u001c=8Kg;N;lNnb\u001efn\u001e<>Imn\u001e<n\u001en8Afm\u001eh9\u001dkhInbOlcLnnNib\u001eo;KjmInhOj8AolN<h\u0019ojKn<M>mIg8Noc\u001c;8O;"));

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final String f17064j0 = Crypt.a(Crypt.xrc("N<8L9mMo;\u001bnh\u0019;<H;iH=jOg9LkkA<bA>8Hhn\u001ch8Njm\u001a;8I>;@;8\u001e>k@m;\u001a;9LgjKfbL<<A99\u001d9<\u001a;m@fk\u001ehm\u001clcJocIon@j<NijLn?\u001aj>H:h\u001ek>\u001eghJj9Mf?\u0019j8\u001dmhJn<\u001d9h\u001a<iM<j\u001c=8Kg;N;lNnb\u001efn\u001e<>Imn\u001ehi\u001a;?\u0019k?L:?All\u0019loOl9@:o\u001c>cM9<\u001dlc"));
    public final n1.k I0 = new n1.k(4, this);

    static {
        NativeUtil.classesInit0(157);
    }

    @Override // androidx.fragment.app.s
    public final native void A(Bundle bundle);

    @Override // androidx.fragment.app.s
    public final native void B(Menu menu, MenuInflater menuInflater);

    @Override // androidx.fragment.app.s
    public final native View C(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    @Override // androidx.fragment.app.s
    public final native void D();

    @Override // androidx.fragment.app.s
    public final native void F();

    @Override // androidx.fragment.app.s
    public final native boolean H(MenuItem menuItem);

    @Override // androidx.fragment.app.s
    public final native void I();

    @Override // androidx.fragment.app.s
    public final native void J();

    public final native void Z();

    public final native void b0();

    public final native void c0();

    public final native void d0();

    public final native void e0();

    public final native void f0();

    public final native void g0();

    public final native void h0();

    public final native void i0();

    public final native void j0();

    public final native void k0();

    public final native void l0();

    public final native String[] m0(String str);

    public final native void n0();

    public final native void o0();

    public final native void p0();

    public final native void q0();

    public final native void r0();

    public final native void s0();

    @Override // androidx.fragment.app.s
    public final native void y(int i10, int i11, Intent intent);

    @Override // androidx.fragment.app.s
    public final native void z(Context context);
}
