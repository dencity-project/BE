package com.example.be.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;

    @Column
    private String email;

    @Column
    private String accountName;

    @Column
    private String accountPw;

    @Builder
    public User(String email, String accountName, Boolean isAccepted, Boolean isDeleted){
        this.email=email;
        this.accountName=accountName;
    }
}
