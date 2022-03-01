package com.vin.easychinese.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubTitle {
    @Id
    @GeneratedValue
    @Column(updatable = false, nullable = false)
    Long subTitleId;

    @Column
    String subTitle;
    @Column
    Date fromTime;
    @Column
    Date toTime;
    @Column
    String subLink;
    @Column
    Date createdDate;
    @Column
    Integer createdBy;
    @Column
    Date updatedDate;
    @Column
    Integer updatedBy;
}
