package team.dev.epro.apkcustom.dialogs;

import android.os.Bundle;
import android.telephony.SubscriptionManager;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.c;
import com.google.android.material.textfield.TextInputLayout;
import f.q;
import java.io.File;
import team.dev.epro.apkcustom.widgets.AESEncrypt;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class RequestBlock extends q implements View.OnClickListener {

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final /* synthetic */ int f17190b1 = 0;
    public Button A0;
    public Button B0;
    public Button C0;
    public Button D0;
    public TextView E0;
    public TextView F0;
    public LinearLayout G;
    public TextView G0;
    public LinearLayout H;
    public File H0;
    public LinearLayout I;
    public File I0;
    public LinearLayout J;
    public String J0;
    public LinearLayout K;
    public String K0;
    public TextInputLayout L;
    public String L0;
    public TextInputLayout M;
    public String M0;
    public TextInputLayout N;
    public String N0;
    public TextInputLayout O;
    public String O0;
    public TextInputLayout P;
    public String P0;
    public TextInputLayout Q;
    public String Q0;
    public TextInputLayout R;
    public String R0;
    public ImageView S;
    public boolean S0;
    public EditText T;
    public boolean T0;
    public EditText U;
    public String U0;
    public EditText V;
    public String V0;
    public EditText W;
    public EditText X;
    public String X0;
    public EditText Y;
    public c Y0;
    public EditText Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public EditText f17191a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public boolean f17192a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public EditText f17193b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public EditText f17194c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public EditText f17195d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public EditText f17196e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public CheckBox f17197f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public CheckBox f17198g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public CheckBox f17199h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public CheckBox f17200i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public CheckBox f17201j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public CheckBox f17202k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public CheckBox f17203l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public CheckBox f17204m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public CheckBox f17205n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public CheckBox f17206o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public CheckBox f17207p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public CheckBox f17208q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public CheckBox f17209r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public CheckBox f17210s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public CheckBox f17211t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public CheckBox f17212u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public CheckBox f17213v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public CheckBox f17214w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public CheckBox f17215x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public CheckBox f17216y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public Button f17217z0;
    public boolean W0 = true;
    public final char[] Z0 = AESEncrypt.lmn();

    static {
        NativeUtil.classesInit0(204);
    }

    public static native void F(int i10, String str);

    public static native void v();

    public static native int x(SubscriptionManager subscriptionManager);

    public final native String A();

    public final native void B();

    public final native void C();

    public final native void D();

    public final native void E(String str);

    @Override // android.app.Activity, android.view.Window.Callback
    public final native boolean dispatchTouchEvent(MotionEvent motionEvent);

    @Override // androidx.activity.i, android.app.Activity
    public final native void onBackPressed();

    @Override // android.view.View.OnClickListener
    public native void onClick(View view);

    @Override // androidx.fragment.app.w, androidx.activity.i, androidx.core.app.k, android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // androidx.fragment.app.w, android.app.Activity
    public final native void onPause();

    @Override // androidx.fragment.app.w, androidx.activity.i, android.app.Activity
    public final native void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr);

    @Override // androidx.fragment.app.w, android.app.Activity
    public final native void onResume();

    public final native void u();

    public final native void w(String str);

    public final native String y();

    public final native String z();
}
