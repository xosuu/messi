package l2;

import n1.p;
import n1.s;

/* JADX INFO: loaded from: classes.dex */
public final class h extends s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15139e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, p pVar, int i10) {
        super(pVar);
        this.f15138d = i10;
        this.f15139e = obj;
    }

    @Override // n1.s
    public final String b() {
        switch (this.f15138d) {
            case 0:
                return "DELETE from WorkProgress where work_spec_id=?";
            case 1:
                return "DELETE FROM WorkProgress";
            default:
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }
}
