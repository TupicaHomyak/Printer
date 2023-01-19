public class Printer {
    private String queue = ""; //в которой будут храниться тексты документов на распечатку
    private int pagesInQueue; // кол-вo документов, находящихся в данный момент в очереди на печать
    private int printedPages; // кол-вo уже распечатанных документов

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.append("some text 133", "Справка");
        printer.append("some text 210", 544);
        System.out.println(printer.getPendingPagesCount()); // 545
        printer.print();
        printer.append("some text 8", 530);
        printer.clear();
        printer.append("some text 23", "Договор", 312);
        printer.append("some text 11");
        printer.print();
        System.out.println(printer.getPrintedPagesCount()); // 858


    }

//    Далее вы должны были создать четыре метода append с разными наборами
//    параметров. Параметры предлагались такие: текст документа, имя документа и
//    количество страниц. При этом текст документа должен был быть обязательным
//    параметром.

    public void append(String text, String name, int pagesCount) { //Метод со всеми тремя параметрами
        queue = queue + "\n" + name + " - " + text;
        pagesInQueue = pagesInQueue + pagesCount;
    }
    public void append(String text) { // метод с одним параметром
        queue = queue + "\nДокумент без имени - " + text;
        pagesInQueue = pagesInQueue + 1;
    }
    public void append(String text, String name) { //метод с двумя параметрами
        queue = queue + "\n" + name + " - " + text;
        pagesInQueue = pagesInQueue + 1;
    }
    public void append(String text, int pagesCount) { // с двумя другими параметрами
        queue = queue + "\nДокумент без имени - " + text;
        pagesInQueue = pagesInQueue + pagesCount;
    }
    public void clear() { //метод, очищающий очередь печати:
        pagesInQueue = 0;
        queue = "";
    }
    public void print() { //о распечатывающий документы из очереди и очищающий её после распечатки
        printedPages = printedPages + pagesInQueue;
        System.out.println(queue);
        clear();
    }
    public int getPendingPagesCount() { //методы получения значения переменных-счётчиков:
        return pagesInQueue;
    }
    public int getPrintedPagesCount() {
        return printedPages;
    }




}