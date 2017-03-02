package com.jr.dean;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.dean.bean.Class;
import com.dean.bean.Student;
import com.dean.bean.Teacher;
import com.jr.dean.TeacherDaoImpl;

/** 
 * @author ShengRong Ji 
 * @version ����ʱ�䣺2015-7-27 ����9:41:23 
 */

public class JrTest {
	@Test
	public void test() throws Exception{
		Teacher teacher = new Teacher();
		teacher.setTea_name("�³�");
		teacher.setTea_number("201411");
		
		Student student = new Student();
		student.setStu_name("��ʥ��");
		student.setStu_number("2014112109");
		student.setStu_pwd("blacksky");
		student.setStu_class("���һ��");
		student.setStu_pro("���");
		student.setStu_sex("��");
		student.setStu_xueyuan("��Ϣ��ѧ�뼼��ѧԺ");
		student.setCla_number("45");
		student.setTea_name("�³�");
		student.setTea_number("201411");
		
		List<Class> list1 = new ArrayList<Class>();
		list1 = new TeacherDaoImpl().getClass("201411");	//���ݽ�ʦ��Ŵ�class���ȡ�༶��������list��
		for(Class class1: list1){
			System.out.println(class1.getCla_number());
		}
//	1	new TeacherDaoImpl().addClass(teacher,"ͨ�Ź���");	//��class�����Ӱ༶
//	1	new TeacherDaoImpl().deleteClass(47);
		
		//���ݰ༶�Ŵ�student���ȡѧ����Ϣ,���浽list��
/*	1	List<Student> list = new ArrayList<Student>();
		list = new TeacherDaoImpl().getStudentInformation("45");
		for (Student student1:list){
			System.out.println(student1.getStu_number());
		}
*/	
		
//	1	new TeacherDaoImpl().addStudent(student);			//����ѧ����student����
//	0	new TeacherDaoImpl().excel_addStudent(teacher.getTea_name());	//���ݽ�ʦ�Ŵ�class����ҵ������Ϣ��excel����Ϣ�Ͳ��ҵ���Ϣ����student����
//		new TeacherDaoImpl().deleteStudent("2014112122","201411");		//����ѧ��ѧ�źͽ�ʦ��Ž���ѧ����student�����Ƴ�����ʵ����Ϊ�Ӹý�ʦ�༶���Ƴ���ѧ��
//	0	new TeacherDaoImpl().excel_getStudentInformation(tea_number);			//���ݽ�ʦ��Ŵ�student���н�ѧ����Ϣ������excel��
	}
}
