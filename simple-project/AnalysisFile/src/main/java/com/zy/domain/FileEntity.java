package com.zy.domain;

import java.io.Serializable;

/**
 * 传输对象实体
 */
public class FileEntity implements Serializable {
    private Long powerTime;
    private Integer placeTime;
    private Integer waitTime;
    private Integer runTime;
    private Integer stopTime;
    private Integer idleTime;
    private Integer inWaitTime;
    private Integer outWaitTime;
    private Integer transTime;
    private Integer wrongStopTime;
    private Integer errorStopTime;
    private Integer wrongStopCount;
    private Integer errorStopCount;
    private Integer panelInCount;
    private Integer panelOutCount;
    private Integer panelCount;
    private Integer pCBCount;
    private Integer errorPcbCount;
    private Integer skipPCBCount;
    private Double operationRate;
    private Double placementRate;
    private Double meanTimePCB;
    private Double realTimePCB;
    private Double transferTimePCB;
    private Integer PlaceCount;

    private String endFlag;

    public String getEndFlag() {
        return endFlag;
    }

    public void setEndFlag(String endFlag) {
        this.endFlag = endFlag;
    }

    public Long getPowerTime() {
        return powerTime;
    }

    public void setPowerTime(Long powerTime) {
        this.powerTime = powerTime;
    }

    public Integer getPlaceTime() {
        return placeTime;
    }

    public void setPlaceTime(Integer placeTime) {
        this.placeTime = placeTime;
    }

    public Integer getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(Integer waitTime) {
        this.waitTime = waitTime;
    }

    public Integer getRunTime() {
        return runTime;
    }

    public void setRunTime(Integer runTime) {
        this.runTime = runTime;
    }

    public Integer getStopTime() {
        return stopTime;
    }

    public void setStopTime(Integer stopTime) {
        this.stopTime = stopTime;
    }

    public Integer getIdleTime() {
        return idleTime;
    }

    public void setIdleTime(Integer idleTime) {
        this.idleTime = idleTime;
    }

    public Integer getInWaitTime() {
        return inWaitTime;
    }

    public void setInWaitTime(Integer inWaitTime) {
        this.inWaitTime = inWaitTime;
    }

    public Integer getOutWaitTime() {
        return outWaitTime;
    }

    public void setOutWaitTime(Integer outWaitTime) {
        this.outWaitTime = outWaitTime;
    }

    public Integer getTransTime() {
        return transTime;
    }

    public void setTransTime(Integer transTime) {
        this.transTime = transTime;
    }

    public Integer getWrongStopTime() {
        return wrongStopTime;
    }

    public void setWrongStopTime(Integer wrongStopTime) {
        this.wrongStopTime = wrongStopTime;
    }

    public Integer getErrorStopTime() {
        return errorStopTime;
    }

    public void setErrorStopTime(Integer errorStopTime) {
        this.errorStopTime = errorStopTime;
    }

    public Integer getWrongStopCount() {
        return wrongStopCount;
    }

    public void setWrongStopCount(Integer wrongStopCount) {
        this.wrongStopCount = wrongStopCount;
    }

    public Integer getErrorStopCount() {
        return errorStopCount;
    }

    public void setErrorStopCount(Integer errorStopCount) {
        this.errorStopCount = errorStopCount;
    }

    public Integer getPanelInCount() {
        return panelInCount;
    }

    public void setPanelInCount(Integer panelInCount) {
        this.panelInCount = panelInCount;
    }

    public Integer getPanelOutCount() {
        return panelOutCount;
    }

    public void setPanelOutCount(Integer panelOutCount) {
        this.panelOutCount = panelOutCount;
    }

    public Integer getPanelCount() {
        return panelCount;
    }

    public void setPanelCount(Integer panelCount) {
        this.panelCount = panelCount;
    }

    public Integer getpCBCount() {
        return pCBCount;
    }

    public void setpCBCount(Integer pCBCount) {
        this.pCBCount = pCBCount;
    }

    public Integer getErrorPcbCount() {
        return errorPcbCount;
    }

    public void setErrorPcbCount(Integer errorPcbCount) {
        this.errorPcbCount = errorPcbCount;
    }

    public Integer getSkipPCBCount() {
        return skipPCBCount;
    }

    public void setSkipPCBCount(Integer skipPCBCount) {
        this.skipPCBCount = skipPCBCount;
    }

    public Double getOperationRate() {
        return operationRate;
    }

    public void setOperationRate(Double operationRate) {
        this.operationRate = operationRate;
    }

    public Double getPlacementRate() {
        return placementRate;
    }

    public void setPlacementRate(Double placementRate) {
        this.placementRate = placementRate;
    }

    public Double getMeanTimePCB() {
        return meanTimePCB;
    }

    public void setMeanTimePCB(Double meanTimePCB) {
        this.meanTimePCB = meanTimePCB;
    }

    public Double getRealTimePCB() {
        return realTimePCB;
    }

    public void setRealTimePCB(Double realTimePCB) {
        this.realTimePCB = realTimePCB;
    }

    public Double getTransferTimePCB() {
        return transferTimePCB;
    }

    public void setTransferTimePCB(Double transferTimePCB) {
        this.transferTimePCB = transferTimePCB;
    }

    public Integer getPlaceCount() {
        return PlaceCount;
    }

    public void setPlaceCount(Integer placeCount) {
        PlaceCount = placeCount;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
