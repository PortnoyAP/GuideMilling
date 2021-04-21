package com.example.guidemilling.toolGallery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.guidemilling.R;

import java.util.ArrayList;

public class ToolGalleryActivity extends AppCompatActivity {

    private RecyclerView recyclerView;  // connect recycler view with code
    private RecyclerView.Adapter adapter; //
    private RecyclerView.LayoutManager layoutManager;

    ArrayList<RecyclerViewItem> listTool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tool_gallery);
        initListTool();
    }

    public void initListTool() {

        listTool = new ArrayList<>();

        listTool.add(new RecyclerViewItem(R.drawable.face_mill,
                "FACE MILL", "For rough and fine milling of flat surfaces."));
        listTool.add(new RecyclerViewItem(R.drawable.mill_finish_al,
                "MILL ALUMINIUM\n FINISH", "For surface finishing. Can be used for rough milling.\n" +
                "used for finishing grooves and planes, as well as side milling of soft metals (aluminum, copper, etc.)."));
        listTool.add(new RecyclerViewItem(R.drawable.mill_rough_al,
                "MILL ALUMINIUM\n ROUGH", "For rough and semi-finishing milling.\n" +
                "Milling grooves and planes, as well as side milling"));
        listTool.add(new RecyclerViewItem(R.drawable.mill_finish_steel,
                "MILL STEEL\n FINISH", "For surface finishing."));
        listTool.add(new RecyclerViewItem(R.drawable.mill_rough_steel,
                "MILL STEEL \n ROUGH", "For rough and semi-finishing milling"));
        //  listTool.add(new RecyclerViewItem(R.drawable.mill_ball, "BALL MILL","This is ball nose"));
        listTool.add(new RecyclerViewItem(R.drawable.drill_hss,
                "DRILL\n HSS", "HSS (High Speed Steel) HSS performs well in interrupted cuts\n" +
                "Spot drill is required before drilling\n" +
                "HSS are low cutting speeds compared to SOLID CARBIDE DRILLS."));
        listTool.add(new RecyclerViewItem(R.drawable.drill_solid,
                "DRILL\n SOLID CARBIDE", "Performs well with continuous cutting\n" +
                "No Spot drill required before drilling\n" +
                "Are higher cutting speeds compared to HSS DRILLS"));
        listTool.add(new RecyclerViewItem(R.drawable.reamer,
                "REAMER", "Precision reamers are used to achieve a very high level of precision and smoothness in CNC  parts."));
        listTool.add(new RecyclerViewItem(R.drawable.chmf_mill,
                "CHAMFER MILL", "Chamfer mill can be used to easily and swiftly deburr a part during the CNC machining process"));
        listTool.add(new RecyclerViewItem(R.drawable.spot_drill,
                "SPOT DRILL", "It’s purpose is to ensure the hole is accurately located." +
                "The short spot drill is very rigid, and the spotting motion is unlikely to deflect."));
        listTool.add(new RecyclerViewItem(R.drawable.tap_gun,
                "TAP GUN", "gun push the chip before the tool use in open holes"));
        listTool.add(new RecyclerViewItem(R.drawable.tap_spiral,
                "TAP SPIRAL", "spiral for close holes get the chip vverh"));
        listTool.add(new RecyclerViewItem(R.drawable.tap_forming2,
                "TAP FORMING", "Forming push the hole not cut !!!"));
        listTool.add(new RecyclerViewItem(R.drawable.saw,
                "SAW", "saw "));

        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapter(listTool);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

    }

}