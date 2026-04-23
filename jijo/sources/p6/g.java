package p6;

import g4.a0;
import u6.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends c implements u6.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16259f;

    public g(n6.e eVar) {
        super(eVar);
        this.f16259f = 2;
    }

    @Override // u6.d
    public final int b() {
        return this.f16259f;
    }

    @Override // p6.a
    public final String toString() {
        if (this.f16253a != null) {
            return super.toString();
        }
        j.f17662a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        a0.e(string, "renderLambdaToString(this)");
        return string;
    }
}
