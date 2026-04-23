package androidx.activity.result;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.RemoteException;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.xv0;
import java.util.ArrayList;
import o0.t;
import o0.t1;
import z.m;
import z.q;

/* JADX INFO: loaded from: classes.dex */
public final class h implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f199b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f200d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f201f;

    public h(int i10, ArrayList arrayList, int i11, t7 t7Var) {
        this.f198a = i10;
        this.f200d = arrayList;
        this.f199b = i11;
        this.f201f = t7Var;
    }

    public final synchronized void a() {
        try {
            xv0 xv0Var = (xv0) this.f201f;
            if (xv0Var.f10668b) {
                xv0Var.f10667a.X0((byte[]) this.f200d);
                ((xv0) this.f201f).f10667a.k(this.f198a);
                ((xv0) this.f201f).f10667a.c(this.f199b);
                ((xv0) this.f201f).f10667a.A0();
                ((xv0) this.f201f).f10667a.zzf();
            }
        } catch (RemoteException unused) {
        }
    }

    @Override // o0.t
    public final t1 h(View view, t1 t1Var) {
        int i10 = t1Var.f16068a.f(7).f13602b;
        int i11 = this.f198a;
        Object obj = this.f200d;
        if (i11 >= 0) {
            View view2 = (View) obj;
            view2.getLayoutParams().height = this.f198a + i10;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        View view3 = (View) obj;
        view3.setPadding(view3.getPaddingLeft(), this.f199b + i10, view3.getPaddingRight(), view3.getPaddingBottom());
        return t1Var;
    }

    public h(Context context, XmlResourceParser xmlResourceParser) {
        this.f200d = new ArrayList();
        this.f199b = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f20639h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                this.f198a = typedArrayObtainStyledAttributes.getResourceId(index, this.f198a);
            } else if (index == 1) {
                this.f199b = typedArrayObtainStyledAttributes.getResourceId(index, this.f199b);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f199b);
                context.getResources().getResourceName(this.f199b);
                if ("layout".equals(resourceTypeName)) {
                    m mVar = new m();
                    this.f201f = mVar;
                    mVar.b((ConstraintLayout) LayoutInflater.from(context).inflate(this.f199b, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
