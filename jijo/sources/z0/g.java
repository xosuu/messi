package z0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class g implements KeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyListener f20658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d5.e f20659b;

    public g(KeyListener keyListener) {
        d5.e eVar = new d5.e();
        this.f20658a = keyListener;
        this.f20659b = eVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f20658a.clearMetaKeyState(view, editable, i10);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f20658a.getInputType();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // android.text.method.KeyListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onKeyDown(android.view.View r4, android.text.Editable r5, int r6, android.view.KeyEvent r7) {
        /*
            r3 = this;
            d5.e r0 = r3.f20659b
            r0.getClass()
            java.lang.Object r0 = androidx.emoji2.text.l.f603i
            r0 = 67
            r1 = 1
            r2 = 0
            if (r6 == r0) goto L17
            r0 = 112(0x70, float:1.57E-43)
            if (r6 == r0) goto L12
            goto L21
        L12:
            boolean r0 = androidx.emoji2.text.r.a(r5, r7, r1)
            goto L1b
        L17:
            boolean r0 = androidx.emoji2.text.r.a(r5, r7, r2)
        L1b:
            if (r0 == 0) goto L21
            android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(r5)
            goto L2b
        L21:
            android.text.method.KeyListener r0 = r3.f20658a
            boolean r4 = r0.onKeyDown(r4, r5, r6, r7)
            if (r4 == 0) goto L2a
            goto L2b
        L2a:
            r1 = 0
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.g.onKeyDown(android.view.View, android.text.Editable, int, android.view.KeyEvent):boolean");
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f20658a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f20658a.onKeyUp(view, editable, i10, keyEvent);
    }
}
