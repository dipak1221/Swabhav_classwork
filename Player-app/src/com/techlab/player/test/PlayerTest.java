package com.techlab.player.test;

import com.techlab.player.Player;

public class PlayerTest {
	public static Player elder;

	public static void main(String[] args) {
		Player[] p = new Player[4];
		p[0] = new Player(22, "abc1");
		p[1] = new Player(25, "abc2");
		p[2] = new Player(125, "abc3");
		p[3] = new Player(20, "abc4");
		for (int i = 0; i < p.length; i++) {
			System.out.println("ID = " + p[i].getId() + 
					" name "
					+ p[i].getName());
		}

	}
}
