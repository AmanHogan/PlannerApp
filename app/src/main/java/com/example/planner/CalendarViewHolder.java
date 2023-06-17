package com.example.planner;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CalendarViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public final TextView dayOfMonth;
    private final CalendarViewAdapter.OnItemListener onItemListener;

    public CalendarViewHolder(@NonNull View itemView, CalendarViewAdapter.OnItemListener onItemListener) {
        super(itemView);
        dayOfMonth = itemView.findViewById(R.id.cell_date_text);
        this.onItemListener = onItemListener;
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        String message = dayOfMonth.getText().toString();
        onItemListener.onItemClick(getAdapterPosition(), message);

    }
}
