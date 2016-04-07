package design.example.ngondo.versionview;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*
        * For one to use the custom view in java, simply just pass an object of the class
        * to the 'setContentView()' method.        *
        * */
//        VersionView versionView = new VersionView(this);
        setContentView(R.layout.activity_main);
    }
}
