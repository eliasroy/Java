public class getterandsetters {
    public class Persona{
        private String nombre;
        private int edad;

        public String getNombre() {
            return nombre;
        }

        /**
         * valida el parametro con setters se puede agregar mas validaciones, tambien es encapsulable
         *
         * @param nombre
         */
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
    }

    public static void main(String[] args) {
        Persona persona = new getterandsetters().new Persona();
        persona.setNombre("Juan");
        persona.setEdad(25);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }
}
