package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int F = 0;
    public final Chip E;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        h hVar = new h(this);
        LayoutInflater.from(context).inflate(R.layout.cr, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.n9);
        materialButtonToggleGroup.f11816d.add(new g(this));
        Chip chip = (Chip) findViewById(R.id.nd);
        Chip chip2 = (Chip) findViewById(R.id.na);
        this.E = chip2;
        j jVar = new j(new GestureDetector(getContext(), new i(this)));
        chip.setOnTouchListener(jVar);
        chip2.setOnTouchListener(jVar);
        chip.setTag(R.id.tb, 12);
        chip2.setTag(R.id.tb, 10);
        chip.setOnClickListener(hVar);
        chip2.setOnClickListener(hVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            this.E.sendAccessibilityEvent(8);
        }
    }
}
