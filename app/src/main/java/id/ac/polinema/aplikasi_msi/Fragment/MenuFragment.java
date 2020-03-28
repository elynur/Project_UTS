package id.ac.polinema.aplikasi_msi.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.aplikasi_msi.Adapter.MenuAdapter;
import id.ac.polinema.aplikasi_msi.Model.MenuModels;
import id.ac.polinema.aplikasi_msi.R;


public class MenuFragment extends Fragment {
    RecyclerView recyclerView;
    List<MenuModels> data = new ArrayList<>();
    View view;
    MenuAdapter menuAdapter;

    public MenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view;
        view= inflater.inflate(R.layout.fragment_menu, container, false);
        MenuModels menuModels = new MenuModels(R.drawable.aloevera,"Aloevera","MSI JOSS","Rp. 30000");
        data.add(menuModels);
        menuModels = new MenuModels(R.drawable.lips,"LipCream","OI JOSS","Rp. 30000");
        data.add(menuModels);
        menuModels = new MenuModels(R.drawable.gartea,"Gartea","OI JOSS","Rp. 70000");
        data.add(menuModels);
        menuModels = new MenuModels(R.drawable.lotion,"Lotion","OI JOSS","Rp. 60000");
        data.add(menuModels);
        menuModels = new MenuModels(R.drawable.bambo,"Bamboo Cair","OI JOSS","Rp. 45000");
        data.add(menuModels);
        menuModels = new MenuModels(R.drawable.facemist,"Facemist","OI JOSS","Rp. 30000");
        data.add(menuModels);
        recyclerView = view.findViewById(R.id.rv_menu);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        menuAdapter = new MenuAdapter(getActivity(),data);
        recyclerView.setAdapter(menuAdapter);
        return  view;
    }
}
