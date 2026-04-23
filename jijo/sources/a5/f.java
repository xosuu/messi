package a5;

import android.app.Notification;
import android.app.Person;
import android.os.Parcelable;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextPaint;
import android.webkit.TracingConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static /* bridge */ /* synthetic */ boolean B(Spannable spannable) {
        return spannable instanceof PrecomputedText;
    }

    public static /* synthetic */ Notification.MessagingStyle.Message f(CharSequence charSequence, long j10, Person person) {
        return new Notification.MessagingStyle.Message(charSequence, j10, person);
    }

    public static /* synthetic */ Notification.MessagingStyle g(Person person) {
        return new Notification.MessagingStyle(person);
    }

    public static /* bridge */ /* synthetic */ Person h(Parcelable parcelable) {
        return (Person) parcelable;
    }

    public static /* bridge */ /* synthetic */ Person i(Object obj) {
        return (Person) obj;
    }

    public static /* synthetic */ PrecomputedText.Params.Builder n(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* synthetic */ void s() {
        new TracingConfig.Builder();
    }
}
