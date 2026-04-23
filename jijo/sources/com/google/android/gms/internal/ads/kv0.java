package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kv0 extends rt0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6396h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AssetFileDescriptor f6397q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f6398s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f6399t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f6400u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f6401v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public FileInputStream f6402w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv0(Context context, int i10) {
        super(false);
        this.f6396h = i10;
        if (i10 != 1) {
            this.f6400u = context.getContentResolver();
        } else {
            super(false);
            this.f6400u = context.getApplicationContext();
        }
    }

    @Override // com.google.android.gms.internal.ads.nl1
    public final int b(int i10, byte[] bArr, int i11) throws zzgr, zzfo {
        switch (this.f6396h) {
            case 0:
                if (i11 == 0) {
                    return 0;
                }
                long j10 = this.f6398s;
                if (j10 == 0) {
                    return -1;
                }
                if (j10 != -1) {
                    try {
                        i11 = (int) Math.min(j10, i11);
                    } catch (IOException e10) {
                        throw new zzfo(2000, e10);
                    }
                }
                FileInputStream fileInputStream = this.f6402w;
                int i12 = yn0.f10944a;
                int i13 = fileInputStream.read(bArr, i10, i11);
                if (i13 == -1) {
                    return -1;
                }
                long j11 = this.f6398s;
                if (j11 != -1) {
                    this.f6398s = j11 - ((long) i13);
                }
                c(i13);
                return i13;
            default:
                if (i11 == 0) {
                    return 0;
                }
                long j12 = this.f6398s;
                if (j12 == 0) {
                    return -1;
                }
                if (j12 != -1) {
                    try {
                        i11 = (int) Math.min(j12, i11);
                    } catch (IOException e11) {
                        throw new zzgr(2000, null, e11);
                    }
                }
                FileInputStream fileInputStream2 = this.f6402w;
                int i14 = yn0.f10944a;
                int i15 = fileInputStream2.read(bArr, i10, i11);
                if (i15 == -1) {
                    if (this.f6398s == -1) {
                        return -1;
                    }
                    throw new zzgr(2000, "End of stream reached having not read sufficient data.", new EOFException());
                }
                long j13 = this.f6398s;
                if (j13 != -1) {
                    this.f6398s = j13 - ((long) i15);
                }
                c(i15);
                return i15;
        }
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final long g(iz0 iz0Var) throws zzgr, zzfo {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        long jPosition;
        Resources resourcesForApplication;
        Resources resources;
        int identifier;
        long size;
        int i10 = this.f6396h;
        Object obj = this.f6400u;
        switch (i10) {
            case 0:
                try {
                    try {
                        Uri uriNormalizeScheme = iz0Var.f5730a.normalizeScheme();
                        this.f6401v = uriNormalizeScheme;
                        j(iz0Var);
                        if ("content".equals(uriNormalizeScheme.getScheme())) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                            assetFileDescriptorOpenAssetFileDescriptor = ((ContentResolver) obj).openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                        } else {
                            assetFileDescriptorOpenAssetFileDescriptor = ((ContentResolver) obj).openAssetFileDescriptor(uriNormalizeScheme, "r");
                        }
                        this.f6397q = assetFileDescriptorOpenAssetFileDescriptor;
                        if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                            try {
                                throw new zzfo(2000, new IOException("Could not open file descriptor for: ".concat(String.valueOf(uriNormalizeScheme))));
                            } catch (IOException e10) {
                                e = e10;
                                throw new zzfo(true != (e instanceof FileNotFoundException) ? 2000 : 2005, e);
                            }
                        }
                        long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                        FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                        this.f6402w = fileInputStream;
                        long j10 = iz0Var.f5732c;
                        if (length != -1 && j10 > length) {
                            throw new zzfo(2008, null);
                        }
                        long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                        long jSkip = fileInputStream.skip(startOffset + j10) - startOffset;
                        if (jSkip != j10) {
                            throw new zzfo(2008, null);
                        }
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size2 = channel.size();
                            if (size2 == 0) {
                                this.f6398s = -1L;
                                jPosition = -1;
                            } else {
                                jPosition = size2 - channel.position();
                                this.f6398s = jPosition;
                                if (jPosition < 0) {
                                    throw new zzfo(2008, null);
                                }
                            }
                        } else {
                            jPosition = length - jSkip;
                            this.f6398s = jPosition;
                            if (jPosition < 0) {
                                throw new zzfo(2008, null);
                            }
                        }
                        long j11 = iz0Var.f5733d;
                        if (j11 != -1) {
                            this.f6398s = jPosition == -1 ? j11 : Math.min(jPosition, j11);
                        }
                        this.f6399t = true;
                        n(iz0Var);
                        return j11 != -1 ? j11 : this.f6398s;
                    } catch (IOException e11) {
                        e = e11;
                    }
                } catch (zzfo e12) {
                    throw e12;
                }
                break;
            default:
                this.f6401v = iz0Var;
                j(iz0Var);
                Context context = (Context) obj;
                Uri uriNormalizeScheme2 = iz0Var.f5730a.normalizeScheme();
                if (TextUtils.equals("rawresource", uriNormalizeScheme2.getScheme())) {
                    resources = context.getResources();
                    List<String> pathSegments = uriNormalizeScheme2.getPathSegments();
                    if (pathSegments.size() != 1) {
                        throw new zzgr(2000, fb1.g("rawresource:// URI must have exactly one path element, found ", pathSegments.size()), null);
                    }
                    try {
                        identifier = Integer.parseInt(pathSegments.get(0));
                    } catch (NumberFormatException unused) {
                        throw new zzgr(1004, "Resource identifier must be an integer.", null);
                    }
                } else {
                    if (!TextUtils.equals("android.resource", uriNormalizeScheme2.getScheme())) {
                        throw new zzgr(1004, fb1.i("Unsupported URI scheme (", uriNormalizeScheme2.getScheme(), "). Only android.resource is supported."), null);
                    }
                    String path = uriNormalizeScheme2.getPath();
                    path.getClass();
                    if (path.startsWith("/")) {
                        path = path.substring(1);
                    }
                    String packageName = TextUtils.isEmpty(uriNormalizeScheme2.getHost()) ? context.getPackageName() : uriNormalizeScheme2.getHost();
                    if (packageName.equals(context.getPackageName())) {
                        resourcesForApplication = context.getResources();
                    } else {
                        try {
                            resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                        } catch (PackageManager.NameNotFoundException e13) {
                            throw new zzgr(2005, "Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e13);
                        }
                    }
                    resources = resourcesForApplication;
                    if (path.matches("\\d+")) {
                        try {
                            identifier = Integer.parseInt(path);
                        } catch (NumberFormatException unused2) {
                            throw new zzgr(1004, "Resource identifier must be an integer.", null);
                        }
                    } else {
                        identifier = resources.getIdentifier(fb1.x(packageName, ":", path), "raw", null);
                        if (identifier == 0) {
                            throw new zzgr(2005, "Resource not found.", null);
                        }
                    }
                }
                try {
                    AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(identifier);
                    if (assetFileDescriptorOpenRawResourceFd == null) {
                        throw new zzgr(2000, "Resource is compressed: ".concat(String.valueOf(uriNormalizeScheme2)), null);
                    }
                    this.f6397q = assetFileDescriptorOpenRawResourceFd;
                    long length2 = assetFileDescriptorOpenRawResourceFd.getLength();
                    FileInputStream fileInputStream2 = new FileInputStream(this.f6397q.getFileDescriptor());
                    this.f6402w = fileInputStream2;
                    long j12 = iz0Var.f5732c;
                    try {
                        if (length2 != -1 && j12 > length2) {
                            throw new zzgr(2008, null, null);
                        }
                        long startOffset2 = this.f6397q.getStartOffset();
                        long jSkip2 = fileInputStream2.skip(startOffset2 + j12) - startOffset2;
                        if (jSkip2 != j12) {
                            throw new zzgr(2008, null, null);
                        }
                        if (length2 == -1) {
                            FileChannel channel2 = fileInputStream2.getChannel();
                            if (channel2.size() == 0) {
                                this.f6398s = -1L;
                                size = -1;
                            } else {
                                size = channel2.size() - channel2.position();
                                this.f6398s = size;
                                if (size < 0) {
                                    throw new zzgr(2008, null, null);
                                }
                            }
                        } else {
                            size = length2 - jSkip2;
                            this.f6398s = size;
                            if (size < 0) {
                                throw new zzft(2008);
                            }
                        }
                        long j13 = iz0Var.f5733d;
                        if (j13 != -1) {
                            this.f6398s = size == -1 ? j13 : Math.min(size, j13);
                        }
                        this.f6399t = true;
                        n(iz0Var);
                        return j13 != -1 ? j13 : this.f6398s;
                    } catch (zzgr e14) {
                        throw e14;
                    } catch (IOException e15) {
                        throw new zzgr(2000, null, e15);
                    }
                } catch (Resources.NotFoundException e16) {
                    throw new zzgr(2005, null, e16);
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final Uri zzc() {
        switch (this.f6396h) {
            case 0:
                return (Uri) this.f6401v;
            default:
                iz0 iz0Var = (iz0) this.f6401v;
                if (iz0Var != null) {
                    return iz0Var.f5730a;
                }
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void zzd() {
        switch (this.f6396h) {
            case 0:
                this.f6401v = null;
                try {
                    try {
                        try {
                            FileInputStream fileInputStream = this.f6402w;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            this.f6402w = null;
                            try {
                                AssetFileDescriptor assetFileDescriptor = this.f6397q;
                                if (assetFileDescriptor != null) {
                                    assetFileDescriptor.close();
                                    break;
                                }
                                this.f6397q = null;
                                if (this.f6399t) {
                                    this.f6399t = false;
                                    i();
                                    return;
                                }
                                return;
                            } catch (IOException e10) {
                                throw new zzfo(2000, e10);
                            }
                        } catch (Throwable th) {
                            this.f6402w = null;
                            try {
                                AssetFileDescriptor assetFileDescriptor2 = this.f6397q;
                                if (assetFileDescriptor2 != null) {
                                    assetFileDescriptor2.close();
                                    break;
                                }
                                this.f6397q = null;
                                if (this.f6399t) {
                                    this.f6399t = false;
                                    i();
                                }
                                throw th;
                            } catch (IOException e11) {
                                throw new zzfo(2000, e11);
                            }
                        }
                    } catch (IOException e12) {
                        throw new zzfo(2000, e12);
                    }
                } catch (Throwable th2) {
                    this.f6397q = null;
                    if (this.f6399t) {
                        this.f6399t = false;
                        i();
                    }
                    throw th2;
                }
            default:
                this.f6401v = null;
                try {
                    try {
                        try {
                            FileInputStream fileInputStream2 = this.f6402w;
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            this.f6402w = null;
                            try {
                                AssetFileDescriptor assetFileDescriptor3 = this.f6397q;
                                if (assetFileDescriptor3 != null) {
                                    assetFileDescriptor3.close();
                                    break;
                                }
                                this.f6397q = null;
                                if (this.f6399t) {
                                    this.f6399t = false;
                                    i();
                                    return;
                                }
                                return;
                            } catch (IOException e13) {
                                throw new zzgr(2000, null, e13);
                            }
                        } catch (Throwable th3) {
                            this.f6402w = null;
                            try {
                                AssetFileDescriptor assetFileDescriptor4 = this.f6397q;
                                if (assetFileDescriptor4 != null) {
                                    assetFileDescriptor4.close();
                                    break;
                                }
                                this.f6397q = null;
                                if (this.f6399t) {
                                    this.f6399t = false;
                                    i();
                                }
                                throw th3;
                            } catch (IOException e14) {
                                throw new zzgr(2000, null, e14);
                            }
                        }
                    } catch (IOException e15) {
                        throw new zzgr(2000, null, e15);
                    }
                } catch (Throwable th4) {
                    this.f6397q = null;
                    if (this.f6399t) {
                        this.f6399t = false;
                        i();
                    }
                    throw th4;
                }
        }
    }
}
