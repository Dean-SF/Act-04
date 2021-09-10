package miprimerobjetog03;
import java.util.Scanner;
import miprimerobjetog03.Grupo;
public class Menu {
    static Profesor elProfe = new Profesor();
    static Scanner input = new Scanner(System.in);
    static Grupo elGrupo = new Grupo();

    public static void registrarProfe(){
        System.out.print("Ingrese ID del profesor: ");
        int unID = input.nextInt();
        elProfe.setId(unID);
        System.out.print("Ingrese nombre del profesor: ");
        String nombre = input.next();
        elProfe.setNombre(nombre);
        System.out.print("Ingrese especialidad del profesor: ");
        String especialidad = input.next();
        elProfe.setEspecialidad(especialidad);
    }
    public static void crearEstudiante(){
        Estudiante elEstudiante = new Estudiante();
        System.out.print("Ingrese nombre del estudiante: ");
        String nombre = input.next();
        elEstudiante.setNombre(nombre);
        System.out.print("Ingrese carné del estudiante: ");
        int carnet = input.nextInt();
        elEstudiante.setCarne(carnet);
        System.out.print("Ingrese número del estudiante: ");
        String numero = input.next();
        elEstudiante.setCelular(numero);

    }
    public static void crearCurso(){
        Curso elCurso = new Curso();
        System.out.print("Ingrese nombre del curso: ");
        String nombre = input.next();
        elCurso.setNombre(nombre);
        System.out.print("Ingrese codigo del curso: ");
        String codigo = input.next();
        elCurso.setCodigo(codigo);
        System.out.print("Ingrese creditos del curso: ");
        int creditos = input.nextInt();
        elCurso.setCreditos(creditos);
        System.out.print("Ingrese horas del curso: ");
        int horas = input.nextInt();
        elCurso.setHoras(horas);
    }
    public static void crearGrupo(){
        
        System.out.print("Ingrese número del curso: ");
        int numero = input.nextInt();
        elGrupo.setNumero(numero);
        System.out.print("Ingrese cupo del curso: ");
        int cupo = input.nextInt();
        elGrupo.setCupo(cupo);
        System.out.print("Ingrese ID del profesor del curso: ");
        String id = input.next();
        System.out.print("Ingrese nombre del profesor del curso: ");
        String nombreProfesor = input.next();
        
        /*elGrupo.setElProfesor(nombreProfesor);
        elGrupo.setElProfesor(profesor);
        System.out.print("Ingrese curso del curso: ");
        String profesor = input.next();
        elGrupo.setElCurso(profesor);*/

    }
    public static void registrarEstudiante(){

    }
    public static void crearEvaluacion(){
        Rubro_Evaluacion laEvaluacion = new Rubro_Evaluacion();
        System.out.print("Ingrese número de Evaluación: ");
        int numero = input.nextInt();
        laEvaluacion.setNum(numero);
        System.out.print("Ingrese nombre de Evaluación: ");
        String nombre = input.next();
        laEvaluacion.setNombre(nombre);
        System.out.print("Ingrese porcentaje de Evaluación: ");
        double porcentaje = input.nextInt();
        laEvaluacion.setPorcentaje(porcentaje);
        System.out.print("Ingrese tipo de Evaluación: ");
        String tipo = input.next();
        //laEvaluacion.setTipo(tipo);

    }
    public static void registrarCalificacion(){
        //Rubro_Evaluacion unaEvaluacion, Estudiante unEstudiante, double nota
        System.out.print("Ingrese evaluación: ");
        String evaluacion = input.next();
        System.out.print("Ingrese estudiante: ");
        String estudiante = input.next();
        System.out.print("Ingrese nota: ");
        double nota = input.nextInt();
        //Calificacion laCalificacion = new Calificacion(evaluacion,estudiante,nota);
    }
    public static double consultarPromedios(int carnet){
        return elGrupo.obtenerPromedio(carnet);
    }
    public static void desglozarPromedios(int carnet){
        System.out.println(elGrupo.desglosePromedio(2021052762));
    }
    public static void main(String[] args) {
        //Menu Principal
        Estudiante deyanSanabria = new Estudiante();
        deyanSanabria.setNombre("Deyan Sanabria Fallas");
        deyanSanabria.setCarne(2021046131);
        deyanSanabria.setEstado(TEstado.ACTIVO);

        Estudiante estebanPerez = new Estudiante();
        estebanPerez.setNombre("Esteban Pérez Picado ");
        estebanPerez.setCarne(2021046572);
        estebanPerez.setEstado(TEstado.ACTIVO);

        Estudiante davidMorales = new Estudiante();
        davidMorales.setNombre("David Morales Vargas ");
        davidMorales.setCarne(2021052762);
        davidMorales.setEstado(TEstado.ACTIVO);


        // Curso, Profe y Grupo para Estructuras de datos:
        Profesor mauricioAviles = new Profesor(1, "Mauricio Avilés", "Ing. Software",TGrado.MASTER);
        Curso estructurasDeDatos = new Curso("IC-2001", "Estructura de datos", 4, 4, true);
        Grupo edGrupo40 = new Grupo(40,30,mauricioAviles,estructurasDeDatos);

        estructurasDeDatos.agregarRubro(1, "Tarea 1", 8, TEvaluacion.TAREA);
        estructurasDeDatos.agregarRubro(2, "Tarea 2", 8, TEvaluacion.TAREA);
        estructurasDeDatos.agregarRubro(3, "Tarea 3", 8, TEvaluacion.TAREA);
        estructurasDeDatos.agregarRubro(4, "Tarea 4", 8, TEvaluacion.TAREA);
        estructurasDeDatos.agregarRubro(5, "Tarea 5", 8, TEvaluacion.TAREA);
        estructurasDeDatos.agregarRubro(6, "Proyecto 1", 20, TEvaluacion.PROYECTO);
        estructurasDeDatos.agregarRubro(7, "Proyecto 2", 20, TEvaluacion.PROYECTO);
        estructurasDeDatos.agregarRubro(8, "Quiz 1", 4, TEvaluacion.QUIZ);
        estructurasDeDatos.agregarRubro(9, "Quiz 2", 4, TEvaluacion.QUIZ);
        estructurasDeDatos.agregarRubro(10, "Quiz 3", 4, TEvaluacion.QUIZ);
        estructurasDeDatos.agregarRubro(11, "Quiz 4", 4, TEvaluacion.QUIZ);
        estructurasDeDatos.agregarRubro(12, "Quiz 5", 4, TEvaluacion.QUIZ);
        
        edGrupo40.setHorario("Miercoles y Viernes de 9:30-11:20");
        edGrupo40.setAula("B5-2");
        edGrupo40.setSede("Campus Local San Jose");

        edGrupo40.agregarEstudiante(deyanSanabria);
        edGrupo40.agregarEstudiante(estebanPerez);
        edGrupo40.agregarEstudiante(davidMorales);

        System.out.println("---------------- Se crea un grupo de ED ----------------");
        System.out.println(edGrupo40);
        
        System.out.println("Estan los rubros completos?: " + estructurasDeDatos.validarRubros() + '\n');

        System.out.println("---------------- Se crean evaluaciones -----------------");

        System.out.println("Evaluacion de Quiz 1 (nota 90) para Deyan Sanabria Fallas:");
        System.out.println("Se pudo?: " + edGrupo40.agregarEvaluacion(2021046131, "Quiz 1", TEvaluacion.QUIZ, 90));
        System.out.println("Evaluacion de Quiz 2 (nota 90) para Esteban Pérez Picado:");
        System.out.println("Se pudo?: " + edGrupo40.agregarEvaluacion(2021046572, "Quiz 2", TEvaluacion.QUIZ, 90));
        System.out.println("Evaluacion de Quiz 3 (nota 90) para Deyan Sanabria Fallas:");
        System.out.println("Se pudo?: " + edGrupo40.agregarEvaluacion(2021046131, "Quiz 3", TEvaluacion.QUIZ, 90));
        System.out.println("Evaluacion de Proyecto 1 (nota 100) para Esteban Pérez Picado:");
        System.out.println("Se pudo?: " + edGrupo40.agregarEvaluacion(2021046572, "Proyecto 1", TEvaluacion.PROYECTO, 100));
        System.out.println("Evaluacion de Proyecto 2 (nota 100) para Deyan Sanabria Fallas:");
        System.out.println("Se pudo?: " + edGrupo40.agregarEvaluacion(2021046131, "Proyecto 2", TEvaluacion.PROYECTO, 100));

        System.out.println("Evaluacion de Quiz 10 (nota 90) para Deyan Sanabria Fallas:");
        System.out.println("Se pudo?: " + edGrupo40.agregarEvaluacion(2021046131, "Quiz 10", TEvaluacion.QUIZ, 90));

        System.out.println("Evaluacion de Quiz 2 (nota 90) para Esteban Pérez Picado (de nuevo):");
        System.out.println("Se pudo?: " + edGrupo40.agregarEvaluacion(2021046572, "Quiz 2", TEvaluacion.QUIZ, 90));

        System.out.println("\n---------------------- Promedios -----------------------");
        System.out.println("Promedio actual de Deyan Sanabria: " + edGrupo40.obtenerPromedio(2021046131));
        System.out.println("Promedio actual de Esteban Pérez Picado: " + edGrupo40.obtenerPromedio(2021046572));

        
        // Curso, Profe y Grupo para Programacion Orientada A Objetos:
        Profesor erickaSolano = new Profesor(2, "Ericka Solano Fernandez", "Ing. Software", TGrado.MASTER);
        Curso prograOO = new Curso("IC-2101", "Programacion Orientada a Objetos", 4, 4, false);
        Grupo pooGrupo3 = new Grupo(3,30,erickaSolano,prograOO);

        prograOO.agregarRubro(1, "Tarea 1", 5, TEvaluacion.TAREA);
        prograOO.agregarRubro(2, "Tarea 2", 5, TEvaluacion.TAREA);
        prograOO.agregarRubro(3, "Tarea 3", 5, TEvaluacion.TAREA);
        prograOO.agregarRubro(4, "Tarea 4", 5, TEvaluacion.TAREA);
        prograOO.agregarRubro(5, "Proyecto 1", 15, TEvaluacion.PROYECTO);
        prograOO.agregarRubro(6, "Proyecto 2", 15, TEvaluacion.PROYECTO);
        prograOO.agregarRubro(7, "Proyecto 3", 15, TEvaluacion.PROYECTO);
        prograOO.agregarRubro(8, "Examen 1", 15, TEvaluacion.EXAMEN);
        prograOO.agregarRubro(9, "Examen 2", 20, TEvaluacion.EXAMEN);
        
        pooGrupo3.setHorario("Lunes de 7:30-11:20");
        pooGrupo3.setAula("B3-6");
        pooGrupo3.setSede("Campus Central de Cartago");

        pooGrupo3.agregarEstudiante(deyanSanabria);
        pooGrupo3.agregarEstudiante(estebanPerez);
        pooGrupo3.agregarEstudiante(davidMorales);
        System.out.println("\n---------------- Se crea un grupo de POO ---------------");
        System.out.println(pooGrupo3);

        System.out.println("Estan los rubros completos?: " + prograOO.validarRubros() + '\n');

        System.out.println("---------------- Se crean evaluaciones -----------------");

        System.out.println("Evaluacion de proyecto 1 (nota 85) para Deyan Sanabria Fallas:");
        System.out.println("Se pudo?: " + pooGrupo3.agregarEvaluacion(2021046131, "Proyecto 1", TEvaluacion.PROYECTO, 85));

        System.out.println("Evaluacion de proyecto 2 (nota 90) para Esteban Pérez Picado:");
        System.out.println("Se pudo?: " + pooGrupo3.agregarEvaluacion(2021046572, "Proyecto 2", TEvaluacion.PROYECTO, 90));

        System.out.println("Evaluacion de proyecto 3 (nota 80) para David Morales Vargas:");
        System.out.println("Se pudo?: " + pooGrupo3.agregarEvaluacion(2021052762, "Proyecto 3", TEvaluacion.PROYECTO, 80));

        System.out.println("Evaluacion de tarea 1 (nota 75) para Deyan Sanabria Fallas:");
        System.out.println("Se pudo?: " + pooGrupo3.agregarEvaluacion(2021046131, "Tarea 1", TEvaluacion.TAREA, 75));

        System.out.println("Evaluacion de Examen 1 (nota 80) para Esteban Pérez Picado:");
        System.out.println("Se pudo?: " + pooGrupo3.agregarEvaluacion(2021046572, "Examen 1", TEvaluacion.EXAMEN, 80));

        System.out.println("Evaluacion de tarea 4 (nota 82) para David Morales Vargas:");
        System.out.println("Se pudo?: " + pooGrupo3.agregarEvaluacion(2021052762, "Tarea 4", TEvaluacion.TAREA, 82));
        
       
        System.out.println("-----Menú Principal-----"+'\n');
        System.out.println("Opción 1: Crear Profesor"+'\n'+
                           "Opción 2: Crear Estudiante"+'\n'+
                           "Opción 3: Crear Curso"+'\n'+
                           "Opción 4: Crear Grupo"+'\n'+
                           "Opción 5: Agregar Estudiante a grupo"+'\n' +
                           "Opción 6: Crear Evaluación"+'\n'+
                           "Opción 7: Agregar Calificación"+'\n'+
                           "Opción 8: Consultar Promedios de estudiantes"+'\n'+
                           "Opción 9: Consultar Desglose de Notas"+'\n'+
                           "Opcion 0: Cancelar"+'\n');
        System.out.print("Escoga una opción: ");
        int number = input.nextInt();
        
        
        
        switch(number) {
            case 1:
              registrarProfe();
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
              registrarEstudiante();
              break;
            case 6:
              crearEvaluacion();
              break;
            case 7:
              registrarCalificacion();
              break;
            case 8:
              System.out.print("Ingrese el carné a consultar: ");
              int carnet = input.nextInt();
              consultarPromedios(carnet);
              break;
            case 9:
              System.out.print("Ingrese el carné a consultar: ");
              int carne = input.nextInt();
              desglozarPromedios(carne);
              break;
            case 0:
              // code block
              break;
          }
    }
}
