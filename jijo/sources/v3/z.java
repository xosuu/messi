package v3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Uri f17804d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17807c;

    public z(String str, String str2, boolean z9) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        this.f17805a = str;
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        this.f17806b = str2;
        this.f17807c = z9;
    }

    public final Intent a(Context context) {
        Bundle bundleCall;
        String str = this.f17805a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.f17807c) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", str);
            try {
                bundleCall = context.getContentResolver().call(f17804d, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e10) {
                "Dynamic intent resolution failed: ".concat(e10.toString());
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str));
            }
        }
        return intent == null ? new Intent(str).setPackage(this.f17806b) : intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return b7.u.i(this.f17805a, zVar.f17805a) && b7.u.i(this.f17806b, zVar.f17806b) && b7.u.i(null, null) && this.f17807c == zVar.f17807c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17805a, this.f17806b, null, 4225, Boolean.valueOf(this.f17807c)});
    }

    public final String toString() {
        String str = this.f17805a;
        if (str != null) {
            return str;
        }
        z3.a.l(null);
        throw null;
    }
}
