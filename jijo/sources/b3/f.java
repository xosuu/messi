package b3;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.app.NotificationCompat;
import b7.u;
import com.codetroopers.betterpickers.calendardatepicker.MonthAdapter$CalendarDay;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends ListView implements AbsListView.OnScrollListener, c {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final SimpleDateFormat f1263v = new SimpleDateFormat("yyyy", Locale.getDefault());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f1264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MonthAdapter$CalendarDay f1265b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f1266d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MonthAdapter$CalendarDay f1267f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1268h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1269q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a f1270s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1271t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public e f1272u;

    @Override // b3.c
    public final void a() {
        b(((d) this.f1270s).e0(), false, true);
    }

    public final void b(MonthAdapter$CalendarDay monthAdapter$CalendarDay, boolean z9, boolean z10) {
        View childAt;
        MonthAdapter$CalendarDay monthAdapter$CalendarDay2 = this.f1265b;
        if (z10) {
            monthAdapter$CalendarDay2.getClass();
            monthAdapter$CalendarDay2.f1616h = monthAdapter$CalendarDay.f1616h;
            monthAdapter$CalendarDay2.f1617q = monthAdapter$CalendarDay.f1617q;
            monthAdapter$CalendarDay2.f1618s = monthAdapter$CalendarDay.f1618s;
        }
        MonthAdapter$CalendarDay monthAdapter$CalendarDay3 = this.f1267f;
        monthAdapter$CalendarDay3.getClass();
        monthAdapter$CalendarDay3.f1616h = monthAdapter$CalendarDay.f1616h;
        monthAdapter$CalendarDay3.f1617q = monthAdapter$CalendarDay.f1617q;
        monthAdapter$CalendarDay3.f1618s = monthAdapter$CalendarDay.f1618s;
        int i10 = monthAdapter$CalendarDay.f1616h;
        MonthAdapter$CalendarDay monthAdapter$CalendarDay4 = ((d) this.f1270s).M0;
        int i11 = (monthAdapter$CalendarDay.f1617q - monthAdapter$CalendarDay4.f1617q) + ((i10 - monthAdapter$CalendarDay4.f1616h) * 12);
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            childAt = getChildAt(i12);
            if (childAt == null || childAt.getTop() >= 0) {
                break;
            } else {
                i12 = i13;
            }
        }
        if (childAt != null) {
            getPositionForView(childAt);
        }
        if (z10) {
            k kVar = this.f1266d;
            kVar.f1294d = monthAdapter$CalendarDay2;
            kVar.notifyDataSetChanged();
        }
        setMonthDisplayed(monthAdapter$CalendarDay3);
        this.f1268h = 2;
        if (z9) {
            smoothScrollToPositionFromTop(i11, -1, 250);
            return;
        }
        clearFocus();
        post(new e(this, i11));
        onScrollStateChanged(this, 0);
    }

    public int getMostVisiblePosition() {
        int firstVisiblePosition = getFirstVisiblePosition();
        int height = getHeight();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < height) {
            View childAt = getChildAt(i11);
            if (childAt == null) {
                break;
            }
            int bottom = childAt.getBottom();
            int iMin = Math.min(bottom, height) - Math.max(0, childAt.getTop());
            if (iMin > i12) {
                i13 = i11;
                i12 = iMin;
            }
            i11++;
            i10 = bottom;
        }
        return firstVisiblePosition + i13;
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public final void layoutChildren() {
        MonthAdapter$CalendarDay accessibilityFocus;
        int i10;
        int childCount = getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                accessibilityFocus = null;
                break;
            }
            View childAt = getChildAt(i11);
            if ((childAt instanceof i) && (accessibilityFocus = ((i) childAt).getAccessibilityFocus()) != null) {
                break;
            } else {
                i11++;
            }
        }
        super.layoutChildren();
        if (this.f1271t) {
            this.f1271t = false;
            return;
        }
        if (accessibilityFocus == null) {
            return;
        }
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2 instanceof i) {
                i iVar = (i) childAt2;
                iVar.getClass();
                if (accessibilityFocus.f1616h == iVar.f1289x && accessibilityFocus.f1617q == iVar.f1288w && (i10 = accessibilityFocus.f1618s) <= iVar.G) {
                    g gVar = iVar.L;
                    gVar.b(gVar.f1275s).g(i10, 64, null);
                    return;
                }
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setItemCount(-1);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(NotificationCompat.FLAG_BUBBLE);
        accessibilityNodeInfo.addAction(8192);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        i iVar = (i) absListView.getChildAt(0);
        if (iVar == null) {
            return;
        }
        absListView.getFirstVisiblePosition();
        iVar.getHeight();
        iVar.getBottom();
        this.f1268h = this.f1269q;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
        e eVar = this.f1272u;
        f fVar = eVar.f1262d;
        fVar.f1264a.removeCallbacks(eVar);
        eVar.f1261b = i10;
        fVar.f1264a.postDelayed(eVar, 40L);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        View childAt;
        if (i10 != 4096 && i10 != 8192) {
            return super.performAccessibilityAction(i10, bundle);
        }
        int firstVisiblePosition = getFirstVisiblePosition();
        MonthAdapter$CalendarDay monthAdapter$CalendarDay = new MonthAdapter$CalendarDay((firstVisiblePosition / 12) + ((d) this.f1270s).M0.f1616h, firstVisiblePosition % 12, 1);
        if (i10 == 4096) {
            int i11 = monthAdapter$CalendarDay.f1617q + 1;
            monthAdapter$CalendarDay.f1617q = i11;
            if (i11 == 12) {
                monthAdapter$CalendarDay.f1617q = 0;
                monthAdapter$CalendarDay.f1616h++;
            }
        } else if (i10 == 8192 && (childAt = getChildAt(0)) != null && childAt.getTop() >= -1) {
            int i12 = monthAdapter$CalendarDay.f1617q - 1;
            monthAdapter$CalendarDay.f1617q = i12;
            if (i12 == -1) {
                monthAdapter$CalendarDay.f1617q = 11;
                monthAdapter$CalendarDay.f1616h--;
            }
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(monthAdapter$CalendarDay.f1616h, monthAdapter$CalendarDay.f1617q, monthAdapter$CalendarDay.f1618s);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(calendar.getDisplayName(2, 2, Locale.getDefault()));
        stringBuffer.append(" ");
        stringBuffer.append(f1263v.format(calendar.getTime()));
        u.B(this, stringBuffer.toString());
        b(monthAdapter$CalendarDay, true, false);
        this.f1271t = true;
        return true;
    }

    public void setController(a aVar) {
        this.f1270s = aVar;
        ((d) aVar).A0.add(this);
        k kVar = this.f1266d;
        if (kVar == null) {
            this.f1266d = new k(getContext(), this.f1270s);
        } else {
            kVar.f1294d = this.f1265b;
            kVar.notifyDataSetChanged();
        }
        setAdapter((ListAdapter) this.f1266d);
        a();
    }

    public void setMonthDisplayed(MonthAdapter$CalendarDay monthAdapter$CalendarDay) {
        int i10 = monthAdapter$CalendarDay.f1617q;
        invalidateViews();
    }

    public void setTheme(TypedArray typedArray) {
        k kVar = this.f1266d;
        if (kVar != null) {
            kVar.f1295f = typedArray;
        }
    }
}
