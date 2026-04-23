package l3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.provider.Settings;
import android.widget.Toast;
import b7.u;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.zzd;
import com.google.android.gms.internal.ads.tc1;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.sockets.SSHTunnelService;
import team.dev.epro.apkcustom.widgets.j;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class h extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15187a;

    public /* synthetic */ h(int i10) {
        this.f15187a = i10;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f15187a) {
            case 0:
                zzl.zzi();
                zzd.zza(context);
                break;
            case 1:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra == 0) {
                        tc1.Q = 1;
                    } else if (intExtra == 1) {
                        tc1.Q = 2;
                    }
                }
                break;
            default:
                if (intent.getAction().equals("android.intent.action.TIME_TICK") && !App.f17101x.i0().isEmpty()) {
                    j jVar = App.f17101x;
                    if (!jVar.l0(jVar.i0())[4].equals("lifeTime")) {
                        try {
                            if (Settings.Global.getInt(App.f17099v.getContentResolver(), "auto_time") == 0 || Settings.Global.getInt(App.f17099v.getContentResolver(), "auto_time_zone") == 0) {
                                App.f17100w.f17415a.edit().putString(new String(App.f17101x.z(0)), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).apply();
                                App.f17101x.o0();
                                try {
                                    App app = App.f17099v;
                                    Toast.makeText(app, app.getString(R.string.ha), 1).show();
                                    break;
                                } catch (Exception unused) {
                                }
                                Intent intent2 = new Intent("android.settings.DATE_SETTINGS");
                                intent2.addFlags(276856832);
                                App.f17099v.startActivity(intent2);
                                Process.killProcess(Process.myPid());
                            }
                            break;
                        } catch (Exception unused2) {
                        }
                        try {
                            Locale locale = Locale.US;
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", locale);
                            String str = simpleDateFormat.format(new Date());
                            ParsePosition parsePosition = new ParsePosition(0);
                            j jVar2 = App.f17101x;
                            Date date = simpleDateFormat.parse(jVar2.l0(jVar2.i0())[4], parsePosition);
                            if (date == null) {
                                simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", locale);
                                j jVar3 = App.f17101x;
                                date = simpleDateFormat.parse(jVar3.l0(jVar3.i0())[4]);
                            }
                            if (date == null || date.compareTo(simpleDateFormat.parse(str)) < 0) {
                                App.f17101x.o0();
                                u.h("TAG", "[" + new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date()) + "] <font color=" + team.dev.epro.apkcustom.widgets.a.f17390c + ">" + App.f17099v.getString(R.string.h5));
                                if (App.f17101x.Y(App.f17099v, SSHTunnelService.class)) {
                                    Intent intent3 = new Intent(App.f17099v, (Class<?>) SSHTunnelService.class);
                                    intent3.setAction("stop");
                                    b4.f.Q(context, intent3);
                                }
                                b4.f.T(App.f17099v);
                            }
                        } catch (Exception unused3) {
                            return;
                        }
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ h() {
        this.f15187a = 0;
    }
}
