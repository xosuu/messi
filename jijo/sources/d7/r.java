package d7;

import com.google.android.gms.internal.ads.fb1;

/* JADX INFO: loaded from: classes.dex */
public final class r extends u6.e implements t6.p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f12511d = new r(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f12512f = new r(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final r f12513h = new r(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12514b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i10) {
        super(2);
        this.f12514b = i10;
    }

    @Override // t6.p
    public final Object c(Object obj, Object obj2) {
        switch (this.f12514b) {
            case 0:
                return obj;
            case 1:
                fb1.t(obj);
                return null;
            default:
                return (t) obj;
        }
    }
}
