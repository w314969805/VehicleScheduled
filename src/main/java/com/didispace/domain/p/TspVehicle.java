package com.didispace.domain.p;

import lombok.Data;

import javax.persistence.*;

/**
 * @author 程序猿DD
 * @version 1.0.0
 * @date 16/3/21 下午3:35.
 * @blog http://blog.didispace.com
 */
@Entity
@Table(name = "tsp_vehicle")
public class TspVehicle {

    @Id
    @GeneratedValue
    private Long id;



    /**d
     *经销商
     */
    @Column(nullable = true)
    private String dealer;

    /**
     * 车架号
     */
    @Column(nullable = false,name = "VIN")
    private String vin;


    /**
     *电机号
     */
    @Column(name = "power_no")
    private String powerNo;
    /**
     *电机号
     */
    @Column(name = "tbox_sn")
    private String tboxSn;

    public TspVehicle() {
    }

    public TspVehicle(String dealer, String vin, String powerNo) {
        this.dealer = dealer;
        this.vin = vin;
        this.powerNo = powerNo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDealer() {
        return dealer;
    }

    public void setDealer(String dealer) {
        this.dealer = dealer;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getPowerNo() {
        return powerNo;
    }

    public void setPowerNo(String powerNo) {
        this.powerNo = powerNo;
    }

    public String getTboxSn() {
        return tboxSn;
    }

    public void setTboxSn(String tboxSn) {
        this.tboxSn = tboxSn;
    }
}
