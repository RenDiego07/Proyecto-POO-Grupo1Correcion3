/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package participantes;

/**
 *
 * @author danil
 */
//participante5k es una sub clase de la clase estudiante
public class Participante5K extends Estudiante{
    private double tiempo;

public Participante5K(Estudiante estudiante) {
        super(estudiante);
}

//getters
public double getTiempo() {
        return tiempo;
}

//setters
public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
    
  
}
