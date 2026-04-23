package p7;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f16294a = Logger.getLogger(n.class.getName());

    public static a a(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getOutputStream() == null) {
            throw new IOException("socket's output stream == null");
        }
        l7.w wVar = new l7.w(1, socket);
        OutputStream outputStream = socket.getOutputStream();
        if (outputStream != null) {
            return new a(wVar, new a(outputStream, wVar));
        }
        throw new IllegalArgumentException("out == null");
    }

    public static b b(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        l7.w wVar = new l7.w(1, socket);
        InputStream inputStream = socket.getInputStream();
        if (inputStream != null) {
            return new b(wVar, new b(inputStream, wVar));
        }
        throw new IllegalArgumentException("in == null");
    }
}
