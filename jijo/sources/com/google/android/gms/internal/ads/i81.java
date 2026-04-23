package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class i81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yz f5523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final yz f5524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x61 f5525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v61 f5526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c61 f5527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a61 f5528f;

    static {
        tb1 tb1VarB = n71.b("type.googleapis.com/google.crypto.tink.HmacKey");
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ua1 ua1Var = ua1.RAW;
        z71 z71Var = z71.f11181e;
        map.put(ua1Var, z71Var);
        map2.put(z71Var, ua1Var);
        ua1 ua1Var2 = ua1.TINK;
        z71 z71Var2 = z71.f11178b;
        map.put(ua1Var2, z71Var2);
        map2.put(z71Var2, ua1Var2);
        ua1 ua1Var3 = ua1.LEGACY;
        z71 z71Var3 = z71.f11180d;
        map.put(ua1Var3, z71Var3);
        map2.put(z71Var3, ua1Var3);
        ua1 ua1Var4 = ua1.CRUNCHY;
        z71 z71Var4 = z71.f11179c;
        map.put(ua1Var4, z71Var4);
        map2.put(z71Var4, ua1Var4);
        f5523a = new yz(Collections.unmodifiableMap(map), Collections.unmodifiableMap(map2));
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        r91 r91Var = r91.SHA1;
        y71 y71Var = y71.f10792b;
        map3.put(r91Var, y71Var);
        map4.put(y71Var, r91Var);
        r91 r91Var2 = r91.SHA224;
        y71 y71Var2 = y71.f10793c;
        map3.put(r91Var2, y71Var2);
        map4.put(y71Var2, r91Var2);
        r91 r91Var3 = r91.SHA256;
        y71 y71Var3 = y71.f10794d;
        map3.put(r91Var3, y71Var3);
        map4.put(y71Var3, r91Var3);
        r91 r91Var4 = r91.SHA384;
        y71 y71Var4 = y71.f10795e;
        map3.put(r91Var4, y71Var4);
        map4.put(y71Var4, r91Var4);
        r91 r91Var5 = r91.SHA512;
        y71 y71Var5 = y71.f10796f;
        map3.put(r91Var5, y71Var5);
        map4.put(y71Var5, r91Var5);
        f5524b = new yz(Collections.unmodifiableMap(map3), Collections.unmodifiableMap(map4));
        f5525c = new x61(new pe(20), a81.class);
        f5526d = new v61(new pe(21), tb1VarB);
        f5527e = new c61(new pe(22), v71.class);
        f5528f = new a61(new pe(23), tb1VarB);
    }
}
