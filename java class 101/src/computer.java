public class computer {

    public static void main(String[] args) {


        computer x = new computer();
        x.turnOnComputer();
        computer y = new computer();
        y.turnOffComputer();
        x.reduceBrightNess();
        x.cleanCache();
        x.adjustTheVolume();

        ChromeBrowser a = new ChromeBrowser();
        a.openChromeBrowser();
        a.writeUrlInChromeAddressBar();
        a.closeChromeBrowser();
        a.openNewTabInChromeBrowser();
        TextEditor ab = new TextEditor();
        ab.writeIntoTextFile("this is my messsage ");
        ab.closeTextEditor();
        MicrosoftOutlook.closeOutLook();
        Calculator xy = new Calculator();
        xy.addTwoNumbers(5,6);
        System.out.println(xy.deductTwoNumbers(20,18));
        System.out.println(xy.addThreeNumber(10,20,30));
        System.out.println(xy.deductThreeNumber(40,20,5));



    }

        public void turnOnComputer() {
            System.out.println("Turning on my computer");
        }

    public void turnOffComputer(){
        System.out.println("Turning off my computer");

    }
        public void reduceBrightNess(){
            System.out.println("reduce light to 30%");
        }
        public void cleanCache(){

        System.out.println("cache is cleaned");
        }
        public void playMusic(){
        System.out.println("this is my song" );
        }
        public void adjustTheVolume(){
        System.out.println(("i want to keep my volume at 25 "));
        }






}
