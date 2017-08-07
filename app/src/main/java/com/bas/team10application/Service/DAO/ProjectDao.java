package com.bas.team10application.Service.DAO;

import java.util.List;

/**
 * Created by BassAye on 17/5/2560.
 */

public class ProjectDao {
    private List<DefectBean> defect;

    public List<DefectBean> getDefect() {
        return defect;
    }

    public void setDefect(List<DefectBean> defect) {
        this.defect = defect;
    }

    public static class DefectBean {
        /**
         * pj_id : 1098
         * pj_code : STM_001
         * pj_name : Software Testing Management System
         * pj_detail : โครงการนี้เป็นส่วนหนึ่งของรายวิชา  888351  Team Software Development Process และ  888352	Team Software Development Process Laboratory
         * pj_start_date : 2016-11-01
         * pj_end_date : 2017-04-01
         * pj_st_id : 72
         * pj_sys_id : 114
         * pj_pst_id : 1
         * pj_create_date : 2017-03-11 00:00:00
         * pj_create_person : 2
         */

        private String pj_id;
        private String pj_code;
        private String pj_name;
        private String pj_detail;
        private String pj_start_date;
        private String pj_end_date;
        private String pj_st_id;
        private String pj_sys_id;
        private String pj_pst_id;
        private String pj_create_date;
        private String pj_create_person;

        public String getPj_id() {
            return pj_id;
        }

        public void setPj_id(String pj_id) {
            this.pj_id = pj_id;
        }

        public String getPj_code() {
            return pj_code;
        }

        public void setPj_code(String pj_code) {
            this.pj_code = pj_code;
        }

        public String getPj_name() {
            return pj_name;
        }

        public void setPj_name(String pj_name) {
            this.pj_name = pj_name;
        }

        public String getPj_detail() {
            return pj_detail;
        }

        public void setPj_detail(String pj_detail) {
            this.pj_detail = pj_detail;
        }

        public String getPj_start_date() {
            return pj_start_date;
        }

        public void setPj_start_date(String pj_start_date) {
            this.pj_start_date = pj_start_date;
        }

        public String getPj_end_date() {
            return pj_end_date;
        }

        public void setPj_end_date(String pj_end_date) {
            this.pj_end_date = pj_end_date;
        }

        public String getPj_st_id() {
            return pj_st_id;
        }

        public void setPj_st_id(String pj_st_id) {
            this.pj_st_id = pj_st_id;
        }

        public String getPj_sys_id() {
            return pj_sys_id;
        }

        public void setPj_sys_id(String pj_sys_id) {
            this.pj_sys_id = pj_sys_id;
        }

        public String getPj_pst_id() {
            return pj_pst_id;
        }

        public void setPj_pst_id(String pj_pst_id) {
            this.pj_pst_id = pj_pst_id;
        }

        public String getPj_create_date() {
            return pj_create_date;
        }

        public void setPj_create_date(String pj_create_date) {
            this.pj_create_date = pj_create_date;
        }

        public String getPj_create_person() {
            return pj_create_person;
        }

        public void setPj_create_person(String pj_create_person) {
            this.pj_create_person = pj_create_person;
        }
    }
}
