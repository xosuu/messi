package s8;

import android.view.View;
import team.dev.epro.apkcustom.dialogs.ShortUrl;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ShortUrl f16764b;

    static {
        NativeUtil.classesInit0(143);
    }

    public /* synthetic */ l(ShortUrl shortUrl, int i10) {
        this.f16763a = i10;
        this.f16764b = shortUrl;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
