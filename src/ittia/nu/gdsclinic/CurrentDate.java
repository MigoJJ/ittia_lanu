package ittia.nu.gdsclinic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

  	public class CurrentDate {
    	public static void c_time() {

    	LocalDateTime now = LocalDateTime.now();
    	// 현재 날짜/시간 출력
//    	System.out.println(now); // 2021-06-17T06:43:21.419878100
    	// 포맷팅
    	String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
    	// 포맷팅 현재 날짜/시간 출력
    	System.out.println(formatedNow); // 2021년 06월 17일 06시 43분 21초
    	}

  	}


