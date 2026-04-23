package q8;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class p extends ArrayAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16471a;

    static {
        NativeUtil.classesInit0(67);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Context context, int i10) {
        super(context, R.layout.simple_spinner_item);
        this.f16471a = i10;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final native View getDropDownView(int i10, View view, ViewGroup viewGroup);

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final native View getView(int i10, View view, ViewGroup viewGroup);
}
