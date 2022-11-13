package com.java.db.data.instance;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class DataInstance {
    @Id
    @SequenceGenerator(
            name = "entry_sequence",
            sequenceName = "entry_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "entry_sequence"
    )
    private Long id;
    private String msg;
    private LocalDate timestamp;

    public DataInstance() {
    }

    public DataInstance(Long id, String msg, LocalDate timestamp) {
        this.id = id;
        this.msg = msg;
        this.timestamp = timestamp;
    }

    public DataInstance(String msg, LocalDate timestamp) {
        this.msg = msg;
        this.timestamp = timestamp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "DataInstance{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
