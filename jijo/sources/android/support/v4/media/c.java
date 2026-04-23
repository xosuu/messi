package android.support.v4.media;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.MediaDrmResetException;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ boolean A(Throwable th) {
        return th instanceof MediaDrmResetException;
    }

    public static /* synthetic */ Notification.Action.Builder c(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(icon, charSequence, pendingIntent);
    }

    public static /* bridge */ /* synthetic */ Icon f(Object obj) {
        return (Icon) obj;
    }

    public static /* bridge */ /* synthetic */ AudioDeviceInfo g(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    public static /* synthetic */ AudioTrack.Builder h() {
        return new AudioTrack.Builder();
    }

    public static /* bridge */ /* synthetic */ boolean z(Object obj) {
        return obj instanceof Icon;
    }
}
