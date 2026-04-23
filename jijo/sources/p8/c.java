package p8;

import android.app.ProgressDialog;
import android.os.Handler;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import t8.a0;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.MainActivity;
import xyz.easypro.ecrypt.utils.Crypt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f16315b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f16316d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16317f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Handler f16318h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ProgressDialog f16319q;

    public /* synthetic */ c(MainActivity mainActivity, Handler handler, String str, String str2, ProgressDialog progressDialog) {
        this.f16314a = 2;
        this.f16315b = mainActivity;
        this.f16318h = handler;
        this.f16316d = str;
        this.f16317f = str2;
        this.f16319q = progressDialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f16314a;
        final int i11 = 1;
        String strA = Crypt.a(Crypt.xrc("\u001co9H9iIn>Lh<Kn9Mn>KfcIll\u001bgb\u001bll@<"));
        String strA2 = Crypt.a(Crypt.xrc("\u0019ml\u0019ioHhk\u001aj?O=n\u0019=<NglNn;KilLok@jkAjnHnl\u001c;lJi?Kl;@f;N=8Hgj@>k@in@"));
        final int i12 = 0;
        switch (i10) {
            case 0:
                final MainActivity mainActivity = this.f16315b;
                String str = this.f16316d;
                final File file = (File) this.f16317f;
                Handler handler = this.f16318h;
                ProgressDialog progressDialog = this.f16319q;
                a9.b bVar = MainActivity.N0;
                mainActivity.getClass();
                try {
                    String strN = MainActivity.N(str);
                    App.f17100w.f17415a.edit().putString(strA2, strN).apply();
                    new FileOutputStream(file).write(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.getBytes(strA));
                    team.dev.epro.apkcustom.widgets.j.A = false;
                    handler.post(new androidx.emoji2.text.m(mainActivity, file, strN, i11));
                } catch (IOException unused) {
                    handler.post(new Runnable() { // from class: p8.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i13 = i12;
                            String strA3 = Crypt.a(Crypt.xrc("\u001bnc\u001eibA=i\u001dioOkl\u001c:n\u001dgk\u001dnk\u0019f<\u001c:i\u001di"));
                            File file2 = file;
                            MainActivity mainActivity2 = mainActivity;
                            switch (i13) {
                                case 0:
                                    a9.b bVar2 = MainActivity.N0;
                                    mainActivity2.getClass();
                                    App.f17101x.o0();
                                    mainActivity2.x(false);
                                    if (file2.exists()) {
                                        file2.delete();
                                    }
                                    if (!App.f17100w.f17415a.getBoolean(strA3, true)) {
                                        a0 a0Var = mainActivity2.P;
                                        if (a0Var != null) {
                                            a0Var.g0();
                                            mainActivity2.P.h0();
                                            mainActivity2.P.b0();
                                        }
                                    } else {
                                        t8.m mVar = mainActivity2.O;
                                        if (mVar != null) {
                                            mVar.h0();
                                            mainActivity2.O.j0();
                                            mainActivity2.O.g0();
                                            mainActivity2.O.l0();
                                            mainActivity2.O.k0();
                                            mainActivity2.O.i0();
                                            mainActivity2.O.Z();
                                        }
                                    }
                                    break;
                                default:
                                    a9.b bVar3 = MainActivity.N0;
                                    mainActivity2.getClass();
                                    App.f17101x.o0();
                                    mainActivity2.x(false);
                                    if (file2.exists()) {
                                        file2.delete();
                                    }
                                    if (!App.f17100w.f17415a.getBoolean(strA3, true)) {
                                        a0 a0Var2 = mainActivity2.P;
                                        if (a0Var2 != null) {
                                            a0Var2.g0();
                                            mainActivity2.P.h0();
                                            mainActivity2.P.b0();
                                        }
                                    } else {
                                        t8.m mVar2 = mainActivity2.O;
                                        if (mVar2 != null) {
                                            mVar2.h0();
                                            mainActivity2.O.j0();
                                            mainActivity2.O.g0();
                                            mainActivity2.O.l0();
                                            mainActivity2.O.k0();
                                            mainActivity2.O.i0();
                                            mainActivity2.O.Z();
                                        }
                                    }
                                    break;
                            }
                        }
                    });
                }
                if (progressDialog.isShowing()) {
                    progressDialog.dismiss();
                }
                mainActivity.G0 = false;
                break;
            case 1:
                final MainActivity mainActivity2 = this.f16315b;
                String str2 = this.f16316d;
                final File file2 = (File) this.f16317f;
                Handler handler2 = this.f16318h;
                ProgressDialog progressDialog2 = this.f16319q;
                a9.b bVar2 = MainActivity.N0;
                mainActivity2.getClass();
                try {
                    String strN2 = MainActivity.N(str2);
                    App.f17100w.f17415a.edit().putString(strA2, strN2).apply();
                    new FileOutputStream(file2).write(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.getBytes(strA));
                    team.dev.epro.apkcustom.widgets.j.A = false;
                    handler2.post(new e(mainActivity2, file2, strN2, str2));
                } catch (IOException unused2) {
                    handler2.post(new Runnable() { // from class: p8.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i13 = i11;
                            String strA3 = Crypt.a(Crypt.xrc("\u001bnc\u001eibA=i\u001dioOkl\u001c:n\u001dgk\u001dnk\u0019f<\u001c:i\u001di"));
                            File file22 = file2;
                            MainActivity mainActivity22 = mainActivity2;
                            switch (i13) {
                                case 0:
                                    a9.b bVar22 = MainActivity.N0;
                                    mainActivity22.getClass();
                                    App.f17101x.o0();
                                    mainActivity22.x(false);
                                    if (file22.exists()) {
                                        file22.delete();
                                    }
                                    if (!App.f17100w.f17415a.getBoolean(strA3, true)) {
                                        a0 a0Var = mainActivity22.P;
                                        if (a0Var != null) {
                                            a0Var.g0();
                                            mainActivity22.P.h0();
                                            mainActivity22.P.b0();
                                        }
                                    } else {
                                        t8.m mVar = mainActivity22.O;
                                        if (mVar != null) {
                                            mVar.h0();
                                            mainActivity22.O.j0();
                                            mainActivity22.O.g0();
                                            mainActivity22.O.l0();
                                            mainActivity22.O.k0();
                                            mainActivity22.O.i0();
                                            mainActivity22.O.Z();
                                        }
                                    }
                                    break;
                                default:
                                    a9.b bVar3 = MainActivity.N0;
                                    mainActivity22.getClass();
                                    App.f17101x.o0();
                                    mainActivity22.x(false);
                                    if (file22.exists()) {
                                        file22.delete();
                                    }
                                    if (!App.f17100w.f17415a.getBoolean(strA3, true)) {
                                        a0 a0Var2 = mainActivity22.P;
                                        if (a0Var2 != null) {
                                            a0Var2.g0();
                                            mainActivity22.P.h0();
                                            mainActivity22.P.b0();
                                        }
                                    } else {
                                        t8.m mVar2 = mainActivity22.O;
                                        if (mVar2 != null) {
                                            mVar2.h0();
                                            mainActivity22.O.j0();
                                            mainActivity22.O.g0();
                                            mainActivity22.O.l0();
                                            mainActivity22.O.k0();
                                            mainActivity22.O.i0();
                                            mainActivity22.O.Z();
                                        }
                                    }
                                    break;
                            }
                        }
                    });
                }
                if (progressDialog2.isShowing()) {
                    progressDialog2.dismiss();
                }
                break;
            default:
                MainActivity mainActivity3 = this.f16315b;
                Handler handler3 = this.f16318h;
                String str3 = this.f16316d;
                String str4 = (String) this.f16317f;
                ProgressDialog progressDialog3 = this.f16319q;
                a9.b bVar3 = MainActivity.N0;
                mainActivity3.getClass();
                team.dev.epro.apkcustom.widgets.j.A = false;
                handler3.post(new e(mainActivity3, str3, str4, progressDialog3, 0));
                break;
        }
    }

    public /* synthetic */ c(MainActivity mainActivity, String str, File file, Handler handler, ProgressDialog progressDialog, int i10) {
        this.f16314a = i10;
        this.f16315b = mainActivity;
        this.f16316d = str;
        this.f16317f = file;
        this.f16318h = handler;
        this.f16319q = progressDialog;
    }
}
