package v5;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class m extends w5.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17839b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, int i10) {
        super(str);
        this.f17839b = i10;
    }

    @Override // w5.c
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        switch (this.f17839b) {
        }
        return d((View) obj);
    }

    @Override // w5.a
    public final /* bridge */ /* synthetic */ void c(Object obj, float f10) {
        switch (this.f17839b) {
            case 0:
                e((View) obj, f10);
                break;
            case 1:
                e((View) obj, f10);
                break;
            case 2:
                e((View) obj, f10);
                break;
            case 3:
                e((View) obj, f10);
                break;
            case 4:
                e((View) obj, f10);
                break;
            case 5:
                e((View) obj, f10);
                break;
            case 6:
                e((View) obj, f10);
                break;
            case 7:
                e((View) obj, f10);
                break;
            case 8:
                e((View) obj, f10);
                break;
            case 9:
                e((View) obj, f10);
                break;
            case 10:
                e((View) obj, f10);
                break;
            default:
                e((View) obj, f10);
                break;
        }
    }

    public final Float d(View view) {
        switch (this.f17839b) {
            case 0:
                return Float.valueOf(x5.a.e(view).f18494w);
            case 1:
                x5.a aVarE = x5.a.e(view);
                return Float.valueOf(((View) aVarE.f18484a.get()) != null ? r0.getLeft() + aVarE.f18495x : 0.0f);
            case 2:
                x5.a aVarE2 = x5.a.e(view);
                return Float.valueOf(((View) aVarE2.f18484a.get()) != null ? r0.getTop() + aVarE2.f18496y : 0.0f);
            case 3:
                return Float.valueOf(x5.a.e(view).f18487f);
            case 4:
                return Float.valueOf(x5.a.e(view).f18488h);
            case 5:
                return Float.valueOf(x5.a.e(view).f18489q);
            case 6:
                return Float.valueOf(x5.a.e(view).f18495x);
            case 7:
                return Float.valueOf(x5.a.e(view).f18496y);
            case 8:
                return Float.valueOf(x5.a.e(view).f18492u);
            case 9:
                return Float.valueOf(x5.a.e(view).f18490s);
            case 10:
                return Float.valueOf(x5.a.e(view).f18491t);
            default:
                return Float.valueOf(x5.a.e(view).f18493v);
        }
    }

    public final void e(View view, float f10) {
        switch (this.f17839b) {
            case 0:
                x5.a aVarE = x5.a.e(view);
                if (aVarE.f18494w != f10) {
                    aVarE.c();
                    aVarE.f18494w = f10;
                    aVarE.b();
                }
                break;
            case 1:
                x5.a aVarE2 = x5.a.e(view);
                if (((View) aVarE2.f18484a.get()) != null) {
                    float left = f10 - r0.getLeft();
                    if (aVarE2.f18495x != left) {
                        aVarE2.c();
                        aVarE2.f18495x = left;
                        aVarE2.b();
                    }
                }
                break;
            case 2:
                x5.a aVarE3 = x5.a.e(view);
                if (((View) aVarE3.f18484a.get()) != null) {
                    float top = f10 - r0.getTop();
                    if (aVarE3.f18496y != top) {
                        aVarE3.c();
                        aVarE3.f18496y = top;
                        aVarE3.b();
                    }
                }
                break;
            case 3:
                x5.a aVarE4 = x5.a.e(view);
                if (aVarE4.f18487f != f10) {
                    aVarE4.f18487f = f10;
                    View view2 = (View) aVarE4.f18484a.get();
                    if (view2 != null) {
                        view2.invalidate();
                    }
                }
                break;
            case 4:
                x5.a aVarE5 = x5.a.e(view);
                if (!aVarE5.f18486d || aVarE5.f18488h != f10) {
                    aVarE5.c();
                    aVarE5.f18486d = true;
                    aVarE5.f18488h = f10;
                    aVarE5.b();
                }
                break;
            case 5:
                x5.a aVarE6 = x5.a.e(view);
                if (!aVarE6.f18486d || aVarE6.f18489q != f10) {
                    aVarE6.c();
                    aVarE6.f18486d = true;
                    aVarE6.f18489q = f10;
                    aVarE6.b();
                }
                break;
            case 6:
                x5.a aVarE7 = x5.a.e(view);
                if (aVarE7.f18495x != f10) {
                    aVarE7.c();
                    aVarE7.f18495x = f10;
                    aVarE7.b();
                }
                break;
            case 7:
                x5.a aVarE8 = x5.a.e(view);
                if (aVarE8.f18496y != f10) {
                    aVarE8.c();
                    aVarE8.f18496y = f10;
                    aVarE8.b();
                }
                break;
            case 8:
                x5.a aVarE9 = x5.a.e(view);
                if (aVarE9.f18492u != f10) {
                    aVarE9.c();
                    aVarE9.f18492u = f10;
                    aVarE9.b();
                }
                break;
            case 9:
                x5.a aVarE10 = x5.a.e(view);
                if (aVarE10.f18490s != f10) {
                    aVarE10.c();
                    aVarE10.f18490s = f10;
                    aVarE10.b();
                }
                break;
            case 10:
                x5.a aVarE11 = x5.a.e(view);
                if (aVarE11.f18491t != f10) {
                    aVarE11.c();
                    aVarE11.f18491t = f10;
                    aVarE11.b();
                }
                break;
            default:
                x5.a aVarE12 = x5.a.e(view);
                if (aVarE12.f18493v != f10) {
                    aVarE12.c();
                    aVarE12.f18493v = f10;
                    aVarE12.b();
                }
                break;
        }
    }
}
