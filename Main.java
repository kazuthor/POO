
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main {
    public static void main(String[] args) {
        Docente docente1 = new Docente("Juan Leal", TipoContrato.TC, NivelEstudio.Doctorado, CategoriaCatedra.Asociado);
        double salarioDocente1 = docente1.calcularSalarioMensual(908526); 
        System.out.println("El salario mensual del docente Juan Leal es: $" + salarioDocente1);
        
        Docente docente2 = new Docente("María López", TipoContrato.Ocasionales, NivelEstudio.Maestria, null);
        double salarioDocente2 = docente2.calcularSalarioMensual(908526); 
        System.out.println("El salario mensual del docente María López es: $" + salarioDocente2);
        
        Docente docente3 = new Docente("Maria Ovalles", TipoContrato.Catedra, NivelEstudio.Especializacion, CategoriaCatedra.Auxiliar);
        double salarioDocente3 = docente3.calcularSalarioMensual(908526);
        System.out.println("El salario mensual del docente Maria Ovalles es: $" + salarioDocente3);
        
        
        docente1.agregarArticulo(new Articulo("Articulo 1", 2023));
        docente1.agregarArticulo(new Articulo("Articulo 2", 2024));
        docente1.agregarLibro(new Libro("Libro 1", 2022));
        docente2.agregarLibro(new Libro("Libro 2", 2023));
        
        System.out.println(docente1.validarPublicaciones());
        System.out.println(docente2.validarPublicaciones());
        
        Universidad ufps = new Universidad();
        ufps.actualizarSMMLV(950000);
    }
}