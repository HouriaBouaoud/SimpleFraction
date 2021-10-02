public class Fraction {
    private int n;
    private int d;

    public int getD() {

        return this.d;
    }

    public int getN() {

        return this.n;
    }

    public void setN(int n) {

        this.n = n;
    }

    public void setD(int d) {

        this.d = d;
    }

    public String toString() {
        if(d<0) {
            if(n>0){
                return "-("+this.n+"/"+-this.d+")";
            }
            else {
                return -this.n + "/" + -this.d;
            }

        }
        return this.n + "/" + this.d;
    }

    public Fraction(int num, int den) {
        this.d = den;
        this.n = num;
    }

    public Fraction() {
    }
}