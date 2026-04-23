package b;

import android.app.Activity;
import android.app.Notification;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import android.view.View;
import androidx.activity.f;
import androidx.emoji2.text.j;
import androidx.fragment.app.k;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import f2.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1207b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1208d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f1209f;

    public /* synthetic */ d(Object obj, int i10, Object obj2, int i11) {
        this.f1206a = i11;
        this.f1209f = obj;
        this.f1207b = i10;
        this.f1208d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        androidx.activity.result.a aVar;
        int i10 = this.f1206a;
        int i11 = 0;
        Object obj = this.f1209f;
        int i12 = this.f1207b;
        Object obj2 = this.f1208d;
        switch (i10) {
            case 0:
                ((ResultReceiver) obj).b(i12, (Bundle) obj2);
                break;
            case 1:
                f fVar = (f) obj;
                Object obj3 = ((k) obj2).f808a;
                String str = (String) fVar.f191b.get(Integer.valueOf(i12));
                if (str != null) {
                    androidx.activity.result.d dVar = (androidx.activity.result.d) fVar.f195f.get(str);
                    if (dVar == null || (aVar = dVar.f186a) == null) {
                        fVar.f197h.remove(str);
                        fVar.f196g.put(str, obj3);
                    } else if (fVar.f194e.remove(str)) {
                        aVar.b(obj3);
                    }
                    break;
                }
                break;
            case 2:
                ((f) obj).a(i12, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj2));
                break;
            case 3:
                ((p.d) obj).f16168b.d(i12, (Bundle) obj2);
                break;
            case 4:
                String[] strArr = (String[]) obj2;
                int[] iArr = new int[strArr.length];
                Activity activity = (Activity) obj;
                PackageManager packageManager = activity.getPackageManager();
                String packageName = activity.getPackageName();
                int length = strArr.length;
                while (i11 < length) {
                    iArr[i11] = packageManager.checkPermission(strArr[i11], packageName);
                    i11++;
                }
                ((androidx.core.app.c) activity).onRequestPermissionsResult(i12, strArr, iArr);
                break;
            case 5:
                q7.b bVar = (q7.b) ((m2.f) obj2).f15701b;
                if (bVar != null) {
                    bVar.m(i12);
                }
                break;
            case 6:
                List list = (List) obj2;
                int size = list.size();
                if (i12 == 1) {
                    while (i11 < size) {
                        ((j) list.get(i11)).b();
                        i11++;
                    }
                } else {
                    while (i11 < size) {
                        ((j) list.get(i11)).a();
                        i11++;
                    }
                }
                break;
            case 7:
                ((h) obj2).b(i12, (Intent) obj);
                break;
            case 8:
                ((SystemForegroundService) obj).f1196h.notify(i12, (Notification) obj2);
                break;
            default:
                ((BottomSheetBehavior) obj).D(i12, (View) obj2, false);
                break;
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, int i10, int i11) {
        this.f1206a = i11;
        this.f1208d = obj;
        this.f1209f = obj2;
        this.f1207b = i10;
    }

    public /* synthetic */ d(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f1206a = i11;
        this.f1209f = obj;
        this.f1208d = obj2;
        this.f1207b = i10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(j jVar, int i10) {
        this.f1206a = 6;
        j[] jVarArr = new j[1];
        if (jVar != null) {
            jVarArr[0] = jVar;
            this(Arrays.asList(jVarArr), i10, null);
            return;
        }
        throw new NullPointerException("initCallback cannot be null");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(int i10, ArrayList arrayList) {
        this(arrayList, i10, null);
        this.f1206a = 6;
    }

    public d(List list, int i10, Throwable th) {
        this.f1206a = 6;
        if (list != null) {
            this.f1208d = new ArrayList(list);
            this.f1207b = i10;
            this.f1209f = th;
            return;
        }
        throw new NullPointerException("initCallbacks cannot be null");
    }
}
