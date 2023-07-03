package it.ninniuz.android.sentry.cc.instrumentation

import androidx.sqlite.db.SupportSQLiteOpenHelper

class FakeSqliteOpenHelperFactory : SupportSQLiteOpenHelper.Factory {
    override fun create(configuration: SupportSQLiteOpenHelper.Configuration): SupportSQLiteOpenHelper {
        TODO("Not yet implemented")
    }
}