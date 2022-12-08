public class Livro
{
    String Titulo = "Tio patinhas";
    String Autor = "WaltDisney";
    int NmPaginas = 211;
    private int isbn = 978946342;
    private String setIsbn;

    public Livro(String Titulo, String Autor, int NmPaginas)
    {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NmPaginas = NmPaginas;
    }



    @Override
    public String toString(){
        return "O livro com título " +  Titulo + " de ISBN " + getIsbn() + " e Autor " + Autor + " tem " + NmPaginas + " páginas";
    }


    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
