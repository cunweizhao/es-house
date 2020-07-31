package com.zcw.eshouse.web.dto;

/**
 * @ClassName : SubwayStationDTO
 * @Description :
 * @Author : Zhaocunwei
 * @Date: 2020-07-31 18:39
 */
public class SubwayStationDTO {
    private Long id;
    private Long subwayId;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSubwayId() {
        return subwayId;
    }

    public void setSubwayId(Long subwayId) {
        this.subwayId = subwayId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
