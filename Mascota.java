import java.time.Year;

public class Mascota {
    private String nombre;
    private String raza;
    private int anioNacimiento = 0;
    private Persona miVeterinario;

    public Mascota(String pNombre, String pRaza) {
        this(pNombre, pRaza, 0);
    }

    public Mascota(String pNombre, String pRaza, int pAnio) {
        this.nombre = pNombre;
        this.raza = pRaza;
        this.anioNacimiento = pAnio;
        this.miVeterinario = null;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void asignarVeterinario(Persona cVet) {
        this.miVeterinario = cVet;
    }

    public String consultarNombreVeterinario() {
        if (this.miVeterinario == null) {
            return " Sin asignar";
        }
        return " " + this.miVeterinario.getNombre();
    }

    private int obtenerAnioActual() {
        return Year.now().getValue();
    }

    private int calcularEdadCanina() {
        if (this.anioNacimiento == 0) {
            return 0;
        }
        return this.obtenerAnioActual() - this.anioNacimiento;
    }

    private int calcularEdadHumana() {
        return this.calcularEdadCanina() * 7;
    }

    @Override
    public String toString() {
        String vetInfo = (this.miVeterinario != null) ? this.miVeterinario.getNombre() : "Sin asignar";
        return "Mascota: " + this.nombre + 
               " | Raza: " + this.raza + 
               " | Año Nacimiento: " + (this.anioNacimiento == 0 ? "0" : this.anioNacimiento) + 
               " | Edad Canina: " + this.calcularEdadCanina() + 
               " | Edad Humana: " + this.calcularEdadHumana() + 
               " | Veterinario: " + vetInfo;
    }
}