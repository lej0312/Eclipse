package com.day09;

//p411
public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		Member memberLee1 = new Member(1001, "ȫ�浿1");
		Member memberLee2 = new Member(1002, "ȫ�浿2");
		Member memberLee3 = new Member(1003, "ȫ�浿3");
		Member memberLee4 = new Member(1004, "ȫ�浿4");

		memberArrayList.addMember(memberLee1);
		memberArrayList.addMember(memberLee2);
		memberArrayList.addMember(memberLee3);
		memberArrayList.addMember(memberLee4);

		memberArrayList.showAllMember();

		memberArrayList.removeMember(memberLee1.getMemberId());
		memberArrayList.showAllMember();

	}

}
