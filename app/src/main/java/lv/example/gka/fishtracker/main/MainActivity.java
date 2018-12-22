package lv.example.gka.fishtracker.main;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import lv.example.gka.fishtracker.R;
import lv.example.gka.fishtracker.databinding.MainActivityBinding;

/**
 * Displays the Main screen.
 */
public class MainActivity extends AppCompatActivity implements MainContract.MvpView {

    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main_activity);
        MainActivityBinding binding = DataBindingUtil.setContentView(this,R.layout.main_activity);
        mPresenter = new MainPresenter(this);
        binding.setPresenter(mPresenter);



    }

    // MvpView methods //
    @Override
    public void showSignInScreen() {
        Toast.makeText(this, "Taking user to the Sign in screen", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showSignUpScreen() {
        Toast.makeText(this, "Taking user to the Sign Up screen", Toast.LENGTH_LONG).show();
    }
}
