package e8;

import com.google.android.gms.internal.ads.ql1;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.minidns.util.MultipleIoException;
import x7.d;
import x7.e;

/* JADX INFO: loaded from: classes.dex */
public class c extends org.minidns.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f12785j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f12786k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12787l;

    public c(ql1 ql1Var) {
        super(ql1Var);
        this.f12787l = 1;
        this.f12785j = new a(this, ql1Var);
        this.f12786k = new b(this, ql1Var);
    }

    @Override // org.minidns.a
    public final boolean c(e eVar, y7.c cVar) {
        return h(cVar.f20468a) == null;
    }

    @Override // org.minidns.a
    public x7.a d(x7.a aVar) {
        return aVar;
    }

    @Override // org.minidns.a
    public final y7.b f(x7.a aVar) throws IOException {
        y7.b bVarF;
        String str;
        String str2;
        LinkedList linkedList = new LinkedList();
        y7.b bVarF2 = null;
        String strH = null;
        if (this.f12787l != 3) {
            try {
                bVarF = this.f12786k.f(aVar);
            } catch (IOException e10) {
                e = e10;
                bVarF = null;
            }
            try {
                strH = h(bVarF.f20468a);
                if (strH == null) {
                    return bVarF;
                }
            } catch (IOException e11) {
                e = e11;
                linkedList.add(e);
            }
            String str3 = strH;
            bVarF2 = bVarF;
            str = str3;
        } else {
            str = null;
        }
        if (this.f12787l == 2) {
            return bVarF2;
        }
        Level level = Level.FINE;
        Logger logger = org.minidns.a.f16122h;
        if (logger.isLoggable(level) && this.f12787l != 3) {
            if (!linkedList.isEmpty()) {
                str2 = "Resolution fall back to iterative mode because: " + linkedList.get(0);
            } else if (bVarF2 == null) {
                str2 = "Resolution fall back to iterative mode because:  DnsClient did not return a response";
            } else {
                if (str == null) {
                    throw new AssertionError("This should never been reached");
                }
                str2 = "Resolution fall back to iterative mode because: " + str + ". Response:\n" + bVarF2;
            }
            logger.log(level, str2);
        }
        try {
            bVarF2 = this.f12785j.f(aVar);
        } catch (IOException e12) {
            linkedList.add(e12);
        }
        if (bVarF2 == null) {
            MultipleIoException.a(linkedList);
        }
        return bVarF2;
    }

    public String h(d dVar) {
        return null;
    }
}
