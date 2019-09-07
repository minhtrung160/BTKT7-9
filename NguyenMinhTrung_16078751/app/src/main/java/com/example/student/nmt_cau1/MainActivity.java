package com.example.student.nmt_cau1;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText tk, mk;
    Button dn,thoat;
    CheckBox chek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tk = (EditText)findViewById(R.id.edt_tk);
        mk = (EditText)findViewById(R.id.edt_mk);
        dn = (Button)findViewById(R.id.btn_dn);
        thoat = (Button)findViewById(R.id.btn_thoat);
        chek = (CheckBox)findViewById(R.id.check);

        dn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(chek.isChecked()){
                    Toast.makeText(MainActivity.this,"Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(MainActivity.this,"Chào mừng bạn đăng nhập hệ thống, thông tin của bạn chưa được lưu",Toast.LENGTH_LONG).show();
                }
            }
        });
        thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setMessage(getResources().getString(R.string.message_dialog_exit));
                builder.setTitle(getResources().getString(R.string.message_dialog_exit_title));
                builder.setIcon(android.R.drawable.ic_dialog_alert);
                builder.setPositiveButton(getResources().getString(R.string.message_dialog_ok), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        finish();
                    }
                });
                builder.setNegativeButton(getResources().getString(R.string.message_dialog_cancel), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();


            }
        });


    }
}
