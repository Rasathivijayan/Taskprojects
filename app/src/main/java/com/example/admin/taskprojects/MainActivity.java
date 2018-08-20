package com.example.admin.taskprojects;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList mylist = new ArrayList<>();
    ArrayList mylist1 = new ArrayList<>();
    ArrayList alllist = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        mylist.add(5);

        mylist1.add(5);
        mylist1.add(4);
        mylist1.add(8);
        mylist1.add(9);
        mylist1.add(10);


//replace arraylist value
//        mylist.set(4,15);
////interchange value  arraylist
//       // Collections.swap(mylist,0,9);
////addtwo aray list
//        mylist.addAll(5,mylist1);
//        //alllist.addAll(mylist1);
//
//        //add array into arraylist
//        String[] strArr = {"natesh", "natesh"};
//        Collections.addAll(mylist, strArr);
//
//        Toast.makeText(this, ""+mylist, Toast.LENGTH_SHORT).show();

        // comare two arraylist value

        for (int i = 0; i < mylist.size(); i++) {

            for (int j = 0; j < mylist1.size(); j++) {

                if (mylist.get(i) == mylist1.get(j)) {


                    Toast.makeText(this, "" + mylist.get(i), Toast.LENGTH_SHORT).show();

                }


            }
        }
        }
}