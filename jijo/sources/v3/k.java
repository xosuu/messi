package v3;

import com.google.gson.JsonIOException;

/* JADX INFO: loaded from: classes.dex */
public final class k implements com.google.gson.internal.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17776b;

    public /* synthetic */ k(String str, int i10) {
        this.f17775a = i10;
        this.f17776b = str;
    }

    @Override // com.google.gson.internal.l
    public final Object f() {
        throw new JsonIOException(this.f17776b);
    }

    public final String toString() {
        switch (this.f17775a) {
            case 2:
                return "<" + this.f17776b + '>';
            default:
                return super.toString();
        }
    }
}
