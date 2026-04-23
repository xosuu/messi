package team.dev.epro.apkcustom.widgets.assist;

import android.content.Intent;
import android.service.voice.VoiceInteractionService;
import f.g0;
import org.joda.time.DateTimeConstants;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class AssistDroid extends VoiceInteractionService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f17395a = new g0(11, this);

    static {
        NativeUtil.classesInit0(DateTimeConstants.HOURS_PER_WEEK);
    }

    @Override // android.service.voice.VoiceInteractionService
    public final native void onReady();

    @Override // android.service.voice.VoiceInteractionService
    public final native void onShutdown();

    @Override // android.app.Service
    public final native int onStartCommand(Intent intent, int i10, int i11);
}
