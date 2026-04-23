package u0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.ParcelableSparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17507a;

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f17507a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbsSavedState.f569b;
                }
                throw new IllegalStateException("superState must be null");
            default:
                return new ParcelableSparseArray(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f17507a) {
            case 0:
                return new AbsSavedState[i10];
            default:
                return new ParcelableSparseArray[i10];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f17507a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return AbsSavedState.f569b;
                }
                throw new IllegalStateException("superState must be null");
            default:
                return new ParcelableSparseArray(parcel, null);
        }
    }
}
