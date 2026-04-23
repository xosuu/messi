package v8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes.dex */
public final class i extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0.c f17949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BufferedReader f17950b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17951d;

    public i(InputStream inputStream, r0.c cVar) {
        this.f17950b = new BufferedReader(new InputStreamReader(inputStream));
        this.f17949a = cVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z9;
        BufferedReader bufferedReader;
        String line;
        while (true) {
            try {
                z9 = this.f17951d;
                bufferedReader = this.f17950b;
            } catch (IOException unused) {
            }
            if (z9 || (line = bufferedReader.readLine()) == null) {
                try {
                    bufferedReader.close();
                    return;
                } catch (IOException unused2) {
                    return;
                }
            } else {
                r0.c cVar = this.f17949a;
                if (cVar != null) {
                    cVar.c(line);
                }
            }
        }
    }
}
