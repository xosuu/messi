package com.google.gson;

import com.google.android.gms.internal.ads.fb1;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class v implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f12259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f12260b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ v[] f12261d;

    static {
        r rVar = new r();
        f12259a = rVar;
        s sVar = new s();
        f12260b = sVar;
        f12261d = new v[]{rVar, sVar, new v() { // from class: com.google.gson.t
            @Override // com.google.gson.w
            public final Number a(s5.a aVar) throws IOException {
                String strR = aVar.R();
                try {
                    return Long.valueOf(Long.parseLong(strR));
                } catch (NumberFormatException unused) {
                    try {
                        Double dValueOf = Double.valueOf(strR);
                        if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                            if (!aVar.f16710b) {
                                throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + aVar.F(true));
                            }
                        }
                        return dValueOf;
                    } catch (NumberFormatException e10) {
                        StringBuilder sbK = fb1.k("Cannot parse ", strR, "; at path ");
                        sbK.append(aVar.F(true));
                        throw new JsonParseException(sbK.toString(), e10);
                    }
                }
            }
        }, new v() { // from class: com.google.gson.u
            @Override // com.google.gson.w
            public final Number a(s5.a aVar) throws IOException {
                String strR = aVar.R();
                try {
                    return new BigDecimal(strR);
                } catch (NumberFormatException e10) {
                    StringBuilder sbK = fb1.k("Cannot parse ", strR, "; at path ");
                    sbK.append(aVar.F(true));
                    throw new JsonParseException(sbK.toString(), e10);
                }
            }
        }};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f12261d.clone();
    }
}
