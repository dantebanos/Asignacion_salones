package com.upiicsa.sistemaasignacionsalones.Modelo;
/**
 *
 * @author Brian Murillo, Dante Baños 
 * Tester and documentation: Eduardo Campos, Arely Cuellar ,Yael Rebollar
 */
public class Horario {

    public Horario() {
    }        
    
    private String[] horarios={"07:00-07:30","07:30-08:00","08:00-08:30","08:30-09:00","09:00-09:30","09:30-10:00","10:00-10:30","10:30-11:00",
                               "11:00-11:30","11:30-12:00","12:00-12:30","12:30-13:00","13:00-13:30","13:30-14:00","14:00-14:30",
                               "14:30-15:00","15:00-15:30","15:30-16:00","16:00-16:30","16:30-17:00","17:00-17:30","17:30-18:00",
                               "18:00-18:30","18:30-19:00","19:00-19:30","19:30-20:00","20:00-20:30","20:30-21:00","21:00-21:30",
                               "21:30-22:00"};
    
    private String[] horariosVerificacion={"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0",
                                           "0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"};

    public String[] getHorarios() {
        return horarios;
    }

    public String[] getHorariosVerificacion() {
        return horariosVerificacion;
    }            
}