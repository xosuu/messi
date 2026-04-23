package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yk0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zk0 f10924b;

    public /* synthetic */ yk0(zk0 zk0Var, int i10) {
        this.f10923a = i10;
        this.f10924b = zk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10923a) {
            case 0:
                zk0 zk0Var = this.f10924b;
                synchronized (zk0Var) {
                    zk0Var.f11258b.clear();
                    zk0Var.f11257a.clear();
                    zk0Var.f11261e.clear();
                    zk0Var.f11260d.clear();
                    zk0Var.i();
                    zk0Var.j();
                    zk0Var.g();
                }
                return;
            default:
                zk0 zk0Var2 = this.f10924b;
                zk0Var2.getClass();
                zk0Var2.f11262f.execute(new yk0(zk0Var2, 0));
                return;
        }
    }
}
