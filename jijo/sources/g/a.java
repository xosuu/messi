package g;

import android.graphics.drawable.Animatable;

/* JADX INFO: loaded from: classes.dex */
public final class a extends q7.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Animatable f13538c;

    public /* synthetic */ a(Animatable animatable, int i10) {
        this.f13537b = i10;
        this.f13538c = animatable;
    }

    @Override // q7.b
    public final void s() {
        int i10 = this.f13537b;
        Animatable animatable = this.f13538c;
        switch (i10) {
            case 0:
                animatable.start();
                break;
            default:
                ((x1.e) animatable).start();
                break;
        }
    }

    @Override // q7.b
    public final void t() {
        int i10 = this.f13537b;
        Animatable animatable = this.f13538c;
        switch (i10) {
            case 0:
                animatable.stop();
                break;
            default:
                ((x1.e) animatable).stop();
                break;
        }
    }
}
