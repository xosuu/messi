package l;

import android.graphics.drawable.LayerDrawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {
    public static void a(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i10) {
        layerDrawable2.setLayerGravity(i10, layerDrawable.getLayerGravity(i10));
        layerDrawable2.setLayerWidth(i10, layerDrawable.getLayerWidth(i10));
        layerDrawable2.setLayerHeight(i10, layerDrawable.getLayerHeight(i10));
        layerDrawable2.setLayerInsetLeft(i10, layerDrawable.getLayerInsetLeft(i10));
        layerDrawable2.setLayerInsetRight(i10, layerDrawable.getLayerInsetRight(i10));
        layerDrawable2.setLayerInsetTop(i10, layerDrawable.getLayerInsetTop(i10));
        layerDrawable2.setLayerInsetBottom(i10, layerDrawable.getLayerInsetBottom(i10));
        layerDrawable2.setLayerInsetStart(i10, layerDrawable.getLayerInsetStart(i10));
        layerDrawable2.setLayerInsetEnd(i10, layerDrawable.getLayerInsetEnd(i10));
    }
}
