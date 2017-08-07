
package com.bas.team10application.Service.DAO;

import java.util.List;

import com.bas.team10application.Service.DAO.Defect;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Select {

    @SerializedName("defect")
    @Expose
    private List<Defect> defect = null;

    public List<Defect> getDefect() {
        return defect;
    }

    public void setDefect(List<Defect> defect) {
        this.defect = defect;
    }

}
