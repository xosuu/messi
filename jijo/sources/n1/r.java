package n1;

import android.content.Context;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import g4.d0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public final class r implements r1.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15882b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f15883d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15884f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r1.d f15885h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a f15886q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f15887s;

    public r(Context context, String str, File file, int i10, r1.d dVar) {
        this.f15881a = context;
        this.f15882b = str;
        this.f15883d = file;
        this.f15884f = i10;
        this.f15885h = dVar;
    }

    public final void a(File file) throws IOException {
        ReadableByteChannel channel;
        Context context = this.f15881a;
        String str = this.f15882b;
        if (str != null) {
            channel = Channels.newChannel(context.getAssets().open(str));
        } else {
            File file2 = this.f15883d;
            if (file2 == null) {
                throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
            }
            channel = new FileInputStream(file2).getChannel();
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", context.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        FileChannel channel2 = new FileOutputStream(fileCreateTempFile).getChannel();
        try {
            if (Build.VERSION.SDK_INT <= 23) {
                InputStream inputStreamNewInputStream = Channels.newInputStream(channel);
                OutputStream outputStreamNewOutputStream = Channels.newOutputStream(channel2);
                byte[] bArr = new byte[NotificationCompat.FLAG_BUBBLE];
                while (true) {
                    int i10 = inputStreamNewInputStream.read(bArr);
                    if (i10 <= 0) {
                        break;
                    } else {
                        outputStreamNewOutputStream.write(bArr, 0, i10);
                    }
                }
            } else {
                channel2.transferFrom(channel, 0L, Long.MAX_VALUE);
            }
            channel2.force(false);
            channel.close();
            channel2.close();
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                throw new IOException("Failed to create directories for " + file.getAbsolutePath());
            }
            if (fileCreateTempFile.renameTo(file)) {
                return;
            }
            throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
        } catch (Throwable th) {
            channel.close();
            channel2.close();
            throw th;
        }
    }

    public final void c() {
        String databaseName = this.f15885h.getDatabaseName();
        Context context = this.f15881a;
        File databasePath = context.getDatabasePath(databaseName);
        p1.a aVar = new p1.a(databaseName, context.getFilesDir(), this.f15886q == null);
        try {
            aVar.f16201b.lock();
            if (aVar.f16202c) {
                try {
                    FileChannel channel = new FileOutputStream(aVar.f16200a).getChannel();
                    aVar.f16203d = channel;
                    channel.lock();
                } catch (IOException e10) {
                    throw new IllegalStateException("Unable to grab copy lock.", e10);
                }
            }
            if (!databasePath.exists()) {
                try {
                    a(databasePath);
                } catch (IOException e11) {
                    throw new RuntimeException("Unable to copy database file.", e11);
                }
            } else {
                if (this.f15886q == null) {
                    return;
                }
                try {
                    int iH = d0.h(databasePath);
                    int i10 = this.f15884f;
                    if (iH == i10) {
                        return;
                    }
                    if (this.f15886q.a(iH, i10)) {
                        return;
                    }
                    if (context.deleteDatabase(databaseName)) {
                        try {
                            a(databasePath);
                        } catch (IOException unused) {
                        }
                    }
                } catch (IOException unused2) {
                }
            }
        } finally {
            aVar.a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f15885h.close();
        this.f15887s = false;
    }

    @Override // r1.d
    public final String getDatabaseName() {
        return this.f15885h.getDatabaseName();
    }

    @Override // r1.d
    public final void setWriteAheadLoggingEnabled(boolean z9) {
        this.f15885h.setWriteAheadLoggingEnabled(z9);
    }

    @Override // r1.d
    public final synchronized r1.a y() {
        try {
            if (!this.f15887s) {
                c();
                this.f15887s = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f15885h.y();
    }
}
