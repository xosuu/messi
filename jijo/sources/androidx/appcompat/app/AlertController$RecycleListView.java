package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import e.a;

/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f203b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f12614u);
        this.f203b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f202a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
