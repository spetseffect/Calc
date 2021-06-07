package com.example.calc;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class UserListAdapter extends ArrayAdapter<UserModel> {
    private List<UserModel> list;
    public UserListAdapter(@NonNull Context context, List<UserModel> list) {
        super(context, R.layout.user_view_tpl,list);
        this.list=list;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        UserModel userli=list.get(position);
        if(convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.user_view_tpl,parent,
                    false);
        }
        ImageView iv = convertView.findViewById(R.id.avaUser);
        iv.setImageResource(userli.Id());
        TextView fName = convertView.findViewById(R.id.fName);
        fName.setText(userli.firstName());
        TextView lName = convertView.findViewById(R.id.lName);
        lName.setText(userli.lastName());
        TextView country = convertView.findViewById(R.id.country);
        country.setText(userli.Country());
        TextView city = convertView.findViewById(R.id.city);
        city.setText(userli.City());
        TextView birthday = convertView.findViewById(R.id.age);
        birthday.setText(userli.Age());
        return convertView;
    }
}
