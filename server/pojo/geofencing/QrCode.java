package com.ballistic.server.pojo.geofencing;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "qrCode")
public class QrCode extends IDataModel {

    private String text; // text have (simple-json=> json have image-path(imag))
    private FileInfo fileInfo;

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }

    public FileInfo getFileInfo() { return fileInfo; }
    public void setFileInfo(FileInfo fileInfo) { this.fileInfo = fileInfo; }

    @Override
    public String toString() {
        return "QrCode{" + "text='" + text + '\'' + ", fileInfo=" + fileInfo + '}';
    }
}
