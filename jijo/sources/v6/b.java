package v6;

import b4.h;
import g4.a0;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f17882d = new h(15);

    @Override // v6.a
    public final Random b() {
        Object obj = this.f17882d.get();
        a0.e(obj, "implStorage.get()");
        return (Random) obj;
    }
}
