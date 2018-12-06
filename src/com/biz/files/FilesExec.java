package com.biz.files;

import com.biz.files.service.UserSe07;

public class FilesExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strName = "src/com/biz/files/우리말이름.txt";

		UserSe07 s = new UserSe07(strName);

		s.readFile();
		
		

	}

}
