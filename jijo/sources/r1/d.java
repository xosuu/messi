package r1;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public interface d extends Closeable {
    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z9);

    a y();
}
