package p8;

import android.content.Intent;
import android.os.Handler;
import java.io.File;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.MainActivity;
import xyz.easypro.ecrypt.utils.Crypt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f16312b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Handler f16313d;

    public /* synthetic */ b(MainActivity mainActivity, Handler handler, int i10) {
        this.f16311a = i10;
        this.f16312b = mainActivity;
        this.f16313d = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f16311a;
        final int i11 = 1;
        Handler handler = this.f16313d;
        final MainActivity mainActivity = this.f16312b;
        switch (i10) {
            case 0:
                a9.b bVar = MainActivity.N0;
                mainActivity.getClass();
                if (App.f17101x.h0(new File(App.f17101x.i0()), mainActivity.M0)) {
                    handler.post(new f7.h(1, mainActivity));
                }
                break;
            default:
                a9.b bVar2 = MainActivity.N0;
                mainActivity.getClass();
                try {
                    Thread.sleep(1000L);
                    break;
                } catch (InterruptedException unused) {
                }
                handler.post(new Runnable() { // from class: p8.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i12 = i11;
                        String strA = Crypt.a(Crypt.xrc("KncLjk@o;L<nJmnA99Il<\u001b>jNn9A=bLfn\u001a>l\u001a;lK:bJjk\u001b;bNn9Lln\u0019n?JljK:h\u0019"));
                        MainActivity mainActivity2 = mainActivity;
                        switch (i12) {
                            case 0:
                                a9.b bVar3 = MainActivity.N0;
                                mainActivity2.getClass();
                                Intent intent = new Intent(strA);
                                intent.addFlags(276856832);
                                mainActivity2.startActivity(intent);
                                mainActivity2.finish();
                                break;
                            default:
                                a9.b bVar4 = MainActivity.N0;
                                mainActivity2.getClass();
                                Intent intent2 = new Intent(strA);
                                intent2.addFlags(276856832);
                                mainActivity2.startActivity(intent2);
                                mainActivity2.finish();
                                break;
                        }
                    }
                });
                break;
        }
    }
}
