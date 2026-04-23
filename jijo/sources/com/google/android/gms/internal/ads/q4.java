package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f8101a = Pattern.compile("\\{([^}]*)\\}");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f8102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f8103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f8104d;

    static {
        Locale locale = Locale.US;
        f8102b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f8103c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f8104d = Pattern.compile("\\\\an(\\d+)");
    }
}
