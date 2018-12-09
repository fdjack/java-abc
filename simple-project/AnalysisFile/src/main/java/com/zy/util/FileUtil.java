package com.zy.util;

import com.zy.constant.FileConstant;
import com.zy.domain.FileEntity;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class FileUtil {

    /**
     * 获取文件待读取目标文件夹路径
     *
     * @return
     */
    public static String getFilePath() throws Exception {
        return new PropertiesUtil().getValue("filePath");
    }

    /**
     * 获取文件对象
     *
     * @param fileName 目标文件名
     * @return
     */
    public static FileEntity getFileObject(String fileName) {
        FileEntity fileEntity = new FileEntity();
        try {
            String filePath = getFilePath();
            File file = new File(filePath);
            File[] files = file.listFiles();
            for (File name : files) {
                String filePathF = filePath + File.separator + name.getName();
                if (StringUtils.contains(name.getName(), FileConstant.C_PCB)) {
                    setFileEntity(fileEntity, filePathF);
                    break;
                } else if (StringUtils.contains(name.getName(), FileConstant.TOTAL)) {
                    setFileEntity(fileEntity, filePathF);
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileEntity;
    }

    public static void setFileEntity(FileEntity fileEntity, String filePath) {
        File file = new File(filePath);
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String str = "";
            while ((str = bufferedReader.readLine()) != null && !FileConstant.READ_END.equalsIgnoreCase(str.trim())) {
                setFieldFileEntity(fileEntity, str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 设置字段
     *
     * @param filed
     * @return
     */
    public static void setFieldFileEntity(FileEntity fileEntity, String filed) {
        List<String> list = Arrays.asList(filed.split(":"));
        for(int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i).trim());
        }
        if (StringUtils.equalsIgnoreCase(list.get(0), FileConstant.Power_Time)) {
            fileEntity.setPowerTime(Long.parseLong(list.get(1)));
        } else if (StringUtils.equalsIgnoreCase(list.get(0), FileConstant.Place_Time)) {
            fileEntity.setPlaceTime(Integer.parseInt(list.get(1)));
        } else if (StringUtils.equalsIgnoreCase(list.get(0), FileConstant.Wait_Time)) {
            fileEntity.setWaitTime(Integer.parseInt(list.get(1)));
        } else if (StringUtils.equalsIgnoreCase(list.get(0), FileConstant.Run_Time)) {
            fileEntity.setRunTime(Integer.parseInt(list.get(1)));
        } else if (StringUtils.equalsIgnoreCase(list.get(0), FileConstant.Stop_Time)) {
            fileEntity.setStopTime(Integer.parseInt(list.get(1)));
        } else if (StringUtils.equalsIgnoreCase(list.get(0), FileConstant.Idle_Time)) {
            fileEntity.setIdleTime(Integer.parseInt(list.get(1)));
        } else if (StringUtils.equalsIgnoreCase(list.get(0), FileConstant.In_Wait_Time)) {
            fileEntity.setInWaitTime(Integer.parseInt(list.get(1)));
        } else if (StringUtils.equalsIgnoreCase(list.get(0), FileConstant.Out_Wait_Time)) {
            fileEntity.setOutWaitTime(Integer.parseInt(list.get(1)));
        } else if (StringUtils.equalsIgnoreCase(list.get(0), FileConstant.Trans_Time)) {
            fileEntity.setTransTime(Integer.parseInt(list.get(1)));
        } else if (StringUtils.equalsIgnoreCase(list.get(0), FileConstant.Wrong_Stop_Time)) {
            fileEntity.setWrongStopTime(Integer.parseInt(list.get(1)));
        } else if (StringUtils.equalsIgnoreCase(list.get(0), FileConstant.Error_Stop_Time)) {
            fileEntity.setErrorStopTime(Integer.parseInt(list.get(1)));
        } else if (StringUtils.equalsIgnoreCase(list.get(0), FileConstant.Wrong_Stop_Count)) {
            fileEntity.setWrongStopCount(Integer.parseInt(list.get(1)));
        } else if (StringUtils.equalsIgnoreCase(list.get(0), FileConstant.Error_Stop_Count)) {
            fileEntity.setErrorStopCount(Integer.parseInt(list.get(1)));
        } else if (StringUtils.equalsIgnoreCase(list.get(0), FileConstant.Panel_In_Count)) {
            fileEntity.setPanelInCount(Integer.parseInt(list.get(1)));
        } else if (StringUtils.equalsIgnoreCase(list.get(0), FileConstant.Panel_Out_Count)) {
            fileEntity.setPanelOutCount(Integer.parseInt(list.get(1)));
        } else if (StringUtils.equalsIgnoreCase(list.get(0), FileConstant.Panel_Count)) {
            fileEntity.setPanelCount(Integer.parseInt(list.get(1)));
        } else if (StringUtils.equalsIgnoreCase(list.get(0), FileConstant.PCB_Count)) {
            fileEntity.setpCBCount(Integer.parseInt(list.get(1)));
        } else if (StringUtils.equalsIgnoreCase(list.get(0), FileConstant.Error_Pcb_Count)) {
            fileEntity.setErrorPcbCount(Integer.parseInt(list.get(1)));
        } else if (StringUtils.equalsIgnoreCase(list.get(0), FileConstant.Skip_PCB_Count)) {
            fileEntity.setSkipPCBCount(Integer.parseInt(list.get(1)));
        } else if (StringUtils.equalsIgnoreCase(list.get(0), FileConstant.Operation_Rate)) {
            fileEntity.setOperationRate(Double.parseDouble(list.get(1)));
        } else if (StringUtils.equalsIgnoreCase(list.get(0), FileConstant.Placement_Rate)) {
            fileEntity.setPlacementRate(Double.parseDouble(list.get(1)));
        } else if (StringUtils.equalsIgnoreCase(list.get(0), FileConstant.Mean_Time_PCB)) {
            fileEntity.setMeanTimePCB(Double.parseDouble(list.get(1)));
        } else if (StringUtils.equalsIgnoreCase(list.get(0), FileConstant.Real_Time_PCB)) {
            fileEntity.setRealTimePCB(Double.parseDouble(list.get(1)));
        } else if (StringUtils.equalsIgnoreCase(list.get(0), FileConstant.Transfer_Time_PCB)) {
            fileEntity.setTransferTimePCB(Double.parseDouble(list.get(1)));
        } else if (StringUtils.equalsIgnoreCase(list.get(0), FileConstant.Place_Count)) {
            fileEntity.setPlaceCount(Integer.parseInt(list.get(1)));
        }
    }
}
