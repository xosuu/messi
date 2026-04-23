package h5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes.dex */
public final class q extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f14064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f14066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f14067e;

    public q(s sVar, int i10, TextView textView, int i11, TextView textView2) {
        this.f14067e = sVar;
        this.f14063a = i10;
        this.f14064b = textView;
        this.f14065c = i11;
        this.f14066d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AppCompatTextView appCompatTextView;
        int i10 = this.f14063a;
        s sVar = this.f14067e;
        sVar.f14082n = i10;
        sVar.f14080l = null;
        TextView textView = this.f14064b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f14065c == 1 && (appCompatTextView = sVar.f14086r) != null) {
                appCompatTextView.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f14066d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f14066d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
