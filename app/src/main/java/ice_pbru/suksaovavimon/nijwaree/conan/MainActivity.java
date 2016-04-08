package ice_pbru.suksaovavimon.nijwaree.conan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    // Explicit
    private Button button;
    private ListView conanListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Bind Widget
        bindwidget();


        buttoncon();

        createListView();







    }// Main Method

    private void createListView() {


        final int[] intIcon = {R.drawable.a, R.drawable.bn, R.drawable.d, R.drawable.eeyoretail,
                R.drawable.f, R.drawable.gian, R.drawable.hu, R.drawable.k, R.drawable.kk,
                R.drawable.main, R.drawable.minnie_mouse, R.drawable.stickerline, R.drawable.twiligh,
                R.drawable.p, R.drawable.mk, R.drawable.naruto, R.drawable.eeyoretail, R.drawable.rttrt,
                R.drawable.v,R.drawable.pic};

        final String[] titStrings = new String[20];
        titStrings[0] = "เควิล";
        titStrings[1] = "ซึเนโอะ";
        titStrings[2] = "พิกเล็ต";
        titStrings[3] = "อียอ";
        titStrings[4] = "มังกี่ ดี ลูฟี่";
        titStrings[5] = "ไจแอนท์";
        titStrings[6] = "kiiroitori";
        titStrings[7] = "ชิซุกะ";
        titStrings[8] = "ชาวเดอร์";
        titStrings[9] = "วินนี่ เดอะ พูห์";
        titStrings[10] = "มินนี่ เม้าส์";
        titStrings[11] = "โทนี โทนี่ ช๊อปเปอร์";
        titStrings[12] = "ทไวไลท์ สปาร์คเคิล";
        titStrings[13] = "โนบิตะ";
        titStrings[14] = "ษษ์";
        titStrings[15] = "นารูโตะ";
        titStrings[16] = "Rava";
        titStrings[17] = "โดราเอมอน";
        titStrings[18] = "มิคกี้ เมาส์";
        titStrings[19] = "ริลัคคุมะ";




        String[] detailStrings = getResources().getStringArray(R.array.detail_short);
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, intIcon, titStrings, detailStrings);
        conanListView.setAdapter(myAdapter);

    }


    private void buttoncon() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://fonaugust.wordpress.com/2014/05/21/"));

                startActivity(intent);

            }
        });

    }

    private void bindwidget() {
        button = (Button) findViewById(R.id.button);
        conanListView = (ListView) findViewById(R.id.listView);



    }
}// Main Class
