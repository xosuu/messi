package z;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f20550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f20551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f20552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f20553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap f20554f;

    public h() {
        k kVar = new k();
        kVar.f20607a = 0;
        kVar.f20608b = 0;
        kVar.f20609c = 1.0f;
        kVar.f20610d = Float.NaN;
        this.f20550b = kVar;
        j jVar = new j();
        jVar.f20598a = -1;
        jVar.f20599b = 0;
        jVar.f20600c = -1;
        jVar.f20601d = Float.NaN;
        jVar.f20602e = Float.NaN;
        jVar.f20603f = Float.NaN;
        jVar.f20604g = -1;
        jVar.f20605h = null;
        jVar.f20606i = -1;
        this.f20551c = jVar;
        i iVar = new i();
        iVar.f20556a = false;
        iVar.f20562d = -1;
        iVar.f20564e = -1;
        iVar.f20566f = -1.0f;
        iVar.f20568g = true;
        iVar.f20570h = -1;
        iVar.f20572i = -1;
        iVar.f20574j = -1;
        iVar.f20576k = -1;
        iVar.f20578l = -1;
        iVar.f20580m = -1;
        iVar.f20582n = -1;
        iVar.f20584o = -1;
        iVar.f20586p = -1;
        iVar.f20587q = -1;
        iVar.f20588r = -1;
        iVar.f20589s = -1;
        iVar.f20590t = -1;
        iVar.f20591u = -1;
        iVar.f20592v = -1;
        iVar.f20593w = 0.5f;
        iVar.f20594x = 0.5f;
        iVar.f20595y = null;
        iVar.f20596z = -1;
        iVar.A = 0;
        iVar.B = 0.0f;
        iVar.C = -1;
        iVar.D = -1;
        iVar.E = -1;
        iVar.F = 0;
        iVar.G = 0;
        iVar.H = 0;
        iVar.I = 0;
        iVar.J = 0;
        iVar.K = 0;
        iVar.L = 0;
        iVar.M = Integer.MIN_VALUE;
        iVar.N = Integer.MIN_VALUE;
        iVar.O = Integer.MIN_VALUE;
        iVar.P = Integer.MIN_VALUE;
        iVar.Q = Integer.MIN_VALUE;
        iVar.R = Integer.MIN_VALUE;
        iVar.S = Integer.MIN_VALUE;
        iVar.T = -1.0f;
        iVar.U = -1.0f;
        iVar.V = 0;
        iVar.W = 0;
        iVar.X = 0;
        iVar.Y = 0;
        iVar.Z = 0;
        iVar.f20557a0 = 0;
        iVar.f20559b0 = 0;
        iVar.f20561c0 = 0;
        iVar.f20563d0 = 1.0f;
        iVar.f20565e0 = 1.0f;
        iVar.f20567f0 = -1;
        iVar.f20569g0 = 0;
        iVar.f20571h0 = -1;
        iVar.f20579l0 = false;
        iVar.f20581m0 = false;
        iVar.f20583n0 = true;
        iVar.f20585o0 = 0;
        this.f20552d = iVar;
        l lVar = new l();
        lVar.f20612a = 0.0f;
        lVar.f20613b = 0.0f;
        lVar.f20614c = 0.0f;
        lVar.f20615d = 1.0f;
        lVar.f20616e = 1.0f;
        lVar.f20617f = Float.NaN;
        lVar.f20618g = Float.NaN;
        lVar.f20619h = -1;
        lVar.f20620i = 0.0f;
        lVar.f20621j = 0.0f;
        lVar.f20622k = 0.0f;
        lVar.f20623l = false;
        lVar.f20624m = 0.0f;
        this.f20553e = lVar;
        this.f20554f = new HashMap();
    }

    public final void a(d dVar) {
        i iVar = this.f20552d;
        dVar.f20492e = iVar.f20570h;
        dVar.f20494f = iVar.f20572i;
        dVar.f20496g = iVar.f20574j;
        dVar.f20498h = iVar.f20576k;
        dVar.f20500i = iVar.f20578l;
        dVar.f20502j = iVar.f20580m;
        dVar.f20504k = iVar.f20582n;
        dVar.f20506l = iVar.f20584o;
        dVar.f20508m = iVar.f20586p;
        dVar.f20510n = iVar.f20587q;
        dVar.f20512o = iVar.f20588r;
        dVar.f20518s = iVar.f20589s;
        dVar.f20519t = iVar.f20590t;
        dVar.f20520u = iVar.f20591u;
        dVar.f20521v = iVar.f20592v;
        ((ViewGroup.MarginLayoutParams) dVar).leftMargin = iVar.F;
        ((ViewGroup.MarginLayoutParams) dVar).rightMargin = iVar.G;
        ((ViewGroup.MarginLayoutParams) dVar).topMargin = iVar.H;
        ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = iVar.I;
        dVar.A = iVar.R;
        dVar.B = iVar.Q;
        dVar.f20523x = iVar.N;
        dVar.f20525z = iVar.P;
        dVar.E = iVar.f20593w;
        dVar.F = iVar.f20594x;
        dVar.f20514p = iVar.f20596z;
        dVar.f20516q = iVar.A;
        dVar.f20517r = iVar.B;
        dVar.G = iVar.f20595y;
        dVar.T = iVar.C;
        dVar.U = iVar.D;
        dVar.I = iVar.T;
        dVar.H = iVar.U;
        dVar.K = iVar.W;
        dVar.J = iVar.V;
        dVar.W = iVar.f20579l0;
        dVar.X = iVar.f20581m0;
        dVar.L = iVar.X;
        dVar.M = iVar.Y;
        dVar.P = iVar.Z;
        dVar.Q = iVar.f20557a0;
        dVar.N = iVar.f20559b0;
        dVar.O = iVar.f20561c0;
        dVar.R = iVar.f20563d0;
        dVar.S = iVar.f20565e0;
        dVar.V = iVar.E;
        dVar.f20488c = iVar.f20566f;
        dVar.f20484a = iVar.f20562d;
        dVar.f20486b = iVar.f20564e;
        ((ViewGroup.MarginLayoutParams) dVar).width = iVar.f20558b;
        ((ViewGroup.MarginLayoutParams) dVar).height = iVar.f20560c;
        String str = iVar.f20577k0;
        if (str != null) {
            dVar.Y = str;
        }
        dVar.Z = iVar.f20585o0;
        dVar.setMarginStart(iVar.K);
        dVar.setMarginEnd(iVar.J);
        dVar.a();
    }

    public final Object clone() {
        h hVar = new h();
        i iVar = hVar.f20552d;
        iVar.getClass();
        i iVar2 = this.f20552d;
        iVar.f20556a = iVar2.f20556a;
        iVar.f20558b = iVar2.f20558b;
        iVar.f20560c = iVar2.f20560c;
        iVar.f20562d = iVar2.f20562d;
        iVar.f20564e = iVar2.f20564e;
        iVar.f20566f = iVar2.f20566f;
        iVar.f20568g = iVar2.f20568g;
        iVar.f20570h = iVar2.f20570h;
        iVar.f20572i = iVar2.f20572i;
        iVar.f20574j = iVar2.f20574j;
        iVar.f20576k = iVar2.f20576k;
        iVar.f20578l = iVar2.f20578l;
        iVar.f20580m = iVar2.f20580m;
        iVar.f20582n = iVar2.f20582n;
        iVar.f20584o = iVar2.f20584o;
        iVar.f20586p = iVar2.f20586p;
        iVar.f20587q = iVar2.f20587q;
        iVar.f20588r = iVar2.f20588r;
        iVar.f20589s = iVar2.f20589s;
        iVar.f20590t = iVar2.f20590t;
        iVar.f20591u = iVar2.f20591u;
        iVar.f20592v = iVar2.f20592v;
        iVar.f20593w = iVar2.f20593w;
        iVar.f20594x = iVar2.f20594x;
        iVar.f20595y = iVar2.f20595y;
        iVar.f20596z = iVar2.f20596z;
        iVar.A = iVar2.A;
        iVar.B = iVar2.B;
        iVar.C = iVar2.C;
        iVar.D = iVar2.D;
        iVar.E = iVar2.E;
        iVar.F = iVar2.F;
        iVar.G = iVar2.G;
        iVar.H = iVar2.H;
        iVar.I = iVar2.I;
        iVar.J = iVar2.J;
        iVar.K = iVar2.K;
        iVar.L = iVar2.L;
        iVar.M = iVar2.M;
        iVar.N = iVar2.N;
        iVar.O = iVar2.O;
        iVar.P = iVar2.P;
        iVar.Q = iVar2.Q;
        iVar.R = iVar2.R;
        iVar.S = iVar2.S;
        iVar.T = iVar2.T;
        iVar.U = iVar2.U;
        iVar.V = iVar2.V;
        iVar.W = iVar2.W;
        iVar.X = iVar2.X;
        iVar.Y = iVar2.Y;
        iVar.Z = iVar2.Z;
        iVar.f20557a0 = iVar2.f20557a0;
        iVar.f20559b0 = iVar2.f20559b0;
        iVar.f20561c0 = iVar2.f20561c0;
        iVar.f20563d0 = iVar2.f20563d0;
        iVar.f20565e0 = iVar2.f20565e0;
        iVar.f20567f0 = iVar2.f20567f0;
        iVar.f20569g0 = iVar2.f20569g0;
        iVar.f20571h0 = iVar2.f20571h0;
        iVar.f20577k0 = iVar2.f20577k0;
        int[] iArr = iVar2.f20573i0;
        if (iArr == null || iVar2.f20575j0 != null) {
            iVar.f20573i0 = null;
        } else {
            iVar.f20573i0 = Arrays.copyOf(iArr, iArr.length);
        }
        iVar.f20575j0 = iVar2.f20575j0;
        iVar.f20579l0 = iVar2.f20579l0;
        iVar.f20581m0 = iVar2.f20581m0;
        iVar.f20583n0 = iVar2.f20583n0;
        iVar.f20585o0 = iVar2.f20585o0;
        j jVar = hVar.f20551c;
        jVar.getClass();
        j jVar2 = this.f20551c;
        jVar2.getClass();
        jVar.f20598a = jVar2.f20598a;
        jVar.f20600c = jVar2.f20600c;
        jVar.f20602e = jVar2.f20602e;
        jVar.f20601d = jVar2.f20601d;
        k kVar = hVar.f20550b;
        kVar.getClass();
        k kVar2 = this.f20550b;
        kVar2.getClass();
        kVar.f20607a = kVar2.f20607a;
        kVar.f20609c = kVar2.f20609c;
        kVar.f20610d = kVar2.f20610d;
        kVar.f20608b = kVar2.f20608b;
        l lVar = hVar.f20553e;
        lVar.getClass();
        l lVar2 = this.f20553e;
        lVar2.getClass();
        lVar.f20612a = lVar2.f20612a;
        lVar.f20613b = lVar2.f20613b;
        lVar.f20614c = lVar2.f20614c;
        lVar.f20615d = lVar2.f20615d;
        lVar.f20616e = lVar2.f20616e;
        lVar.f20617f = lVar2.f20617f;
        lVar.f20618g = lVar2.f20618g;
        lVar.f20619h = lVar2.f20619h;
        lVar.f20620i = lVar2.f20620i;
        lVar.f20621j = lVar2.f20621j;
        lVar.f20622k = lVar2.f20622k;
        lVar.f20623l = lVar2.f20623l;
        lVar.f20624m = lVar2.f20624m;
        hVar.f20549a = this.f20549a;
        return hVar;
    }
}
