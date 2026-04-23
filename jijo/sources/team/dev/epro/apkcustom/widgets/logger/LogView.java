package team.dev.epro.apkcustom.widgets.logger;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import h9.a;
import java.util.ArrayList;
import xyz.easypro.ecrypt.NativeUtil;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class LogView extends ListView implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f17450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayAdapter f17451b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f17452d;

    static {
        NativeUtil.classesInit0(12);
    }

    public LogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ArrayList arrayList = new ArrayList();
        this.f17450a = arrayList;
        ArrayAdapter arrayAdapter = new ArrayAdapter(getContext(), R.layout.c_, arrayList);
        this.f17451b = arrayAdapter;
        setAdapter((ListAdapter) arrayAdapter);
    }

    public static native void b(StringBuilder sb, String str);

    @Override // h9.a
    public final native void a(int i10, String str, String str2);

    public native ArrayList<String> getArrayList();

    public native a getNext();

    public native void setNext(a aVar);
}
