package kr.hs.emirim.dodo1305.dialogtest;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    String[] itemArr={"민병헌","김재환","김재호","류지혁"};
    Button butDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butDialog=(Button)findViewById(R.id.but_dialog);
        butDialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        AlertDialog.Builder diglog = new AlertDialog.Builder(this);
        diglog.setTitle("First Dialog");
        diglog.setIcon(R.drawable.icebear);
        diglog.setItems(itemArr, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                butDialog.setText(itemArr[i]);
            }
        });
        //   diglog.setMessage("Message Here");

        diglog.setPositiveButton("OK", null);
        diglog.show();
    }
}
