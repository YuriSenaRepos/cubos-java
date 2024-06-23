package t02;

public class Main {

	public static void main(String[] args) {
		Book livro = new Book ("Titulo", 1999,5,new Publisher("Fulaners Editora"), new Author("João"));
		System.out.println("Livro: " + livro.getTitle());
		System.out.println("Ano: " + livro.getYear());
		System.out.println("Edição: " + livro.getEdition());
		System.out.println("Editora: " + livro.getPublisher());
		System.out.println("Autor: " + livro.getAuthor());


		livro.setTitle("Titulo 2");
		livro.setEdition(9);
		livro.setYear(2013);
		livro.setAuthor(new Author("José"));
		livro.setPublisher(new Publisher("Editora Sem Nome"));

		System.out.println();

		System.out.println("Livro: " + livro.getTitle());
		System.out.println("Ano: " + livro.getYear());
		System.out.println("Edição: " + livro.getEdition());
		System.out.println("Editora: " + livro.getPublisher());
		System.out.println("Autor: " + livro.getAuthor());
		System.out.println("Ano: " + livro.getYear());


	}

}
