package com.google.android.gms.ads.internal.util.client;

import com.google.android.gms.ads.internal.client.zzay;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class zzr implements zze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2111a;

    public zzr() {
        throw null;
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.google.android.gms.ads.internal.util.client.zze
    public final boolean zza(String str) {
        boolean z9 = false;
        try {
            zzm.zze("Pinging URL: " + str);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                zzay.zzb();
                String str2 = this.f2111a;
                httpURLConnection.setConnectTimeout(DateTimeConstants.MILLIS_PER_MINUTE);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setReadTimeout(DateTimeConstants.MILLIS_PER_MINUTE);
                if (str2 != null) {
                    httpURLConnection.setRequestProperty("User-Agent", str2);
                }
                httpURLConnection.setUseCaches(false);
                zzl zzlVar = new zzl(null);
                zzlVar.zzc(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                zzlVar.zze(httpURLConnection, responseCode);
                if (responseCode < 200 || responseCode >= 300) {
                    zzm.zzj("Received non-success response code " + responseCode + " from pinging URL: " + str);
                } else {
                    z9 = true;
                }
                httpURLConnection.disconnect();
            } catch (Throwable th) {
                httpURLConnection.disconnect();
                throw th;
            }
        } catch (IOException e10) {
            e = e10;
            zzm.zzj("Error while pinging URL: " + str + ". " + e.getMessage());
        } catch (IndexOutOfBoundsException e11) {
            zzm.zzj("Error while parsing ping URL: " + str + ". " + e11.getMessage());
        } catch (RuntimeException e12) {
            e = e12;
            zzm.zzj("Error while pinging URL: " + str + ". " + e.getMessage());
        } finally {
        }
        return z9;
    }

    public zzr(String str) {
        this.f2111a = str;
    }
}
