package v7;

import androidx.core.app.NotificationCompat;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f17885a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f17886b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Inet4Address[] f17887c = {a('a', 198, 41, 0, 4), a('b', 192, 228, 79, 201), a('c', 192, 33, 4, 12), a('d', 199, 7, 91, 13), a('e', 192, 203, 230, 10), a('f', 192, 5, 5, 241), a('g', 192, 112, 36, 4), a('h', 198, 97, 190, 53), a('i', 192, 36, 148, 17), a('j', 192, 58, NotificationCompat.FLAG_HIGH_PRIORITY, 30), a('k', 193, 0, 14, 129), a('l', 199, 7, 83, 42), a('m', 202, 12, 27, 33)};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Inet6Address[] f17888d = {b('a', 1283, 47678, 2, 48), b('b', 1280, 132, 0, 11), b('c', 1280, 2, 0, 12), b('d', 1280, 45, 0, 13), b('f', 1280, 47, 0, 15), b('h', 1280, 1, 0, 83), b('i', 2046, 0, 0, 83), b('j', 1283, 3111, 2, 48), b('l', 1280, 3, 0, 66), b('m', 3523, 0, 0, 53)};

    public static Inet4Address a(char c10, int i10, int i11, int i12, int i13) {
        try {
            Inet4Address inet4Address = (Inet4Address) InetAddress.getByAddress(c10 + ".root-servers.net", new byte[]{(byte) i10, (byte) i11, (byte) i12, (byte) i13});
            f17885a.put(Character.valueOf(c10), inet4Address);
            return inet4Address;
        } catch (UnknownHostException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static Inet6Address b(char c10, int i10, int i11, int i12, int i13) {
        try {
            byte b10 = (byte) 0;
            byte b11 = (byte) 0;
            Inet6Address inet6Address = (Inet6Address) InetAddress.getByAddress(c10 + ".root-servers.net", new byte[]{(byte) 32, (byte) 8193, (byte) (i10 >> 8), (byte) i10, (byte) (i11 >> 8), (byte) i11, b10, b11, b10, b11, b10, b11, (byte) (i12 >> 8), (byte) i12, (byte) (i13 >> 8), (byte) i13});
            f17886b.put(Character.valueOf(c10), inet6Address);
            return inet6Address;
        } catch (UnknownHostException e10) {
            throw new RuntimeException(e10);
        }
    }
}
