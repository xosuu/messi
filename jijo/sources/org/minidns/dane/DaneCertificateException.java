package org.minidns.dane;

import java.security.cert.CertificateException;

/* JADX INFO: loaded from: classes.dex */
public abstract class DaneCertificateException extends CertificateException {

    public static class CertificateMismatch extends DaneCertificateException {
    }

    public static class MultipleCertificateMismatchExceptions extends DaneCertificateException {
    }
}
