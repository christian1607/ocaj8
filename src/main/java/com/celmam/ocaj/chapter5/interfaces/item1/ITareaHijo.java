package com.celmam.ocaj.chapter5.interfaces.item1;

public interface ITareaHijo extends ITareaPadre{

	public default String saludarFamilia() {

		return "Buenos dias Mama y Papa";
	}

}
