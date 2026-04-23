package z0;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.emoji2.text.l;
import b7.u;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import l.n3;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d5.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final EditText f20644s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j f20645t;

    public a(EditText editText) {
        this.f20644s = editText;
        j jVar = new j(editText);
        this.f20645t = jVar;
        editText.addTextChangedListener(jVar);
        if (c.f20650b == null) {
            synchronized (c.f20649a) {
                try {
                    if (c.f20650b == null) {
                        c cVar = new c();
                        try {
                            c.f20651c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, c.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        c.f20650b = cVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(c.f20650b);
    }

    @Override // d5.e
    public final KeyListener j(KeyListener keyListener) {
        if (keyListener instanceof g) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new g(keyListener);
    }

    @Override // d5.e
    public final InputConnection p(InputConnection inputConnection, EditorInfo editorInfo) {
        return inputConnection instanceof d ? inputConnection : new d(this.f20644s, inputConnection, editorInfo);
    }

    @Override // d5.e
    public final void t(boolean z9) {
        j jVar = this.f20645t;
        if (jVar.f20667f != z9) {
            if (jVar.f20666d != null) {
                l lVarA = l.a();
                n3 n3Var = jVar.f20666d;
                lVarA.getClass();
                u.c(n3Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = lVarA.f605a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    lVarA.f606b.remove(n3Var);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            jVar.f20667f = z9;
            if (z9) {
                j.a(jVar.f20664a, l.a().b());
            }
        }
    }
}
