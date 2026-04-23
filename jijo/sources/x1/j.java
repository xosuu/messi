package x1;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f18321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f18322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f18323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f18324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f18325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f18326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f18327g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f18328h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f18329i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Matrix f18330j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f18331k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f18332l;

    public j() {
        this.f18321a = new Matrix();
        this.f18322b = new ArrayList();
        this.f18323c = 0.0f;
        this.f18324d = 0.0f;
        this.f18325e = 0.0f;
        this.f18326f = 1.0f;
        this.f18327g = 1.0f;
        this.f18328h = 0.0f;
        this.f18329i = 0.0f;
        this.f18330j = new Matrix();
        this.f18332l = null;
    }

    @Override // x1.k
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f18322b;
            if (i10 >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i10)).a()) {
                return true;
            }
            i10++;
        }
    }

    @Override // x1.k
    public final boolean b(int[] iArr) {
        int i10 = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.f18322b;
            if (i10 >= arrayList.size()) {
                return zB;
            }
            zB |= ((k) arrayList.get(i10)).b(iArr);
            i10++;
        }
    }

    public final void c() {
        Matrix matrix = this.f18330j;
        matrix.reset();
        matrix.postTranslate(-this.f18324d, -this.f18325e);
        matrix.postScale(this.f18326f, this.f18327g);
        matrix.postRotate(this.f18323c, 0.0f, 0.0f);
        matrix.postTranslate(this.f18328h + this.f18324d, this.f18329i + this.f18325e);
    }

    public String getGroupName() {
        return this.f18332l;
    }

    public Matrix getLocalMatrix() {
        return this.f18330j;
    }

    public float getPivotX() {
        return this.f18324d;
    }

    public float getPivotY() {
        return this.f18325e;
    }

    public float getRotation() {
        return this.f18323c;
    }

    public float getScaleX() {
        return this.f18326f;
    }

    public float getScaleY() {
        return this.f18327g;
    }

    public float getTranslateX() {
        return this.f18328h;
    }

    public float getTranslateY() {
        return this.f18329i;
    }

    public void setPivotX(float f10) {
        if (f10 != this.f18324d) {
            this.f18324d = f10;
            c();
        }
    }

    public void setPivotY(float f10) {
        if (f10 != this.f18325e) {
            this.f18325e = f10;
            c();
        }
    }

    public void setRotation(float f10) {
        if (f10 != this.f18323c) {
            this.f18323c = f10;
            c();
        }
    }

    public void setScaleX(float f10) {
        if (f10 != this.f18326f) {
            this.f18326f = f10;
            c();
        }
    }

    public void setScaleY(float f10) {
        if (f10 != this.f18327g) {
            this.f18327g = f10;
            c();
        }
    }

    public void setTranslateX(float f10) {
        if (f10 != this.f18328h) {
            this.f18328h = f10;
            c();
        }
    }

    public void setTranslateY(float f10) {
        if (f10 != this.f18329i) {
            this.f18329i = f10;
            c();
        }
    }

    public j(j jVar, s.b bVar) {
        l hVar;
        this.f18321a = new Matrix();
        this.f18322b = new ArrayList();
        this.f18323c = 0.0f;
        this.f18324d = 0.0f;
        this.f18325e = 0.0f;
        this.f18326f = 1.0f;
        this.f18327g = 1.0f;
        this.f18328h = 0.0f;
        this.f18329i = 0.0f;
        Matrix matrix = new Matrix();
        this.f18330j = matrix;
        this.f18332l = null;
        this.f18323c = jVar.f18323c;
        this.f18324d = jVar.f18324d;
        this.f18325e = jVar.f18325e;
        this.f18326f = jVar.f18326f;
        this.f18327g = jVar.f18327g;
        this.f18328h = jVar.f18328h;
        this.f18329i = jVar.f18329i;
        String str = jVar.f18332l;
        this.f18332l = str;
        this.f18331k = jVar.f18331k;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(jVar.f18330j);
        ArrayList arrayList = jVar.f18322b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f18322b.add(new j((j) obj, bVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    i iVar2 = new i(iVar);
                    iVar2.f18311f = 0.0f;
                    iVar2.f18313h = 1.0f;
                    iVar2.f18314i = 1.0f;
                    iVar2.f18315j = 0.0f;
                    iVar2.f18316k = 1.0f;
                    iVar2.f18317l = 0.0f;
                    iVar2.f18318m = Paint.Cap.BUTT;
                    iVar2.f18319n = Paint.Join.MITER;
                    iVar2.f18320o = 4.0f;
                    iVar2.f18310e = iVar.f18310e;
                    iVar2.f18311f = iVar.f18311f;
                    iVar2.f18313h = iVar.f18313h;
                    iVar2.f18312g = iVar.f18312g;
                    iVar2.f18335c = iVar.f18335c;
                    iVar2.f18314i = iVar.f18314i;
                    iVar2.f18315j = iVar.f18315j;
                    iVar2.f18316k = iVar.f18316k;
                    iVar2.f18317l = iVar.f18317l;
                    iVar2.f18318m = iVar.f18318m;
                    iVar2.f18319n = iVar.f18319n;
                    iVar2.f18320o = iVar.f18320o;
                    hVar = iVar2;
                } else if (obj instanceof h) {
                    hVar = new h((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f18322b.add(hVar);
                Object obj2 = hVar.f18334b;
                if (obj2 != null) {
                    bVar.put(obj2, hVar);
                }
            }
        }
    }
}
