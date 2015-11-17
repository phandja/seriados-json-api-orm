package com.test.treinamentomobile.seriados_api.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.test.treinamentomobile.seriados_api.model.TvShow;

import java.sql.SQLDataException;
import java.sql.SQLException;

/**
 * Created by treinamentomobile on 11/17/15.
 */
public class DatabaseHelper  extends OrmLiteSqliteOpenHelper {

    private static final String DATABASE_NAME = "database.db";
    private static final int DATABASE_VERSION = 1;

    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource){
        try{
            TableUtils.createTable(connectionSource, TvShow.class);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion){
        try {
            TableUtils.dropTable(connectionSource, TvShow.class, true);
        } catch (SQLException e){
            e.printStackTrace();
        }
        onCreate(database, connectionSource);
    }
}
