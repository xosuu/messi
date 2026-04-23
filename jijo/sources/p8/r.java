package p8;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment$SavedState;
import androidx.fragment.app.j0;
import androidx.fragment.app.s;
import com.google.android.gms.internal.ads.fb1;
import java.util.ArrayList;
import java.util.Collections;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.MainActivity;
import xyz.easypro.ecrypt.utils.Crypt;

/* JADX INFO: loaded from: classes.dex */
public final class r extends z1.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f16360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.fragment.app.a f16361d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f16362e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f16363f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s f16364g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16365h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ MainActivity f16366i;

    public r(MainActivity mainActivity, j0 j0Var) {
        this.f16366i = mainActivity;
        this.f16360c = j0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    @Override // z1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.ViewGroup r6, int r7, java.lang.Object r8) {
        /*
            r5 = this;
            androidx.fragment.app.s r8 = (androidx.fragment.app.s) r8
            androidx.fragment.app.a r6 = r5.f16361d
            androidx.fragment.app.j0 r0 = r5.f16360c
            if (r6 != 0) goto L12
            r0.getClass()
            androidx.fragment.app.a r6 = new androidx.fragment.app.a
            r6.<init>(r0)
            r5.f16361d = r6
        L12:
            java.util.ArrayList r6 = r5.f16362e
            int r6 = r6.size()
            r1 = 0
            if (r6 > r7) goto L21
            java.util.ArrayList r6 = r5.f16362e
            r6.add(r1)
            goto L12
        L21:
            java.util.ArrayList r6 = r5.f16362e
            boolean r2 = r8.w()
            if (r2 == 0) goto L74
            r0.getClass()
            java.lang.String r2 = r8.f892q
            androidx.fragment.app.n0 r3 = r0.f784c
            java.util.HashMap r3 = r3.f841b
            java.lang.Object r2 = r3.get(r2)
            androidx.fragment.app.m0 r2 = (androidx.fragment.app.m0) r2
            if (r2 == 0) goto L53
            androidx.fragment.app.s r3 = r2.f836c
            boolean r4 = r3.equals(r8)
            if (r4 == 0) goto L53
            int r0 = r3.f881a
            r3 = -1
            if (r0 <= r3) goto L74
            android.os.Bundle r0 = r2.o()
            if (r0 == 0) goto L74
            androidx.fragment.app.Fragment$SavedState r2 = new androidx.fragment.app.Fragment$SavedState
            r2.<init>(r0)
            goto L75
        L53:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "N<hHg<Lf;I99Mfn\u001ekk\u001a;n\u001djj@m>Jjn@:"
            java.lang.String r7 = xyz.easypro.ecrypt.utils.Crypt.xrc(r7)
            java.lang.String r7 = xyz.easypro.ecrypt.utils.Crypt.a(r7)
            java.lang.String r2 = "@<nL:9\u001ahoA;iKfcAgiOf<\u001eo9L:lAgjI<<@m<Mm<Ohk\u001bgj\u0019g8\u001ahnKf8N:8J=hKi9Knb\u001dkk\u001d=b\u001dgm\u0019>n\u001af<Lj;J;mJ>;H>jIkn"
            java.lang.String r2 = xyz.easypro.ecrypt.utils.Crypt.xrc(r2)
            java.lang.String r2 = xyz.easypro.ecrypt.utils.Crypt.a(r2)
            java.lang.String r7 = g1.a.p(r7, r8, r2)
            r6.<init>(r7)
            r0.Y(r6)
            throw r1
        L74:
            r2 = r1
        L75:
            r6.set(r7, r2)
            java.util.ArrayList r6 = r5.f16363f
            r6.set(r7, r1)
            androidx.fragment.app.a r6 = r5.f16361d
            r6.i(r8)
            androidx.fragment.app.s r6 = r5.f16364g
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L8c
            r5.f16364g = r1
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p8.r.a(android.view.ViewGroup, int, java.lang.Object):void");
    }

    @Override // z1.a
    public final void b() {
        androidx.fragment.app.a aVar = this.f16361d;
        if (aVar != null) {
            if (!this.f16365h) {
                try {
                    this.f16365h = true;
                    if (aVar.f708g) {
                        throw new IllegalStateException(Crypt.a(Crypt.xrc("\u001ejk\u001c<?A9iJlo\u001co>\u001biiIgo\u001dih\u001d;j\u001c:m\u001cgo\u001bioHmlLkb\u001aj8\u001c=i\u001cll\u001c>9Hh8\u001b9;Ii<K>b\u001aj9Mmi@;cHojKfcMn;\u001b=9H9mMon\u0019>i\u001dinOi<Jkj\u001b:lN=;L;k@hoAm;H><Ko8\u001aj")));
                    }
                    j0 j0Var = aVar.f717p;
                    if (j0Var.f797p != null && !j0Var.C) {
                        j0Var.w(true);
                        aVar.a(j0Var.E, j0Var.F);
                        j0Var.f783b = true;
                        try {
                            j0Var.P(j0Var.E, j0Var.F);
                            j0Var.d();
                            j0Var.a0();
                            j0Var.t();
                            j0Var.f784c.f841b.values().removeAll(Collections.singleton(null));
                        } catch (Throwable th) {
                            j0Var.d();
                            throw th;
                        }
                    }
                } finally {
                    this.f16365h = false;
                }
            }
            this.f16361d = null;
        }
    }

    @Override // z1.a
    public final int c() {
        return 2;
    }

    @Override // z1.a
    public final int d() {
        return -2;
    }

    @Override // z1.a
    public final CharSequence e(int i10) {
        if (i10 == 0) {
            return App.f17100w.f17415a.getBoolean(Crypt.a(Crypt.xrc("\u001bnc\u001eibA=i\u001dioOkl\u001c:n\u001dgk\u001dnk\u0019f<\u001c:i\u001di")), true) ? Crypt.a(Crypt.xrc("\u001ei8JmhKkjLf9\u001eh>\u001ckh\u001dkiA;cIfj\u001c<i\u001cm")) : Crypt.a(Crypt.xrc("HfnNoh@hnKhbI;;J<hJk?Mm8Hkj\u001e9kJm"));
        }
        if (i10 != 1) {
            return null;
        }
        return Crypt.a(Crypt.xrc("\u001bo?A>9\u001bj<@g8J:l\u0019ih\u0019omK=;\u001eln\u001domOh"));
    }

    @Override // z1.a
    public final Object f(ViewGroup viewGroup, int i10) {
        s sVar;
        Fragment$SavedState fragment$SavedState;
        s sVar2;
        if (this.f16363f.size() > i10 && (sVar2 = (s) this.f16363f.get(i10)) != null) {
            return sVar2;
        }
        if (this.f16361d == null) {
            j0 j0Var = this.f16360c;
            j0Var.getClass();
            this.f16361d = new androidx.fragment.app.a(j0Var);
        }
        MainActivity mainActivity = this.f16366i;
        if (i10 != 0) {
            sVar = i10 != 1 ? mainActivity.O : mainActivity.Q;
        } else if (App.f17100w.f17415a.getBoolean(Crypt.a(Crypt.xrc("\u001bnc\u001eibA=i\u001dioOkl\u001c:n\u001dgk\u001dnk\u0019f<\u001c:i\u001di")), true)) {
            mainActivity.X.setVisibility(8);
            sVar = mainActivity.O;
        } else {
            sVar = mainActivity.P;
        }
        if (this.f16362e.size() > i10 && (fragment$SavedState = (Fragment$SavedState) this.f16362e.get(i10)) != null) {
            if (sVar.E != null) {
                throw new IllegalStateException(Crypt.a(Crypt.xrc("\u001bmjHf;L9nH:iO>h\u001dh;HjnO<l\u001ennAmk\u0019:kJlh\u001alhHjlOhnH;m\u001e>kH;j\u001a=j\u001bohJk;N")));
            }
            Bundle bundle = fragment$SavedState.f674a;
            if (bundle == null) {
                bundle = null;
            }
            sVar.f883b = bundle;
        }
        while (this.f16363f.size() <= i10) {
            this.f16363f.add(null);
        }
        sVar.X(false);
        sVar.Y(false);
        this.f16363f.set(i10, sVar);
        this.f16361d.e(viewGroup.getId(), sVar, null, 1);
        return sVar;
    }

    @Override // z1.a
    public final boolean g(View view, Object obj) {
        return ((s) obj).S == view;
    }

    @Override // z1.a
    public final void i(Parcelable parcelable, ClassLoader classLoader) {
        s sVarB;
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray(Crypt.a(Crypt.xrc("\u001a<?\u001doiH9j\u001emh\u0019:h\u0019inLjmN99\u001b:l\u001b;kM=")));
            this.f16362e.clear();
            this.f16363f.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f16362e.add((Fragment$SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith(Crypt.a(Crypt.xrc("\u0019go\u001aniM:jJfhIi9LhnNjoIjiAg9IhmKh")))) {
                    int i10 = Integer.parseInt(str.substring(1));
                    j0 j0Var = this.f16360c;
                    j0Var.getClass();
                    String string = bundle.getString(str);
                    if (string == null) {
                        sVarB = null;
                    } else {
                        sVarB = j0Var.f784c.b(string);
                        if (sVarB == null) {
                            j0Var.Y(new IllegalStateException(Crypt.a(Crypt.xrc("Oo?@>9\u001c;cNg8\u001e<<Oni\u001c<j\u0019;h\u001cnl\u001eh?I9kOj<Kf9AioM:<\u001b9>A>kIgoHfj\u001afj\u001cfh\u001am8Jn;J9n@jbO;h\u001ci<\u001eg;Nj;Hhi\u001cjk\u001c;;")) + str + Crypt.a(Crypt.xrc("Hn8L<8Nj;Nib\u0019m?Ho>\u001a:kHji\u001bfh\u001b<n@g")) + string));
                            throw null;
                        }
                    }
                    if (sVarB != null) {
                        while (this.f16363f.size() <= i10) {
                            this.f16363f.add(null);
                        }
                        sVarB.X(false);
                        this.f16363f.set(i10, sVarB);
                    }
                }
            }
        }
    }

    @Override // z1.a
    public final Parcelable j() {
        Bundle bundle;
        if (this.f16362e.size() > 0) {
            bundle = new Bundle();
            Fragment$SavedState[] fragment$SavedStateArr = new Fragment$SavedState[this.f16362e.size()];
            this.f16362e.toArray(fragment$SavedStateArr);
            bundle.putParcelableArray(Crypt.a(Crypt.xrc("\u001a<?\u001doiH9j\u001emh\u0019:h\u0019inLjmN99\u001b:l\u001b;kM=")), fragment$SavedStateArr);
        } else {
            bundle = null;
        }
        for (int i10 = 0; i10 < this.f16363f.size(); i10++) {
            s sVar = (s) this.f16363f.get(i10);
            if (sVar != null && sVar.w()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                String strG = fb1.g(Crypt.a(Crypt.xrc("\u0019go\u001aniM:jJfhIi9LhnNjoIjiAg9IhmKh")), i10);
                j0 j0Var = this.f16360c;
                j0Var.getClass();
                if (sVar.E != j0Var) {
                    j0Var.Y(new IllegalStateException(g1.a.p(Crypt.a(Crypt.xrc("N<hHg<Lf;I99Mfn\u001ekk\u001a;n\u001djj@m>Jjn@:")), sVar, Crypt.a(Crypt.xrc("@<nL:9\u001ahoA;iKfcAgiOf<\u001eo9L:lAgjI<<@m<Mm<Ohk\u001bgj\u0019g8\u001ahnKf8N:8J=hKi9Knb\u001dkk\u001d=b\u001dgm\u0019>n\u001af<Lj;J;mJ>;H>jIkn")))));
                    throw null;
                }
                bundle.putString(strG, sVar.f892q);
            }
        }
        return bundle;
    }

    @Override // z1.a
    public final void k(Object obj) {
        s sVar = (s) obj;
        s sVar2 = this.f16364g;
        if (sVar != sVar2) {
            if (sVar2 != null) {
                sVar2.X(false);
                this.f16364g.Y(false);
            }
            sVar.X(true);
            sVar.Y(true);
            this.f16364g = sVar;
        }
    }

    @Override // z1.a
    public final void m(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException(Crypt.a(Crypt.xrc("K:bIjnLkm\u001dob\u001cm>@>i\u001e<jHniH<cOnbNnhK>m\u001ci?O<mJmh\u001efoJjbA=hIom\u001bojJ;<M")) + this + Crypt.a(Crypt.xrc("\u001ckb\u0019m;\u001bkh\u001amhOl8\u001e=l@kiN<k\u001c<i\u001bki\u001a:cLonHjbJkn\u0019=9M=mMohMfjA=oHhbI;i\u001c")));
    }
}
