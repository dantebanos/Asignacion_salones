package com.upiicsa.sistemaasignacionsalones.Modelo;
import com.upiicsa.sistemaasignacionsalones.Modelo.Academias.BasicasDeLaIngenieria;
import com.upiicsa.sistemaasignacionsalones.Modelo.Academias.Computacion;
import com.upiicsa.sistemaasignacionsalones.Modelo.Academias.Informatica;
import com.upiicsa.sistemaasignacionsalones.Modelo.Academias.IngIndustrial;
import com.upiicsa.sistemaasignacionsalones.Modelo.Academias.InvOperaciones;
import com.upiicsa.sistemaasignacionsalones.Modelo.Academias.Produccion;
import com.upiicsa.sistemaasignacionsalones.Modelo.Academias.SistemasDeTransporte;
/**
 *
 * @author Brian Murillo, Dante Baños
 * Tester and documentation: Eduardo Campos, Arely Cuellar ,Yael Rebollar
 */
public class VerificarHorario {
    //Academias
    BasicasDeLaIngenieria basicasDeLaIngenieria = new BasicasDeLaIngenieria();
    SistemasDeTransporte sistemasDeTransporte = new SistemasDeTransporte();
    IngIndustrial industrial = new IngIndustrial();
    Produccion produccion = new Produccion();
    Informatica informatica = new Informatica();
    Computacion computacion = new Computacion();
    InvOperaciones operaciones = new InvOperaciones();

    public VerificarHorario() {
    }

    public String seleccionarSecuencia(String nombre, String horaInicio, String horafin) {
        String academia = nombre;
        String secuencia = "";

        //Filtro por academia
        switch (academia) {
            case "CIENCIAS BASICAS DE LA INGENIERIA":
                secuencia = basicasDeLaIngenieria.secuenciaD1(horaInicio, horafin);
                break;
            case "COMPUTACION":
                secuencia = computacion.secuenciaC2(horaInicio, horafin);
                break;
            case "INFORMATICA":
                secuencia = informatica.secuenciaPoniente(horaInicio, horafin);
                break;
            case "ING. INDUSTRIAL":
                secuencia = industrial.secuencia101(horaInicio, horafin);
                break;
            case "INVESTIGACION DE OPERACIONES":
                secuencia = operaciones.secuencia301(horaInicio, horafin);
                break;
            case "PRODUCCION":
                secuencia = produccion.secuencia1(horaInicio, horafin);
                break;
            case "SIST. DE TRANS.":
                secuencia = sistemasDeTransporte.secuenciatransporte(horaInicio, horafin);
                break;
            default:
                secuencia = "s/a";
                break;
        }
        return secuencia;
    }
    //Disponibilidad Ciencias Basicas de la Ingenieria
    public String[] disponibilidadBasicasIngenieriaD1(){
        return basicasDeLaIngenieria.getHorariosVerificacionBasicasD1();
    }
    public String[] disponibilidadBasicasIngenieriaD2(){
        return basicasDeLaIngenieria.getHorariosVerificacionBasicasD2();
    }
    public String[] disponibilidadBasicasIngenieria216(){
        return basicasDeLaIngenieria.getHorariosVerificacionBasicas216();
    }
    public String[] disponibilidadBasicasIngenieria217(){
        return basicasDeLaIngenieria.getHorariosVerificacionBasicas217();
    }
    public String[] disponibilidadBasicasIngenieria218(){
        return basicasDeLaIngenieria.getHorariosVerificacionBasicas218();
    }
    
    //Disponibilidad computacion
    public String[] disponibilidadComputacionC2(){
        return computacion.getHorariosVerificacionComputacionC2();
    }
    public String[] disponibilidadComputacionOriente(){
        return computacion.getHorariosVerificacionComputacionOriente();
    }
    public String[] disponibilidadComputacionRedes(){
        return computacion.getHorariosVerificacionComputacionRedes();
    }
    public String[] disponibilidadComputacionProgramacion(){
        return computacion.getHorariosVerificacionComputacionProgramacion();
    }
    public String[] disponibilidadComputacion201(){
        return computacion.getHorariosVerificacionComputacion201();
    }
    public String[] disponibilidadComputacion202(){
        return computacion.getHorariosVerificacionComputacion202();
    }
    public String[] disponibilidadComputacion203(){
        return computacion.getHorariosVerificacionComputacion203();
    }
    public String[] disponibilidadComputacion307(){
        return computacion.getHorariosVerificacionComputacion307();
    }
    public String[] disponibilidadComputacion308(){
        return computacion.getHorariosVerificacionComputacion308();
    }
    public String[] disponibilidadComputacion309(){
        return computacion.getHorariosVerificacionComputacion309();
    }
    public String[] disponibilidadComputacion310(){
        return computacion.getHorariosVerificacionComputacion310();
    }
    
    //Disponibilidad Informatica
    public String[] disponibilidadInformaticaPoniente(){
        return informatica.getHorariosVerificacionInformaticaPoniente();
    }
    public String[] disponibilidadInformatica104(){
        return informatica.getHorariosVerificacionInformatica104();
    }
    public String[] disponibilidadInformatica105(){
        return informatica.getHorariosVerificacionInformatica105();
    }
    public String[] disponibilidadInformatica106(){
        return informatica.getHorariosVerificacionInformatica106();
    }
    public String[] disponibilidadInformatica113(){
        return informatica.getHorariosVerificacionInformatica113();
    }
    public String[] disponibilidadInformatica114(){
        return informatica.getHorariosVerificacionInformatica114();
    }
    public String[] disponibilidadInformatica114A(){
        return informatica.getHorariosVerificacionInformatica114A();
    }
    public String[] disponibilidadInformatica115(){
        return informatica.getHorariosVerificacionInformatica115();
    }
    public String[] disponibilidadInformatica215(){
        return informatica.getHorariosVerificacionInformatica215();
    }
    
    //Disponibilidad Ing. Informatica
    public String[] disponibilidadIngIndustrial101(){
        return industrial.getHorariosVerificacionIndustrial101();
    }
    public String[] disponibilidadIngIndustrial102(){
        return industrial.getHorariosVerificacionIndustrial102();
    }
    public String[] disponibilidadIngIndustrial103(){
        return industrial.getHorariosVerificacionIndustrial103();
    }
    public String[] disponibilidadIngIndustrial115A(){
        return industrial.getHorariosVerificacionIndustrial15A();
    }
    public String[] disponibilidadIngIndustrial116(){
        return industrial.getHorariosVerificacionIndustrial116();
    }
    public String[] disponibilidadIngIndustrial117(){
        return industrial.getHorariosVerificacionIndustrial117();
    }
    public String[] disponibilidadIngIndustrial118(){
        return industrial.getHorariosVerificacionIndustrial118();
    }
    
    //Disponibilidad Investidacion de operaciones
    public String[] disponibilidadInvOperaciones301(){
        return operaciones.getHorariosVerificacionOperaciones301();
    }
    public String[] disponibilidadInvOperaciones302(){
        return operaciones.getHorariosVerificacionOperaciones302();
    }
    public String[] disponibilidadInvOperaciones303(){
        return operaciones.getHorariosVerificacionOperaciones303();
    }
    public String[] disponibilidadInvOperaciones304(){
        return operaciones.getHorariosVerificacionOperaciones304();
    }
    public String[] disponibilidadInvOperaciones305(){
        return operaciones.getHorariosVerificacionOperaciones305();
    }
    public String[] disponibilidadInvOperaciones306(){
        return operaciones.getHorariosVerificacionOperaciones306();
    }
    public String[] disponibilidadInvOperacionesC1(){
        return operaciones.getHorariosVerificacionOperacionesC1();
    }
    public String[] disponibilidadInvOperaciones204(){
        return operaciones.getHorariosVerificacionOperaciones204();
    }
    public String[] disponibilidadInvOperaciones205(){
        return operaciones.getHorariosVerificacionOperaciones205();
    }
    
    //Disponibilidad Produccion
    public String[] disponibilidadProduccion1(){
        return produccion.getHorariosVerificacionProduccion1();
    }
    public String[] disponibilidadProduccion2(){
        return produccion.getHorariosVerificacionProduccion2();
    }
    public String[] disponibilidadProduccion3(){
        return produccion.getHorariosVerificacionProduccion3();
    }
    public String[] disponibilidadProduccion4(){
        return produccion.getHorariosVerificacionProduccion4();
    }
    public String[] disponibilidadProduccion5(){
        return produccion.getHorariosVerificacionProduccion5();
    }
    public String[] disponibilidadProduccion6(){
        return produccion.getHorariosVerificacionProduccion6();
    }
    public String[] disponibilidadProduccion7(){
        return produccion.getHorariosVerificacionProduccion7();
    }
    
    //Disponibilidad sistemas de transporte
    public String[] disponibilidadSistemasTransporte(){
        return sistemasDeTransporte.getHorariosVerificacionTransporte();
    }
    public String[] disponibilidadSistemasTransporte206(){
        return sistemasDeTransporte.getHorariosVerificacionTransporte206();
    }
    public String[] disponibilidadSistemasTransporte211(){
        return sistemasDeTransporte.getHorariosVerificacionTransporte211();
    }
    public String[] disponibilidadSistemasTransporte212(){
        return sistemasDeTransporte.getHorariosVerificacionTransporte212();
    }
    public String[] disponibilidadSistemasTransporte213(){
        return sistemasDeTransporte.getHorariosVerificacionTransporte213();
    }
    public String[] disponibilidadSistemasTransporte214(){
        return sistemasDeTransporte.getHorariosVerificacionTransporte214();
    }    
}