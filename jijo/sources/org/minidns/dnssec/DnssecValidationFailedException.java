package org.minidns.dnssec;

import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import x7.e;

/* JADX INFO: loaded from: classes.dex */
public class DnssecValidationFailedException extends IOException {

    public static class AuthorityDoesNotContainSoa extends DnssecValidationFailedException {
    }

    public static class DataMalformedException extends DnssecValidationFailedException {
        public DataMalformedException(IOException iOException) {
            super("Malformed data", iOException);
        }
    }

    public static class DnssecInvalidKeySpecException extends DnssecValidationFailedException {
        public DnssecInvalidKeySpecException(InvalidKeySpecException invalidKeySpecException) {
            super("Invalid key spec", invalidKeySpecException);
        }
    }

    public DnssecValidationFailedException(e eVar, String str) {
        super("Validation of request to " + eVar + " failed: " + str);
    }
}
