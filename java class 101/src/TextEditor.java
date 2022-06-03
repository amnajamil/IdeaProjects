public class TextEditor {
    public TextEditor openTextEditor(){
        TextEditor d = new TextEditor();
        return d;
    }
    public void writeIntoTextFile(String message){
        System.out.println(message);

    }
    public void closeTextEditor(){
        System.out.println("texteditor is closed");
    }
}
