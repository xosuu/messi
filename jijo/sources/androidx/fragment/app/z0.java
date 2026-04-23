package androidx.fragment.app;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class z0 extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f933a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f935d = new StringBuilder(NotificationCompat.FLAG_HIGH_PRIORITY);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f934b = "FragmentManager";

    public final void a() {
        if (((StringBuilder) this.f935d).length() > 0) {
            ((StringBuilder) this.f935d).toString();
            CharSequence charSequence = this.f935d;
            ((StringBuilder) charSequence).delete(0, ((StringBuilder) charSequence).length());
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        switch (this.f933a) {
            case 1:
                return append(charSequence);
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f933a) {
            case 0:
                a();
                break;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        switch (this.f933a) {
            case 0:
                a();
                break;
        }
    }

    @Override // java.io.Writer
    public final void write(int i10) throws IOException {
        switch (this.f933a) {
            case 1:
                ((Appendable) this.f934b).append((char) i10);
                break;
            default:
                super.write(i10);
                break;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i10, int i11) {
        switch (this.f933a) {
            case 1:
                return append(charSequence, i10, i11);
            default:
                return super.append(charSequence, i10, i11);
        }
    }

    @Override // java.io.Writer
    public final void write(String str, int i10, int i11) throws IOException {
        switch (this.f933a) {
            case 1:
                Objects.requireNonNull(str);
                ((Appendable) this.f934b).append(str, i10, i11 + i10);
                break;
            default:
                super.write(str, i10, i11);
                break;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) throws IOException {
        switch (this.f933a) {
            case 1:
                ((Appendable) this.f934b).append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i10, int i11) throws IOException {
        switch (this.f933a) {
            case 1:
                ((Appendable) this.f934b).append(charSequence, i10, i11);
                return this;
            default:
                return super.append(charSequence, i10, i11);
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) throws IOException {
        switch (this.f933a) {
            case 0:
                for (int i12 = 0; i12 < i11; i12++) {
                    char c10 = cArr[i10 + i12];
                    if (c10 == '\n') {
                        a();
                    } else {
                        ((StringBuilder) this.f935d).append(c10);
                    }
                }
                break;
            default:
                com.google.gson.internal.p pVar = (com.google.gson.internal.p) this.f935d;
                pVar.getClass();
                pVar.getClass();
                ((Appendable) this.f934b).append(pVar, i10, i11 + i10);
                break;
        }
    }
}
