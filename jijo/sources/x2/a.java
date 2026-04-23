package x2;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.balsikandar.crashreporter.ui.LogMessageActivity;

/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f18375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f18376b;

    public a(Context context, String str) {
        this.f18375a = context;
        this.f18376b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context = this.f18375a;
        Intent intent = new Intent(context, (Class<?>) LogMessageActivity.class);
        intent.putExtra("LogMessage", this.f18376b);
        context.startActivity(intent);
    }
}
