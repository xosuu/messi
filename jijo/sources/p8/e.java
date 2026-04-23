package p8;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Handler;
import f.s0;
import java.io.File;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.MainActivity;
import team.dev.epro.apkcustom.widgets.FileChooser;
import xyz.easypro.ecrypt.utils.Crypt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f16324b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16325d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16326f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f16327h;

    public /* synthetic */ e(Activity activity, Object obj, Object obj2, ProgressDialog progressDialog, int i10) {
        this.f16323a = i10;
        this.f16324b = activity;
        this.f16325d = obj;
        this.f16326f = obj2;
        this.f16327h = progressDialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f16323a;
        Object obj = this.f16327h;
        Object obj2 = this.f16326f;
        Object obj3 = this.f16325d;
        Activity activity = this.f16324b;
        switch (i10) {
            case 0:
                a9.b bVar = MainActivity.N0;
                ((MainActivity) activity).J((String) obj3, (String) obj2, (ProgressDialog) obj);
                break;
            case 1:
                a9.b bVar2 = MainActivity.N0;
                ((MainActivity) activity).K((File) obj, (String) obj3, (String) obj2);
                break;
            default:
                FileChooser fileChooser = (FileChooser) activity;
                File file = (File) obj3;
                Handler handler = (Handler) obj2;
                ProgressDialog progressDialog = (ProgressDialog) obj;
                if (!fileChooser.f17362a.equalsIgnoreCase(Crypt.a(Crypt.xrc("H:k\u001dfmJmbA9>Of<AnmKoiL9jOjcJnoAm")))) {
                    App.f17101x.h0(file, null);
                }
                handler.post(new s0(fileChooser, 15, progressDialog));
                break;
        }
    }

    public /* synthetic */ e(MainActivity mainActivity, File file, String str, String str2) {
        this.f16323a = 1;
        this.f16324b = mainActivity;
        this.f16327h = file;
        this.f16325d = str;
        this.f16326f = str2;
    }
}
