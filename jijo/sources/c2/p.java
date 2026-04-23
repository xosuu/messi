package c2;

import androidx.work.OverwritingInputMerger;
import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class p extends x {
    public p(Class cls) {
        this.f1556c = new HashSet();
        this.f1554a = UUID.randomUUID();
        this.f1555b = new l2.j(this.f1554a.toString(), cls.getName());
        this.f1556c.add(cls.getName());
        this.f1555b.f15145d = OverwritingInputMerger.class.getName();
    }
}
