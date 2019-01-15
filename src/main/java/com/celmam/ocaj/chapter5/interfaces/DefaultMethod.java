package com.celmam.ocaj.chapter5.interfaces;

//An interface cannot implement interfaces with the same signature default name
public class DefaultMethod implements juego1,juego2 {
	
}


interface juego1{
	default String play() {
		return "juego1"	;
	}
	
}


interface juego2{
	
	default String play() {
		return "juego2"	;
	}
	
}