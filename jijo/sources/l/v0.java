package l;

import android.graphics.Typeface;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Locale;
import team.dev.epro.apkcustom.App;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class v0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15033b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15034d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f15035f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f15036h;

    public v0(Socket socket) {
        this.f15032a = 1;
        this.f15035f = v0.class.getName();
        this.f15033b = NotificationCompat.FLAG_BUBBLE;
        this.f15034d = socket;
    }

    public final void a(Socket socket, int i10) {
        if (App.f17100w.f17415a.getBoolean("log_tether", false)) {
            StringBuilder sb = new StringBuilder("[");
            g1.a.w(new SimpleDateFormat("HH:mm:ss", Locale.getDefault()), sb, "] <font color=");
            sb.append(team.dev.epro.apkcustom.widgets.a.f17392e);
            sb.append(">");
            sb.append(App.f17099v.getString(R.string.bl));
            sb.append("</font>: Request ");
            sb.append(socket.getInetAddress().getHostName());
            sb.append("/");
            sb.append(socket.getInetAddress().getHostAddress());
            sb.append(":");
            sb.append(socket.getPort());
            sb.append(" from client ");
            sb.append(((Socket) this.f15034d).getInetAddress().getHostAddress());
            sb.append(" : ");
            sb.append(team.dev.epro.apkcustom.widgets.e.c(i10, new Locale("en")));
            b7.u.r("TAG", sb.toString());
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InputStream inputStream;
        byte[] bArr;
        Socket socket;
        OutputStream outputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        switch (this.f15032a) {
            case 0:
                ((TextView) this.f15034d).setTypeface((Typeface) this.f15035f, this.f15033b);
                return;
            default:
                try {
                    try {
                        inputStream = ((Socket) this.f15034d).getInputStream();
                        OutputStream outputStream2 = ((Socket) this.f15034d).getOutputStream();
                        bArr = new byte[this.f15033b];
                        inputStream.read(bArr, 0, 3);
                        outputStream2.write(new byte[]{5, 0});
                        outputStream2.flush();
                        inputStream.read(bArr, 0, 10);
                        socket = new Socket((bArr[4] & 255) + "." + (bArr[5] & 255) + "." + (bArr[6] & 255) + "." + (bArr[7] & 255), ((bArr[8] & 255) * NotificationCompat.FLAG_LOCAL_ONLY) + (bArr[9] & 255));
                        InputStream inputStream2 = socket.getInputStream();
                        outputStream = socket.getOutputStream();
                        byte[] address = socket.getLocalAddress().getAddress();
                        int localPort = socket.getLocalPort();
                        outputStream2.write(new byte[]{5, 0, 0, 1, address[0], address[1], address[2], address[3], (byte) (localPort >> 8), (byte) (localPort & 255)}, 0, 10);
                        outputStream2.flush();
                        z8.b bVar = new z8.b(inputStream2, outputStream2, (Socket) this.f15034d, socket);
                        this.f15036h = bVar;
                        bVar.start();
                        byteArrayOutputStream = new ByteArrayOutputStream();
                    } catch (IOException unused) {
                        return;
                    }
                } catch (Exception unused2) {
                    obj = this.f15034d;
                    if (((Socket) obj) == null) {
                        return;
                    }
                } catch (Throwable th) {
                    try {
                        Object obj2 = this.f15034d;
                        if (((Socket) obj2) != null) {
                            ((Socket) obj2).close();
                        }
                        break;
                    } catch (IOException unused3) {
                    }
                    throw th;
                }
                while (true) {
                    int i10 = inputStream.read(bArr, 0, this.f15033b);
                    if (i10 <= 0) {
                        obj = this.f15034d;
                        if (((Socket) obj) == null) {
                            return;
                        }
                        ((Socket) obj).close();
                        return;
                    }
                    a(socket, i10);
                    outputStream.write(bArr, 0, i10);
                    byteArrayOutputStream.write(bArr, 0, i10);
                    outputStream.flush();
                }
                break;
        }
    }

    public v0(b1 b1Var, TextView textView, Typeface typeface, int i10) {
        this.f15032a = 0;
        this.f15036h = b1Var;
        this.f15034d = textView;
        this.f15035f = typeface;
        this.f15033b = i10;
    }
}
