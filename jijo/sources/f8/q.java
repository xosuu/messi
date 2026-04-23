package f8;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.fb1;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class q extends h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Logger f13457q = Logger.getLogger(q.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final org.minidns.dnsname.a f13458d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f13459f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f13460h;

    public q(org.minidns.dnsname.a aVar, ArrayList arrayList) {
        this.f13458d = aVar;
        this.f13460h = Collections.unmodifiableList(arrayList);
        this.f13459f = e(arrayList);
    }

    public static byte[] e(ArrayList arrayList) {
        ArrayList<Integer> arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((x) it.next()).f13520a));
        }
        Collections.sort(arrayList2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            byte[] bArr = null;
            int iIntValue = -1;
            for (Integer num : arrayList2) {
                if (iIntValue == -1 || (num.intValue() >> 8) != iIntValue) {
                    if (iIntValue != -1) {
                        g(bArr, dataOutputStream);
                    }
                    iIntValue = num.intValue() >> 8;
                    dataOutputStream.writeByte(iIntValue);
                    bArr = new byte[32];
                }
                int iIntValue2 = (num.intValue() >> 3) % 32;
                int iIntValue3 = num.intValue() % 8;
                bArr[iIntValue2] = (byte) ((NotificationCompat.FLAG_HIGH_PRIORITY >> iIntValue3) | bArr[iIntValue2]);
            }
            if (iIntValue != -1) {
                g(bArr, dataOutputStream);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static ArrayList f(byte[] bArr) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (bArr.length > i10) {
            int unsignedByte = dataInputStream.readUnsignedByte();
            int unsignedByte2 = dataInputStream.readUnsignedByte();
            for (int i11 = 0; i11 < unsignedByte2; i11++) {
                int unsignedByte3 = dataInputStream.readUnsignedByte();
                for (int i12 = 0; i12 < 8; i12++) {
                    if (((unsignedByte3 >> i12) & 1) > 0) {
                        int i13 = (7 - i12) + (i11 * 8) + (unsignedByte << 8);
                        x xVarA = x.a(i13);
                        if (xVarA == x.UNKNOWN) {
                            f13457q.warning(fb1.g("Skipping unknown type in type bitmap: ", i13));
                        } else {
                            arrayList.add(xVarA);
                        }
                    }
                }
            }
            i10 += unsignedByte2 + 2;
        }
        return arrayList;
    }

    public static void g(byte[] bArr, DataOutputStream dataOutputStream) throws IOException {
        int i10 = 0;
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if (bArr[i11] != 0) {
                i10 = i11 + 1;
            }
        }
        dataOutputStream.writeByte(i10);
        for (int i12 = 0; i12 < i10; i12++) {
            dataOutputStream.writeByte(bArr[i12]);
        }
    }

    @Override // f8.h
    public final void a(DataOutputStream dataOutputStream) throws IOException {
        this.f13458d.o(dataOutputStream);
        dataOutputStream.write(this.f13459f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.f13458d);
        sb.append('.');
        for (x xVar : this.f13460h) {
            sb.append(' ');
            sb.append(xVar);
        }
        return sb.toString();
    }
}
