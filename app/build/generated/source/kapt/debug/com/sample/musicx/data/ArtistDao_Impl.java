package com.sample.musicx.data;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.sample.musicx.model.Artist;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ArtistDao_Impl implements ArtistDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Artist> __insertionAdapterOfArtist;

  private final EntityDeletionOrUpdateAdapter<Artist> __deletionAdapterOfArtist;

  private final EntityDeletionOrUpdateAdapter<Artist> __updateAdapterOfArtist;

  public ArtistDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfArtist = new EntityInsertionAdapter<Artist>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `artists` (`id`,`name`,`photo`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Artist value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getPhoto() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPhoto());
        }
      }
    };
    this.__deletionAdapterOfArtist = new EntityDeletionOrUpdateAdapter<Artist>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `artists` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Artist value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfArtist = new EntityDeletionOrUpdateAdapter<Artist>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `artists` SET `id` = ?,`name` = ?,`photo` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Artist value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getPhoto() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPhoto());
        }
        if (value.getId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getId());
        }
      }
    };
  }

  @Override
  public long insert(final Artist t) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfArtist.insertAndReturnId(t);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> insertAll(final List<? extends Artist> ts) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfArtist.insertAndReturnIdsList(ts);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final Artist t) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfArtist.handle(t);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Artist t) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfArtist.handle(t);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<Artist>> getArtists() {
    final String _sql = "SELECT * FROM artists ORDER BY name";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"artists"}, false, new Callable<List<Artist>>() {
      @Override
      public List<Artist> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfPhoto = CursorUtil.getColumnIndexOrThrow(_cursor, "photo");
          final List<Artist> _result = new ArrayList<Artist>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Artist _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpPhoto;
            _tmpPhoto = _cursor.getString(_cursorIndexOfPhoto);
            _item = new Artist(_tmpId,_tmpName,_tmpPhoto);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
