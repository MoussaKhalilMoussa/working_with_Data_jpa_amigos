package com.example.demo3;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name="Student")
@Table(
        name = "Student",
        uniqueConstraints = {
                @UniqueConstraint(name = "student_email_unique" , columnNames = "email")
        }
)
public class Student {
    @Id
    @SequenceGenerator(
            name = "sequence_student",
            sequenceName = "sequence_student",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy =SEQUENCE,
            generator = "sequence_student"

    )
    @Column(
            name ="id",
            updatable = false
    )
    private Long id;
    @Column(
            name = "first_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String first_name;
    @Column(
            name = "last_Name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String last_Name;
    @Column(
            name = "email",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String email;
    @Column(
            name = "age",
            nullable = false
    )
    private Integer age;

    public Student() {
    }

    public Student(String first_name, String last_Name, String email, Integer age) {
        this.first_name = first_name;
        this.last_Name = last_Name;
        this.email = email;
        this.age = age;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + first_name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
