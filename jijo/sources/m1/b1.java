package m1;

/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15418i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f15419j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f15420k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15421l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f15422m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15423n;

    public final void a(int i10) {
        if ((this.f15413d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f15413d));
    }

    public final int b() {
        return this.f15416g ? this.f15411b - this.f15412c : this.f15414e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f15410a + ", mData=null, mItemCount=" + this.f15414e + ", mIsMeasuring=" + this.f15418i + ", mPreviousLayoutItemCount=" + this.f15411b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f15412c + ", mStructureChanged=" + this.f15415f + ", mInPreLayout=" + this.f15416g + ", mRunSimpleAnimations=" + this.f15419j + ", mRunPredictiveAnimations=" + this.f15420k + '}';
    }
}
