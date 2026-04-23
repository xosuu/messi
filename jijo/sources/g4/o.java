package g4;

import android.os.Handler;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final class o extends WebView {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f13767f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f13768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f13769b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13770d;

    public o(q qVar, Handler handler, r rVar) {
        super(qVar);
        this.f13770d = false;
        this.f13768a = handler;
        this.f13769b = rVar;
    }

    public final void a(String str, String str2) {
        this.f13768a.post(new l.j(this, str + "(" + str2 + ");", 21));
    }
}
