package id.ac.polinema.aplikasi_msi.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import id.ac.polinema.aplikasi_msi.R;

//FRAGMENT BUAT MENU PRODUK

public class HomeFragment extends Fragment {
    private TextView username;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Mengenalkan sebuah layout dr fragment/mewakili layout
        View view;
        view = inflater.inflate(R.layout.fragment_home, container, false);
        username = view.findViewById(R.id.text_home);

        //getArgument untuk bundle
        String usernameVal = getArguments().getString("username");
        username.setText("Hello "+ usernameVal+" !" );
        //Mengembalikan layout
        return view;
    }
}
