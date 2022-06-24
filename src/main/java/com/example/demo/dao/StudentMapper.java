package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.bean.Student;

@Mapper
public interface StudentMapper {
	
	@Select("select * from salesforce.student__c")
	@Results(id = "studenMap", value={
			@Result(id = true, column = "id", property = "id"),
			@Result(column = "sfid", property = "sfid"),
			@Result(column = "name", property = "name"),
			@Result(column = "name__c", property = "name2"),
			@Result(column = "class__c", property = "cls"),
			@Result(column = "address__c", property = "address"),
			@Result(column = "lastmodifieddate", property = "lastModifiedDate"),
			@Result(column = "lastmodifiedbyid", property = "lastModifiedById"),
			@Result(column = "createddate", property = "createdDate"),
			@Result(column = "createdbyid", property = "createdById"),
			@Result(column = "education__c", property = "education"),
			@Result(column = "ownerid", property = "ownerId")
	})
	List<Student> findAllStudent();
	
	@Select("select * from salesforce.student__c where id =#{id}")
	@ResultMap("studenMap")
	List<Student> findStudentById(int id);
	
	@Delete("delete from salesforce.student__c where id =#{id}")
	void deleteStudentById(int id);
	
	@Update("update salesforce.student__c set name=#{name},name__c=#{name2},class__c=#{cls},education__c=#{education},address__c=#{address} where id =#{id}")
	void editStudentById(Student student);
	
	@Insert("insert into salesforce.student__c(name,name__c,class__c,education__c,address__c) values(#{name},#{name2},#{cls},#{education},#{address})")
	void insertStudent(Student student);

}
