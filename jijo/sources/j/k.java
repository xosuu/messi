package j;

import android.view.View;
import l.x3;
import o0.e1;

/* JADX INFO: loaded from: classes.dex */
public final class k extends b4.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14273f;

    public k(l lVar) {
        this.f14270c = 0;
        this.f14273f = lVar;
        this.f14271d = false;
        this.f14272e = 0;
    }

    @Override // o0.e1
    public final void a() {
        int i10 = this.f14270c;
        Object obj = this.f14273f;
        switch (i10) {
            case 0:
                int i11 = this.f14272e + 1;
                this.f14272e = i11;
                l lVar = (l) obj;
                if (i11 == lVar.f14274a.size()) {
                    e1 e1Var = lVar.f14277d;
                    if (e1Var != null) {
                        e1Var.a();
                    }
                    this.f14272e = 0;
                    this.f14271d = false;
                    lVar.f14278e = false;
                }
                break;
            default:
                if (!this.f14271d) {
                    ((x3) obj).f15068a.setVisibility(this.f14272e);
                }
                break;
        }
    }

    @Override // b4.f, o0.e1
    public final void b(View view) {
        switch (this.f14270c) {
            case 1:
                this.f14271d = true;
                break;
        }
    }

    @Override // b4.f, o0.e1
    public final void c() {
        int i10 = this.f14270c;
        Object obj = this.f14273f;
        switch (i10) {
            case 0:
                if (!this.f14271d) {
                    this.f14271d = true;
                    e1 e1Var = ((l) obj).f14277d;
                    if (e1Var != null) {
                        e1Var.c();
                    }
                    break;
                }
                break;
            default:
                ((x3) obj).f15068a.setVisibility(0);
                break;
        }
    }

    public k(x3 x3Var, int i10) {
        this.f14270c = 1;
        this.f14273f = x3Var;
        this.f14272e = i10;
        this.f14271d = false;
    }
}
