/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import ModeloDB.*;
import ModeloUML.*;
import Vista.*;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;



/**
 *
 * @author Imanol Urquijo
 * Desde linea 1 hasta 680
 */
public class ProyectoESport {

    

    private static TablaCalendario tc;
    private static TablaJornada tj;
    private static TablaPartido tp;
    private static TablaEquipo te;
    private static TablaPersona tper;
    private static TablaDueño td;
    private static TablaEntrenador tentre;
    private static TablaAsistente ta;
    private static TablaJugador tjug;
    private static TablaUsuario tu;
    
    private static Calendario c;
    private static Jornada j;
    private static Partido p;
    private static Equipo e;
    private static Persona per;
    private static Dueño d;
    private static Entrenador entre;
    private static Asistente a;
    private static Jugador jug;
    private static Usuario u;
    
    private static Equipos ve;
    private static PP vp;
    private static Login vl;
    private static DatosEquipos vde;
    private static Clasificaciones vc;
    
    
    public static void main(String[] args) {
    
        CrearTablas();
        CrearVistas();
        VistaLogin();
        
    }
    
    public static void CrearTablas()
    {
        try{
            
            tc = new TablaCalendario();
            tj = new TablaJornada();
            tp = new TablaPartido();
            te = new TablaEquipo();
            tper = new TablaPersona();
            td = new TablaDueño();
            ta = new TablaAsistente();
            tentre = new TablaEntrenador();
            tjug = new TablaJugador();
            
            
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public static void CrearVistas() 
    {
        try{
            
            ve = new Equipos();
            vp = new PP();
            vl = new Login();
            vde = new DatosEquipos();
            vc = new Clasificaciones();
        
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public static void CerrarPrograma()
    {
        vl.setVisible(false);
        vl.dispose();
    }
    
    public static void VistaLogin()
    {
        vl.setVisible(true);
    }
    
    public static void VistaPrincipal(char a) 
    {
        vl.dispose();
        
        vp.setVisible(true);
    }
    
    
    public static void VistaEquipos() 
    {
        vp.setVisible(false);
        vde.setVisible(false);
      
        ve.setVisible(true);
    }
    
    public static void VistaDatosEquipos(int elec) 
    {
        ve.setVisible(false);
      
        vde.setVisible(true);
    }
    
    public static void VistaClasificaciones() 
    {
        vp.setVisible(false);
      
        vc.setVisible(true);
    }
    
    public static boolean identificar(String usuario,String contraseña) throws Exception{
        boolean usuarioValido = false;
        ArrayList<Usuario> lista = tu.seleccionarTodosLosUsuarios();
        int x;
        for(x=0; x < lista.size() && !usuarioValido; x++)
            if (lista.get(x).getNombre() != null)
                if (lista.get(x).getNombre().compareToIgnoreCase(usuario)== 0 && lista.get(x).getContraseña().compareTo(contraseña)== 0)
                {
                    usuarioValido = true;
                    u = lista.get(x);
                }
      
               
        return usuarioValido;
    }
    
    public static void insertarCalendario(int id,String nombre) 
            throws Exception
    {
                c = new Calendario(id,nombre);
                tc.insertar(c);
    }
    
    public static void modificarCalendario(int id,String nombre) 
            throws Exception
    {
        c.setId(id);
        c.setNombre(nombre);
        tc.actualizar(c);
    }
    
    public static void bajaCalendario(int id) throws Exception
    {
        c.setId(id);
        tc.borrar(c);
    }
     
    public static void insertarJornada(int id,String nombre, Date fecha, 
            int id_calendario) throws Exception
    {
                j = new Jornada(id,nombre,fecha,id_calendario);
                tj.insertar(j);
    }
    
    public static void modificarCalendarioDeJornada(int id, int id_calendario) 
            throws Exception
    {
        j.setId(id);
        j.setId_calendario(id_calendario);
        tj.CambiarCalendario(j);
    }
    
    public static void modificarFechaDeJornada(int id, Date fecha) 
            throws Exception
    {
        j.setId(id);
        j.setFecha(fecha);
        tj.CambiarCalendario(j);
    }
    
    public static void bajaJornadaPorCalendario(int id) throws Exception
    {
        j.setId_calendario(id);
        tj.borrarPorCalendario(j);
    }
    
    public static void bajaJornadaPorID(int id) throws Exception
    {
        j.setId(id);
        tj.borrar(j);
    }
    
    public static void insertarPartidoSinResultado(int ID,String Nombre,
            Equipo ID_Local,Equipo ID_Visitante,LocalTime Hora,
            int ID_Jornada) throws Exception
    {
                p = new Partido(ID,Nombre,ID_Local,ID_Visitante,
                        Hora,ID_Jornada);
                tp.insertarSinResultado(p);
    }
    
    public static void insertarPartidoConResultado(int ID,String Nombre,
            Equipo ID_Local,Equipo ID_Visitante,LocalTime Hora,
            int Resultado_Local,int Resultado_Visitante,int ID_Jornada) 
            throws Exception
    {
                p = new Partido(ID,Nombre,ID_Local,ID_Visitante,Hora,
                        Resultado_Local,Resultado_Visitante,ID_Jornada);
                tp.insertarSinResultado(p);
    }
    
    public static void modificarResultadoDePartido(int ID,int Resultado_Local,
            int Resultado_Visitante) throws Exception
    {
        p.setId(ID);
        p.setRes_local(Resultado_Local);
        p.setRes_visit(Resultado_Visitante);
        
        tp.CambiarResultado(p);
    }
    
    public static void moverPartidoDeJornada(int ID,int id_jornada) 
            throws Exception
    {
        p.setId(ID);
        p.setId_jornada(id_jornada);
        
        tp.CambiarResultado(p);
    }
    
    public static void modificarHoraDePartido(int ID, LocalTime hora) 
            throws Exception
    {
        p.setId(ID);
        p.setHora(hora);
        
        tp.CambiarResultado(p);
    }
    
    public static void borrarPartidoPorJornada(int id) throws Exception
    {
        p.setId_jornada(id);
        
        tp.borrarPorJornada(p);
    }
    
    public static void borrarPartidoPorID(int id) throws Exception
    {
        p.setId(id);
        
        tp.borrarPorJornada(p);
    }
    
    public static void insertarEquipo(int id,String nombre, String web, 
            int puntos, int id_calendario) throws Exception
    {
                e = new Equipo(id,nombre,web,puntos,id_calendario);
                
                te.insertar(e);
    }
    
    public static void modificarNombreDeEquipoyWeb(int id, String nombre, 
            String web) throws Exception
    {
        e.setId(id);
        e.setNombre(nombre);
        e.setPaginaWeb(web);

        te.actualizarNombreYWeb(e);
    }
    
    public static void modificarPuntosDeEquipo(int id, int puntos) 
            throws Exception
    {
        e.setId(id);
        e.setPuntos(puntos);

        te.actualizarPuntos(e);
    }
    
    public static void borrarEquipo(int id) throws Exception
    {
        e.setId(id);
        
        te.borrar(e);
    }
    
    public static void insertarPersona(int id,String nombre,String nick, 
            int sueldo, int id_equipo) throws Exception
    {
        per.setId(id);
        per.setNombre(nombre);
        per.setNick(nick);
        per.setSueldo(sueldo);
        per.getEquipo().setId(id);
        
        tper.insertar(per);
    }
    
    public static void modificarNick(int id,String nombre) throws Exception
    {
        per.setId(0);
        per.setNick(nombre);
        
        tper.actualizarNick(per);
    }
    
    public static void modificarSueldo(int id,int sueldo) throws Exception
    {
        per.setId(0);
        per.setSueldo(sueldo);
        
        tper.ModificarSueldo(per);
    }
    
    public static void cambiarPersonaDeEquipo(int id,int id_equipo) 
            throws Exception
    {
        per.setId(0);
        per.getEquipo().setId(id);
        
        tper.CambiarDeEquipo(per);
    }
    
    public static void bajaPersonaPorID(int id) throws Exception
    {
        per.setId(id);
        
        tper.borrar(per);
    }
    
    public static void bajaPersonaPorEquipo(int id) throws Exception
    {
        per.getEquipo().setId(id);
        
        tper.borrarPorEquipo(per);
    }
    
    public static void insertarDueño(int id,int años) throws Exception
    {
        d.setIdd(id);
        d.setAños_dueño(años);
        
        td.insertar(d);
    }
    
    public static void modificarAñosDueño(int id,int años) throws Exception
    {
        d.setIdd(id);
        d.setAños_dueño(años);
        
        td.actualizarAñosDueño(d);
    }
    
    public static void bajaDueño(int id) throws Exception
    {
        d.setIdd(id);
        
        td.borrar(d);
    }
    
    public static void insertarAsistente(int id,int años) throws Exception
    {
        a.setIda(id);
        a.setAños_asistente(años);
        
        ta.insertar(a);
    }
    
    public static void modificarAñosAsistente(int id,int años) throws Exception
    {
        a.setIda(id);
        a.setAños_asistente(años);
        
        ta.actualizarAñosAsistente(a);
    }
    
    public static void bajaAsistente(int id) throws Exception
    {
        a.setIda(id);
        
        ta.borrar(a);
    }
    
    public static void insertarEntrenador(int id,String email) throws Exception
    {
        entre.setIde(id);
        entre.setEmail(email);
        
        tentre.insertar(entre);
    }
    
    public static void modificarEmail(int id,String email) throws Exception
    {
        entre.setIde(id);
        entre.setEmail(email);
        
        tentre.actualizarEmail(entre);
    }
    
    public static void bajaEntrenador(int id) throws Exception
    {
        entre.setIde(id);
        
        tentre.borrar(entre);
    }
    
    public static void insertarJugador(int id,String rol) throws Exception
    {
        jug.setIdj(id);
        jug.setRol(rol);
        
        tjug.insertar(jug);
    }
    
    public static void modificarRol(int id,String rol) throws Exception
    {
        jug.setIdj(id);
        jug.setRol(rol);;
        
        tjug.actualizarRol(jug);
    }
    
    public static void bajaJugador(int id) throws Exception
    {
        jug.setIdj(id);
        
        tjug.borrar(jug);
    }
    
    public static Calendario seleccionarCalendarioPorID(int id) 
            throws Exception
    {
        c = tc.seleccionarUnCalendario(id);

        return c;
    }
    
    public static String datosCalendarios() throws Exception
    {
        String datos="";
        ArrayList<Calendario> lista = tc.seleccionarTodo();
        for(int x = 0; x < lista.size(); x++)
            datos+= lista.get(x).toString();
        return datos;
    }
    
    public static Calendario seleccionarCalendarioConJornadas(int id) 
            throws Exception
    {
        c = tc.seleccionarCalendarioConJornada(id);

        return c;
    }
    
    public static String datosTodasLasJornada() throws Exception
    {
        String datos="";
        ArrayList<Jornada> lista = tj.seleccionarTodo();
        for(int x = 0; x < lista.size(); x++)
            datos+= lista.get(x).toString();
        return datos;
    }
    
    public static String datosJornadaPorCalendario(int id) throws Exception
    {
        String datos="";
        ArrayList<Jornada> lista = tj.seleccionarJornadasPorCalendario(id);
        for(int x = 0; x < lista.size(); x++)
            datos+= lista.get(x).toString();
        return datos;
    }
    
    public static Jornada seleccionarJornadaPorID(int id) throws Exception
    {
        j = tj.seleccionarUnaJornada(id);

        return j;
    }
    
    public static Jornada seleccionarJornadaConPartidos(int id) 
            throws Exception
    {
        j = tj.seleccionarUnaJornadaConPartidos(id);

        return j;
    }
    
    public static String datosTodosLosPartidos() throws Exception
    {
        String datos="";
        ArrayList<Partido> lista = tp.seleccionarPartidos();
        for(int x = 0; x < lista.size(); x++)
            datos+= lista.get(x).toString();
        return datos;
    }
    
    public static String datosPartidosPorJornada(int id) throws Exception
    {
        String datos="";
        ArrayList<Partido> lista = tp.seleccionarPartidosPorJornada(id);
        for(int x = 0; x < lista.size(); x++)
            datos+= lista.get(x).toString();
        return datos;
    }
    
    public static Partido seleccionarUnPartido(int id) throws Exception
    {
        p = tp.seleccionarUnPartido(id);

        return p;
    }
    
    public static String datosTodosLosEquipos() throws Exception
    {
        String datos="";
        ArrayList<Equipo> lista = te.seleccionarTodosLosEquipos();
        for(int x = 0; x < lista.size(); x++)
            datos+= lista.get(x).toString();
        return datos;
    }
    
    public static String datosEquiposPorCalendario(int id) throws Exception
    {
        String datos="";
        ArrayList<Equipo> lista = te.seleccionarEquiposPorCalendario(id);
        for(int x = 0; x < lista.size(); x++)
            datos+= lista.get(x).toString();
        return datos;
    }
    
    public static Equipo seleccionarUnEquipo(int id) throws Exception
    {
        e = te.seleccionarUnEquipo(id);

        return e;
    }
    
    public static Equipo seleccionarUnEquipoConIntegrantes(int id) 
            throws Exception
    {
        e = te.seleccionarEquipoConIntegrantes(id);

        return e;
    }
    
    public static Equipo seleccionarPuntosDeUnEquipo(int id) throws Exception
    {
        e = te.seleccionarPuntosPorEquipo(id);

        return e;
    }
    
        public static String datosTodosLasPersonas() throws Exception
    {
        String datos="";
        ArrayList<Persona> lista = tper.seleccionarTodosLasPersonas();
        for(int x = 0; x < lista.size(); x++)
            datos+= lista.get(x).toString();
        return datos;
    }
    
        
    public static String datosPersonasPorEquipo(int id) throws Exception
    {
        String datos="";
        ArrayList<Persona> lista = tper.seleccionarPersonasPorEquipos(id);
        for(int x = 0; x < lista.size(); x++)
            datos+= lista.get(x).toString();
        return datos;
    }    
        
    public static String datosIDPorEquipo(int id) throws Exception
    {
        String datos="";
        ArrayList<Persona> lista = tper.seleccionarIDPorEquipos(id);
        for(int x = 0; x < lista.size(); x++)
            datos+= lista.get(x).toString();
        return datos;
    }    
        
    public static Persona seleccionarUnaPersona(int id) throws Exception
    {
        per = tper.seleccionarUnaPersona(id);

        return per;
    }       
        
    public static Persona seleccionarNombreDeUnaPersona(int id) 
            throws Exception
    {
        per = tper.seleccionarNombreDeUnaPersona(id);

        return per;
    }         
    
    public static Persona seleccionarNickDeUnaPersona(int id) throws Exception
    {
        per = tper.seleccionarNickDeUnaPersona(id);

        return per;
    } 

    public static Persona seleccionarSueldoDeUnaPersona(int id) 
            throws Exception
    {
        per = tper.seleccionarSueldoDeUnaPersona(id);

        return per;
    } 

    public static Persona seleccionarEquipoDeUnaPersona(int id) 
            throws Exception
    {
        per = tper.seleccionarEquipoDeUnaPersona(id);

        return per;
    } 

    public static String datosTodosLosAsistentes() throws Exception
    {
        String datos="";
        ArrayList<Asistente> lista = ta.seleccionarTodosLosAsistentes();
        for(int x = 0; x < lista.size(); x++)
            datos+= lista.get(x).toString();
        return datos;
    }

    public static Asistente seleccionarUnAsistente(int id) throws Exception
    {
        a = ta.seleccionarUnAsistente(id);

        return a;
    }

    public static Asistente seleccionarUnAsistentePersona(int id) 
            throws Exception
    {
        a = ta.seleccionarUnAsistentePersona(id);

        return a;
    }

    public static Asistente seleccionarAñosAsistente(int id) throws Exception
    {
        a = ta.seleccionarAñosAsistente(id);

        return a;
    }

    public static String datosTodosLosDueños() throws Exception
    {
        String datos="";
        ArrayList<Dueño> lista = td.seleccionarTodosLosDueños();
        for(int x = 0; x < lista.size(); x++)
            datos+= lista.get(x).toString();
        return datos;
    }

    public static Dueño seleccionarUnDueño(int id) throws Exception
    {
        d = td.seleccionarUnDueño(id);

        return d;
    }

    public static Dueño seleccionarUnDueñoPersona(int id) throws Exception
    {
        d = td.seleccionarUnDueño_Persona(id);

        return d;
    }

    public static Dueño seleccionarAñosDueño(int id) throws Exception
    {
        d = td.seleccionarAñosDueño(id);

        return d;
    }
    
    public static String datosTodosLosEntrnadores() throws Exception
    {
        String datos="";
        ArrayList<Entrenador> lista = tentre.seleccionarTodosLosEntrenadores();
        for(int x = 0; x < lista.size(); x++)
            datos+= lista.get(x).toString();
        return datos;
    }

    public static Entrenador seleccionarUnEntrenador(int id) throws Exception
    {
        entre = tentre.seleccionarUnEntrenador(id);

        return entre;
    }

    public static Entrenador seleccionarUnEntrenadorPersona(int id) 
            throws Exception
    {
        entre = tentre.seleccionarUnEntrenador_Persona(id);

        return entre;
    }

    public static Entrenador seleccionarMailEntrenador(int id) throws Exception
    {
        entre = tentre.seleccionarEmail(id);

        return entre;
    }    
    
    public static String datosTodosLosJugadores() throws Exception
    {
        String datos="";
        ArrayList<Jugador> lista = tjug.seleccionarTodosLosJugadores();
        for(int x = 0; x < lista.size(); x++)
            datos+= lista.get(x).toString();
        return datos;
    }

    public static Jugador seleccionarUnJugador(int id) throws Exception
    {
        jug = tjug.seleccionarUnJugador(id);

        return jug;
    }

    public static Jugador seleccionarUnJugadorPersona(int id) throws Exception
    {
        jug = tjug.seleccionarUnJugador_Persona(id);

        return jug;
    }

    public static Jugador seleccionarRolJugador(int id) throws Exception
    {
        jug = tjug.seleccionarRol(id);

        return jug;
    }    
    
    public static ArrayList<Usuario> seleccionarTodosLosUsuarios() throws Exception
    {
        String datos="";
        ArrayList<Usuario> lista = tu.seleccionarTodosLosUsuarios();
        
        return lista;
    }
    
    public static Usuario seleccionarUnUsuario(int id) throws Exception
    {
        Usuario u = tu.seleccionarUnUsuario(id);

        return u;
    }    
    
    public static Usuario seleccionarTipoDeUsuario(String nom) throws Exception
    {
        Usuario u = tu.seleccionarTipoDeUsuario(nom);

        return u;
    }    
    
    
    
    
    
    
    
    
    
    
    


    
}
