package com.example.android.sqlite.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by android on 11/22/2016.
 */
public class Productdphelper extends SQLiteOpenHelper {

    private static final String DATA_BASE = "Product.dp";

    private static final int DATABASE_VERSION = 1;

    public Productdphelper(Context context){
        super(context,DATA_BASE,null,DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String  CREATE_PRODUCT_TABLE = "CREATE TABLE "+ProductContract.ProductEntry.TABLE_NAME+" ("
                +ProductContract.ProductEntry.PRODUCT_TITLE + " TEXT NOT NULL"
                +ProductContract.ProductEntry.PRODUCT_price + " INTEGER NOT NULL"
                +ProductContract.ProductEntry.PRODUCT_QUANTITY + " INTEGER NOT NULL";

        // Execute the SQL statement

        sqLiteDatabase.execSQL(CREATE_PRODUCT_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
