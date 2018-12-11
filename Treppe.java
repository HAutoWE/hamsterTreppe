/*
Hendrik Emunds 
V.1 15.11.2018
*/
import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Treppe extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {int i = 0;
// i ist die gezählte Anzahl der Stufen
int anzahl = 5;
// anzahl der Bergtouren

public void main() {
    int y = 0;
    while(y < anzahl){
 		y++;
 		BergW();
 		ausgleichW();
 		BergO();
 		ausgleichO();   
    }
}
//MainFunktion die ausgeführt wird, so oft wie Anzahl angibt

void rechts(){
	linksUm();
	linksUm();
	linksUm();
}
void stufenZahl(){
	if(!vornFrei()){
		i++;
	}
}
//Algohritmus, der die Anzahl der gelaufenen Stufen zählt
void BergW(){
	int x = 0;
	while(!vornFrei()){
		stufeHochW();
	}
	vor();
	rechts();
	vor();
	while(x < i){
		stufeRunterW();
		x++;
	}	
}
//Bergbesteigung gen Westen
void stufeHochW(){
	linksUm();
	vor();
	rechts();
	vor();
	stufenZahl();
}
//Stufe hoch gen Westen
void stufeRunterW(){
	linksUm();
	vor();
	rechts();
	vor();
}
//Stufe runter gen Westen 
void BergO(){
	int x = 0;
	while(!vornFrei()){
		stufeHochO();
	}
	vor();
	linksUm();
	vor();
	while(x < i){
		stufeRunterO();
		x++;
	}	
}
//Bergbesteigung gen Osten
void stufeHochO(){
	rechts();
	vor();
	linksUm();
	vor();
	stufenZahl();
}
//Stufe hoch gen Osten
void stufeRunterO(){
	rechts();
	vor();
	linksUm();
	vor();
}
//Stufe runter gen Osten
void ausgleichW(){
	i = 0;
	rechts();
}
//Ausgleichsschritte und reset des Zählers
void ausgleichO(){
	i = 0;
	linksUm();
//Ausgleichsschritte und reset des Zählers
}}