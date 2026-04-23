package w6;

import g4.a0;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes.dex */
public final class a extends v6.a {
    @Override // v6.a
    public final Random b() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        a0.e(threadLocalRandomCurrent, "current()");
        return threadLocalRandomCurrent;
    }
}
