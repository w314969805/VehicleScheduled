package com.didispace.domain.s;

import lombok.Data;

import javax.persistence.*;

/**
 * @author 程序猿DD
 * @version 1.0.0
 * @date 16/3/21 下午3:35.
 * @blog http://blog.didispace.com
 */
@Entity
@Table(name = "T_GCD")
public class Vehicle {


    /**
     * 车架号
     */
    @Id
    @Column(nullable = false,name = "VIN")
    private String vin;

    /**
     * 车型名称
     */
    @Column(nullable = false,name = "VINDESC")
    private String vinDesc;

    /**
     * 车型代码
     */
    @Column(nullable = false,name = "SVOAPPROVAL")
    private String svoAppRoval;
    /**
     * 电机号
     */
    @Column(nullable = false,name = "MOTONO")
    private String motoNo;

    /**
     * 电池包
     */
    @Column(nullable = false,name = "S_AIRBAG")
    private String sAirBag;

    /**
     * tbox编号
     */
    @Column(nullable = false,name = "QHJNOTES")
    private String tboxId;

    /**
     * 删除表示
     */
    @Column(nullable = false,name = "DR")
    private String dr;

    /**
     * 是否已读表示
     */
    @Column(nullable = false,name = "FLG")
    private String flag;

    public Vehicle(){}

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getVinDesc() {
        return vinDesc;
    }

    public void setVinDesc(String vinDesc) {
        this.vinDesc = vinDesc;
    }

    public String getSvoAppRoval() {
        return svoAppRoval;
    }

    public void setSvoAppRoval(String svoAppRoval) {
        this.svoAppRoval = svoAppRoval;
    }

    public String getMotoNo() {
        return motoNo;
    }

    public void setMotoNo(String motoNo) {
        this.motoNo = motoNo;
    }

    public String getsAirBag() {
        return sAirBag;
    }

    public void setsAirBag(String sAirBag) {
        this.sAirBag = sAirBag;
    }

    public String getTboxId() {
        return tboxId;
    }

    public void setTboxId(String tboxId) {
        this.tboxId = tboxId;
    }

    public String getDr() {
        return dr;
    }

    public void setDr(String dr) {
        this.dr = dr;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
