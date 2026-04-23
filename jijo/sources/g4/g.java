package g4;

import android.app.Application;
import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k0 f13719d = k0.g(4, "IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f13720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f13721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f13722c;

    public g(Application application) {
        this.f13720a = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.f13721b = sharedPreferences;
        this.f13722c = new HashSet(sharedPreferences.getStringSet("written_values", Collections.emptySet()));
    }

    public final HashMap a() {
        String string;
        Set<String> stringSet = this.f13721b.getStringSet("stored_info", n0.f13761u);
        if (stringSet.isEmpty()) {
            stringSet = f13719d;
        }
        HashMap map = new HashMap();
        for (String str : stringSet) {
            Application application = this.f13720a;
            f.f fVarE = a0.E(application, str);
            if (fVarE == null) {
                "Fetching request info: failed for key: ".concat(String.valueOf(str));
            } else {
                Object obj = application.getSharedPreferences((String) fVarE.f12832b, 0).getAll().get((String) fVarE.f12833d);
                if (obj == null) {
                    "Stored info not exists: ".concat(String.valueOf(str));
                } else {
                    if (obj instanceof Boolean) {
                        string = true != ((Boolean) obj).booleanValue() ? "0" : "1";
                    } else if (obj instanceof Number) {
                        string = obj.toString();
                    } else if (obj instanceof String) {
                        string = (String) obj;
                    } else {
                        "Failed to fetch stored info: ".concat(String.valueOf(str));
                    }
                    map.put(str, string);
                }
            }
        }
        return map;
    }
}
