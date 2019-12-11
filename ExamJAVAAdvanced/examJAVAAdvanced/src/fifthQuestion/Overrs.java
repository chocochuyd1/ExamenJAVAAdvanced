package fifthQuestion;

public class Overrs implements OpeOpe {

    @Override
    public int Suma(int x, int y) {
        int z = x + y;
        return z;
    }

    @Override
    public int Resta(int x, int y) {
        // TODO Auto-generated method stub
        int z = x - y;
        return z;
    }

    @Override
    public int Multiplicacion(int x, int y) {
        // TODO Auto-generated method stub
        int z = (x * y);
        return z;
    }

    @Override
    public float Division(float x, float y) {
        // TODO Auto-generated method stub
        float z = (x / y);
        return z;
    }

}
