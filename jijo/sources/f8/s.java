package f8;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f13463d;

    public s(List list) {
        this.f13463d = Collections.unmodifiableList(list);
    }

    @Override // f8.h
    public final void a(DataOutputStream dataOutputStream) throws IOException {
        for (c8.d dVar : this.f13463d) {
            dataOutputStream.writeShort(dVar.f1597a);
            dataOutputStream.writeShort(dVar.f1598b);
            dataOutputStream.write(dVar.f1599c);
        }
    }
}
