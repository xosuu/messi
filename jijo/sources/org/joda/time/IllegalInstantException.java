package org.joda.time;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.fb1;
import org.joda.time.format.DateTimeFormat;

/* JADX INFO: loaded from: classes.dex */
public class IllegalInstantException extends IllegalArgumentException {
    private static final long serialVersionUID = 2858712538216L;

    public IllegalInstantException(String str) {
        super(str);
    }

    private static String createMessage(long j10, String str) {
        return fb1.i("Illegal instant due to time zone offset transition (daylight savings time 'gap'): ", DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").print(new Instant(j10)), str != null ? fb1.i(" (", str, ")") : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }

    public static boolean isIllegalInstant(Throwable th) {
        if (th instanceof IllegalInstantException) {
            return true;
        }
        if (th.getCause() == null || th.getCause() == th) {
            return false;
        }
        return isIllegalInstant(th.getCause());
    }

    public IllegalInstantException(long j10, String str) {
        super(createMessage(j10, str));
    }
}
