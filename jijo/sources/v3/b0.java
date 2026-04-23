package v3;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import com.google.android.gms.internal.ads.fb1;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17722a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17723b;

    public /* synthetic */ b0(c0 c0Var) {
        this.f17723b = c0Var;
    }

    private final boolean a(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (((c0) this.f17723b).f17727a) {
                try {
                    z zVar = (z) message.obj;
                    a0 a0Var = (a0) ((c0) this.f17723b).f17727a.get(zVar);
                    if (a0Var != null && a0Var.f17715a.isEmpty()) {
                        if (a0Var.f17717c) {
                            a0Var.f17721g.f17729c.removeMessages(1, a0Var.f17719e);
                            c0 c0Var = a0Var.f17721g;
                            c0Var.f17730d.b(c0Var.f17728b, a0Var);
                            a0Var.f17717c = false;
                            a0Var.f17716b = 2;
                        }
                        ((c0) this.f17723b).f17727a.remove(zVar);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        synchronized (((c0) this.f17723b).f17727a) {
            try {
                z zVar2 = (z) message.obj;
                a0 a0Var2 = (a0) ((c0) this.f17723b).f17727a.get(zVar2);
                if (a0Var2 != null && a0Var2.f17716b == 3) {
                    String.valueOf(zVar2);
                    new Exception();
                    ComponentName componentName = a0Var2.f17720f;
                    if (componentName == null) {
                        zVar2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = zVar2.f17806b;
                        z3.a.l(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    a0Var2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f17722a) {
            case 0:
                return a(message);
            default:
                if (message.what != 0) {
                    return false;
                }
                j2.h hVar = (j2.h) this.f17723b;
                fb1.t(message.obj);
                synchronized (hVar.f14297a) {
                    fb1.t(hVar.f14299d);
                    throw null;
                }
        }
    }

    public b0(j2.h hVar) {
        this.f17723b = hVar;
    }
}
