package com.bas.team10application.Service.DAO;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by BassAye on 17/5/2560.
 */

public class TestDAO implements Parcelable {

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

    public TestDAO(Parcel in) {
        df_id = in.readString();
        df_code = in.readString();
        df_description = in.readString();
        df_step = in.readString();
        df_module = in.readString();
        df_reference = in.readString();
        df_dft_id = in.readString();
        df_pr_id = in.readString();
        df_sv_id = in.readString();
        df_detected_person = in.readString();
        df_raised_date = in.readString();
        df_dfs_id = in.readString();
        df_fixed_person = in.readString();
        df_closed_date = in.readString();
        df_tcs_id = in.readString();
        df_pj_id = in.readString();
        df_pic = in.readString();
        df_del = in.readString();
    }

    public static final Creator<TestDAO> CREATOR = new Creator<TestDAO>() {
        @Override
        public TestDAO createFromParcel(Parcel in) {
            return new TestDAO(in);
        }

        @Override
        public TestDAO[] newArray(int size) {
            return new TestDAO[size];
        }
    };

    public TestDAO() {

    }

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(df_id);
        dest.writeString(df_code);
        dest.writeString(df_description);
        dest.writeString(df_step);
        dest.writeString(df_module);
        dest.writeString(df_reference);
        dest.writeString(df_dft_id);
        dest.writeString(df_pr_id);
        dest.writeString(df_sv_id);
        dest.writeString(df_detected_person);
        dest.writeString(df_raised_date);
        dest.writeString(df_dfs_id);
        dest.writeString(df_fixed_person);
        dest.writeString(df_closed_date);
        dest.writeString(df_tcs_id);
        dest.writeString(df_pj_id);
        dest.writeString(df_pic);
        dest.writeString(df_del);
    }
}
