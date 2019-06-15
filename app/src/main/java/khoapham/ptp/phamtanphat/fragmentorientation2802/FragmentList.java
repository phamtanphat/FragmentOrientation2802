package khoapham.ptp.phamtanphat.fragmentorientation2802;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FragmentList extends ListFragment {

    View view;
    ArrayList<String> mangten = new ArrayList<>();
    ArrayAdapter arrayAdapter;
    Truyendulieu truyendulieu;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_list,container,false);

        truyendulieu = (Truyendulieu) getActivity();

        mangten.add("Nguyen Van A");
        mangten.add("Nguyen Van B");
        mangten.add("Nguyen Van C");
        mangten.add("Nguyen Van D");
        mangten.add("Nguyen Van E");
        arrayAdapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,mangten);
        setListAdapter(arrayAdapter);

        return view;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        truyendulieu.datarecive(mangten.get(position));
        super.onListItemClick(l, v, position, id);
    }

}