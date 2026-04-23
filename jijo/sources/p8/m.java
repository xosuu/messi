package p8;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import java.io.Serializable;
import java.util.ArrayList;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.MainActivity;
import xyz.easypro.ecrypt.utils.Crypt;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class m implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Serializable f16345b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16346d;

    public /* synthetic */ m(Object obj, Serializable serializable, int i10) {
        this.f16344a = i10;
        this.f16346d = obj;
        this.f16345b = serializable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = this.f16344a;
        Serializable serializable = this.f16345b;
        Object obj = this.f16346d;
        switch (i11) {
            case 0:
                MainActivity mainActivity = (MainActivity) obj;
                String str = (String) serializable;
                a9.b bVar = MainActivity.N0;
                ((ClipboardManager) mainActivity.getSystemService(Crypt.a(Crypt.xrc("K<iNj?\u001d>l\u0019>9J9lN9;\u001c;o\u001a;9Aoj\u0019obIg")))).setPrimaryClip(ClipData.newPlainText(mainActivity.getString(R.string.y6), str));
                App.f17101x.d(team.dev.epro.apkcustom.widgets.a.f17393f, String.format(mainActivity.getString(R.string.zc), str));
                break;
            default:
                if (i10 == -2) {
                    i9.b bVar2 = (i9.b) obj;
                    if (bVar2.f14215c.size() != ((ArrayList) serializable).size()) {
                        bVar2.f14214b.getClass();
                    } else {
                        bVar2.f14214b.getClass();
                    }
                    break;
                } else if (i10 == -1) {
                    i9.b bVar3 = (i9.b) obj;
                    bVar3.a(bVar3.f14215c, bVar3.f14217e, bVar3.f14218f);
                    break;
                }
                break;
        }
    }
}
