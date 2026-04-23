package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class lg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList f6603a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f6604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6605c;

    public lg(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f6604b = linkedHashMap;
        this.f6605c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str);
    }

    public static final jg d() {
        ((y3.b) zzu.zzB()).getClass();
        return new jg(SystemClock.elapsedRealtime(), null, null);
    }

    public final kg a() {
        kg kgVar;
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.G1)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.f6605c) {
            try {
                for (jg jgVar : this.f6603a) {
                    long j10 = jgVar.f5934a;
                    String str = jgVar.f5935b;
                    jg jgVar2 = jgVar.f5936c;
                    if (jgVar2 != null && j10 > 0) {
                        long j11 = j10 - jgVar2.f5934a;
                        sb.append(str);
                        sb.append('.');
                        sb.append(j11);
                        sb.append(',');
                        if (zBooleanValue) {
                            if (map.containsKey(Long.valueOf(jgVar2.f5934a))) {
                                StringBuilder sb2 = (StringBuilder) map.get(Long.valueOf(jgVar2.f5934a));
                                sb2.append('+');
                                sb2.append(str);
                            } else {
                                map.put(Long.valueOf(jgVar2.f5934a), new StringBuilder(str));
                            }
                        }
                    }
                }
                this.f6603a.clear();
                String string = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (zBooleanValue) {
                    for (Map.Entry entry : map.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        long jLongValue = ((Long) entry.getKey()).longValue();
                        ((y3.b) zzu.zzB()).getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        ((y3.b) zzu.zzB()).getClass();
                        sb3.append(jCurrentTimeMillis + (jLongValue - SystemClock.elapsedRealtime()));
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    string = sb3.toString();
                }
                kgVar = new kg(0, sb.toString(), string);
            } catch (Throwable th) {
                throw th;
            }
        }
        return kgVar;
    }

    public final void b(String str, String str2) {
        jt jtVarC;
        if (TextUtils.isEmpty(str2) || (jtVarC = zzu.zzo().c()) == null) {
            return;
        }
        synchronized (this.f6605c) {
            ig igVar = (ig) ((Map) jtVarC.f6074c).get(str);
            if (igVar == null) {
                igVar = ig.f5587a;
            }
            LinkedHashMap linkedHashMap = this.f6604b;
            linkedHashMap.put(str, igVar.a((String) linkedHashMap.get(str), str2));
        }
    }

    public final void c(jg jgVar, long j10, String... strArr) {
        synchronized (this.f6605c) {
            this.f6603a.add(new jg(j10, strArr[0], jgVar));
        }
    }
}
