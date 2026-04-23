package f7;

/* JADX INFO: loaded from: classes.dex */
public enum f0 {
    f13257b("TLSv1.3"),
    f13258d("TLSv1.2"),
    f13259f("TLSv1.1"),
    f13260h("TLSv1"),
    f13261q("SSLv3");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13263a;

    f0(String str) {
        this.f13263a = str;
    }

    public static f0 a(String str) {
        str.getClass();
        switch (str) {
            case "TLSv1.1":
                return f13259f;
            case "TLSv1.2":
                return f13258d;
            case "TLSv1.3":
                return f13257b;
            case "SSLv3":
                return f13261q;
            case "TLSv1":
                return f13260h;
            default:
                throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
        }
    }
}
