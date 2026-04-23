package d;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.k;
import d0.f;
import g4.a0;
import t3.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12286b;

    public /* synthetic */ b(int i10) {
        this.f12286b = i10;
    }

    @Override // t3.i
    public final Intent j(androidx.activity.i iVar, Object obj) {
        Bundle bundleExtra;
        switch (this.f12286b) {
            case 0:
                String str = (String) obj;
                a0.f(iVar, "context");
                a0.f(str, "input");
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                a0.e(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra;
            default:
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = intentSenderRequest.f179b;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        intentSenderRequest = new IntentSenderRequest(intentSenderRequest.f178a, null, intentSenderRequest.f180d, intentSenderRequest.f181f);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
                if (Log.isLoggable("FragmentManager", 2)) {
                    intent.toString();
                }
                return intent;
        }
    }

    @Override // t3.i
    public final k k(androidx.activity.i iVar, Object obj) {
        switch (this.f12286b) {
            case 0:
                String str = (String) obj;
                a0.f(iVar, "context");
                a0.f(str, "input");
                if (f.a(iVar, str) == 0) {
                    return new k(Boolean.TRUE);
                }
                return null;
            default:
                a0.f(iVar, "context");
                return null;
        }
    }

    @Override // t3.i
    public final Object v(int i10, Intent intent) {
        switch (this.f12286b) {
            case 0:
                if (intent == null || i10 != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z9 = false;
                if (intArrayExtra != null) {
                    int length = intArrayExtra.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length) {
                            if (intArrayExtra[i11] == 0) {
                                z9 = true;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z9);
            default:
                return new ActivityResult(i10, intent);
        }
    }
}
