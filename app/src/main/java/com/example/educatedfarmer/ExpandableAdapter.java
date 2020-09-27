package com.example.educatedfarmer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ExpandableAdapter extends RecyclerView.Adapter<ExpandableAdapter.MovieVH> {

    private static final String TAG = "MovieAdapter";
    List<Movie> instructionlist;

    public ExpandableAdapter(List<Movie> movieList) {
        this.instructionlist = movieList;
    }

    @NonNull
    @Override
    public MovieVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.expandable_view, parent, false);
        return new MovieVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieVH holder, int position) {

        Movie movie = instructionlist.get(position);
        holder.titleTextView.setText(movie.getTitle());
        holder.plotTextView.setText(movie.getPlot());

        boolean isExpanded = instructionlist.get(position).isExpanded();
        holder.expandableLayout.setVisibility(isExpanded ? View.VISIBLE : View.GONE);

    }

    @Override
    public int getItemCount() {
        return instructionlist.size();
    }

    class MovieVH extends RecyclerView.ViewHolder {

        private static final String TAG = "MovieVH";

        ConstraintLayout expandableLayout;
        TextView titleTextView, plotTextView;

        public MovieVH(@NonNull final View itemView) {
            super(itemView);

            titleTextView = itemView.findViewById(R.id.titleTextView);
            plotTextView = itemView.findViewById(R.id.plotTextView);
            expandableLayout = itemView.findViewById(R.id.expandableLayout);


            titleTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Movie movie = instructionlist.get(getAdapterPosition());
                    movie.setExpanded(!movie.isExpanded());
                    notifyItemChanged(getAdapterPosition());

                }
            });
        }
    }
}
