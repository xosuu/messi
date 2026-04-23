package u5;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k6.e;
import k6.f;
import k6.h;
import k6.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f17645d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k6.a f17646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f17647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17648c;

    static {
        HashMap map = new HashMap();
        map.put("\\\\d", "[0-9]");
        map.put("\\\\D", "[^0-9]");
        map.put("\\\\s", "[ \t\n\f\r]");
        map.put("\\\\S", "[^ \t\n\f\r]");
        map.put("\\\\w", "[a-zA-Z_0-9]");
        map.put("\\\\W", "[^a-zA-Z_0-9]");
        f17645d = Collections.unmodifiableMap(map);
    }

    public a(String str) {
        new Random();
        this.f17647b = new ArrayList();
        this.f17648c = 0;
        Pattern patternCompile = Pattern.compile("\\\\Q(.*?)\\\\E");
        Pattern patternCompile2 = Pattern.compile("[.^$*+?(){|\\[\\\\@]");
        StringBuilder sb = new StringBuilder(str);
        Matcher matcher = patternCompile.matcher(sb);
        while (matcher.find()) {
            sb.replace(matcher.start(), matcher.end(), patternCompile2.matcher(matcher.group(1)).replaceAll("\\\\$0"));
        }
        this.f17646a = a(sb.toString()).m();
    }

    public static e a(String str) {
        e eVar;
        for (Map.Entry entry : f17645d.entrySet()) {
            str = str.replaceAll((String) entry.getKey(), (String) entry.getValue());
        }
        e eVar2 = new e();
        eVar2.f14712k = str;
        eVar2.f14713l = 65535;
        if (str.length() == 0) {
            eVar = new e();
            eVar.f14702a = 13;
            eVar.f14705d = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        } else {
            e eVarK = eVar2.k();
            if (eVar2.f14714m < str.length()) {
                throw new IllegalArgumentException("end-of-string expected at position " + eVar2.f14714m);
            }
            eVar = eVarK;
        }
        eVar2.f14702a = eVar.f14702a;
        eVar2.f14703b = eVar.f14703b;
        eVar2.f14704c = eVar.f14704c;
        eVar2.f14705d = eVar.f14705d;
        eVar2.f14706e = eVar.f14706e;
        eVar2.f14707f = eVar.f14707f;
        eVar2.f14708g = eVar.f14708g;
        eVar2.f14709h = eVar.f14709h;
        eVar2.f14710i = eVar.f14710i;
        eVar2.f14711j = eVar.f14711j;
        eVar2.f14712k = null;
        return eVar2;
    }

    public static boolean d(String str) {
        try {
            a(str);
            return true;
        } catch (IllegalArgumentException | StackOverflowError unused) {
            return false;
        }
    }

    public final void b(String str, f fVar) {
        int i10 = this.f17648c;
        if (i10 == Integer.MAX_VALUE) {
            return;
        }
        this.f17648c = i10 + 1;
        Set set = fVar.f14717b;
        h[] hVarArr = (h[]) set.toArray(new h[set.size()]);
        i iVar = new i();
        iVar.f14726a = true;
        Arrays.sort(hVarArr, iVar);
        List<h> listAsList = Arrays.asList(hVarArr);
        if (listAsList.size() == 0) {
            this.f17647b.add(str);
            return;
        }
        if (fVar.f14716a) {
            this.f17647b.add(str);
        }
        for (h hVar : listAsList) {
            for (char c10 = hVar.f14723a; c10 <= hVar.f14724b; c10 = (char) (c10 + 1)) {
                b(str + c10, hVar.f14725d);
            }
        }
    }

    public final List c() {
        this.f17647b = new ArrayList();
        k6.a aVar = this.f17646a;
        aVar.d();
        b(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, aVar.f14689a);
        return this.f17647b;
    }
}
