package h4;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class b extends f4.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f13950b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13951d;

    public b() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver", 1);
        this.f13950b = new AtomicReference();
    }

    public static final Object u1(Class cls, Bundle bundle) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e10) {
            String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName());
            throw e10;
        }
    }

    public final void a0(Bundle bundle) {
        synchronized (this.f13950b) {
            try {
                try {
                    this.f13950b.set(bundle);
                    this.f13951d = true;
                } finally {
                    this.f13950b.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // f4.a
    public final boolean m(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        int i11 = a.f13949a;
        Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            a0(bundle);
            parcel2.writeNoException();
            return true;
        }
        StringBuilder sb = new StringBuilder(56);
        sb.append("Parcel data not fully consumed, unread size: ");
        sb.append(iDataAvail);
        throw new BadParcelableException(sb.toString());
    }

    public final Bundle t(long j10) {
        Bundle bundle;
        synchronized (this.f13950b) {
            if (!this.f13951d) {
                try {
                    this.f13950b.wait(j10);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f13950b.get();
        }
        return bundle;
    }
}
