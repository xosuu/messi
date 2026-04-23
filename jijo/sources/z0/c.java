package z0;

import android.text.Editable;
import androidx.emoji2.text.y;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f20649a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile c f20650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f20651c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f20651c;
        return cls != null ? new y(cls, charSequence) : super.newEditable(charSequence);
    }
}
