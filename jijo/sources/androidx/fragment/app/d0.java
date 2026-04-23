package androidx.fragment.app;

import androidx.activity.result.ActivityResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements androidx.activity.result.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f757b;

    public /* synthetic */ d0(j0 j0Var, int i10) {
        this.f756a = i10;
        this.f757b = j0Var;
    }

    public final void a(ActivityResult activityResult) {
        int i10 = this.f756a;
        j0 j0Var = this.f757b;
        switch (i10) {
            case 0:
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) j0Var.f806y.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo != null) {
                    s sVarC = j0Var.f784c.c(fragmentManager$LaunchedFragmentInfo.f679a);
                    if (sVarC != null) {
                        sVarC.y(fragmentManager$LaunchedFragmentInfo.f680b, activityResult.f172a, activityResult.f173b);
                        break;
                    }
                }
                break;
            default:
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo2 = (FragmentManager$LaunchedFragmentInfo) j0Var.f806y.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo2 != null) {
                    s sVarC2 = j0Var.f784c.c(fragmentManager$LaunchedFragmentInfo2.f679a);
                    if (sVarC2 != null) {
                        sVarC2.y(fragmentManager$LaunchedFragmentInfo2.f680b, activityResult.f172a, activityResult.f173b);
                        break;
                    }
                }
                break;
        }
    }

    @Override // androidx.activity.result.a
    public final void b(Object obj) {
        switch (this.f756a) {
            case 0:
                a((ActivityResult) obj);
                break;
            case 1:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
                }
                j0 j0Var = this.f757b;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) j0Var.f806y.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo != null) {
                    j0Var.f784c.c(fragmentManager$LaunchedFragmentInfo.f679a);
                    break;
                }
                break;
            default:
                a((ActivityResult) obj);
                break;
        }
    }

    public final void c(s sVar, k0.b bVar) {
        boolean z9;
        synchronized (bVar) {
            z9 = bVar.f14626a;
        }
        if (z9) {
            return;
        }
        j0 j0Var = this.f757b;
        HashSet hashSet = (HashSet) j0Var.f792k.get(sVar);
        if (hashSet != null && hashSet.remove(bVar) && hashSet.isEmpty()) {
            j0Var.f792k.remove(sVar);
            if (sVar.f881a < 5) {
                sVar.P();
                j0Var.f794m.A(false);
                sVar.R = null;
                sVar.S = null;
                sVar.f884b0 = null;
                sVar.f885c0.e(null);
                sVar.A = false;
                j0Var.J(j0Var.f796o, sVar);
            }
        }
    }

    public final void d(s sVar, k0.b bVar) {
        j0 j0Var = this.f757b;
        if (j0Var.f792k.get(sVar) == null) {
            j0Var.f792k.put(sVar, new HashSet());
        }
        ((HashSet) j0Var.f792k.get(sVar)).add(bVar);
    }
}
