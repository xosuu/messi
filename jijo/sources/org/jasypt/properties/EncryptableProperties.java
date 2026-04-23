package org.jasypt.properties;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Properties;
import org.jasypt.commons.CommonUtils;
import org.jasypt.encryption.StringEncryptor;
import org.jasypt.exceptions.EncryptionOperationNotPossibleException;
import org.jasypt.util.text.TextEncryptor;

/* JADX INFO: loaded from: classes.dex */
public final class EncryptableProperties extends Properties {
    private static final long serialVersionUID = 6479795856725500639L;
    private final Integer ident;
    private transient StringEncryptor stringEncryptor;
    private transient TextEncryptor textEncryptor;

    public EncryptableProperties(StringEncryptor stringEncryptor) {
        this((Properties) null, stringEncryptor);
    }

    private synchronized String decode(String str) {
        if (!PropertyValueEncryptionUtils.isEncryptedValue(str)) {
            return str;
        }
        StringEncryptor stringEncryptor = this.stringEncryptor;
        if (stringEncryptor != null) {
            return PropertyValueEncryptionUtils.decrypt(str, stringEncryptor);
        }
        TextEncryptor textEncryptor = this.textEncryptor;
        if (textEncryptor == null) {
            throw new EncryptionOperationNotPossibleException("Neither a string encryptor nor a text encryptor exist for this instance of EncryptableProperties. This is usually caused by the instance having been serialized and then de-serialized in a different classloader or virtual machine, which is an unsupported behaviour (as encryptors cannot be serialized themselves)");
        }
        return PropertyValueEncryptionUtils.decrypt(str, textEncryptor);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        EncryptablePropertiesEncryptorRegistry encryptablePropertiesEncryptorRegistry = EncryptablePropertiesEncryptorRegistry.getInstance();
        StringEncryptor stringEncryptor = encryptablePropertiesEncryptorRegistry.getStringEncryptor(this);
        if (stringEncryptor != null) {
            this.stringEncryptor = stringEncryptor;
            return;
        }
        TextEncryptor textEncryptor = encryptablePropertiesEncryptorRegistry.getTextEncryptor(this);
        if (textEncryptor != null) {
            this.textEncryptor = textEncryptor;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        EncryptablePropertiesEncryptorRegistry encryptablePropertiesEncryptorRegistry = EncryptablePropertiesEncryptorRegistry.getInstance();
        TextEncryptor textEncryptor = this.textEncryptor;
        if (textEncryptor != null) {
            encryptablePropertiesEncryptorRegistry.setTextEncryptor(this, textEncryptor);
        } else {
            StringEncryptor stringEncryptor = this.stringEncryptor;
            if (stringEncryptor != null) {
                encryptablePropertiesEncryptorRegistry.setStringEncryptor(this, stringEncryptor);
            }
        }
        objectOutputStream.defaultWriteObject();
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public synchronized Object get(Object obj) {
        Object obj2;
        try {
            obj2 = super.get(obj);
        } catch (Throwable th) {
            throw th;
        }
        return decode(obj2 instanceof String ? (String) obj2 : null);
    }

    public Integer getIdent() {
        return this.ident;
    }

    @Override // java.util.Properties
    public String getProperty(String str) {
        return decode(super.getProperty(str));
    }

    public EncryptableProperties(TextEncryptor textEncryptor) {
        this((Properties) null, textEncryptor);
    }

    @Override // java.util.Properties
    public String getProperty(String str, String str2) {
        return decode(super.getProperty(str, str2));
    }

    public EncryptableProperties(Properties properties, StringEncryptor stringEncryptor) {
        super(properties);
        this.ident = new Integer(CommonUtils.nextRandomInt());
        this.stringEncryptor = null;
        this.textEncryptor = null;
        CommonUtils.validateNotNull(stringEncryptor, "Encryptor cannot be null");
        this.stringEncryptor = stringEncryptor;
        this.textEncryptor = null;
    }

    public EncryptableProperties(Properties properties, TextEncryptor textEncryptor) {
        super(properties);
        this.ident = new Integer(CommonUtils.nextRandomInt());
        this.stringEncryptor = null;
        this.textEncryptor = null;
        CommonUtils.validateNotNull(textEncryptor, "Encryptor cannot be null");
        this.stringEncryptor = null;
        this.textEncryptor = textEncryptor;
    }
}
