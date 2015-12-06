package me.bsu.test2;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder {

        String name, l

        public ViewHolder(View v) {
            super(v);

        }
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public ProjectsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ProjectsAdapter.ViewHolder holder, int position) {

    }
}
