package com.example.android.sqlite.Model;

    /**
     * Created by android on 11/24/2016.
     */
    public class ProductDetail {

        private String mproduct_title;

        private int mproduct_quantity;

        private int mproduct_price;

        public ProductDetail(){

        }
        public ProductDetail(String mproduct_title, int mproduct_quantity, int mproduct_price) {
            this.mproduct_title = mproduct_title;
            this.mproduct_quantity = mproduct_quantity;
            this.mproduct_price = mproduct_price;
        }

        public String getMproduct_title() {
            return mproduct_title;
        }

        public int getMproduct_quantity() {
            return mproduct_quantity;
        }

        public int getMproduct_price() {
            return mproduct_price;
        }
    }



