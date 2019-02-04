package com.samina.Data;
import org.springframework.stereotype.Repository;

import com.samina.Aspect.TrackTime;

@Repository
public class Dao1 {
	
	@TrackTime
	public String retrieveSomething(){
		return "Dao1";
	}

}
