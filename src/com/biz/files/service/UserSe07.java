package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.files.vo.UserVO;

public class UserSe07 {

	List<UserVO> userList;
	String strFileName;

	public UserSe07(String strFileName) {
		userList = new ArrayList();
		this.strFileName = strFileName;
	}

	public void readFile() {
		strFileName = "src/com/biz/files/우리말이름.txt";

		FileReader fr;
		BufferedReader buffer;

		try {
			fr = new FileReader(strFileName);
			buffer = new BufferedReader(fr);

			while (true) {
				String strRead = buffer.readLine();
				if (strRead == null)
					break;
				String[] strSp = strRead.split(":");

				UserVO vo = new UserVO();
				vo.setStrName(strSp[0]);
				vo.setStrId(makeId());
				userList.add(vo);
				System.out.println(vo);

			}

			buffer.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // try end

	}

	public String makeId() {
		int intId = (int) (Math.random() * (200 - 100 + 1)) + 100;
		String strId = intId + "";
		return strId;
	}

}
