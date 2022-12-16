package com.example.kotProject

import java.util.*

class Database {

    var books = ArrayList<Book>()
    var currentBook: Book? = null

    fun Database() {
        val book1 = Book()
        book1.setName("سلامتی انسان")
        book1.setWriter("علی احدی")
        book1.setPublishDate("1401")
        book1.setPublisher("هادی همایونی")
        book1.setVersion("1.2")
        book1.setSummary("در این کتاب به عواملی که باعث افزایش\n سلامتی میشود اشاره شده است")
        val database = com.example.kotProject.Database()
        database.addToList(book1)
        val book2 = Book()
        book2.setName("اعمال انسان")
        book2.setWriter("علی حسینی")
        book2.setPublishDate("1401")
        book2.setPublisher("هادی تارایی")
        book2.setVersion("1.5")
        book2.setSummary("در این کتاب به عواملی که باعث افزایش\n اعمال نیک انسان میشود اشاره شده است")
        database.addToList(book2)
        val book3 = Book()
        book3.setName("ملت عشق ")
        book3.setWriter("الیف شافاک")
        book3.setPublishDate("1401")
        book3.setPublisher("نگین همایونی")
        book3.setVersion("1.2")
        book3.setSummary("در این کتاب به داستاانی عاشقانه درباره \n دونفر اشاره شده است")
        database.addToList(book3)
        val book4 = Book()
        book4.setName("انسان سالم")
        book4.setWriter("اصغراقایی مسبپقی")
        book4.setPublishDate("1401")
        book4.setPublisher("هادی شایانی")
        book4.setVersion("1.2")
        book4.setSummary("در این کتاب به عواملی که باعث افزایش\n زیبایی خانه میشود اشاره شده است")
        database.addToList(book4)
        val book5 = Book()
        book5.setName("زندگی زیبا")
        book5.setWriter("لوییز ال هی")
        book5.setPublishDate("1401")
        book5.setPublisher("فاطمه شاهدی ")
        book5.setVersion("1.8")
        book5.setSummary("در این کتاب به عواملی که باعث افزایش\n روحیه میشود اشاره شده است")
        database.addToList(book5)
        val book6 = Book()
        book5.setName("عشق زیبا")
        book5.setWriter("لوییز ال هی")
        book5.setPublishDate("1401")
        book5.setPublisher("فاطمه شاهدی ")
        book5.setVersion("1.8")
        book5.setSummary("در این کتاب به عواملی که باعث افزایش\n عشق میشود اشاره شده است")
        database.addToList(book6)
    }


    fun addToList(book: Book) {
        books.add(book)
    }


    fun getBook(i: Int): Book? {
        return books[i]
    }


    fun getCurrent(): String? {
        return "نام کتاب:" +
                currentBook!!.getName() + "\n" +
                "نام نویسنده :" +
                currentBook!!.getWriter() + "\n" +
                "ناشر:" +
                currentBook!!.getPublisher() + "\n" +
                "سال نشر:" +
                currentBook!!.getPublishDate() + "\n" +
                "خلاصه:" +
                currentBook!!.getSummary()
    }


}