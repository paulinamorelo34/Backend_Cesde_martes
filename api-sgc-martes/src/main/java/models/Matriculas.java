package models;

public class Matriculas {

        private String estudiante;
        private String curso;
        private String fecha;
        private String estado;
        private String acciones;

        public Matriculas(String estudiante, String curso, String fecha, String estado, String acciones) {
            this.estudiante = estudiante;
            this.curso = curso;
            this.fecha = fecha;
            this.estado = estado;
            this.acciones = acciones;
        }

        public String getEstudiante() {
            return estudiante;
        }

        public void setEstudiante(String estudiante) {
            this.estudiante = estudiante;
        }

        public String getCurso() {
            return curso;
        }

        public void setCurso(String curso) {
            this.curso = curso;
        }

        public String getFecha() {
            return fecha;
        }

        public void setFecha(String fecha) {
            this.fecha = fecha;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public String getAcciones() {
            return acciones;
        }

        public void setAcciones(String acciones) {
            this.acciones = acciones;
        }
    }

