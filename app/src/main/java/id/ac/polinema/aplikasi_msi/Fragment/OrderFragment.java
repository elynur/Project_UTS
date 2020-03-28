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

import id.ac.polinema.aplikasi_msi.Adapter.OrderAdapter;
import id.ac.polinema.aplikasi_msi.Model.OrderModels;
import id.ac.polinema.aplikasi_msi.R;


public class OrderFragment extends Fragment {
    RecyclerView recyclerView;
    List<OrderModels> data = new ArrayList<>();
    View view;
    OrderAdapter orderAdapter;

    public OrderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view;
        view= inflater.inflate(R.layout.fragment_order, container, false);

        OrderModels menuModels = new OrderModels(R.drawable.aloevera, 10000,"MSI", "hmmmmmmm");
        data.add(menuModels);
        menuModels = new OrderModels(R.drawable.lotion, 10000,"MSI", "hmmmmmmm");
        data.add(menuModels);
        menuModels = new OrderModels(R.drawable.facemist, 10000,"MSI", "hmmmmmmm");
        data.add(menuModels);
        menuModels = new OrderModels(R.drawable.lips, 10000,"MSI", "hmmmmmmm");
        data.add(menuModels);
        recyclerView = view.findViewById(R.id.rv_order);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        orderAdapter = new OrderAdapter(getActivity(),data);
        recyclerView.setAdapter(orderAdapter);
        return  view;
    }
}
