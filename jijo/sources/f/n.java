package f;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.internal.ads.ur0;
import java.util.WeakHashMap;
import l.b2;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class n extends m0 implements DialogInterface {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f12945h;

    public n(Context context, int i10) {
        super(context, j(context, i10));
        this.f12945h = new m(getContext(), this, getWindow());
    }

    public static int j(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.aj, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // f.m0, androidx.activity.k, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i10;
        View view;
        ListAdapter listAdapter;
        View view2;
        View viewFindViewById;
        super.onCreate(bundle);
        m mVar = this.f12945h;
        mVar.f12918b.setContentView(mVar.F);
        Window window = mVar.f12919c;
        View viewFindViewById2 = window.findViewById(R.id.ql);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.x_);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.fy);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.dq);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.ge);
        View viewInflate = mVar.f12924h;
        Context context = mVar.f12917a;
        if (viewInflate == null) {
            viewInflate = mVar.f12925i != 0 ? LayoutInflater.from(context).inflate(mVar.f12925i, viewGroup, false) : null;
        }
        boolean z9 = viewInflate != null;
        if (!z9 || !m.a(viewInflate)) {
            window.setFlags(131072, 131072);
        }
        if (z9) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.g_);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (mVar.f12926j) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (mVar.f12923g != null) {
                ((LinearLayout.LayoutParams) ((b2) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.x_);
        View viewFindViewById7 = viewGroup.findViewById(R.id.fy);
        View viewFindViewById8 = viewGroup.findViewById(R.id.dq);
        ViewGroup viewGroupC = m.c(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupC2 = m.c(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupC3 = m.c(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.sc);
        mVar.f12939w = nestedScrollView;
        nestedScrollView.setFocusable(false);
        mVar.f12939w.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupC2.findViewById(android.R.id.message);
        mVar.B = textView;
        if (textView != null) {
            CharSequence charSequence = mVar.f12922f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                mVar.f12939w.removeView(mVar.B);
                if (mVar.f12923g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) mVar.f12939w.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(mVar.f12939w);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(mVar.f12923g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupC2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupC3.findViewById(android.R.id.button1);
        mVar.f12927k = button;
        b bVar = mVar.L;
        button.setOnClickListener(bVar);
        boolean zIsEmpty = TextUtils.isEmpty(mVar.f12928l);
        int i11 = mVar.f12920d;
        if (zIsEmpty && mVar.f12930n == null) {
            mVar.f12927k.setVisibility(8);
            i10 = 0;
        } else {
            mVar.f12927k.setText(mVar.f12928l);
            Drawable drawable = mVar.f12930n;
            if (drawable != null) {
                drawable.setBounds(0, 0, i11, i11);
                mVar.f12927k.setCompoundDrawables(mVar.f12930n, null, null, null);
            }
            mVar.f12927k.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroupC3.findViewById(android.R.id.button2);
        mVar.f12931o = button2;
        button2.setOnClickListener(bVar);
        if (TextUtils.isEmpty(mVar.f12932p) && mVar.f12934r == null) {
            mVar.f12931o.setVisibility(8);
        } else {
            mVar.f12931o.setText(mVar.f12932p);
            Drawable drawable2 = mVar.f12934r;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i11, i11);
                mVar.f12931o.setCompoundDrawables(mVar.f12934r, null, null, null);
            }
            mVar.f12931o.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroupC3.findViewById(android.R.id.button3);
        mVar.f12935s = button3;
        button3.setOnClickListener(bVar);
        if (TextUtils.isEmpty(mVar.f12936t) && mVar.f12938v == null) {
            mVar.f12935s.setVisibility(8);
            view = null;
        } else {
            mVar.f12935s.setText(mVar.f12936t);
            Drawable drawable3 = mVar.f12938v;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i11, i11);
                view = null;
                mVar.f12935s.setCompoundDrawables(mVar.f12938v, null, null, null);
            } else {
                view = null;
            }
            mVar.f12935s.setVisibility(0);
            i10 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.ah, typedValue, true);
        if (typedValue.data != 0) {
            if (i10 == 1) {
                Button button4 = mVar.f12927k;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i10 == 2) {
                Button button5 = mVar.f12931o;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i10 == 4) {
                Button button6 = mVar.f12935s;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i10 == 0) {
            viewGroupC3.setVisibility(8);
        }
        if (mVar.C != null) {
            viewGroupC.addView(mVar.C, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.x5).setVisibility(8);
        } else {
            mVar.f12942z = (ImageView) window.findViewById(android.R.id.icon);
            if ((!TextUtils.isEmpty(mVar.f12921e)) && mVar.J) {
                TextView textView2 = (TextView) window.findViewById(R.id.c7);
                mVar.A = textView2;
                textView2.setText(mVar.f12921e);
                int i12 = mVar.f12940x;
                if (i12 != 0) {
                    mVar.f12942z.setImageResource(i12);
                } else {
                    Drawable drawable4 = mVar.f12941y;
                    if (drawable4 != null) {
                        mVar.f12942z.setImageDrawable(drawable4);
                    } else {
                        mVar.A.setPadding(mVar.f12942z.getPaddingLeft(), mVar.f12942z.getPaddingTop(), mVar.f12942z.getPaddingRight(), mVar.f12942z.getPaddingBottom());
                        mVar.f12942z.setVisibility(8);
                    }
                }
            } else {
                window.findViewById(R.id.x5).setVisibility(8);
                mVar.f12942z.setVisibility(8);
                viewGroupC.setVisibility(8);
            }
        }
        boolean z10 = viewGroup.getVisibility() != 8;
        int i13 = (viewGroupC == null || viewGroupC.getVisibility() == 8) ? 0 : 1;
        boolean z11 = viewGroupC3.getVisibility() != 8;
        if (!z11 && (viewFindViewById = viewGroupC2.findViewById(R.id.w3)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i13 != 0) {
            NestedScrollView nestedScrollView2 = mVar.f12939w;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (mVar.f12922f == null && mVar.f12923g == null) ? view : viewGroupC.findViewById(R.id.x1);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupC2.findViewById(R.id.w4);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = mVar.f12923g;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z11 || i13 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i13 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f202a, alertController$RecycleListView.getPaddingRight(), z11 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f203b);
            }
        }
        if (!z10) {
            View view3 = mVar.f12923g;
            if (view3 == null) {
                view3 = mVar.f12939w;
            }
            if (view3 != null) {
                int i14 = (z11 ? 2 : 0) | i13;
                View viewFindViewById11 = window.findViewById(R.id.sb);
                View viewFindViewById12 = window.findViewById(R.id.sa);
                int i15 = Build.VERSION.SDK_INT;
                int i16 = 3;
                if (i15 >= 23) {
                    WeakHashMap weakHashMap = o0.v0.f16075a;
                    if (i15 >= 23) {
                        o0.k0.d(view3, i14, 3);
                    }
                    if (viewFindViewById11 != null) {
                        viewGroupC2.removeView(viewFindViewById11);
                    }
                    if (viewFindViewById12 != null) {
                        viewGroupC2.removeView(viewFindViewById12);
                    }
                } else {
                    if (viewFindViewById11 != null && (i14 & 1) == 0) {
                        viewGroupC2.removeView(viewFindViewById11);
                        viewFindViewById11 = view;
                    }
                    if (viewFindViewById12 == null || (i14 & 2) != 0) {
                        view2 = viewFindViewById12;
                    } else {
                        viewGroupC2.removeView(viewFindViewById12);
                        view2 = view;
                    }
                    if (viewFindViewById11 != null || view2 != null) {
                        if (mVar.f12922f != null) {
                            mVar.f12939w.setOnScrollChangeListener(new ur0(mVar, viewFindViewById11, view2, i16));
                            mVar.f12939w.post(new g(mVar, viewFindViewById11, view2, 0));
                        } else {
                            AlertController$RecycleListView alertController$RecycleListView2 = mVar.f12923g;
                            if (alertController$RecycleListView2 != null) {
                                alertController$RecycleListView2.setOnScrollListener(new h(viewFindViewById11, view2));
                                mVar.f12923g.post(new g(mVar, viewFindViewById11, view2, 1));
                            } else {
                                if (viewFindViewById11 != null) {
                                    viewGroupC2.removeView(viewFindViewById11);
                                }
                                if (view2 != null) {
                                    viewGroupC2.removeView(view2);
                                }
                            }
                        }
                    }
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView3 = mVar.f12923g;
        if (alertController$RecycleListView3 == null || (listAdapter = mVar.D) == null) {
            return;
        }
        alertController$RecycleListView3.setAdapter(listAdapter);
        int i17 = mVar.E;
        if (i17 > -1) {
            alertController$RecycleListView3.setItemChecked(i17, true);
            alertController$RecycleListView3.setSelection(i17);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f12945h.f12939w;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyDown(i10, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f12945h.f12939w;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyUp(i10, keyEvent);
        }
        return true;
    }

    @Override // f.m0, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m mVar = this.f12945h;
        mVar.f12921e = charSequence;
        TextView textView = mVar.A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
