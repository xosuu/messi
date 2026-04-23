package g3;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.github.clans.fab.FloatingActionButton;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class b extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f13638b;

    public /* synthetic */ b(View view, int i10) {
        this.f13637a = i10;
        this.f13638b = view;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        int i10 = this.f13637a;
        View view = this.f13638b;
        switch (i10) {
            case 0:
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                k kVar = (k) floatingActionButton.getTag(R.id.j1);
                if (kVar != null) {
                    kVar.c();
                }
                floatingActionButton.h();
                break;
            default:
                k kVar2 = (k) view;
                kVar2.c();
                FloatingActionButton floatingActionButton2 = kVar2.f13675y;
                if (floatingActionButton2 != null) {
                    floatingActionButton2.h();
                }
                break;
        }
        return super.onDown(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        int i10 = this.f13637a;
        View view = this.f13638b;
        switch (i10) {
            case 0:
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                k kVar = (k) floatingActionButton.getTag(R.id.j1);
                if (kVar != null) {
                    kVar.d();
                }
                floatingActionButton.i();
                break;
            default:
                k kVar2 = (k) view;
                kVar2.d();
                FloatingActionButton floatingActionButton2 = kVar2.f13675y;
                if (floatingActionButton2 != null) {
                    floatingActionButton2.i();
                }
                break;
        }
        return super.onSingleTapUp(motionEvent);
    }
}
