package v3;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.internal.ads.fb1;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Account f17764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f17765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f17766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f17767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f17769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i4.a f17770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f17771h;

    public g(Account account, s.c cVar, String str, String str2, i4.a aVar) {
        this.f17764a = account;
        Set setEmptySet = cVar == null ? Collections.emptySet() : Collections.unmodifiableSet(cVar);
        this.f17765b = setEmptySet;
        Map mapEmptyMap = Collections.emptyMap();
        this.f17768e = str;
        this.f17769f = str2;
        this.f17770g = aVar == null ? i4.a.f14173b : aVar;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator it = mapEmptyMap.values().iterator();
        if (it.hasNext()) {
            fb1.t(it.next());
            throw null;
        }
        this.f17766c = Collections.unmodifiableSet(hashSet);
    }
}
