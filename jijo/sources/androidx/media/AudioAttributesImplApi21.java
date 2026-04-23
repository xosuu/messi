package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import com.google.android.gms.internal.ads.sf;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(sf.zzm)
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributes f1020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1021b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f1020a.equals(((AudioAttributesImplApi21) obj).f1020a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1020a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f1020a;
    }
}
