package k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o0.x0;
import o0.y0;

/* JADX INFO: loaded from: classes.dex */
public class o implements i0.a {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f14558y = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f14560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f14563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f14564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f14565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f14567i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f14568j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14569k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f14571m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f14572n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f14573o;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public r f14580v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f14582x;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14570l = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14574p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f14575q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f14576r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14577s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f14578t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f14579u = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14581w = false;

    public o(Context context) {
        Resources resources;
        int identifier;
        boolean z9 = false;
        this.f14559a = context;
        Resources resources2 = context.getResources();
        this.f14560b = resources2;
        this.f14564f = new ArrayList();
        this.f14565g = new ArrayList();
        this.f14566h = true;
        this.f14567i = new ArrayList();
        this.f14568j = new ArrayList();
        this.f14569k = true;
        if (resources2.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = y0.f16087a;
            if (Build.VERSION.SDK_INT < 28 ? !((identifier = (resources = context.getResources()).getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android")) == 0 || !resources.getBoolean(identifier)) : x0.b(viewConfiguration)) {
                z9 = true;
            }
        }
        this.f14562d = z9;
    }

    public final r a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 < 0 || i14 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i15 = (f14558y[i14] << 16) | (65535 & i12);
        r rVar = new r(this, i10, i11, i12, i15, charSequence, this.f14570l);
        ArrayList arrayList = this.f14564f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i13 = 0;
                break;
            }
            if (((r) arrayList.get(size)).f14591d <= i15) {
                i13 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i13, rVar);
        p(true);
        return rVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f14559a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            r rVarA = a(i10, i11, i12, resolveInfo.loadLabel(packageManager));
            rVarA.setIcon(resolveInfo.loadIcon(packageManager));
            rVarA.f14594g = intent2;
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = rVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(d0 d0Var, Context context) {
        this.f14579u.add(new WeakReference(d0Var));
        d0Var.l(context, this);
        this.f14569k = true;
    }

    public final void c(boolean z9) {
        if (this.f14577s) {
            return;
        }
        this.f14577s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f14579u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            d0 d0Var = (d0) weakReference.get();
            if (d0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                d0Var.b(this, z9);
            }
        }
        this.f14577s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        r rVar = this.f14580v;
        if (rVar != null) {
            d(rVar);
        }
        this.f14564f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f14572n = null;
        this.f14571m = null;
        this.f14573o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(r rVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f14579u;
        boolean zF = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f14580v == rVar) {
            w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                d0 d0Var = (d0) weakReference.get();
                if (d0Var != null) {
                    zF = d0Var.f(rVar);
                    if (zF) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            v();
            if (zF) {
                this.f14580v = null;
            }
        }
        return zF;
    }

    public boolean e(o oVar, MenuItem menuItem) {
        m mVar = this.f14563e;
        return mVar != null && mVar.n(oVar, menuItem);
    }

    public boolean f(r rVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f14579u;
        boolean zC = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            d0 d0Var = (d0) weakReference.get();
            if (d0Var != null) {
                zC = d0Var.c(rVar);
                if (zC) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        v();
        if (zC) {
            this.f14580v = rVar;
        }
        return zC;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f14564f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            r rVar = (r) arrayList.get(i11);
            if (rVar.f14588a == i10) {
                return rVar;
            }
            if (rVar.hasSubMenu() && (menuItemFindItem = rVar.f14602o.findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final r g(int i10, KeyEvent keyEvent) {
        ArrayList arrayList = this.f14578t;
        arrayList.clear();
        h(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (r) arrayList.get(0);
        }
        boolean zN = n();
        for (int i11 = 0; i11 < size; i11++) {
            r rVar = (r) arrayList.get(i11);
            char c10 = zN ? rVar.f14597j : rVar.f14595h;
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (zN && c10 == '\b' && i10 == 67))) {
                return rVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return (MenuItem) this.f14564f.get(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.util.ArrayList r17, int r18, android.view.KeyEvent r19) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r16.n()
            int r4 = r19.getModifiers()
            android.view.KeyCharacterMap$KeyData r5 = new android.view.KeyCharacterMap$KeyData
            r5.<init>()
            boolean r6 = r2.getKeyData(r5)
            r7 = 67
            if (r6 != 0) goto L1e
            if (r1 == r7) goto L1e
            return
        L1e:
            r6 = r16
            java.util.ArrayList r8 = r6.f14564f
            int r9 = r8.size()
            r10 = 0
            r11 = 0
        L28:
            if (r11 >= r9) goto L7a
            java.lang.Object r12 = r8.get(r11)
            k.r r12 = (k.r) r12
            boolean r13 = r12.hasSubMenu()
            if (r13 == 0) goto L3b
            k.j0 r13 = r12.f14602o
            r13.h(r0, r1, r2)
        L3b:
            if (r3 == 0) goto L40
            char r13 = r12.f14597j
            goto L42
        L40:
            char r13 = r12.f14595h
        L42:
            if (r3 == 0) goto L47
            int r14 = r12.f14598k
            goto L49
        L47:
            int r14 = r12.f14596i
        L49:
            r15 = 69647(0x1100f, float:9.7596E-41)
            r7 = r4 & r15
            r14 = r14 & r15
            if (r7 != r14) goto L69
            if (r13 == 0) goto L69
            char[] r7 = r5.meta
            char r14 = r7[r10]
            if (r13 == r14) goto L6c
            r14 = 2
            char r7 = r7[r14]
            if (r13 == r7) goto L6c
            if (r3 == 0) goto L69
            r7 = 8
            if (r13 != r7) goto L69
            r7 = 67
            if (r1 != r7) goto L77
            goto L6e
        L69:
            r7 = 67
            goto L77
        L6c:
            r7 = 67
        L6e:
            boolean r13 = r12.isEnabled()
            if (r13 == 0) goto L77
            r0.add(r12)
        L77:
            int r11 = r11 + 1
            goto L28
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k.o.h(java.util.ArrayList, int, android.view.KeyEvent):void");
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f14582x) {
            return true;
        }
        ArrayList arrayList = this.f14564f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((r) arrayList.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.f14569k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f14579u;
            boolean zM = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                d0 d0Var = (d0) weakReference.get();
                if (d0Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zM |= d0Var.m();
                }
            }
            ArrayList arrayList = this.f14567i;
            ArrayList arrayList2 = this.f14568j;
            if (zM) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i10 = 0; i10 < size; i10++) {
                    r rVar = (r) arrayListL.get(i10);
                    if (rVar.f()) {
                        arrayList.add(rVar);
                    } else {
                        arrayList2.add(rVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f14569k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return g(i10, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public o k() {
        return this;
    }

    public final ArrayList l() {
        boolean z9 = this.f14566h;
        ArrayList arrayList = this.f14565g;
        if (!z9) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f14564f;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            r rVar = (r) arrayList2.get(i10);
            if (rVar.isVisible()) {
                arrayList.add(rVar);
            }
        }
        this.f14566h = false;
        this.f14569k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f14581w;
    }

    public boolean n() {
        return this.f14561c;
    }

    public boolean o() {
        return this.f14562d;
    }

    public void p(boolean z9) {
        if (this.f14574p) {
            this.f14575q = true;
            if (z9) {
                this.f14576r = true;
                return;
            }
            return;
        }
        if (z9) {
            this.f14566h = true;
            this.f14569k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f14579u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            d0 d0Var = (d0) weakReference.get();
            if (d0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                d0Var.h();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return q(findItem(i10), null, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        r rVarG = g(i10, keyEvent);
        boolean zQ = rVarG != null ? q(rVarG, null, i11) : false;
        if ((i11 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(android.view.MenuItem r7, k.d0 r8, int r9) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.o.q(android.view.MenuItem, k.d0, int):boolean");
    }

    public final void r(d0 d0Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f14579u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            d0 d0Var2 = (d0) weakReference.get();
            if (d0Var2 == null || d0Var2 == d0Var) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        ArrayList arrayList = this.f14564f;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i12 = -1;
                break;
            } else if (((r) arrayList.get(i12)).f14589b == i10) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            int size2 = arrayList.size() - i12;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= size2 || ((r) arrayList.get(i12)).f14589b != i10) {
                    break;
                }
                if (i12 >= 0) {
                    ArrayList arrayList2 = this.f14564f;
                    if (i12 < arrayList2.size()) {
                        arrayList2.remove(i12);
                    }
                }
                i11 = i13;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        ArrayList arrayList = this.f14564f;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (((r) arrayList.get(i11)).f14588a == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            ArrayList arrayList2 = this.f14564f;
            if (i11 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i11);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f14564f.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((j0) item.getSubMenu()).s(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (menuItemFindItem = findItem(i11)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z9, boolean z10) {
        ArrayList arrayList = this.f14564f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            r rVar = (r) arrayList.get(i11);
            if (rVar.f14589b == i10) {
                rVar.g(z10);
                rVar.setCheckable(z9);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z9) {
        this.f14581w = z9;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z9) {
        ArrayList arrayList = this.f14564f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            r rVar = (r) arrayList.get(i11);
            if (rVar.f14589b == i10) {
                rVar.setEnabled(z9);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z9) {
        ArrayList arrayList = this.f14564f;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            r rVar = (r) arrayList.get(i11);
            if (rVar.f14589b == i10) {
                int i12 = rVar.f14611x;
                int i13 = (i12 & (-9)) | (z9 ? 0 : 8);
                rVar.f14611x = i13;
                if (i12 != i13) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z9) {
        this.f14561c = z9;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f14564f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f14564f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((j0) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources resources = this.f14560b;
        if (view != null) {
            this.f14573o = view;
            this.f14571m = null;
            this.f14572n = null;
        } else {
            if (i10 > 0) {
                this.f14571m = resources.getText(i10);
            } else if (charSequence != null) {
                this.f14571m = charSequence;
            }
            if (i11 > 0) {
                Context context = this.f14559a;
                Object obj = d0.f.f12287a;
                this.f14572n = d0.c.b(context, i11);
            } else if (drawable != null) {
                this.f14572n = drawable;
            }
            this.f14573o = null;
        }
        p(false);
    }

    public final void v() {
        this.f14574p = false;
        if (this.f14575q) {
            this.f14575q = false;
            p(this.f14576r);
        }
    }

    public final void w() {
        if (this.f14574p) {
            return;
        }
        this.f14574p = true;
        this.f14575q = false;
        this.f14576r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return a(0, 0, 0, this.f14560b.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f14560b.getString(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        r rVarA = a(i10, i11, i12, charSequence);
        j0 j0Var = new j0(this.f14559a, this, rVarA);
        rVarA.f14602o = j0Var;
        j0Var.setHeaderTitle(rVarA.f14592e);
        return j0Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f14560b.getString(i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f14560b.getString(i13));
    }
}
