package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f20526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f20527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f20528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f20529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20530e;

    public e(Context context, XmlResourceParser xmlResourceParser) {
        this.f20526a = Float.NaN;
        this.f20527b = Float.NaN;
        this.f20528c = Float.NaN;
        this.f20529d = Float.NaN;
        this.f20530e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f20641j);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f20530e);
                this.f20530e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new m().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f20529d = typedArrayObtainStyledAttributes.getDimension(index, this.f20529d);
            } else if (index == 2) {
                this.f20527b = typedArrayObtainStyledAttributes.getDimension(index, this.f20527b);
            } else if (index == 3) {
                this.f20528c = typedArrayObtainStyledAttributes.getDimension(index, this.f20528c);
            } else if (index == 4) {
                this.f20526a = typedArrayObtainStyledAttributes.getDimension(index, this.f20526a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
