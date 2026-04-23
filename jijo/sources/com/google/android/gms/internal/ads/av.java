package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class av extends cv implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    public static final HashMap E;
    public int A;
    public bv B;
    public boolean C;
    public Integer D;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pv f2794d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qv f2795f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f2796h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2797q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2798s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public MediaPlayer f2799t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Uri f2800u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2801v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2802w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2803x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public nv f2804y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f2805z;

    static {
        HashMap map = new HashMap();
        E = map;
        map.put(-1004, "MEDIA_ERROR_IO");
        map.put(-1007, "MEDIA_ERROR_MALFORMED");
        map.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        map.put(-110, "MEDIA_ERROR_TIMED_OUT");
        map.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        map.put(100, "MEDIA_ERROR_SERVER_DIED");
        map.put(1, "MEDIA_ERROR_UNKNOWN");
        map.put(1, "MEDIA_INFO_UNKNOWN");
        map.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        map.put(701, "MEDIA_INFO_BUFFERING_START");
        map.put(702, "MEDIA_INFO_BUFFERING_END");
        map.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        map.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        map.put(802, "MEDIA_INFO_METADATA_UPDATE");
        map.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        map.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public av(Context context, pv pvVar, qv qvVar, boolean z9, boolean z10) {
        super(context);
        this.f2797q = 0;
        this.f2798s = 0;
        this.C = false;
        this.D = null;
        setSurfaceTextureListener(this);
        this.f2794d = pvVar;
        this.f2795f = qvVar;
        this.f2805z = z9;
        this.f2796h = z10;
        jg jgVar = qvVar.f8285d;
        lg lgVar = qvVar.f8286e;
        y3.c.i(lgVar, jgVar, "vpc2");
        qvVar.f8290i = true;
        lgVar.b("vpn", r());
        qvVar.f8295n = this;
    }

    public final void D() {
        SurfaceTexture surfaceTexture;
        zze.zza("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture2 = getSurfaceTexture();
        if (this.f2800u == null || surfaceTexture2 == null) {
            return;
        }
        E(false);
        try {
            zzu.zzk();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f2799t = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.f2799t.setOnCompletionListener(this);
            this.f2799t.setOnErrorListener(this);
            this.f2799t.setOnInfoListener(this);
            this.f2799t.setOnPreparedListener(this);
            this.f2799t.setOnVideoSizeChangedListener(this);
            this.f2803x = 0;
            if (this.f2805z) {
                nv nvVar = new nv(getContext());
                this.f2804y = nvVar;
                int width = getWidth();
                int height = getHeight();
                nvVar.f7405y = width;
                nvVar.f7404x = height;
                nvVar.A = surfaceTexture2;
                this.f2804y.start();
                nv nvVar2 = this.f2804y;
                if (nvVar2.A == null) {
                    surfaceTexture = null;
                } else {
                    try {
                        nvVar2.F.await();
                    } catch (InterruptedException unused) {
                    }
                    surfaceTexture = nvVar2.f7406z;
                }
                if (surfaceTexture != null) {
                    surfaceTexture2 = surfaceTexture;
                } else {
                    this.f2804y.c();
                    this.f2804y = null;
                }
            }
            this.f2799t.setDataSource(getContext(), this.f2800u);
            zzu.zzl();
            this.f2799t.setSurface(new Surface(surfaceTexture2));
            this.f2799t.setAudioStreamType(3);
            this.f2799t.setScreenOnWhilePlaying(true);
            this.f2799t.prepareAsync();
            F(1);
        } catch (IOException e10) {
            e = e10;
            zzm.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f2800u)), e);
            onError(this.f2799t, 1, 0);
        } catch (IllegalArgumentException e11) {
            e = e11;
            zzm.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f2800u)), e);
            onError(this.f2799t, 1, 0);
        } catch (IllegalStateException e12) {
            e = e12;
            zzm.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f2800u)), e);
            onError(this.f2799t, 1, 0);
        }
    }

    public final void E(boolean z9) {
        zze.zza("AdMediaPlayerView release");
        nv nvVar = this.f2804y;
        if (nvVar != null) {
            nvVar.c();
            this.f2804y = null;
        }
        MediaPlayer mediaPlayer = this.f2799t;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f2799t.release();
            this.f2799t = null;
            F(0);
            if (z9) {
                this.f2798s = 0;
            }
        }
    }

    public final void F(int i10) {
        sv svVar = this.f3455b;
        qv qvVar = this.f2795f;
        if (i10 == 3) {
            qvVar.f8294m = true;
            if (qvVar.f8291j && !qvVar.f8292k) {
                y3.c.i(qvVar.f8286e, qvVar.f8285d, "vfp2");
                qvVar.f8292k = true;
            }
            svVar.f8971d = true;
            svVar.a();
        } else if (this.f2797q == 3) {
            qvVar.f8294m = false;
            svVar.f8971d = false;
            svVar.a();
        }
        this.f2797q = i10;
    }

    public final boolean G() {
        int i10;
        return (this.f2799t == null || (i10 = this.f2797q) == -1 || i10 == 0 || i10 == 1) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final int j() {
        if (G()) {
            return this.f2799t.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final int k() {
        if (Build.VERSION.SDK_INT < 26 || !G()) {
            return -1;
        }
        return this.f2799t.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final int l() {
        if (G()) {
            return this.f2799t.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final int m() {
        MediaPlayer mediaPlayer = this.f2799t;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final int n() {
        MediaPlayer mediaPlayer = this.f2799t;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final long o() {
        return 0L;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
        this.f2803x = i10;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        zze.zza("AdMediaPlayerView completion");
        F(5);
        this.f2798s = 5;
        zzt.zza.post(new zu(this, 0));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        HashMap map = E;
        String str = (String) map.get(Integer.valueOf(i10));
        String str2 = (String) map.get(Integer.valueOf(i11));
        zzm.zzj("AdMediaPlayerView MediaPlayer error: " + str + ":" + str2);
        F(-1);
        this.f2798s = -1;
        zzt.zza.post(new l0.a(this, str, str2, 14));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
        HashMap map = E;
        zze.zza("AdMediaPlayerView MediaPlayer info: " + ((String) map.get(Integer.valueOf(i10))) + ":" + ((String) map.get(Integer.valueOf(i11))));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f2801v
            int r0 = android.view.View.getDefaultSize(r0, r6)
            int r1 = r5.f2802w
            int r1 = android.view.View.getDefaultSize(r1, r7)
            int r2 = r5.f2801v
            if (r2 <= 0) goto L7e
            int r2 = r5.f2802w
            if (r2 <= 0) goto L7e
            com.google.android.gms.internal.ads.nv r2 = r5.f2804y
            if (r2 != 0) goto L7e
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L44
            if (r1 != r2) goto L42
            int r0 = r5.f2801v
            int r1 = r0 * r7
            int r2 = r5.f2802w
            int r3 = r6 * r2
            if (r1 >= r3) goto L3c
            int r0 = r1 / r2
        L3a:
            r1 = r7
            goto L7e
        L3c:
            if (r1 <= r3) goto L63
            int r1 = r3 / r0
        L40:
            r0 = r6
            goto L7e
        L42:
            r0 = 1073741824(0x40000000, float:2.0)
        L44:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L56
            int r0 = r5.f2802w
            int r0 = r0 * r6
            int r2 = r5.f2801v
            int r0 = r0 / r2
            if (r1 != r3) goto L54
            if (r0 <= r7) goto L54
            goto L63
        L54:
            r1 = r0
            goto L40
        L56:
            if (r1 != r2) goto L67
            int r1 = r5.f2801v
            int r1 = r1 * r7
            int r2 = r5.f2802w
            int r1 = r1 / r2
            if (r0 != r3) goto L65
            if (r1 <= r6) goto L65
        L63:
            r0 = r6
            goto L3a
        L65:
            r0 = r1
            goto L3a
        L67:
            int r2 = r5.f2801v
            int r4 = r5.f2802w
            if (r1 != r3) goto L73
            if (r4 <= r7) goto L73
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L75
        L73:
            r1 = r2
            r7 = r4
        L75:
            if (r0 != r3) goto L65
            if (r1 <= r6) goto L65
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L40
        L7e:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.nv r6 = r5.f2804y
            if (r6 == 0) goto L88
            r6.b(r0, r1)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.av.onMeasure(int, int):void");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        zze.zza("AdMediaPlayerView prepared");
        F(2);
        qv qvVar = this.f2795f;
        if (qvVar.f8290i && !qvVar.f8291j) {
            y3.c.i(qvVar.f8286e, qvVar.f8285d, "vfr2");
            qvVar.f8291j = true;
        }
        zzt.zza.post(new vm(this, mediaPlayer, 14));
        this.f2801v = mediaPlayer.getVideoWidth();
        this.f2802w = mediaPlayer.getVideoHeight();
        int i10 = this.A;
        if (i10 != 0) {
            u(i10);
        }
        if (this.f2796h && G() && this.f2799t.getCurrentPosition() > 0 && this.f2798s != 3) {
            zze.zza("AdMediaPlayerView nudging MediaPlayer");
            MediaPlayer mediaPlayer2 = this.f2799t;
            if (mediaPlayer2 != null) {
                try {
                    mediaPlayer2.setVolume(0.0f, 0.0f);
                } catch (IllegalStateException unused) {
                }
            } else {
                zzm.zzj("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
            }
            this.f2799t.start();
            int currentPosition = this.f2799t.getCurrentPosition();
            ((y3.b) zzu.zzB()).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            while (G() && this.f2799t.getCurrentPosition() == currentPosition) {
                ((y3.b) zzu.zzB()).getClass();
                if (System.currentTimeMillis() - jCurrentTimeMillis > 250) {
                    break;
                }
            }
            this.f2799t.pause();
            zzn();
        }
        zzm.zzi("AdMediaPlayerView stream dimensions: " + this.f2801v + " x " + this.f2802w);
        if (this.f2798s == 3) {
            t();
        }
        zzn();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        zze.zza("AdMediaPlayerView surface created");
        D();
        zzt.zza.post(new zu(this, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zze.zza("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f2799t;
        if (mediaPlayer != null && this.A == 0) {
            this.A = mediaPlayer.getCurrentPosition();
        }
        nv nvVar = this.f2804y;
        if (nvVar != null) {
            nvVar.c();
        }
        zzt.zza.post(new zu(this, 2));
        E(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        zze.zza("AdMediaPlayerView surface changed");
        int i12 = this.f2798s;
        boolean z9 = false;
        int i13 = 1;
        if (this.f2801v == i10 && this.f2802w == i11) {
            z9 = true;
        }
        if (this.f2799t != null && i12 == 3 && z9) {
            int i14 = this.A;
            if (i14 != 0) {
                u(i14);
            }
            t();
        }
        nv nvVar = this.f2804y;
        if (nvVar != null) {
            nvVar.b(i10, i11);
        }
        zzt.zza.post(new b3.m(this, i10, i11, i13));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f2795f.b(this);
        this.f3454a.a(surfaceTexture, this.B);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        zze.zza("AdMediaPlayerView size changed: " + i10 + " x " + i11);
        this.f2801v = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f2802w = videoHeight;
        if (this.f2801v == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        zze.zza("AdMediaPlayerView window visibility changed to " + i10);
        zzt.zza.post(new k2.e(i10, 3, this));
        super.onWindowVisibilityChanged(i10);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final long p() {
        if (this.D != null) {
            return (q() * ((long) this.f2803x)) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final long q() {
        if (this.D != null) {
            return ((long) l()) * ((long) this.D.intValue());
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final String r() {
        return "MediaPlayer".concat(true != this.f2805z ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void s() {
        zze.zza("AdMediaPlayerView pause");
        int i10 = 4;
        if (G() && this.f2799t.isPlaying()) {
            this.f2799t.pause();
            F(4);
            zzt.zza.post(new zu(this, i10));
        }
        this.f2798s = 4;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void t() {
        zze.zza("AdMediaPlayerView play");
        int i10 = 3;
        if (G()) {
            this.f2799t.start();
            F(3);
            this.f3454a.f6395c = true;
            zzt.zza.post(new zu(this, i10));
        }
        this.f2798s = 3;
    }

    @Override // android.view.View
    public final String toString() {
        return fb1.x(av.class.getName(), "@", Integer.toHexString(hashCode()));
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void u(int i10) {
        zze.zza("AdMediaPlayerView seek " + i10);
        if (!G()) {
            this.A = i10;
        } else {
            this.f2799t.seekTo(i10);
            this.A = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void v(bv bvVar) {
        this.B = bvVar;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void w(String str) {
        Uri uri = Uri.parse(str);
        zzbah zzbahVarB = zzbah.b(uri);
        if (zzbahVarB == null || zzbahVarB.f11466a != null) {
            if (zzbahVarB != null) {
                uri = Uri.parse(zzbahVarB.f11466a);
            }
            this.f2800u = uri;
            this.A = 0;
            D();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void x() {
        zze.zza("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f2799t;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f2799t.release();
            this.f2799t = null;
            F(0);
            this.f2798s = 0;
        }
        this.f2795f.a();
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void y(float f10, float f11) {
        nv nvVar = this.f2804y;
        if (nvVar != null) {
            nvVar.d(f10, f11);
        }
    }

    @Override // com.google.android.gms.internal.ads.rv
    public final void zzn() {
        sv svVar = this.f3455b;
        float f10 = svVar.f8970c ? svVar.f8972e ? 0.0f : svVar.f8973f : 0.0f;
        MediaPlayer mediaPlayer = this.f2799t;
        if (mediaPlayer == null) {
            zzm.zzj("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f10, f10);
            } catch (IllegalStateException unused) {
            }
        }
    }
}
