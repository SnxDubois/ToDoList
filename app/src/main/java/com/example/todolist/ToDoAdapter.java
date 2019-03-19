package com.example.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ToDoAdapter extends ArrayAdapter<ToDo> {

    public ToDoAdapter(Context context, List<ToDo> task) {
        super(context, 0, task);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ToDo item = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_todo, parent, false);
        }

        TextView description = convertView.findViewById(R.id.tvDescription);
        TextView date = convertView.findViewById(R.id.tvDate);

        description.setText(item.getDescription());
        date.setText(item.getDate());

        return convertView;

    }

}
