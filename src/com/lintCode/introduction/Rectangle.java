package com.lintCode.introduction;

/**
 * ʵ��һ��������Rectangle���������µ�һЩ��Ա�����뺯����
	�������еĳ�Ա���� width �� height �ֱ�����Ⱥ͸߶ȡ�
	һ�����캯��������2������ width �� height ���趨����Ŀ�Ⱥ͸߶ȡ�
	һ����Ա���� getArea�������������������
 * @author Rick
 *
 */
public class Rectangle {

	private int width;
	private int height;
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	public int getArea(){
		return this.height * this.width;
	}
	
}
