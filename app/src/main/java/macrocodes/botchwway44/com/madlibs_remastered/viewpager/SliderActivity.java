package macrocodes.botchwway44.com.madlibs_remastered.viewpager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import macrocodes.botchwway44.com.madlibs_remastered.R;

public class SliderActivity extends AppCompatActivity {
    private androidx.viewpager.widget.ViewPager viewPager;
    private Slider slider;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);

        getSupportActionBar().hide();

        viewPager = findViewById(R.id.animation_view);
        slider = new Slider(this);
        viewPager.setAdapter(slider);
    }
}
