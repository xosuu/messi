package k0;

import android.os.OutcomeReceiver;
import com.google.android.gms.internal.ads.en1;
import g4.a0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n6.e f14629a;

    public d(b7.d dVar) {
        super(false);
        this.f14629a = dVar;
    }

    @Override // android.os.OutcomeReceiver
    public final void onError(Throwable th) {
        a0.f(th, "error");
        if (compareAndSet(false, true)) {
            this.f14629a.d(en1.m(th));
        }
    }

    @Override // android.os.OutcomeReceiver
    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f14629a.d(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
