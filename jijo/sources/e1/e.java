package e1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.emoji2.text.v;
import com.google.android.gms.internal.ads.fb1;
import g4.z;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f12624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12625b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f12626d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RandomAccessFile f12627f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FileChannel f12628h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final FileLock f12629q;

    public e(File file, File file2) throws Throwable {
        file.getPath();
        file2.getPath();
        this.f12624a = file;
        this.f12626d = file2;
        this.f12625b = c(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f12627f = randomAccessFile;
        try {
            try {
                FileChannel channel = randomAccessFile.getChannel();
                this.f12628h = channel;
                try {
                    file3.getPath();
                    this.f12629q = channel.lock();
                    file3.getPath();
                } catch (IOException e10) {
                    e = e10;
                    try {
                        this.f12628h.close();
                    } catch (IOException unused) {
                    }
                    throw e;
                } catch (Error e11) {
                    e = e11;
                    this.f12628h.close();
                    throw e;
                } catch (RuntimeException e12) {
                    e = e12;
                    this.f12628h.close();
                    throw e;
                }
            } catch (IOException e13) {
                e = e13;
                try {
                    this.f12627f.close();
                } catch (IOException unused2) {
                }
                throw e;
            }
        } catch (Error e14) {
            e = e14;
            this.f12627f.close();
            throw e;
        } catch (RuntimeException e15) {
            e = e15;
            this.f12627f.close();
            throw e;
        }
    }

    public static void D(Context context, long j10, long j11, ArrayList arrayList) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("multidex.version", 4).edit();
        editorEdit.putLong("timestamp", j10);
        editorEdit.putLong("crc", j11);
        editorEdit.putInt("dex.number", arrayList.size() + 1);
        Iterator it = arrayList.iterator();
        int i10 = 2;
        while (it.hasNext()) {
            d dVar = (d) it.next();
            editorEdit.putLong(fb1.g("dex.crc.", i10), dVar.f12623a);
            editorEdit.putLong("dex.time." + i10, dVar.lastModified());
            i10++;
        }
        editorEdit.commit();
    }

    public static void a(ZipFile zipFile, ZipEntry zipEntry, d dVar, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile(g1.a.q("tmp-", str), ".zip", dVar.getParentFile());
        fileCreateTempFile.getPath();
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int i10 = inputStream.read(bArr); i10 != -1; i10 = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, i10);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + dVar.getAbsolutePath() + "\")");
                }
                dVar.getPath();
                if (fileCreateTempFile.renameTo(dVar)) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                    fileCreateTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + dVar.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
            fileCreateTempFile.delete();
            throw th2;
        }
    }

    public static long c(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            v vVarJ = z.j(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j10 = vVarJ.f649b;
            randomAccessFile.seek(vVarJ.f648a);
            byte[] bArr = new byte[16384];
            int i10 = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j10));
            while (i10 != -1) {
                crc32.update(bArr, 0, i10);
                j10 -= (long) i10;
                if (j10 == 0) {
                    break;
                }
                i10 = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j10));
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            return value == -1 ? value - 1 : value;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    public final ArrayList A() {
        StringBuilder sb = new StringBuilder();
        File file = this.f12624a;
        sb.append(file.getName());
        sb.append(".classes");
        String string = sb.toString();
        c cVar = new c();
        File file2 = this.f12626d;
        File[] fileArrListFiles = file2.listFiles(cVar);
        if (fileArrListFiles == null) {
            file2.getPath();
        } else {
            for (File file3 : fileArrListFiles) {
                file3.getPath();
                file3.length();
                if (file3.delete()) {
                    file3.getPath();
                } else {
                    file3.getPath();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("classes");
            int i10 = 2;
            sb2.append(2);
            sb2.append(".dex");
            ZipEntry entry = zipFile.getEntry(sb2.toString());
            while (entry != null) {
                d dVar = new d(file2, string + i10 + ".zip");
                arrayList.add(dVar);
                dVar.toString();
                int i11 = 0;
                boolean z9 = false;
                while (i11 < 3 && !z9) {
                    i11++;
                    a(zipFile, entry, dVar, string);
                    try {
                        dVar.f12623a = c(dVar);
                        z9 = true;
                    } catch (IOException unused) {
                        dVar.getAbsolutePath();
                        z9 = false;
                    }
                    dVar.getAbsolutePath();
                    dVar.length();
                    if (!z9) {
                        dVar.delete();
                        if (dVar.exists()) {
                            dVar.getPath();
                        }
                    }
                }
                if (!z9) {
                    throw new IOException("Could not create zip file " + dVar.getAbsolutePath() + " for secondary dex (" + i10 + ")");
                }
                i10++;
                entry = zipFile.getEntry("classes" + i10 + ".dex");
            }
            return arrayList;
        } finally {
            try {
                zipFile.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f12629q.release();
        this.f12628h.close();
        this.f12627f.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList e(android.content.Context r12, boolean r13) {
        /*
            r11 = this;
            java.io.File r0 = r11.f12624a
            r0.getPath()
            java.nio.channels.FileLock r1 = r11.f12629q
            boolean r1 = r1.isValid()
            if (r1 == 0) goto L70
            r1 = 1
            r3 = -1
            if (r13 != 0) goto L56
            java.lang.String r13 = "multidex.version"
            r5 = 4
            android.content.SharedPreferences r13 = r12.getSharedPreferences(r13, r5)
            java.lang.String r5 = "timestamp"
            long r5 = r13.getLong(r5, r3)
            long r7 = r0.lastModified()
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 != 0) goto L29
            long r7 = r7 - r1
        L29:
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L56
            java.lang.String r5 = "crc"
            long r5 = r13.getLong(r5, r3)
            long r7 = r11.f12625b
            int r13 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r13 == 0) goto L3a
            goto L56
        L3a:
            java.util.ArrayList r12 = r11.u(r12)     // Catch: java.io.IOException -> L3f
            goto L6c
        L3f:
            java.util.ArrayList r13 = r11.A()
            long r5 = r0.lastModified()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L4c
            long r5 = r5 - r1
        L4c:
            r1 = r5
            long r3 = r11.f12625b
            r0 = r12
            r5 = r13
            D(r0, r1, r3, r5)
        L54:
            r12 = r13
            goto L6c
        L56:
            java.util.ArrayList r13 = r11.A()
            long r5 = r0.lastModified()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L63
            long r5 = r5 - r1
        L63:
            r6 = r5
            long r8 = r11.f12625b
            r5 = r12
            r10 = r13
            D(r5, r6, r8, r10)
            goto L54
        L6c:
            r12.size()
            return r12
        L70:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "MultiDexExtractor was closed"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.e.e(android.content.Context, boolean):java.util.ArrayList");
    }

    public final ArrayList u(Context context) throws IOException {
        String str = this.f12624a.getName() + ".classes";
        SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
        int i10 = sharedPreferences.getInt("dex.number", 1);
        ArrayList arrayList = new ArrayList(i10 - 1);
        for (int i11 = 2; i11 <= i10; i11++) {
            d dVar = new d(this.f12626d, str + i11 + ".zip");
            if (!dVar.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + dVar.getPath() + "'");
            }
            dVar.f12623a = c(dVar);
            long j10 = sharedPreferences.getLong("dex.crc." + i11, -1L);
            long j11 = sharedPreferences.getLong("dex.time." + i11, -1L);
            long jLastModified = dVar.lastModified();
            if (j11 != jLastModified || j10 != dVar.f12623a) {
                throw new IOException("Invalid extracted dex: " + dVar + " (key \"\"), expected modification time: " + j11 + ", modification time: " + jLastModified + ", expected crc: " + j10 + ", file crc: " + dVar.f12623a);
            }
            arrayList.add(dVar);
        }
        return arrayList;
    }
}
