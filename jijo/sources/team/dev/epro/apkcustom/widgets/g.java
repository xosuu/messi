package team.dev.epro.apkcustom.widgets;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class g implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spinner f17416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17417b = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f17418d = null;

    static {
        NativeUtil.classesInit0(201);
    }

    public g(View view) {
        this.f17416a = view != null ? (Spinner) view : null;
    }

    public final native void a(ArrayAdapter arrayAdapter);

    public final native void b(String str);

    public final native void c(int i10);

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final native void onItemSelected(AdapterView adapterView, View view, int i10, long j10);

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final native void onNothingSelected(AdapterView adapterView);
}
