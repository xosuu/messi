package f8;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jasypt.digest.StandardStringDigester;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f13421d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient String f13422f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient List f13423h;

    public f0(byte[] bArr) {
        this.f13421d = bArr;
    }

    @Override // f8.h
    public final void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(this.f13421d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\"");
        if (this.f13422f == null) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f13423h == null) {
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (true) {
                    byte[] bArr = this.f13421d;
                    if (i10 >= bArr.length) {
                        break;
                    }
                    int i11 = bArr[i10] & 255;
                    int i12 = i10 + 1;
                    int i13 = i11 + i12;
                    arrayList.add(Arrays.copyOfRange(bArr, i12, i13));
                    i10 = i13;
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList2.add(new String((byte[]) it.next(), StandardStringDigester.MESSAGE_CHARSET));
                    } catch (UnsupportedEncodingException e10) {
                        throw new AssertionError(e10);
                    }
                }
                this.f13423h = Collections.unmodifiableList(arrayList2);
            }
            Iterator it2 = this.f13423h.iterator();
            while (it2.hasNext()) {
                sb2.append((String) it2.next());
                if (it2.hasNext()) {
                    sb2.append(" / ");
                }
            }
            this.f13422f = sb2.toString();
        }
        return g1.a.r(sb, this.f13422f, "\"");
    }
}
