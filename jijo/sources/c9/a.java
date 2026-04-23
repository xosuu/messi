package c9;

import xyz.easypro.ecrypt.utils.Crypt;
import z5.h;

/* JADX INFO: loaded from: classes.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1606e;

    public a(int i10, String str, String str2) {
        this(str, i10, null, null, str2);
    }

    public a(String str, int i10, String str2, String str3, String str4) {
        if (str == null) {
            throw new IllegalArgumentException(Crypt.a(Crypt.xrc("N=cA:9Kj<O;kO9oJjhA:i@;o\u001d;mI;cIj9\u001bj<K>iMojLin\u001ci<N>;\u001e<oLooOikJgbH")));
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(Crypt.a(Crypt.xrc("J9lO=oNg>\u001b=iNnbHl<AgoK9l\u001e<oKi?\u001bmnH:?\u001d:n@ocL;9\u0019h<OkmK9<Alm@:j\u001b=;\u0019")));
        }
        this.f1602a = str;
        this.f1603b = i10;
        this.f1604c = str2;
        this.f1605d = str3;
        if (str4 == null || !str4.startsWith(Crypt.a(Crypt.xrc("A<?K<>O><MfnKf>\u0019mm\u001e>kO>8\u001bln@m?\u001dj")))) {
            this.f1606e = 2;
        } else {
            this.f1606e = 1;
        }
    }
}
