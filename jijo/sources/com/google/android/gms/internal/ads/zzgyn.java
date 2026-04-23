package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class zzgyn extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11646a;

    public static zzgym a() {
        return new zzgym("Protocol message tag had invalid wire type.");
    }

    public static zzgyn b() {
        return new zzgyn("Protocol message had invalid UTF-8.");
    }

    public static zzgyn c() {
        return new zzgyn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzgyn d() {
        return new zzgyn("Failed to parse the message.");
    }

    public static zzgyn e() {
        return new zzgyn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
