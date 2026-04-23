package g;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Drawable.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13544a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f13545b;

    public f() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f13544a) {
            case 0:
                break;
            default:
                ((x1.e) this.f13545b).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f13544a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f13545b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j10);
                }
                break;
            default:
                ((x1.e) this.f13545b).scheduleSelf(runnable, j10);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f13544a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f13545b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                }
                break;
            default:
                ((x1.e) this.f13545b).unscheduleSelf(runnable);
                break;
        }
    }

    public f(x1.e eVar) {
        this.f13545b = eVar;
    }
}
