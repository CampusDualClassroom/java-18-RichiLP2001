package com.campusdual.classroom;

import com.campusdual.util.Utils;

import java.util.Arrays;

public class Exercise18 {
	//crea un array de enteros con el
	// tamaño especificado por el parametro.
	public static int [] createEmptyIntArray(int positions){
		return new int[positions];
	}

	//crear un array de 3 elementos tipo String y los inicializa
	// con valores númericos como cadena
	public static String[] createInitializedStringArray(int i){




		return new String []{"1", "2","3"};

	}

	//ASIGNA el VALOR "value" al indice "index" del array
	public static void populateArray(int[] array, int index, int value){
		array[index]=value;
	}

	public  static int[] createAndInitializeArray(int espacios){
		//array creado
		int[] array= new int[espacios];
		//muestra el valor de las posiciones
		//System.out.println(Arrays.toString(array));
		//asignacion de valores a las posiciones.
		for(int i=0;i<espacios;i++){
			//position numero i--> le asignamos el valor = "i+1"
			array[i]= i+1;
			//System.out.println("Posicion: "+i+" - El valor que tiene: "+array[i]);
		}
		//muestra el valor de las posiciones
		//-->System.out.println(Arrays.toString(array));
		return array;
	}

	public static void showInlineArray(int []showArray){

		for (int i=0;i< showArray.length;i++){
			if (i!= showArray.length-1){
				System.out.println(showArray[i]+" ");
			}else{
				System.out.println(showArray[i]);
			}

			//System.out.println("El valor de la posicion: "+i+" es "+showArray[i]);
		}

	}

	public static void main(String[] args) {

		int [] valores=createAndInitializeArray(4);
		showInlineArray(valores);
		//showInlineArray(new int[]{6,7,8,9});

		/*int [] palabra1 = new int[2];
			palabra1[0] = 10;
			palabra1[1] = 15;
		showInlineArray(palabra1);*/





	}
}
