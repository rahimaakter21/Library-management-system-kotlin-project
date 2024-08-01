//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val publicLibrary= PublicLibrary()
    publicLibrary.addBook(Book("the lord of king","j.j.r",2000))
    publicLibrary.addBook(Book("the return of king","j.j.r",2012))
    publicLibrary.addBook(Book("the avengers of king","joss",2010))

    println(".......all book....")
    publicLibrary.viewAllBook()
    println(".......find books  by author....")
    publicLibrary.FindBookByauthor("joss")
}