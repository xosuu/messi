package x4;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i10, LayoutInflater layoutInflater, RecyclerView recyclerView) {
        super(layoutInflater.inflate(R.layout.bc, (ViewGroup) recyclerView, false));
        if (i10 != 2) {
        } else {
            super(layoutInflater.inflate(R.layout.bd, (ViewGroup) recyclerView, false));
        }
    }
}
