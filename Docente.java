import java.util.List;
import java.util.ArrayList;

public class Docente {
    private String nombre;
    private TipoContrato tipoContrato;
    private NivelEstudio nivelEstudio;
    private CategoriaCatedra categoriaCatedra;
    private int puntosSalariales;
    private List<Articulo> articulosPublicados;
    private List<Libro> librosPublicados;
    
    public Docente(String nombre, TipoContrato tipoContrato, NivelEstudio nivelEstudio, CategoriaCatedra categoriaCatedra) {
        this.nombre = nombre;
        this.tipoContrato = tipoContrato;
        this.nivelEstudio = nivelEstudio;
        this.categoriaCatedra = categoriaCatedra;
        this.puntosSalariales = 0;
        this.articulosPublicados = new ArrayList<>();
        this.librosPublicados = new ArrayList<>();
    }
    
    public Docente(){
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public NivelEstudio getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(NivelEstudio nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public CategoriaCatedra getCategoriaCatedra() {
        return categoriaCatedra;
    }

    public void setCategoriaCatedra(CategoriaCatedra categoriaCatedra) {
        this.categoriaCatedra = categoriaCatedra;
    }

    public int getPuntosSalariales() {
        return puntosSalariales;
    }

    public void setPuntosSalariales(int puntosSalariales) {
        this.puntosSalariales = puntosSalariales;
    }

    public List<Articulo> getArticulosPublicados() {
        return articulosPublicados;
    }

    public void setArticulosPublicados(List<Articulo> articulosPublicados) {
        this.articulosPublicados = articulosPublicados;
    }

    public List<Libro> getLibrosPublicados() {
        return librosPublicados;
    }

    public void setLibrosPublicados(List<Libro> librosPublicados) {
        this.librosPublicados = librosPublicados;
    }
    
    
    public double calcularSalarioMensual(double SMMLV) {
        double salario = 0;
        switch(tipoContrato) {
            case TC:
                salario = calcularSalarioTC(SMMLV);
                break;
            case Ocasionales:
                salario = calcularSalarioOcasionales(SMMLV);
                break;
            case Catedra:
                salario = calcularSalarioCatedra();
                break;
        }
        return salario;
    }
    
    private double calcularSalarioTC(double SMMLV) {
        double salarioBase = categoriaCatedra.getSalarioBase();
        return salarioBase + puntosSalariales * 40000;
    }
    
    private double calcularSalarioOcasionales(double SMMLV) {
        return nivelEstudio.getFactorSalario() * SMMLV;
    }
    
    private double calcularSalarioCatedra() {
        double salarioBase = categoriaCatedra.getSalarioBase();
        return salarioBase;
    }
    
    public String validarPublicaciones() {
        return "El docente " + nombre + " ha publicado " + articulosPublicados.size() + " artículo(s) y " + librosPublicados.size() + " libro(s)";
    }
    
    
    public void agregarArticulo(Articulo articulo) {
        articulosPublicados.add(articulo);
    }
    
    public void agregarLibro(Libro libro) {
        librosPublicados.add(libro);
    }
    
}