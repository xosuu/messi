package team.dev.epro.apkcustom.activities;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import com.google.android.material.textfield.TextInputLayout;
import f.b;
import f.q;
import java.util.ArrayList;
import java.util.HashMap;
import q8.p;
import team.dev.epro.apkcustom.widgets.g;
import team.dev.epro.apkcustom.widgets.jsonhighlight.CodeView;
import xyz.easypro.ecrypt.NativeUtil;
import xyz.easypro.ecrypt.utils.Crypt;

/* JADX INFO: loaded from: classes.dex */
public class V2raySettings extends q {
    public static final /* synthetic */ int P0 = 0;
    public p A0;
    public TextView B0;
    public EditText D0;
    public EditText E0;
    public EditText F0;
    public String G;
    public EditText G0;
    public CodeView H;
    public EditText H0;
    public FloatingActionMenu I;
    public g I0;
    public FloatingActionButton J;
    public HashMap J0;
    public FloatingActionButton K;
    public ArrayList K0;
    public p L0;
    public LinearLayout M;
    public EditText M0;
    public TextView N;
    public EditText N0;
    public TextView O;
    public EditText O0;
    public g P;
    public g Q;
    public p R;
    public p S;
    public HashMap T;
    public HashMap U;
    public ArrayList V;
    public ArrayList W;
    public EditText X;
    public EditText Y;
    public LinearLayout Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public LinearLayout f17164a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public LinearLayout f17165b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public LinearLayout f17166c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public LinearLayout f17167d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public LinearLayout f17168e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Switch f17169f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Switch f17170g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Switch f17171h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public EditText f17172i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public EditText f17173j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public EditText f17174k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public EditText f17175l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public EditText f17176m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public TextView f17177n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public TextView f17178o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public TextView f17179p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public TextView f17180q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public TextView f17181r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public TextInputLayout f17182s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public TextInputLayout f17183t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public TextInputLayout f17184u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public TextInputLayout f17185v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public TextInputLayout f17186w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public g f17187x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public HashMap f17188y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public ArrayList f17189z0;
    public boolean L = true;
    public final b C0 = new b(13, this);

    static {
        NativeUtil.classesInit0(233);
        System.loadLibrary(Crypt.a(Crypt.xrc("\u001ei9\u0019:bI9nMfhA9iAm9\u001alj\u001dh;Oi>\u001e>l\u001al")));
    }

    public final native void A(String str);

    @Override // androidx.activity.i, android.app.Activity
    public final native void onBackPressed();

    @Override // androidx.fragment.app.w, androidx.activity.i, androidx.core.app.k, android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // android.app.Activity
    public final native boolean onCreateOptionsMenu(Menu menu);

    @Override // android.app.Activity
    public final native boolean onOptionsItemSelected(MenuItem menuItem);

    @Override // androidx.fragment.app.w, android.app.Activity
    public final native void onPause();

    public final native void u();

    public final native void v();

    public final native void w();

    public final native void x();

    public final native void y();

    public final native void z(String str);
}
