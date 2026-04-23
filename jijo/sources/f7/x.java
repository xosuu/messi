package f7;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public enum x {
    f13383b("http/1.0"),
    f13384d("http/1.1"),
    f13385f("spdy/3.1"),
    f13386h("h2"),
    f13387q("quic");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13389a;

    x(String str) {
        this.f13389a = str;
    }

    public static x a(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return f13383b;
        }
        if (str.equals("http/1.1")) {
            return f13384d;
        }
        if (str.equals("h2")) {
            return f13386h;
        }
        if (str.equals("spdy/3.1")) {
            return f13385f;
        }
        if (str.equals("quic")) {
            return f13387q;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f13389a;
    }
}
