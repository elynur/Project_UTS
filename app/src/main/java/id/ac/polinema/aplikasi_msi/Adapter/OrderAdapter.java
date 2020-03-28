package id.ac.polinema.aplikasi_msi.Adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import id.ac.polinema.aplikasi_msi.Model.MenuModels;
import id.ac.polinema.aplikasi_msi.Model.OrderModel;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.ViewHolder> {
    public List<OrderModel> data;
    LayoutInflater layoutInflater;
    Context context;

    public OrderAdapter(List<OrderModel> data, LayoutInflater layoutInflater, Context context) {
        this.data = data;
        this.layoutInflater = layoutInflater;
        this.context = context;
    }

    @NonNull
    @Override
    public OrderAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull OrderAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


    }
}
