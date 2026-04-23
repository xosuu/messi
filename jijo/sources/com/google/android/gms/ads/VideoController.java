package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzfj;
import com.google.android.gms.ads.internal.util.client.zzm;

/* JADX INFO: loaded from: classes.dex */
public final class VideoController {
    public static final int PLAYBACK_STATE_ENDED = 3;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    public static final int PLAYBACK_STATE_READY = 5;
    public static final int PLAYBACK_STATE_UNKNOWN = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1907a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzdq f1908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public VideoLifecycleCallbacks f1909c;

    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z9) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    public int getPlaybackState() {
        synchronized (this.f1907a) {
            zzdq zzdqVar = this.f1908b;
            if (zzdqVar == null) {
                return 0;
            }
            try {
                return zzdqVar.zzh();
            } catch (RemoteException e10) {
                zzm.zzh("Unable to call getPlaybackState on video controller.", e10);
                return 0;
            }
        }
    }

    public VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.f1907a) {
            videoLifecycleCallbacks = this.f1909c;
        }
        return videoLifecycleCallbacks;
    }

    public boolean hasVideoContent() {
        boolean z9;
        synchronized (this.f1907a) {
            z9 = this.f1908b != null;
        }
        return z9;
    }

    public boolean isClickToExpandEnabled() {
        synchronized (this.f1907a) {
            zzdq zzdqVar = this.f1908b;
            if (zzdqVar == null) {
                return false;
            }
            try {
                return zzdqVar.zzo();
            } catch (RemoteException e10) {
                zzm.zzh("Unable to call isClickToExpandEnabled.", e10);
                return false;
            }
        }
    }

    public boolean isCustomControlsEnabled() {
        synchronized (this.f1907a) {
            zzdq zzdqVar = this.f1908b;
            if (zzdqVar == null) {
                return false;
            }
            try {
                return zzdqVar.zzp();
            } catch (RemoteException e10) {
                zzm.zzh("Unable to call isUsingCustomPlayerControls.", e10);
                return false;
            }
        }
    }

    public boolean isMuted() {
        synchronized (this.f1907a) {
            zzdq zzdqVar = this.f1908b;
            if (zzdqVar == null) {
                return true;
            }
            try {
                return zzdqVar.zzq();
            } catch (RemoteException e10) {
                zzm.zzh("Unable to call isMuted on video controller.", e10);
                return true;
            }
        }
    }

    public void mute(boolean z9) {
        synchronized (this.f1907a) {
            zzdq zzdqVar = this.f1908b;
            if (zzdqVar == null) {
                return;
            }
            try {
                zzdqVar.zzj(z9);
            } catch (RemoteException e10) {
                zzm.zzh("Unable to call mute on video controller.", e10);
            }
        }
    }

    public void pause() {
        synchronized (this.f1907a) {
            zzdq zzdqVar = this.f1908b;
            if (zzdqVar == null) {
                return;
            }
            try {
                zzdqVar.zzk();
            } catch (RemoteException e10) {
                zzm.zzh("Unable to call pause on video controller.", e10);
            }
        }
    }

    public void play() {
        synchronized (this.f1907a) {
            zzdq zzdqVar = this.f1908b;
            if (zzdqVar == null) {
                return;
            }
            try {
                zzdqVar.zzl();
            } catch (RemoteException e10) {
                zzm.zzh("Unable to call play on video controller.", e10);
            }
        }
    }

    public void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        zzfj zzfjVar;
        synchronized (this.f1907a) {
            this.f1909c = videoLifecycleCallbacks;
            zzdq zzdqVar = this.f1908b;
            if (zzdqVar == null) {
                return;
            }
            if (videoLifecycleCallbacks == null) {
                zzfjVar = null;
            } else {
                try {
                    zzfjVar = new zzfj(videoLifecycleCallbacks);
                } catch (RemoteException e10) {
                    zzm.zzh("Unable to call setVideoLifecycleCallbacks on video controller.", e10);
                }
            }
            zzdqVar.zzm(zzfjVar);
        }
    }

    public void stop() {
        synchronized (this.f1907a) {
            zzdq zzdqVar = this.f1908b;
            if (zzdqVar == null) {
                return;
            }
            try {
                zzdqVar.zzn();
            } catch (RemoteException e10) {
                zzm.zzh("Unable to call stop on video controller.", e10);
            }
        }
    }

    public final zzdq zza() {
        zzdq zzdqVar;
        synchronized (this.f1907a) {
            zzdqVar = this.f1908b;
        }
        return zzdqVar;
    }

    public final void zzb(zzdq zzdqVar) {
        synchronized (this.f1907a) {
            try {
                this.f1908b = zzdqVar;
                VideoLifecycleCallbacks videoLifecycleCallbacks = this.f1909c;
                if (videoLifecycleCallbacks != null) {
                    setVideoLifecycleCallbacks(videoLifecycleCallbacks);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
