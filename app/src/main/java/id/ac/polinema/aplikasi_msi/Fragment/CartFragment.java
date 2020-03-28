package id.ac.polinema.aplikasi_msi.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import id.ac.polinema.aplikasi_msi.R;


public class CartFragment extends Fragment {

    public CartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view;
        view = inflater.inflate(R.layout.fragment_cart, container, false);
        Toast.makeText(getActivity(),getArguments().getString("title"),Toast.LENGTH_LONG).show();
        return view;
    }
}
