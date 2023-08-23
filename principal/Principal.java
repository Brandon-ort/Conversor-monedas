package principal;

import javax.swing.JOptionPane;

import conversorMonedas.function;
import conversorTemperatura.functionTemperatura;

public class Principal {
	public static void main(String[] args) {
		
		function monedas = new function();
		functionTemperatura temperatura = new functionTemperatura();
		
		while(true) {
			String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion",
					"Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] 
					{"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion")).toString();
			switch(opciones) {
			
			case "Conversor de Moneda":
				String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
				if(ValidarNumero(input)==true) {
					double Minput = Double.parseDouble(input);
					monedas.ConvertirMonedas(Minput);
					
					int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversion?");
					if(JOptionPane.OK_OPTION==respuesta) {
						System.out.println("Selecciona opcion Afirmativa");
					}else {
						JOptionPane.showMessageDialog(null, "Programa Terminado");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Valor invalido");
				}
				break;
				
			case "Conversor de Temperatura":
				input = JOptionPane.showInputDialog("Ingresa el valor de la Tempeartura que deseas convertir: ");
				if(ValidarNumero(input) == true) {
					double Minput = Double.parseDouble(input);
					temperatura.ConvertirTemperatura(Minput);
					
					int respuesta = 0;
					respuesta = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?");
					if((respuesta == 0)&&(ValidarNumero(input)== true)) {
					}else {
						JOptionPane.showMessageDialog(null, "Programa terminado");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Valor invalido");
				}
				break;
			}
		}
	}
	
	public static boolean ValidarNumero(String input) {
		try {
			double x = Double.parseDouble(input);
			if(x > 0 || x < 0);
				return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
}
