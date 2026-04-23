package team.dev.epro.apkcustom;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SubscriptionManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.c;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;
import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.navigation.NavigationView;
import f.g0;
import f.n;
import f.q;
import j6.f;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import n1.k;
import p8.p;
import p8.r;
import t8.a0;
import t8.b;
import t8.l;
import t8.m;
import t8.z;
import team.dev.epro.apkcustom.widgets.logger.LogView;
import xyz.easypro.ecrypt.NativeUtil;
import xyz.easypro.ecrypt.utils.Crypt;
import y4.a;

/* JADX INFO: loaded from: classes.dex */
public class MainActivity extends q implements a, l, z, b, i9.a {
    public static a9.b N0;
    public int A0;
    public ProgressDialog B0;
    public Menu C0;
    public final String D0;
    public final String E0;
    public final String F0;
    public Toolbar G;
    public boolean G0;
    public r H;
    public boolean H0;
    public ViewPager I;
    public final p8.l I0;
    public DrawerLayout J;
    public c J0;
    public p K;
    public f K0;
    public NavigationView L;
    public final k L0;
    public View M;
    public Uri M0;
    public TextView N;
    public m O;
    public a0 P;
    public t8.c Q;
    public LogView R;
    public boolean S;
    public boolean T;
    public FloatingActionMenu U;
    public FloatingActionButton V;
    public FloatingActionButton W;
    public FloatingActionButton X;
    public FloatingActionButton Y;
    public FloatingActionButton Z;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f17114b0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Intent f17116d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f17117e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f17118f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f17119g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Date f17120h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public g0 f17121i0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f17124l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f17125m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f17126n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f17127o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f17128p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f17129q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public String f17130r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public String f17131s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public String f17132t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public String f17133u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f17134v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ArrayList f17135w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public i9.b f17136x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f17137y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public n f17138z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f17113a0 = 1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public String f17115c0 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public String f17122j0 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public String f17123k0 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        NativeUtil.classesInit0(189);
    }

    public MainActivity() {
        String strA = Crypt.a(Crypt.xrc("HllAhmO=bJ<l\u0019=>M:;\u001ej>\u0019m<\u001bmiH<n\u001eo"));
        this.f17128p0 = strA;
        this.f17129q0 = strA;
        this.f17130r0 = strA;
        this.f17134v0 = false;
        this.D0 = Crypt.a(Crypt.xrc("\u001bim\u001b9iM;;\u001eo8\u001cm<\u001eilIo;Hj>NncJn;@nc\u001ag9\u001bjl\u0019km\u001b9bNgn\u001ak;J<hMmmI:i\u001a>oN"));
        this.E0 = Crypt.a(Crypt.xrc("\u001bim\u001b9iM;;\u001eo8\u001cm<\u001eilIo;Hj>NncJn;@ncMoh\u001c=<IlmIl9\u001a:9@ljI=j@;jMm8\u001d9l\u001afkHm>I9<\u001cj?A=l@hcHmiK=;MnhI>;J>c@l8Mho\u001e:bAinOl<NomI=k\u001eflMni\u00199kN;"));
        this.F0 = Crypt.a(Crypt.xrc("\u001bim\u001b9iM;;\u001eo8\u001cm<\u001eilIo;Hj>NncJn;@n>Jlc\u001c:8\u001bibNgoKh;Khb\u001c9c\u00199mNokOlj\u0019o?J<o\u001bmnLj>\u0019=k@g9Lmc\u001c>?NhmAk9Jo;"));
        this.I0 = new p8.l(this, 0);
        this.L0 = new k(2, this);
        this.M0 = null;
    }

    public static native int B(SubscriptionManager subscriptionManager);

    public static native String C();

    public static native boolean H(ProgressDialog progressDialog, String str);

    public static native String N(String str);

    public static native void u(MainActivity mainActivity, String str);

    public final native void A(int i10);

    public final native String D();

    public final native String E();

    public final native void F();

    public final native void G(LogView logView);

    public final native void I(File file, String str);

    public final native void J(String str, String str2, ProgressDialog progressDialog);

    public final native void K(File file, String str, String str2);

    public final native String[] L(String str);

    public final native void M(String str, String str2, boolean z9, String str3);

    public final native void O(boolean z9);

    @Override // android.app.Activity, android.view.Window.Callback
    public final native boolean dispatchTouchEvent(MotionEvent motionEvent);

    @Override // android.app.Activity
    public final native void finish();

    @Override // androidx.core.app.k
    public final native void i();

    @Override // androidx.fragment.app.w, androidx.activity.i, android.app.Activity
    public final native void onActivityResult(int i10, int i11, Intent intent);

    @Override // androidx.activity.i, android.app.Activity
    public final native void onBackPressed();

    @Override // androidx.fragment.app.w, androidx.activity.i, androidx.core.app.k, android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // android.app.Activity
    public final native boolean onCreateOptionsMenu(Menu menu);

    @Override // f.q, androidx.fragment.app.w, android.app.Activity
    public final native void onDestroy();

    @Override // android.app.Activity
    public final native boolean onOptionsItemSelected(MenuItem menuItem);

    @Override // f.q, androidx.fragment.app.w, androidx.activity.i, android.app.Activity, android.view.Window.Callback
    public final native void onPanelClosed(int i10, Menu menu);

    @Override // androidx.fragment.app.w, android.app.Activity
    public final native void onPause();

    @Override // android.app.Activity
    public final native boolean onPrepareOptionsMenu(Menu menu);

    @Override // androidx.fragment.app.w, androidx.activity.i, android.app.Activity
    public final native void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr);

    @Override // androidx.fragment.app.w, android.app.Activity
    public final native void onResume();

    @Override // f.q, androidx.fragment.app.w, android.app.Activity
    public final native void onStart();

    public final native void v(boolean z9);

    public final native void w();

    public final native void x(boolean z9);

    public final native void y();

    public final native void z();
}
