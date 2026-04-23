package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f728a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f728a) {
            case 0:
                return new BackStackState(parcel);
            case 1:
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = new FragmentManager$LaunchedFragmentInfo();
                fragmentManager$LaunchedFragmentInfo.f679a = parcel.readString();
                fragmentManager$LaunchedFragmentInfo.f680b = parcel.readInt();
                return fragmentManager$LaunchedFragmentInfo;
            case 2:
                FragmentManagerState fragmentManagerState = new FragmentManagerState();
                fragmentManagerState.f685h = null;
                fragmentManagerState.f686q = new ArrayList();
                fragmentManagerState.f687s = new ArrayList();
                fragmentManagerState.f681a = parcel.createTypedArrayList(FragmentState.CREATOR);
                fragmentManagerState.f682b = parcel.createStringArrayList();
                fragmentManagerState.f683d = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
                fragmentManagerState.f684f = parcel.readInt();
                fragmentManagerState.f685h = parcel.readString();
                fragmentManagerState.f686q = parcel.createStringArrayList();
                fragmentManagerState.f687s = parcel.createTypedArrayList(Bundle.CREATOR);
                fragmentManagerState.f688t = parcel.createTypedArrayList(FragmentManager$LaunchedFragmentInfo.CREATOR);
                return fragmentManagerState;
            default:
                return new FragmentState(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f728a) {
            case 0:
                return new BackStackState[i10];
            case 1:
                return new FragmentManager$LaunchedFragmentInfo[i10];
            case 2:
                return new FragmentManagerState[i10];
            default:
                return new FragmentState[i10];
        }
    }
}
