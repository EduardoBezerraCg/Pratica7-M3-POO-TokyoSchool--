public class Main extends Livro {
    public Main(String Titulo, String Autor, int NmPaginas) {
        super(Titulo, Autor, NmPaginas);
    }


    public static void main(String[] args)
    {
        Livro l1 = new Livro("Tio Patinhas", "Walt Dinsey", 211);
        Livro l2 = new Livro("Os manos", "Denis Robinson", 250);



        System.out.println(l1.toString());
        System.out.println(l2.toString());

        if (l1.NmPaginas > l2.NmPaginas)
        {
            System.out.println("O Livro 1, " + l1.toString() + "tem mais paginas que o livro 2");
        }
        else
        {
            System.out.println("O livro 2 tem mais paginas que o livro 1");
        }



    }
}