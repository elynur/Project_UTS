package id.ac.polinema.aplikasi_msi.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.aplikasi_msi.Adapter.CartAdapter;
import id.ac.polinema.aplikasi_msi.Model.CartModels;
import id.ac.polinema.aplikasi_msi.R;


public class CartFragment extends Fragment {
    RecyclerView recyclerView;
    List<CartModels> data = new ArrayList<>();
    View view;
    CartAdapter cartAdapter;

    public CartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view;
        view = inflater.inflate(R.layout.fragment_cart, container, false);
        CartModels cartModels = new CartModels(getArguments().getString("title"),getArguments().getInt("harga",0),getArguments().getInt("totalOrder",0),getArguments().getInt("jumlah", 0),getArguments().getInt("img", R.drawable.ic_launcher_foreground),getArguments().getString("des"));
        data.add(cartModels);
        recyclerView = view.findViewById(R.id.rv_cart);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        cartAdapter = new CartAdapter(getActivity(),data);
        recyclerView.setAdapter(cartAdapter);
        return view;
    }
}
