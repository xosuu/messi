package v6;

import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends d {
    @Override // v6.d
    public final int a() {
        return b().nextInt();
    }

    public abstract Random b();
}
