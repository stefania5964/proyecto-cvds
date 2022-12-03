package edu.eci.cvds;

import static org.junit.Assert.assertEquals;

import edu.eci.cvds.entities.*;
import org.junit.Test;

import java.sql.Date;
import java.sql.Time;
import java.util.Optional;

// LINK PARA HACER LOS MOCKS
//    https://funcionaenmimaquina.com/aprende-a-crear-pruebas-unitarias-con-junit-y-mockito-en-15-minutos/#:~:text=JUnit%3A%20Nos%20permite%20evaluar%20el,el%20m%C3%A9todo%20que%20necesitamos%20probar.


public class Tests {


/** Prueba prueba;

    @BeforeEach
    public void setup(){
        Mocka
    }*/

    @Test
    public void RecurosIguales(){
        Time time1 =  new Time(12, 30, 40);
        Date date = new Date(2, 12, 5);


        Reserve reserva = new Reserve(0777,7, 02, time1, time1, "tiempo", date);

        int recursoReserva = reserva.getRecurso();

        assertEquals(7, recursoReserva);
    }

    @Test
    public void CodigosIguales(){
        Time time1 =  new Time(12, 30, 40);
        Date date = new Date(2, 12, 5);
        Reserve reserva = new Reserve(0777,7, 02, time1, time1, "tiempo", date);

        int recursoReserva = reserva.getCodigo();

        assertEquals(0777, recursoReserva);
    }

    @Test
    public void UsuariosIguales(){
        Time time1 =  new Time(12, 30, 40);
        Date date = new Date(2, 12, 5);
        Reserve reserva = new Reserve(0777,7, 02, time1, time1, "tiempo", date);

        int recursoReserva = reserva.getUsuario();

        assertEquals(02, recursoReserva);
    }


    @Test
    public void RecursoId(){
        Date date = new Date(2, 12, 5);
        Resource recurso = new Resource(10, TipoRecurso.Computador, "Sala 2", "desocupado", 1);

        int recursoReserva = recurso.getId_recurso();

        assertEquals(10, recursoReserva);
    }

    @Test
    public void RecursoDesocupado(){
        Date date = new Date(2, 12, 5);
        Resource recurso = new Resource(10, TipoRecurso.Computador, "Sala 2", "desocupado", 1);

        String recursoReserva = recurso.getEstado();

        assertEquals("desocupado", recursoReserva);
    }

    @Test
    public void UsuarioID(){
        Date date = new Date(2, 12, 5);
        Usuario usuario = new Usuario(07, "jimy", "sistemas", Roles.Usuario, "jimy@hotmail.com", "jimmy123");

        int usuarioId = usuario.getId();

        assertEquals(07, usuarioId);
    }

    @Test
    public void UsuarioPrograma(){
        Date date = new Date(2, 12, 5);
        Usuario usuario = new Usuario(07, "jimy", "sistemas", Roles.Usuario, "jimy@hotmail.com", "jimmy123");

        String usuarioId = usuario.getPrograma();

        assertEquals("sistemas", usuarioId);
    }

    @Test
    public void UsuarioRoles(){
        Date date = new Date(2, 12, 5);
        Usuario usuario = new Usuario(07, "jimy", "sistemas", Roles.Usuario, "jimy@hotmail.com", "jimmy123");

        Roles usuarioRoles = usuario.getRol();

        assertEquals(Roles.Usuario, usuarioRoles);
    }

    @Test
    public void UsuarioCorreo(){
        Date date = new Date(2, 12, 5);
        Usuario usuario = new Usuario(07, "jimy", "sistemas", Roles.Usuario, "jimy@hotmail.com", "jimmy123");

        String usuarioCorreo = usuario.getCorreo();

        assertEquals("jimy@hotmail.com", usuarioCorreo);
    }

    @Test
    public void UsuarioContraseña(){
        Date date = new Date(2, 12, 5);
        Usuario usuario = new Usuario(07, "jimy", "sistemas", Roles.Usuario, "jimy@hotmail.com", "jimmy123");

        String usuarioContraseña = usuario.getContraseña();

        assertEquals("jimmy123", usuarioContraseña);
    }

}