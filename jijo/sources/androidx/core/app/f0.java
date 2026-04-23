package androidx.core.app;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends g0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f468e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f469f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l0 f470g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f471h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f472i;

    @Override // androidx.core.app.g0
    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putCharSequence(NotificationCompat.EXTRA_SELF_DISPLAY_NAME, this.f470g.f497a);
        bundle.putBundle(NotificationCompat.EXTRA_MESSAGING_STYLE_USER, this.f470g.b());
        bundle.putCharSequence(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE, this.f471h);
        if (this.f471h != null && this.f472i.booleanValue()) {
            bundle.putCharSequence(NotificationCompat.EXTRA_CONVERSATION_TITLE, this.f471h);
        }
        ArrayList arrayList = this.f468e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray(NotificationCompat.EXTRA_MESSAGES, e0.a(arrayList));
        }
        ArrayList arrayList2 = this.f469f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray(NotificationCompat.EXTRA_HISTORIC_MESSAGES, e0.a(arrayList2));
        }
        Boolean bool = this.f472i;
        if (bool != null) {
            bundle.putBoolean(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION, bool.booleanValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    @Override // androidx.core.app.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.core.app.m r10) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.f0.b(androidx.core.app.m):void");
    }

    @Override // androidx.core.app.g0
    public final void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove(NotificationCompat.EXTRA_MESSAGING_STYLE_USER);
        bundle.remove(NotificationCompat.EXTRA_SELF_DISPLAY_NAME);
        bundle.remove(NotificationCompat.EXTRA_CONVERSATION_TITLE);
        bundle.remove(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE);
        bundle.remove(NotificationCompat.EXTRA_MESSAGES);
        bundle.remove(NotificationCompat.EXTRA_HISTORIC_MESSAGES);
        bundle.remove(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION);
    }

    @Override // androidx.core.app.g0
    public final String f() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    @Override // androidx.core.app.g0
    public final void j(Bundle bundle) {
        super.j(bundle);
        ArrayList arrayList = this.f468e;
        arrayList.clear();
        if (bundle.containsKey(NotificationCompat.EXTRA_MESSAGING_STYLE_USER)) {
            this.f470g = l0.a(bundle.getBundle(NotificationCompat.EXTRA_MESSAGING_STYLE_USER));
        } else {
            String string = bundle.getString(NotificationCompat.EXTRA_SELF_DISPLAY_NAME);
            l0 l0Var = new l0();
            l0Var.f497a = string;
            l0Var.f498b = null;
            l0Var.f499c = null;
            l0Var.f500d = null;
            l0Var.f501e = false;
            l0Var.f502f = false;
            this.f470g = l0Var;
        }
        CharSequence charSequence = bundle.getCharSequence(NotificationCompat.EXTRA_CONVERSATION_TITLE);
        this.f471h = charSequence;
        if (charSequence == null) {
            this.f471h = bundle.getCharSequence(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE);
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray(NotificationCompat.EXTRA_MESSAGES);
        if (parcelableArray != null) {
            arrayList.addAll(e0.b(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray(NotificationCompat.EXTRA_HISTORIC_MESSAGES);
        if (parcelableArray2 != null) {
            this.f469f.addAll(e0.b(parcelableArray2));
        }
        if (bundle.containsKey(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION)) {
            this.f472i = Boolean.valueOf(bundle.getBoolean(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION));
        }
    }

    public final SpannableStringBuilder k(e0 e0Var) {
        m0.b bVarC = m0.b.c();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        l0 l0Var = e0Var.f458c;
        CharSequence charSequence = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        CharSequence charSequence2 = l0Var == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : l0Var.f497a;
        int color = -16777216;
        if (TextUtils.isEmpty(charSequence2)) {
            charSequence2 = this.f470g.f497a;
            if (this.f480a.getColor() != 0) {
                color = this.f480a.getColor();
            }
        }
        SpannableStringBuilder spannableStringBuilderD = bVarC.d(charSequence2, bVarC.f15383c);
        spannableStringBuilder.append((CharSequence) spannableStringBuilderD);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(color), null), spannableStringBuilder.length() - spannableStringBuilderD.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence3 = e0Var.f456a;
        if (charSequence3 != null) {
            charSequence = charSequence3;
        }
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) bVarC.d(charSequence, bVarC.f15383c));
        return spannableStringBuilder;
    }
}
