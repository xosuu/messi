package u8;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17665b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17666d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f17667f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f17668h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final File f17669q;

    public a(String str, String str2, String str3, String str4, String str5, File file) {
        this.f17664a = str;
        this.f17665b = str2;
        this.f17666d = str3;
        this.f17667f = str4;
        this.f17668h = str5;
        this.f17669q = file;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a aVar = (a) obj;
        File file = this.f17669q;
        if (file != null) {
            return new Long(file.lastModified()).compareTo(new Long(aVar.f17669q.lastModified()));
        }
        throw new IllegalArgumentException();
    }
}
