package com.bas.team10application.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bas.team10application.MenuReportActivity;
import com.bas.team10application.R;
import com.bas.team10application.Service.DAO.ProjectDao;

/**
 * Created by BassAye on 17/5/2560.
 */

public class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.ViewHolder> {

    private Context mContext;
    private ProjectDao mSelect2Dao;

    public ProjectAdapter(Context context, ProjectDao mTestDao) {
        this.mContext = context;
        this.mSelect2Dao = mTestDao;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_list_project, parent, false);
        ViewHolder holder = new ProjectAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
     /*   holder.df_1.setText(mTestDao.get(position).getDf_id());
        holder.df_2.setText(mTestDao.get(position).getDf_detected_person());
        holder.df_3.setText(mTestDao.get(position).getDf_id());
        holder.df_4.setText(mTestDao.get(position).getDf_id());*/
        holder.pj_1.setText("" + (position + 1));
        holder.pj_2.setText(mSelect2Dao.getDefect().get(position).getPj_code());
        holder.pj_3.setText(mSelect2Dao.getDefect().get(position).getPj_name());

        holder.llproject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(mContext, MenuReportActivity.class);
                in.putExtra("Pj_id",mSelect2Dao.getDefect().get(position).getPj_id());
                mContext.startActivity(in);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mSelect2Dao.getDefect().size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView pj_1;
        private TextView pj_2;
        private TextView pj_3;
        private LinearLayout llproject;
        public ViewHolder(View itemView) {
            super(itemView);
            pj_1 = (TextView) itemView.findViewById(R.id.pj_1);
            pj_2 = (TextView) itemView.findViewById(R.id.pj_2);
            pj_3 = (TextView) itemView.findViewById(R.id.pj_3);
            llproject = (LinearLayout) itemView.findViewById(R.id.ll_project);
        }
    }

}
