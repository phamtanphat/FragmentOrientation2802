package khoapham.ptp.phamtanphat.fragmentorientation2802;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Truyendulieu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    public void datarecive(String value) {
        FragmentChitiet fragmentChitiet = (FragmentChitiet) getSupportFragmentManager().findFragmentById(R.id.fragmentChitietLand);
        if (fragmentChitiet != null && fragmentChitiet.isInLayout()){
            fragmentChitiet.datarecive(value);
        }else{
            Intent intent= new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("chuoi",value);
            startActivity(intent);
        }
    }
}
