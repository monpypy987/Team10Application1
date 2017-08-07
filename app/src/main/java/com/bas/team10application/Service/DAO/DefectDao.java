package com.bas.team10application.Service.DAO;

import java.util.List;

/**
 * Created by BassAye on 18/5/2560.
 */

public class DefectDao {

    private List<DefectBean> defect;

    public List<DefectBean> getDefect() {
        return defect;
    }

    public void setDefect(List<DefectBean> defect) {
        this.defect = defect;
    }

    public static class DefectBean {
        /**
         * df_id : 425
         * df_code : rt
         * df_description : <p>rt</p>
         * df_step :
         * df_module :
         * df_reference :
         * df_dft_id : 0
         * df_pr_id : 0
         * df_sv_id : 0
         * df_detected_person : 2
         * df_raised_date : 2017-03-16
         * df_dfs_id : 1
         * df_fixed_person : 0
         * df_closed_date : 0000-00-00
         * df_tcs_id : 0
         * df_pj_id : 1111
         * df_pic : 2_1.jpg
         * df_del : 1
         */

        private String df_id;
        private String df_code;
        private String df_description;
        private String df_step;
        private String df_module;
        private String df_reference;
        private String df_dft_id;
        private String df_pr_id;
        private String df_sv_id;
        private String df_detected_person;
        private String df_raised_date;
        private String df_dfs_id;
        private String df_fixed_person;
        private String df_closed_date;
        private String df_tcs_id;
        private String df_pj_id;
        private String df_pic;
        private String df_del;

        public String getDf_id() {
            return df_id;
        }

        public void setDf_id(String df_id) {
            this.df_id = df_id;
        }

        public String getDf_code() {
            return df_code;
        }

        public void setDf_code(String df_code) {
            this.df_code = df_code;
        }

        public String getDf_description() {
            return df_description;
        }

        public void setDf_description(String df_description) {
            this.df_description = df_description;
        }

        public String getDf_step() {
            return df_step;
        }

        public void setDf_step(String df_step) {
            this.df_step = df_step;
        }

        public String getDf_module() {
            return df_module;
        }

        public void setDf_module(String df_module) {
            this.df_module = df_module;
        }

        public String getDf_reference() {
            return df_reference;
        }

        public void setDf_reference(String df_reference) {
            this.df_reference = df_reference;
        }

        public String getDf_dft_id() {
            return df_dft_id;
        }

        public void setDf_dft_id(String df_dft_id) {
            this.df_dft_id = df_dft_id;
        }

        public String getDf_pr_id() {
            return df_pr_id;
        }

        public void setDf_pr_id(String df_pr_id) {
            this.df_pr_id = df_pr_id;
        }

        public String getDf_sv_id() {
            return df_sv_id;
        }

        public void setDf_sv_id(String df_sv_id) {
            this.df_sv_id = df_sv_id;
        }

        public String getDf_detected_person() {
            return df_detected_person;
        }

        public void setDf_detected_person(String df_detected_person) {
            this.df_detected_person = df_detected_person;
        }

        public String getDf_raised_date() {
            return df_raised_date;
        }

        public void setDf_raised_date(String df_raised_date) {
            this.df_raised_date = df_raised_date;
        }

        public String getDf_dfs_id() {
            return df_dfs_id;
        }

        public void setDf_dfs_id(String df_dfs_id) {
            this.df_dfs_id = df_dfs_id;
        }

        public String getDf_fixed_person() {
            return df_fixed_person;
        }

        public void setDf_fixed_person(String df_fixed_person) {
            this.df_fixed_person = df_fixed_person;
        }

        public String getDf_closed_date() {
            return df_closed_date;
        }

        public void setDf_closed_date(String df_closed_date) {
            this.df_closed_date = df_closed_date;
        }

        public String getDf_tcs_id() {
            return df_tcs_id;
        }

        public void setDf_tcs_id(String df_tcs_id) {
            this.df_tcs_id = df_tcs_id;
        }

        public String getDf_pj_id() {
            return df_pj_id;
        }

        public void setDf_pj_id(String df_pj_id) {
            this.df_pj_id = df_pj_id;
        }

        public String getDf_pic() {
            return df_pic;
        }

        public void setDf_pic(String df_pic) {
            this.df_pic = df_pic;
        }

        public String getDf_del() {
            return df_del;
        }

        public void setDf_del(String df_del) {
            this.df_del = df_del;
        }
    }
}
