package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import androidx.core.app.NotificationCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.ur0;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import l.a3;
import l.b3;
import l.c2;
import l.c3;
import l.d3;
import l.e2;
import l.e3;
import l.f3;
import l.g3;
import l.h3;
import l.i3;
import l.k3;
import l.p;
import l.y2;
import l.z2;
import o0.d0;
import o0.v0;
import team.dev.epro.apkcustom.activities.ProxifiedApps;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends c2 implements j.c {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final h3 f294v0;
    public final SearchAutoComplete B;
    public final View C;
    public final View D;
    public final View E;
    public final ImageView F;
    public final ImageView G;
    public final ImageView H;
    public final ImageView I;
    public final View J;
    public i3 K;
    public final Rect L;
    public final Rect M;
    public final int[] N;
    public final int[] O;
    public final ImageView P;
    public final Drawable Q;
    public final int R;
    public final int S;
    public final Intent T;
    public final Intent U;
    public final CharSequence V;
    public f3 W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public e3 f295a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public View.OnFocusChangeListener f296b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public View.OnClickListener f297c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f298d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f299e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public t0.b f300f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f301g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public CharSequence f302h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f303i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f304j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f305k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f306l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public String f307m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public CharSequence f308n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f309o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f310p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public SearchableInfo f311q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Bundle f312r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final z2 f313s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final z2 f314t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final WeakHashMap f315u0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new g();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f316d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f316d = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public final String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f316d + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f570a, i10);
            parcel.writeValue(Boolean.valueOf(this.f316d));
        }
    }

    public static class SearchAutoComplete extends p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f317h;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public SearchView f318q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f319s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final h f320t;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f320t = new h(this);
            this.f317h = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return NotificationCompat.FLAG_LOCAL_ONLY;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                f.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            h3 h3Var = SearchView.f294v0;
            h3Var.getClass();
            h3.a();
            Method method = h3Var.f14866c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f317h <= 0 || super.enoughToFilter();
        }

        @Override // l.p, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f319s) {
                h hVar = this.f320t;
                removeCallbacks(hVar);
                post(hVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z9, int i10, Rect rect) {
            super.onFocusChanged(z9, i10, rect);
            SearchView searchView = this.f318q;
            searchView.y(searchView.f299e0);
            searchView.post(searchView.f313s0);
            if (searchView.B.hasFocus()) {
                searchView.n();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f318q.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z9) {
            super.onWindowFocusChanged(z9);
            if (z9 && this.f318q.hasFocus() && getVisibility() == 0) {
                this.f319s = true;
                Context context = getContext();
                h3 h3Var = SearchView.f294v0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z9) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            h hVar = this.f320t;
            if (!z9) {
                this.f319s = false;
                removeCallbacks(hVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f319s = true;
                    return;
                }
                this.f319s = false;
                removeCallbacks(hVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f318q = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f317h = i10;
        }
    }

    static {
        h3 h3Var = null;
        if (Build.VERSION.SDK_INT < 29) {
            h3 h3Var2 = new h3();
            h3Var2.f14864a = null;
            h3Var2.f14865b = null;
            h3Var2.f14866c = null;
            h3.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                h3Var2.f14864a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                h3Var2.f14865b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                h3Var2.f14866c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            h3Var = h3Var2;
        }
        f294v0 = h3Var;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.ar);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.as);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.B;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // j.c
    public final void b() {
        if (this.f309o0) {
            return;
        }
        this.f309o0 = true;
        SearchAutoComplete searchAutoComplete = this.B;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f310p0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f304j0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.B;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f304j0 = false;
    }

    @Override // j.c
    public final void e() {
        SearchAutoComplete searchAutoComplete = this.B;
        searchAutoComplete.setText(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f308n0 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        clearFocus();
        y(true);
        searchAutoComplete.setImeOptions(this.f310p0);
        this.f309o0 = false;
    }

    public int getImeOptions() {
        return this.B.getImeOptions();
    }

    public int getInputType() {
        return this.B.getInputType();
    }

    public int getMaxWidth() {
        return this.f305k0;
    }

    public CharSequence getQuery() {
        return this.B.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f302h0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f311q0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.V : getContext().getText(this.f311q0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.S;
    }

    public int getSuggestionRowLayout() {
        return this.R;
    }

    public t0.b getSuggestionsAdapter() {
        return this.f300f0;
    }

    public final Intent l(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f308n0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f312r0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f311q0.getSearchActivity());
        return intent;
    }

    public final Intent m(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f312r0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void n() {
        int i10 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.B;
        if (i10 >= 29) {
            f.a(searchAutoComplete);
            return;
        }
        h3 h3Var = f294v0;
        h3Var.getClass();
        h3.a();
        Method method = h3Var.f14864a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        h3Var.getClass();
        h3.a();
        Method method2 = h3Var.f14865b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.B;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f298d0) {
            e3 e3Var = this.f295a0;
            if (e3Var != null) {
                ((q8.c) e3Var).f16446a.K.getFilter().filter(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            }
            clearFocus();
            y(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f313s0);
        post(this.f314t0);
        super.onDetachedFromWindow();
    }

    @Override // l.c2, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        if (z9) {
            int[] iArr = this.N;
            SearchAutoComplete searchAutoComplete = this.B;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.O;
            getLocationInWindow(iArr2);
            int i14 = iArr[1] - iArr2[1];
            int i15 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i15;
            int height = searchAutoComplete.getHeight() + i14;
            Rect rect = this.L;
            rect.set(i15, i14, width, height);
            int i16 = rect.left;
            int i17 = rect.right;
            int i18 = i13 - i11;
            Rect rect2 = this.M;
            rect2.set(i16, 0, i17, i18);
            i3 i3Var = this.K;
            if (i3Var == null) {
                i3 i3Var2 = new i3(rect2, rect, searchAutoComplete);
                this.K = i3Var2;
                setTouchDelegate(i3Var2);
            } else {
                i3Var.f14870b.set(rect2);
                Rect rect3 = i3Var.f14872d;
                rect3.set(rect2);
                int i19 = -i3Var.f14873e;
                rect3.inset(i19, i19);
                i3Var.f14871c.set(rect);
            }
        }
    }

    @Override // l.c2, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f299e0) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.f305k0;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f305k0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.f305k0) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f570a);
        y(savedState.f316d);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f316d = this.f299e0;
        return savedState;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        post(this.f313s0);
    }

    public final void p(int i10) {
        String strH;
        Cursor cursor = this.f300f0.f16807d;
        if (cursor != null && cursor.moveToPosition(i10)) {
            Intent intentL = null;
            try {
                try {
                    int i11 = k3.J;
                    String strH2 = k3.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                    if (strH2 == null) {
                        strH2 = this.f311q0.getSuggestIntentAction();
                    }
                    if (strH2 == null) {
                        strH2 = "android.intent.action.SEARCH";
                    }
                    String strH3 = k3.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                    if (strH3 == null) {
                        strH3 = this.f311q0.getSuggestIntentData();
                    }
                    if (strH3 != null && (strH = k3.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                        strH3 = strH3 + "/" + Uri.encode(strH);
                    }
                    intentL = l(strH2, strH3 == null ? null : Uri.parse(strH3), k3.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), k3.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
                } catch (RuntimeException unused) {
                }
            } catch (RuntimeException unused2) {
                cursor.getPosition();
            }
            if (intentL != null) {
                try {
                    getContext().startActivity(intentL);
                } catch (RuntimeException unused3) {
                    intentL.toString();
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.B;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void q(int i10) {
        Editable text = this.B.getText();
        Cursor cursor = this.f300f0.f16807d;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i10)) {
            setQuery(text);
            return;
        }
        String strC = this.f300f0.c(cursor);
        if (strC != null) {
            setQuery(strC);
        } else {
            setQuery(text);
        }
    }

    public final void r(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        if (this.f304j0 || !isFocusable()) {
            return false;
        }
        if (this.f299e0) {
            return super.requestFocus(i10, rect);
        }
        boolean zRequestFocus = this.B.requestFocus(i10, rect);
        if (zRequestFocus) {
            y(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        SearchAutoComplete searchAutoComplete = this.B;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        f3 f3Var = this.W;
        if (f3Var != null) {
            ((ProxifiedApps) ((f5.b) f3Var).f13091b).K.getFilter().filter(text.toString());
            return;
        }
        if (this.f311q0 != null) {
            getContext().startActivity(l("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public void setAppSearchData(Bundle bundle) {
        this.f312r0 = bundle;
    }

    public void setIconified(boolean z9) {
        if (z9) {
            o();
            return;
        }
        y(false);
        SearchAutoComplete searchAutoComplete = this.B;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f297c0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z9) {
        if (this.f298d0 == z9) {
            return;
        }
        this.f298d0 = z9;
        y(z9);
        v();
    }

    public void setImeOptions(int i10) {
        this.B.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.B.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f305k0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(e3 e3Var) {
        this.f295a0 = e3Var;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f296b0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(f3 f3Var) {
        this.W = f3Var;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f297c0 = onClickListener;
    }

    public void setOnSuggestionListener(g3 g3Var) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f302h0 = charSequence;
        v();
    }

    public void setQueryRefinementEnabled(boolean z9) {
        this.f303i0 = z9;
        t0.b bVar = this.f300f0;
        if (bVar instanceof k3) {
            ((k3) bVar).B = z9 ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f311q0 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.B;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f311q0.getImeOptions());
            int inputType = this.f311q0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f311q0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            t0.b bVar = this.f300f0;
            if (bVar != null) {
                bVar.b(null);
            }
            if (this.f311q0.getSuggestAuthority() != null) {
                k3 k3Var = new k3(getContext(), this, this.f311q0, this.f315u0);
                this.f300f0 = k3Var;
                searchAutoComplete.setAdapter(k3Var);
                ((k3) this.f300f0).B = this.f303i0 ? 2 : 1;
            }
            v();
        }
        SearchableInfo searchableInfo2 = this.f311q0;
        boolean z9 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f311q0.getVoiceSearchLaunchWebSearch()) {
                intent = this.T;
            } else if (this.f311q0.getVoiceSearchLaunchRecognizer()) {
                intent = this.U;
            }
            if (intent != null) {
                z9 = getContext().getPackageManager().resolveActivity(intent, 65536) != null;
            }
        }
        this.f306l0 = z9;
        if (z9) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        y(this.f299e0);
    }

    public void setSubmitButtonEnabled(boolean z9) {
        this.f301g0 = z9;
        y(this.f299e0);
    }

    public void setSuggestionsAdapter(t0.b bVar) {
        this.f300f0 = bVar;
        this.B.setAdapter(bVar);
    }

    public final void t() {
        boolean z9 = true;
        boolean z10 = !TextUtils.isEmpty(this.B.getText());
        if (!z10 && (!this.f298d0 || this.f309o0)) {
            z9 = false;
        }
        int i10 = z9 ? 0 : 8;
        ImageView imageView = this.H;
        imageView.setVisibility(i10);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(z10 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void u() {
        int[] iArr = this.B.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.D.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.E.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void v() {
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        boolean z9 = this.f298d0;
        SearchAutoComplete searchAutoComplete = this.B;
        CharSequence charSequence2 = charSequence;
        if (z9) {
            Drawable drawable = this.Q;
            charSequence2 = charSequence;
            if (drawable != null) {
                int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
                drawable.setBounds(0, 0, textSize, textSize);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
                spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
                spannableStringBuilder.append(charSequence);
                charSequence2 = spannableStringBuilder;
            }
        }
        searchAutoComplete.setHint(charSequence2);
    }

    public final void w() {
        this.E.setVisibility(((this.f301g0 || this.f306l0) && !this.f299e0 && (this.G.getVisibility() == 0 || this.I.getVisibility() == 0)) ? 0 : 8);
    }

    public final void x(boolean z9) {
        boolean z10 = this.f301g0;
        this.G.setVisibility((!z10 || !(z10 || this.f306l0) || this.f299e0 || !hasFocus() || (!z9 && this.f306l0)) ? 8 : 0);
    }

    public final void y(boolean z9) {
        this.f299e0 = z9;
        int i10 = 8;
        int i11 = z9 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.B.getText());
        this.F.setVisibility(i11);
        x(!zIsEmpty);
        this.C.setVisibility(z9 ? 8 : 0);
        ImageView imageView = this.P;
        imageView.setVisibility((imageView.getDrawable() == null || this.f298d0) ? 8 : 0);
        t();
        if (this.f306l0 && !this.f299e0 && zIsEmpty) {
            this.G.setVisibility(8);
            i10 = 0;
        }
        this.I.setVisibility(i10);
        w();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.a0e);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.L = new Rect();
        this.M = new Rect();
        this.N = new int[2];
        this.O = new int[2];
        int i11 = 0;
        this.f313s0 = new z2(this, i11);
        this.f314t0 = new z2(this, 1);
        this.f315u0 = new WeakHashMap();
        d dVar = new d(this);
        e eVar = new e(this);
        c3 c3Var = new c3(this);
        d3 d3Var = new d3(this, i11);
        e2 e2Var = new e2(1, this);
        y2 y2Var = new y2(this, i11);
        int[] iArr = e.a.f12615v;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        ur0 ur0Var = new ur0(context, 5, typedArrayObtainStyledAttributes);
        v0.p(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10);
        LayoutInflater.from(context).inflate(ur0Var.D(17, R.layout.z), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.so);
        this.B = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.C = findViewById(R.id.sk);
        View viewFindViewById = findViewById(R.id.sn);
        this.D = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.v0);
        this.E = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.si);
        this.F = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.sl);
        this.G = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.sj);
        this.H = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.t2);
        this.I = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.sm);
        this.P = imageView5;
        d0.q(viewFindViewById, ur0Var.y(18));
        d0.q(viewFindViewById2, ur0Var.y(23));
        imageView.setImageDrawable(ur0Var.y(21));
        imageView2.setImageDrawable(ur0Var.y(13));
        imageView3.setImageDrawable(ur0Var.y(10));
        imageView4.setImageDrawable(ur0Var.y(26));
        imageView5.setImageDrawable(ur0Var.y(21));
        this.Q = ur0Var.y(20);
        g4.d0.j(imageView, getResources().getString(R.string.af));
        this.R = ur0Var.D(24, R.layout.y);
        this.S = ur0Var.D(11, 0);
        imageView.setOnClickListener(dVar);
        imageView3.setOnClickListener(dVar);
        imageView2.setOnClickListener(dVar);
        imageView4.setOnClickListener(dVar);
        searchAutoComplete.setOnClickListener(dVar);
        searchAutoComplete.addTextChangedListener(y2Var);
        searchAutoComplete.setOnEditorActionListener(c3Var);
        searchAutoComplete.setOnItemClickListener(d3Var);
        searchAutoComplete.setOnItemSelectedListener(e2Var);
        searchAutoComplete.setOnKeyListener(eVar);
        searchAutoComplete.setOnFocusChangeListener(new a3(this));
        setIconifiedByDefault(ur0Var.u(16, true));
        int iX = ur0Var.x(2, -1);
        if (iX != -1) {
            setMaxWidth(iX);
        }
        this.V = ur0Var.G(12);
        this.f302h0 = ur0Var.G(19);
        int iB = ur0Var.B(6, -1);
        if (iB != -1) {
            setImeOptions(iB);
        }
        int iB2 = ur0Var.B(5, -1);
        if (iB2 != -1) {
            setInputType(iB2);
        }
        setFocusable(ur0Var.u(1, true));
        ur0Var.M();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.T = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.U = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.J = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new b3(0, this));
        }
        y(this.f298d0);
        v();
    }
}
