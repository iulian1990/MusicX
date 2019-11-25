package com.sample.musicx.data;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import com.sample.musicx.model.Album;
import com.sample.musicx.model.Artist;
import com.sample.musicx.model.TrackEmbedded;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TrackEmbeddedDao_Impl implements TrackEmbeddedDao {
  private final RoomDatabase __db;

  public TrackEmbeddedDao_Impl(RoomDatabase __db) {
    this.__db = __db;
  }

  @Override
  public LiveData<List<TrackEmbedded>> getTracks() {
    final String _sql = "SELECT tracks.id, tracks.title, albums.id as album_id, albums.title as album_title, albums.image as album_image, artists.id as artist_id, artists.name as artist_name, artists.photo as artist_photo, tracks.source, tracks.duration FROM tracks INNER JOIN albums ON tracks.albumId = albums.id INNER JOIN artists ON tracks.artistId = artists.id ORDER BY tracks.title";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"tracks","albums","artists"}, false, new Callable<List<TrackEmbedded>>() {
      @Override
      public List<TrackEmbedded> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfId_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "album_id");
          final int _cursorIndexOfTitle_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "album_title");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "album_image");
          final int _cursorIndexOfId_2 = CursorUtil.getColumnIndexOrThrow(_cursor, "artist_id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "artist_name");
          final int _cursorIndexOfPhoto = CursorUtil.getColumnIndexOrThrow(_cursor, "artist_photo");
          final int _cursorIndexOfSource = CursorUtil.getColumnIndexOrThrow(_cursor, "source");
          final int _cursorIndexOfDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "duration");
          final List<TrackEmbedded> _result = new ArrayList<TrackEmbedded>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TrackEmbedded _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpSource;
            _tmpSource = _cursor.getString(_cursorIndexOfSource);
            final long _tmpDuration;
            _tmpDuration = _cursor.getLong(_cursorIndexOfDuration);
            final Album _tmpAlbum;
            if (! (_cursor.isNull(_cursorIndexOfId_1) && _cursor.isNull(_cursorIndexOfTitle_1) && _cursor.isNull(_cursorIndexOfImage))) {
              final String _tmpId_1;
              _tmpId_1 = _cursor.getString(_cursorIndexOfId_1);
              final String _tmpTitle_1;
              _tmpTitle_1 = _cursor.getString(_cursorIndexOfTitle_1);
              final String _tmpImage;
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
              _tmpAlbum = new Album(_tmpId_1,_tmpTitle_1,_tmpImage);
            }  else  {
              _tmpAlbum = null;
            }
            final Artist _tmpArtist;
            if (! (_cursor.isNull(_cursorIndexOfId_2) && _cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfPhoto))) {
              final String _tmpId_2;
              _tmpId_2 = _cursor.getString(_cursorIndexOfId_2);
              final String _tmpName;
              _tmpName = _cursor.getString(_cursorIndexOfName);
              final String _tmpPhoto;
              _tmpPhoto = _cursor.getString(_cursorIndexOfPhoto);
              _tmpArtist = new Artist(_tmpId_2,_tmpName,_tmpPhoto);
            }  else  {
              _tmpArtist = null;
            }
            _item = new TrackEmbedded(_tmpId,_tmpTitle,_tmpAlbum,_tmpArtist,_tmpSource,_tmpDuration);
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

  @Override
  public LiveData<List<TrackEmbedded>> getTracksByArtistId(final String artistId) {
    final String _sql = "SELECT tracks.id, tracks.title, albums.id as album_id, albums.title as album_title, albums.image as album_image, artists.id as artist_id, artists.name as artist_name, artists.photo as artist_photo, tracks.source, tracks.duration FROM tracks INNER JOIN albums ON tracks.albumId = albums.id INNER JOIN artists ON tracks.artistId = artists.id WHERE tracks.artistId=? ORDER BY tracks.title";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (artistId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, artistId);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"tracks","albums","artists"}, false, new Callable<List<TrackEmbedded>>() {
      @Override
      public List<TrackEmbedded> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfId_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "album_id");
          final int _cursorIndexOfTitle_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "album_title");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "album_image");
          final int _cursorIndexOfId_2 = CursorUtil.getColumnIndexOrThrow(_cursor, "artist_id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "artist_name");
          final int _cursorIndexOfPhoto = CursorUtil.getColumnIndexOrThrow(_cursor, "artist_photo");
          final int _cursorIndexOfSource = CursorUtil.getColumnIndexOrThrow(_cursor, "source");
          final int _cursorIndexOfDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "duration");
          final List<TrackEmbedded> _result = new ArrayList<TrackEmbedded>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TrackEmbedded _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpSource;
            _tmpSource = _cursor.getString(_cursorIndexOfSource);
            final long _tmpDuration;
            _tmpDuration = _cursor.getLong(_cursorIndexOfDuration);
            final Album _tmpAlbum;
            if (! (_cursor.isNull(_cursorIndexOfId_1) && _cursor.isNull(_cursorIndexOfTitle_1) && _cursor.isNull(_cursorIndexOfImage))) {
              final String _tmpId_1;
              _tmpId_1 = _cursor.getString(_cursorIndexOfId_1);
              final String _tmpTitle_1;
              _tmpTitle_1 = _cursor.getString(_cursorIndexOfTitle_1);
              final String _tmpImage;
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
              _tmpAlbum = new Album(_tmpId_1,_tmpTitle_1,_tmpImage);
            }  else  {
              _tmpAlbum = null;
            }
            final Artist _tmpArtist;
            if (! (_cursor.isNull(_cursorIndexOfId_2) && _cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfPhoto))) {
              final String _tmpId_2;
              _tmpId_2 = _cursor.getString(_cursorIndexOfId_2);
              final String _tmpName;
              _tmpName = _cursor.getString(_cursorIndexOfName);
              final String _tmpPhoto;
              _tmpPhoto = _cursor.getString(_cursorIndexOfPhoto);
              _tmpArtist = new Artist(_tmpId_2,_tmpName,_tmpPhoto);
            }  else  {
              _tmpArtist = null;
            }
            _item = new TrackEmbedded(_tmpId,_tmpTitle,_tmpAlbum,_tmpArtist,_tmpSource,_tmpDuration);
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

  @Override
  public LiveData<List<TrackEmbedded>> getTracksByAlbumId(final String albumId) {
    final String _sql = "SELECT tracks.id, tracks.title, albums.id as album_id, albums.title as album_title, albums.image as album_image, artists.id as artist_id, artists.name as artist_name, artists.photo as artist_photo, tracks.source, tracks.duration FROM tracks INNER JOIN albums ON tracks.albumId = albums.id INNER JOIN artists ON tracks.artistId = artists.id WHERE tracks.albumId=? ORDER BY tracks.title";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (albumId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, albumId);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"tracks","albums","artists"}, false, new Callable<List<TrackEmbedded>>() {
      @Override
      public List<TrackEmbedded> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfId_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "album_id");
          final int _cursorIndexOfTitle_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "album_title");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "album_image");
          final int _cursorIndexOfId_2 = CursorUtil.getColumnIndexOrThrow(_cursor, "artist_id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "artist_name");
          final int _cursorIndexOfPhoto = CursorUtil.getColumnIndexOrThrow(_cursor, "artist_photo");
          final int _cursorIndexOfSource = CursorUtil.getColumnIndexOrThrow(_cursor, "source");
          final int _cursorIndexOfDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "duration");
          final List<TrackEmbedded> _result = new ArrayList<TrackEmbedded>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TrackEmbedded _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpSource;
            _tmpSource = _cursor.getString(_cursorIndexOfSource);
            final long _tmpDuration;
            _tmpDuration = _cursor.getLong(_cursorIndexOfDuration);
            final Album _tmpAlbum;
            if (! (_cursor.isNull(_cursorIndexOfId_1) && _cursor.isNull(_cursorIndexOfTitle_1) && _cursor.isNull(_cursorIndexOfImage))) {
              final String _tmpId_1;
              _tmpId_1 = _cursor.getString(_cursorIndexOfId_1);
              final String _tmpTitle_1;
              _tmpTitle_1 = _cursor.getString(_cursorIndexOfTitle_1);
              final String _tmpImage;
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
              _tmpAlbum = new Album(_tmpId_1,_tmpTitle_1,_tmpImage);
            }  else  {
              _tmpAlbum = null;
            }
            final Artist _tmpArtist;
            if (! (_cursor.isNull(_cursorIndexOfId_2) && _cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfPhoto))) {
              final String _tmpId_2;
              _tmpId_2 = _cursor.getString(_cursorIndexOfId_2);
              final String _tmpName;
              _tmpName = _cursor.getString(_cursorIndexOfName);
              final String _tmpPhoto;
              _tmpPhoto = _cursor.getString(_cursorIndexOfPhoto);
              _tmpArtist = new Artist(_tmpId_2,_tmpName,_tmpPhoto);
            }  else  {
              _tmpArtist = null;
            }
            _item = new TrackEmbedded(_tmpId,_tmpTitle,_tmpAlbum,_tmpArtist,_tmpSource,_tmpDuration);
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

  @Override
  public LiveData<List<TrackEmbedded>> getTracksByPlaylistId(final String playlistId) {
    final String _sql = "SELECT tracks.id, tracks.title, albums.id as album_id, albums.title as album_title, albums.image as album_image, artists.id as artist_id, artists.name as artist_name, artists.photo as artist_photo, tracks.source, tracks.duration FROM tracks, playlist_build INNER JOIN albums ON tracks.albumId = albums.id INNER JOIN artists ON tracks.artistId = artists.id WHERE playlist_build.playlistId=? AND playlist_build.trackId = tracks.id ORDER BY tracks.title";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (playlistId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, playlistId);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"tracks","playlist_build","albums","artists"}, false, new Callable<List<TrackEmbedded>>() {
      @Override
      public List<TrackEmbedded> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfId_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "album_id");
          final int _cursorIndexOfTitle_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "album_title");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "album_image");
          final int _cursorIndexOfId_2 = CursorUtil.getColumnIndexOrThrow(_cursor, "artist_id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "artist_name");
          final int _cursorIndexOfPhoto = CursorUtil.getColumnIndexOrThrow(_cursor, "artist_photo");
          final int _cursorIndexOfSource = CursorUtil.getColumnIndexOrThrow(_cursor, "source");
          final int _cursorIndexOfDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "duration");
          final List<TrackEmbedded> _result = new ArrayList<TrackEmbedded>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TrackEmbedded _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpSource;
            _tmpSource = _cursor.getString(_cursorIndexOfSource);
            final long _tmpDuration;
            _tmpDuration = _cursor.getLong(_cursorIndexOfDuration);
            final Album _tmpAlbum;
            if (! (_cursor.isNull(_cursorIndexOfId_1) && _cursor.isNull(_cursorIndexOfTitle_1) && _cursor.isNull(_cursorIndexOfImage))) {
              final String _tmpId_1;
              _tmpId_1 = _cursor.getString(_cursorIndexOfId_1);
              final String _tmpTitle_1;
              _tmpTitle_1 = _cursor.getString(_cursorIndexOfTitle_1);
              final String _tmpImage;
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
              _tmpAlbum = new Album(_tmpId_1,_tmpTitle_1,_tmpImage);
            }  else  {
              _tmpAlbum = null;
            }
            final Artist _tmpArtist;
            if (! (_cursor.isNull(_cursorIndexOfId_2) && _cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfPhoto))) {
              final String _tmpId_2;
              _tmpId_2 = _cursor.getString(_cursorIndexOfId_2);
              final String _tmpName;
              _tmpName = _cursor.getString(_cursorIndexOfName);
              final String _tmpPhoto;
              _tmpPhoto = _cursor.getString(_cursorIndexOfPhoto);
              _tmpArtist = new Artist(_tmpId_2,_tmpName,_tmpPhoto);
            }  else  {
              _tmpArtist = null;
            }
            _item = new TrackEmbedded(_tmpId,_tmpTitle,_tmpAlbum,_tmpArtist,_tmpSource,_tmpDuration);
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
