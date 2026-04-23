package g8;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.minidns.MiniDnsException;
import org.minidns.util.MultipleIoException;
import t3.i;
import x7.d;
import y7.c;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f13895b = Logger.getLogger(a.class.getName());

    public static d Y(d dVar, InetAddress inetAddress) throws Throwable {
        Socket socket;
        try {
            socket = new Socket();
        } catch (Throwable th) {
            th = th;
            socket = null;
        }
        try {
            socket.connect(new InetSocketAddress(inetAddress, 53), 5000);
            socket.setSoTimeout(5000);
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            byte[] bArrE = dVar.e();
            DataOutputStream dataOutputStream2 = new DataOutputStream(dataOutputStream);
            dataOutputStream2.writeShort(bArrE.length);
            dataOutputStream2.write(bArrE);
            dataOutputStream.flush();
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            int unsignedShort = dataInputStream.readUnsignedShort();
            byte[] bArr = new byte[unsignedShort];
            for (int i10 = 0; i10 < unsignedShort; i10 += dataInputStream.read(bArr, i10, unsignedShort - i10)) {
            }
            d dVar2 = new d(bArr);
            if (dVar2.f18530a != dVar.f18530a) {
                throw new MiniDnsException.IdMismatch(dVar, dVar2);
            }
            socket.close();
            return dVar2;
        } catch (Throwable th2) {
            th = th2;
            if (socket != null) {
                socket.close();
            }
            throw th;
        }
    }

    public static d Z(d dVar, InetAddress inetAddress) throws Throwable {
        DatagramSocket datagramSocket;
        byte[] bArrE = dVar.e();
        DatagramPacket datagramPacket = new DatagramPacket(bArrE, bArrE.length, inetAddress, 53);
        byte[] bArr = new byte[1024];
        try {
            datagramSocket = new DatagramSocket();
        } catch (Throwable th) {
            th = th;
            datagramSocket = null;
        }
        try {
            datagramSocket.setSoTimeout(5000);
            datagramSocket.send(datagramPacket);
            DatagramPacket datagramPacket2 = new DatagramPacket(bArr, 1024);
            datagramSocket.receive(datagramPacket2);
            d dVar2 = new d(datagramPacket2.getData());
            if (dVar2.f18530a != dVar.f18530a) {
                throw new MiniDnsException.IdMismatch(dVar, dVar2);
            }
            datagramSocket.close();
            return dVar2;
        } catch (Throwable th2) {
            th = th2;
            if (datagramSocket != null) {
                datagramSocket.close();
            }
            throw th;
        }
    }

    public final c X(d dVar, InetAddress inetAddress) {
        d dVarY;
        ArrayList arrayList = new ArrayList(2);
        try {
            dVarY = Z(dVar, inetAddress);
        } catch (IOException e10) {
            arrayList.add(e10);
            dVarY = null;
        }
        if (dVarY != null && !dVarY.f18535f) {
            return new c(dVarY);
        }
        Level level = Level.FINE;
        Object[] objArr = new Object[1];
        objArr[0] = dVarY != null ? "response is truncated" : arrayList.get(0);
        f13895b.log(level, "Fallback to TCP because {0}", objArr);
        try {
            dVarY = Y(dVar, inetAddress);
        } catch (IOException e11) {
            arrayList.add(e11);
            MultipleIoException.a(arrayList);
        }
        return new c(dVarY);
    }
}
