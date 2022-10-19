package EjerciciosTema2;

public class EjercicioTema2 {
    public static void main(String[] args) {

        float precioConIVA = precioIVA(50);
        System.out.println(precioConIVA);
    }

    private static float precioIVA(float precio){

        return (float) (precio * 1.21);
    }
}

