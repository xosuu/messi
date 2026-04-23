package d3;

import android.view.animation.Animation;
import com.codetroopers.betterpickers.numberpicker.NumberPickerErrorTextView;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NumberPickerErrorTextView f12354b;

    public /* synthetic */ a(NumberPickerErrorTextView numberPickerErrorTextView, int i10) {
        this.f12353a = i10;
        this.f12354b = numberPickerErrorTextView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i10 = this.f12353a;
        NumberPickerErrorTextView numberPickerErrorTextView = this.f12354b;
        switch (i10) {
            case 0:
                numberPickerErrorTextView.f1715b.postDelayed(numberPickerErrorTextView.f1714a, 3000L);
                numberPickerErrorTextView.setVisibility(0);
                break;
            default:
                numberPickerErrorTextView.setVisibility(4);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
