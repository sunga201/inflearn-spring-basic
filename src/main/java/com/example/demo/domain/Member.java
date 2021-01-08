package com.example.demo.domain;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

@Repository
@Getter
@Setter
public class Member {

    private Long id;

    private String name;
}
