package design.example.ngondo.versionview;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.TextView;
/*
* Class that extends textview and customizes it.
* Used mainly to modularize your code if you find yourself repeating the same
* code in textViews multiple times
* */
public class VersionView extends TextView {
    //Can create it in Java
    public VersionView(Context context) {
        super(context);
        setVersion();
    }
    //Can create it in XML
    public VersionView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setVersion();
    }
    //can create view in xml with a specific style
    public VersionView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setVersion();
    }
    private void setVersion(){
        //get the package name of the app
        try {
            PackageInfo packageInfo = getContext().getPackageManager().getPackageInfo(
                    getContext().getPackageName(), 0
            );
            setText(packageInfo.versionName);
        } catch (PackageManager.NameNotFoundException e) {
        }
        //Confirm functionality by changing bg
//        setBackgroundColor(Color.RED);
    }
}
