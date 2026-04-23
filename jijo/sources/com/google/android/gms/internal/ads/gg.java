package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class gg {
    public static final void a(jt jtVar, xq xqVar) {
        File externalStorageDirectory;
        if (((Context) xqVar.f10630b) == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty((String) xqVar.f10632f)) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        Context context = (Context) xqVar.f10630b;
        String str = (String) xqVar.f10632f;
        String str2 = (String) xqVar.f10633h;
        Map map = (Map) xqVar.f10631d;
        jtVar.f6076e = context;
        jtVar.f6077f = str;
        jtVar.f6075d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        jtVar.f6079h = atomicBoolean;
        atomicBoolean.set(((Boolean) gh.f4917c.k()).booleanValue());
        if (((AtomicBoolean) jtVar.f6079h).get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            int i10 = bw0.f3121a;
            jtVar.f6080i = new File(new File(externalStorageDirectory, "sdk_csi_data.txt").getPath());
        }
        for (Map.Entry entry : map.entrySet()) {
            ((LinkedHashMap) jtVar.f6073b).put((String) entry.getKey(), (String) entry.getValue());
        }
        nu.f7383a.execute(new s9(8, jtVar));
        Map map2 = (Map) jtVar.f6074c;
        hg hgVar = ig.f5588b;
        map2.put("action", hgVar);
        ((Map) jtVar.f6074c).put("ad_format", hgVar);
        ((Map) jtVar.f6074c).put("e", ig.f5589c);
    }
}
