package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import k.g0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f14234b;

    public g(Context context, b bVar) {
        this.f14233a = context;
        this.f14234b = bVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f14234b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f14234b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new g0(this.f14233a, this.f14234b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f14234b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f14234b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f14234b.f14219a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f14234b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f14234b.f14220b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f14234b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f14234b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f14234b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f14234b.k(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f14234b.f14219a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f14234b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z9) {
        this.f14234b.o(z9);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i10) {
        this.f14234b.j(i10);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i10) {
        this.f14234b.l(i10);
    }
}
