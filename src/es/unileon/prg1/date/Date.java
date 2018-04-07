package es.unileon.prg1.date;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.time.LocalDateTime;
import java.time.Duration;;
/**
 * Clase que almacena fechas y permite operar con ellas a través de diferentes métodos.
 * @version 1.0 final
 * @author Javier Carracedo Esteban
 *
 */
public class Date {
	/**
	 * Atributos de la clase.
	 */
	private int day;
	private int month;
	private int year;
	/**
	 * Metodo get.
	 * @return day
	 */
	public int getDay() {
		return day;
	}
	/**
	 * Metodo set.
	 * @param day
	 */
	public void setDay(int day) {
		this.day = day;
	}
	/**
	 * Medoto get.
	 * @return month
	 */
	public int getMonth() {
		return month;
	}
	/**
	 * Metodo set.
	 * @param month
	 */
	public void setMonth(int month) {
		this.month = month;
	}
	/**
	 * Metodo set.
	 * @param year
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * Medodo get.
	 * @return year
	 */
	public int getYear(){
		return this.year;
	}
	/**
	 * Constructor con parametros
	 * @param day
	 * @param month
	 * @param year
	 */
	public Date(int day, int month, int year){
		if(correctedDayAndMonth(day, month) && 0<year){ 
			setDay(day);
			setMonth(month);
			setYear(year);
		}else{
			setDay(1);
			setMonth(1);
			setYear(2018);
		}
	}
	/**
	 * Constructor por defecto. Crea la fecha 1-1-2018 por defecto.
	 */
	public Date(){
		setDay(1);
		setMonth(1);
		setYear(2018);
	}
	/**
	 * Contructor que crea una fecha a partir de otra fecha que se le pasa por parámetro.
	 * @param d Fecha que se le pasa por parámetro.
	 */
	public Date(Date d){
		setDay(d.getDay());
		setMonth(d.getMonth());
		setYear(d.getYear());
	}
	/**
	 * Método que comprueba si una fecha es válida dentro de un rango de días y meses. (Importante: No existen años bisiestos).
	 * @param d Parámetro que contiene el día de la fecha.
	 * @param m Parámetro que contiene el mes de la fecha.
	 * @return True si es un una fecha valida, y false si no la es.
	 */
	public boolean correctedDayAndMonth(int d, int m){
		
		//Switch para los diferentes meses.
		switch (m) {
			case 1://Enero
				if(0<d && d<=31){return true;}
				break;		
			case 2://Febrero
				if(0<d && d<=28){return true;}
				break;
			case 3://Marzo
				if(0<d && d<=31){return true;}
				break;
			case 4://Abril
				if(0<d && d<=30){return true;}
				break;
			case 5: //Mayo
				if(0<d && d<=31){return true;}
				break;
			case 6: //Junio
				if(0<d && d<=30){return true;}
				break;
			case 7: //Julio 
				if(0<d && d<=31){return true;}
				break;
			case 8: //Agosto
				if(0<d && d<=31){return true;}
				break;
			case 9: //Septiembre
				if(0<d && d<=30){return true;}
				break;
			case 10: //Octubre
				if(0<d && d<=31){return true;}
				break;
			case 11: //Noviembre
				if(0<d && d<=30){return true;}
				break;
			case 12: //Diciembre
				if(0<d && d<=31){return true;}
				break;
			default: //Cualquier otra fecha es inválida.
			}
		return false;
	}
	/**
	 * Método que comprueba si una fecha y otra que se le pase por parámetro son del mismo año.
	 * @param another Fecha que se le pasa por parámtro.
	 * @return True si son del mismo año, False en caso contrario.
	 */
	public boolean isSameYearIF(Date another){
		if ( this.getYear() == another.getYear() ){
			return true;
		}
		return false;
	}
	/**
	 * Método que comprueba si una fecha y otra que se le pase por parámetro son de mismo mes.
	 * @param another Fecha que se le pasa por parámtro.
	 * @return True si son del mismo mes, False en caso contrario.
	 */
	public boolean isSameMonthIF(Date another){
		if (this.getMonth() == another.getMonth()){
			return true;
		}
		return false;
	}
	/**
	 * Método que comprueba si una fecha y otra que se le pase por parámetro, son del mismo día.
	 * @param another Fecha que se le pasa por parámtro.
	 * @return True si son del mismo día, False en caso contrario.
	 */
	public boolean isSameDayIF(Date another){
		if (this.getDay() == another.getDay()){
			return true;
		}
		return false;
	}
	/**
	 * Método que comprueba si una fecha y otra que se le pase por parámetro son exactamente iguales, es decir del mismo día, mes y año.
	 * @param another Fecha que se le pasa por parámtro.
	 * @return True si son exaxtamente la misma False en caso contrario.
	 */
	public boolean isSameIF(Date another){
		return equals(another);
	}
	/**
	 * Método (SIN SENTENCIA IF) que comprueba si una fecha y otra que se le pase por parámetro son del mismo año.
	 * @param another Fecha que se le pasa por parámtro.
	 * @return True si son del mismo año, False en caso contrario.
	 */
	public boolean isSameYear(Date another){
		return (this.getYear() == another.getYear())? true:false;
	}
	/**
	 * Método (SIN SENTENCIA IF) que comprueba si una fecha y otra que se le pase por parámetro son de mismo mes.
	 * @param another Fecha que se le pasa por parámtro.
	 * @return True si son del mismo mes, False en caso contrario.
	 */
	public boolean isSameMonth(Date another){
		return (this.getMonth() == another.getMonth())? true:false;
	}
	/**
	 * Método (SIN SENTENCIA IF) que comprueba si una fecha y otra que se le pase por parámetro, son del mismo día.
	 * @param another Fecha que se le pasa por parámtro.
	 * @return True si son del mismo día, False en caso contrario.
	 */
	public boolean isSameDay(Date another){
		return (this.getDay() == another.getDay())? true:false;
	}
	/**
	 * Método (SIN SENTENCIA IF) que comprueba si una fecha y otra que se le pase por parámetro son exactamente iguales, es decir del mismo día, mes y año.
	 * @param another Fecha que se le pasa por parámtro.
	 * @return True si son exaxtamente la misma False en caso contrario.
	 */
	public boolean isSame(Date another){
		return equals(another);
	}
	/**
	 * Método que imprime por consola los meses de una fecha. 
	 */
	public void printNameMonth(){
		switch (this.getMonth()) {
		case 1: System.out.println("Enero"); break;
		case 2: System.out.println("Febrero"); break;
		case 3: System.out.println("Marzo"); break;
		case 4: System.out.println("Abril"); break;
		case 5: System.out.println("Mayo"); break;
		case 6: System.out.println("Junio"); break;
		case 7: System.out.println("Julio"); break;
		case 8: System.out.println("Agosto"); break;
		case 9: System.out.println("Septiembre"); break;
		case 10: System.out.println("Octubre"); break;
		case 11: System.out.println("Noviembre"); break;
		case 12: System.out.println("Diciembre"); break;
		default: System.out.println("Mes invalido");//Nunca llegará aquí porque los meses son válidos.
		}
	}
	/**
	 * Metodo que imprime por consola la estación de un mes. Considera meses y días.
	 * Las estaciones comienzan el 21 de marzo, junio,septiembre y diciembre.
	 */
	public void printSeasonOfMonth(){
		switch (this.getMonth()) {
		case 12:
			if(this.getDay()<21){
				System.out.println("Otoño.");
			}else{
				System.out.println("Invierno.");
			}
			break;
		case 1: case 2:
			System.out.println("Invierno.");
			break;
		case 3: 
			if(this.getDay()<21){
				System.out.println("Invierno.");
			}else{
				System.out.println("Primavera.");
			}
			break;
		case 4: case 5:
			System.out.println("Primavera.");
			break;
		case 6: 
			if(this.getDay()<21){
				System.out.println("Primavera.");
			}else{
				System.out.println("Verano.");
			}
			break;
		case 7: case 8: 
			System.out.println("Verano.");
			break;
		case 9: 
			if(this.getDay()<21){
				System.out.println("Verano.");
			}else{
				System.out.println("Otoño.");
			}
			break;
		case 10: case 11:
			System.out.println("Invierno.");
			break;
		default:
			break;
		}
	}
	/**
	 * Método que imprime los meses que quedan desde la fecha hasta el final del año.
	 */
	public void printMonthLeftOfUntil(){
		System.out.println("Quedan " + (12-this.getMonth()) + " meses, hasta acabar el año.");
	}
	/**
	 * Método para imprimir una fecha.
	 */
	public void printDate(){
		System.out.println("Fecha: " + this.toString());
	}
	/**
	 * Método que devuelve el numero de días que tiene el mes.
	 * @return : numero de días.
	 */
	private int numberDaysOfMonth(){
		switch (this.getMonth()) {
			case 1: return 31; //Enero
			case 2: return 28;//Febrero
			case 3: return 31;//Marzo
			case 4: return 30;//Abril
			case 5: return 31;//Mayo
			case 6: return 30;//Junio
			case 7: return 31;//Julio
			case 8: return 31;//Agosto
			case 9: return 30;//Septiembre
			case 10: return 31;//Octubre
			case 11: return 30;//Noviembre
			case 12: return 31;//Diciembre
			
			default: return 0; //Nunca llegará aquí porque las fechas son válidas siempre cuando se llama a este método.
		}
	}
	/**
	 * Método que devuelve el numero de días que tiene el mes que se le pase por parámtro.
	 * @return : numero de días.
	 * @param : mes a comprobar. 
	 */
	private int numberDaysOfMonth(int n){
		switch (n) {
			case 1: return 31; //Enero
			case 2: return 28;//Febrero
			case 3: return 31;//Marzo
			case 4: return 30;//Abril
			case 5: return 31;//Mayo
			case 6: return 30;//Junio
			case 7: return 31;//Julio
			case 8: return 31;//Agosto
			case 9: return 30;//Septiembre
			case 10: return 31;//Octubre
			case 11: return 30;//Noviembre
			case 12: return 31;//Diciembre
			
			default: return 0; //Nunca llegará aquí porque las fechas son válidas siempre cuando se llama a este método.
		}
	}
	/**
	 * Metodo que imprime los meses que quedan desde el día de una fecha hasta el final del mes.
	 */
	public void printAllDatesUntilTheMonth(){
		
		int cont = 0;
		for(int i=this.getDay(); i<=this.numberDaysOfMonth();i++){
			System.out.println("Fecha " + cont + ": " + i + "/"+ this.getMonth() + "/" + this.getYear() + ".");
			cont++;
		}
	}
	/**
	 * Método que imprime los meses que tienen los mismos días que la fecha que se le pasa.
	 */
	public void printMonthsWithSameDays(){
		switch (numberDaysOfMonth()) {
			case 28:
				System.out.println("Fecha: " + this.toString()+". Tiene los mismos días que febrero." );
				break;
			case 30:
				System.out.println("Fecha: " + this.toString()+". Tiene los mismos días que Abril, Junio, Septiembre y Noviembre." );
				break;
			case 31:
				System.out.println("Fecha: " + this.toString()+". Tiene los mismos días que Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre." );
				break;
		}
	}
	/**
	 * Método que cuenta los días desde el primer día del año hasta el día de una fecha.
	 */
	public void numbreOfDaysSinceTheFirstDayOfYear(){
		 /*NOTA:	LocalDateTime.of(year,month, day, hour, minute)	*/
		 LocalDateTime date1 = LocalDateTime.of(this.getYear(), 1, 1, 0, 0);
	     LocalDateTime date2 = LocalDateTime.of(this.getYear(),this.getMonth(),this.getDay(),0,0);
	     
	     System.out.println("Hay "+ Duration.between(date1, date2).toHours()/24  +
	    		 			" días, entre 1/1/" + this.getYear() + " y " + this.toString());
	}
	/**
	 * Método que calcula por medio de un bucle condicional de tipo While el numero de intentos aleatorios
	 * que se han de intentar hasta que una fecha se igual a una que se le pase al llamar al método.
	 * @return Numero de intentos.
	 */
	public int getNumberOfIntentsRandomDateWhile(){
		Date aux_date = new Date();
		long cont = 0;
		
		while (!isSame(aux_date)){
			aux_date.setDay((int)Math.floor(Math.random()*(31-1+1)+1));
			aux_date.setMonth((int) Math.floor(Math.random()*(12-1+1)+1));
			aux_date.setYear((int) Math.floor(Math.random()*(9999-1+1)+1));//Máximo año = 9999
			
			/*Comprobar si la fecha puede o no ser válida. Por ejemplo 31 del 2 (febrero no es valida)*/
			if(correctedDayAndMonth(aux_date.getDay(), aux_date.getMonth())){
				cont++; 
			}
		}
		
		System.out.println("Numero de intentos: " + cont);
		
		
	return 0;	
	}
	/**
	 * Método que calcula por medio de un bucle condicional de tipo Do While el numero de intentos aleatorios
	 * que se han de intentar hasta que una fecha se igual a una que se le pase al llamar al método.
	 * @return Numero de intentos.
	 */
	public int getNumberOfIntentsRandomDateDoWhile(){
		Date aux_date = new Date();
		long cont = 0;
		do {
			aux_date.setDay( (int)Math.floor(Math.random()*(31-1+1)+1));
			aux_date.setMonth((int) Math.floor(Math.random()*(12-1+1)+1));
			aux_date.setYear((int) Math.floor(Math.random()*(9999-1+1)+1));//Máximo año = 9999
			
				/*Comprobar si la fecha puede o no ser válida. Por ejemplo 31 del 2 (febrero no es valida)*/
				if(correctedDayAndMonth(aux_date.getDay(), aux_date.getMonth())){
					cont++; 
				}
		} while (!isSame(aux_date));
		
		System.out.println("Numero de intentos: " + cont);
		//System.out.println("Fecha: " + this.toString() + " Fecha_aux: " + aux_date.toString());
		
	return 0;	
	}
	/**
	 * Método que calcula el día de la semana que es el primer día de la semana de ese año. 
	 */
	public void getTheFirstDateOfTheYear(){
		//IMPORTANTE -> Los meses empiezan en cero. Enero =0, Febrero=1
		GregorianCalendar c = new GregorianCalendar(this.year,0,1);
		
		switch (c.get(Calendar.DAY_OF_WEEK)) {
			case 1:
				System.out.println("Fecha " +this.toString()+": El primer día del año es SUNDAY.");break;
			case 2:
				System.out.println("Fecha " +this.toString()+": El primer día del año es MONDAY.");break;
			case 3:
				System.out.println("Fecha " +this.toString()+": El primer día del año es TUESDAY.");break;
			case 4:
				System.out.println("Fecha " +this.toString()+": El primer día del año es WEDNESDAY.");break;
			case 5:
				System.out.println("Fecha " +this.toString()+": El primer día del año es THURSDAY.");break;
			case 6:
				System.out.println("Fecha " +this.toString()+": El primer día del año es FRIDAY.");break;
			case 7:
				System.out.println("Fecha " +this.toString()+": El primer día del año es SATURDAY.");break;
			
			default:
				break;
		}
		 
		 
		
	}
	/**
	 * Metodo que devuelve la fecha en formtaro String de la forma dd/mm/yy.
	 */
	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}
	/**
	 * Método que comprueba si una fecha y otra que se le pase por parámetro son exactamente iguales, es decir del mismo día, mes y año.
	 * @param another Fecha que se le pasa por parámtro.
	 * @return True si son exaxtamente la misma False en caso contrario.
	 */
	public boolean equals(Date another){
		if (isSameDayIF(another)&& isSameMonthIF(another) && isSameYearIF(another)){
			return true;
		}
		return false;
	}
}
