package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f20597j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f20601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f20602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f20603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f20605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20606i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20597j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f20637f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            switch (f20597j.get(index)) {
                case 1:
                    this.f20602e = typedArrayObtainStyledAttributes.getFloat(index, this.f20602e);
                    break;
                case 2:
                    this.f20600c = typedArrayObtainStyledAttributes.getInt(index, this.f20600c);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        String str = v.a.f17670a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f20598a = m.f(typedArrayObtainStyledAttributes, index, this.f20598a);
                    break;
                case 6:
                    this.f20599b = typedArrayObtainStyledAttributes.getInteger(index, this.f20599b);
                    break;
                case 7:
                    this.f20601d = typedArrayObtainStyledAttributes.getFloat(index, this.f20601d);
                    break;
                case 8:
                    this.f20604g = typedArrayObtainStyledAttributes.getInteger(index, this.f20604g);
                    break;
                case 9:
                    this.f20603f = typedArrayObtainStyledAttributes.getFloat(index, this.f20603f);
                    break;
                case 10:
                    int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i11 == 1) {
                        this.f20606i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    } else if (i11 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f20605h = string;
                        if (string.indexOf("/") > 0) {
                            this.f20606i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.f20606i);
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
