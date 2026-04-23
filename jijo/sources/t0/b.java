package t0;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.google.android.gms.internal.ads.fb1;
import l.h2;
import l.k3;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends BaseAdapter implements Filterable, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16806b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Cursor f16807d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16808f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f16809h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public h2 f16810q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public d f16811s;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f16807d;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f16809h;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                h2 h2Var = this.f16810q;
                if (h2Var != null) {
                    cursor2.unregisterDataSetObserver(h2Var);
                }
            }
            this.f16807d = cursor;
            if (cursor != null) {
                a aVar2 = this.f16809h;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                h2 h2Var2 = this.f16810q;
                if (h2Var2 != null) {
                    cursor.registerDataSetObserver(h2Var2);
                }
                this.f16808f = cursor.getColumnIndexOrThrow("_id");
                this.f16805a = true;
                notifyDataSetChanged();
            } else {
                this.f16808f = -1;
                this.f16805a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f16805a || (cursor = this.f16807d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f16805a) {
            return null;
        }
        this.f16807d.moveToPosition(i10);
        if (view == null) {
            k3 k3Var = (k3) this;
            view = k3Var.f14924v.inflate(k3Var.f14923u, viewGroup, false);
        }
        a(view, this.f16807d);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f16811s == null) {
            this.f16811s = new d(this);
        }
        return this.f16811s;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        Cursor cursor;
        if (!this.f16805a || (cursor = this.f16807d) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f16807d;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        Cursor cursor;
        if (this.f16805a && (cursor = this.f16807d) != null && cursor.moveToPosition(i10)) {
            return this.f16807d.getLong(this.f16808f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f16805a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f16807d.moveToPosition(i10)) {
            throw new IllegalStateException(fb1.g("couldn't move cursor to position ", i10));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f16807d);
        return view;
    }
}
