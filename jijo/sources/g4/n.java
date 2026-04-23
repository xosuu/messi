package g4;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f13759b;

    public /* synthetic */ n(r rVar, int i10) {
        this.f13758a = i10;
        this.f13759b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strConcat;
        int i10 = this.f13758a;
        r rVar = this.f13759b;
        switch (i10) {
            case 0:
                rVar.getClass();
                rVar.f13782d.execute(new n(rVar, 1));
                break;
            default:
                g gVar = rVar.f13786h;
                JSONObject jSONObject = new JSONObject();
                Application application = rVar.f13779a;
                try {
                    jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
                    Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
                    if (applicationIcon == null) {
                        strConcat = null;
                    } else {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                        applicationIcon.draw(canvas);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        strConcat = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
                    }
                    jSONObject.put("app_icon", strConcat);
                    JSONObject jSONObject2 = new JSONObject();
                    for (String str : gVar.a().keySet()) {
                        jSONObject2.put(str, gVar.a().get(str));
                    }
                    jSONObject.put("stored_infos_map", jSONObject2);
                    break;
                } catch (JSONException unused) {
                }
                rVar.f13785g.f13741g.a("UMP_configureFormWithAppAssets", jSONObject.toString());
                break;
        }
    }
}
