package miprimerobjetog03;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    
    public static ArrayList<Curso> listaCursos = new ArrayList<Curso>();
    public static ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>();
    public static ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
    public static ArrayList<Grupo> listaGrupos = new ArrayList<Grupo>();

    public static void crearProfesor() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre del profesor");
        String nombre = input.nextLine();
        System.out.println("Ingrese la especialidad del profesor");
        String especialidad = input.nextLine();
        boolean ciclo = true;
        TGrado grado = null;
        while(ciclo) {
            System.out.println("Ingrese el grado academico del profesor (tenico,bachiller,licenciado,master o doctor)");
            String sGrado = input.nextLine();
            switch(sGrado) {
              case "tecnico":
                grado = TGrado.TECNICO;
                ciclo = false;
                break;
              case "bachiller":
                grado = TGrado.BACHILLER;
                ciclo = false;
                break;
              case "licenciado":
                grado = TGrado.LICENCIADO;
                ciclo = false;
                break;
              case "master":
                grado = TGrado.MASTER;
                ciclo = false;
                break;
              case "doctor":
                grado = TGrado.DOCTOR;
                ciclo = false;
                break;
              default:
                System.out.println("vuelva a intentarlo...");
            }
        }
        System.out.println("Ingrese ID del profesor");
        int id = input.nextInt();
        for (Profesor actual : listaProfesores) {
            if(actual.getNombre().equals(nombre) || actual.getId() == id){
              System.out.println("Un profesor con el mismo nombre o ID ya existe, vuelvalo a intentar...");
              input.nextLine();
              input.nextLine();
              return;
            }
        }
        Profesor profesor = new Profesor(id, nombre, especialidad, grado);
        listaProfesores.add(profesor);
    }
    public static void crearEstudiante() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante");
        String nombre = input.nextLine();
        System.out.println("Ingrese el carne del estudiante");
        int carne = input.nextInt();
        for (Estudiante actual : listaEstudiantes) {
            if(actual.getCarne() == carne) {
              System.out.println("Un estudiante con el mismo carne ya existe, vuelvalo a intentar...");
              input.nextLine();
              input.nextLine();
              return;
            }
        }
        Estudiante estudiante = new Estudiante(carne, nombre, null, null, 0, TEstado.ACTIVO);
        listaEstudiantes.add(estudiante);
    }

    public static void crearCurso() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el codigo del curso");
        String codigo = input.nextLine();
        System.out.println("Ingrese el nombre del curso");
        String nombre = input.nextLine();
        System.out.println("Ingrese los creditos del curso");
        int p_creditos = input.nextInt();
        for (Curso actual : listaCursos) {
            if(actual.getCodigo().equals(codigo) || actual.getNombre().equals(nombre)) {
                System.out.println("Un curso con el mismo nombre o codigo existe, vuelvalo a intentar...");
                input.nextLine();
                input.nextLine();
                return;
            }
        }
        Curso curso = new Curso(codigo,nombre,p_creditos);
        listaCursos.add(curso);
    }
    public static void crearGrupo() {
        Profesor profesor = null;
        Curso curso = null;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el nombre del profesor");
        String nombreProfesor = input.nextLine();
        for(Profesor actual : listaProfesores) {
            if(actual.getNombre().equals(nombreProfesor)) {
                profesor = actual;
            }
        }
        if (profesor == null) {
            System.out.println("El profesor no existe, vuelvalo a intentar...");
            input.nextLine();
            return;
        }

        System.out.println("Ingrese codigo del curso");
        String codigoCurso = input.nextLine();
        for(Curso actual : listaCursos) {
            if(actual.getCodigo().equals(codigoCurso)) {
                curso = actual;
            }
        }

        if (curso == null) {
          System.out.println("El curso no existe, vuelvalo a intentar...");
          input.nextLine();
          return;
        }
        
        System.out.println("Ingrese el numero del grupo");
        int numero = input.nextInt();
        System.out.println("Ingrese el cupo");
        int cupo = input.nextInt();
        
        for(Grupo actual : listaGrupos) {
            if(actual.getNumero() == numero && actual.getElCurso().equals(curso)) {
              System.out.println("El un grupo con el mismo numero y curso existe, vuelvalo a intentar...");
              input.nextLine();
              input.nextLine();
              return;
            }
        }

        Grupo grupo = new Grupo(numero, cupo, profesor, curso);
        listaGrupos.add(grupo);
    }

    public static void consultarGrupo() {
        
        Scanner input = new Scanner(System.in);
        Curso curso = null;
        System.out.println("Ingrese codigo del curso");
        String codigoCurso = input.nextLine();
        for(Curso actual : listaCursos) {
            if(actual.getCodigo().equals(codigoCurso)) {
                curso = actual;
            }
        }

        if (curso == null) {
          System.out.println("El curso no existe, vuelvalo a intentar...");
          input.nextLine();
          return;
        }
        System.out.println("Ingrese el numero del grupo");
        int numero = input.nextInt();
        for(Grupo actual : listaGrupos) {
            if(actual.getNumero() == numero && actual.getElCurso().equals(curso)) {
                System.out.println(actual);
                System.out.println("Presione enter para continuar...");
                input.nextLine();
                input.nextLine();
                return;
            }
        }
        System.out.println("El grupo no existe...");
        input.nextLine();
        input.nextLine();
    }
    public static void agregarEstudiante() {
        Scanner input = new Scanner(System.in);
        Estudiante estudiante = null;
        Curso curso = null;
        Grupo grupo = null;
        System.out.println("Ingrese codigo del curso");
        String codigoCurso = input.nextLine();
        for(Curso actual : listaCursos) {
            if(actual.getCodigo().equals(codigoCurso)) {
                curso = actual;
            }
        }

        if (curso == null) {
          System.out.println("El curso no existe, vuelvalo a intentar...");
          input.nextLine();
          return;
        }
        System.out.println("Ingrese el numero del grupo");
        int numero = input.nextInt();
        for(Grupo actual : listaGrupos) {
            if(actual.getNumero() == numero && actual.getElCurso().equals(curso)) {
                grupo = actual;
            }
        }
        if (grupo == null) {
          System.out.println("El grupo no existe, vuelvalo a intentar...");
          input.nextLine();
          input.nextLine();
          return;
        }
        System.out.println("Ingrese el carne de un estudiante");
        int carne = input.nextInt();
        for(Estudiante actual : listaEstudiantes) {
            if(actual.getCarne() == carne) {
                estudiante = actual;
            }
        }
        if (estudiante == null) {
          System.out.println("El estudiante no existe, vuelvalo a intentar...");
          input.nextLine();
          input.nextLine();
          return;
        }

        boolean comprobar = grupo.agregarEstudiante(estudiante);

        if(!comprobar) {
          System.out.println("El estudiante no fue agregado, vuelvalo a intentar...");
          input.nextLine();
          input.nextLine();
        }
    }
    
    public static void agregarRubroCurso(){
        Scanner input = new Scanner(System.in);
        String codigo;
        int id;
        int porc;
        String nombre;
        int tipo;
        System.out.println("Ingrese el codigo del curso:");
        codigo = input.nextLine();
        for(Curso actual : listaCursos ){
            if(actual.getCodigo().equals(codigo)){
                System.out.println("Ingrese el nombre:");
                nombre = input.nextLine();
                System.out.println("Ingrese el numero de rubro:");
                id = input.nextInt();
                System.out.println("Ingrese el porcentaje:");
                porc = input.nextInt();
                System.out.println("Ingrese el tipo (QUIZ=0, EXAMEN=1, TAREA=2, PROYECTO=3, INVESTIGACION=4, EXPOSICION=5):");
                tipo = input.nextInt();
                TEvaluacion tipoE;
                if(tipo==0){
                    tipoE = TEvaluacion.QUIZ;
                }else if(tipo==1){
                    tipoE = TEvaluacion.EXAMEN;
                }else if(tipo==2){
                    tipoE = TEvaluacion.TAREA;
                }else if(tipo==3){
                    tipoE = TEvaluacion.PROYECTO;
                }else if(tipo==4){
                    tipoE = TEvaluacion.INVESTIGACION;
                }else{
                    tipoE = TEvaluacion.EXPOSICION;
                }
                actual.agregarRubro(id, nombre, porc, tipoE);
                System.out.println("Se agrego el nuevo rubro");
                return;
            }
        }
        System.out.println("El curso no existe");
    }
    
    public static void agregarCalificacionGrupo(){
       Scanner input = new Scanner(System.in);
       String codigo;
       int numero;
       int carnet;
       double nota;
       int tipo;
       String nombre;
       System.out.println("Ingrese el codigo de curso:");
       codigo = input.nextLine();
       System.out.println("Ingrese el numero del grupo:");
       numero = input.nextInt();
        for(Grupo actual : listaGrupos){
            if(actual.getNumero() == numero && actual.getElCurso().getCodigo().equals(codigo)){
                System.out.println("Ingrese el nombre del rubro:");
                input.nextLine();
                nombre = input.nextLine();
                System.out.println("Ingrese el numero de carnet:");
                carnet = input.nextInt();
                System.out.println("Ingrese la nota:");
                nota = input.nextInt();
                System.out.println("Ingrese el tipo (QUIZ=0, EXAMEN=1, TAREA=2, PROYECTO=3, INVESTIGACION=4, EXPOSICION=5):");
                tipo = input.nextInt();
                TEvaluacion tipoE;
                if(tipo==0){
                    tipoE = TEvaluacion.QUIZ;
                }else if(tipo==1){
                    tipoE = TEvaluacion.EXAMEN;
                }else if(tipo==2){
                    tipoE = TEvaluacion.TAREA;
                }else if(tipo==3){
                    tipoE = TEvaluacion.PROYECTO;
                }else if(tipo==4){
                    tipoE = TEvaluacion.INVESTIGACION;
                }else{
                    tipoE = TEvaluacion.EXPOSICION;
                }
                actual.agregarEvaluacion(carnet, nombre, tipoE, nota);
                System.out.println("Se agrego la calificacion.");
                return;
            }
        }
        System.out.println("El grupo de ese curso no existe.");
    }
    
    public static void consultarPromediosEstudiantes(){
        Scanner input = new Scanner(System.in);
        String codigo;
        int numero;
        int carnet;
        System.out.println("Ingrese el codigo del curso:");
        codigo = input.nextLine();
        System.out.println("Ingrese el numero del grupo:");
        numero = input.nextInt();
        for(Grupo actual : listaGrupos){
            if(actual.getNumero() == numero && actual.getElCurso().getCodigo().equals(codigo)){
                System.out.println("Digite el carnet del estudiante:");
                carnet = input.nextInt();
                System.out.println(actual.desglosePromedio(carnet));
                return;
            }
        }
        System.out.println("NO se encontro ningun dato");
    }
    public static void main(String[] args) {
        Scanner opcion = new Scanner(System.in);
        int number;
        boolean salida = true;
        while(salida){
          
          System.out.println("-----Menú Principal-----"+'\n');
          System.out.println("Opción 1: Crear Profesor"+'\n'+
                            "Opción 2: Crear Estudiante"+'\n'+
                            "Opción 3: Crear Curso"+'\n'+
                            "Opción 4: Crear Grupo"+'\n'+
                            "Opción 5: Agregar Estudiante a un grupo"+'\n' +
                            "Opción 6: Agregar Rubro a un curso"+'\n'+
                            "Opción 7: Agregar Calificación a un grupo"+'\n'+
                            "Opción 8: Consultar Promedios de estudiantes"+'\n'+
                            "Opción 9: Consultar Grupo"+'\n'+
                            "Opcion 0: Cancelar"+'\n');
          System.out.print("Escoga una opción: ");
          number = opcion.nextInt();
          
          switch(number) {
              case 1:
                crearProfesor();
                break;
              case 2:
                crearEstudiante();
                break;
              case 3:
                crearCurso();
                break;
              case 4:
                crearGrupo();
                break;
              case 5:
                agregarEstudiante();
                break;
              case 6:
                agregarRubroCurso();
                break;
              case 7:
                agregarCalificacionGrupo();
                break;
              case 8:
                consultarPromediosEstudiantes();
                break;
              case 9:
                consultarGrupo();
                break;
              case 0:
                salida = false;
                break;
              default:
                System.out.println("ERROR: VUELVA A INTERNARLO");
                opcion.nextLine();
                opcion.nextLine();
            
          }
        }
        
    }
}
