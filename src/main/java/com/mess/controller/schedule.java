package com.mess.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class schedule {
    
	 @Scheduled(cron="0/5 * *  * * ? ")   //每5秒执行一次    
     public void bTask(){   
           
           System.out.println("111"); 
     }    
}
