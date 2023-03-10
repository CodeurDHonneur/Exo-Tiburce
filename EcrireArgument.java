public class EcrireArgument {
    /*String arg1, 
    arg2,
    arg3,
    arg4,
    arg5;*/

   /* public EcrireArgument(String elt1, String elt2, String elt3, String elt4, String elt5)
    {
        arg1 = elt1;
        arg2 = elt2;
        arg3 = elt3;
        arg4 = elt4;
        arg5 = elt5;
    }*/

    public static void main(String[] args) 
    {
        System.out.println("premier test : " + args[0] + ", comment vas-tu " + args[1] + " ?");
        int x = args.length;

        for(int i = 0; i < x; i++) {
            System.out.println("argument n°" + (i+1) + " => " + args[i]);
        }
    }
}
