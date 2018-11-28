package app.traveler.com.travelerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.widget.LoginButton;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        final LoginButton fbLoginButton = (LoginButton) findViewById(R.id.login_button);
        fbLoginButton.setBackgroundResource(R.drawable.facebook);
        fbLoginButton.setCompoundDrawablesWithIntrinsicBounds(0,0,0,0);
    }
}
