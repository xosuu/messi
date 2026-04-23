package d0;

import android.content.LocusId;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static LocusId a(String str) {
        return new LocusId(str);
    }

    public static String b(LocusId locusId) {
        return locusId.getId();
    }
}
