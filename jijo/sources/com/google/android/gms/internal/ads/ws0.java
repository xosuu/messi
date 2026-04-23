package com.google.android.gms.internal.ads;

import dev.epro.v2ray.util.V2rayConfigUtil;

/* JADX INFO: loaded from: classes.dex */
public enum ws0 {
    f10328b("signals"),
    f10329d("request-parcel"),
    f10330f("server-transaction"),
    f10331h("renderer"),
    f10332q("gms-signals"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("ad_request"),
    f10333s("build-url"),
    f10334t("prepare-http-request"),
    f10335u("http"),
    f10336v(V2rayConfigUtil.TAG_AGENT),
    f10337w("preprocess"),
    f10338x("get-signals"),
    f10339y("js-signals"),
    f10340z("render-config-init"),
    A("render-config-waterfall"),
    /* JADX INFO: Fake field, exist only in values array */
    EF7("render-config-parallel"),
    B("adapter-load-ad-syn"),
    C("adapter-load-ad-ack"),
    D("wrap-adapter"),
    E("custom-render-syn"),
    F("custom-render-ack"),
    G("webview-cookie"),
    H("generate-signals"),
    I("get-cache-key"),
    J("notify-cache-hit"),
    K("get-url-and-cache-key"),
    L("preloaded-loader");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10341a;

    ws0(String str) {
        this.f10341a = str;
    }
}
