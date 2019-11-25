package com.sample.musicx.data;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile AlbumDao _albumDao;

  private volatile ArtistDao _artistDao;

  private volatile TrackDao _trackDao;

  private volatile TrackEmbeddedDao _trackEmbeddedDao;

  private volatile PlaylistDao _playlistDao;

  private volatile PlaylistBuilderDao _playlistBuilderDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `albums` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `image` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `artists` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `photo` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `playlists` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `image` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `tracks` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `albumId` TEXT NOT NULL, `artistId` TEXT NOT NULL, `source` TEXT NOT NULL, `duration` INTEGER NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`albumId`) REFERENCES `albums`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`artistId`) REFERENCES `artists`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `playlist_build` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `playlistId` TEXT NOT NULL, `trackId` TEXT NOT NULL, FOREIGN KEY(`playlistId`) REFERENCES `playlists`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`trackId`) REFERENCES `tracks`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_playlist_build_trackId_playlistId` ON `playlist_build` (`trackId`, `playlistId`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1ad25fccc635d2b1fa4d4b0ca9a001a0')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `albums`");
        _db.execSQL("DROP TABLE IF EXISTS `artists`");
        _db.execSQL("DROP TABLE IF EXISTS `playlists`");
        _db.execSQL("DROP TABLE IF EXISTS `tracks`");
        _db.execSQL("DROP TABLE IF EXISTS `playlist_build`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsAlbums = new HashMap<String, TableInfo.Column>(3);
        _columnsAlbums.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlbums.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlbums.put("image", new TableInfo.Column("image", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAlbums = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAlbums = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAlbums = new TableInfo("albums", _columnsAlbums, _foreignKeysAlbums, _indicesAlbums);
        final TableInfo _existingAlbums = TableInfo.read(_db, "albums");
        if (! _infoAlbums.equals(_existingAlbums)) {
          return new RoomOpenHelper.ValidationResult(false, "albums(com.sample.musicx.model.Album).\n"
                  + " Expected:\n" + _infoAlbums + "\n"
                  + " Found:\n" + _existingAlbums);
        }
        final HashMap<String, TableInfo.Column> _columnsArtists = new HashMap<String, TableInfo.Column>(3);
        _columnsArtists.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArtists.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArtists.put("photo", new TableInfo.Column("photo", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysArtists = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesArtists = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoArtists = new TableInfo("artists", _columnsArtists, _foreignKeysArtists, _indicesArtists);
        final TableInfo _existingArtists = TableInfo.read(_db, "artists");
        if (! _infoArtists.equals(_existingArtists)) {
          return new RoomOpenHelper.ValidationResult(false, "artists(com.sample.musicx.model.Artist).\n"
                  + " Expected:\n" + _infoArtists + "\n"
                  + " Found:\n" + _existingArtists);
        }
        final HashMap<String, TableInfo.Column> _columnsPlaylists = new HashMap<String, TableInfo.Column>(4);
        _columnsPlaylists.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlaylists.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlaylists.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlaylists.put("image", new TableInfo.Column("image", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPlaylists = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPlaylists = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPlaylists = new TableInfo("playlists", _columnsPlaylists, _foreignKeysPlaylists, _indicesPlaylists);
        final TableInfo _existingPlaylists = TableInfo.read(_db, "playlists");
        if (! _infoPlaylists.equals(_existingPlaylists)) {
          return new RoomOpenHelper.ValidationResult(false, "playlists(com.sample.musicx.model.Playlist).\n"
                  + " Expected:\n" + _infoPlaylists + "\n"
                  + " Found:\n" + _existingPlaylists);
        }
        final HashMap<String, TableInfo.Column> _columnsTracks = new HashMap<String, TableInfo.Column>(6);
        _columnsTracks.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTracks.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTracks.put("albumId", new TableInfo.Column("albumId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTracks.put("artistId", new TableInfo.Column("artistId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTracks.put("source", new TableInfo.Column("source", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTracks.put("duration", new TableInfo.Column("duration", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTracks = new HashSet<TableInfo.ForeignKey>(2);
        _foreignKeysTracks.add(new TableInfo.ForeignKey("albums", "CASCADE", "NO ACTION",Arrays.asList("albumId"), Arrays.asList("id")));
        _foreignKeysTracks.add(new TableInfo.ForeignKey("artists", "CASCADE", "NO ACTION",Arrays.asList("artistId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesTracks = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTracks = new TableInfo("tracks", _columnsTracks, _foreignKeysTracks, _indicesTracks);
        final TableInfo _existingTracks = TableInfo.read(_db, "tracks");
        if (! _infoTracks.equals(_existingTracks)) {
          return new RoomOpenHelper.ValidationResult(false, "tracks(com.sample.musicx.model.Track).\n"
                  + " Expected:\n" + _infoTracks + "\n"
                  + " Found:\n" + _existingTracks);
        }
        final HashMap<String, TableInfo.Column> _columnsPlaylistBuild = new HashMap<String, TableInfo.Column>(3);
        _columnsPlaylistBuild.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlaylistBuild.put("playlistId", new TableInfo.Column("playlistId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlaylistBuild.put("trackId", new TableInfo.Column("trackId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPlaylistBuild = new HashSet<TableInfo.ForeignKey>(2);
        _foreignKeysPlaylistBuild.add(new TableInfo.ForeignKey("playlists", "CASCADE", "NO ACTION",Arrays.asList("playlistId"), Arrays.asList("id")));
        _foreignKeysPlaylistBuild.add(new TableInfo.ForeignKey("tracks", "CASCADE", "NO ACTION",Arrays.asList("trackId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesPlaylistBuild = new HashSet<TableInfo.Index>(1);
        _indicesPlaylistBuild.add(new TableInfo.Index("index_playlist_build_trackId_playlistId", true, Arrays.asList("trackId","playlistId")));
        final TableInfo _infoPlaylistBuild = new TableInfo("playlist_build", _columnsPlaylistBuild, _foreignKeysPlaylistBuild, _indicesPlaylistBuild);
        final TableInfo _existingPlaylistBuild = TableInfo.read(_db, "playlist_build");
        if (! _infoPlaylistBuild.equals(_existingPlaylistBuild)) {
          return new RoomOpenHelper.ValidationResult(false, "playlist_build(com.sample.musicx.model.PlaylistBuilder).\n"
                  + " Expected:\n" + _infoPlaylistBuild + "\n"
                  + " Found:\n" + _existingPlaylistBuild);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "1ad25fccc635d2b1fa4d4b0ca9a001a0", "9ed4c5b99a020edfd9a455a3294045c2");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "albums","artists","playlists","tracks","playlist_build");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `albums`");
      _db.execSQL("DELETE FROM `artists`");
      _db.execSQL("DELETE FROM `playlists`");
      _db.execSQL("DELETE FROM `tracks`");
      _db.execSQL("DELETE FROM `playlist_build`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public AlbumDao albumDao() {
    if (_albumDao != null) {
      return _albumDao;
    } else {
      synchronized(this) {
        if(_albumDao == null) {
          _albumDao = new AlbumDao_Impl(this);
        }
        return _albumDao;
      }
    }
  }

  @Override
  public ArtistDao artistDao() {
    if (_artistDao != null) {
      return _artistDao;
    } else {
      synchronized(this) {
        if(_artistDao == null) {
          _artistDao = new ArtistDao_Impl(this);
        }
        return _artistDao;
      }
    }
  }

  @Override
  public TrackDao trackDao() {
    if (_trackDao != null) {
      return _trackDao;
    } else {
      synchronized(this) {
        if(_trackDao == null) {
          _trackDao = new TrackDao_Impl(this);
        }
        return _trackDao;
      }
    }
  }

  @Override
  public TrackEmbeddedDao trackEmbeddedDao() {
    if (_trackEmbeddedDao != null) {
      return _trackEmbeddedDao;
    } else {
      synchronized(this) {
        if(_trackEmbeddedDao == null) {
          _trackEmbeddedDao = new TrackEmbeddedDao_Impl(this);
        }
        return _trackEmbeddedDao;
      }
    }
  }

  @Override
  public PlaylistDao playlistDao() {
    if (_playlistDao != null) {
      return _playlistDao;
    } else {
      synchronized(this) {
        if(_playlistDao == null) {
          _playlistDao = new PlaylistDao_Impl(this);
        }
        return _playlistDao;
      }
    }
  }

  @Override
  public PlaylistBuilderDao playlistBuilderDao() {
    if (_playlistBuilderDao != null) {
      return _playlistBuilderDao;
    } else {
      synchronized(this) {
        if(_playlistBuilderDao == null) {
          _playlistBuilderDao = new PlaylistBuilderDao_Impl(this);
        }
        return _playlistBuilderDao;
      }
    }
  }
}
