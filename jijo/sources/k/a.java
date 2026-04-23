package k;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.app.NotificationCompat;

/* JADX INFO: loaded from: classes.dex */
public final class a implements i0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f14472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f14473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Intent f14474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f14475d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public char f14477f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f14479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Context f14480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f14481j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f14482k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14476e = NotificationCompat.FLAG_BUBBLE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14478g = NotificationCompat.FLAG_BUBBLE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f14483l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f14484m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14485n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f14486o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f14487p = 16;

    public a(Context context, CharSequence charSequence) {
        this.f14480i = context;
        this.f14472a = charSequence;
    }

    @Override // i0.b
    public final i0.b a(s sVar) {
        throw new UnsupportedOperationException();
    }

    @Override // i0.b
    public final s b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f14479h;
        if (drawable != null) {
            if (this.f14485n || this.f14486o) {
                Drawable drawableI = g4.z.I(drawable);
                this.f14479h = drawableI;
                Drawable drawableMutate = drawableI.mutate();
                this.f14479h = drawableMutate;
                if (this.f14485n) {
                    h0.b.h(drawableMutate, this.f14483l);
                }
                if (this.f14486o) {
                    h0.b.i(this.f14479h, this.f14484m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // i0.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f14478g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f14477f;
    }

    @Override // i0.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f14481j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f14479h;
    }

    @Override // i0.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f14483l;
    }

    @Override // i0.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f14484m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f14474c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // i0.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f14476e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f14475d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f14472a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f14473b;
        return charSequence != null ? charSequence : this.f14472a;
    }

    @Override // i0.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f14482k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f14487p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f14487p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f14487p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f14487p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f14477f = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z9) {
        this.f14487p = (z9 ? 1 : 0) | (this.f14487p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z9) {
        this.f14487p = (z9 ? 2 : 0) | (this.f14487p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f14481j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z9) {
        this.f14487p = (z9 ? 16 : 0) | (this.f14487p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f14479h = drawable;
        c();
        return this;
    }

    @Override // i0.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f14483l = colorStateList;
        this.f14485n = true;
        c();
        return this;
    }

    @Override // i0.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f14484m = mode;
        this.f14486o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f14474c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        this.f14475d = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f14475d = c10;
        this.f14477f = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f14472a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f14473b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f14482k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z9) {
        this.f14487p = (this.f14487p & 8) | (z9 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // i0.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f14477f = Character.toLowerCase(c10);
        this.f14478g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // i0.b, android.view.MenuItem
    public final i0.b setContentDescription(CharSequence charSequence) {
        this.f14481j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        Context context = this.f14480i;
        Object obj = d0.f.f12287a;
        this.f14479h = d0.c.b(context, i10);
        c();
        return this;
    }

    @Override // i0.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f14475d = c10;
        this.f14476e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // i0.b, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f14475d = c10;
        this.f14476e = KeyEvent.normalizeMetaState(i10);
        this.f14477f = Character.toLowerCase(c11);
        this.f14478g = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        this.f14472a = this.f14480i.getResources().getString(i10);
        return this;
    }

    @Override // i0.b, android.view.MenuItem
    public final i0.b setTooltipText(CharSequence charSequence) {
        this.f14482k = charSequence;
        return this;
    }
}
