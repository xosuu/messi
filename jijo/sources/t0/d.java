package t0;

import android.database.Cursor;
import android.widget.Filter;
import java.util.List;
import l.k3;
import r8.f;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16812a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16813b;

    public d(c cVar) {
        this.f16813b = cVar;
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        switch (this.f16812a) {
            case 0:
                return ((k3) ((c) this.f16813b)).c((Cursor) obj);
            default:
                return super.convertResultToString(obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r6) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.d.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        switch (this.f16812a) {
            case 0:
                c cVar = (c) this.f16813b;
                Cursor cursor = ((b) cVar).f16807d;
                Object obj = filterResults.values;
                if (obj != null && obj != cursor) {
                    ((k3) cVar).b((Cursor) obj);
                    break;
                }
                break;
            default:
                f fVar = (f) this.f16813b;
                fVar.f16560q = (List) filterResults.values;
                fVar.d();
                break;
        }
    }

    public d(f fVar) {
        this.f16813b = fVar;
    }

    public /* synthetic */ d(f fVar, int i10) {
        this(fVar);
    }
}
