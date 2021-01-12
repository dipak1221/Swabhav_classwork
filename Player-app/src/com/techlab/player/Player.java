package com.techlab.player;
public class Player {
	static private int counter=100;
	private int age;
	private String name;
	private int id;
	
	public Player(int age, String name) {
		this.age = age;
		this.name = name;
		this.id=++counter;
	}
	public int getId() {
		return id;
	}
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
//	public boolean isElder=false;
//	public void whoIsElder(Player p){
//		int res=this.getAge()-p.getAge();
//		if(res>0)
//			isElder=true;	
//	}
	
	
}
