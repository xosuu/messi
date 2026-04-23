package com.google.android.gms.ads.internal.util.client;

import android.util.JsonWriter;
import java.io.IOException;
import m3.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzi implements b {
    public final /* synthetic */ String zza;

    @Override // m3.b
    public final void zza(JsonWriter jsonWriter) throws IOException {
        Object obj = zzl.f2105b;
        jsonWriter.name("params").beginObject();
        String str = this.zza;
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }
}
