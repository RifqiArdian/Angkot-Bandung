package id.co.kosankoding.angkotbandung.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import id.co.kosankoding.angkotbandung.R;
import id.co.kosankoding.angkotbandung.adapter.AngkotAdapter;
import id.co.kosankoding.angkotbandung.model.Angkot;

import static id.co.kosankoding.angkotbandung.utils.Constant.BASE_URL;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rv_angkot)
    RecyclerView recyclerView;
    List<Angkot> listAngkot;
    AngkotAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        AndroidNetworking.initialize(getApplicationContext());

        initRecylerView();
    }

    private void initRecylerView() {
        listAngkot = new ArrayList<>();
        adapter = new AngkotAdapter(this, listAngkot);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.hasFixedSize();

        loadItems();
    }

    private void loadItems() {
//        AndroidNetworking.get(BASE_URL + "penghuni/")
//                .setTag(this)
//                .setPriority(Priority.LOW)
//                .build()
//                .getAsObject(ResponsePenghuni.class, new ParsedRequestListener<ResponsePenghuni>() {
//                    @Override
//                    public void onResponse(ResponsePenghuni response) {
//                        List<Penghuni> data = response.getData();
//                        if (data != null) {
//                            penghuniList.addAll(data);
//                            adapter.notifyDataSetChanged();
//                        } else {
//                            Toast.makeText(MainActivity.this, "Data kosong !", Toast.LENGTH_SHORT).show();
//                        }
//                        progressBar.setVisibility(View.GONE);
//                    }
//
//                    @Override
//                    public void onError(ANError anError) {
//                        Toast.makeText(MainActivity.this, "Cannot load data !", Toast.LENGTH_SHORT).show();
//                        progressBar.setVisibility(View.GONE);
//                    }
//                });
        listAngkot.add(new Angkot("1", "1A", "Cileunyi - Caheum", "6", "121", ""));
        listAngkot.add(new Angkot("2", "1B", "Cileunyi - Dago", "23", "121", ""));
        listAngkot.add(new Angkot("3", "2", "Cileunyi - Majalaya", "12", "121", ""));
        listAngkot.add(new Angkot("4", "3", "Caheum - Dipati Ukur", "7", "121", ""));
        listAngkot.add(new Angkot("5", "5", "Ujung Berung - Ciwastra", "13", "121", ""));

        adapter.notifyDataSetChanged();
    }
}
