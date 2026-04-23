package o0;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.fb1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ArrayList f16069d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f16070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SparseArray f16071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f16072c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f16070a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View viewA = a(viewGroup.getChildAt(childCount));
                    if (viewA != null) {
                        return viewA;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.vf);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                fb1.t(arrayList.get(size));
                throw null;
            }
        }
        return null;
    }
}
