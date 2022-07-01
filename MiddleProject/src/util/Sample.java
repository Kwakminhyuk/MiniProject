package util;

import java.time.LocalDateTime;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;

import models.Member;

public class Sample {
	
	public static Vector<String> getMemberName(){
		Vector<String> memberName = new Vector<>();
		memberName.add("ID");
		memberName.add("USERNAME");
		memberName.add("PASSWORD");
		memberName.add("NAME");
		memberName.add("EMAIL");
		memberName.add("PHONE");
		memberName.add("CREATEDATE");
		
		return memberName;
	}
	
	public static Vector<Member> getMembers(){
		Vector<Member> members = new Vector<>();
		members.add(new Member(1,"summer","min7515","minhyuk","minhyuk@naver.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(2,"summer","min7515","minhyuk","minhyuk@naver.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(3,"summer","min7515","minhyuk","minhyuk@naver.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(4,"summer","min7515","minhyuk","minhyuk@naver.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(5,"summer","min7515","minhyuk","minhyuk@naver.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(6,"summer","min7515","minhyuk","minhyuk@naver.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(7,"summer","min7515","minhyuk","minhyuk@naver.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(8,"summer","min7515","minhyuk","minhyuk@naver.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(9,"summer","min7515","minhyuk","minhyuk@naver.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(10,"summer","min7515","minhyuk","minhyuk@naver.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(11,"summer","min7515","minhyuk","minhyuk@naver.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(12,"summer","min7515","minhyuk","minhyuk@naver.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(13,"summer","min7515","minhyuk","minhyuk@naver.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(14,"summer","min7515","minhyuk","minhyuk@naver.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(15,"summer","min7515","minhyuk","minhyuk@naver.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(16,"summer","min7515","minhyuk","minhyuk@naver.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(17,"summer","min7515","minhyuk","minhyuk@naver.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(18,"summer","min7515","minhyuk","minhyuk@naver.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(19,"summer","min7515","minhyuk","minhyuk@naver.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(20,"summer","min7515","minhyuk","minhyuk@naver.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(21,"summer","min7515","minhyuk","minhyuk@naver.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(22,"summer","min7515","minhyuk","minhyuk@naver.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		
		return members;
	}
}

