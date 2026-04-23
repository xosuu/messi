package org.minidns.iterative;

import org.minidns.MiniDnsException;

/* JADX INFO: loaded from: classes.dex */
public abstract class IterativeClientException extends MiniDnsException {

    public static class LoopDetected extends IterativeClientException {
    }

    public static class MaxIterativeStepsReached extends IterativeClientException {
        public MaxIterativeStepsReached() {
            super("Maxmimum steps reached");
        }
    }

    public static class NotAuthoritativeNorGlueRrFound extends IterativeClientException {
    }
}
