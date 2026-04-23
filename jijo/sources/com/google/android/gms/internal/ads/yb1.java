package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class yb1 extends rt0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f10822h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final DatagramPacket f10823q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Uri f10824s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public DatagramSocket f10825t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public MulticastSocket f10826u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InetAddress f10827v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f10828w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10829x;

    public yb1() {
        super(true);
        byte[] bArr = new byte[2000];
        this.f10822h = bArr;
        this.f10823q = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.google.android.gms.internal.ads.nl1
    public final int b(int i10, byte[] bArr, int i11) throws zzgv {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f10829x;
        DatagramPacket datagramPacket = this.f10823q;
        if (i12 == 0) {
            try {
                DatagramSocket datagramSocket = this.f10825t;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f10829x = length;
                c(length);
            } catch (SocketTimeoutException e10) {
                throw new zzgv(2002, e10);
            } catch (IOException e11) {
                throw new zzgv(2001, e11);
            }
        }
        int length2 = datagramPacket.getLength();
        int i13 = this.f10829x;
        int iMin = Math.min(i13, i11);
        System.arraycopy(this.f10822h, length2 - i13, bArr, i10, iMin);
        this.f10829x -= iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final long g(iz0 iz0Var) throws zzgv {
        Uri uri = iz0Var.f5730a;
        this.f10824s = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f10824s.getPort();
        j(iz0Var);
        try {
            this.f10827v = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f10827v, port);
            if (this.f10827v.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f10826u = multicastSocket;
                multicastSocket.joinGroup(this.f10827v);
                this.f10825t = this.f10826u;
            } else {
                this.f10825t = new DatagramSocket(inetSocketAddress);
            }
            this.f10825t.setSoTimeout(8000);
            this.f10828w = true;
            n(iz0Var);
            return -1L;
        } catch (IOException e10) {
            throw new zzgv(2001, e10);
        } catch (SecurityException e11) {
            throw new zzgv(2006, e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final Uri zzc() {
        return this.f10824s;
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void zzd() {
        this.f10824s = null;
        MulticastSocket multicastSocket = this.f10826u;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f10827v;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f10826u = null;
        }
        DatagramSocket datagramSocket = this.f10825t;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f10825t = null;
        }
        this.f10827v = null;
        this.f10829x = 0;
        if (this.f10828w) {
            this.f10828w = false;
            i();
        }
    }
}
