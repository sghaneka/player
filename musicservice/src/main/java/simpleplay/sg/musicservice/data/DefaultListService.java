package simpleplay.sg.musicservice.data;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import simpleplay.sg.musicservice.models.PlayList;

/**
 * Created by samgh on 6/3/2017.
 */

public class DefaultListService implements IPlayListService {

    private List<PlayList> mItems;

    public DefaultListService(){
        mItems = new ArrayList<PlayList>();
        for(int i=0; i<50; i++){
            PlayList p = new PlayList();
            p.title = "Juju List " + i;
            p.imageUrl = "http://via.placeholder.com/50x50";
            mItems.add(p);
        }
    }

    @Override
    public PlayList[] getPlayLists() {
        PlayList tmp[] = new PlayList[mItems.size()];
        return mItems.toArray(tmp);
    }

}
