package kotlinx.coroutines.internal;

import n6.j;

/* JADX INFO: loaded from: classes.dex */
public final class DiagnosticCoroutineContextException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient j f14762a;

    public DiagnosticCoroutineContextException(j jVar) {
        this.f14762a = jVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f14762a.toString();
    }
}
