package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzcw;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public interface q90 {
    void a(Bundle bundle);

    JSONObject b(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void c(dk dkVar);

    void d(com.google.android.gms.ads.internal.client.zzcs zzcsVar);

    void e(View view, View view2, Map map, Map map2, boolean z9, ImageView.ScaleType scaleType, int i10);

    void f(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    boolean g(Bundle bundle);

    void h(View view);

    void i(MotionEvent motionEvent, View view);

    void j(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener);

    void k(View view);

    void l(String str);

    void m(zzcw zzcwVar);

    JSONObject n(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void o(View view, View view2, Map map, Map map2, boolean z9, ImageView.ScaleType scaleType);

    void p(Bundle bundle);

    boolean zzA();

    boolean zzB();

    int zza();

    void zzg();

    void zzh();

    void zzi();

    void zzp();

    void zzr();

    void zzv();
}
