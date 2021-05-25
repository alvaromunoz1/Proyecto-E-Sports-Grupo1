/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import ModeloDB.*;
import ModeloUML.*;
import Vista.*;
import java.sql.Array;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JComboBox;
import javax.swing.JFrame;



/**
 *
 * @author Imanol Urquijo
 * Desde linea 1 hasta 1080
 */
public class ProyectoESport {

    private static int posicion;
    private static ArrayList<Jornada> jornadas;

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
    
    private static PP vp;
    private static Login vl;
    private static Clasificaciones vc;
    private static BorrarDueño vbd;
    private static BorrarEqui vbe;
    private static BorrarJornada vbjor;
    private static BorrarJug vbjug;
    private static BorrarPartido vbp;
    private static BorrarUsuario vbu;
    private static IntroDueño vid;
    private static IntroJug vijug;
    private static IntroEqui vie;
    private static IntroResult vir;
    private static IntroUsuario viu;
    private static IntroJornada vij;
    private static IntroPartido vip;
    private static ModDueño vmd;
    private static ModEqui vme;
    private static ModJug vmjug;
    private static ModUsuario vmu;
    private static VistaAdmin vadmin;
    private static VerDueño vvd;
    private static VerEqui vve;
    private static VerJug vvjug;
    private static VerUsuario vvu;
    private static JornadasUsu vjusu;
    private static JornadasAdmin vjadmin;
    private static VistaCalendar vcc;
    
    
    public static void main(String[] args) {
    
        CrearTablas();
        VistaPrincipalAdmin();
        
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
            tu = new TablaUsuario();
            
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
        
    
    public static void VistaLogin()
    {
        vl = new Login();
        vl.setVisible(true);
    }
    
    public static void VistaPrincipalUsuario() 
    {
        vl.dispose();
        vp = new PP();
        vp.setVisible(true);
    }

    public static void VistaPrincipalAdmin() 
    {
        vadmin = new VistaAdmin();
        vadmin.setVisible(true);
    }
    
    public static void SalirPrograma() 
    {
        System.exit(1);
    }    
        
    
    public static void VistaBorrarDueño() 
    {
        vadmin.setVisible(false);
        vbd = new BorrarDueño();
        vbd.setVisible(true);
    }    
    public static void VistaBorrarEquipo() 
    {
        vadmin.setVisible(false);
        vbe = new BorrarEqui();
        vbe.setVisible(true);
    } 
    public static void VistaBorrarJornada() 
    {
        vadmin.setVisible(false);
        vbjor = new BorrarJornada();
        vbjor.setVisible(true);
    } 
    public static void VistaBorrarJugador() 
    {
        vadmin.setVisible(false);
        vbjug = new BorrarJug();
        vbjug.setVisible(true);
    } 
    public static void VistaBorrarPartido() 
    {
        vadmin.setVisible(false);
        vbp = new BorrarPartido();
        vbp.setVisible(true);
    } 
    public static void VistaBorrarUsuario() 
    {
        vadmin.setVisible(false);
        vbu = new BorrarUsuario();
        vbu.setVisible(true);
    } 
    public static void VistaIntroDueño() 
    {
        vadmin.setVisible(false);
        vid = new IntroDueño();
        vid.setVisible(true);
    } 
    public static void VistaIntroEquipo() 
    {
        vadmin.setVisible(false);
        vie = new IntroEqui();
        vie.setVisible(true);
    } 
    public static void VistaIntroJugador() 
    {
        vadmin.setVisible(false);
        vijug = new IntroJug();
        vijug.setVisible(true);
    } 
    public static void VistaIntroResultado() 
    {
        vadmin.setVisible(false);
        vir = new IntroResult();
        vir.setVisible(true);
    } 
    public static void VistaIntroUsuario() 
    {
        vadmin.setVisible(false);
        viu = new IntroUsuario();
        viu.setVisible(true);
    } 
    public static void VistaModificarDueño() 
    {
        vadmin.setVisible(false);
        vmd = new ModDueño();
        vmd.setVisible(true);
    } 
    public static void VistaModificarEquipo() 
    {
        vadmin.setVisible(false);
        vme = new ModEqui();
        vme.setVisible(true);
    } 
    public static void VistaModificarJugador() 
    {
        vadmin.setVisible(false);
        vmjug = new ModJug();
        vmjug.setVisible(true);
    } 
    public static void VistaModificarUsuario() 
    {
        vadmin.setVisible(false);
        vmu = new ModUsuario();
        vmu.setVisible(true);
    } 
    public static void VistaIntroJornada() 
    {
        vadmin.setVisible(false);
        vij = new IntroJornada();
        vij.setVisible(true);
    }

    public static void VistaIntroPartido() 
    {
        vadmin.setVisible(false);
        vip = new IntroPartido();
        vip.setVisible(true);
    }
    
    public static void VistaVerDueño() 
    {
        vadmin.setVisible(false);
        vvd = new VerDueño();
        vvd.setVisible(true);
    } 
    public static void VistaVerEquipo() 
    {
        vadmin.setVisible(false);
        vve = new VerEqui();
        vve.setVisible(true);
    } 
    public static void VistaVerJugador() 
    {
        vadmin.setVisible(false);
        vvjug = new VerJug();
        vvjug.setVisible(true);
    } 
    public static void VistaVerUsuario() 
    {
        vadmin.setVisible(false);
        vvu = new VerUsuario();
        vvu.setVisible(true);
    } 

    public static void VistaUltimaJornada() 
    {
        vp.setVisible(false);
        vjusu = new JornadasUsu();
        vjusu.setVisible(true);
    }    

    public static void VistaJornadaAdmin() 
    {
        vadmin.setVisible(false);
        vjadmin = new JornadasAdmin();
        vjadmin.setVisible(true);
    }

    public static void VistaCrearCal() 
    {
        vadmin.setVisible(false);
        vcc = new VistaCalendar();
        vcc.setVisible(true);
    }
    
    public static void VistaClasificaciones() 
    {
        vc = new Clasificaciones();
        vc.setVisible(true);
    }
    
    public static void volverPrincipalAdministrador (JFrame v)
    {
        v.dispose();
        vadmin.setVisible(true);
    }
    
    
        public static void volverPrincipalUsuario (JFrame v)
    {
        v.dispose();
        vp.setVisible(true);
    }
        
        
        public static void volverAtras (JFrame v)
    {
        v.dispose();
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
    public static void insertarUsuario(int id,String nombre,String contra, char tipo) 
            throws Exception
    {
                u = new Usuario(id,nombre,contra,tipo);
                tu.insertarUsuario(u);
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
    
    public static void bajaUsuario(int id) throws Exception
    {
        u.setId(id);
        tu.borrarUsuario(u);
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
    
    public static void insertarPartidoBasico(int ID,String Nombre,
            int ID_Jornada) throws Exception
    {
                p = new Partido(ID,Nombre,ID_Jornada);
                tp.insertarPartidoBasico(p);
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
            int id_calendario) throws Exception
    {
                int puntos = 0;
                e = new Equipo(id,nombre,web,puntos,id_calendario);
                
                te.insertar(e);
    }
    
    
    public static void modificarEquipo(int id, String nombre, 
            String web,int equipo,int puntos) throws Exception
    {
        e.setId(id);
        e.setNombre(nombre);
        e.setPaginaWeb(web);
        e.setId_calendario(id);
        e.setPuntos(id);
        
        te.actualizarNombreYWebCalendario(e);
        te.actualizarPuntos(e);
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
            double sueldo, int id_equipo) throws Exception
    {
        per.setId(id);
        per.setNombre(nombre);
        per.setNick(nick);
        per.setSueldo(sueldo);
        per.getEquipo().setId(id);
        
        tper.insertar(per);
    }
    
    public static void modificarPersona(int id,String nombre,String nick, double sueldo, int equipo) throws Exception
    {
        per.setId(id);
        per.setNombre(nombre);
        per.setNick(nombre);
        per.setSueldo(id);
        per.getEquipo().setId(id);
        
        tper.actualizarPersona(per);
    }
    
    public static void modificarSueldo(int id,int sueldo) throws Exception
    {
        per.setId(0);
        per.setSueldo(sueldo);
        
        tper.ModificarSueldo(per);
    }
    
    public static void modificarUsuario(int id,String nombre,String contra,char tipo) throws Exception
    {
        u.setId(id);
        u.setNombre(nombre);
        u.setContraseña(contra);
        u.setTipo(tipo);
        
        tu.cambiarUsuario(u);
    }
    
    public static void cambiarPersonaDeEquipo(int id,int id_equipo) 
            throws Exception
    {
        per.setId(id);
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
    
    public static ArrayList<Calendario> datosCalendarios() throws Exception
    {
        ArrayList<Calendario> lista = tc.seleccionarTodo();

        return lista;
    }
    
    public static Calendario seleccionarCalendarioConJornadas(int id) 
            throws Exception
    {
        c = tc.seleccionarCalendarioConJornada(id);

        return c;
    }
    
    public static ArrayList<Jornada> datosTodasLasJornada() throws Exception
    {
        ArrayList<Jornada> lista = tj.seleccionarTodo();

        return lista;
    }
    
    public static ArrayList<Jornada> seleccionarJornadasPorCalendario(int id) throws Exception
    {
        ArrayList<Jornada> lista = tj.seleccionarJornadasPorCalendario(id);

        return lista;
    }
    
    public static Jornada seleccionarJornadaPorID(int id) throws Exception
    {
        j = tj.seleccionarUnaJornada(id);

        return j;
    }
    
    public static Jornada seleccionarIDdeJornada(String nombre) throws Exception
    {
        j = tj.seleccionarIdJornada(nombre);

        return j;
    }    
    
    public static Jornada seleccionarJornadaConPartidos(int id) 
            throws Exception
    {
        j = tj.seleccionarUnaJornadaConPartidos(id);

        return j;
    }
    
    public static ArrayList<Partido> seleccionarTodosLosPartidos() throws Exception
    {

        ArrayList<Partido> lista = tp.seleccionarPartidos();

        return lista;
    }
    
    public static ArrayList<Partido> seleccionarPartidosPorJornada(int id) throws Exception
    {

        ArrayList<Partido> lista = tp.seleccionarPartidosPorJornada(id);
        
        return lista;
    }
    
    public static Partido seleccionarUnPartido(int id) throws Exception
    {
        p = tp.seleccionarUnPartidoSinResultado(id);

        return p;
    }
    
    public static Partido seleccionarIDdPartido(String nombre) throws Exception
    {
        p = tp.seleccionarIDdePartido(nombre);

        return p;
    }    
    
    public static ArrayList<Equipo> datosTodosLosEquipos() throws Exception
    {
        ArrayList<Equipo> lista = te.seleccionarTodosLosEquipos();

        return lista;
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
    
    public static ArrayList<Equipo> seleccionarPuntosPorEquipos() throws Exception
    {
        ArrayList<Equipo> lista = te.seleccionarPuntosPorEquipos();
        
        return lista;
    }
    
        public static String datosTodosLasPersonas() throws Exception
    {
        String datos="";
        ArrayList<Persona> lista = tper.seleccionarTodosLasPersonas();
        for(int x = 0; x < lista.size(); x++)
            datos+= lista.get(x).toString();
        return datos;
    }
    

        public static ArrayList<Partido> seleccionarResultadoPorLocal(int id) throws Exception
    {
        ArrayList<Partido> lista = tp.seleccionarResultadoComoLocal(id);

        return lista;
    }

        public static ArrayList<Partido> seleccionarResultadoPorVisitante(int id) throws Exception
    {
        ArrayList<Partido> lista = tp.seleccionarResultadoComoVisitante(id);

        return lista;
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

    public static ArrayList<Persona> seleccionarIDdeTodasLasPersonas() throws Exception
    {

        ArrayList<Persona> lista = tper.seleccionarTodosLosID();

        return lista;
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

    public static ArrayList<Dueño> seleccionarTodosLosDueños() throws Exception
    {
        ArrayList<Dueño> lista = td.seleccionarTodosLosDueños();

        return lista;
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
    
    public static boolean llenarJornadas(JComboBox lista){
        try
        {
            ArrayList<Jornada> jornadas = tj.seleccionarTodo();
            
            for(int x = 0; x < jornadas.size(); x++)
            {
                lista.insertItemAt(jornadas.get(x).getNombre(), x);
            }
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }

    public static boolean llenarJornadasID(JComboBox lista){
        try
        {
            ArrayList<Jornada> jornadas = tj.seleccionarTodo();
            
            for(int x = 0; x < jornadas.size(); x++)
            {
                lista.insertItemAt(jornadas.get(x).getId(), x);
            }
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }       
    public static boolean llenarDueñosID(JComboBox lista){
        try
        {
            ArrayList<Dueño> dueño = td.seleccionarTodosLosDueños();
            
            for(int x = 0; x < dueño.size(); x++)
            {
                lista.insertItemAt(dueño.get(x).getId(), x);
            }
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }       
    public static boolean llenarJugadoresID(JComboBox lista){
        try
        {
            ArrayList<Jugador> jug = tjug.seleccionarTodosLosJugadores();
            
            for(int x = 0; x < jug.size(); x++)
            {
                lista.insertItemAt(jug.get(x).getId(), x);
            }
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }       
    public static boolean llenarEquiposID(JComboBox lista){
        try
        {
            ArrayList<Equipo> equi = te.seleccionarTodosLosEquipos();
            
            for(int x = 0; x < equi.size(); x++)
            {
                lista.insertItemAt(equi.get(x).getId(), x);
            }
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }       
    public static boolean llenarUsuariosID(JComboBox lista){
        try
        {
            ArrayList<Usuario> usu = tu.seleccionarTodosLosUsuarios();
            
            for(int x = 0; x < usu.size(); x++)
            {
                lista.insertItemAt(usu.get(x).getId(), x);
            }
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }       
    public static boolean llenarPartidosID(JComboBox lista){
        try
        {
            ArrayList<Partido> par = tp.seleccionarPartidos();
            
            for(int x = 0; x < par.size(); x++)
            {
                lista.insertItemAt(par.get(x).getId(), x);
            }
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }    
    public static boolean llenarPartidos(JComboBox lista){
        try
        {
            ArrayList<Partido> partidos = tp.seleccionarPartidosPorJornada(Vista.IntroResult.idj.getId());
            
            for(int x = 0; x < partidos.size(); x++)
            {
                lista.insertItemAt(partidos.get(x).getNombre(), x);
            }
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }    

    public static int[] NumeroAleatorio(){
    try
        {
        
        int n=te.seleccionarTodosLosEquipos().size();
        int k=n;
        int[] numeros=new int[n];
        int[] resultado=new int[n];
        Random rnd=new Random();
        int res;
        
        
        //se rellena una matriz ordenada del 1 al 31(1..n)
        for(int i=0;i<n;i++){
            numeros[i]=i+1;
        }
        
        for(int i=0;i<n;i++){
            res=rnd.nextInt(k);            
            resultado[i]=numeros[res];
            numeros[res]=numeros[k-1];
            k--;
            
        }
        
        return resultado;
        }
        catch(Exception e)
        {
            return null;
        }
    }  
    
    public static void llenarPartidosJornada1(int p,int j,int[] alea) throws Exception{
       
        Partido p1 = new Partido();
        Partido p2 = new Partido();
        Partido p3 = new Partido();
        Partido p4 = new Partido();
        
        int[] num=new int[8];
        num=alea;
        
        p1.setId(100+p);
        p1.setNombre(te.seleccionarUnEquipo(num[0]).getNombre() + " VS" + te.seleccionarUnEquipo(num[1]).getNombre());
        p1.getLocal().setId(num[0]);
        p1.getVisitante().setId(num[1]);
        p1.setId_jornada(1+j);
        
        p2.setId(101+p);
        p2.setNombre(te.seleccionarUnEquipo(num[2]).getNombre() + " VS" + te.seleccionarUnEquipo(num[3]).getNombre());
        p2.getLocal().setId(num[2]);
        p2.getVisitante().setId(num[3]);
        p2.setId_jornada(1+j);
        
        p3.setId(102+p);
        p3.setNombre(te.seleccionarUnEquipo(num[4]).getNombre() + " VS" + te.seleccionarUnEquipo(num[5]).getNombre());
        p3.getLocal().setId(num[4]);
        p3.getVisitante().setId(num[5]);
        p3.setId_jornada(1+j);
        
        p4.setId(103+p);
        p4.setNombre(te.seleccionarUnEquipo(num[6]).getNombre() + " VS" + te.seleccionarUnEquipo(num[7]).getNombre());
        p4.getLocal().setId(num[6]);
        p4.getVisitante().setId(num[7]);
        p4.setId_jornada(1+j);
        
        tp.emparejarEquipos(p1);
        tp.emparejarEquipos(p2);
        tp.emparejarEquipos(p3);
        tp.emparejarEquipos(p4);
            
    } 
    
    public static void crearEmparejamientos() throws Exception{
       
        int idpar=0;
        int idjor=0;
        
        llenarPartidosJornada1(idpar,idjor,NumeroAleatorio());
        
        for(int x=0;x<tj.seleccionarTodo().size();x++)
        {
            idpar=idpar+4;
            idjor=idjor+1;
            
            int[] alea=new int[8];
            while(numerosRepe(alea,x+1))
                alea=NumeroAleatorio();
                
            llenarPartidosJornada1(idpar,idjor,alea);
            
        }          
            
    }     
    
    public static boolean numerosRepe(int[] alea,int id) throws Exception{
        
        int[] alea1= new int[8];
        
            alea1[0]=tp.seleccionarPartidosPorJornada(id).get(0).getLocal().getId();
            alea1[1]=tp.seleccionarPartidosPorJornada(id).get(0).getVisitante().getId();
            alea1[2]=tp.seleccionarPartidosPorJornada(id).get(1).getLocal().getId();
            alea1[3]=tp.seleccionarPartidosPorJornada(id).get(1).getVisitante().getId();
            alea1[4]=tp.seleccionarPartidosPorJornada(id).get(2).getLocal().getId();
            alea1[5]=tp.seleccionarPartidosPorJornada(id).get(2).getVisitante().getId();
            alea1[6]=tp.seleccionarPartidosPorJornada(id).get(3).getLocal().getId();
            alea1[7]=tp.seleccionarPartidosPorJornada(id).get(3).getVisitante().getId();     
        
            if(Arrays.equals(alea,alea1))
                return true;
            return false;
    }    
    
    public static void crearJornadas() throws Exception{
       
        int num = te.seleccionarTodosLosEquipos().size();
        int todoj = (num-1)*2;
        int todop = ((num-1)*2)*4;
        int id=0;
        Partido p1 = new Partido();
        Partido p2 = new Partido();
        Partido p3 = new Partido();
        Partido p4 = new Partido();
        
        for(int x=0;x<todoj;x++)
        {
            id=x+1;
            j.setId(id);
            j.setNombre("JORNADA"+id);
            java.util.Date fecha = null;
            j.setFecha(fecha);
            tj.insertar(j);
        }    
            
        for(int x=0;x<todop;x++)
        {
            id=100+x;
            
            p1.setId(id);
            
            tp.insertarPartidoSoloID(p);
        } 
           
    }    
    
    public static void crearCalendario(int id, String nombre) throws Exception{
       
        crearJornadas();
        tc.activarProcedimientoCalendario(id,nombre);
            
    }    
    
    
    
    
    
    
    
    
    }
    
   
    
    
    
    
    
    
    


    

