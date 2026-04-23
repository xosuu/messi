package l;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class i3 extends TouchDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f14869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f14870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f14871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f14872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14874f;

    public i3(Rect rect, Rect rect2, SearchView.SearchAutoComplete searchAutoComplete) {
        super(rect, searchAutoComplete);
        int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
        this.f14873e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f14870b = rect3;
        Rect rect4 = new Rect();
        this.f14872d = rect4;
        Rect rect5 = new Rect();
        this.f14871c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i10 = -scaledTouchSlop;
        rect4.inset(i10, i10);
        rect5.set(rect2);
        this.f14869a = searchAutoComplete;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        int x9 = (int) motionEvent.getX();
        int y8 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z11 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z10 = this.f14874f;
                if (z10 && !this.f14872d.contains(x9, y8)) {
                    z11 = z10;
                    z9 = false;
                }
            } else {
                if (action == 3) {
                    z10 = this.f14874f;
                    this.f14874f = false;
                }
                z9 = true;
                z11 = false;
            }
            z11 = z10;
            z9 = true;
        } else {
            if (this.f14870b.contains(x9, y8)) {
                this.f14874f = true;
                z9 = true;
            }
            z9 = true;
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        Rect rect = this.f14871c;
        View view = this.f14869a;
        if (!z9 || rect.contains(x9, y8)) {
            motionEvent.setLocation(x9 - rect.left, y8 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
