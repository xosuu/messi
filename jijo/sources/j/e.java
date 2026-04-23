package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Configuration f14221f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f14223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f14224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Configuration f14225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Resources f14226e;

    public e(Context context, int i10) {
        super(context);
        this.f14222a = i10;
    }

    public final void a(Configuration configuration) {
        if (this.f14226e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f14225d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f14225d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f14223b == null) {
            this.f14223b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f14223b.setTo(theme);
            }
        }
        this.f14223b.applyStyle(this.f14222a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f14226e
            if (r0 != 0) goto L38
            android.content.res.Configuration r0 = r3.f14225d
            if (r0 == 0) goto L32
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = j.e.f14221f
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            j.e.f14221f = r1
        L1c:
            android.content.res.Configuration r1 = j.e.f14221f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L32
        L25:
            android.content.res.Configuration r0 = r3.f14225d
            android.content.Context r0 = j.d.a(r3, r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f14226e = r0
            goto L38
        L32:
            android.content.res.Resources r0 = super.getResources()
            r3.f14226e = r0
        L38:
            android.content.res.Resources r0 = r3.f14226e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.e.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f14224c == null) {
            this.f14224c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f14224c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f14223b;
        if (theme != null) {
            return theme;
        }
        if (this.f14222a == 0) {
            this.f14222a = R.style.o9;
        }
        b();
        return this.f14223b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        if (this.f14222a != i10) {
            this.f14222a = i10;
            b();
        }
    }
}
