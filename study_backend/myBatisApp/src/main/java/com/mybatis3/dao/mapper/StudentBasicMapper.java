package com.mybatis3.dao.mapper;

import java.util.List;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.mybatis3.domain.Student;

public interface StudentBasicMapper {
	/*
	 * 인터페이스의 풀네임은 StudentBasicMapper.xml 의 namespace와일치
	 * 메쏘드이름은 	StudentBasicMapper.xml 파일의 id와일치
	 * 메쏘드인자타입은 StudentBasicMapper.xml 파일의 parameterType 와일치
	 * 메쏘드리턴타입은 StudentBasicMapper.xml 파일의 resultType 와일치(ResultSet이 1개이상일경우는 List)
	 */
	@Select("SELECT STUD_ID, NAME, EMAIL, PHONE, DOB FROM STUDENTS WHERE STUD_ID = #{STUDID}")
	public Student findStudentById(@Param("STUDID") Integer studId);
	@Select("SELECT STUD_ID, NAME, EMAIL, PHONE, DOB FROM STUDENTS")
	public List<Student> findAllStudents();
	
	/******************StudentBasicMapper.xml*******************
	<select id="findStudentById" 
			parameterType="int"  
			resultType="com.mybatis3.domain.Student">
		select stud_id as studid,name,email,dob from students where stud_id = #{studId}
	</select>
	<select id="findAllStudents" 
			resultType="com.mybatis3.domain.Student">
		select stud_id ,name,email,dob from students
	</select>
	**************************************************/
	
}
