package com.recallradar.entity;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name= "users" )

public class User{  

    public User(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(
        nullable=false
    )
    private String name;

    @Column(
        nullable = false,
        unique=true
    )
    private String email;

    @Column(
        nullable=false
    )
    private String password;

    @Column(
        nullable = false
    )
    private LocalDateTime registeredAt;

    private LocalDateTime lastLoginAt;

    @OneToMany(mappedBy = "user")
    private List<Topic> topics = new ArrayList<>();

    public Long getID(){
        return this.id;
    }

    public void setID(Long new_Id){
        this.id=new_Id;
    }
}
