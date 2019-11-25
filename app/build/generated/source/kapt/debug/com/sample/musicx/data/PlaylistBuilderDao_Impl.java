package com.sample.musicx.data;

import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.sample.musicx.model.PlaylistBuilder;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PlaylistBuilderDao_Impl implements PlaylistBuilderDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PlaylistBuilder> __insertionAdapterOfPlaylistBuilder;

  private final EntityDeletionOrUpdateAdapter<PlaylistBuilder> __deletionAdapterOfPlaylistBuilder;

  private final EntityDeletionOrUpdateAdapter<PlaylistBuilder> __updateAdapterOfPlaylistBuilder;

  public PlaylistBuilderDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPlaylistBuilder = new EntityInsertionAdapter<PlaylistBuilder>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `playlist_build` (`id`,`playlistId`,`trackId`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PlaylistBuilder value) {
        stmt.bindLong(1, value.getId());
        if (value.getPlaylistId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPlaylistId());
        }
        if (value.getTrackId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTrackId());
        }
      }
    };
    this.__deletionAdapterOfPlaylistBuilder = new EntityDeletionOrUpdateAdapter<PlaylistBuilder>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `playlist_build` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PlaylistBuilder value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfPlaylistBuilder = new EntityDeletionOrUpdateAdapter<PlaylistBuilder>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `playlist_build` SET `id` = ?,`playlistId` = ?,`trackId` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PlaylistBuilder value) {
        stmt.bindLong(1, value.getId());
        if (value.getPlaylistId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPlaylistId());
        }
        if (value.getTrackId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTrackId());
        }
        stmt.bindLong(4, value.getId());
      }
    };
  }

  @Override
  public long insert(final PlaylistBuilder t) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfPlaylistBuilder.insertAndReturnId(t);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> insertAll(final List<? extends PlaylistBuilder> ts) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfPlaylistBuilder.insertAndReturnIdsList(ts);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final PlaylistBuilder t) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfPlaylistBuilder.handle(t);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final PlaylistBuilder t) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfPlaylistBuilder.handle(t);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }
}
