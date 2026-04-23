package e6;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Collection f12735a;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c(1));
        try {
            KeyFactory.getInstance("EC");
            arrayList.add(new d(2));
            arrayList.add(new d(1));
            arrayList.add(new d(0));
        } catch (GeneralSecurityException unused) {
        }
        arrayList.add(new c(2));
        arrayList.add(new c(0));
        f12735a = Collections.unmodifiableCollection(arrayList);
    }
}
