package sg.edu.np.mad.exercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn;
    boolean flag;
    User user = new User("Guest","What am i even doing with my life oh god please help me everything hurts",1,true);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.Follow);
        btn.setOnClickListener(this);

        TextView hello = findViewById(R.id.Hello);
        hello.setText("Hello" + user.Name);

        TextView desc = findViewById(R.id.desc);
        desc.setText((user.Description));
        flag = true;
    }
    public void onClick(View v){
        if (user.Followed){
            btn.setText("Unfollow");
            user.Followed = false;
        }
        else{
            btn.setText("Follow");
            user.Followed = true;
        }
    }
}