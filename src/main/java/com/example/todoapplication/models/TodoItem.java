package com.example.todoapplication.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "todo-items")
public class TodoItem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String description;

    private Boolean isComplete;

    private Instant createdAt;

    private Instant updatedAt;

    @Override
    public String toString()
    {
        return String.format("TodoItem{id='%d', description='%s', isComplete='%s', createdAt='%s', updatedAt='%s'}",
        id ,description,isComplete,createdAt,updatedAt);
    }

}
