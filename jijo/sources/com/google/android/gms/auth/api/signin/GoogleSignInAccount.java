package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g4.d0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2456b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2457d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2458f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f2459h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Uri f2460q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f2461s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f2462t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f2463u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f2464v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f2465w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f2466x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final HashSet f2467y = new HashSet();

    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, ArrayList arrayList, String str7, String str8) {
        this.f2455a = i10;
        this.f2456b = str;
        this.f2457d = str2;
        this.f2458f = str3;
        this.f2459h = str4;
        this.f2460q = uri;
        this.f2461s = str5;
        this.f2462t = j10;
        this.f2463u = str6;
        this.f2464v = arrayList;
        this.f2465w = str7;
        this.f2466x = str8;
    }

    public static GoogleSignInAccount b(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j10 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(1, jSONArray.getString(i10)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has(NotificationCompat.CATEGORY_EMAIL) ? jSONObject.optString(NotificationCompat.CATEGORY_EMAIL) : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        Long lValueOf = Long.valueOf(j10);
        String string = jSONObject.getString("obfuscatedIdentifier");
        long jLongValue = lValueOf.longValue();
        if (TextUtils.isEmpty(string)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, jLongValue, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f2461s = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (googleSignInAccount.f2463u.equals(this.f2463u)) {
            HashSet hashSet = new HashSet(googleSignInAccount.f2464v);
            hashSet.addAll(googleSignInAccount.f2467y);
            HashSet hashSet2 = new HashSet(this.f2464v);
            hashSet2.addAll(this.f2467y);
            if (hashSet.equals(hashSet2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f2463u.hashCode() + 527) * 31;
        HashSet hashSet = new HashSet(this.f2464v);
        hashSet.addAll(this.f2467y);
        return hashSet.hashCode() + iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = d0.t(parcel, 20293);
        d0.v(parcel, 1, 4);
        parcel.writeInt(this.f2455a);
        d0.o(parcel, 2, this.f2456b);
        d0.o(parcel, 3, this.f2457d);
        d0.o(parcel, 4, this.f2458f);
        d0.o(parcel, 5, this.f2459h);
        d0.n(parcel, 6, this.f2460q, i10);
        d0.o(parcel, 7, this.f2461s);
        d0.v(parcel, 8, 8);
        parcel.writeLong(this.f2462t);
        d0.o(parcel, 9, this.f2463u);
        d0.s(parcel, 10, this.f2464v);
        d0.o(parcel, 11, this.f2465w);
        d0.o(parcel, 12, this.f2466x);
        d0.u(parcel, iT);
    }
}
