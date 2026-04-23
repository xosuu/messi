package g;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class e extends k implements h0.h {
    public b B;
    public q7.b C;
    public int D;
    public int E;
    public boolean F;

    public e(b bVar, Resources resources) {
        this.f13577h = 255;
        this.f13579s = -1;
        this.D = -1;
        this.E = -1;
        d(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x026f, code lost:
    
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0276, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static g.e e(android.content.Context r20, android.content.res.Resources.Theme r21, android.content.res.Resources r22, android.util.AttributeSet r23, android.content.res.XmlResourceParser r24) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.e(android.content.Context, android.content.res.Resources$Theme, android.content.res.Resources, android.util.AttributeSet, android.content.res.XmlResourceParser):g.e");
    }

    @Override // g.h
    public final void d(b bVar) {
        this.f13573a = bVar;
        int i10 = this.f13579s;
        if (i10 >= 0) {
            Drawable drawableD = bVar.d(i10);
            this.f13575d = drawableD;
            if (drawableD != null) {
                b(drawableD);
            }
        }
        this.f13576f = null;
        this.f13598z = bVar;
        this.B = bVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // g.h, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        q7.b bVar = this.C;
        if (bVar != null) {
            bVar.t();
            this.C = null;
            c(this.D);
            this.D = -1;
            this.E = -1;
        }
    }

    @Override // g.k, g.h, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.F) {
            super.mutate();
            b bVar = this.B;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.F = true;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0128  */
    @Override // g.k, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStateChange(int[] r18) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.onStateChange(int[]):boolean");
    }

    @Override // g.h, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z9, boolean z10) {
        boolean visible = super.setVisible(z9, z10);
        q7.b bVar = this.C;
        if (bVar != null && (visible || z10)) {
            if (z9) {
                bVar.s();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
