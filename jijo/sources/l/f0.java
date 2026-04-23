package l;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.google.android.gms.internal.ads.ur0;

/* JADX INFO: loaded from: classes.dex */
public class f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f14852c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProgressBar f14853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f14854b;

    public f0(ProgressBar progressBar) {
        this.f14853a = progressBar;
    }

    public void a(AttributeSet attributeSet, int i10) {
        ProgressBar progressBar = this.f14853a;
        ur0 ur0VarK = ur0.K(progressBar.getContext(), attributeSet, f14852c, i10);
        Drawable drawableZ = ur0VarK.z(0);
        if (drawableZ != null) {
            if (drawableZ instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableZ;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i11 = 0; i11 < numberOfFrames; i11++) {
                    Drawable drawableB = b(animationDrawable.getFrame(i11), true);
                    drawableB.setLevel(10000);
                    animationDrawable2.addFrame(drawableB, animationDrawable.getDuration(i11));
                }
                animationDrawable2.setLevel(10000);
                drawableZ = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(drawableZ);
        }
        Drawable drawableZ2 = ur0VarK.z(1);
        if (drawableZ2 != null) {
            progressBar.setProgressDrawable(b(drawableZ2, false));
        }
        ur0VarK.M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable b(Drawable drawable, boolean z9) {
        if (drawable instanceof h0.i) {
            h0.j jVar = (h0.j) ((h0.i) drawable);
            Drawable drawable2 = jVar.f13921q;
            if (drawable2 != null) {
                jVar.c(b(drawable2, z9));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    int id = layerDrawable.getId(i10);
                    drawableArr[i10] = b(layerDrawable.getDrawable(i10), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i11 = 0; i11 < numberOfLayers; i11++) {
                    layerDrawable2.setId(i11, layerDrawable.getId(i11));
                    if (Build.VERSION.SDK_INT >= 23) {
                        e0.a(layerDrawable, layerDrawable2, i11);
                    }
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f14854b == null) {
                    this.f14854b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z9 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
