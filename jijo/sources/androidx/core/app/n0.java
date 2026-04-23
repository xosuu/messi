package androidx.core.app;

import android.app.RemoteInput;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {
    public static int a(Object obj) {
        return ((RemoteInput) obj).getEditChoicesBeforeSending();
    }

    public static RemoteInput.Builder b(RemoteInput.Builder builder, int i10) {
        return builder.setEditChoicesBeforeSending(i10);
    }
}
