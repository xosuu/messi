package com.google.android.gms.ads.internal.util.client;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.util.Map;
import m3.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzg implements b {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ Map zzc;
    public final /* synthetic */ byte[] zzd;

    public /* synthetic */ zzg(String str, String str2, Map map, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = map;
        this.zzd = bArr;
    }

    @Override // m3.b
    public final void zza(JsonWriter jsonWriter) throws IOException {
        String str = this.zza;
        String str2 = this.zzb;
        Map map = this.zzc;
        byte[] bArr = this.zzd;
        Object obj = zzl.f2105b;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        zzl.b(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64.encodeToString(bArr, 0));
        }
        jsonWriter.endObject();
    }
}
