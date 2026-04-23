package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.HashMap;
import n1.m;
import n1.n;

/* JADX INFO: loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1109a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f1110b = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f1111d = new m(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f1112f = new n(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f1112f;
    }
}
