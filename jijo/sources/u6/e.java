package u6;

import g4.a0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements d, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17652a;

    public e(int i10) {
        this.f17652a = i10;
    }

    @Override // u6.d
    public final int b() {
        return this.f17652a;
    }

    public final String toString() {
        j.f17662a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        a0.e(string, "renderLambdaToString(this)");
        return string;
    }
}
