/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author rocha
 */
public class license {
    
    
    private String licenseNumber;
    private String issueDate;
    private String expiryDate;
    private String bloodType;
    private String imgPath;

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getIssuedate() {
        return issueDate;
    }

    public void setIssuedate(String issuedate) {
        this.issueDate = issuedate;
    }

    public String getExpirydate() {
        return expiryDate;
    }

    public void setExpirydate(String expirydate) {
        this.expiryDate = expirydate;
    }
    private String picUrl;

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getDateOfIssue() {
        return issueDate;
    }

    public void setDateOfIssue(String dateOfIssue) {
        this.issueDate = dateOfIssue;
    }

    public String getDateOfExpiry() {
        return expiryDate;
    }

    public void setDateOfExpiry(String dateOfExpiry) {
        this.expiryDate = dateOfExpiry;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

}
