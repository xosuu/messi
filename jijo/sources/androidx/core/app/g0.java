package androidx.core.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.io.FileNotFoundException;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NotificationCompat.Builder f480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f483d = false;

    public void a(Bundle bundle) {
        if (this.f483d) {
            bundle.putCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT, this.f482c);
        }
        CharSequence charSequence = this.f481b;
        if (charSequence != null) {
            bundle.putCharSequence(NotificationCompat.EXTRA_TITLE_BIG, charSequence);
        }
        String strF = f();
        if (strF != null) {
            bundle.putString(NotificationCompat.EXTRA_COMPAT_TEMPLATE, strF);
        }
    }

    public abstract void b(m mVar);

    public void c(Bundle bundle) {
        bundle.remove(NotificationCompat.EXTRA_SUMMARY_TEXT);
        bundle.remove(NotificationCompat.EXTRA_TITLE_BIG);
        bundle.remove(NotificationCompat.EXTRA_COMPAT_TEMPLATE);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap d(androidx.core.graphics.drawable.IconCompat r11, int r12, int r13) throws java.io.FileNotFoundException {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.g0.d(androidx.core.graphics.drawable.IconCompat, int, int):android.graphics.Bitmap");
    }

    public final Bitmap e(int i10, int i11, int i12, int i13) throws FileNotFoundException {
        if (i13 == 0) {
            i13 = 0;
        }
        Context context = this.f480a.mContext;
        PorterDuff.Mode mode = IconCompat.f543k;
        context.getClass();
        Bitmap bitmapD = d(IconCompat.b(context.getResources(), context.getPackageName(), R.drawable.i_), i13, i11);
        Canvas canvas = new Canvas(bitmapD);
        Drawable drawableMutate = this.f480a.mContext.getResources().getDrawable(i10).mutate();
        drawableMutate.setFilterBitmap(true);
        int i14 = (i11 - i12) / 2;
        int i15 = i12 + i14;
        drawableMutate.setBounds(i14, i14, i15, i15);
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        drawableMutate.draw(canvas);
        return bitmapD;
    }

    public abstract String f();

    public RemoteViews g() {
        return null;
    }

    public RemoteViews h() {
        return null;
    }

    public RemoteViews i() {
        return null;
    }

    public void j(Bundle bundle) {
        if (bundle.containsKey(NotificationCompat.EXTRA_SUMMARY_TEXT)) {
            this.f482c = bundle.getCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT);
            this.f483d = true;
        }
        this.f481b = bundle.getCharSequence(NotificationCompat.EXTRA_TITLE_BIG);
    }
}
