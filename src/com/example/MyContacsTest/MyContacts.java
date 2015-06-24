package com.example.MyContacsTest;

import android.app.Application;
import com.example.MyContacsTest.data.Contact;

import java.util.ArrayList;

/**
 * Created by CRISTIANDANIEL on 6/24/2015.
 */
public class MyContacts extends Application {

    public ArrayList<Contact> myContacts;

    public MyContacts() { myContacts = new ArrayList<Contact>();}

    public Contact searchContactByName(String name)
    {
        Contact myContact = null;
        for(Contact contact : myContacts)
        {
            if(contact.getName()==name)
            {
                myContact = contact;
                break;
            }
        }
        return myContact;
    }

}
