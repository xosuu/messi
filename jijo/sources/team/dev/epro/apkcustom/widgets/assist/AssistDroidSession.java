package team.dev.epro.apkcustom.widgets.assist;

import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import android.service.voice.VoiceInteractionSessionService;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class AssistDroidSession extends VoiceInteractionSessionService {
    static {
        NativeUtil.classesInit0(31);
    }

    @Override // android.service.voice.VoiceInteractionSessionService
    public final native VoiceInteractionSession onNewSession(Bundle bundle);
}
