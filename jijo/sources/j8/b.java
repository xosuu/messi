package j8;

import com.google.android.gms.internal.ads.fb1;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b extends BufferedWriter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char[] f14469a;

    public b(StringWriter stringWriter) {
        super(stringWriter);
        this.f14469a = new char[64];
        System.getProperty("line.separator");
    }

    public final void a(a aVar) throws IOException {
        char[] cArr;
        int i10;
        write("-----BEGIN CERTIFICATE-----");
        newLine();
        List list = aVar.f14467a;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                fb1.t(it.next());
                throw null;
            }
            newLine();
        }
        i8.b bVar = i8.a.f14208a;
        byte[] bArr = aVar.f14468b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((bArr.length + 2) / 3) * 4);
        try {
            i8.a.f14208a.a(bArr, bArr.length, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int length = 0;
            while (length < byteArray.length) {
                int i11 = 0;
                while (true) {
                    cArr = this.f14469a;
                    if (i11 == cArr.length || (i10 = length + i11) >= byteArray.length) {
                        break;
                    }
                    cArr[i11] = (char) byteArray[i10];
                    i11++;
                }
                write(cArr, 0, i11);
                newLine();
                length += cArr.length;
            }
            write("-----END CERTIFICATE-----");
            newLine();
        } catch (IOException e10) {
            throw new RuntimeException("exception encoding base64 string: " + e10);
        }
    }
}
