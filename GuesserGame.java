package com.asssignment3;

import java.util.Scanner;

class Guesser
{
	int Gusnum;
	
	public int gusnum()
	{
		Scanner sc = new Scanner ("system.in");
		System.out.println("Guesser kindly guess the number");
		Gusnum=sc.nextInt();
		return Gusnum;
		
	}
}

class Player 
{
	int Pgusnum;
	public int Pgusnum()
	{
		Scanner sc = new Scanner ("System.in");
		System.out.println("Player guess the number");
		Pgusnum = sc.nextInt();
		return Pgusnum;
	}
	
}

class Umpire 
{
	int numfromguesser;
	int numfromplayer1;
	int numfromplayer2;
	int numfromplayer3;
	
	void collectNumfromGuesser()
	{
		Guesser g = new Guesser();
		 numfromguesser=g.gusnum();
	}
	
	void CollectNumFromPlayer()
	{
		Player p1 = new Player();
		numfromplayer1=p1.Pgusnum();
		
		Player p2 = new Player();
		numfromplayer1=p2.Pgusnum();
		
		Player p3 = new Player();
		numfromplayer1=p3.Pgusnum();
	}
	
	void Compare()
	{
		if(numfromguesser==numfromplayer1)
		{
			System.out.println("Player1 Won the Game");
		}
		else if(numfromguesser==numfromplayer2)
		{
			System.out.println("Player2 Won the Game");
		}
		else if(numfromguesser==numfromplayer3)
		{
			System.out.println("Player3 Won the Game");
		}
		else 
		{
			System.out.println("Game Lost Try Again");
		}
	}
}

public class GuesserGame {

	public static void main(String[] args) {
		Umpire u1 = new Umpire();
		u1.collectNumfromGuesser();
		u1.CollectNumFromPlayer();
		u1.Compare();
		
	}
}
