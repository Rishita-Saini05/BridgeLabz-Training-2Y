class Vol
{
    public static void main(String[] args)
    {
        int r = 6378;
        double m = r*0.6;
        double pi = 3.14;
        double vol = (4/3) * pi * r*r*r;
        double vm = (4/3) * pi * m*m*m;
        System.out.println("The volume of earth in cubic kilometers is "+vol+" and cubic miles is "+vm);


    }
}