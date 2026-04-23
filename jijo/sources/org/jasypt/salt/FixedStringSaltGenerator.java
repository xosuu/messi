package org.jasypt.salt;

import java.io.UnsupportedEncodingException;
import org.jasypt.commons.CommonUtils;
import org.jasypt.exceptions.EncryptionInitializationException;

/* JADX INFO: loaded from: classes.dex */
public class FixedStringSaltGenerator implements SaltGenerator {
    private static final String DEFAULT_CHARSET = "UTF-8";
    private String salt = null;
    private String charset = "UTF-8";
    private byte[] saltBytes = null;

    @Override // org.jasypt.salt.SaltGenerator
    public byte[] generateSalt(int i10) {
        String str = this.salt;
        if (str == null) {
            throw new EncryptionInitializationException("Salt has not been set");
        }
        if (this.saltBytes == null) {
            try {
                this.saltBytes = str.getBytes(this.charset);
            } catch (UnsupportedEncodingException unused) {
                StringBuffer stringBuffer = new StringBuffer("Invalid charset specified: ");
                stringBuffer.append(this.charset);
                throw new EncryptionInitializationException(stringBuffer.toString());
            }
        }
        byte[] bArr = this.saltBytes;
        if (bArr.length < i10) {
            throw new EncryptionInitializationException("Requested salt larger than set");
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return bArr2;
    }

    @Override // org.jasypt.salt.SaltGenerator
    public boolean includePlainSaltInEncryptionResults() {
        return false;
    }

    public synchronized void setCharset(String str) {
        CommonUtils.validateNotNull(str, "Charset cannot be set null");
        this.charset = str;
    }

    public synchronized void setSalt(String str) {
        CommonUtils.validateNotNull(str, "Salt cannot be set null");
        this.salt = str;
    }
}
