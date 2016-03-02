package com.icmetal.entities.mybatis;

public class ToollifeDetail {
    private Long id;

    private String material;

    private String calculate;

    private String noState;

    private String totalStrain;

    private String stampingSpeed;

    private String frictionCoefficient;

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

    public String getCalculate() {
        return calculate;
    }

    public void setCalculate(String calculate) {
        this.calculate = calculate == null ? null : calculate.trim();
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

    public String getFrictionCoefficient() {
        return frictionCoefficient;
    }

    public void setFrictionCoefficient(String frictionCoefficient) {
        this.frictionCoefficient = frictionCoefficient == null ? null : frictionCoefficient.trim();
    }

    public String getUpload() {
        return upload;
    }

    public void setUpload(String upload) {
        this.upload = upload == null ? null : upload.trim();
    }
}