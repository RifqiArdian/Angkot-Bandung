package id.co.kosankoding.angkotbandung.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import id.co.kosankoding.angkotbandung.R;
import id.co.kosankoding.angkotbandung.model.Angkot;

public class AngkotAdapter extends RecyclerView.Adapter<AngkotAdapter.ViewHolder> {

    private Context context;
    private List<Angkot> listAngkot;

    public AngkotAdapter(Context context, List<Angkot> listAngkot) {
        this.context = context;
        this.listAngkot = listAngkot;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_angkot, null, false);

        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        v.setLayoutParams(layoutParams);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final Angkot angkot = listAngkot.get(position);
        Glide.with(context).load(angkot.getGambar()).placeholder(R.drawable.ic_armada).into(holder.imageAngkot);
        holder.txtTrayekAngkot.setText(angkot.getTrayek());
        holder.txtKodeAngkot.setText(angkot.getKodeAngkot());
        holder.txtJumlahArmada.setText(angkot.getJumlahArmada());
        holder.txtJarak.setText(angkot.getJarak());
    }

    @Override
    public int getItemCount() {
        return listAngkot.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.image_angkot)
        ImageView imageAngkot;
        @BindView(R.id.txt_trayek_angkot)
        TextView txtTrayekAngkot;
        @BindView(R.id.txt_kode_angkot)
        TextView txtKodeAngkot;
        @BindView(R.id.txt_jumlah_armada)
        TextView txtJumlahArmada;
        @BindView(R.id.txt_jarak)
        TextView txtJarak;
        @BindView(R.id.cv_angkot)
        CardView cvAngkot;

        ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}
