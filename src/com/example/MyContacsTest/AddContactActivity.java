package com.example.MyContacsTest;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.example.MyContacsTest.data.Contact;

/**
 * Created by CRISTIANDANIEL on 6/24/2015.
 */
public class AddContactActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void addContact(View view)
    {
        Context context = getApplicationContext();
        Toast toast;
        EditText nameField = (EditText) findViewById(R.id.editText);
        EditText emailField = (EditText) findViewById(R.id.editText2);
        EditText phoneField = (EditText) findViewById(R.id.editText3);
        EditText addressField = (EditText) findViewById(R.id.editText4);
        Contact newContact = new Contact(nameField.getText().toString(),
                emailField.getText().toString(),
                Long.parseLong(phoneField.getText().toString()),
                addressField.getText().toString());
        ((MyContacts) getApplicationContext()).myContacts.add(newContact);
        toast = Toast.makeText(context, getString(R.string.added_message), Toast.LENGTH_SHORT);
        toast.show();
    }
}