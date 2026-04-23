package okhttp3.internal.http2;

import java.io.IOException;
import l7.a;

/* JADX INFO: loaded from: classes.dex */
public final class StreamResetException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f16119a;

    public StreamResetException(a aVar) {
        super("stream was reset: " + aVar);
        this.f16119a = aVar;
    }
}
