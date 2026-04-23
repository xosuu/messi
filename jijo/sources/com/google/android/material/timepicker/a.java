package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import x4.x;

/* JADX INFO: loaded from: classes.dex */
public final class a extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f12041a;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.f12041a = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f12041a;
        if (zIsEmpty) {
            chipTextInputComboView.f12026a.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            return;
        }
        String strA = ChipTextInputComboView.a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f12026a;
        if (TextUtils.isEmpty(strA)) {
            strA = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chip.setText(strA);
    }
}
