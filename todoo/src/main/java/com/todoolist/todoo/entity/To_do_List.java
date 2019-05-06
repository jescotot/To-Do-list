package com.todoolist.todoo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@ToString
@NoArgsConstructor
@Table(name = "Lists")
@EqualsAndHashCode
public class To_do_List {

        @Id
        @Column(name = "id", nullable = false)
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name = "title")
        private String title;

        @JsonManagedReference
        @OneToMany( cascade = CascadeType.ALL, targetEntity = To_do_task.class )
        @JoinColumn(name = "to_do_list_id")
        private List<To_do_task> tasks = new ArrayList<>();

        public To_do_List(String title ) {
                this.title = title;
        }
}
