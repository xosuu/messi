package o0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class f implements e, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16020a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16021b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16022d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16023f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Comparable f16024h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f16025q;

    public f(f fVar) {
        ClipData clipData = (ClipData) fVar.f16021b;
        clipData.getClass();
        this.f16021b = clipData;
        int i10 = fVar.f16022d;
        if (i10 < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 5));
        }
        if (i10 > 5) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 5));
        }
        this.f16022d = i10;
        int i11 = fVar.f16023f;
        if ((i11 & 1) == i11) {
            this.f16023f = i11;
            this.f16024h = (Uri) fVar.f16024h;
            this.f16025q = (Bundle) fVar.f16025q;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i11) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }

    @Override // o0.e
    public final h a() {
        return new h(new f(this));
    }

    @Override // o0.e
    public final void b(Bundle bundle) {
        this.f16025q = bundle;
    }

    @Override // o0.e
    public final void c(Uri uri) {
        this.f16024h = uri;
    }

    @Override // o0.g
    public final ClipData d() {
        return (ClipData) this.f16021b;
    }

    @Override // o0.e
    public final void e(int i10) {
        this.f16023f = i10;
    }

    @Override // o0.g
    public final int l() {
        return this.f16023f;
    }

    @Override // o0.g
    public final ContentInfo o() {
        return null;
    }

    @Override // o0.g
    public final int p() {
        return this.f16022d;
    }

    public final String toString() {
        String str;
        switch (this.f16020a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f16021b).getDescription());
                sb.append(", source=");
                int i10 = this.f16022d;
                sb.append(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i11 = this.f16023f;
                sb.append((i11 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i11));
                Uri uri = (Uri) this.f16024h;
                String str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                if (uri == null) {
                    str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                } else {
                    str = ", hasLinkUri(" + ((Uri) this.f16024h).toString().length() + ")";
                }
                sb.append(str);
                if (((Bundle) this.f16025q) != null) {
                    str2 = ", hasExtras";
                }
                return g1.a.r(sb, str2, "}");
            default:
                return super.toString();
        }
    }

    public f(ClipData clipData, int i10) {
        this.f16021b = clipData;
        this.f16022d = i10;
    }
}
