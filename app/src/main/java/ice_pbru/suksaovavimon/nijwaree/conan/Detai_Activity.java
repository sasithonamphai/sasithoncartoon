package ice_pbru.suksaovavimon.nijwaree.conan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detai_Activity extends AppCompatActivity {

    private TextView tittleTextView, dettaiTextView;
    private ImageView trafficImageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detai_);


        //Bind widget
        bindWidget();

        //show View
        showView();



    }//main method

    private void showView() {
        String strTitel = getIntent().getStringExtra("Title");
        int intIcon = getIntent().getIntExtra("Image", R.drawable.a);
        int intIndex = getIntent().getIntExtra("Index", 0);

        tittleTextView.setText(strTitel);
        trafficImageView.setImageResource(intIcon);

        String[] strDetail = getResources().getStringArray(R.array.cratoon_detail
        );
        dettaiTextView.setText(strDetail[intIndex]);



    }

    private void bindWidget() {
        tittleTextView = (TextView) findViewById(R.id.textView4);
        dettaiTextView = (TextView) findViewById(R.id.textView5);
        trafficImageView = (ImageView) findViewById(R.id.imageView2);


    }
}//main Class
