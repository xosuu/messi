package g4;

import android.app.Application;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class r implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f13779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f13780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f13781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f13782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u0 f13783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f13784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f13785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f13786h;

    public r(Application application, q qVar, Handler handler, b0 b0Var, u0 u0Var, e eVar, k kVar, g gVar) {
        this.f13779a = application;
        this.f13780b = qVar;
        this.f13781c = handler;
        this.f13782d = b0Var;
        this.f13783e = u0Var;
        this.f13784f = eVar;
        this.f13785g = kVar;
        this.f13786h = gVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    @Override // g4.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(org.json.JSONObject r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.r.a(org.json.JSONObject, java.lang.String):boolean");
    }

    public final void b(String str) {
        "Receive consent action: ".concat(String.valueOf(str));
        Uri uri = Uri.parse(str);
        String queryParameter = uri.getQueryParameter("action");
        String queryParameter2 = uri.getQueryParameter("args");
        f0[] f0VarArr = {this, this.f13784f};
        u0 u0Var = this.f13783e;
        u0Var.getClass();
        u0Var.f13800a.execute(new l0.a(queryParameter, queryParameter2, f0VarArr, 26, 0));
    }

    @Override // g4.f0
    public final Executor zza() {
        Handler handler = this.f13781c;
        Objects.requireNonNull(handler);
        return new r2.e(1, handler);
    }
}
