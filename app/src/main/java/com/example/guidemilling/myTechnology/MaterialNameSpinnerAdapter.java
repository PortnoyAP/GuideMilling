package com.example.guidemilling.myTechnology;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.core.graphics.ColorUtils;

import com.example.guidemilling.R;
import com.google.android.gms.common.util.Hex;

import java.util.ArrayList;

public class MaterialNameSpinnerAdapter extends BaseAdapter {

    private LayoutInflater layoutInflater;
    private ArrayList<MaterialClassForSpinnerView> materialClassArrayList;
    TextView textViewMaterialName;

    public MaterialNameSpinnerAdapter(Context context, ArrayList<MaterialClassForSpinnerView> materialClassArrayList) {
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.materialClassArrayList = materialClassArrayList;
    }

    @Override
    public int getCount() {
        return materialClassArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return materialClassArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public TextView getTextViewMaterialName() {
        return textViewMaterialName;
    }

    public void setTextViewMaterialName(TextView textViewMaterialName) {
        this.textViewMaterialName = textViewMaterialName;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = layoutInflater.inflate(R.layout.spiner_item, parent, false);

        MaterialClassForSpinnerView materialName = (MaterialClassForSpinnerView) getItem(position);

        TextView textViewMaterialName = (TextView) view.findViewById(R.id.name);
        textViewMaterialName.setText(materialName.getMaterialName());
        switch (materialName.getMaterialClass()) {     /*change color text in view spinner */
            case 'P':
                textViewMaterialName.setTextColor(Color.BLUE);
                break;

            case 'N':
                textViewMaterialName.setTextColor(Color.GREEN);
                break;

            case 'K':
                textViewMaterialName.setTextColor(Color.RED);
                break;

            case 'M':
                textViewMaterialName.setTextColor(Color.YELLOW);
                break;

            case 'S':
                textViewMaterialName.setTextColor(Color.parseColor("#BD880D"));
                break;

            case 'H':
                textViewMaterialName.setTextColor(Color.GRAY);
                break;

            case 'С':
                textViewMaterialName.setTextColor(Color.parseColor("#8D4F22"));
                break;

            default:
                break;


        }


        ImageView imageViewImageMaterial = (ImageView) view.findViewById(R.id.image);
        imageViewImageMaterial.setImageResource(materialName.getImageMaterial());

        return view;


    }
}
