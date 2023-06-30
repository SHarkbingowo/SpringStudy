package com.spring.study.domain;
import lombok.Data;
import java.io.Serializable;

@Data
public class Brand implements Serializable {
    private Integer id;

    private String brandName;

    private String companyName;

    private String order;

    private String description;

    private Integer status;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", brandName='" + brandName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", order='" + order + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}
