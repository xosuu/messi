package team.dev.epro.apkcustom.widgets.io.pem;

import java.io.IOException;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class PemGenerationException extends IOException {
    static {
        NativeUtil.classesInit0(80);
    }

    @Override // java.lang.Throwable
    public final native Throwable getCause();
}
