package models;

public class Cursos {


        private long id;
        private String nombre;
        private String descripcion;
        private int duracion;
        private int cupo;

        public Cursos(long id, String nombre, String descripcion, int duracion, int cupo) {
            this.id = id;
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.duracion = duracion;
            this.cupo = cupo;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public int getDuracion() {
            return duracion;
        }

        public void setDuracion(int duracion) {
            this.duracion = duracion;
        }

        public int getCupo() {
            return cupo;
        }

        public void setCupo(int cupo) {
            this.cupo = cupo;
        }
    }

