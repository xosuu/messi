package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class av0 extends xu0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2806f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ av0(ok0 ok0Var, HashSet hashSet, JSONObject jSONObject, long j10, int i10) {
        super(ok0Var, hashSet, jSONObject, j10);
        this.f2806f = i10;
    }

    @Override // com.google.android.gms.internal.ads.yu0
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        hu0 hu0Var;
        switch (this.f2806f) {
            case 0:
                b(str);
                super.onPostExecute(str);
                break;
            default:
                if (!TextUtils.isEmpty(str) && (hu0Var = hu0.f5402c) != null) {
                    for (yt0 yt0Var : Collections.unmodifiableCollection(hu0Var.f5403a)) {
                        if (this.f10652c.contains(yt0Var.f11036g)) {
                            qu0 qu0Var = yt0Var.f11033d;
                            if (this.f10654e >= qu0Var.f8279c) {
                                qu0Var.f8280d = 2;
                                en1.g0(qu0Var.a(), "setNativeViewHierarchy", str, qu0Var.f8277a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
        }
    }

    public final void b(String str) {
        hu0 hu0Var = hu0.f5402c;
        if (hu0Var != null) {
            for (yt0 yt0Var : Collections.unmodifiableCollection(hu0Var.f5403a)) {
                if (this.f10652c.contains(yt0Var.f11036g)) {
                    qu0 qu0Var = yt0Var.f11033d;
                    if (this.f10654e >= qu0Var.f8279c && qu0Var.f8280d != 3) {
                        qu0Var.f8280d = 3;
                        en1.g0(qu0Var.a(), "setNativeViewHierarchy", str, qu0Var.f8277a);
                    }
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        int i10 = this.f2806f;
        JSONObject jSONObject = this.f10653d;
        switch (i10) {
            case 0:
                break;
            default:
                ok0 ok0Var = this.f11039b;
                if (!uu0.e(jSONObject, (JSONObject) ok0Var.f7597b)) {
                    ok0Var.f7597b = jSONObject;
                    break;
                }
                break;
        }
        return jSONObject.toString();
    }

    @Override // com.google.android.gms.internal.ads.yu0, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f2806f) {
            case 0:
                String str = (String) obj;
                b(str);
                super.onPostExecute(str);
                break;
            default:
                onPostExecute((String) obj);
                break;
        }
    }
}
