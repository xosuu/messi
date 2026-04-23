package m1;

import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class e1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final List f15444s = Collections.emptyList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f15445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f15446b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15454j;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RecyclerView f15462r;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15447c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15448d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f15449e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15450f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15451g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e1 f15452h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e1 f15453i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f15455k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f15456l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f15457m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public w0 f15458n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15459o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f15460p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15461q = -1;

    public e1(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f15445a = view;
    }

    public final void a(Object obj) {
        if (obj == null) {
            b(1024);
            return;
        }
        if ((1024 & this.f15454j) == 0) {
            if (this.f15455k == null) {
                ArrayList arrayList = new ArrayList();
                this.f15455k = arrayList;
                this.f15456l = Collections.unmodifiableList(arrayList);
            }
            this.f15455k.add(obj);
        }
    }

    public final void b(int i10) {
        this.f15454j = i10 | this.f15454j;
    }

    public final int c() {
        int i10 = this.f15451g;
        return i10 == -1 ? this.f15447c : i10;
    }

    public final List d() {
        ArrayList arrayList;
        return ((this.f15454j & 1024) != 0 || (arrayList = this.f15455k) == null || arrayList.size() == 0) ? f15444s : this.f15456l;
    }

    public final boolean e(int i10) {
        return (i10 & this.f15454j) != 0;
    }

    public final boolean f() {
        View view = this.f15445a;
        return (view.getParent() == null || view.getParent() == this.f15462r) ? false : true;
    }

    public final boolean g() {
        return (this.f15454j & 1) != 0;
    }

    public final boolean h() {
        return (this.f15454j & 4) != 0;
    }

    public final boolean i() {
        if ((this.f15454j & 16) == 0) {
            WeakHashMap weakHashMap = o0.v0.f16075a;
            if (!o0.d0.i(this.f15445a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        return (this.f15454j & 8) != 0;
    }

    public final boolean k() {
        return this.f15458n != null;
    }

    public final boolean l() {
        return (this.f15454j & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
    }

    public final boolean m() {
        return (this.f15454j & 2) != 0;
    }

    public final void n(int i10, boolean z9) {
        if (this.f15448d == -1) {
            this.f15448d = this.f15447c;
        }
        if (this.f15451g == -1) {
            this.f15451g = this.f15447c;
        }
        if (z9) {
            this.f15451g += i10;
        }
        this.f15447c += i10;
        View view = this.f15445a;
        if (view.getLayoutParams() != null) {
            ((q0) view.getLayoutParams()).f15602c = true;
        }
    }

    public final void o() {
        this.f15454j = 0;
        this.f15447c = -1;
        this.f15448d = -1;
        this.f15449e = -1L;
        this.f15451g = -1;
        this.f15457m = 0;
        this.f15452h = null;
        this.f15453i = null;
        ArrayList arrayList = this.f15455k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f15454j &= -1025;
        this.f15460p = 0;
        this.f15461q = -1;
        RecyclerView.j(this);
    }

    public final void p(boolean z9) {
        int i10 = this.f15457m;
        int i11 = z9 ? i10 - 1 : i10 + 1;
        this.f15457m = i11;
        if (i11 < 0) {
            this.f15457m = 0;
            toString();
        } else if (!z9 && i11 == 1) {
            this.f15454j |= 16;
        } else if (z9 && i11 == 0) {
            this.f15454j &= -17;
        }
    }

    public final boolean q() {
        return (this.f15454j & NotificationCompat.FLAG_HIGH_PRIORITY) != 0;
    }

    public final boolean r() {
        return (this.f15454j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sbK = l.a0.k(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        sbK.append(Integer.toHexString(hashCode()));
        sbK.append(" position=");
        sbK.append(this.f15447c);
        sbK.append(" id=");
        sbK.append(this.f15449e);
        sbK.append(", oldPos=");
        sbK.append(this.f15448d);
        sbK.append(", pLpos:");
        sbK.append(this.f15451g);
        StringBuilder sb = new StringBuilder(sbK.toString());
        if (k()) {
            sb.append(" scrap ");
            sb.append(this.f15459o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (h()) {
            sb.append(" invalid");
        }
        if (!g()) {
            sb.append(" unbound");
        }
        if ((this.f15454j & 2) != 0) {
            sb.append(" update");
        }
        if (j()) {
            sb.append(" removed");
        }
        if (q()) {
            sb.append(" ignored");
        }
        if (l()) {
            sb.append(" tmpDetached");
        }
        if (!i()) {
            sb.append(" not recyclable(" + this.f15457m + ")");
        }
        if ((this.f15454j & 512) != 0 || h()) {
            sb.append(" undefined adapter position");
        }
        if (this.f15445a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
