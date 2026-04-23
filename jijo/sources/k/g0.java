package k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: loaded from: classes.dex */
public class g0 extends d implements Menu {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0.a f14513d;

    public g0(Context context, i0.a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f14513d = aVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return m(((o) this.f14513d).add(i10));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = ((o) this.f14513d).addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = m(menuItemArr2[i14]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return ((o) this.f14513d).addSubMenu(i10);
    }

    @Override // android.view.Menu
    public final void clear() {
        s.k kVar = (s.k) this.f14502b;
        if (kVar != null) {
            kVar.clear();
        }
        s.k kVar2 = (s.k) this.f14503c;
        if (kVar2 != null) {
            kVar2.clear();
        }
        ((o) this.f14513d).clear();
    }

    @Override // android.view.Menu
    public final void close() {
        ((o) this.f14513d).c(true);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        return m(((o) this.f14513d).findItem(i10));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return m(((o) this.f14513d).getItem(i10));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return ((o) this.f14513d).hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return ((o) this.f14513d).isShortcutKey(i10, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return ((o) this.f14513d).performIdentifierAction(i10, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return ((o) this.f14513d).performShortcut(i10, keyEvent, i11);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        if (((s.k) this.f14502b) != null) {
            int i11 = 0;
            while (true) {
                s.k kVar = (s.k) this.f14502b;
                if (i11 >= kVar.f16626d) {
                    break;
                }
                if (((i0.b) kVar.h(i11)).getGroupId() == i10) {
                    ((s.k) this.f14502b).i(i11);
                    i11--;
                }
                i11++;
            }
        }
        ((o) this.f14513d).removeGroup(i10);
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        if (((s.k) this.f14502b) != null) {
            int i11 = 0;
            while (true) {
                s.k kVar = (s.k) this.f14502b;
                if (i11 >= kVar.f16626d) {
                    break;
                }
                if (((i0.b) kVar.h(i11)).getItemId() == i10) {
                    ((s.k) this.f14502b).i(i11);
                    break;
                }
                i11++;
            }
        }
        ((o) this.f14513d).removeItem(i10);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z9, boolean z10) {
        ((o) this.f14513d).setGroupCheckable(i10, z9, z10);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z9) {
        ((o) this.f14513d).setGroupEnabled(i10, z9);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z9) {
        ((o) this.f14513d).setGroupVisible(i10, z9);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z9) {
        this.f14513d.setQwertyMode(z9);
    }

    @Override // android.view.Menu
    public final int size() {
        return ((o) this.f14513d).f14564f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return m(((o) this.f14513d).add(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return this.f14513d.addSubMenu(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m(((o) this.f14513d).a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return ((o) this.f14513d).addSubMenu(i10, i11, i12, i13);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return ((o) this.f14513d).addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return m(((o) this.f14513d).a(i10, i11, i12, charSequence));
    }
}
