public class Main {

	public static void main(String[] args) {
			
	 int horas;
	 float total=0;
	 
	 horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas"));
	 
	
	 /*for (int i=0; i<horas; i++) {
		 	if (horas<=40) {
		 			total += 16;
		 	}
		 		if (horas > 40) {
		 			total = 640 + (20*(i-39));
		 		}
	 }UNA SOLUCUION */
	 
	 /*OTRA SOLUCION*/
	 if (horas <= 40) {
		 total = horas*16;
	 }
	 else {
		 total = (40*16) + ((horas - 40) *20);
	 }
	 

	 
	 JOptionPane.showMessageDialog(null, "El sueldo es de " + total);
	}
}
