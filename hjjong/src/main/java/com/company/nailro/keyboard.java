package com.company.nailro;

import java.util.Arrays;

public class keyboard {
	private String type;
	private String[] buttons;
	
	public String getType(){
		return type;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public String[] getButtons(){
		return buttons;
	}
	
	public void setButtons(String[] buttons){
		this.buttons = buttons;
	}
	
	@Override
	public String toString() {
		if(type.equals("text") ){
			return "[type= " + type + "]";
		}
		else{
			return "[type= " + type + ", buttons= " + Arrays.toString(buttons) + "]";
		}
		
	}
	
}
