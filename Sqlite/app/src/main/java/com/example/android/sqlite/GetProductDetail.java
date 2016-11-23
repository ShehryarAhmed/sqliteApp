package com.example.android.sqlite;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.android.sqlite.Database.ProductContract;
import com.example.android.sqlite.Database.Productdphelper;

/**
 * Created by android on 11/23/2016.
 */
public class GetProductDetail extends AppCompatActivity {

    private EditText mproduct_title ;

    private EditText mproduct_price ;

    private EditText mproduct_quantity ;

    private Button mproduct_Add_button;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.product_detail);

        mproduct_title = (EditText) findViewById(R.id.title);

        mproduct_quantity = (EditText) findViewById(R.id.quantity);

        mproduct_price = (EditText) findViewById(R.id.price);

        mproduct_Add_button = (Button) findViewById(R.id.add_button);

        mproduct_Add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertpet();
            }
        });

    }



    private void insertpet() {

        String titleString = mproduct_title.getText().toString().trim();

        String priceString = mproduct_price.getText().toString().trim();

        int priceint = Integer.parseInt(priceString);

        String quantityString = mproduct_quantity.getText().toString().trim();

        int quantityint = Integer.parseInt(quantityString);


        Productdphelper mpetDBhelper = new Productdphelper(this);

        SQLiteDatabase db = mpetDBhelper.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(ProductContract.ProductEntry.PRODUCT_TITLE, titleString);

        values.put(ProductContract.ProductEntry.PRODUCT_price, priceint);

        values.put(ProductContract.ProductEntry.PRODUCT_QUANTITY, quantityint);

        db.insert(ProductContract.ProductEntry.TABLE_NAME,null,values);

    }

    }
