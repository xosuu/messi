package com.google.android.gms.ads.internal.util.client;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import m3.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f2106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f2107d;
    public static final /* synthetic */ int zza = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f2105b = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashSet f2108e = new HashSet(Arrays.asList(new String[0]));

    public zzl() {
        throw null;
    }

    public static void b(JsonWriter jsonWriter, Map map) {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!f2108e.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        zzm.zzg("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    public static void zzi() {
        synchronized (f2105b) {
            f2106c = false;
            f2107d = false;
            zzm.zzj("Ad debug logging enablement is out of date.");
        }
    }

    public static void zzj(boolean z9) {
        synchronized (f2105b) {
            f2106c = true;
            f2107d = z9;
        }
    }

    public static boolean zzk() {
        boolean z9;
        synchronized (f2105b) {
            try {
                z9 = false;
                if (f2106c && f2107d) {
                    z9 = true;
                }
            } finally {
            }
        }
        return z9;
    }

    public static boolean zzl() {
        boolean z9;
        synchronized (f2105b) {
            z9 = f2106c;
        }
        return z9;
    }

    public final void a(String str, b bVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(System.currentTimeMillis());
            jsonWriter.name(NotificationCompat.CATEGORY_EVENT).value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.f2109a.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            bVar.zza(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e10) {
            zzm.zzh("unable to log", e10);
        }
        String string = stringWriter.toString();
        synchronized (zzl.class) {
            try {
                zzm.zzi("GMA Debug BEGIN");
                int i10 = 0;
                while (i10 < string.length()) {
                    int i11 = i10 + 4000;
                    zzm.zzi("GMA Debug CONTENT ".concat(String.valueOf(string.substring(i10, Math.min(i11, string.length())))));
                    i10 = i11;
                }
                zzm.zzi("GMA Debug FINISH");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (zzk()) {
            a("onNetworkRequest", new zzg(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr));
        }
    }

    public final void zzd(String str, String str2, Map map, byte[] bArr) {
        if (zzk()) {
            a("onNetworkRequest", new zzg(str, "GET", map, bArr));
        }
    }

    public final void zze(HttpURLConnection httpURLConnection, int i10) {
        if (zzk()) {
            String responseMessage = null;
            a("onNetworkResponse", new zzj(i10, httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields())));
            if (i10 < 200 || i10 >= 300) {
                try {
                    responseMessage = httpURLConnection.getResponseMessage();
                } catch (IOException e10) {
                    zzm.zzj("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e10.getMessage())));
                }
                a("onNetworkRequestError", new zzi(responseMessage));
            }
        }
    }

    public final void zzf(Map map, int i10) {
        if (zzk()) {
            a("onNetworkResponse", new zzj(i10, map));
            if (i10 < 200 || i10 >= 300) {
                a("onNetworkRequestError", new zzi(null));
            }
        }
    }

    public final void zzg(String str) {
        if (zzk() && str != null) {
            zzh(str.getBytes());
        }
    }

    public final void zzh(final byte[] bArr) {
        a("onNetworkResponseBody", new b() { // from class: com.google.android.gms.ads.internal.util.client.zzh
            @Override // m3.b
            public final void zza(JsonWriter jsonWriter) throws IOException {
                Object obj = zzl.f2105b;
                jsonWriter.name("params").beginObject();
                byte[] bArr2 = bArr;
                int length = bArr2.length;
                String strEncodeToString = Base64.encodeToString(bArr2, 0);
                if (length < 10000) {
                    jsonWriter.name("body").value(strEncodeToString);
                } else {
                    String strZzf = zzf.zzf(strEncodeToString);
                    if (strZzf != null) {
                        jsonWriter.name("bodydigest").value(strZzf);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }

    public zzl(String str) {
        this.f2109a = !zzk() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }
}
