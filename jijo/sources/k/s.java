package k;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionProvider f14614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f14615b;

    public s(x xVar, ActionProvider actionProvider) {
        this.f14615b = xVar;
        this.f14614a = actionProvider;
    }

    public abstract /* bridge */ /* synthetic */ boolean a();

    public abstract View b(MenuItem menuItem);

    public abstract /* bridge */ /* synthetic */ boolean c();

    public abstract void d(q qVar);
}
