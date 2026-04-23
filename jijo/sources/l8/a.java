package l8;

import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f15361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f15362b = new StringBuilder();

    public a(String... strArr) {
        this.f15361a = strArr;
    }

    public final void a() {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b(DataOutputStream dataOutputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        while (true) {
            String[] strArr = this.f15361a;
            if (i10 >= strArr.length) {
                dataOutputStream.write(sb.toString().getBytes());
                return;
            }
            sb.append(strArr[i10] + " 2>&1");
            sb.append('\n');
            i10++;
        }
    }
}
