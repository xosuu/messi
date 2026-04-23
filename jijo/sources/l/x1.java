package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.InvocationTargetException;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class x1 extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f15056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15057b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15058d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15059f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15060h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15061q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public v1 f15062s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f15063t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f15064u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f15065v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public s0.g f15066w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public androidx.activity.e f15067x;

    public x1(Context context, boolean z9) {
        super(context, null, R.attr.ki);
        this.f15056a = new Rect();
        this.f15057b = 0;
        this.f15058d = 0;
        this.f15059f = 0;
        this.f15060h = 0;
        this.f15064u = z9;
        setCacheColorHint(0);
    }

    public final int a(int i10, int i11) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i12 = 0;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i14 = layoutParams.height;
            view.measure(i10, i14 > 0 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i13 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i11) {
                return i11;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.x1.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f15056a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f15067x != null) {
            return;
        }
        super.drawableStateChanged();
        v1 v1Var = this.f15062s;
        if (v1Var != null) {
            v1Var.f15038b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f15065v && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f15064u || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f15064u || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f15064u || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f15064u && this.f15063t) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f15067x = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        int i11 = 3;
        if (actionMasked == 10 && this.f15067x == null) {
            androidx.activity.e eVar = new androidx.activity.e(i11, this);
            this.f15067x = eVar;
            post(eVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i10 < 30 || !t1.f15005d) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            t1.f15002a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                            t1.f15003b.invoke(this, Integer.valueOf(iPointToPosition));
                            t1.f15004c.invoke(this, Integer.valueOf(iPointToPosition));
                        } catch (IllegalAccessException | InvocationTargetException unused) {
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f15065v && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f15061q = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        androidx.activity.e eVar = this.f15067x;
        if (eVar != null) {
            x1 x1Var = (x1) eVar.f143b;
            x1Var.f15067x = null;
            x1Var.removeCallbacks(eVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z9) {
        this.f15063t = z9;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        v1 v1Var = null;
        if (drawable != null) {
            v1 v1Var2 = new v1();
            Drawable drawable2 = v1Var2.f15037a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            v1Var2.f15037a = drawable;
            drawable.setCallback(v1Var2);
            v1Var2.f15038b = true;
            v1Var = v1Var2;
        }
        this.f15062s = v1Var;
        super.setSelector(v1Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f15057b = rect.left;
        this.f15058d = rect.top;
        this.f15059f = rect.right;
        this.f15060h = rect.bottom;
    }
}
