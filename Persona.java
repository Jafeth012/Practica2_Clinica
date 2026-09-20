import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String codigoLicencia;
    private List<Mascota> misMascotas;

    public Persona(String pNombre, String pCodigoLicencia) {
        this.nombre = pNombre;
        this.codigoLicencia = pCodigoLicencia;
        this.misMascotas = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getCodigoLicencia() {
        return this.codigoLicencia;
    }

    public void asignarMascota(Mascota pMascota) {
        if (pMascota != null && !this.misMascotas.contains(pMascota)) {
            this.misMascotas.add(pMascota);
        }
    }

    public String consultarNombreMisMascotas() {
        if (this.misMascotas.isEmpty()) {
            return " Sin mascotas asignadas";
        }
        StringBuilder nombres = new StringBuilder();
        for (Mascota m : this.misMascotas) {
            nombres.append(" ").append(m.getNombre()).append(",");
        }
        if (nombres.length() > 0) {
            nombres.setLength(nombres.length() - 1);
        }
        return nombres.toString();
    }

    @Override
    public String toString() {
        return "Persona [Nombre: " + this.nombre + ", Codigo Licencia: " + this.codigoLicencia + "]";
    }
}