package id.ac.polinema.aplikasi_msi.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.TextView;

import id.ac.polinema.aplikasi_msi.R;

//FRAGMENT BUAT MENU PRODUK

public class HomeFragment extends Fragment {
    private TextView username;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        //Mengenalkan sebuah layout dr fragment/mewakili layout
        View view;
        view = inflater.inflate(R.layout.fragment_home, container, false);
        username = view.findViewById(R.id.text_home);
        //getArgument untuk bundle
        String usernameVal = getArguments().getString("username");
        username.setText(usernameVal);
        //Mengembalikan layout
        return view;
    }
}
