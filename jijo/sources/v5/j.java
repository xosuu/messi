package v5;

/* JADX INFO: loaded from: classes.dex */
public final class j extends k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f17834h;

    public j(float f10, float f11) {
        this.f17835a = f10;
        this.f17834h = f11;
        this.f17836b = Float.TYPE;
        this.f17838f = true;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final j clone() {
        j jVar = new j(this.f17835a, this.f17834h);
        jVar.f17837d = this.f17837d;
        return jVar;
    }
}
