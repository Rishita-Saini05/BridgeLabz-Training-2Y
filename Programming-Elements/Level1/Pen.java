class Pen
{
    public static void main(String[] args)
    {
        int pen = 14;
        int extra = pen % 3;
        int total = pen - extra;
        int pengiven = total / 3;
        System.out.println("The Pen Per Student is "+pengiven+ " and the remaining pen not distributed is "+extra);

    }
}