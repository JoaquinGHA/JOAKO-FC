package Main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import JugadorBase.Jugador;
import Defensas.Defensa;
import Porteros.Portero;
import Delanteros.Delantero;
import INTERFAZ.ITransferible;
import MedioCentros.Medio;

public class Main {

	public static void main(String[] args) {
		//Array para la lista de jugadores
		ArrayList <Jugador> listaJugadores = new ArrayList <>();
		HashMap <Integer, Jugador> plantillaPorDorsal = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		
		
		

		// Porteros
		Portero terStegen = new Portero("Marc André Ter Stegen", 34, 20.3, 1.87, "Portero", "Alemán", 7.8, 12, 1);
		listaJugadores.add(terStegen);
		plantillaPorDorsal.put(1, terStegen);

		Portero joanGarcia = new Portero("Joan García", 24, 50, 1.90, "Portero", "Española", 6.5, 11, 13);
		listaJugadores.add(joanGarcia);
		plantillaPorDorsal.put(13, joanGarcia);

		// Defensas
		Defensa vanDijk = new Defensa("Virgil Van Dijk", 30, 30.5, 1.95, "Defensa Central", "Holandesa", 60.1, 8, 4);
		listaJugadores.add(vanDijk);
		plantillaPorDorsal.put(4, vanDijk);

		Defensa cubarsi = new Defensa("Pau Cubarsí", 19, 90.5, 1.83, "Defensa Central", "Española", 50.6, 9, 5);
		listaJugadores.add(cubarsi);
		plantillaPorDorsal.put(5, cubarsi);

		Defensa ericGarcia = new Defensa("Eric García", 25, 80.5, 1.82, "Lateral Derecho", "Española", 60.1, 11, 24);
		listaJugadores.add(ericGarcia);
		plantillaPorDorsal.put(24, ericGarcia);

		Defensa balde = new Defensa("Alejandro Baldé", 22, 55.5, 1.73, "Lateral Izquierdo", "Española", 50.6, 14, 3);
		listaJugadores.add(balde);
		plantillaPorDorsal.put(3, balde);

		// Medios
		Medio marcBernal = new Medio("Marc Bernal", 18, 60.6, 1.93, "Pivote", "Española", 30, "Recuperador", 2.3, 26);
		listaJugadores.add(marcBernal);
		plantillaPorDorsal.put(26, marcBernal);

		Medio gavi = new Medio("Gavi", 21, 70.6, 1.74, "Interior Derecho", "Española", 40, "Destructor", 2, 6);
		listaJugadores.add(gavi);
		plantillaPorDorsal.put(6, gavi);

		Medio pedri = new Medio("Pedri", 23, 90.9, 1.73, "Interior Izquierdo", "Española", 75, "Creador", 3.9, 8);
		listaJugadores.add(pedri);
		plantillaPorDorsal.put(8, pedri);

		// Delanteros
		Delantero lamineYamal = new Delantero("Lamine Yamal", 18, 120.5, 1.80, "Extremo Derecho", "Española", 49, 1.6, 30.4, 19);
		listaJugadores.add(lamineYamal);
		plantillaPorDorsal.put(19, lamineYamal);

		Delantero julianAlvarez = new Delantero("Julian Álvarez", 26, 110.5, 1.70, "Centro Delantero", "Argentina", 54, 1.6, 21.7, 9);
		listaJugadores.add(julianAlvarez);
		plantillaPorDorsal.put(9, julianAlvarez);

		Delantero raphinha = new Delantero("Raphinha", 29, 100.5, 1.79, "Extremo Izquierdo", "Brasileño", 70, 1.9, 33.6, 11);
		listaJugadores.add(raphinha);
		plantillaPorDorsal.put(11, raphinha);

		
//		for(Jugador j : listaJugadores) {
//			if(j instanceof ITransferible t) {
//				System.out.println("\n"+j.getNombre()+"\n"+
//									" | Transferible: " +t.esTranferible()+"\n"+
//									" | Precio de venta: " +t.calcularPrecioVenta());}}

		for(Jugador j : listaJugadores) {
			System.out.println(j.describir());
		}
		
	}
	

}
