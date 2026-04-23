package d4;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class d implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f12356a;

    public d(IBinder iBinder) {
        this.f12356a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f12356a;
    }
}
