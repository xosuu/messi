package kotlinx.coroutines;

import b7.n0;
import g4.a0;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class JobCancellationException extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient n0 f14761a;

    public JobCancellationException(String str, Throwable th, n0 n0Var) {
        super(str);
        this.f14761a = n0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!a0.b(jobCancellationException.getMessage(), getMessage()) || !a0.b(jobCancellationException.f14761a, this.f14761a) || !a0.b(jobCancellationException.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        a0.c(message);
        int iHashCode = (this.f14761a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f14761a;
    }
}
