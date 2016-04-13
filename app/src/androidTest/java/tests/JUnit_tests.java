package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.elchen.myapplication.MainActivity;
import com.example.elchen.myapplication.R;

/**
 * Created by elchen on 4/13/2016.
 */
public class JUnit_tests extends ActivityInstrumentationTestCase2<MainActivity>{
    MainActivity mainActivity;
    public JUnit_tests () {
        super(MainActivity.class);
    }

    public void test_first() {
        mainActivity = getActivity();

        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String test = textView.getText().toString();

        assertEquals("Bye World!", test);
    }
}
