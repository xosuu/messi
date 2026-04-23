package androidx.media;

import android.media.AudioAttributes;
import y1.a;
import y1.b;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f1020a = (AudioAttributes) aVar.g(audioAttributesImplApi21.f1020a, 1);
        audioAttributesImplApi21.f1021b = aVar.f(audioAttributesImplApi21.f1021b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, a aVar) {
        aVar.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.f1020a;
        aVar.i(1);
        ((b) aVar).f20440e.writeParcelable(audioAttributes, 0);
        aVar.j(audioAttributesImplApi21.f1021b, 2);
    }
}
