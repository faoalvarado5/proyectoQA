package Classes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.JUnitException;

import static org.junit.jupiter.api.Assertions.*;

class agenteTest{

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void setTipo() {

        // Caso de prueba #26
        agente agente = new agente();
        assertEquals(agente.getTipo(), 0);
        agente.setTipo(2);
        assertEquals(agente.getTipo(), 2);
    }

    @Test
    void setEstado() {

        // Caso de prueba #19
        agente agente = new agente();
        assertEquals(agente.getEstado(), null);
        agente.setEstado("s");
        assertEquals(agente.getEstado(), "s");
    }

    @Test
    void setVelocidad_maxima() {

        // Caso de prueba #24
        agente agente = new agente();
        assertEquals(agente.getVelocidad_maxima(), 0);
        agente.setTiempo_enfermo(30);
        assertEquals(agente.getTiempo_enfermo(), 30);
    }

    @Test
    void setPosicion_en_eje_x() {

        // Caso de prueba #28
        agente agente = new agente();
        assertEquals(agente.getPosicion_en_eje_x(), 0.0d);
        agente.setPosicion_en_eje_x(2.0);
        assertEquals(agente.getPosicion_en_eje_x(), 2.0);
    }

    @Test
    void setPosicion_en_eje_y() {

        // Caso de prueba #30
        agente agente = new agente();
        assertEquals(agente.getPosicion_en_eje_x(), 0.0d);
        agente.setPosicion_en_eje_x(2.0);
        assertEquals(agente.getPosicion_en_eje_x(), 2.0);
    }

    @Test
    void setTiempo_enfermo() {

        // Caso de prueba #22
        agente agente = new agente();
        assertEquals(agente.getTiempo_enfermo(), 0.0d);
        agente.setTiempo_enfermo(3.0);
        assertEquals(agente.getTiempo_enfermo(), 3.0);
    }

    @Test
    void getTipo() {

        // Caso de prueba #25
        agente agente = new agente();
        assertEquals(agente.getTipo(), 0);
        agente.setTipo(1);
        assertEquals(agente.getTipo(), 1);
    }

    @Test
    void getEstado() {

        // Caso de prueba #20
        agente agente = new agente();
        assertEquals(agente.getEstado(), null);
        agente.setEstado("e");
        assertEquals(agente.getEstado(), "e");
    }

    @Test
    void getVelocidad_maxima() {

        // Caso de prueba #23
        agente agente = new agente();
        assertEquals(agente.getVelocidad_maxima(), 0);
        agente.setTiempo_enfermo(15);
        assertEquals(agente.getTiempo_enfermo(), 15);
    }

    @Test
    void getPosicion_en_eje_x() {

        // Caso de prueba #27
        agente agente = new agente();
        assertEquals(agente.getPosicion_en_eje_x(), 0.0d);
        agente.setPosicion_en_eje_x(1.0);
        assertEquals(agente.getPosicion_en_eje_x(), 1.0);
    }

    @Test
    void getPosicion_en_eje_y() {

        // Caso de prueba #29
        agente agente = new agente();
        assertEquals(agente.getPosicion_en_eje_y(), 0.0d);
        agente.setPosicion_en_eje_y(1.0);
        assertEquals(agente.getPosicion_en_eje_y(), 1.0);
    }

    @Test
    void getTiempo_enfermo() {

        // Caso de prueba #21
        agente agente = new agente();
        assertEquals(agente.getTiempo_enfermo(), 0.0d);
        agente.setTiempo_enfermo(2.0);
        assertEquals(agente.getTiempo_enfermo(), 2.0);


    }

    @Test
    void mover_eje_y() {

        //Caso de prueba 42
        agente agente = new agente();
        agente.setPosicion_en_eje_y(2.0);
        agente.setPosicion_en_eje_x(2.0);
        agente.setVelocidad_y(2.0);
        agente.mover_eje_y();
        assertEquals(agente.getPosicion_en_eje_y(),4.0);

    }

    @Test
    void mover_eje_x() {

        //Caso de prueba 43
        agente agente = new agente();
        agente.setPosicion_en_eje_y(2.0);
        agente.setPosicion_en_eje_x(2.0);
        agente.setVelocidad_x(2.0);
        agente.mover_eje_x();
        assertEquals(agente.getPosicion_en_eje_x(),4.0);
    }


    @Test
    void invertir_posicion_y() {

        //Caso de prueba 44
        agente agente = new agente();
        agente.setVelocidad_y(1);
        agente.invertir_posicion_y();
        assertEquals(agente.getVelocidad_y(),-1);
    }

    @Test
    void invertir_posicion_x() {
        //Caso de prueba 45
        agente agente = new agente();
        agente.setVelocidad_x(1);
        agente.invertir_posicion_x();
        assertEquals(agente.getVelocidad_x(),-1);
    }

    @Test
    void agente(){

        //Caso de prueba 46
       agente agente = new agente(11,"e", 0.2, 0.2, 3, 3, 1.5, 1.5, 20);
       assertEquals(agente.getTipo(),11);
       assertEquals(agente.getEstado(),"e");
       assertEquals(agente.getVelocidad_maxima(),3);
       assertEquals(agente.getVelocidad_minima(),3);
       assertEquals(agente.getPosicion_en_eje_x(),1.5);
       assertEquals(agente.getPosicion_en_eje_y(),1.5);
       assertEquals(agente.getTiempo_enfermo(),20);

    }





}