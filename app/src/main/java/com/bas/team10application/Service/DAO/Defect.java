
package com.bas.team10application.Service.DAO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Defect {

    @SerializedName("df_id")
    @Expose
    private String dfId;
    @SerializedName("df_code")
    @Expose
    private String dfCode;
    @SerializedName("df_description")
    @Expose
    private String dfDescription;
    @SerializedName("df_step")
    @Expose
    private String dfStep;
    @SerializedName("df_module")
    @Expose
    private String dfModule;
    @SerializedName("df_reference")
    @Expose
    private String dfReference;
    @SerializedName("df_dft_id")
    @Expose
    private String dfDftId;
    @SerializedName("df_pr_id")
    @Expose
    private String dfPrId;
    @SerializedName("df_sv_id")
    @Expose
    private String dfSvId;
    @SerializedName("df_detected_person")
    @Expose
    private String dfDetectedPerson;
    @SerializedName("df_raised_date")
    @Expose
    private String dfRaisedDate;
    @SerializedName("df_dfs_id")
    @Expose
    private String dfDfsId;
    @SerializedName("df_fixed_person")
    @Expose
    private String dfFixedPerson;
    @SerializedName("df_closed_date")
    @Expose
    private String dfClosedDate;
    @SerializedName("df_tcs_id")
    @Expose
    private String dfTcsId;
    @SerializedName("df_pj_id")
    @Expose
    private String dfPjId;
    @SerializedName("df_pic")
    @Expose
    private String dfPic;
    @SerializedName("df_del")
    @Expose
    private String dfDel;

    public String getDfId() {
        return dfId;
    }

    public void setDfId(String dfId) {
        this.dfId = dfId;
    }

    public String getDfCode() {
        return dfCode;
    }

    public void setDfCode(String dfCode) {
        this.dfCode = dfCode;
    }

    public String getDfDescription() {
        return dfDescription;
    }

    public void setDfDescription(String dfDescription) {
        this.dfDescription = dfDescription;
    }

    public String getDfStep() {
        return dfStep;
    }

    public void setDfStep(String dfStep) {
        this.dfStep = dfStep;
    }

    public String getDfModule() {
        return dfModule;
    }

    public void setDfModule(String dfModule) {
        this.dfModule = dfModule;
    }

    public String getDfReference() {
        return dfReference;
    }

    public void setDfReference(String dfReference) {
        this.dfReference = dfReference;
    }

    public String getDfDftId() {
        return dfDftId;
    }

    public void setDfDftId(String dfDftId) {
        this.dfDftId = dfDftId;
    }

    public String getDfPrId() {
        return dfPrId;
    }

    public void setDfPrId(String dfPrId) {
        this.dfPrId = dfPrId;
    }

    public String getDfSvId() {
        return dfSvId;
    }

    public void setDfSvId(String dfSvId) {
        this.dfSvId = dfSvId;
    }

    public String getDfDetectedPerson() {
        return dfDetectedPerson;
    }

    public void setDfDetectedPerson(String dfDetectedPerson) {
        this.dfDetectedPerson = dfDetectedPerson;
    }

    public String getDfRaisedDate() {
        return dfRaisedDate;
    }

    public void setDfRaisedDate(String dfRaisedDate) {
        this.dfRaisedDate = dfRaisedDate;
    }

    public String getDfDfsId() {
        return dfDfsId;
    }

    public void setDfDfsId(String dfDfsId) {
        this.dfDfsId = dfDfsId;
    }

    public String getDfFixedPerson() {
        return dfFixedPerson;
    }

    public void setDfFixedPerson(String dfFixedPerson) {
        this.dfFixedPerson = dfFixedPerson;
    }

    public String getDfClosedDate() {
        return dfClosedDate;
    }

    public void setDfClosedDate(String dfClosedDate) {
        this.dfClosedDate = dfClosedDate;
    }

    public String getDfTcsId() {
        return dfTcsId;
    }

    public void setDfTcsId(String dfTcsId) {
        this.dfTcsId = dfTcsId;
    }

    public String getDfPjId() {
        return dfPjId;
    }

    public void setDfPjId(String dfPjId) {
        this.dfPjId = dfPjId;
    }

    public String getDfPic() {
        return dfPic;
    }

    public void setDfPic(String dfPic) {
        this.dfPic = dfPic;
    }

    public String getDfDel() {
        return dfDel;
    }

    public void setDfDel(String dfDel) {
        this.dfDel = dfDel;
    }

}
