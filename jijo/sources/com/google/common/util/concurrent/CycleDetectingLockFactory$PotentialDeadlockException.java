package com.google.common.util.concurrent;

import com.google.android.gms.internal.ads.en1;
import com.google.android.gms.internal.ads.tp1;
import java.util.Objects;
import m5.f;

/* JADX INFO: loaded from: classes.dex */
public final class CycleDetectingLockFactory$PotentialDeadlockException extends IllegalStateException {
    static {
        f.g(3, en1.class.getName(), CycleDetectingLockFactory$PotentialDeadlockException.class.getName(), tp1.class.getName());
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        Objects.requireNonNull(message);
        return new StringBuilder(message).toString();
    }
}
