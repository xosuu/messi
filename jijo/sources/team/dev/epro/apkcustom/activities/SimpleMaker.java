package team.dev.epro.apkcustom.activities;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.textfield.TextInputLayout;
import f.b;
import f.q;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class SimpleMaker extends q {
    public Spinner G;
    public Spinner H;
    public Spinner I;
    public RadioGroup J;
    public RadioButton K;
    public EditText L;
    public EditText M;
    public EditText N;
    public EditText O;
    public EditText P;
    public CheckBox Q;
    public CheckBox R;
    public CheckBox S;
    public CheckBox T;
    public CheckBox U;
    public CheckBox V;
    public CheckBox W;
    public CheckBox X;
    public TextInputLayout Y;
    public TextInputLayout Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public TextInputLayout f17146a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Button f17147b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public String f17148c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public String f17149d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public String f17150e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public String f17151f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public String f17152g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public String f17153h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f17154i0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public String f17158m0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public String f17155j0 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public String f17156k0 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public String f17157l0 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public String f17159n0 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public String f17160o0 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f17161p0 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f17162q0 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final b f17163r0 = new b(12, this);

    static {
        NativeUtil.classesInit0(1);
    }

    public static native String j0(SimpleMaker simpleMaker);

    public static native String k0(SimpleMaker simpleMaker, int i10);

    public static native void o0(SimpleMaker simpleMaker);

    public static native void s0(String str, String str2);

    @Override // androidx.fragment.app.w, androidx.activity.i, androidx.core.app.k, android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // androidx.fragment.app.w, android.app.Activity
    public final native void onPause();

    @Override // androidx.fragment.app.w, android.app.Activity
    public final native void onResume();
}
