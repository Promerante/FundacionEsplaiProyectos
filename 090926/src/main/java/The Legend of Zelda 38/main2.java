void main(String[] args) {
    /*
     * ¡Han anunciado un nuevo "The Legend of Zelda"!
     * Se llamará "Tears of the Kingdom" y se lanzará el 12 de mayo de 2023.
     * Pero, ¿recuerdas cuánto tiempo ha pasado entre los distintos
     * "The Legend of Zelda" de la historia?
     * Crea un programa que calcule cuántos años y días hay entre 2 juegos de Zelda
     * que tú selecciones.
     * - Debes buscar cada uno de los títulos y su día de lanzamiento
     *   (si no encuentras el día exacto puedes usar el mes, o incluso inventártelo)
     */
    var bibliotecaZelda= new HashMap <String,LocalDate>();
    //Algunos zeldas no voy a poner todos.
    bibliotecaZelda.put("Legend of Zelda",LocalDate.of(1986,2,21));
    bibliotecaZelda.put("The Adventure of Link",LocalDate.of(1987,1,14));
    bibliotecaZelda.put("A Link to the Past",LocalDate.of(1991,11,21));
    bibliotecaZelda.put("Link's Awakening",LocalDate.of(2019,9,20));
    bibliotecaZelda.put("Ocarina of Time",LocalDate.of(1998,11,21));
    bibliotecaZelda.put("Majora's Mask",LocalDate.of(2000,4,27));
    bibliotecaZelda.put("Tears of the Kingdom",LocalDate.of(2023,5,12));
    var titulos= bibliotecaZelda.keySet();
    String input="";
    var sc= new Scanner(System.in);
    while (true){
        IO.println("Elija el primer zelda del que quieras comparar:");
        for(String titulo : titulos){
            IO.println(titulo);
        }
        IO.println();
        try {
            input=sc.nextLine();
            if (input.equals("Salir")){
                //Caso el usuario termina el programa
                break;
            }else if(!titulos.contains(input)){
                //Caso el cliente mete titulo no valido
                throw new InputMismatchException("El titulo introducido no ha sido encontrado\n");
            }else {
                //Caso cliente introduce el primer titulo correctamente
                var fecha1= bibliotecaZelda.get(input);
                IO.println("\nElija el segundo zelda del que quieras comparar:");
                for(String titulo : titulos){
                    IO.println(titulo);
                }
                input=sc.nextLine();
                if(!titulos.contains(input)){
                    //Caso introduce el segundo mal
                    throw new InputMismatchException("El titulo introducido no ha sido encontrado\n");
                }else{
                    //Caso tenemos las 2 fechas correctamente
                    var fecha2= bibliotecaZelda.get(input);
                    IO.println(fecha1 +"\n"+ fecha2);
                    IO.println("La diferencia por ahora es: " + Math.abs(fecha1.getYear()-fecha2.getYear()));
                    IO.println("La diferencia por dias es: " + ChronoUnit.DAYS.between(fecha1,fecha2));
                }

            }
        } catch (Exception e) {
            IO.println(e.getMessage());

        }
    }
    sc.close();

}
