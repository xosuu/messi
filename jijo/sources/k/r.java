package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class r implements i0.b {
    public s A;
    public MenuItem.OnActionExpandListener B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f14592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f14593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f14594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f14595h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char f14597j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f14599l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o f14601n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j0 f14602o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f14603p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f14604q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f14605r;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f14612y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f14613z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14596i = NotificationCompat.FLAG_BUBBLE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14598k = NotificationCompat.FLAG_BUBBLE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14600m = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f14606s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f14607t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14608u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14609v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14610w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f14611x = 16;
    public boolean C = false;

    public r(o oVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f14601n = oVar;
        this.f14588a = i11;
        this.f14589b = i10;
        this.f14590c = i12;
        this.f14591d = i13;
        this.f14592e = charSequence;
        this.f14612y = i14;
    }

    public static void c(int i10, int i11, String str, StringBuilder sb) {
        if ((i10 & i11) == i11) {
            sb.append(str);
        }
    }

    @Override // i0.b
    public final i0.b a(s sVar) {
        this.f14613z = null;
        this.A = sVar;
        this.f14601n.p(true);
        s sVar2 = this.A;
        if (sVar2 != null) {
            sVar2.d(new q(0, this));
        }
        return this;
    }

    @Override // i0.b
    public final s b() {
        return this.A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f14612y & 8) == 0) {
            return false;
        }
        if (this.f14613z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f14601n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f14610w && (this.f14608u || this.f14609v)) {
            drawable = g4.z.I(drawable).mutate();
            if (this.f14608u) {
                h0.b.h(drawable, this.f14606s);
            }
            if (this.f14609v) {
                h0.b.i(drawable, this.f14607t);
            }
            this.f14610w = false;
        }
        return drawable;
    }

    public final boolean e() {
        s sVar;
        if ((this.f14612y & 8) == 0) {
            return false;
        }
        if (this.f14613z == null && (sVar = this.A) != null) {
            this.f14613z = sVar.b(this);
        }
        return this.f14613z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f14601n.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.f14611x & 32) == 32;
    }

    public final void g(boolean z9) {
        this.f14611x = (z9 ? 4 : 0) | (this.f14611x & (-5));
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f14613z;
        if (view != null) {
            return view;
        }
        s sVar = this.A;
        if (sVar == null) {
            return null;
        }
        View viewB = sVar.b(this);
        this.f14613z = viewB;
        return viewB;
    }

    @Override // i0.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f14598k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f14597j;
    }

    @Override // i0.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f14604q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f14589b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f14599l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f14600m;
        if (i10 == 0) {
            return null;
        }
        Drawable drawableG = p7.q.g(this.f14601n.f14559a, i10);
        this.f14600m = 0;
        this.f14599l = drawableG;
        return d(drawableG);
    }

    @Override // i0.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f14606s;
    }

    @Override // i0.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f14607t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f14594g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f14588a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // i0.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f14596i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f14595h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f14590c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f14602o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f14592e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f14593f;
        return charSequence != null ? charSequence : this.f14592e;
    }

    @Override // i0.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f14605r;
    }

    public final void h(boolean z9) {
        if (z9) {
            this.f14611x |= 32;
        } else {
            this.f14611x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f14602o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f14611x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f14611x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f14611x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        s sVar = this.A;
        return (sVar == null || !sVar.c()) ? (this.f14611x & 8) == 0 : (this.f14611x & 8) == 0 && this.A.a();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i10;
        this.f14613z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f14588a) > 0) {
            view.setId(i10);
        }
        o oVar = this.f14601n;
        oVar.f14569k = true;
        oVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f14597j == c10) {
            return this;
        }
        this.f14597j = Character.toLowerCase(c10);
        this.f14601n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z9) {
        int i10 = this.f14611x;
        int i11 = (z9 ? 1 : 0) | (i10 & (-2));
        this.f14611x = i11;
        if (i10 != i11) {
            this.f14601n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z9) {
        int i10 = this.f14611x;
        if ((i10 & 4) != 0) {
            o oVar = this.f14601n;
            oVar.getClass();
            ArrayList arrayList = oVar.f14564f;
            int size = arrayList.size();
            oVar.w();
            for (int i11 = 0; i11 < size; i11++) {
                r rVar = (r) arrayList.get(i11);
                if (rVar.f14589b == this.f14589b && (rVar.f14611x & 4) != 0 && rVar.isCheckable()) {
                    boolean z10 = rVar == this;
                    int i12 = rVar.f14611x;
                    int i13 = (z10 ? 2 : 0) | (i12 & (-3));
                    rVar.f14611x = i13;
                    if (i12 != i13) {
                        rVar.f14601n.p(false);
                    }
                }
            }
            oVar.v();
        } else {
            int i14 = (i10 & (-3)) | (z9 ? 2 : 0);
            this.f14611x = i14;
            if (i10 != i14) {
                this.f14601n.p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z9) {
        if (z9) {
            this.f14611x |= 16;
        } else {
            this.f14611x &= -17;
        }
        this.f14601n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f14600m = 0;
        this.f14599l = drawable;
        this.f14610w = true;
        this.f14601n.p(false);
        return this;
    }

    @Override // i0.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f14606s = colorStateList;
        this.f14608u = true;
        this.f14610w = true;
        this.f14601n.p(false);
        return this;
    }

    @Override // i0.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f14607t = mode;
        this.f14609v = true;
        this.f14610w = true;
        this.f14601n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f14594g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        if (this.f14595h == c10) {
            return this;
        }
        this.f14595h = c10;
        this.f14601n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f14603p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f14595h = c10;
        this.f14597j = Character.toLowerCase(c11);
        this.f14601n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f14612y = i10;
        o oVar = this.f14601n;
        oVar.f14569k = true;
        oVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f14592e = charSequence;
        this.f14601n.p(false);
        j0 j0Var = this.f14602o;
        if (j0Var != null) {
            j0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f14593f = charSequence;
        this.f14601n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z9) {
        int i10 = this.f14611x;
        int i11 = (z9 ? 0 : 8) | (i10 & (-9));
        this.f14611x = i11;
        if (i10 != i11) {
            o oVar = this.f14601n;
            oVar.f14566h = true;
            oVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f14592e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // i0.b, android.view.MenuItem
    public final i0.b setContentDescription(CharSequence charSequence) {
        this.f14604q = charSequence;
        this.f14601n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f14599l = null;
        this.f14600m = i10;
        this.f14610w = true;
        this.f14601n.p(false);
        return this;
    }

    @Override // i0.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f14595h == c10 && this.f14596i == i10) {
            return this;
        }
        this.f14595h = c10;
        this.f14596i = KeyEvent.normalizeMetaState(i10);
        this.f14601n.p(false);
        return this;
    }

    @Override // i0.b, android.view.MenuItem
    public final i0.b setTooltipText(CharSequence charSequence) {
        this.f14605r = charSequence;
        this.f14601n.p(false);
        return this;
    }

    @Override // i0.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f14597j == c10 && this.f14598k == i10) {
            return this;
        }
        this.f14597j = Character.toLowerCase(c10);
        this.f14598k = KeyEvent.normalizeMetaState(i10);
        this.f14601n.p(false);
        return this;
    }

    @Override // i0.b, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f14595h = c10;
        this.f14596i = KeyEvent.normalizeMetaState(i10);
        this.f14597j = Character.toLowerCase(c11);
        this.f14598k = KeyEvent.normalizeMetaState(i11);
        this.f14601n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        setTitle(this.f14601n.f14559a.getString(i10));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        int i11;
        Context context = this.f14601n.f14559a;
        View viewInflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f14613z = viewInflate;
        this.A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i11 = this.f14588a) > 0) {
            viewInflate.setId(i11);
        }
        o oVar = this.f14601n;
        oVar.f14569k = true;
        oVar.p(true);
        return this;
    }
}
