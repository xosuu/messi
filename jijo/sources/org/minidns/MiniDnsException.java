package org.minidns;

import java.io.IOException;
import x7.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class MiniDnsException extends IOException {

    public static class ErrorResponseException extends MiniDnsException {
    }

    public static class IdMismatch extends MiniDnsException {
        public IdMismatch(d dVar, d dVar2) {
            super("The response's ID doesn't matches the request ID. Request: " + dVar.f18530a + ". Response: " + dVar2.f18530a);
        }
    }

    public static class NoQueryPossibleException extends MiniDnsException {
    }

    public static class NullResultException extends MiniDnsException {
    }
}
