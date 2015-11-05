package com.islarf6546.gmail.databaselab;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.sql.SQLException;

/**
 * Created by YamiVegeta on 29/10/2015.
 */
public class SampleDBManager {

    //useful to setup DB info here as attributes of the class e.g. DB name, various column names, create
        //statement etc. so that you can avoid having them hardcoded in to your create table statement.

    //eg.

    public static final String KEY_ROWID = "_id"; //typical first column in an SQLLiteDB
    public static final String KEY_TASKNAME = "taskName"; //sample column - could be anything
    public static final String KEY_TASKDESC = "taskDesc";
    public static final String KEY_TASKSTATUS = "taskStatus";
    //etc... remainder of columns in DB table
    private static final String DATABASE_NAME = "Tasks";
    private static final String TABLE_NAME = "TaskList";

    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_CREATE = "create table "+TABLE_NAME+"(" +
            KEY_ROWID + " integer primary key autoincrement, " +
            KEY_TASKNAME + " text not null, " +
            KEY_TASKDESC + " text not null, " +
            KEY_TASKSTATUS + " integer" +
            ")";
                //whatever other field wanted

    //other attributes
    private final Context context;
    private MyDatabaseHelper DBHelper;
    private SQLiteDatabase db;

    public SampleDBManager(Context ctx)  {
        this.context = ctx;
        DBHelper = new MyDatabaseHelper(context);
    }

    private static class MyDatabaseHelper extends SQLiteOpenHelper  {
        MyDatabaseHelper(Context context)  {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db)  {
            db.execSQL(DATABASE_CREATE);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)  {
            //exec sql to update database structure, if relevant .i.e. db.execSQL()
        }//end inner class
    }


    //open and close
    public SampleDBManager open() throws SQLException {
        db = DBHelper.getWritableDatabase();
        return this;
    }


    public void close()  {
        DBHelper.close();
    }

    //insert this and insert any
    public long insertThis(String[] data)  {
        ContentValues insertVals = new ContentValues();
        //ROWID, TASKNAME, TASKDESC, TASKSTATUS
        int i=0;
        insertVals.put(KEY_TASKNAME, data[i++]);
        insertVals.put(KEY_TASKDESC, data[i++]);
        insertVals.put(KEY_TASKSTATUS, Integer.valueOf(data[i]));

        return db.insert(TABLE_NAME, null, insertVals);
    }

    //Sample method for using the database
    public long insertAny(String THIS_TABLE, String[] columns, String[] values)  {
        ContentValues initialValues = new ContentValues();

        for(int i=0; i<columns.length; i++)  {
            initialValues.put(columns[i], values[i]);
        }

        return db.insert(THIS_TABLE, null, initialValues);
    }


    public Cursor selectSomething(String DATABASE_TABLE, long rowId) throws SQLException  {
        Cursor mCursor = db.query(
                true, DATABASE_TABLE,
                new String[]  {
                        KEY_ROWID,
                        //KEY_FIRSTNAME
                }, KEY_ROWID + "=" + rowId, null, null, null, null, null);

        return mCursor;
    }

    public Cursor getSomeThing(String DATABASE_TABLE, long rowId) throws SQLException  {
        Cursor mCursor = db.query(true, DATABASE_TABLE, new String[]{
                KEY_ROWID,
                //KEY_FIRSTNAME
        }, KEY_ROWID + "=" + rowId, null, null, null, null, null);
        if(mCursor != null) {
            mCursor.moveToFirst();
        }
        return mCursor;
    }
}

/*

public void insertThis(String column, String data)  {
        String insString = "insert into "+ TABLE_NAME +
                "("+column+")" +
                "values("+
                data;
    }
    public void insertRow(String[] columns, String[] data)  {
        String insString = "insert into " + TABLE_NAME + "(";

        for(int i=0; i<columns.length; i++)  {

            insString += columns[i];
            if(i< columns.length-1)  {
                insString += ",";
            }
            else  {
                insString += ")";
            }
        }
        insString += "values (";
        for(int i=0; i<data.length; i++)  {
            insString += data[i];
            if(i< columns.length-1)  {
                insString += ",";
            }
            else  {
                insString += ")";
            }
        }
    }
 */
