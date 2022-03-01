package com.vin.easychinese.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DictWord {
    @Id
    @GeneratedValue
    @Column(updatable = false, nullable = false)
    Long wordId;

    @Column
    String wordText;
    @Column
    String wordPron;
    @Column
    String wordPronAudio;
    @Column
    String wordTags;
    @Column
    String wordDefinition;
    @Column
    String wordExample;
}
