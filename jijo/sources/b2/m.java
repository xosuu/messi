package b2;

import b7.u;

/* JADX INFO: loaded from: classes.dex */
public final class m extends b {
    @Override // b2.c
    public final boolean b() {
        if (!super.b() || !u.t("MULTI_PROCESS")) {
            return false;
        }
        int i10 = a2.c.f10a;
        if (n.f1249b.b()) {
            return o.f1252a.getStatics().isMultiProcessEnabled();
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }
}
