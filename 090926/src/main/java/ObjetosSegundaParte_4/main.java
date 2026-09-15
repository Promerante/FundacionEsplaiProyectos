import ObjetosSegundaParte_4.Persona;

void main() {
    var p1=new Persona("Facu","Benitez");
    var p2=new Persona("Sonia","Noguera");
    IO.println(Persona.getContador());
    //Buenas practicas: si la variable es static, intenta acceder por la clase, no por un objeto instanciado
    IO.println("Persona1: " + p1.getContador());
    IO.println("Persona2: " + p2.getContador());
    Persona.reportarPersonas();

}