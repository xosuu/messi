package k3;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.zzau;

/* JADX INFO: loaded from: classes.dex */
public final class b extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzau f14666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14667b;

    public b(Activity activity, String str, String str2, String str3) {
        super(activity);
        zzau zzauVar = new zzau(activity, str);
        this.f14666a = zzauVar;
        zzauVar.zzo(str2);
        zzauVar.zzn(str3);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f14667b) {
            return false;
        }
        this.f14666a.zzm(motionEvent);
        return false;
    }
}
