package net.i2p.crypto.eddsa;

import androidx.core.app.NotificationCompat;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import net.i2p.crypto.eddsa.math.Curve;
import net.i2p.crypto.eddsa.math.ScalarOps;
import sun.security.x509.X509Key;

/* JADX INFO: loaded from: classes.dex */
public final class EdDSAEngine extends Signature {
    public static final AlgorithmParameterSpec ONE_SHOT_MODE = new OneShotSpec();
    public static final String SIGNATURE_ALGORITHM = "NONEwithEdDSA";
    private ByteArrayOutputStream baos;
    private MessageDigest digest;
    private EdDSAKey key;
    private byte[] oneShotBytes;
    private int oneShotLength;
    private boolean oneShotMode;
    private int oneShotOffset;

    public static class OneShotSpec implements AlgorithmParameterSpec {
        private OneShotSpec() {
        }
    }

    public EdDSAEngine() {
        super(SIGNATURE_ALGORITHM);
    }

    private void digestInitSign(EdDSAPrivateKey edDSAPrivateKey) {
        int bVar = edDSAPrivateKey.getParams().getCurve().getField().getb();
        int i10 = bVar / 8;
        this.digest.update(edDSAPrivateKey.getH(), i10, (bVar / 4) - i10);
    }

    private void reset() {
        MessageDigest messageDigest = this.digest;
        if (messageDigest != null) {
            messageDigest.reset();
        }
        ByteArrayOutputStream byteArrayOutputStream = this.baos;
        if (byteArrayOutputStream != null) {
            byteArrayOutputStream.reset();
        }
        this.oneShotMode = false;
        this.oneShotBytes = null;
    }

    private byte[] x_engineSign() throws SignatureException {
        int i10;
        byte[] byteArray;
        int length;
        Curve curve = this.key.getParams().getCurve();
        ScalarOps scalarOps = this.key.getParams().getScalarOps();
        byte[] aVar = ((EdDSAPrivateKey) this.key).geta();
        if (this.oneShotMode) {
            byteArray = this.oneShotBytes;
            if (byteArray == null) {
                throw new SignatureException("update() not called first");
            }
            i10 = this.oneShotOffset;
            length = this.oneShotLength;
        } else {
            ByteArrayOutputStream byteArrayOutputStream = this.baos;
            i10 = 0;
            byteArray = byteArrayOutputStream == null ? new byte[0] : byteArrayOutputStream.toByteArray();
            length = byteArray.length;
        }
        this.digest.update(byteArray, i10, length);
        byte[] bArrReduce = scalarOps.reduce(this.digest.digest());
        byte[] byteArray2 = this.key.getParams().getB().scalarMultiply(bArrReduce).toByteArray();
        this.digest.update(byteArray2);
        this.digest.update(((EdDSAPrivateKey) this.key).getAbyte());
        this.digest.update(byteArray, i10, length);
        byte[] bArrMultiplyAndAdd = scalarOps.multiplyAndAdd(scalarOps.reduce(this.digest.digest()), aVar, bArrReduce);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(curve.getField().getb() / 4);
        byteBufferAllocate.put(byteArray2).put(bArrMultiplyAndAdd);
        return byteBufferAllocate.array();
    }

    private boolean x_engineVerify(byte[] bArr) throws SignatureException {
        byte[] byteArray;
        int length;
        int i10;
        int bVar = this.key.getParams().getCurve().getField().getb();
        int i11 = bVar / 4;
        if (bArr.length != i11) {
            throw new SignatureException("signature length is wrong");
        }
        int i12 = bVar / 8;
        this.digest.update(bArr, 0, i12);
        this.digest.update(((EdDSAPublicKey) this.key).getAbyte());
        if (this.oneShotMode) {
            byteArray = this.oneShotBytes;
            if (byteArray == null) {
                throw new SignatureException("update() not called first");
            }
            i10 = this.oneShotOffset;
            length = this.oneShotLength;
        } else {
            ByteArrayOutputStream byteArrayOutputStream = this.baos;
            byteArray = byteArrayOutputStream == null ? new byte[0] : byteArrayOutputStream.toByteArray();
            length = byteArray.length;
            i10 = 0;
        }
        this.digest.update(byteArray, i10, length);
        byte[] byteArray2 = this.key.getParams().getB().doubleScalarMultiplyVariableTime(((EdDSAPublicKey) this.key).getNegativeA(), this.key.getParams().getScalarOps().reduce(this.digest.digest()), Arrays.copyOfRange(bArr, i12, i11)).toByteArray();
        for (int i13 = 0; i13 < byteArray2.length; i13++) {
            if (byteArray2[i13] != bArr[i13]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        reset();
        if (!(privateKey instanceof EdDSAPrivateKey)) {
            throw new InvalidKeyException("cannot identify EdDSA private key: " + privateKey.getClass());
        }
        EdDSAPrivateKey edDSAPrivateKey = (EdDSAPrivateKey) privateKey;
        this.key = edDSAPrivateKey;
        if (this.digest == null) {
            try {
                this.digest = MessageDigest.getInstance(edDSAPrivateKey.getParams().getHashAlgorithm());
            } catch (NoSuchAlgorithmException unused) {
                throw new InvalidKeyException("cannot get required digest " + this.key.getParams().getHashAlgorithm() + " for private key.");
            }
        } else if (!edDSAPrivateKey.getParams().getHashAlgorithm().equals(this.digest.getAlgorithm())) {
            throw new InvalidKeyException("Key hash algorithm does not match chosen digest");
        }
        digestInitSign(edDSAPrivateKey);
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        reset();
        if (!(publicKey instanceof EdDSAPublicKey)) {
            if (!(publicKey instanceof X509Key)) {
                throw new InvalidKeyException("cannot identify EdDSA public key: " + publicKey.getClass());
            }
            try {
                engineInitVerify(new EdDSAPublicKey(new X509EncodedKeySpec(publicKey.getEncoded())));
                return;
            } catch (InvalidKeySpecException unused) {
                throw new InvalidKeyException("cannot handle X.509 EdDSA public key: " + publicKey.getAlgorithm());
            }
        }
        EdDSAPublicKey edDSAPublicKey = (EdDSAPublicKey) publicKey;
        this.key = edDSAPublicKey;
        if (this.digest != null) {
            if (!edDSAPublicKey.getParams().getHashAlgorithm().equals(this.digest.getAlgorithm())) {
                throw new InvalidKeyException("Key hash algorithm does not match chosen digest");
            }
            return;
        }
        try {
            this.digest = MessageDigest.getInstance(edDSAPublicKey.getParams().getHashAlgorithm());
        } catch (NoSuchAlgorithmException unused2) {
            throw new InvalidKeyException("cannot get required digest " + this.key.getParams().getHashAlgorithm() + " for private key.");
        }
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        ByteArrayOutputStream byteArrayOutputStream;
        if (!algorithmParameterSpec.equals(ONE_SHOT_MODE)) {
            super.engineSetParameter(algorithmParameterSpec);
        } else {
            if (this.oneShotBytes != null || ((byteArrayOutputStream = this.baos) != null && byteArrayOutputStream.size() > 0)) {
                throw new InvalidAlgorithmParameterException("update() already called");
            }
            this.oneShotMode = true;
        }
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() {
        try {
            return x_engineSign();
        } finally {
            reset();
            digestInitSign((EdDSAPrivateKey) this.key);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b10) throws SignatureException {
        if (this.oneShotMode) {
            throw new SignatureException("unsupported in one-shot mode");
        }
        if (this.baos == null) {
            this.baos = new ByteArrayOutputStream(NotificationCompat.FLAG_LOCAL_ONLY);
        }
        this.baos.write(b10);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) {
        try {
            return x_engineVerify(bArr);
        } finally {
            reset();
        }
    }

    public byte[] signOneShot(byte[] bArr) {
        return signOneShot(bArr, 0, bArr.length);
    }

    public boolean verifyOneShot(byte[] bArr, byte[] bArr2) {
        return verifyOneShot(bArr, 0, bArr.length, bArr2, 0, bArr2.length);
    }

    public EdDSAEngine(MessageDigest messageDigest) {
        this();
        this.digest = messageDigest;
    }

    public byte[] signOneShot(byte[] bArr, int i10, int i11) throws SignatureException {
        this.oneShotMode = true;
        update(bArr, i10, i11);
        return sign();
    }

    public boolean verifyOneShot(byte[] bArr, int i10, int i11, byte[] bArr2) {
        return verifyOneShot(bArr, i10, i11, bArr2, 0, bArr2.length);
    }

    public boolean verifyOneShot(byte[] bArr, byte[] bArr2, int i10, int i11) {
        return verifyOneShot(bArr, 0, bArr.length, bArr2, i10, i11);
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i10, int i11) throws SignatureException {
        if (!this.oneShotMode) {
            if (this.baos == null) {
                this.baos = new ByteArrayOutputStream(NotificationCompat.FLAG_LOCAL_ONLY);
            }
            this.baos.write(bArr, i10, i11);
        } else {
            if (this.oneShotBytes != null) {
                throw new SignatureException("update() already called");
            }
            this.oneShotBytes = bArr;
            this.oneShotOffset = i10;
            this.oneShotLength = i11;
        }
    }

    public boolean verifyOneShot(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13) throws SignatureException {
        this.oneShotMode = true;
        update(bArr, i10, i11);
        return verify(bArr2, i12, i13);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }
}
