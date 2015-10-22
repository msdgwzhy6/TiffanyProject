package logdemo.wjj.com.Tiffany.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import logdemo.wjj.com.Tiffany.Anim.GuillotineAnimation;
import logdemo.wjj.com.Tiffany.R;
import logdemo.wjj.com.Tiffany.Utils.BaseActivity;

public class HomePage extends AppCompatActivity {
    private static final long RIPPLE_DURATION = 250;
    final static String TAG = HomePage.class.getName() + ".TAG";

    private Toolbar toolbar;
    private FrameLayout root;
    private View contentHamburger;
    private View guillotineMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        init();

        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle(null);
        }

        guillotineMenu = LayoutInflater.from(this).inflate(R.layout.home_menu, null);
        root.addView(guillotineMenu);

        new GuillotineAnimation.GuillotineBuilder(guillotineMenu, guillotineMenu.findViewById(R.id.guillotine_hamburger), contentHamburger)
                .setStartDelay(RIPPLE_DURATION)
                .setActionBarViewForAnimation(toolbar)
                .setClosedOnStart(true)
                .build();
    }

    private void init() {
        root = (FrameLayout) findViewById(R.id.root);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        contentHamburger=(ImageView)findViewById(R.id.content_hamburger);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
