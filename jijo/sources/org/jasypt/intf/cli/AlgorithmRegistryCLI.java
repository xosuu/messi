package org.jasypt.intf.cli;

import java.io.PrintStream;
import java.util.Set;
import org.jasypt.registry.AlgorithmRegistry;

/* JADX INFO: loaded from: classes.dex */
public final class AlgorithmRegistryCLI {
    private AlgorithmRegistryCLI() {
    }

    public static void main(String[] strArr) {
        try {
            Set allDigestAlgorithms = AlgorithmRegistry.getAllDigestAlgorithms();
            Set allPBEAlgorithms = AlgorithmRegistry.getAllPBEAlgorithms();
            PrintStream printStream = System.out;
            printStream.getClass();
            new StringBuffer("DIGEST ALGORITHMS:   ").append(allDigestAlgorithms);
            printStream.getClass();
            printStream.getClass();
            new StringBuffer("PBE ALGORITHMS:      ").append(allPBEAlgorithms);
            printStream.getClass();
            printStream.getClass();
        } catch (Throwable th) {
            th.printStackTrace(System.err);
        }
    }
}
