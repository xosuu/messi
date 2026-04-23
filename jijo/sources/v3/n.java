package v3;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class n extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f17781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f17782b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17783d = 2;

    public n(Activity activity, Intent intent) {
        this.f17781a = intent;
        this.f17782b = activity;
    }

    @Override // v3.p
    public final void a() {
        Intent intent = this.f17781a;
        if (intent != null) {
            this.f17782b.startActivityForResult(intent, this.f17783d);
        }
    }
}
