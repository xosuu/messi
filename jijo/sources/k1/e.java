package k1;

import android.adservices.topics.GetTopicsRequest;
import g4.a0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends g {
    @Override // k1.g
    public final GetTopicsRequest X(a aVar) {
        a0.f(aVar, "request");
        GetTopicsRequest getTopicsRequestBuild = j1.b.d().setAdsSdkName(aVar.f14638a).setShouldRecordObservation(aVar.f14639b).build();
        a0.e(getTopicsRequestBuild, "Builder()\n            .s…ion)\n            .build()");
        return getTopicsRequestBuild;
    }
}
