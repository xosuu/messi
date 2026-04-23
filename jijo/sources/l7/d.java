package l7;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b[] f15258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f15259b;

    static {
        b bVar = new b(b.f15246i, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        p7.h hVar = b.f15243f;
        p7.h hVar2 = b.f15244g;
        p7.h hVar3 = b.f15245h;
        p7.h hVar4 = b.f15242e;
        b[] bVarArr = {bVar, new b(hVar, "GET"), new b(hVar, "POST"), new b(hVar2, "/"), new b(hVar2, "/index.html"), new b(hVar3, "http"), new b(hVar3, "https"), new b(hVar4, "200"), new b(hVar4, "204"), new b(hVar4, "206"), new b(hVar4, "304"), new b(hVar4, "400"), new b(hVar4, "404"), new b(hVar4, "500"), new b("accept-charset", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("accept-encoding", "gzip, deflate"), new b("accept-language", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("accept-ranges", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("accept", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("access-control-allow-origin", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("age", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("allow", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("authorization", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("cache-control", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("content-disposition", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("content-encoding", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("content-language", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("content-length", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("content-location", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("content-range", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("content-type", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("cookie", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("date", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("etag", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("expect", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("expires", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("from", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("host", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("if-match", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("if-modified-since", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("if-none-match", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("if-range", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("if-unmodified-since", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("last-modified", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("link", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("location", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("max-forwards", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("proxy-authenticate", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("proxy-authorization", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("range", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("referer", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("refresh", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("retry-after", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("server", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("set-cookie", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("strict-transport-security", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("transfer-encoding", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("user-agent", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("vary", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("via", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new b("www-authenticate", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)};
        f15258a = bVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(bVarArr.length);
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            if (!linkedHashMap.containsKey(bVarArr[i10].f15247a)) {
                linkedHashMap.put(bVarArr[i10].f15247a, Integer.valueOf(i10));
            }
        }
        f15259b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void a(p7.h hVar) throws IOException {
        int size = hVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            byte bH = hVar.h(i10);
            if (bH >= 65 && bH <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + hVar.o());
            }
        }
    }
}
