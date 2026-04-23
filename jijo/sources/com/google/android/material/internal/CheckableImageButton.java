package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.customview.view.AbsSavedState;
import l.z;
import o0.v0;
import z1.e;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends z implements Checkable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f11916s = {R.attr.state_checked};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11917f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11918h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f11919q;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f11920d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f11920d = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f570a, i10);
            parcel.writeInt(this.f11920d ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, xyz.easypro.httpcustom.R.attr.pa);
        this.f11918h = true;
        this.f11919q = true;
        v0.q(this, new e(this, 2));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f11917f;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        return this.f11917f ? View.mergeDrawableStates(super.onCreateDrawableState(i10 + 1), f11916s) : super.onCreateDrawableState(i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f570a);
        setChecked(savedState.f11920d);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f11920d = this.f11917f;
        return savedState;
    }

    public void setCheckable(boolean z9) {
        if (this.f11918h != z9) {
            this.f11918h = z9;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z9) {
        if (!this.f11918h || this.f11917f == z9) {
            return;
        }
        this.f11917f = z9;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z9) {
        this.f11919q = z9;
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        if (this.f11919q) {
            super.setPressed(z9);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f11917f);
    }
}
