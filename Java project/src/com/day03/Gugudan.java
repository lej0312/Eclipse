package com.day03;
//***gugudan sachik üũ
public class Gugudan {
	int dan;
	public Gugudan() {//������ ***�����ε�(���ڰ� �ٸ��� �����ϴ� ��?)

	}
	public Gugudan(int dan) {//***������
		this.dan=dan;
	}
	public void print() {
		for(int i=1;i<10;i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
	}
	
	public static void main(String[] args) {
		//�����ڴ� Ŭ���� �̸��̸� void�� ���� => ������� �ʱⰪ ����
		Gugudan g1=new Gugudan(5);//������
		g1.print();
		
		Gugudan g2=new Gugudan(6);
		g2.print();
	
		Gugudan g3=new Gugudan();//����Ʈ ������:���� ���������� �ٸ� �����ڰ� ���� ��� ���� �Ұ�->5�� �� ����
		g3.dan=8;
		g3.print();
	}

}
