package com.sample.musicx;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.sample.musicx.databinding.ActivityMainBindingImpl;
import com.sample.musicx.databinding.BottomSheetUpdatePictureBindingImpl;
import com.sample.musicx.databinding.DialogPlaylistPickerBindingImpl;
import com.sample.musicx.databinding.FragmentAlbumBindingImpl;
import com.sample.musicx.databinding.FragmentAlbumSongListBindingImpl;
import com.sample.musicx.databinding.FragmentArtistBindingImpl;
import com.sample.musicx.databinding.FragmentArtistSongListBindingImpl;
import com.sample.musicx.databinding.FragmentLibraryBindingImpl;
import com.sample.musicx.databinding.FragmentNewPlaylistBindingImpl;
import com.sample.musicx.databinding.FragmentPlayerBindingImpl;
import com.sample.musicx.databinding.FragmentPlaylistSongListBindingImpl;
import com.sample.musicx.databinding.FragmentPlaylistsBindingImpl;
import com.sample.musicx.databinding.FragmentTrackBindingImpl;
import com.sample.musicx.databinding.ItemAlbumBindingImpl;
import com.sample.musicx.databinding.ItemArtistBindingImpl;
import com.sample.musicx.databinding.ItemPlaylistBindingImpl;
import com.sample.musicx.databinding.ItemPlaylistPickerBindingImpl;
import com.sample.musicx.databinding.ItemTrackBindingImpl;
import com.sample.musicx.databinding.SongListContentBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_BOTTOMSHEETUPDATEPICTURE = 2;

  private static final int LAYOUT_DIALOGPLAYLISTPICKER = 3;

  private static final int LAYOUT_FRAGMENTALBUM = 4;

  private static final int LAYOUT_FRAGMENTALBUMSONGLIST = 5;

  private static final int LAYOUT_FRAGMENTARTIST = 6;

  private static final int LAYOUT_FRAGMENTARTISTSONGLIST = 7;

  private static final int LAYOUT_FRAGMENTLIBRARY = 8;

  private static final int LAYOUT_FRAGMENTNEWPLAYLIST = 9;

  private static final int LAYOUT_FRAGMENTPLAYER = 10;

  private static final int LAYOUT_FRAGMENTPLAYLISTSONGLIST = 11;

  private static final int LAYOUT_FRAGMENTPLAYLISTS = 12;

  private static final int LAYOUT_FRAGMENTTRACK = 13;

  private static final int LAYOUT_ITEMALBUM = 14;

  private static final int LAYOUT_ITEMARTIST = 15;

  private static final int LAYOUT_ITEMPLAYLIST = 16;

  private static final int LAYOUT_ITEMPLAYLISTPICKER = 17;

  private static final int LAYOUT_ITEMTRACK = 18;

  private static final int LAYOUT_SONGLISTCONTENT = 19;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(19);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sample.musicx.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sample.musicx.R.layout.bottom_sheet_update_picture_, LAYOUT_BOTTOMSHEETUPDATEPICTURE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sample.musicx.R.layout.dialog_playlist_picker, LAYOUT_DIALOGPLAYLISTPICKER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sample.musicx.R.layout.fragment_album, LAYOUT_FRAGMENTALBUM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sample.musicx.R.layout.fragment_album_song_list, LAYOUT_FRAGMENTALBUMSONGLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sample.musicx.R.layout.fragment_artist, LAYOUT_FRAGMENTARTIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sample.musicx.R.layout.fragment_artist_song_list, LAYOUT_FRAGMENTARTISTSONGLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sample.musicx.R.layout.fragment_library, LAYOUT_FRAGMENTLIBRARY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sample.musicx.R.layout.fragment_new_playlist, LAYOUT_FRAGMENTNEWPLAYLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sample.musicx.R.layout.fragment_player, LAYOUT_FRAGMENTPLAYER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sample.musicx.R.layout.fragment_playlist_song_list, LAYOUT_FRAGMENTPLAYLISTSONGLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sample.musicx.R.layout.fragment_playlists, LAYOUT_FRAGMENTPLAYLISTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sample.musicx.R.layout.fragment_track, LAYOUT_FRAGMENTTRACK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sample.musicx.R.layout.item_album, LAYOUT_ITEMALBUM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sample.musicx.R.layout.item_artist, LAYOUT_ITEMARTIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sample.musicx.R.layout.item_playlist, LAYOUT_ITEMPLAYLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sample.musicx.R.layout.item_playlist_picker, LAYOUT_ITEMPLAYLISTPICKER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sample.musicx.R.layout.item_track, LAYOUT_ITEMTRACK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sample.musicx.R.layout.song_list_content, LAYOUT_SONGLISTCONTENT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_BOTTOMSHEETUPDATEPICTURE: {
          if ("layout/bottom_sheet_update_picture__0".equals(tag)) {
            return new BottomSheetUpdatePictureBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for bottom_sheet_update_picture_ is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGPLAYLISTPICKER: {
          if ("layout/dialog_playlist_picker_0".equals(tag)) {
            return new DialogPlaylistPickerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_playlist_picker is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTALBUM: {
          if ("layout/fragment_album_0".equals(tag)) {
            return new FragmentAlbumBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_album is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTALBUMSONGLIST: {
          if ("layout/fragment_album_song_list_0".equals(tag)) {
            return new FragmentAlbumSongListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_album_song_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTARTIST: {
          if ("layout/fragment_artist_0".equals(tag)) {
            return new FragmentArtistBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_artist is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTARTISTSONGLIST: {
          if ("layout/fragment_artist_song_list_0".equals(tag)) {
            return new FragmentArtistSongListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_artist_song_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLIBRARY: {
          if ("layout/fragment_library_0".equals(tag)) {
            return new FragmentLibraryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_library is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNEWPLAYLIST: {
          if ("layout/fragment_new_playlist_0".equals(tag)) {
            return new FragmentNewPlaylistBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_new_playlist is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPLAYER: {
          if ("layout/fragment_player_0".equals(tag)) {
            return new FragmentPlayerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_player is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPLAYLISTSONGLIST: {
          if ("layout/fragment_playlist_song_list_0".equals(tag)) {
            return new FragmentPlaylistSongListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_playlist_song_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPLAYLISTS: {
          if ("layout/fragment_playlists_0".equals(tag)) {
            return new FragmentPlaylistsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_playlists is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTRACK: {
          if ("layout/fragment_track_0".equals(tag)) {
            return new FragmentTrackBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_track is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMALBUM: {
          if ("layout/item_album_0".equals(tag)) {
            return new ItemAlbumBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_album is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMARTIST: {
          if ("layout/item_artist_0".equals(tag)) {
            return new ItemArtistBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_artist is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPLAYLIST: {
          if ("layout/item_playlist_0".equals(tag)) {
            return new ItemPlaylistBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_playlist is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPLAYLISTPICKER: {
          if ("layout/item_playlist_picker_0".equals(tag)) {
            return new ItemPlaylistPickerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_playlist_picker is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMTRACK: {
          if ("layout/item_track_0".equals(tag)) {
            return new ItemTrackBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_track is invalid. Received: " + tag);
        }
        case  LAYOUT_SONGLISTCONTENT: {
          if ("layout/song_list_content_0".equals(tag)) {
            return new SongListContentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for song_list_content is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(10);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "handler");
      sKeys.put(2, "playlist");
      sKeys.put(3, "artist");
      sKeys.put(4, "album");
      sKeys.put(5, "playerUI");
      sKeys.put(6, "viewModel");
      sKeys.put(7, "track");
      sKeys.put(8, "clickListener");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(19);

    static {
      sKeys.put("layout/activity_main_0", com.sample.musicx.R.layout.activity_main);
      sKeys.put("layout/bottom_sheet_update_picture__0", com.sample.musicx.R.layout.bottom_sheet_update_picture_);
      sKeys.put("layout/dialog_playlist_picker_0", com.sample.musicx.R.layout.dialog_playlist_picker);
      sKeys.put("layout/fragment_album_0", com.sample.musicx.R.layout.fragment_album);
      sKeys.put("layout/fragment_album_song_list_0", com.sample.musicx.R.layout.fragment_album_song_list);
      sKeys.put("layout/fragment_artist_0", com.sample.musicx.R.layout.fragment_artist);
      sKeys.put("layout/fragment_artist_song_list_0", com.sample.musicx.R.layout.fragment_artist_song_list);
      sKeys.put("layout/fragment_library_0", com.sample.musicx.R.layout.fragment_library);
      sKeys.put("layout/fragment_new_playlist_0", com.sample.musicx.R.layout.fragment_new_playlist);
      sKeys.put("layout/fragment_player_0", com.sample.musicx.R.layout.fragment_player);
      sKeys.put("layout/fragment_playlist_song_list_0", com.sample.musicx.R.layout.fragment_playlist_song_list);
      sKeys.put("layout/fragment_playlists_0", com.sample.musicx.R.layout.fragment_playlists);
      sKeys.put("layout/fragment_track_0", com.sample.musicx.R.layout.fragment_track);
      sKeys.put("layout/item_album_0", com.sample.musicx.R.layout.item_album);
      sKeys.put("layout/item_artist_0", com.sample.musicx.R.layout.item_artist);
      sKeys.put("layout/item_playlist_0", com.sample.musicx.R.layout.item_playlist);
      sKeys.put("layout/item_playlist_picker_0", com.sample.musicx.R.layout.item_playlist_picker);
      sKeys.put("layout/item_track_0", com.sample.musicx.R.layout.item_track);
      sKeys.put("layout/song_list_content_0", com.sample.musicx.R.layout.song_list_content);
    }
  }
}
