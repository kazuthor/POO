
/**
 * Enumeration class CategoriaCatedra - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum CategoriaCatedra {
    Auxiliar(40000),
    Asistente(45000),
    Asociado(50000);
    
    private final double salarioBase;
    
    CategoriaCatedra(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public double getSalarioBase() {
        return salarioBase;
    }
}
