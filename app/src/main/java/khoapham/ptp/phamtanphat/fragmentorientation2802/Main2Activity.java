package khoapham.ptp.phamtanphat.fragmentorientation2802;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        FragmentChitiet fragmentChitiet = (FragmentChitiet) getSupportFragmentManager().findFragmentById(R.id.fragmentChitietPort);
        if (fragmentChitiet!= null){
            Intent intent = getIntent();
            if (intent != null){
                String dulieu = intent.getStringExtra("chuoi");
                fragmentChitiet.datarecive(dulieu);
            }
        }
    }
}
