package Logica;

import java.util.ArrayList;
import Observer.Observable;

import Modelo.Puesto;
import Modelo.Trabajador;
import Modelo.Cliente;
import Modelo.Llamada;
import Excepciones.LlamadaException;
import Modelo.Llamada;
import Modelo.Sector;
import Modelo.TrabajadorException;
import Observer.Observador;
import java.time.LocalDate;
import java.time.LocalTime;

public class Fachada extends Observable {

    private static Fachada instancia;

    private SistemaTrabajadores sistemaTrabajadores;

    private SistemaClientes sistemaClientes;

    public synchronized static Fachada getInstancia() {
        if (instancia == null) {
            instancia = new Fachada();
        }
        return instancia;
    }

    private Fachada() {
        sistemaClientes = new SistemaClientes();
        sistemaTrabajadores = new SistemaTrabajadores();
    }

    public Puesto login(String CI, String contrasena) throws TrabajadorException {
        return sistemaTrabajadores.login(CI, contrasena);
    }

    public void salirDeAplicacion(Trabajador unT) {

    }

    public void finalizarLlamada() {
        avisar(Observador.Eventos.ACTUALIZAR_SECTORES);
    }

    //Se comprueba que existe lugar para comenzar una llamada
    public boolean iniciarLlamada() throws LlamadaException {
        return sistemaTrabajadores.iniciarLlamada();
    }
    public void actualizarMonitor() {
        avisar(Observador.Eventos.ACTUALIZAR_SECTORES);
    }

    public Llamada altaLlamada(Cliente uncliente, Sector unSector, LocalDate fechaInicio, LocalTime horaInicio, LocalTime horaComienzoLlamada) throws LlamadaException {
        Llamada llamada = sistemaTrabajadores.altaLlamada(uncliente, unSector, fechaInicio, horaInicio,horaComienzoLlamada);
        if (llamada.getEstado() != Llamada.EstadoLlamada.enEspera) {
            avisar(Observador.Eventos.ACTUALIZAR_SECTORES);
        }
        return llamada;
    }

    public Cliente getCliente(String ci) {
        return null;
    }

    public ArrayList<Sector> getSectores() {
        return sistemaTrabajadores.getSectores();
    }

    public void AgregarTrabajador(Trabajador t) {
        sistemaTrabajadores.agregarTrabajador(t);
    }

    public ArrayList<Llamada> getLlamadasTotal() {
        return sistemaTrabajadores.getLlamadasTotal();
    }

    public void AgregarCliente(Cliente c) {
        sistemaClientes.agregarCliente(c);
    }

    public Cliente buscarCliente(String CI) {
        return sistemaClientes.buscarCliente(CI);
    }

    public void AgregarSector(Sector s) {
        sistemaTrabajadores.agregarSector(s);
    }
    public void eliminarLlamadaEnEspera(int numeroLlamada) {
        sistemaTrabajadores.eliminarLlamadaEnEspera(numeroLlamada);
    }

    public Sector buscarSector(String nombreSector) {
        return sistemaTrabajadores.buscarSector(nombreSector);
    }

    public void alterarCantidadLlamadas(String operacion) {
        sistemaTrabajadores.alterarCantidadLlamadas(operacion);
    }
}
