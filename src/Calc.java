public class Calc {



    private float Calc;
    private int CalcNow;
    private int CalcThen;




    public Calc(int calcNow, int calcThen) {
        if (CalcNow > CalcThen) {
           Calc = (CalcNow-CalcThen);
        }else{
            Calc = (CalcThen-CalcNow);

            }

        }
    }


    public int getCalcNow() {
        return CalcNow;
    }

    public int getCalcThen() {
        return CalcThen;
    }

    public float getCalc() {
        return Calc;



    }


}