package cafeteria;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Cafe cafe = new Cafe (1, "Latte", 1.50);
		Cafe flatwhite = new Cafe (2, "flatwhite", 2.50);
		Cafe lagrima = new Cafe (3, "lagrima", 1.30);
		Cafe expreso = new Cafe (4, "expreso", 1.0);
		
		LinkedList<Cafe> cafes = new LinkedList<>();
		cafes.add(cafe);
		cafes.add(flatwhite);
		cafes.add(lagrima);
		cafes.add(expreso);
		
		Encargado encargado = new Encargado("maia", 1, 2);
		
		LinkedList<Cafe> ventas = new LinkedList<>();
		
		Menu(encargado, cafe, ventas);
	
		
		}
	
	
	public static void Menu(Encargado encargado, Cafe cafe, LinkedList<Cafe> ventas) {

		JOptionPane.showMessageDialog(null, "Bienvenido a la cafeteria");
		do {
			JOptionPane.showMessageDialog(null, "Debera validar su condicion de empleado");
			if (Ingresoencargado(encargado)) {
				JOptionPane.showMessageDialog(null, "Ingreso permitido.");
				JOptionPane.showMessageDialog(null, "Hola! " + encargado.getNom());
				cargarventa(cafe, encargado, ventas);
				borrarventa(encargado, ventas);
			} else {
				JOptionPane.showMessageDialog(null, "Ingreso denegado. ID o contraseña incorrectos");
			}	
		} while (Ingresoencargado(encargado)==false); 
		
	}
	
	public static boolean Ingresoencargado(Encargado encargado) {
		// id = 1 --- contraseña = 2
		String n;
		int id, cont;
		n=JOptionPane.showInputDialog("Ingrese su nombre");
		Encargado enc = new Encargado(n, 1, 2);
		id=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su id"));
		cont=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su contraseña"));
		
		if (id==enc.getId()) {
			if (cont==enc.getContraseña()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
		
	}
	
	public static void cargarventa(Cafe cafe, Encargado encargado, LinkedList<Cafe> ventas) {
		int t, b=0, tot=0, totdesc=0, tlatte=0, tflat=0, tlagrima=0, texpreso=0;
		double totprecio=0;
		do {
			tot++;
			Cafe cafe1 = new Cafe(1, "Latte", 1.50);
			JOptionPane.showMessageDialog(null, "Ingrese el tipo de cafe que va a tomar:");
			int a=Integer.parseInt(JOptionPane.showInputDialog(" 1- Latte \n 2- Flatwhite \n 3- Lagrima \n 4- Expreso \n"));
			switch (a) {
			case 1:
				cafe.setId(1);
				cafe1.setTipo("Latte");
				tlatte++;
				do {
					t= Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si tiene tarjeta de socio, 0 si no tiene"));
					if (t==1) {
						JOptionPane.showMessageDialog(null, "Tiene un 15% de descuento");
						cafe1.setPrecio(1.5 - 1.5*0.15);
						JOptionPane.showMessageDialog(null, "El precio es: " + cafe1.getPrecio());
						totdesc++;
						totprecio= totprecio + cafe1.getPrecio();
					} else if (t==0) {
						cafe1.setPrecio(1.5);
						JOptionPane.showMessageDialog(null, "El precio es: " + cafe1.getPrecio());
						totprecio= totprecio + cafe1.getPrecio();
					} else {
						JOptionPane.showMessageDialog(null, "Opcion incorrecta");
					}
				} while (t!=1 && t!=2);
				ventas.add(cafe1);
				
				break;
			case 2:
				cafe.setId(2);
				cafe1.setTipo("Flatwhite");
				tflat++;
				do {
					t= Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si tiene tarjeta de socio, 0 si no tiene"));
					if (t==1) {
						JOptionPane.showMessageDialog(null, "Tiene un 15% de descuento");
						cafe1.setPrecio(2.5 - 2.5*0.15);
						JOptionPane.showMessageDialog(null, "El precio es: " + cafe1.getPrecio());
						totdesc++;
						totprecio= totprecio + cafe1.getPrecio();
					} else if (t==0) {
						cafe1.setPrecio(2.5);
						JOptionPane.showMessageDialog(null, "El precio es: " + cafe1.getPrecio());
						totprecio= totprecio + cafe1.getPrecio();
					} else {
						JOptionPane.showMessageDialog(null, "Opcion incorrecta");
				}
				} while (t!=1 && t!=2);
				ventas.add(cafe1);
				break;
				
			case 3:
				cafe.setId(3);
				cafe1.setTipo("Lagrima");
				tlagrima++;
				do {
					t= Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si tiene tarjeta de socio, 0 si no tiene"));
					if (t==1) {
						JOptionPane.showMessageDialog(null, "Tiene un 15% de descuento");
						cafe1.setPrecio(1.3 - 1.3*0.15);
						JOptionPane.showMessageDialog(null, "El precio es: " + cafe1.getPrecio());
						totdesc++;
						totprecio= totprecio + cafe1.getPrecio();
					} else if (t==0) {
						cafe1.setPrecio(1.3);
						JOptionPane.showMessageDialog(null, "El precio es: " + cafe1.getPrecio());
						totprecio= totprecio + cafe1.getPrecio();
					} else {
						JOptionPane.showMessageDialog(null, "Opcion incorrecta");
					}
				} while (t!=1 && t!=2);
				ventas.add(cafe1);
				break;
				
			case 4:
				cafe.setId(4);
				cafe1.setTipo("Expreso");
				texpreso++;
				do {
					t= Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si tiene tarjeta de socio, 0 si no tiene"));
					if (t==1) {
						JOptionPane.showMessageDialog(null, "Tiene un 15% de descuento");
						cafe1.setPrecio(1 - 1*0.15);
						JOptionPane.showMessageDialog(null, "El precio es: " + cafe1.getPrecio());
						totdesc++;
						totprecio= totprecio + cafe1.getPrecio();
					} else if (t==0) {
						cafe1.setPrecio(1);
						JOptionPane.showMessageDialog(null, "El precio es: " + cafe1.getPrecio());
						totprecio= totprecio + cafe1.getPrecio();
					} else {
						JOptionPane.showMessageDialog(null, "Opcion incorrecta");
					}	
				} while (t!=1 && t!=2);
				ventas.add(cafe1);
				break;
				
			default:
				
				break;
			}
			
			b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 0 para salir, cualquier otro numero para digitar otra venta"));
		
		} while (b!=0);
		
		int max=0;
		String c="";
		
		int [] listot = new int [4];
		listot[0] = tlatte;
		listot[1] = tflat;
		listot[2] = tlagrima;
		listot[3] = texpreso;
		
		String [] listot2 = new String [4];
		listot2[0] = "Latte";
		listot2[1] = "Flatwhite";
		listot2[2] = "Lagrima";
		listot2[3] = "Expreso";
		
		for (int i = 0; i < listot.length; i++) {
			if (listot[i]>max) {
				max = listot[i];
				c = listot2[i];
			} 
		}	
		
		
		JOptionPane.showMessageDialog(null, "La cantidad de ventas totales son: " + tot);
		JOptionPane.showMessageDialog(null, "Los cafe vendidos en el dia son: " + ventas);
		JOptionPane.showMessageDialog(null, "La cantidad de ventas con descuento son: " + totdesc);
		JOptionPane.showMessageDialog(null, "La recaudacion total del dia es de: " + totprecio + " pesos");
		JOptionPane.showMessageDialog(null, "El cafe mas vendido es: " + c + " \n Con: " + max + " ventas en el dia");
		
	}
	
	
	public static void borrarventa(Encargado encargado, LinkedList<Cafe> ventas) {
		String s="";
		do {	
			JOptionPane.showMessageDialog(null, "SE LE PERMITE BORRAR LAS VENTAS QUE DESEE ");
			JOptionPane.showMessageDialog(null, "La lista de ventas es: " + ventas);
			String borrar= JOptionPane.showInputDialog("Desea borrar alguna venta?");
			if (borrar.equalsIgnoreCase("si")) {
				int	e=Integer.parseInt(JOptionPane.showInputDialog("Digite la posicion de la venta que desea borrar comenzando por el 0"));
				ventas.remove(e);
			} 
			
			JOptionPane.showMessageDialog(null, "La lista de ventas actualizada es: " + ventas);
			s=JOptionPane.showInputDialog("Escriba salir finalizar");
		
		} while (!s.equalsIgnoreCase("salir"));
		
	}
	
	
	
	
}