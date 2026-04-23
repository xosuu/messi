package s;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b extends k implements Map {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a f16585t;

    public b(int i10) {
        if (i10 == 0) {
            this.f16624a = d.f16596a;
            this.f16625b = d.f16597b;
        } else {
            a(i10);
        }
        this.f16626d = 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        int i10 = 0;
        if (this.f16585t == null) {
            this.f16585t = new a(0, this);
        }
        a aVar = this.f16585t;
        if (((h) aVar.f14501a) == null) {
            aVar.f14501a = new h(aVar, i10);
        }
        return (h) aVar.f14501a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f16585t == null) {
            this.f16585t = new a(0, this);
        }
        a aVar = this.f16585t;
        if (((h) aVar.f14502b) == null) {
            aVar.f14502b = new h(aVar, 1);
        }
        return (h) aVar.f14502b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f16626d);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f16585t == null) {
            this.f16585t = new a(0, this);
        }
        a aVar = this.f16585t;
        if (aVar.f14503c == null) {
            aVar.f14503c = new j(aVar);
        }
        return aVar.f14503c;
    }
}
