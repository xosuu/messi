package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f20611n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f20612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f20613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f20614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f20615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f20616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f20617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f20618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20619h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f20620i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f20621j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f20622k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f20623l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f20624m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20611n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f20640i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            switch (f20611n.get(index)) {
                case 1:
                    this.f20612a = typedArrayObtainStyledAttributes.getFloat(index, this.f20612a);
                    break;
                case 2:
                    this.f20613b = typedArrayObtainStyledAttributes.getFloat(index, this.f20613b);
                    break;
                case 3:
                    this.f20614c = typedArrayObtainStyledAttributes.getFloat(index, this.f20614c);
                    break;
                case 4:
                    this.f20615d = typedArrayObtainStyledAttributes.getFloat(index, this.f20615d);
                    break;
                case 5:
                    this.f20616e = typedArrayObtainStyledAttributes.getFloat(index, this.f20616e);
                    break;
                case 6:
                    this.f20617f = typedArrayObtainStyledAttributes.getDimension(index, this.f20617f);
                    break;
                case 7:
                    this.f20618g = typedArrayObtainStyledAttributes.getDimension(index, this.f20618g);
                    break;
                case 8:
                    this.f20620i = typedArrayObtainStyledAttributes.getDimension(index, this.f20620i);
                    break;
                case 9:
                    this.f20621j = typedArrayObtainStyledAttributes.getDimension(index, this.f20621j);
                    break;
                case 10:
                    this.f20622k = typedArrayObtainStyledAttributes.getDimension(index, this.f20622k);
                    break;
                case 11:
                    this.f20623l = true;
                    this.f20624m = typedArrayObtainStyledAttributes.getDimension(index, this.f20624m);
                    break;
                case 12:
                    this.f20619h = m.f(typedArrayObtainStyledAttributes, index, this.f20619h);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
