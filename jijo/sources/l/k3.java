package l;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class k3 extends t0.b implements View.OnClickListener {
    public static final /* synthetic */ int J = 0;
    public final int A;
    public int B;
    public ColorStateList C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f14922t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f14923u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LayoutInflater f14924v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final SearchView f14925w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final SearchableInfo f14926x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Context f14927y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final WeakHashMap f14928z;

    public k3(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f16806b = true;
        this.f16807d = null;
        this.f16805a = false;
        this.f16808f = -1;
        this.f16809h = new t0.a(this);
        this.f16810q = new h2(1, this);
        this.f14923u = suggestionRowLayout;
        this.f14922t = suggestionRowLayout;
        this.f14924v = (LayoutInflater) context.getSystemService("layout_inflater");
        this.B = 1;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.f14925w = searchView;
        this.f14926x = searchableInfo;
        this.A = searchView.getSuggestionCommitIconResId();
        this.f14927y = context;
        this.f14928z = weakHashMap;
    }

    public static String h(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0125  */
    @Override // t0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.View r22, android.database.Cursor r23) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.k3.a(android.view.View, android.database.Cursor):void");
    }

    @Override // t0.b
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.D = cursor.getColumnIndex("suggest_text_1");
                this.E = cursor.getColumnIndex("suggest_text_2");
                this.F = cursor.getColumnIndex("suggest_text_2_url");
                this.G = cursor.getColumnIndex("suggest_icon_1");
                this.H = cursor.getColumnIndex("suggest_icon_2");
                this.I = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // t0.b
    public final String c(Cursor cursor) {
        String strH;
        String strH2;
        if (cursor == null) {
            return null;
        }
        String strH3 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strH3 != null) {
            return strH3;
        }
        SearchableInfo searchableInfo = this.f14926x;
        if (searchableInfo.shouldRewriteQueryFromData() && (strH2 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strH2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strH = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strH;
    }

    @Override // t0.b
    public final View d(ViewGroup viewGroup) {
        View viewInflate = this.f14924v.inflate(this.f14922t, viewGroup, false);
        viewInflate.setTag(new j3(viewInflate));
        ((ImageView) viewInflate.findViewById(R.id.i0)).setImageResource(this.A);
        return viewInflate;
    }

    public final Drawable e(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f14927y.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    public final Drawable f(String str) {
        Drawable drawableE = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int i10 = Integer.parseInt(str);
                String str2 = "android.resource://" + this.f14927y.getPackageName() + "/" + i10;
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f14928z.get(str2);
                Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    return drawableNewDrawable;
                }
                Context context = this.f14927y;
                Object obj = d0.f.f12287a;
                Drawable drawableB = d0.c.b(context, i10);
                if (drawableB != null) {
                    this.f14928z.put(str2, drawableB.getConstantState());
                }
                return drawableB;
            } catch (Resources.NotFoundException unused) {
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) this.f14928z.get(str);
                Drawable drawableNewDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (drawableNewDrawable2 != null) {
                    return drawableNewDrawable2;
                }
                Uri uri = Uri.parse(str);
                try {
                    if ("android.resource".equals(uri.getScheme())) {
                        try {
                            drawableE = e(uri);
                        } catch (Resources.NotFoundException unused3) {
                            throw new FileNotFoundException("Resource does not exist: " + uri);
                        }
                    } else {
                        InputStream inputStreamOpenInputStream = this.f14927y.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            throw new FileNotFoundException("Failed to open " + uri);
                        }
                        try {
                            drawableE = Drawable.createFromStream(inputStreamOpenInputStream, null);
                        } finally {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException unused4) {
                                uri.toString();
                            }
                        }
                    }
                } catch (FileNotFoundException e10) {
                    Objects.toString(uri);
                    e10.getMessage();
                }
                if (drawableE != null) {
                    this.f14928z.put(str, drawableE.getConstantState());
                }
            }
        }
        return drawableE;
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).fragment(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f14927y.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // t0.b, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            View viewInflate = this.f14924v.inflate(this.f14923u, viewGroup, false);
            if (viewInflate != null) {
                ((j3) viewInflate.getTag()).f14881a.setText(e10.toString());
            }
            return viewInflate;
        }
    }

    @Override // t0.b, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            View viewD = d(viewGroup);
            ((j3) viewD.getTag()).f14881a.setText(e10.toString());
            return viewD;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f16807d;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f16807d;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f14925w.r((CharSequence) tag);
        }
    }
}
