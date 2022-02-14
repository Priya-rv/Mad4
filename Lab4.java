

package com.example.program3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void decrease(View v) {
    TextView tv = findViewById(R.id.textView);
    ProgressBar pb = findViewById(R.id.progressbarsimple);
    pb.incrementProgressBy(-10);
    int progress = pb.getProgress();
    tv.setText(progress + "%");}

    public void createDialogue(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Alert");
        builder.setMessage("Are you sure you want to close this alert dialogue");
        builder.setIcon(R.drawable.prog3);
        builder.setCancelable(false);
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),"You clicked No",Toast.LENGTH_LONG).show();
            }
        });
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),"You clicked yes",Toast.LENGTH_LONG).show();
            }
        });
        builder.setNeutralButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "you clicked cancel", Toast.LENGTH_SHORT).show();
            }
        });
        builder.create().show();
    }

}
