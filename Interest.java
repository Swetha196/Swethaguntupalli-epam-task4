public class Interest{
    double principal, time, rate_of_interest;
    public Interest(double p,double t,double r){
        principal=p;
        time=t;
        rate_of_interest=r;
    }
}
    class sim_in extends Interest
    {
        public sim_in(double principal,double time,double rate_of_interest)
        {
            super(principal, time, rate_of_interest);
        }
        public double cali ()
        {
            return (principal*time*rate_of_interest)/100;
        }
    }
    class com_in extends Interest
    {
        public com_in(double principal,double time,double rate_of_interest)
        {
            super(principal,time,rate_of_interest);
        }
        public double calc()
        {
            return (principal+Math.pow((1+rate_of_interest),time));
        }
    }
