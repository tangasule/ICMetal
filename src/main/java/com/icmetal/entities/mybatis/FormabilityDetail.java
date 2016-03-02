package com.icmetal.entities.mybatis;

public class FormabilityDetail {
    private Long id;

    private String material;

    private String noState;

    private String totalStrain;

    private String stampingSpeed;

    private String cutOffStrain;

    private String upload;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material == null ? null : material.trim();
    }

    public String getNoState() {
        return noState;
    }

    public void setNoState(String noState) {
        this.noState = noState == null ? null : noState.trim();
    }

    public String getTotalStrain() {
        return totalStrain;
    }

    public void setTotalStrain(String totalStrain) {
        this.totalStrain = totalStrain == null ? null : totalStrain.trim();
    }

    public String getStampingSpeed() {
        return stampingSpeed;
    }

    public void setStampingSpeed(String stampingSpeed) {
        this.stampingSpeed = stampingSpeed == null ? null : stampingSpeed.trim();
    }

    public String getCutOffStrain() {
        return cutOffStrain;
    }

    public void setCutOffStrain(String cutOffStrain) {
        this.cutOffStrain = cutOffStrain == null ? null : cutOffStrain.trim();
    }

    public String getUpload() {
        return upload;
    }

    public void setUpload(String upload) {
        this.upload = upload == null ? null : upload.trim();
    }
}