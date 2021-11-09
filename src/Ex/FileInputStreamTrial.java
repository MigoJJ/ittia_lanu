package Ex;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTrial {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream ("/home/migojj/jepansedoncjesuis/ittia/src/Ex/RC_2020__june01_july8/2020_07_01__김대희__7602241/2020_07_01__김대희__7602241_.txt");
		int data;
		while ((data = fis.read()) != -1) {
			System.out.write(data);
		}
		System.out.flush();
		fis.close();
	}
}