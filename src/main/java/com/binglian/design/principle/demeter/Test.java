package com.binglian.design.principle.demeter;

/**
 * ������ԭ��
 * ���壺һ������Ӧ�ö��������󱣳����ٵ��˽⡣�ֽ�����֪��ԭ��
 * ��������������֮������
 * �ŵ㣺������֮�����ϡ�
 * ǿ��ֻ�����ѽ���������İ����˵��
 * ���ѣ������ڳ�Ա���������������롢��������е����Ϊ��Ա�����ࡣ�������ڷ������ڵ��಻����������
 * @author binglian
 *
 */
public class Test {

	public static void main(String[] args) {
		Boss boss=new Boss();
		TeamLeader teamLeader=new TeamLeader();
		boss.commandCheckNumber(teamLeader);

	}

}
