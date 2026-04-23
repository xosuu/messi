package a2;

import com.google.android.gms.internal.consent_sdk.zzg;
import f0.d;
import g4.b1;
import g4.f0;
import g4.m;
import g4.u0;
import g4.x;
import g4.y;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import k.q;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f7b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f8c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Serializable f9d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6a = 0;

    public b(String str, q[] qVarArr) {
        this.f8c = str;
        this.f7b = qVarArr;
    }

    public final d a() {
        String str;
        String str2;
        y yVar = (y) this.f8c;
        int i10 = yVar.f13817a;
        boolean z9 = i10 == 8;
        b1 b1Var = (b1) this.f7b;
        b1Var.f13694c.f13721b.edit().putBoolean("is_pub_misconfigured", z9).apply();
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        switch (i11) {
            case 1:
            case 2:
            case 3:
                this.f6a = 3;
                break;
            case 4:
                this.f6a = 2;
                break;
            case 5:
                this.f6a = 1;
                break;
            case 6:
                throw new zzg(1, "Invalid response from server: ".concat(String.valueOf((String) yVar.f13821e)));
            case 7:
                throw new zzg(3, "Publisher misconfiguration: ".concat(String.valueOf((String) yVar.f13821e)));
            default:
                throw new zzg(1, "Invalid response from server.");
        }
        int i12 = yVar.f13818b;
        int i13 = i12 - 1;
        if (i12 == 0) {
            throw null;
        }
        if (i13 == 1) {
            this.f9d = l5.d.f15216d;
        } else {
            if (i13 != 2) {
                throw new zzg(1, "Invalid response from server.");
            }
            this.f9d = l5.d.f15215b;
        }
        String str3 = yVar.f13819c;
        m mVar = str3 == null ? null : new m((String) yVar.f13820d, str3);
        b1Var.f13694c.f13721b.edit().putStringSet("stored_info", new HashSet((List) yVar.f13822f)).apply();
        for (x xVar : (List) yVar.f13823g) {
            int i14 = xVar.f13814b;
            int i15 = i14 - 1;
            if (i14 == 0) {
                throw null;
            }
            if (i15 == 0) {
                str = null;
            } else {
                if (i15 != 1) {
                    str2 = i15 == 2 ? "clear" : "write";
                    str = null;
                }
                str = str2;
            }
            if (str != null) {
                u0 u0Var = b1Var.f13692a;
                String str4 = xVar.f13813a;
                f0[] f0VarArr = {b1Var.f13693b};
                u0Var.getClass();
                u0Var.f13800a.execute(new l0.a(str, str4, f0VarArr, 26, 0));
            }
        }
        return new d(this.f6a, (l5.d) this.f9d, mVar);
    }
}
