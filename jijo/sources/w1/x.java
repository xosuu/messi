package w1;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f18148b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f18147a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f18149c = new ArrayList();

    public x(View view) {
        this.f18148b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f18148b == xVar.f18148b && this.f18147a.equals(xVar.f18147a);
    }

    public final int hashCode() {
        return this.f18147a.hashCode() + (this.f18148b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbK = l.a0.k("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbK.append(this.f18148b);
        sbK.append("\n");
        String strY = g1.a.y(sbK.toString(), "    values:");
        HashMap map = this.f18147a;
        for (String str : map.keySet()) {
            strY = strY + "    " + str + ": " + map.get(str) + "\n";
        }
        return strY;
    }
}
