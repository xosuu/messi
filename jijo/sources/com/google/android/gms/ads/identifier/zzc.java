package com.google.android.gms.ads.identifier;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class zzc {
    public static final void zza(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    new StringBuilder(String.valueOf(str).length() + 65);
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException e10) {
            e = e10;
            new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(e.getMessage()).length());
        } catch (IndexOutOfBoundsException e11) {
            new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(e11.getMessage()).length());
        } catch (RuntimeException e12) {
            e = e12;
            new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(e.getMessage()).length());
        } catch (Throwable th) {
            throw th;
        }
    }
}
