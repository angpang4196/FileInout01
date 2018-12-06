package com.biz.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilesExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strName = "src/com/biz/files/우리말이름.txt";

		FileReader fr;
		BufferedReader buffer;

		try {
			fr = new FileReader(strName);
			buffer = new BufferedReader(fr);

			while (true) {
				String strRead = buffer.readLine();
				if (strRead == null)
					break;
				System.out.println(strRead);
			}
			buffer.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
