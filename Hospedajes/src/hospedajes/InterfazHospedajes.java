
package hospedajes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InterfazHospedajes {
    
    static List<Anfitrion> anfitriones; 
    static List<Anfitrion> anfitrionesDisponibles; 
    static List<Extranjero> extranjeros; 
    static List<Hospedaje> hospedajes; 
    static Scanner teclado;
    public static void main(String[] args) {
        anfitriones = new ArrayList<Anfitrion>();
        extranjeros = new ArrayList<Extranjero>();
        hospedajes = new ArrayList<Hospedaje>();
        anfitriones = new ArrayList<Anfitrion>();
        teclado = new Scanner(System.in);
        
        boolean salir = false;
        
        while(salir == false) {
            System.out.println("\nBIENVENIDOS AL SISTEMA DE HOSPEDAJE");
            System.out.println("1 Agregar anfitrion   | 2 Agregar extranjero ");
            System.out.println("3 Mostrar anfitriones | 4 Mostrar extranjeros");
            System.out.println("5 Mostrar hospedajes  | 6 Modificar anfitrión");
            System.out.println("7 Eliminar anfitrión  | 8 Eliminar hospedaje");
            System.out.println("9 Salir               | ");
            System.out.println("----------------------------------------------\n");
            System.out.println("-------¿Que opción desea realizar?------------\n");
            int opcion = teclado.nextInt();
            
            switch(opcion) {    
                case 1:
                    agregarAnfitrion();         
                    break;        
                case 2:
                    agregarExtranjero();    
                    break;        
                case 3:
                    mostrarAnfitriones();                    
                    break;
                case 4:
                    mostrarExtranjeros();             
                    break;
                case 5:
                    mostrarHospedajes();
                    break;
                case 6:
                    modificarAnfitrion();
                    break;
                case 7:
                    eliminarAnfitrion();                  
                    break;
                case 8:
                    eliminarHospedaje();
                    break;
                case 9:
                    salir = true;
                    break;
                default:
                break;
            }
            
        }
        
        
    }
    
    public static void agregarAnfitrion() {
        Anfitrion anfitrion = new Anfitrion();
        System.out.println("\nAGREGAR ANFITRION");
        System.out.println("---------------------------");
        System.out.println("Ingrese la cedula");
        teclado.nextLine();
        String cedula = teclado.nextLine();
        System.out.println("---------------------------");
        System.out.println("Ingrese el nombre");
        String nombre = teclado.nextLine();
        System.out.println("---------------------------");
        System.out.println("Ingrese la direccion");
        String direccion = teclado.nextLine();
        System.out.println("---------------------------");
        System.out.println("Ingrese el cobro");
        double cobro = teclado.nextDouble();
        System.out.println("---------------------------");
        System.out.println("Ingrese los días a hospedar");
        int diasHospedar = teclado.nextInt();
        
        anfitrion.setCedula(cedula);
        anfitrion.setNombre(nombre);
        anfitrion.setDireccion(direccion);
        anfitrion.setCobro(cobro);
        anfitrion.setDiasHospedar(diasHospedar);
        if(verificarAnfitrionExiste(cedula) == false) {           
            anfitriones.add(anfitrion);

            System.out.println("***************************");
            System.out.println("---- ANFITRION AGREGADO ---");
            System.out.println("---------------------------\n");
        } else {
            System.out.println("************************************************");
            System.out.println("- ATENCIÖN: Ya existe anfitrión con esa cedula -");
            System.out.println("------------------------------------------------\n");
        }
      
    }
    
    public static void agregarExtranjero() {
        Extranjero extranjero = new Extranjero();
        System.out.println("\nAGREGAR EXTRANJERO");
        System.out.println("\nIMPORTANTE: Asegurese de escribir correctamente los datos");
        System.out.println("            una vez ingresados no podrán ser modificados");
        System.out.println("---------------------------");
        System.out.println("Ingrese el DNI");
        teclado.nextLine();
        String DNI = teclado.nextLine();
        System.out.println("---------------------------");
        System.out.println("Ingrese el nombre");
        String nombre = teclado.nextLine();
        System.out.println("---------------------------");
        System.out.println("Ingrese la país");
        String pais = teclado.nextLine();
        System.out.println("---------------------------");
        String sexo = "";
        boolean sexoIndicado = false;
        while(sexoIndicado == false ) {
            System.out.println("Ingrese el sexo");
            System.out.println("0 Masculino  1 Femenino  2 Otros");
            int sexoOpción = teclado.nextInt();
            switch(sexoOpción) {
                case 0: 
                    sexo = "Masculino";
                    sexoIndicado = true;
                    break;
                case 1: 
                    sexo = "Femenino";
                    sexoIndicado = true;
                    break;
                case 2: 
                    sexo = "Otros";
                    sexoIndicado = true;
                    break;
                default: 
                    System.out.println("******************************");
                    System.out.println("Atención: No existe esa opción");
                    System.out.println("------------------------------\n");
                    break;

            }
        }
        
        System.out.println("---------------------------");
        System.out.println("Ingrese la edad");
        int edad = teclado.nextInt();
        System.out.println("---------------------------");
        System.out.println("Ingrese la cantidad de días a hospedarse");
        int diasHospedar = teclado.nextInt();
        System.out.println("---------------------------");
        System.out.println("Ingrese el aporte económico");
        double aporteEconomico = teclado.nextDouble();

        boolean ingresoEnfermedad = false;
        String enfermedad = "";
        while (ingresoEnfermedad == false) {
            System.out.println("---------------------------");
            System.out.println("¿Padece alguna enfermedad?    0 NO  |  1 SI");
            int enfermedadOpcion = teclado.nextInt();
            switch(enfermedadOpcion) {
                case 0: 
                    enfermedad = "NO";
                    ingresoEnfermedad = true;
                    break;
                case 1: 
                    enfermedad = "SI";
                    ingresoEnfermedad = true;
                    break;
                default:               
                    System.out.println("******************************");
                    System.out.println("Atención: No existe esa opción");
                    System.out.println("------------------------------\n");
                    break;
            }

        }


        extranjero.setDNI(DNI);
        extranjero.setNombre(nombre);
        extranjero.setPais(pais);
        extranjero.setSexo(sexo);
        extranjero.setEdad(edad);
        extranjero.setEnfermedades(enfermedad);
        extranjero.setCantidadDias(diasHospedar);
        extranjero.setAporteEconomico(aporteEconomico);

        //Validamos que haya anfitriones     
        if(anfitriones.size() > 0) {
             List<Anfitrion> disponibles = verificarAnfitrionesDisponibles();
             int cantidadDisponibles = disponibles.size();
             // Si hay disponibles entonces validamos
             if(cantidadDisponibles > 0) { 
                boolean extranjeroExiste = verificarExtranjeroExiste(DNI);
                if(extranjeroExiste != true) {                   
                    asignarHospedaje(disponibles, extranjero);                
                } else {
                    System.out.println("*********************************************");
                    System.out.println("-ATENCIÖN: Ya existe extranjero con ese DNI -");
                    System.out.println("---------------------------------------------\n");
                }
             } else {           
                System.out.println("******************************************");
                System.out.println("-ATENCIÖN: No hay anfitriones disponibles-");
                System.out.println("------------------------------------------\n");
             }
        } else {
            System.out.println("No hay anfitriones");
        }  

    }

    public static void modificarAnfitrion(){
      
        boolean cerrarModificar = false;
        
        while(cerrarModificar == false) {
            System.out.println("\nMODIFICAR ANFITRION");
            System.out.println("----------OPCIONES----------");
            System.out.println("1 Cedula          |  2 Nombre");
            System.out.println("3 Dirección       |  4 Cobro ");
            System.out.println("5 Dias a Hospedar |  6 Salir ");
            System.out.println("----------------------------");
            System.out.println("¿Qué dato desea modificar?");
            int opcionSeleccionada = teclado.nextInt();
            System.out.println("----------------------------\n");
            switch(opcionSeleccionada) {
                case 1: 
                    modificarCedulaAnfitrion();
                    break;
                case 2: 
                    modificarNombreAnfitrion();
                    break;
                case 3: 
                    modificarDireccionAnfitrion();
                    break;
                case 4: 
                    modificarCobroAnfitrion();
                    break;
                case 5: 
                    modificarDiasHospedarAnfitrion();
                    break;
                case 6: 
                    cerrarModificar = true;
                    break;
                default: System.out.println("Atención: No existe esa opción\n");
            }
            
        }
        
    }
    
    public static void modificarCedulaAnfitrion(){
        System.out.println("\nMODIFICAR ANFITRION (CEDULA)\n");
        System.out.println("----------------------------");
        System.out.println("Ingrese la cedula actual");
        teclado.nextLine();
        String cedulaActual = teclado.nextLine();
         System.out.println("----------------------------");
        System.out.println("Ingrese la nueva cedula");
        String cedulaNueva = teclado.nextLine();
        System.out.println("----------------------------");
        
        boolean salir = false;
        
        while (salir == false){
            System.out.println("¿Desea guardar los cambios?    0 No | 1 Si");    
            int aceptar = teclado.nextInt();
            
            switch(aceptar) {
                case 0: 
                    System.out.println("----------------------------");                            
                    salir = true;
                    break;        
                case 1: 
                    boolean anfitrionExiste = verificarAnfitrionExiste(cedulaActual);
                    if(anfitrionExiste == true) {               
                        boolean repetido = verificarAnfitrionExiste(cedulaNueva);
                        
                         if(repetido != true) {
                             for (int i = 0; i < anfitriones.size() ; i++) {
                                if(anfitriones.get(i).getCedula().equals(cedulaActual) == true){
                                    anfitriones.get(i).setCedula(cedulaNueva);
                                }
                            }
                             System.out.println("****************************");
                             System.out.println("-CEDULA HA SIDO ACTUALIZADA-");
                             System.out.println("----------------------------\n");
                             salir = true;
                        } else {
                             System.out.println("*******************************");
                             System.out.println("-CEDULA NUEVA EXISTE EN SISTEMA-");
                             System.out.println("--------------------------------\n");
                             salir = true;
                         }
                    } else {
                        System.out.println("****************************");
                        System.out.println("------CEDULA NO EXISTE------");
                        System.out.println("----------------------------\n");
                        salir = true;
                    }
                    break;
                default: 
                    System.out.println("****************************");
                    System.out.println("-----OPCION INCORRECTA------");
                    System.out.println("----------------------------\n");
                    salir = true;
            }
        }
           
    }
    
    public static void modificarNombreAnfitrion(){
        System.out.println("\nMODIFICAR ANFITRION (NOMBRE)\n");
        System.out.println("----------------------------");
        System.out.println("Ingrese número de cedula ");
        teclado.nextLine();
        String cedula = teclado.nextLine();
         System.out.println("----------------------------");
        System.out.println("Ingrese el nuevo nombre");
        String nuevoNombre = teclado.nextLine();
        System.out.println("----------------------------");
        
        boolean salir = false;
        
        while (salir == false){
            System.out.println("¿Desea guardar los cambios?    0 No | 1 Si");    
            int aceptar = teclado.nextInt();
            
            switch(aceptar) {
                case 0: 
                    System.out.println("----------------------------");                            
                    salir = true;
                    break;        
                case 1: 
                    boolean anfitrionExiste = verificarAnfitrionExiste(cedula);
                    if(anfitrionExiste == true) {                 
                        for (int i = 0; i < anfitriones.size() ; i++) {
                           if(anfitriones.get(i).getCedula().equals(cedula) == true){
                                anfitriones.get(i).setNombre(nuevoNombre);
                                System.out.println("****************************");
                                System.out.println("-NOMBRE HA SIDO ACTUALIZADO-");
                                System.out.println("----------------------------\n");
                                salir = true;
                           }
                        }      
                             
                    } else {
                        System.out.println("*******************************");
                        System.out.println("- CEDULA NO EXISTE EN SISTEMA-");
                        System.out.println("--------------------------------\n");
                        salir = true;
                    }                  
                    break;
                default: 
                    System.out.println("****************************");
                    System.out.println("-----OPCION INCORRECTA------");
                    System.out.println("----------------------------\n");
                    salir = true;
            }
        }
           
    }
    
    public static void modificarDireccionAnfitrion(){
        System.out.println("\nMODIFICAR ANFITRION (DIRECCIÓN)\n");
        System.out.println("----------------------------");
        System.out.println("Ingrese número de cedula ");
        teclado.nextLine();
        String cedula = teclado.nextLine();
         System.out.println("----------------------------");
        System.out.println("Ingrese la nueva dirección");
        String nuevoDireccion = teclado.nextLine();
        System.out.println("----------------------------");
        
        boolean salir = false;
        
        while (salir == false){
            System.out.println("¿Desea guardar los cambios?    0 No | 1 Si");    
            int aceptar = teclado.nextInt();
            
            switch(aceptar) {
                case 0: 
                    System.out.println("----------------------------");                            
                    salir = true;
                    break;        
                case 1: 
                    boolean anfitrionExiste = verificarAnfitrionExiste(cedula);
                    if(anfitrionExiste == true) {                 
                        for (int i = 0; i < anfitriones.size() ; i++) {
                           if(anfitriones.get(i).getCedula().equals(cedula) == true){
                                anfitriones.get(i).setDireccion(nuevoDireccion);
                                System.out.println("*******************************");
                                System.out.println("-DIRECCIÓN HA SIDO ACTUALIZADA-");
                                System.out.println("-------------------------------\n");
                                salir = true;
                           }
                        }      
                             
                    } else {
                        System.out.println("*******************************");
                        System.out.println("- CEDULA NO EXISTE EN SISTEMA-");
                        System.out.println("--------------------------------\n");
                        salir = true;
                    }                  
                    break;
                default: 
                    System.out.println("****************************");
                    System.out.println("-----OPCION INCORRECTA------");
                    System.out.println("----------------------------\n");
                    salir = true;
            }
        }
           
    }
    
    public static void modificarCobroAnfitrion(){
        System.out.println("\nMODIFICAR ANFITRION (COBRO)\n");
        System.out.println("----------------------------");
        System.out.println("Ingrese número de cedula ");
        teclado.nextLine();
        String cedula = teclado.nextLine();
        System.out.println("----------------------------");
        System.out.println("Ingrese el nuevo cobro");
        double nuevoCobro = teclado.nextDouble();
        System.out.println("----------------------------");
        
        boolean salir = false;
        
        while (salir == false){
            System.out.println("¿Desea guardar los cambios?    0 No | 1 Si");    
            int aceptar = teclado.nextInt();
            
            switch(aceptar) {
                case 0: 
                    System.out.println("----------------------------");                            
                    salir = true;
                    break;        
                case 1: 
                    boolean anfitrionExiste = verificarAnfitrionExiste(cedula);
                    if(anfitrionExiste == true) {                 
                        for (int i = 0; i < anfitriones.size() ; i++) {
                           if(anfitriones.get(i).getCedula().equals(cedula) == true){
                                anfitriones.get(i).setCobro(nuevoCobro);
                                System.out.println("*******************************");
                                System.out.println("-- COBRO HA SIDO ACTUALIZADO --");
                                System.out.println("-------------------------------\n");
                                salir = true;
                           }
                        }      
                             
                    } else {
                        System.out.println("*******************************");
                        System.out.println("- CEDULA NO EXISTE EN SISTEMA-");
                        System.out.println("--------------------------------\n");
                        salir = true;
                    }                  
                    break;
                default: 
                    System.out.println("****************************");
                    System.out.println("-----OPCION INCORRECTA------");
                    System.out.println("----------------------------\n");
                    salir = true;
            }
        }
           
    }
    
    public static void modificarDiasHospedarAnfitrion(){
        System.out.println("\nMODIFICAR ANFITRION (DIAS A HOSPEDAR)\n");
        System.out.println("----------------------------");
        System.out.println("Ingrese número de cedula ");
        teclado.nextLine();
        String cedula = teclado.nextLine();
        System.out.println("----------------------------");
        System.out.println("Ingrese la nueva cantidad de días a hospedar");
        int nuevosDiasHospedar = teclado.nextInt();
        System.out.println("----------------------------");
        
        boolean salir = false;
        
        while (salir == false){
            System.out.println("¿Desea guardar los cambios?    0 No | 1 Si");    
            int aceptar = teclado.nextInt();
            
            switch(aceptar) {
                case 0: 
                    System.out.println("----------------------------");                            
                    salir = true;
                    break;        
                case 1: 
                    boolean anfitrionExiste = verificarAnfitrionExiste(cedula);
                    if(anfitrionExiste == true) {                 
                        for (int i = 0; i < anfitriones.size() ; i++) {
                           if(anfitriones.get(i).getCedula().equals(cedula) == true){
                                anfitriones.get(i).setDiasHospedar(nuevosDiasHospedar);
                                System.out.println("*******************************");
                                System.out.println("-- DIAS A HOSPEDAR HA SIDO ACTUALIZADO --");
                                System.out.println("-------------------------------\n");
                                salir = true;
                           }
                        }      
                             
                    } else {
                        System.out.println("*******************************");
                        System.out.println("- CEDULA NO EXISTE EN SISTEMA-");
                        System.out.println("--------------------------------\n");
                        salir = true;
                    }                  
                    break;
                default: 
                    System.out.println("****************************");
                    System.out.println("-----OPCION INCORRECTA------");
                    System.out.println("----------------------------\n");
                    salir = true;
            }
        }
           
    }
    
     public static void eliminarAnfitrion(){
        System.out.println("\nELIMINAR ANFITRION\n");
        System.out.println("----------------------------");
        System.out.println("Ingrese número de cedula ");
        teclado.nextLine();
        String cedula = teclado.nextLine();
        System.out.println("----------------------------");
        
        boolean salir = false;
        
        while (salir == false){
            System.out.println("¿Está seguro de eliminar este anfritrión?    0 No | 1 Si");    
            int aceptar = teclado.nextInt();
            
            switch(aceptar) {
                case 0: 
                    System.out.println("----------------------------");                            
                    salir = true;
                    break;        
                case 1: 
                    boolean anfitrionExiste = verificarAnfitrionExiste(cedula);
                    if(anfitrionExiste == true) {                 
                        for (int i = 0; i < anfitriones.size() ; i++) {
                           if(anfitriones.get(i).getCedula().equals(cedula) == true){ 
                               
                                buscarEliminarHospedaje(cedula);                            
                                anfitriones.remove(i);
                                System.out.println("*******************************");
                                System.out.println("-- ANFITRIÓN HA SIDO ELIMINADO --");
                                System.out.println("-------------------------------\n");
                                salir = true;
                           }
                        }      
                             
                    } else {
                        System.out.println("*******************************");
                        System.out.println("- CEDULA NO EXISTE EN SISTEMA-");
                        System.out.println("--------------------------------\n");
                        salir = true;
                    }                  
                    break;
                default: 
                    System.out.println("****************************");
                    System.out.println("-----OPCION INCORRECTA------");
                    System.out.println("----------------------------\n");
                    salir = true;
            }
        }
           
    } 
      
    public static void mostrarAnfitriones(){
            System.out.println("\nANFITRIONES INGRESADOS");
        for (int i = 0; i < anfitriones.size() ; i++) {
            System.out.println("-----------------------");
            System.out.println("*****  Anfitrion #"+i+"  ****");
            System.out.println("CEDULA: "+ anfitriones.get(i).getCedula());
            System.out.println("NOMBRE: "+ anfitriones.get(i).getNombre());
            System.out.println("DIRECCIÓN: "+ anfitriones.get(i).getDireccion());
            System.out.println("COBRO: "+ anfitriones.get(i).getCobro());
            System.out.println("DÍAS A HOSPEDAR: "+ anfitriones.get(i).getDiasHospedar()+"\n");      
        }
        if(anfitriones.size() < 1){    
            System.out.println("******************************");
            System.out.println("No hay anfitriones registrados");
            System.out.println("------------------------------\n");
        } else {
            System.out.println("------------------------------\n");
        }
    }
    
     public static void mostrarExtranjeros(){
            System.out.println("\nEXTRANJEROS INGRESADOS");
        for (int i = 0; i < extranjeros.size() ; i++) {
            System.out.println("-----------------------");
            System.out.println("*****  Extranjero #"+i+"  ****");
            System.out.println("DNI: "+ extranjeros.get(i).getDNI());
            System.out.println("NOMBRE: "+ extranjeros.get(i).getNombre());
            System.out.println("PAÍS: "+ extranjeros.get(i).getPais());
            System.out.println("SEXO: "+ extranjeros.get(i).getSexo());
            System.out.println("EDAD: "+ extranjeros.get(i).getEdad());
            System.out.println("CANTIDAD DÍAS: "+ extranjeros.get(i).getCantidadDias());
            System.out.println("APORTE ECONÓMICO: "+ extranjeros.get(i).getAporteEconomico()+"\n");      
        }
        if(extranjeros.size() < 1){    
            System.out.println("******************************");
            System.out.println("No hay extranjeros registrados");
            System.out.println("------------------------------\n");
        } else{
            System.out.println("------------------------------\n");
        }
    }
    
    public static void mostrarHospedajes(){
        System.out.println("\nHOSPEDAJES ASIGNADOS");
    
        for (int i = 0; i < hospedajes.size(); i++) {
            System.out.println("-----------------------");
            System.out.println("*****  Hospedaje #"+(i)+"  ****");
            System.out.println("-----   ANFITRIÓN  ----------");
            for (int j = 0; j < anfitriones.size(); j++) {
                if(hospedajes.get(i).getAnfitrion().equals(anfitriones.get(j).getCedula())) {                
                System.out.println("CEDULA: "+ anfitriones.get(j).getCedula());
                System.out.println("NOMBRE: "+ anfitriones.get(j).getNombre());
                System.out.println("DIRECCIÓN: "+ anfitriones.get(j).getDireccion());
                System.out.println("COBRO: "+ anfitriones.get(j).getCobro());
                System.out.println("DIAS A HOSPEDAR: "+ anfitriones.get(j).getDiasHospedar());
                }
            }
            
            System.out.println("-----  EXTRANJERO  ----------");
            for (int m = 0; m < extranjeros.size(); m++) {
                if(hospedajes.get(i).getExtranjero().equals(extranjeros.get(m).getDNI())) {                
                    System.out.println("CEDULA: "+ extranjeros.get(m).getDNI());
                    System.out.println("NOMBRE: "+ extranjeros.get(m).getNombre());
                    System.out.println("EDAD: "+ extranjeros.get(m).getEdad());
                    System.out.println("SEXO: "+ extranjeros.get(m).getSexo());
                    System.out.println("PAÍS: "+ extranjeros.get(m).getPais());
                    System.out.println("ENFERMEDADES: "+ extranjeros.get(m).getEnfermedades());
                    System.out.println("APORTE ECONÓMICO: "+ extranjeros.get(m).getAporteEconomico());
                    System.out.println("CANTIDAD DÍAS A HOSPEDARSE: "+ extranjeros.get(m).getCantidadDias());
                }
            }
           
            System.out.println("-----  Final Registro  ------\n");
                 
        }
        
        if(hospedajes.size() < 1){    
            System.out.println("*****************************************");
            System.out.println("- ATENCIÖN: No hay hospedajes asignados -");
            System.out.println("-----------------------------------------\n");
        } else {
            System.out.println("------------------------------\n");
        }
    }
    
    public static boolean verificarAnfitrionExiste(String cedula){
        boolean existe = false;
        
        for (int i = 0; i < anfitriones.size() ; i++) {
            if(anfitriones.get(i).getCedula().equals(cedula) == true){
                existe = true;
            }
        }
        return existe;
    
    }
    
    public static boolean verificarExtranjeroExiste(String DNI) {
        boolean existe = false;
        
        for (int i = 0; i < extranjeros.size(); i++) {
            if(extranjeros.get(i).getDNI().equals(DNI)) {
                existe = true;
            }
        }
        return existe;
    }
    
    public static List<Anfitrion> verificarAnfitrionesDisponibles(){
        List<Anfitrion> anfitrionesDisponibles = new ArrayList<Anfitrion>();       
        for (int i = 0; i < anfitriones.size() ; i++) {            
            boolean existe = false;
            
            for (int j = 0; j < hospedajes.size(); j++) {
                String cedAnfitrion = anfitriones.get(i).getCedula();
                String cedAnfitrionH = hospedajes.get(j).getAnfitrion();
                
                if(cedAnfitrion.equals(cedAnfitrionH) != false) {
                    existe = true;
                }
            }
            
            if(existe == false){
                anfitrionesDisponibles.add(anfitriones.get(i));
            }
        }
        
        return anfitrionesDisponibles;
    
    }
    
    public static void asignarHospedaje(List<Anfitrion> disponibles, Extranjero extranjero){
        // Solo verificaremos que ciumplan con los días y el aporte economico
        boolean seGuardo = false;
        for (int i = 0; i < disponibles.size(); i++) {
            double cobro = disponibles.get(i).getCobro();
            int dias = disponibles.get(i).getDiasHospedar();
            double aporteEconomico = extranjero.getAporteEconomico();
            int diasHospedarse = extranjero.getCantidadDias();
            boolean cumple = aporteEconomico >= cobro && diasHospedarse <= dias;
            
            if(cumple) {
                Hospedaje hospedaje = new Hospedaje();
                hospedaje.setAnfitrion(disponibles.get(0).getCedula());
                hospedaje.setExtranjero(extranjero.getDNI()); 
                hospedajes.add(hospedaje);
                extranjeros.add(extranjero);
                seGuardo = true;
                
                System.out.println("***************************");
                System.out.println("---- EXTRANJERO AGREGADO ---");
                System.out.println("---------------------------\n");
                break;
            }                 
        }
        
        if(seGuardo == false) {
            System.out.println("****************************************************");
            System.out.println("- ATENCIÖN: Extrajero no cumple con requerimientos -");
            System.out.println("----------------------------------------------------\n");
        }
    }
    
    public static void eliminarHospedaje(){
        System.out.println("\nELIMINAR HOSPEDAJE\n");
        System.out.println("----------------------------");
        System.out.println("Ingrese número de cedula de anfitrión ");
        String cedula = teclado.next();
        System.out.println("----------------------------");
        boolean seElimino = buscarEliminarHospedaje(cedula);
        
        if(seElimino){
            System.out.println("*******************************");
            System.out.println("-- HOSPEDAJE HA SIDO ELIMINADO --");
            System.out.println("-------------------------------\n");
        } else {
            System.out.println("****************************************************");
            System.out.println("- ATENCIÖN: No se ha podido eliminar el hospedaje --");
            System.out.println("----------------------------------------------------\n");
        }
       
    }
    
    public static boolean buscarEliminarHospedaje(String cedula) {
        boolean fueEliminado = false;
        for (int i = 0; i < hospedajes.size() ; i++) {
            if(hospedajes.get(i).getAnfitrion().equals(cedula) == true){
                for (int j = 0; j < extranjeros.size(); j++) {
                    if(extranjeros.get(j).getDNI().equals(hospedajes.get(i).getExtranjero())) {
                        extranjeros.remove(j);
                        hospedajes.remove(i);
                        fueEliminado = true;             
                    }
                }
            }
        }
        return fueEliminado;
    }
    
}
