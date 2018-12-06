package com.biz.files;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.biz.files.vo.UserVO;

public class UserSe01 {

	List<UserVO> userList;

	public UserSe01() {
		userList = new ArrayList();
	}

	public void makeId() {
		int intNum = 0;

		for (int i = 0; i < 10; i++) {
			UserVO vo = new UserVO();

			int intRan = (int) (Math.random() * (200 - 100 + 1)) + 100;
			intNum = intRan;

			vo.setStrId(intNum + "");
			userList.add(vo);
			System.out.println(userList.get(i));
		}
		
	}
}
