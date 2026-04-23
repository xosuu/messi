package x4;

import android.app.ProgressDialog;
import android.view.MenuItem;
import androidx.core.app.NotificationCompat;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.gson.JsonIOException;
import com.google.gson.internal.bind.TreeTypeAdapter;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.EnumMap;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;
import team.dev.epro.apkcustom.MainActivity;
import team.dev.epro.apkcustom.activities.ConfigImport;
import team.dev.epro.apkcustom.sockets.http2socks.socksshttp.proxy.ProxyException;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class a implements k.m, com.google.gson.internal.l, g3.i, j9.a, x8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18391b;

    public /* synthetic */ a(int i10, Object obj) {
        this.f18390a = i10;
        this.f18391b = obj;
    }

    @Override // x8.c
    public final void a(Socket socket, String str, int i10, int i11) throws IOException {
        l.q qVar = (l.q) this.f18391b;
        String str2 = (String) qVar.f14971c;
        int i12 = qVar.f14970b;
        String str3 = (String) qVar.f14972d;
        socket.connect(new InetSocketAddress(str2, i12), i11);
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        OutputStream outputStream = socket.getOutputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(4);
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(i10 >>> 8);
        byteArrayOutputStream.write(i10 & 255);
        byteArrayOutputStream.write(InetAddress.getByName(str).getAddress());
        if (str3 != null) {
            byteArrayOutputStream.write(str3.getBytes(StandardCharsets.UTF_8));
        }
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.writeTo(outputStream);
        byteArrayOutputStream.reset();
        outputStream.flush();
        byte[] bArr = new byte[6];
        dataInputStream.readFully(bArr);
        byte b10 = bArr[0];
        x8.b bVar = x8.b.f18559b;
        if (b10 != 0) {
            throw new ProxyException(bVar, "server returns VN " + ((int) bArr[0]));
        }
        if (bArr[1] == 90) {
            dataInputStream.readFully(new byte[2]);
        } else {
            throw new ProxyException(bVar, "ProxySOCKS4: server returns CD " + ((int) bArr[1]));
        }
    }

    public final void b(l5.f fVar, boolean z9) {
        ((TreeSet) this.f18391b).add(new j6.k(fVar, z9));
    }

    public final void c(Inet6Address inet6Address, int i10, boolean z9) {
        TreeSet treeSet = (TreeSet) this.f18391b;
        j6.k kVar = new j6.k();
        kVar.f14398b = i10;
        kVar.f14399d = z9;
        kVar.f14397a = BigInteger.ZERO;
        int length = inet6Address.getAddress().length;
        int i11 = NotificationCompat.FLAG_HIGH_PRIORITY;
        for (int i12 = 0; i12 < length; i12++) {
            i11 -= 8;
            kVar.f14397a = kVar.f14397a.add(BigInteger.valueOf(r8[i12] & 255).shiftLeft(i11));
        }
        treeSet.add(kVar);
    }

    @Override // j9.a
    public final void d() {
        ((ConfigImport) this.f18391b).finish();
    }

    public final int e() {
        return Math.max(0, h() - ((SideSheetBehavior) this.f18391b).f11942l);
    }

    @Override // com.google.gson.internal.l
    public final Object f() {
        Object obj = this.f18391b;
        if (!(((Type) obj) instanceof ParameterizedType)) {
            throw new JsonIOException("Invalid EnumMap type: " + ((Type) this.f18391b).toString());
        }
        Type type = ((ParameterizedType) ((Type) obj)).getActualTypeArguments()[0];
        if (type instanceof Class) {
            return new EnumMap((Class) type);
        }
        throw new JsonIOException("Invalid EnumMap type: " + ((Type) this.f18391b).toString());
    }

    @Override // j9.a
    public final void g() {
        try {
            Thread.sleep(2000L);
        } catch (Exception unused) {
        }
    }

    public final int h() {
        return ((SideSheetBehavior) this.f18391b).f11943m;
    }

    public final Vector i(boolean z9) {
        Vector vector = new Vector();
        for (j6.k kVar : (TreeSet) this.f18391b) {
            if (kVar.f14399d == z9) {
                vector.add(kVar);
            }
        }
        return vector;
    }

    public final Vector j() {
        PriorityQueue priorityQueue = new PriorityQueue((SortedSet) this.f18391b);
        TreeSet<j6.k> treeSet = new TreeSet();
        j6.k kVar = (j6.k) priorityQueue.poll();
        if (kVar != null) {
            while (kVar != null) {
                j6.k kVar2 = (j6.k) priorityQueue.poll();
                if (kVar2 == null || kVar.g().compareTo(kVar2.d()) == -1) {
                    treeSet.add(kVar);
                    kVar = kVar2;
                } else {
                    boolean zEquals = kVar.d().equals(kVar2.d());
                    boolean z9 = kVar.f14399d;
                    boolean z10 = kVar2.f14399d;
                    int i10 = kVar2.f14398b;
                    if (!zEquals || kVar.f14398b < i10) {
                        if (z9 != z10) {
                            j6.k[] kVarArrI = kVar.i();
                            j6.k kVar3 = kVarArrI[1];
                            if (kVar3.f14398b == i10) {
                                priorityQueue.add(kVar2);
                            } else {
                                priorityQueue.add(kVar3);
                                priorityQueue.add(kVar2);
                            }
                            kVar = kVarArrI[0];
                        }
                    } else if (z9 == z10) {
                        kVar = kVar2;
                    } else {
                        j6.k[] kVarArrI2 = kVar2.i();
                        if (!priorityQueue.contains(kVarArrI2[1])) {
                            priorityQueue.add(kVarArrI2[1]);
                        }
                        if (!kVarArrI2[0].g().equals(kVar.g()) && !priorityQueue.contains(kVarArrI2[0])) {
                            priorityQueue.add(kVarArrI2[0]);
                        }
                    }
                }
            }
        }
        Vector vector = new Vector();
        for (j6.k kVar4 : treeSet) {
            if (kVar4.f14399d) {
                vector.add(kVar4);
            }
        }
        return vector;
    }

    @Override // k.m
    public final boolean n(k.o oVar, MenuItem menuItem) {
        y4.a aVar = ((NavigationView) this.f18391b).f11924v;
        if (aVar == null) {
            return false;
        }
        MainActivity mainActivity = (MainActivity) aVar;
        mainActivity.getClass();
        mainActivity.A0 = menuItem.getItemId();
        ProgressDialog progressDialog = new ProgressDialog(mainActivity, R.style.hc);
        mainActivity.B0 = progressDialog;
        progressDialog.setMessage("Loading...");
        mainActivity.B0.show();
        mainActivity.J.c();
        return true;
    }

    @Override // k.m
    public final void q(k.o oVar) {
    }

    public final String toString() {
        switch (this.f18390a) {
            case 3:
                return ((Field) this.f18391b).toString();
            default:
                return super.toString();
        }
    }

    public a(SideSheetBehavior sideSheetBehavior) {
        this.f18390a = 2;
        this.f18391b = sideSheetBehavior;
    }

    public a() {
        this.f18390a = 6;
        this.f18391b = new TreeSet();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(TreeTypeAdapter treeTypeAdapter) {
        this(5, treeTypeAdapter);
        this.f18390a = 5;
    }
}
