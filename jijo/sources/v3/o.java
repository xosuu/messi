package v3;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class o extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f17784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u3.f f17785b;

    public o(Intent intent, u3.f fVar) {
        this.f17784a = intent;
        this.f17785b = fVar;
    }

    @Override // v3.p
    public final void a() {
        Intent intent = this.f17784a;
        if (intent != null) {
            this.f17785b.startActivityForResult(intent, 2);
        }
    }
}
