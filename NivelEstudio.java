
/**
 * Enumeration class NivelEstudio - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum NivelEstudio {
    Especializacion(3),
    Maestria(4),
    Doctorado(5);
    
    private final int factorSalario;
    
    NivelEstudio(int factorSalario) {
        this.factorSalario = factorSalario;
    }
    
    public int getFactorSalario() {
        return factorSalario;
    }
}