package h1;

import android.net.Uri;
import android.view.InputEvent;
import b7.b0;
import com.google.android.gms.internal.ads.en1;
import g4.a0;
import g4.d0;
import j1.e;
import j1.f;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7.b f13936a;

    public d(j1.d dVar) {
        this.f13936a = dVar;
    }

    public n5.a a(j1.a aVar) {
        a0.f(aVar, "deletionRequest");
        throw null;
    }

    public n5.a b() {
        return d0.b(en1.c(en1.a(b0.f1396a), new a(this, null)));
    }

    public n5.a c(Uri uri, InputEvent inputEvent) {
        a0.f(uri, "attributionSource");
        return d0.b(en1.c(en1.a(b0.f1396a), new b(this, uri, inputEvent, null)));
    }

    public n5.a d(Uri uri) {
        a0.f(uri, "trigger");
        return d0.b(en1.c(en1.a(b0.f1396a), new c(this, uri, null)));
    }

    public n5.a e(e eVar) {
        a0.f(eVar, "request");
        throw null;
    }

    public n5.a f(f fVar) {
        a0.f(fVar, "request");
        throw null;
    }
}
