package com.sample.musicx.data;

import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.sample.musicx.model.Track;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TrackDao_Impl implements TrackDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Track> __insertionAdapterOfTrack;

  private final EntityDeletionOrUpdateAdapter<Track> __deletionAdapterOfTrack;

  private final EntityDeletionOrUpdateAdapter<Track> __updateAdapterOfTrack;

  public TrackDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTrack = new EntityInsertionAdapter<Track>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `tracks` (`id`,`title`,`albumId`,`artistId`,`source`,`duration`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Track value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getAlbumId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAlbumId());
        }
        if (value.getArtistId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getArtistId());
        }
        if (value.getSource() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getSource());
        }
        stmt.bindLong(6, value.getDuration());
      }
    };
    this.__deletionAdapterOfTrack = new EntityDeletionOrUpdateAdapter<Track>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `tracks` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Track value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfTrack = new EntityDeletionOrUpdateAdapter<Track>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `tracks` SET `id` = ?,`title` = ?,`albumId` = ?,`artistId` = ?,`source` = ?,`duration` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Track value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getAlbumId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAlbumId());
        }
        if (value.getArtistId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getArtistId());
        }
        if (value.getSource() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getSource());
        }
        stmt.bindLong(6, value.getDuration());
        if (value.getId() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getId());
        }
      }
    };
  }

  @Override
  public long insert(final Track t) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfTrack.insertAndReturnId(t);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> insertAll(final List<? extends Track> ts) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfTrack.insertAndReturnIdsList(ts);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final Track t) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfTrack.handle(t);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Track t) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfTrack.handle(t);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }
}
