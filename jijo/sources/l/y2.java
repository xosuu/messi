package l;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.KeyEvent;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.textfield.TextInputLayout;
import team.dev.epro.apkcustom.activities.ProxifiedApps;
import team.dev.epro.apkcustom.dialogs.Cloud;
import team.dev.epro.apkcustom.dialogs.RequestBlock;
import team.dev.epro.apkcustom.dialogs.ShortUrl;

/* JADX INFO: loaded from: classes.dex */
public final class y2 implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f15086b;

    public /* synthetic */ y2(KeyEvent.Callback callback, int i10) {
        this.f15085a = i10;
        this.f15086b = callback;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10 = this.f15085a;
        KeyEvent.Callback callback = this.f15086b;
        switch (i10) {
            case 0:
                break;
            case 1:
                TextInputLayout textInputLayout = (TextInputLayout) callback;
                textInputLayout.t(!textInputLayout.J0, false);
                if (textInputLayout.f12016w) {
                    textInputLayout.n(editable);
                }
                if (textInputLayout.E) {
                    textInputLayout.u(editable);
                }
                break;
            case 2:
                Cloud cloud = (Cloud) callback;
                if (!Patterns.WEB_URL.matcher(cloud.G.getText().toString()).matches()) {
                    cloud.K = false;
                    cloud.J.setError("Invalid url");
                } else {
                    cloud.J.setError(null);
                    cloud.K = true;
                }
                break;
            case 3:
                RequestBlock requestBlock = (RequestBlock) callback;
                if (Patterns.WEB_URL.matcher(requestBlock.f17195d0.getText().toString()).matches()) {
                    requestBlock.Q.setError(null);
                    requestBlock.W0 = true;
                } else if (!requestBlock.f17195d0.getText().toString().isEmpty()) {
                    requestBlock.W0 = false;
                    requestBlock.Q.setError("Invalid url update config");
                } else {
                    requestBlock.Q.setError(null);
                    requestBlock.W0 = true;
                }
                break;
            default:
                ShortUrl shortUrl = (ShortUrl) callback;
                if (!Patterns.WEB_URL.matcher(shortUrl.G.getText().toString()).matches()) {
                    shortUrl.L = false;
                    shortUrl.K.setError("Invalid url");
                } else {
                    shortUrl.K.setError(null);
                    shortUrl.L = true;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f15085a) {
            case 0:
                SearchView searchView = (SearchView) this.f15086b;
                Editable text = searchView.B.getText();
                searchView.f308n0 = text;
                boolean zIsEmpty = TextUtils.isEmpty(text);
                searchView.x(!zIsEmpty);
                int i13 = 8;
                if (searchView.f306l0 && !searchView.f299e0 && zIsEmpty) {
                    searchView.G.setVisibility(8);
                    i13 = 0;
                }
                searchView.I.setVisibility(i13);
                searchView.t();
                searchView.w();
                if (searchView.W != null && !TextUtils.equals(charSequence, searchView.f307m0)) {
                    ((ProxifiedApps) ((f5.b) searchView.W).f13091b).K.getFilter().filter(charSequence.toString());
                }
                searchView.f307m0 = charSequence.toString();
                break;
        }
    }
}
