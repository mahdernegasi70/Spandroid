package spandroid.dev.designPartern.mvvm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import spandroid.dev.R;

public class MvvmActivity extends AppCompatActivity {

    // https://github.com/manuelvicnt/RxJava2-MVVM-Android-Structure


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvvm);
    }
}
