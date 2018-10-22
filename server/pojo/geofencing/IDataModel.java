package com.ballistic.server.pojo.geofencing;

import org.springframework.data.annotation.Id;

public abstract class IDataModel {

    @Id
    private String id;
    private String createDate; // will auto
    private String updateDate = null;
    private String deleteDate = null;
    private Boolean isDelete = false;

    public IDataModel() {}

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Boolean getDelete() { return isDelete; }
    public void setDelete(Boolean delete) { isDelete = delete; }

    public String getCreateDate() { return createDate; }
    public void setCreateDate(String createDate) { this.createDate = createDate; }

    public String getUpdateDate() { return updateDate; }
    public void setUpdateDate(String updateDate) { this.updateDate = updateDate; }

    public String getDeleteDate() { return deleteDate; }
    public void setDeleteDate(String deleteDate) { this.deleteDate = deleteDate; }

    @Override
    public String toString() {
        return "IDataModel{" + "id='" + id + '\'' + ", createDate='" + createDate + '\'' + ", updateDate='" + updateDate + '\'' + ", deleteDate='" + deleteDate + '\'' + ", isDelete=" + isDelete + '}';
    }
}
