package t8;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.internal.ads.zg0;
import com.google.android.material.textfield.TextInputLayout;
import de.blinkt.openvpn.core.ConnectionStatus;
import g4.v0;
import j6.h0;
import java.io.File;
import java.util.List;
import team.dev.epro.apkcustom.widgets.FreshDownloadView;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class a0 extends androidx.fragment.app.s implements SeekBar.OnSeekBarChangeListener, h0 {
    public static final /* synthetic */ int Z0 = 0;
    public TextView A0;
    public TextView B0;
    public TextView C0;
    public Button D0;
    public SeekBar E0;
    public RelativeLayout F0;
    public TextView G0;
    public h6.d H0;
    public j6.f I0;
    public zg0 L0;
    public List M0;
    public boolean O0;
    public RelativeLayout P0;
    public AdView Q0;
    public InterstitialAd R0;
    public AdRequest S0;
    public v0 T0;
    public androidx.activity.result.c U0;
    public boolean W0;
    public boolean X0;
    public boolean Y0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public z f17024h0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public r8.g f17026j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public RecyclerView f17027k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public SwipeRefreshLayout f17028l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public LinearLayout f17029m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public FreshDownloadView f17030n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public TextView f17031o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public TextInputLayout f17032p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ScrollView f17033q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public EditText f17034r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public CheckBox f17035s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public CheckBox f17036t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public CheckBox f17037u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public CheckBox f17038v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public CheckBox f17039w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public CheckBox f17040x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public CheckBox f17041y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public TextView f17042z0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f17025i0 = 0;
    public final n1.k J0 = new n1.k(5, this);
    public String K0 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    public int N0 = 0;
    public boolean V0 = false;

    static {
        NativeUtil.classesInit0(232);
    }

    public static native boolean Z(a0 a0Var);

    public static native byte[] k0(File file);

    public static native String m0(Uri uri);

    @Override // androidx.fragment.app.s
    public final native void A(Bundle bundle);

    @Override // androidx.fragment.app.s
    public final native View C(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    @Override // androidx.fragment.app.s
    public final native void D();

    @Override // androidx.fragment.app.s
    public final native void F();

    @Override // androidx.fragment.app.s
    public final native void I();

    @Override // androidx.fragment.app.s
    public final native void J();

    @Override // j6.h0
    public final native void a0(String str);

    public final native void b0();

    public final native void c0();

    public final native void d0();

    public final native void e0();

    public final native void f0();

    public final native void g0();

    public final native void h0();

    public final native void i0(boolean z9);

    public final native boolean j0(byte[] bArr);

    public final native String[] l0(String str);

    public final native void n0();

    public final native void o0();

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final native void onProgressChanged(SeekBar seekBar, int i10, boolean z9);

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final native void onStartTrackingTouch(SeekBar seekBar);

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final native void onStopTrackingTouch(SeekBar seekBar);

    public final native void p0();

    public final native void q0();

    public final native void r0(int i10);

    public final native void s0();

    @Override // j6.h0
    public final native void t(String str, String str2, int i10, ConnectionStatus connectionStatus, Intent intent);

    public final native void t0();

    public final native void u0(int i10, int i11, int i12);

    @Override // androidx.fragment.app.s
    public final native void y(int i10, int i11, Intent intent);

    @Override // androidx.fragment.app.s
    public final native void z(Context context);
}
