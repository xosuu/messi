package f0;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f13028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Configuration f13029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13030c;

    public l(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f13028a = colorStateList;
        this.f13029b = configuration;
        this.f13030c = theme == null ? 0 : theme.hashCode();
    }
}
