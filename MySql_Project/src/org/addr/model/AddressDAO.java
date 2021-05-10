package org.addr.model;

import java.util.ArrayList;

public interface AddressDAO {
	//�߰�
	public void addressInsert(Address address);
	//��ü����
	public ArrayList<Address> getAddress(String field, String word);
	//�󼼺���
	public Address findByNum(int num);
	//����
	public void addressUpdate(Address address);
	//����
	public void addressDelete(int num);
	//����
	public int getCount(String field, String word);
	//�����ȣ �˻�
	public ArrayList<Zipcode> findZipcode(String dong);
	
}
