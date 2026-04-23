package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashMap;
import w.a;
import w.d;
import z.b;
import z.q;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f409t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f410u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a f411v;

    public Barrier(Context context) {
        super(context);
        this.f20476a = new int[32];
        this.f20482s = new HashMap();
        this.f20478d = context;
        g(null);
        super.setVisibility(8);
    }

    @Override // z.b
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        a aVar = new a();
        aVar.f17952s0 = 0;
        aVar.f17953t0 = true;
        aVar.f17954u0 = 0;
        aVar.f17955v0 = false;
        this.f411v = aVar;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f20633b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f411v.f17953t0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f411v.f17954u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f20479f = this.f411v;
        i();
    }

    public boolean getAllowsGoneWidget() {
        return this.f411v.f17953t0;
    }

    public int getMargin() {
        return this.f411v.f17954u0;
    }

    public int getType() {
        return this.f409t;
    }

    @Override // z.b
    public final void h(d dVar, boolean z9) {
        int i10 = this.f409t;
        this.f410u = i10;
        if (z9) {
            if (i10 == 5) {
                this.f410u = 1;
            } else if (i10 == 6) {
                this.f410u = 0;
            }
        } else if (i10 == 5) {
            this.f410u = 0;
        } else if (i10 == 6) {
            this.f410u = 1;
        }
        if (dVar instanceof a) {
            ((a) dVar).f17952s0 = this.f410u;
        }
    }

    public void setAllowsGoneWidget(boolean z9) {
        this.f411v.f17953t0 = z9;
    }

    public void setDpMargin(int i10) {
        this.f411v.f17954u0 = (int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i10) {
        this.f411v.f17954u0 = i10;
    }

    public void setType(int i10) {
        this.f409t = i10;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
