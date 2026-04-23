package d9;

import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class a extends VoiceInteractionSession {
    static {
        NativeUtil.classesInit0(124);
    }

    @Override // android.service.voice.VoiceInteractionSession
    public final native void onPrepareShow(Bundle bundle, int i10);
}
