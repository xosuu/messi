package z7;

import java.util.Collections;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public final class e extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x7.e f20738a;

    public e(x7.e eVar, LinkedList linkedList) {
        this.f20738a = eVar;
        Collections.unmodifiableList(linkedList);
    }

    @Override // z7.h
    public final String a() {
        StringBuilder sb = new StringBuilder("No currently active signatures were attached to answer on question for ");
        x7.e eVar = this.f20738a;
        sb.append(eVar.f18553b);
        sb.append(" at ");
        sb.append((Object) eVar.f18552a);
        return sb.toString();
    }
}
