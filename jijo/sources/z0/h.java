package z0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class h extends d5.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f20660s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f20661t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f20662u = true;

    public h(TextView textView) {
        this.f20660s = textView;
        this.f20661t = new f(textView);
    }

    @Override // d5.e
    public final InputFilter[] h(InputFilter[] inputFilterArr) {
        if (!this.f20662u) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof f) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                if (sparseArray.indexOfKey(i12) < 0) {
                    inputFilterArr2[i11] = inputFilterArr[i12];
                    i11++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i13 = 0;
        while (true) {
            f fVar = this.f20661t;
            if (i13 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = fVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i13] == fVar) {
                return inputFilterArr;
            }
            i13++;
        }
    }

    @Override // d5.e
    public final boolean n() {
        return this.f20662u;
    }

    @Override // d5.e
    public final void q(boolean z9) {
        if (z9) {
            TextView textView = this.f20660s;
            textView.setTransformationMethod(x(textView.getTransformationMethod()));
        }
    }

    @Override // d5.e
    public final void t(boolean z9) {
        this.f20662u = z9;
        TextView textView = this.f20660s;
        textView.setTransformationMethod(x(textView.getTransformationMethod()));
        textView.setFilters(h(textView.getFilters()));
    }

    @Override // d5.e
    public final TransformationMethod x(TransformationMethod transformationMethod) {
        return this.f20662u ? ((transformationMethod instanceof k) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new k(transformationMethod) : transformationMethod instanceof k ? ((k) transformationMethod).f20668a : transformationMethod;
    }
}
