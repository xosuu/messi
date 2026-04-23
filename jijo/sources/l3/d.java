package l3;

import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.internal.ads.h7;
import com.google.android.gms.internal.ads.i7;
import com.google.android.gms.internal.ads.l7;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Map;
import t3.i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends i7 {
    public final /* synthetic */ byte[] A;
    public final /* synthetic */ Map B;
    public final /* synthetic */ zzl C;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f15181y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final e f15182z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i10, String str, e eVar, f.f fVar, byte[] bArr, Map map, zzl zzlVar) {
        super(i10, str, fVar);
        this.A = bArr;
        this.B = map;
        this.C = zzlVar;
        this.f15181y = new Object();
        this.f15182z = eVar;
    }

    @Override // com.google.android.gms.internal.ads.i7
    public final l7 a(h7 h7Var) {
        String str;
        String str2;
        byte[] bArr = h7Var.f5226b;
        try {
            Map map = h7Var.f5227c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                int i10 = 1;
                while (true) {
                    if (i10 >= strArrSplit.length) {
                        break;
                    }
                    String[] strArrSplit2 = strArrSplit[i10].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                    i10++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(bArr);
        }
        return new l7(str, i.H(h7Var));
    }

    @Override // com.google.android.gms.internal.ads.i7
    public final void d(Object obj) {
        e eVar;
        String str = (String) obj;
        this.C.zzg(str);
        synchronized (this.f15181y) {
            eVar = this.f15182z;
        }
        eVar.b(str);
    }

    @Override // com.google.android.gms.internal.ads.i7
    public final Map zzl() {
        Map map = this.B;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // com.google.android.gms.internal.ads.i7
    public final byte[] zzx() {
        byte[] bArr = this.A;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }
}
