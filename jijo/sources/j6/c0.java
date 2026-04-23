package j6;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.en1;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static c0 f14386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static h6.d f14387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static h6.d f14388d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f14389a;

    public /* synthetic */ c0(int i10) {
        if (i10 != 1) {
            this.f14389a = new HashMap();
            return;
        }
        HashMap map = new HashMap();
        this.f14389a = map;
        map.put(".clients.turbobytes.net", "TurboBytes");
        this.f14389a.put(".turbobytes-cdn.com", "TurboBytes");
        this.f14389a.put(".afxcdn.net", "afxcdn.net");
        this.f14389a.put(".akamai.net", "Akamai");
        this.f14389a.put(".akamaiedge.net", "Akamai");
        this.f14389a.put(".akadns.net", "Akamai");
        this.f14389a.put(".akamaitechnologies.com", "Akamai");
        this.f14389a.put(".akamaized.net", "Akamai");
        this.f14389a.put(".gslb.tbcache.com", "Alimama");
        this.f14389a.put(".cloudfront.net", "Amazon Cloudfront");
        this.f14389a.put(".amazonaws.com", "Amazon Cloudfront");
        this.f14389a.put(".amazon.com", "Amazon Cloudfront");
        this.f14389a.put(".anankecdn.com.br", "Ananke");
        this.f14389a.put(".att-dsa.net", "AT&T");
        this.f14389a.put(".azioncdn.net", "Azion");
        this.f14389a.put(".belugacdn.com", "BelugaCDN");
        this.f14389a.put(".bluehatnetwork.com", "Blue Hat Network");
        this.f14389a.put(".systemcdn.net", "EdgeCast");
        this.f14389a.put(".cachefly.net", "Cachefly");
        this.f14389a.put(".cdn77.net", "CDN77");
        this.f14389a.put(".cdn77.org", "CDN77");
        this.f14389a.put(".panthercdn.com", "CDNetworks");
        this.f14389a.put(".cdngc.net", "CDNetworks");
        this.f14389a.put(".gccdn.net", "CDNetworks");
        this.f14389a.put(".gccdn.cn", "CDNetworks");
        this.f14389a.put(".cdnify.io", "CDNify");
        this.f14389a.put(".ccgslb.com", "ChinaCache");
        this.f14389a.put(".ccgslb.net", "ChinaCache");
        this.f14389a.put(".c3cache.net", "ChinaCache");
        this.f14389a.put(".chinacache.net", "ChinaCache");
        this.f14389a.put(".c3cdn.net", "ChinaCache");
        this.f14389a.put(".lxdns.com", "ChinaNetCenter");
        this.f14389a.put(".speedcdns.com", "QUANTIL/ChinaNetCenter");
        this.f14389a.put(".mwcloudcdn.com", "QUANTIL/ChinaNetCenter");
        this.f14389a.put(".cloudflare.com", "Cloudflare");
        this.f14389a.put(".cloudflare.net", "Cloudflare");
        this.f14389a.put(".edgecastcdn.net", "EdgeCast");
        this.f14389a.put(".adn.", "EdgeCast");
        this.f14389a.put(".wac.", "EdgeCast");
        this.f14389a.put(".wpc.", "EdgeCast");
        this.f14389a.put(".fastly.net", "Fastly");
        this.f14389a.put(".fastlylb.net", "Fastly");
        this.f14389a.put(".google.", "Google");
        this.f14389a.put("googlesyndication.", "Google");
        this.f14389a.put("youtube.", "Google");
        this.f14389a.put(".googleusercontent.com", "Google");
        this.f14389a.put(".doubleclick.net", "Google");
        this.f14389a.put("d.gcdn.co", "G-core");
        this.f14389a.put(".hiberniacdn.com", "Hibernia");
        this.f14389a.put(".hwcdn.net", "Highwinds");
        this.f14389a.put(".incapdns.net", "Incapsula");
        this.f14389a.put(".inscname.net", "Instartlogic");
        this.f14389a.put(".insnw.net", "Instartlogic");
        this.f14389a.put(".internapcdn.net", "Internap");
        this.f14389a.put(".kxcdn.com", "KeyCDN");
        this.f14389a.put(".lswcdn.net", "LeaseWeb CDN");
        this.f14389a.put(".footprint.net", "Level3");
        this.f14389a.put(".llnwd.net", "Limelight");
        this.f14389a.put(".lldns.net", "Limelight");
        this.f14389a.put(".netdna-cdn.com", "MaxCDN");
        this.f14389a.put(".netdna-ssl.com", "MaxCDN");
        this.f14389a.put(".netdna.com", "MaxCDN");
        this.f14389a.put(".stackpathdns.com", "StackPath");
        this.f14389a.put(".mncdn.com", "Medianova");
        this.f14389a.put(".instacontent.net", "Mirror Image");
        this.f14389a.put(".mirror-image.net", "Mirror Image");
        this.f14389a.put(".cap-mii.net", "Mirror Image");
        this.f14389a.put(".rncdn1.com", "Reflected Networks");
        this.f14389a.put(".simplecdn.net", "Simple CDN");
        this.f14389a.put(".swiftcdn1.com", "SwiftCDN");
        this.f14389a.put(".swiftserve.com", "SwiftServe");
        this.f14389a.put(".gslb.taobao.com", "Taobao");
        this.f14389a.put(".cdn.bitgravity.com", "Tata communications");
        this.f14389a.put(".cdn.telefonica.com", "Telefonica");
        this.f14389a.put(".vo.msecnd.net", "Windows Azure");
        this.f14389a.put(".ay1.b.yahoo.com", "Yahoo");
        this.f14389a.put(".yimg.", "Yahoo");
        this.f14389a.put(".zenedge.net", "Zenedge");
        this.f14389a.put(".b-cdn.net", "BunnyCDN");
        this.f14389a.put(".ksyuncdn.com", "Kingsoft");
        this.f14389a.put(".w.kunlunsl.com", "Alibaba");
        this.f14389a.put(".googleapis.com", "Google");
        this.f14389a.put(".googleadservices.com", "Google");
        this.f14389a.put(".facebook.net", "Facebook");
        this.f14389a.put(".fbcdn.net", "Facebook");
        this.f14389a.put(".cdn.anycast.me", "Anycast");
    }

    public static void a(Context context) {
        if (f14386b == null) {
            c0 c0Var = new c0();
            c0Var.f14389a = new HashMap();
            f14386b = c0Var;
            c0Var.g(context);
        }
    }

    public static h6.d b(int i10, int i11, Context context, String str) {
        a(context);
        h6.d dVarC = c(str);
        int i12 = 0;
        while (true) {
            if (dVarC != null && i10 <= 0) {
                break;
            }
            int i13 = i12 + 1;
            if (i12 >= i11) {
                i12 = i13;
                break;
            }
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
            f14386b.g(context);
            dVarC = c(str);
            i12 = i13;
        }
        if (i12 > 5) {
            de.blinkt.openvpn.core.c.j(String.format(Locale.US, "Used x %d tries to get current version (%d/%d) of the profile", Integer.valueOf(i12), Integer.valueOf(dVarC == null ? -1 : 0), Integer.valueOf(i10)));
        }
        return dVarC;
    }

    public static h6.d c(String str) {
        h6.d dVar = f14388d;
        if (dVar != null && dVar.i().equals(str)) {
            return f14388d;
        }
        c0 c0Var = f14386b;
        if (c0Var == null) {
            return null;
        }
        return (h6.d) c0Var.f14389a.get(str);
    }

    public static synchronized c0 f(Context context) {
        a(context);
        return f14386b;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0439 A[PHI: r11
      0x0439: PHI (r11v11 java.lang.String) = (r11v10 java.lang.String), (r11v13 java.lang.String) binds: [B:93:0x03f2, B:102:0x0436] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0324 A[Catch: Exception -> 0x055b, TryCatch #0 {Exception -> 0x055b, blocks: (B:3:0x0004, B:6:0x002c, B:8:0x0032, B:11:0x0044, B:13:0x004e, B:15:0x0066, B:17:0x0070, B:18:0x007e, B:20:0x008a, B:21:0x00b0, B:22:0x00d6, B:24:0x00e2, B:25:0x0108, B:26:0x012e, B:28:0x013a, B:30:0x0144, B:32:0x0168, B:34:0x0178, B:36:0x0188, B:38:0x01be, B:39:0x01da, B:40:0x01e0, B:42:0x01ec, B:43:0x0212, B:44:0x0237, B:46:0x0243, B:47:0x0268, B:48:0x028c, B:51:0x0297, B:52:0x029d, B:54:0x02a7, B:55:0x02c9, B:58:0x02db, B:60:0x02f7, B:62:0x0313, B:65:0x0320, B:126:0x04e6, B:128:0x04f0, B:130:0x0507, B:132:0x0517, B:134:0x0526, B:136:0x052a, B:138:0x0530, B:140:0x0536, B:142:0x053e, B:143:0x0548, B:145:0x0551, B:144:0x054b, B:146:0x0554, B:66:0x0324, B:68:0x0330, B:71:0x033d, B:73:0x0341, B:76:0x035f, B:78:0x037b, B:81:0x039e, B:83:0x03ae, B:85:0x03c6, B:86:0x03d1, B:89:0x03e5, B:91:0x03eb, B:94:0x03f4, B:96:0x0409, B:97:0x041a, B:99:0x0424, B:101:0x042e, B:105:0x043b, B:106:0x044f, B:108:0x0453, B:110:0x0469, B:113:0x0498, B:116:0x04a6, B:118:0x04ae, B:120:0x04b2, B:122:0x04ba, B:123:0x04c3, B:125:0x04cd, B:111:0x0480, B:79:0x0386), top: B:150:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static h6.d h(byte[] r14) {
        /*
            Method dump skipped, instruction units count: 1373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.c0.h(byte[]):h6.d");
    }

    public static void k(Context context) {
        SharedPreferences.Editor editorEdit = en1.p(context).edit();
        editorEdit.putString("lastConnectedProfile", null);
        editorEdit.apply();
    }

    public String d(String str, Map map) {
        if (map == null) {
            return e(str);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                String str2 = (String) entry.getKey();
                String strReplace = ((List) entry.getValue()).toString().replace("[", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).replace("]", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                if (str2.equalsIgnoreCase("server")) {
                    if (strReplace.toLowerCase().contains("cloudflare")) {
                        return "Cloudflare";
                    }
                    if (strReplace.toLowerCase().contains("amazon") || strReplace.toLowerCase().contains("cloudfront")) {
                        return "Amazon Cloudfront";
                    }
                    if (strReplace.toLowerCase().contains("akamai")) {
                        return "Akamai";
                    }
                }
                if (str2.toLowerCase().contains("x-akamai-request-id")) {
                    return "Akamai";
                }
                if (str2.toLowerCase().contains("powered-by-chinacache")) {
                    return "ChinaCache";
                }
                if (str2.toLowerCase().contains("x-edge-location")) {
                    return "OnApp";
                }
                if (str2.toLowerCase().contains("x-amz-cf-id")) {
                    return "Amazon Cloudfront";
                }
                if (str2.toLowerCase().contains("via") && strReplace.toLowerCase().contains("bitgravity.com")) {
                    return "Bitgravity";
                }
                if (str2.equals("X-CDN-Provider") && strReplace.equals("SkyparkCDN")) {
                    return "Skypark";
                }
                if (str2.equals("X-Ser") && strReplace.startsWith("BC")) {
                    return "BaishanCloud";
                }
            }
        }
        return e(str);
    }

    public String e(String str) {
        if (str == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        for (Map.Entry entry : this.f14389a.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str.contains(str2)) {
                return str3;
            }
        }
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    public void g(Context context) throws Throwable {
        ObjectInputStream objectInputStream;
        this.f14389a = new HashMap();
        ObjectInputStream objectInputStream2 = null;
        Set<String> stringSet = context.getSharedPreferences("VPNList", 4).getStringSet("vpnlist", null);
        if (stringSet == null) {
            stringSet = new HashSet<>();
        }
        stringSet.add("temporary-vpn-profile");
        for (String str : stringSet) {
            try {
                objectInputStream = new ObjectInputStream(context.openFileInput(str + ".vp"));
                try {
                    try {
                        h6.d dVar = (h6.d) objectInputStream.readObject();
                        if (dVar != null && dVar.f14124b != null && dVar.f14141o0 != null) {
                            dVar.l();
                            if (str.equals("temporary-vpn-profile")) {
                                f14388d = dVar;
                            } else {
                                this.f14389a.put(dVar.f14141o0.toString(), dVar);
                            }
                        }
                    } catch (IOException | ClassNotFoundException unused) {
                        if (!str.equals("temporary-vpn-profile")) {
                            LinkedList linkedList = de.blinkt.openvpn.core.c.f12574a;
                        }
                        if (objectInputStream != null) {
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    objectInputStream2 = objectInputStream;
                    if (objectInputStream2 != null) {
                        try {
                            objectInputStream2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (IOException | ClassNotFoundException unused3) {
                objectInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                objectInputStream.close();
            } catch (IOException unused4) {
            }
        }
    }

    public void i(HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                this.f14389a.put(str, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.f14389a.put(str, value);
                } else {
                    int i10 = 0;
                    if (cls == boolean[].class) {
                        HashMap map2 = this.f14389a;
                        boolean[] zArr = (boolean[]) value;
                        c2.f fVar = c2.f.f1526b;
                        Boolean[] boolArr = new Boolean[zArr.length];
                        while (i10 < zArr.length) {
                            boolArr[i10] = Boolean.valueOf(zArr[i10]);
                            i10++;
                        }
                        map2.put(str, boolArr);
                    } else if (cls == byte[].class) {
                        HashMap map3 = this.f14389a;
                        byte[] bArr = (byte[]) value;
                        c2.f fVar2 = c2.f.f1526b;
                        Byte[] bArr2 = new Byte[bArr.length];
                        while (i10 < bArr.length) {
                            bArr2[i10] = Byte.valueOf(bArr[i10]);
                            i10++;
                        }
                        map3.put(str, bArr2);
                    } else if (cls == int[].class) {
                        HashMap map4 = this.f14389a;
                        int[] iArr = (int[]) value;
                        c2.f fVar3 = c2.f.f1526b;
                        Integer[] numArr = new Integer[iArr.length];
                        while (i10 < iArr.length) {
                            numArr[i10] = Integer.valueOf(iArr[i10]);
                            i10++;
                        }
                        map4.put(str, numArr);
                    } else if (cls == long[].class) {
                        HashMap map5 = this.f14389a;
                        long[] jArr = (long[]) value;
                        c2.f fVar4 = c2.f.f1526b;
                        Long[] lArr = new Long[jArr.length];
                        while (i10 < jArr.length) {
                            lArr[i10] = Long.valueOf(jArr[i10]);
                            i10++;
                        }
                        map5.put(str, lArr);
                    } else if (cls == float[].class) {
                        HashMap map6 = this.f14389a;
                        float[] fArr = (float[]) value;
                        c2.f fVar5 = c2.f.f1526b;
                        Float[] fArr2 = new Float[fArr.length];
                        while (i10 < fArr.length) {
                            fArr2[i10] = Float.valueOf(fArr[i10]);
                            i10++;
                        }
                        map6.put(str, fArr2);
                    } else {
                        if (cls != double[].class) {
                            throw new IllegalArgumentException(String.format("Key %s has invalid type %s", str, cls));
                        }
                        HashMap map7 = this.f14389a;
                        double[] dArr = (double[]) value;
                        c2.f fVar6 = c2.f.f1526b;
                        Double[] dArr2 = new Double[dArr.length];
                        while (i10 < dArr.length) {
                            dArr2[i10] = Double.valueOf(dArr[i10]);
                            i10++;
                        }
                        map7.put(str, dArr2);
                    }
                }
            }
        }
    }

    public void j(androidx.fragment.app.w wVar, h6.d dVar) {
        String string = dVar.f14141o0.toString();
        this.f14389a.remove(string);
        SharedPreferences sharedPreferences = wVar.getSharedPreferences("VPNList", 4);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putStringSet("vpnlist", this.f14389a.keySet());
        editorEdit.putInt("counter", sharedPreferences.getInt("counter", 0) + 1);
        editorEdit.apply();
        wVar.deleteFile(string + ".vp");
        if (f14387c == dVar) {
            f14387c = null;
        }
    }
}
