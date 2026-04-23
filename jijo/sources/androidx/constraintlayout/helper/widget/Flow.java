package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import w.d;
import w.g;
import x.b;
import z.q;
import z.s;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends s {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public g f408v;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // z.s, z.b
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        g gVar = new g();
        gVar.f18053s0 = 0;
        gVar.f18054t0 = 0;
        gVar.f18055u0 = 0;
        gVar.f18056v0 = 0;
        gVar.f18057w0 = 0;
        gVar.f18058x0 = 0;
        gVar.f18059y0 = false;
        gVar.f18060z0 = 0;
        gVar.A0 = 0;
        gVar.B0 = new b();
        gVar.C0 = null;
        gVar.D0 = -1;
        gVar.E0 = -1;
        gVar.F0 = -1;
        gVar.G0 = -1;
        gVar.H0 = -1;
        gVar.I0 = -1;
        gVar.J0 = 0.5f;
        gVar.K0 = 0.5f;
        gVar.L0 = 0.5f;
        gVar.M0 = 0.5f;
        gVar.N0 = 0.5f;
        gVar.O0 = 0.5f;
        gVar.P0 = 0;
        gVar.Q0 = 0;
        gVar.R0 = 2;
        gVar.S0 = 2;
        gVar.T0 = 0;
        gVar.U0 = -1;
        gVar.V0 = 0;
        gVar.W0 = new ArrayList();
        gVar.X0 = null;
        gVar.Y0 = null;
        gVar.Z0 = null;
        gVar.f18052b1 = 0;
        this.f408v = gVar;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f20633b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f408v.V0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar2 = this.f408v;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f18053s0 = dimensionPixelSize;
                    gVar2.f18054t0 = dimensionPixelSize;
                    gVar2.f18055u0 = dimensionPixelSize;
                    gVar2.f18056v0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar3 = this.f408v;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar3.f18055u0 = dimensionPixelSize2;
                    gVar3.f18057w0 = dimensionPixelSize2;
                    gVar3.f18058x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f408v.f18056v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f408v.f18057w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f408v.f18053s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f408v.f18058x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f408v.f18054t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f408v.T0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f408v.D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f408v.E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f408v.F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f408v.H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f408v.G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f408v.I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f408v.J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f408v.L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f408v.N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f408v.M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f408v.O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f408v.K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f408v.R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f408v.S0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f408v.P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f408v.Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f408v.U0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f20479f = this.f408v;
        i();
    }

    @Override // z.b
    public final void h(d dVar, boolean z9) {
        g gVar = this.f408v;
        int i10 = gVar.f18055u0;
        if (i10 > 0 || gVar.f18056v0 > 0) {
            if (z9) {
                gVar.f18057w0 = gVar.f18056v0;
                gVar.f18058x0 = i10;
            } else {
                gVar.f18057w0 = i10;
                gVar.f18058x0 = gVar.f18056v0;
            }
        }
    }

    @Override // z.s
    public final void j(g gVar, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (gVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            gVar.V(mode, size, mode2, size2);
            setMeasuredDimension(gVar.f18060z0, gVar.A0);
        }
    }

    @Override // z.b, android.view.View
    public final void onMeasure(int i10, int i11) {
        j(this.f408v, i10, i11);
    }

    public void setFirstHorizontalBias(float f10) {
        this.f408v.L0 = f10;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f408v.F0 = i10;
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f408v.M0 = f10;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f408v.G0 = i10;
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f408v.R0 = i10;
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f408v.J0 = f10;
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f408v.P0 = i10;
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f408v.D0 = i10;
        requestLayout();
    }

    public void setLastHorizontalBias(float f10) {
        this.f408v.N0 = f10;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i10) {
        this.f408v.H0 = i10;
        requestLayout();
    }

    public void setLastVerticalBias(float f10) {
        this.f408v.O0 = f10;
        requestLayout();
    }

    public void setLastVerticalStyle(int i10) {
        this.f408v.I0 = i10;
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f408v.U0 = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f408v.V0 = i10;
        requestLayout();
    }

    public void setPadding(int i10) {
        g gVar = this.f408v;
        gVar.f18053s0 = i10;
        gVar.f18054t0 = i10;
        gVar.f18055u0 = i10;
        gVar.f18056v0 = i10;
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f408v.f18054t0 = i10;
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f408v.f18057w0 = i10;
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f408v.f18058x0 = i10;
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f408v.f18053s0 = i10;
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f408v.S0 = i10;
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f408v.K0 = f10;
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f408v.Q0 = i10;
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f408v.E0 = i10;
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f408v.T0 = i10;
        requestLayout();
    }
}
