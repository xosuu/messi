package b3;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.w;
import b7.u;
import com.codetroopers.betterpickers.calendardatepicker.TextViewWithCircularIndicator;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class o extends ListView implements AdapterView.OnItemClickListener, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f1302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f1303b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1304d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1305f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextViewWithCircularIndicator f1306h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1307q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1308s;

    public o(w wVar, a aVar) {
        super(wVar);
        this.f1302a = aVar;
        d dVar = (d) aVar;
        dVar.A0.add(this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Resources resources = wVar.getResources();
        this.f1304d = resources.getDimensionPixelOffset(R.dimen.c7);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.uc);
        this.f1305f = dimensionPixelOffset;
        setVerticalFadingEdgeEnabled(true);
        setFadingEdgeLength(dimensionPixelOffset / 3);
        ArrayList arrayList = new ArrayList();
        for (int i10 = dVar.M0.f1616h; i10 <= dVar.N0.f1616h; i10++) {
            arrayList.add(String.format("%d", Integer.valueOf(i10)));
        }
        n nVar = new n(this, wVar, R.layout.aw, arrayList, 0);
        this.f1303b = nVar;
        setAdapter((ListAdapter) nVar);
        setOnItemClickListener(this);
        setSelector(new StateListDrawable());
        setDividerHeight(0);
        a();
        this.f1308s = R.color.a9;
        this.f1307q = R.color.a1;
    }

    @Override // b3.c
    public final void a() {
        this.f1303b.notifyDataSetChanged();
        d dVar = (d) this.f1302a;
        post(new m(this, dVar.e0().f1616h - dVar.M0.f1616h, (this.f1304d / 2) - (this.f1305f / 2), 0));
    }

    public int getFirstPositionOffset() {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return 0;
        }
        return childAt.getTop();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4096) {
            accessibilityEvent.setFromIndex(0);
            accessibilityEvent.setToIndex(0);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        d dVar = (d) this.f1302a;
        dVar.P0.b();
        TextViewWithCircularIndicator textViewWithCircularIndicator = (TextViewWithCircularIndicator) view;
        if (textViewWithCircularIndicator != null) {
            TextViewWithCircularIndicator textViewWithCircularIndicator2 = this.f1306h;
            if (textViewWithCircularIndicator != textViewWithCircularIndicator2) {
                if (textViewWithCircularIndicator2 != null) {
                    textViewWithCircularIndicator2.f1622f = false;
                    textViewWithCircularIndicator2.requestLayout();
                }
                textViewWithCircularIndicator.f1622f = true;
                textViewWithCircularIndicator.requestLayout();
                this.f1306h = textViewWithCircularIndicator;
            }
            int iIntValue = Integer.valueOf(textViewWithCircularIndicator.getText().toString()).intValue();
            Calendar calendar = dVar.f1257x0;
            int i11 = calendar.get(2);
            int i12 = calendar.get(5);
            int iL = u.l(i11, iIntValue);
            if (i12 > iL) {
                calendar.set(5, iL);
            }
            calendar.set(1, iIntValue);
            Iterator it = dVar.A0.iterator();
            while (it.hasNext()) {
                ((c) it.next()).a();
            }
            dVar.f0(0);
            dVar.g0(true);
            this.f1303b.notifyDataSetChanged();
        }
    }

    public void setTheme(TypedArray typedArray) {
        this.f1308s = typedArray.getColor(15, d0.f.b(getContext(), R.color.a9));
        this.f1307q = typedArray.getColor(4, d0.f.b(getContext(), R.color.a1));
    }
}
