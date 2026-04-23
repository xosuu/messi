package d8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;
import org.minidns.MiniDnsException;
import org.minidns.hla.ResolutionUnsuccessfulException;
import x7.d;
import x7.e;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f12520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x7.c f12521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f12522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f12524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f12525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ResolutionUnsuccessfulException f12526g;

    public c(e eVar, y7.b bVar, Set set) throws MiniDnsException.NullResultException {
        if (bVar == null) {
            Logger logger = d.f18529w;
            x7.a aVar = new x7.a();
            aVar.f18506b = x7.b.QUERY;
            aVar.f18507c = x7.c.NO_ERROR;
            aVar.f18515k = -1L;
            ArrayList arrayList = new ArrayList(1);
            aVar.f18516l = arrayList;
            arrayList.add(eVar);
            new d(aVar);
            throw new MiniDnsException.NullResultException("The request yielded a 'null' result while resolving.");
        }
        this.f12520a = eVar;
        d dVar = bVar.f20468a;
        this.f12521b = dVar.f18532c;
        this.f12525f = dVar;
        HashSet hashSetC = dVar.c(eVar);
        if (hashSetC == null) {
            this.f12522c = Collections.emptySet();
        } else {
            this.f12522c = Collections.unmodifiableSet(hashSetC);
        }
        if (set == null) {
            this.f12524e = null;
            this.f12523d = false;
        } else {
            Set setUnmodifiableSet = Collections.unmodifiableSet(set);
            this.f12524e = setUnmodifiableSet;
            this.f12523d = setUnmodifiableSet.isEmpty();
        }
    }

    public final Set a() {
        ResolutionUnsuccessfulException resolutionUnsuccessfulException;
        x7.c cVar = x7.c.NO_ERROR;
        x7.c cVar2 = this.f12521b;
        if (cVar2 == cVar) {
            resolutionUnsuccessfulException = null;
        } else {
            if (this.f12526g == null) {
                this.f12526g = new ResolutionUnsuccessfulException("Asking for " + this.f12520a + " yielded an error response " + cVar2);
            }
            resolutionUnsuccessfulException = this.f12526g;
        }
        if (resolutionUnsuccessfulException == null) {
            return this.f12522c;
        }
        throw new IllegalStateException("Can not perform operation because the DNS resolution was unsuccessful", resolutionUnsuccessfulException);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(c.class.getName());
        sb.append("\nQuestion: ");
        sb.append(this.f12520a);
        sb.append("\nResponse Code: ");
        x7.c cVar = this.f12521b;
        sb.append(cVar);
        sb.append('\n');
        if (cVar == x7.c.NO_ERROR) {
            if (this.f12523d) {
                sb.append("Results verified via DNSSEC\n");
            }
            Set set = this.f12524e;
            if (set != null && !set.isEmpty()) {
                sb.append(set);
                sb.append('\n');
            }
            sb.append(this.f12525f.f18541l);
        }
        return sb.toString();
    }
}
