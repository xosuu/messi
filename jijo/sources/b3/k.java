package b3;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import com.codetroopers.betterpickers.calendardatepicker.MonthAdapter$CalendarDay;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class k extends BaseAdapter implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f1293b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MonthAdapter$CalendarDay f1294d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TypedArray f1295f;

    public k(Context context, a aVar) {
        this.f1292a = context;
        this.f1293b = aVar;
        MonthAdapter$CalendarDay monthAdapter$CalendarDay = new MonthAdapter$CalendarDay(System.currentTimeMillis());
        this.f1294d = monthAdapter$CalendarDay;
        d dVar = (d) aVar;
        if (monthAdapter$CalendarDay.compareTo(dVar.N0) > 0) {
            this.f1294d = dVar.N0;
        }
        if (this.f1294d.compareTo(dVar.M0) < 0) {
            this.f1294d = dVar.M0;
        }
        this.f1294d = dVar.e0();
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int getCount() {
        a aVar = this.f1293b;
        return ((((((d) aVar).N0.f1616h - ((d) aVar).M0.f1616h) + 1) * 12) - (11 - ((d) aVar).N0.f1617q)) - ((d) aVar).M0.f1617q;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        i lVar;
        HashMap<String, Integer> map;
        int i11 = -1;
        if (view != null) {
            lVar = (i) view;
            map = (HashMap) lVar.getTag();
        } else {
            lVar = new l(this.f1292a);
            lVar.setTheme(this.f1295f);
            lVar.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
            lVar.setClickable(true);
            lVar.setOnDayClickListener(this);
            map = null;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.clear();
        a aVar = this.f1293b;
        int i12 = (((d) aVar).M0.f1617q + i10) % 12;
        int i13 = ((i10 + ((d) aVar).M0.f1617q) / 12) + ((d) aVar).M0.f1616h;
        MonthAdapter$CalendarDay monthAdapter$CalendarDay = this.f1294d;
        int i14 = (monthAdapter$CalendarDay.f1616h == i13 && monthAdapter$CalendarDay.f1617q == i12) ? monthAdapter$CalendarDay.f1618s : -1;
        MonthAdapter$CalendarDay monthAdapter$CalendarDay2 = ((d) aVar).M0;
        int i15 = (monthAdapter$CalendarDay2.f1616h == i13 && monthAdapter$CalendarDay2.f1617q == i12) ? ((d) aVar).M0.f1618s : -1;
        MonthAdapter$CalendarDay monthAdapter$CalendarDay3 = ((d) aVar).N0;
        if (monthAdapter$CalendarDay3.f1616h == i13 && monthAdapter$CalendarDay3.f1617q == i12) {
            i11 = ((d) aVar).N0.f1618s;
        }
        lVar.M = 6;
        lVar.requestLayout();
        if (((d) aVar).O0 != null) {
            lVar.setDisabledDays(((d) aVar).O0);
        }
        g1.a.t(i14, map, "selected_day", i13, "year");
        map.put("month", Integer.valueOf(i12));
        g1.a.t(((d) aVar).L0, map, "week_start", i15, "range_min");
        map.put("range_max", Integer.valueOf(i11));
        lVar.setMonthParams(map);
        lVar.invalidate();
        return lVar;
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int i10) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final /* bridge */ /* synthetic */ boolean hasStableIds() {
        return true;
    }
}
