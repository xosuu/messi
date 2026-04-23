package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f372a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f372a) {
            case 0:
                ActionMenuPresenter$SavedState actionMenuPresenter$SavedState = new ActionMenuPresenter$SavedState();
                actionMenuPresenter$SavedState.f264a = parcel.readInt();
                return actionMenuPresenter$SavedState;
            default:
                AppCompatSpinner$SavedState appCompatSpinner$SavedState = new AppCompatSpinner$SavedState(parcel);
                appCompatSpinner$SavedState.f273a = parcel.readByte() != 0;
                return appCompatSpinner$SavedState;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f372a) {
            case 0:
                return new ActionMenuPresenter$SavedState[i10];
            default:
                return new AppCompatSpinner$SavedState[i10];
        }
    }
}
