package p8;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.widget.EditText;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.fb1;
import com.tencent.mmkv.MMKV;
import f.s0;
import java.util.concurrent.Executors;
import t8.a0;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.MainActivity;
import team.dev.epro.apkcustom.widgets.SystemNative;
import xyz.easypro.ecrypt.utils.Crypt;

/* JADX INFO: loaded from: classes.dex */
public final class q implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EditText f16358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f16359b;

    public q(MainActivity mainActivity, EditText editText) {
        this.f16359b = mainActivity;
        this.f16358a = editText;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        String string = this.f16358a.getText().toString();
        MMKV mmkv = App.f17100w.f17415a;
        String strA = Crypt.a(Crypt.xrc("JmmJ;h\u001bm;\u001e;bJio\u001e;>\u0019kjKnl\u001eil\u001bob\u001dm"));
        fb1.z(mmkv, strA, string);
        String strI0 = App.f17101x.i0();
        a9.b bVar = MainActivity.N0;
        MainActivity mainActivity = this.f16359b;
        boolean zEquals = string.equals(Integer.parseInt(mainActivity.L(strI0)[27]) >= 594 ? SystemNative.abc(mainActivity.L(App.f17101x.i0())[22], 1, 8) : mainActivity.L(App.f17101x.i0())[22]);
        String strA2 = Crypt.a(Crypt.xrc("\u001bnc\u001eibA=i\u001dioOkl\u001c:n\u001dgk\u001dnk\u0019f<\u001c:i\u001di"));
        if (zEquals || string.isEmpty()) {
            if (string.equals(Integer.parseInt(mainActivity.L(App.f17101x.i0())[27]) >= 594 ? SystemNative.abc(mainActivity.L(App.f17101x.i0())[22], 1, 8) : mainActivity.L(App.f17101x.i0())[22]) && !string.isEmpty()) {
                boolean z9 = App.f17100w.f17415a.getBoolean(strA2, true);
                String strA3 = Crypt.a(Crypt.xrc("Lil\u001ajn\u001e99Mo>Hhh\u001a<;J:;Ajn\u001d;h\u001a=m\u0019fjHf;IhhHllNfk\u0019gl\u001e<?Nh8MilHl9\u001c:k@mc\u001ch9IjbMji\u001bhhNm?I=k\u001bnmO9kO;;J:8"));
                if (z9) {
                    t8.m mVar = mainActivity.O;
                    if (mVar != null) {
                        String string2 = App.f17100w.f17415a.getString(Crypt.a(Crypt.xrc("H:kOjmOolKo;\u0019nbHi8\u0019f?JmlH=h\u001dmcA<")), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        if (mVar.c() != null) {
                            mVar.f17067m0.setText(string2);
                        } else {
                            App.f17101x.d(-3355444, strA3);
                            Executors.newSingleThreadExecutor().execute(new s0(mVar, 11, new Handler(Looper.getMainLooper())));
                        }
                    }
                } else {
                    a0 a0Var = mainActivity.P;
                    if (a0Var != null) {
                        String string3 = App.f17100w.f17415a.getString(Crypt.a(Crypt.xrc("Kfi\u001ej<\u001elkInc\u0019mjH9>\u0019lkMojMl?\u0019f9\u001do")), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        if (a0Var.c() != null) {
                            a0Var.f17034r0.setText(string3);
                        } else {
                            App.f17101x.d(-3355444, strA3);
                            Executors.newSingleThreadExecutor().execute(new s0(a0Var, 12, new Handler(Looper.getMainLooper())));
                        }
                    }
                }
            }
        } else {
            if (App.f17100w.f17415a.getBoolean(strA2, true)) {
                t8.m mVar2 = mainActivity.O;
                if (mVar2 != null) {
                    mVar2.h0();
                    mainActivity.O.j0();
                    mainActivity.O.g0();
                    mainActivity.O.l0();
                    mainActivity.O.k0();
                    mainActivity.O.i0();
                    mainActivity.O.Z();
                }
            } else {
                a0 a0Var2 = mainActivity.P;
                if (a0Var2 != null) {
                    a0Var2.g0();
                    mainActivity.P.h0();
                    mainActivity.P.b0();
                }
            }
            App.f17101x.o0();
            App.f17101x.d(team.dev.epro.apkcustom.widgets.a.f17391d, Crypt.a(Crypt.xrc("N>l\u001bikNn?NinJj?An;\u001dg;\u0019gmOmn\u001a=h\u001eo8@:<\u001ef8Kkb\u001c>iK:hIf>Lk?\u001eo?\u001ei;M9jL")));
            mainActivity.H.h();
            mainActivity.x(true);
            fb1.z(App.f17100w.f17415a, strA, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        }
        mainActivity.f17137y0 = false;
    }
}
