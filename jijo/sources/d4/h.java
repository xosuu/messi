package d4;

import android.content.Context;
import c2.n;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.ur0;
import k4.l;
import u3.j;

/* JADX INFO: loaded from: classes.dex */
public final class h extends t3.e implements q3.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ur0 f12361k = new ur0("AppSet.API", new w3.b(1), new n(1));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Context f12362i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s3.d f12363j;

    public h(Context context, s3.d dVar) {
        super(context, f12361k, t3.b.f16841a, t3.d.f16842b);
        this.f12362i = context;
        this.f12363j = dVar;
    }

    @Override // q3.a
    public final l a() {
        if (this.f12363j.c(this.f12362i, 212800000) != 0) {
            ApiException apiException = new ApiException(new Status(17, null, null, null));
            l lVar = new l();
            lVar.e(apiException);
            return lVar;
        }
        j jVar = new j();
        Feature[] featureArr = {q3.c.f16428a};
        jVar.f17585b = featureArr;
        jVar.f17588e = new m2.f(26, this);
        jVar.f17586c = false;
        jVar.f17587d = 27601;
        return c(0, new j(jVar, featureArr, false, 27601));
    }
}
