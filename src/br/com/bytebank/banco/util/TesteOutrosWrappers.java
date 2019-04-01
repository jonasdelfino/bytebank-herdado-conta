package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29); //autoboxing
        System.out.println(idadeRef.intValue()); //unboxing

        Double dRef = Double.valueOf(3.2);//autoboxing
        System.out.println(dRef.doubleValue());//unboxing
     
        
        Boolean bRef = Boolean.FALSE;
        System.out.println(bRef.booleanValue());
        
        List<Number> numero = new ArrayList<>();
        numero.add(2);
        numero.add(12.5);
	}
}
