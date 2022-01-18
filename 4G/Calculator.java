public class Calculator implements CalcOp{

    @Override
    public float add(float x,float y) {

        return x + y;
    }

    @Override
    public float subtract(float x,float y) {

        return x-y;
    }

    @Override
    public float multiply(float x,float y) {

        return x*y;
    }

    @Override
    public float divide(float x,float y) {

        return x/y;
    }
}
