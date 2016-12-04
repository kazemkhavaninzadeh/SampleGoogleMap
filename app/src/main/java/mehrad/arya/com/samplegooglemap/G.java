package mehrad.arya.com.samplegooglemap;

import android.app.Application;
import android.content.Context;
import android.location.LocationManager;

/**
 * Created by Mehrad on 12/3/2016.
 */

public class G extends Application {
    public static LocationManager locationManager;

    @Override
    public void onCreate() {
        super.onCreate();

        locationManager= (LocationManager) getSystemService(Context.LOCATION_SERVICE);
    }
}
