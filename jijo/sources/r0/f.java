package r0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputContentInfo f16491a;

    public f(Object obj) {
        this.f16491a = (InputContentInfo) obj;
    }

    @Override // r0.g
    public final Object f() {
        return this.f16491a;
    }

    @Override // r0.g
    public final Uri g() {
        return this.f16491a.getContentUri();
    }

    @Override // r0.g
    public final ClipDescription getDescription() {
        return this.f16491a.getDescription();
    }

    @Override // r0.g
    public final void h() {
        this.f16491a.requestPermission();
    }

    @Override // r0.g
    public final Uri n() {
        return this.f16491a.getLinkUri();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f16491a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
