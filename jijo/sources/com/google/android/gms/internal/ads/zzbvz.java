package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class zzbvz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbvz> CREATOR = new ar(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11590b;

    public zzbvz(String str, int i10) {
        this.f11589a = str;
        this.f11590b = i10;
    }

    public static zzbvz b(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzbvz(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbvz)) {
            zzbvz zzbvzVar = (zzbvz) obj;
            if (b7.u.i(this.f11589a, zzbvzVar.f11589a) && b7.u.i(Integer.valueOf(this.f11590b), Integer.valueOf(zzbvzVar.f11590b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11589a, Integer.valueOf(this.f11590b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = g4.d0.t(parcel, 20293);
        g4.d0.o(parcel, 2, this.f11589a);
        g4.d0.v(parcel, 3, 4);
        parcel.writeInt(this.f11590b);
        g4.d0.u(parcel, iT);
    }
}
