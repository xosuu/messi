package com.balsikandar.crashreporter.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.activity.e;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import f.q;
import x2.d;
import xyz.easypro.httpcustom.R;
import y2.b;

/* JADX INFO: loaded from: classes.dex */
public class CrashReporterActivity extends q {
    public d G;
    public int H = 0;

    @Override // androidx.fragment.app.w, androidx.activity.i, androidx.core.app.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        setTheme(R.style.hb);
        super.onCreate(bundle);
        setContentView(R.layout.az);
        Toolbar toolbar = (Toolbar) findViewById(R.id.x8);
        toolbar.setTitle(getString(R.string.f8));
        t(toolbar);
        ViewPager viewPager = (ViewPager) findViewById(R.id.yg);
        if (viewPager != null) {
            d dVar = new d(this.A.d(), new String[]{getString(R.string.fa), getString(R.string.hs)});
            this.G = dVar;
            viewPager.setAdapter(dVar);
            viewPager.b(new b(this));
            Intent intent = getIntent();
            if (intent != null && !intent.getBooleanExtra("landing", false)) {
                this.H = 1;
            }
            viewPager.setCurrentItem(this.H);
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.c, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.h0) {
            return super.onOptionsItemSelected(menuItem);
        }
        new Thread(new e(15, this)).start();
        return true;
    }
}
