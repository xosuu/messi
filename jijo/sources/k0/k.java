package k0;

import android.os.LocaleList;
import com.google.android.gms.internal.ads.kd1;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocaleList f14636a;

    public k(Object obj) {
        this.f14636a = kd1.g(obj);
    }

    @Override // k0.j
    public final String a() {
        return this.f14636a.toLanguageTags();
    }

    @Override // k0.j
    public final Object b() {
        return this.f14636a;
    }

    public final boolean equals(Object obj) {
        return this.f14636a.equals(((j) obj).b());
    }

    @Override // k0.j
    public final Locale get(int i10) {
        return this.f14636a.get(i10);
    }

    public final int hashCode() {
        return this.f14636a.hashCode();
    }

    @Override // k0.j
    public final boolean isEmpty() {
        return this.f14636a.isEmpty();
    }

    @Override // k0.j
    public final int size() {
        return this.f14636a.size();
    }

    public final String toString() {
        return this.f14636a.toString();
    }
}
