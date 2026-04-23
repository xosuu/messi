package team.dev.epro.apkcustom.widgets;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import androidx.fragment.app.w;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class h extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f17419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f17420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ URLSpan f17421c;

    static {
        NativeUtil.classesInit0(199);
    }

    public h(boolean z9, w wVar, URLSpan uRLSpan) {
        this.f17419a = z9;
        this.f17420b = wVar;
        this.f17421c = uRLSpan;
    }

    @Override // android.text.style.ClickableSpan
    public final native void onClick(View view);
}
