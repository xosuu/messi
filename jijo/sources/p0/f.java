package p0;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.app.NotificationCompat;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f16180e = new f(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f16181f = new f(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f16182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f f16183h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f f16184i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f f16185j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final f f16186k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final f f16187l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final f f16188m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f f16189n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f16192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f16193d;

    static {
        new f(4);
        new f(8);
        f16182g = new f(16);
        new f(32);
        new f(64);
        new f(NotificationCompat.FLAG_HIGH_PRIORITY);
        new f(NotificationCompat.FLAG_LOCAL_ONLY, m.class);
        new f(512, m.class);
        new f(1024, n.class);
        new f(2048, n.class);
        f16183h = new f(NotificationCompat.FLAG_BUBBLE);
        f16184i = new f(8192);
        new f(16384);
        new f(32768);
        new f(65536);
        new f(131072, r.class);
        f16185j = new f(262144);
        f16186k = new f(524288);
        f16187l = new f(1048576);
        new f(2097152, s.class);
        int i10 = Build.VERSION.SDK_INT;
        new f(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null, null);
        new f(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, null, p.class);
        f16188m = new f(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
        new f(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null, null);
        f16189n = new f(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
        new f(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null, null);
        new f(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new f(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new f(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new f(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new f(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null, null);
        new f(i10 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, q.class);
        new f(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, o.class);
        new f(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new f(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new f(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new f(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new f(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new f(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new f(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new f(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
    }

    public f(int i10) {
        this(null, i10, null, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f16190a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        Object obj2 = ((f) obj).f16190a;
        Object obj3 = this.f16190a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f16190a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public f(int i10, Class cls) {
        this(null, i10, null, null, cls);
    }

    public f(Object obj, int i10, String str, t tVar, Class cls) {
        this.f16191b = i10;
        this.f16193d = tVar;
        if (obj == null) {
            this.f16190a = new AccessibilityNodeInfo.AccessibilityAction(i10, str);
        } else {
            this.f16190a = obj;
        }
        this.f16192c = cls;
    }
}
