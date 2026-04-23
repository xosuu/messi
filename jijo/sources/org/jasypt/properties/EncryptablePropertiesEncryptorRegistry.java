package org.jasypt.properties;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.jasypt.encryption.StringEncryptor;
import org.jasypt.util.text.TextEncryptor;

/* JADX INFO: loaded from: classes.dex */
final class EncryptablePropertiesEncryptorRegistry {
    private static final EncryptablePropertiesEncryptorRegistry instance = new EncryptablePropertiesEncryptorRegistry();
    private final Map stringEncryptors = Collections.synchronizedMap(new HashMap());
    private final Map textEncryptors = Collections.synchronizedMap(new HashMap());

    private EncryptablePropertiesEncryptorRegistry() {
    }

    public static EncryptablePropertiesEncryptorRegistry getInstance() {
        return instance;
    }

    public StringEncryptor getStringEncryptor(EncryptableProperties encryptableProperties) {
        return (StringEncryptor) this.stringEncryptors.get(encryptableProperties.getIdent());
    }

    public TextEncryptor getTextEncryptor(EncryptableProperties encryptableProperties) {
        return (TextEncryptor) this.textEncryptors.get(encryptableProperties.getIdent());
    }

    public void removeEntries(EncryptableProperties encryptableProperties) {
        this.stringEncryptors.remove(encryptableProperties.getIdent());
        this.textEncryptors.remove(encryptableProperties.getIdent());
    }

    public void setStringEncryptor(EncryptableProperties encryptableProperties, StringEncryptor stringEncryptor) {
        this.stringEncryptors.put(encryptableProperties.getIdent(), stringEncryptor);
    }

    public void setTextEncryptor(EncryptableProperties encryptableProperties, TextEncryptor textEncryptor) {
        this.textEncryptors.put(encryptableProperties.getIdent(), textEncryptor);
    }
}
