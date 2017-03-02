package com.jr.dean;

import java.util.List;

import com.dean.bean.Student;
import com.dean.bean.Teacher;

/** 
 * @author ShengRong Ji 
 * @version ����ʱ�䣺2015-7-26 ����3:25:05 
 */

public interface TeacherDao {
	public List<Class> getClass(String tea_number);	//���ݽ�ʦ��Ŵ�class���ȡ�ý�ʦ�Ŀγ���Ϣ��������list��
	public void addClass(Teacher teacher,String course_name);	//��class�����Ӱ༶
	public void deleteClass(int cla_number);			//��class��ɾ���༶
	public List<Student> getStudentInformation(int cla_number);	//���ݰ༶�Ŵ�student���ȡѧ����Ϣ,���浽list��
	public void addStudent(Student student);			//����ѧ����student����
	public void excel_addStudent(String tea_number);	//���ݽ�ʦ�Ŵ�class����ҵ������Ϣ��excel����Ϣ�Ͳ��ҵ���Ϣ����student����
	public void deleteStudent(String stu_number,String tea_number);		//����ѧ��ѧ�źͽ�ʦ��Ž���ѧ����student�����Ƴ�����ʵ����Ϊ�Ӹý�ʦ�༶���Ƴ���ѧ��
	public void excel_getStudentInformation(String tea_number);			//���ݽ�ʦ��Ŵ�student���н�ѧ����Ϣ������excel��
	
	//made by jimo
	public boolean CheckTeacherLog(String number,String psw);
}
