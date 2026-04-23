package x8;

import xyz.easypro.ecrypt.utils.Crypt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f18558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f18559b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f18560d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b[] f18561f;

    static {
        b bVar = new b(Crypt.a(Crypt.xrc("Oh8\u001em>HkjI>l\u001bhiM><MnhMoiJ>>Ij9L:")), 0);
        f18558a = bVar;
        b bVar2 = new b(Crypt.a(Crypt.xrc("L=cLfc\u001e<jM<?Hl9@=n\u0019nlL;kIfmAo>H=")), 1);
        f18559b = bVar2;
        b bVar3 = new b(Crypt.a(Crypt.xrc("Nf8Hk8KijHk<O:nAk>\u001a:m\u001d;h\u001ej?\u001af>\u0019:")), 2);
        f18560d = bVar3;
        f18561f = new b[]{bVar, bVar2, bVar3};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f18561f.clone();
    }
}
