package com.farhan.q1;

import java.util.Scanner;

public class Mian {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Song songs[] = new Song[4];
		PlayList p = new PlayList();
		for (int i = 0; i < 4; i++) {
			System.out.println("Enter details of song " + (i + 1));
			System.out.println("Enter song name : ");
			String songName = sc.nextLine();
			System.out.println("Enter movie name : ");
			String movieName = sc.nextLine();
			songs[i] = new Song(movieName, songName);
			p.addSong(songs[i]);
		}
		for (Song s : p.songs) {
			s.play();
		}
		sc.close();
	}
}
