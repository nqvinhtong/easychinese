package com.vin.easychinese.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Video {
    @Id
    @GeneratedValue
    @Column(updatable = false, nullable = false)
    Long videoId;

    @Column
    String title;
    @Column
    String description;
    @Column
    String link;


    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "video_id", insertable = false, updatable = false)
    private List<SubTitle> subTitles;

//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name = "video_word",
//            joinColumns = @JoinColumn(name = "video_id", referencedColumnName = "video_id"),
//            inverseJoinColumns = @JoinColumn(name = "word_id", referencedColumnName = "word_id"))
//    private Set<DictWord> videoWords;
}
