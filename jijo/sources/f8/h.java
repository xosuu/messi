package f8;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f13425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Integer f13426b;

    public abstract void a(DataOutputStream dataOutputStream);

    public final void d() {
        if (this.f13425a != null) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a(new DataOutputStream(byteArrayOutputStream));
            this.f13425a = byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        h hVar = (h) obj;
        hVar.d();
        d();
        return Arrays.equals(this.f13425a, hVar.f13425a);
    }

    public final int hashCode() {
        if (this.f13426b == null) {
            d();
            this.f13426b = Integer.valueOf(Arrays.hashCode(this.f13425a));
        }
        return this.f13426b.intValue();
    }
}
