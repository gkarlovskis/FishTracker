package lv.example.gka.fishtracker.main;

import android.content.Context;
import android.view.View;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

/**
 * Local unit test for the Main Presenter.
 */
public class MainPresenterTest extends View {
    @Mock
    private MainContract.MvpView mView;
    private MainPresenter mPresenter;

    public MainPresenterTest(Context context) {
        super(context);
    }


    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        mPresenter = new MainPresenter(mView);
    }

    @Test
    public void handleSignInButtonClick() {
        mPresenter.handleSignInButtonClick(this);
        verify(mView).showSignInScreen();
    }

    @Test
    public void handleSignUpButtonClick() {
        mPresenter.handleSignUpButtonClick(this);
        verify(mView).showSignUpScreen();
    }
}