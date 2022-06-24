package com.example.demo.bean;
import java.io.Serializable;
import java.sql.Timestamp;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Data
@Accessors(chain=true)
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String sfid;
    private String name;
    private String name2;
    private String cls;
    private String address;
    private String createdById;
    private Timestamp createdDate;
    private String education;
    private String lastModifiedById;
    private Timestamp lastModifiedDate;
    private String ownerId;

}