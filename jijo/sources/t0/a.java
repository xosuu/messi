package t0;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import androidx.emoji2.text.t;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16804b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Handler handler, int i10) {
        super(handler);
        this.f16803a = i10;
        this.f16804b = obj;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        switch (this.f16803a) {
            case 0:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z9) {
        Cursor cursor;
        int i10 = this.f16803a;
        Object obj = this.f16804b;
        switch (i10) {
            case 0:
                b bVar = (b) obj;
                if (bVar.f16806b && (cursor = bVar.f16807d) != null && !cursor.isClosed()) {
                    bVar.f16805a = bVar.f16807d.requery();
                    break;
                }
                break;
            case 1:
            default:
                super.onChange(z9);
                break;
            case 2:
                a3.a aVar = (a3.a) obj;
                aVar.f14d = Settings.System.getInt(aVar.f11a.getContentResolver(), "haptic_feedback_enabled", 0) == 1;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(new Handler());
        this.f16803a = 0;
        this.f16804b = bVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z9, Uri uri) {
        switch (this.f16803a) {
            case 1:
                ((t) this.f16804b).c();
                break;
            default:
                super.onChange(z9, uri);
                break;
        }
    }
}
