package design.example.ngondo.versionview;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by ngondo on 4/7/16.
 */
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
        try {
            PackageInfo packageInfo = getContext().getPackageManager().getPackageInfo(
                    getContext().getPackageName(), 0
            );
            setText(packageInfo.versionName);
        } catch (PackageManager.NameNotFoundException e) {
        }

    }
}
