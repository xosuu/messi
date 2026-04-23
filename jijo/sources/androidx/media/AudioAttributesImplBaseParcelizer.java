package androidx.media;

import y1.a;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f1022a = aVar.f(audioAttributesImplBase.f1022a, 1);
        audioAttributesImplBase.f1023b = aVar.f(audioAttributesImplBase.f1023b, 2);
        audioAttributesImplBase.f1024c = aVar.f(audioAttributesImplBase.f1024c, 3);
        audioAttributesImplBase.f1025d = aVar.f(audioAttributesImplBase.f1025d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.getClass();
        aVar.j(audioAttributesImplBase.f1022a, 1);
        aVar.j(audioAttributesImplBase.f1023b, 2);
        aVar.j(audioAttributesImplBase.f1024c, 3);
        aVar.j(audioAttributesImplBase.f1025d, 4);
    }
}
