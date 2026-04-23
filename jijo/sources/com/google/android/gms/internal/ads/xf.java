package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class xf extends yf {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10545e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xf(String str, Object obj, Object obj2, int i10) {
        super(1, str, obj, obj2);
        this.f10545e = i10;
    }

    @Override // com.google.android.gms.internal.ads.yf
    public final Object a(JSONObject jSONObject) {
        int i10 = this.f10545e;
        String str = this.f10865b;
        switch (i10) {
            case 0:
                return Boolean.valueOf(jSONObject.optBoolean(str, ((Boolean) g()).booleanValue()));
            case 1:
                return Integer.valueOf(jSONObject.optInt(str, ((Integer) g()).intValue()));
            case 2:
                return Long.valueOf(jSONObject.optLong(str, ((Long) g()).longValue()));
            case 3:
                return Float.valueOf((float) jSONObject.optDouble(str, ((Float) g()).floatValue()));
            default:
                return jSONObject.optString(str, (String) g());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf(int i10, String str, Boolean bool, Boolean bool2) {
        super(i10, str, bool, bool2);
        this.f10545e = 0;
    }
}
