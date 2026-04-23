package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class nn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f7325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f7326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f7327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal f7328d = new ThreadLocal();

    public nn0() {
        f(0L);
    }

    public final synchronized long a(long j10) {
        try {
            if (!g()) {
                long jLongValue = this.f7325a;
                if (jLongValue == 9223372036854775806L) {
                    Long l9 = (Long) this.f7328d.get();
                    l9.getClass();
                    jLongValue = l9.longValue();
                }
                this.f7326b = jLongValue - j10;
                notifyAll();
            }
            this.f7327c = j10;
        } catch (Throwable th) {
            throw th;
        }
        return j10 + this.f7326b;
    }

    public final synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f7327c;
            if (j11 != -9223372036854775807L) {
                long j12 = (j11 * 90000) / 1000000;
                long j13 = (4294967296L + j12) / 8589934592L;
                long j14 = (((-1) + j13) * 8589934592L) + j10;
                long j15 = (j13 * 8589934592L) + j10;
                j10 = Math.abs(j14 - j12) < Math.abs(j15 - j12) ? j14 : j15;
            }
            return a((j10 * 1000000) / 90000);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c(long j10) {
        long j11;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j12 = this.f7327c;
        if (j12 != -9223372036854775807L) {
            long j13 = (j12 * 90000) / 1000000;
            long j14 = j13 / 8589934592L;
            Long.signum(j14);
            long j15 = (j14 * 8589934592L) + j10;
            j11 = ((j14 + 1) * 8589934592L) + j10;
            if (j15 >= j13) {
                j11 = j15;
            }
        } else {
            j11 = j10;
        }
        return a((j11 * 1000000) / 90000);
    }

    public final synchronized long d() {
        long j10 = this.f7325a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j10;
    }

    public final synchronized long e() {
        return this.f7326b;
    }

    public final synchronized void f(long j10) {
        this.f7325a = j10;
        this.f7326b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f7327c = -9223372036854775807L;
    }

    public final synchronized boolean g() {
        return this.f7326b != -9223372036854775807L;
    }
}
