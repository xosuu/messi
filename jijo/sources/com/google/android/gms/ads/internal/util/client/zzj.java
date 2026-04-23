package com.google.android.gms.ads.internal.util.client;

import android.util.JsonWriter;
import java.io.IOException;
import java.util.Map;
import m3.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzj implements b {
    public final /* synthetic */ int zza;
    public final /* synthetic */ Map zzb;

    public /* synthetic */ zzj(int i10, Map map) {
        this.zza = i10;
        this.zzb = map;
    }

    @Override // m3.b
    public final void zza(JsonWriter jsonWriter) throws IOException {
        int i10 = this.zza;
        Map map = this.zzb;
        Object obj = zzl.f2105b;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i10);
        jsonWriter.endObject();
        zzl.b(jsonWriter, map);
        jsonWriter.endObject();
    }
}
