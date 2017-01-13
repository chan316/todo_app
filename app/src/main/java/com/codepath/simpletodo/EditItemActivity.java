package com.codepath.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    EditText editItems;
    int pos;
    final int SUCCESS_CODE = 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        String text = getIntent().getStringExtra("text");
        pos = getIntent().getIntExtra("pos", 0);

        editItems = (EditText) findViewById(R.id.editItems);

        editItems.setText(text);
        editItems.setSelection(text.length());
    }

    public void onSubmit(View v) {
        EditText editItem = (EditText) findViewById(R.id.editItems);

        Intent data = new Intent();

        data.putExtra("text", editItem.getText().toString());
        data.putExtra("pos",  pos);
        data.putExtra("code", SUCCESS_CODE);

        setResult(RESULT_OK, data);
        finish();
    }
}