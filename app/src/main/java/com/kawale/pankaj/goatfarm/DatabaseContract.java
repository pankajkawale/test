package com.kawale.pankaj.goatfarm;

import android.provider.BaseColumns;

/**
 * Created by pankaj on 9/11/2017.
 */

public final class DatabaseContract {
    private DatabaseContract(){}

    public static class Goat implements BaseColumns {
        public static final String TABLE_NAME = "goat";
        public static final String COLUMN_ID = "id";
        public static final String COLUMN_TYPE = "type";
        public static final String COLUMN_DATE_OF_BIRTH = "dateofbirth";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_FATHER = "father";
        public static final String COLUMN_MOTHER = "mother";
        public static final String COLUMN_DATE_OF_DEATH = "dateofdeath";
        public static final String COLUMN_COMMENTS = "comments";
        public static final String COLUMN_PHOTO = "photo";
    }

    public static class Transaction implements BaseColumns {
        public static final String TABLE_NAME = "transaction";
        public static final String COLUMN_ID = "id";
        public static final String COLUMN_TYPE = "type";
        public static final String COLUMN_DATE = "date";
        public static final String COLUMN_AMOUNT = "amount";
        public static final String COLUMN_COMMENT = "comment";
        public static final String COLUMN_DESCRIPTION = "description";
    }
}
