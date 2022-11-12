package P04_Estructuras.EjercicioConvertidorVelocidad;
/* La clase ConvertidorVelocidad cambia velocidades deKPH (kilometros por hora a MPH (millas por hora)
 */
public class ConvertidorVelocidad {
    final double FACTOR_DE_CONVERSION = 0.6214;// VALOR CONSTANTE

    public double obtenerMHP(double kph) {
        return kph * FACTOR_DE_CONVERSION;
    }
}

