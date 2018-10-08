package vn.linh.android.rippleitemrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import vn.linh.android.R;
import vn.linh.android.rippleitemrecyclerview.adapter.OneItemTypeAdapter;
import vn.linh.android.rippleitemrecyclerview.model.RecyclerItem;

public class RippleInRecyclerViewItemActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private OneItemTypeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ripple_in_recycler_view_item);

        recyclerView = findViewById(R.id.recycler_view);

        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(
                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        ArrayList<RecyclerItem> data = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            data.add(new RecyclerItem("" + i, "b"));
        }
        adapter = new OneItemTypeAdapter(this, data.toArray(new RecyclerItem[data.size()]));
        recyclerView.setAdapter(adapter);
    }
}
