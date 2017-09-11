package com.kawale.pankaj.goatfarm;

import android.provider.BaseColumns;

/**
 * Created by pankaj on 9/11/2017.
 */

public final class DatabaseContract {
    private DatabaseContract(){}

    public static class Goat implements BaseColumns {
        public static final String TABLE_NAME = "goat";
        public static final String COLUMN_NAME_TYPE = "type";
        public static final String COLUMN_NAME_DATE_OF_BIRTH = "dateofbirth";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_FATHER = "father";
        public static final String COLUMN_MOTHER = "mother";
        public static final String COLUMN_DATE_OF_DEATH = "dateofdeath";
        public static final String COLUMN_COMMENTS = "comments";

    }

    public static class Transaction implements BaseColumns {
        public static final String TABLE_NAME = "transaction";
        public static final String COLUMN_NAME_TYPE = "type";
        public static final String COLUMN_NAME_DATE = "date";
        public static final String COLUMN_NAME_AMOUNT = "amount";
        public static final String COLUMN_NAME_COMMENT = "comment";
        public static final String COLUMN_NAME_DESCRIPTION = "description";
    }
}
