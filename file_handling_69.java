import java.io.*;

public class file_handling_69 {
    //so we will learn about the file handling here
    // so thier two types of streams here like byte streams and the character streams
    // so here when file ending with streams is for the byte data types file types ending with reader and writer for
    // the character data types
    // it have the i/o exception
}
class input{
    // so now their are many type of input available here
    public static void main(String[] args) {
//        input1();
//        input2();
        input3();
    }
    static void input1(){
//        For top efficiency, consider wrapping an InputStreamReader within a BufferedReader. For example:
//        BufferedReader in
//                = new BufferedReader(new InputStreamReader(anInputStream));
        // these line i get from it's docs
        try(InputStreamReader isr = new InputStreamReader(System.in);){
            System.out.println("enter some of the letter");
            int letter = isr.read(); // we can see that this function take int as the return types
            while (isr.ready()){
                System.out.println(letter);  // so this print the ascy values
                System.out.println((char)letter); // and in this we conver it into the cahr so it return the char value
                letter = (char)isr.read();
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    static void input2(){
        // so now here we are going to learn about the file reader type class here how dose it works
        try(FileReader fr = new FileReader("handlingfile1.txt")) {  // i don't know how to specify the location
            // here so it's the problem here that the main problem
            // so it can take the file name and read that file for us we can take the
            // file direactory as the string here
            int letter = fr.read();
            while (fr.ready()){
                // so now when it's ready so print it
                System.out.println((char)letter);
                letter = fr.read();
            }
            System.out.println();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    static void input3(){
        // use this for the fast input and output in the java out here
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
             // so here we have to write the input size and or the main
            // thing is the we have to wirte the main file input streame here it take the input streames
            System.out.println("you entered the " + br.readLine());  // so here we can take the line as the input and
            // do the stuff on it
            int letter = br.read();
            // and this is the older method which we have done in all the previous
            while (br.ready()){
                System.out.println((char) letter);
                letter = br.read();
            }
            System.out.println();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        try (BufferedReader br = new BufferedReader(new FileReader("filehandling1.txt"))) { // still can't
            // find this file name out here
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
class output{
    // so here we will learn about the wrting in the class out here
    // above we have learn about how we can read the file so here we will learn how we can write in the file out here
    public static void main(String[] args) {
//        output1();
        output3();
    }
    public static void output1(){
        try(OutputStreamWriter os = new OutputStreamWriter(System.out)) {
            os.write(78);
            os.write("  so it can take string as input ");
            char[] arr = "this is the string to char array".toCharArray();
            os.write(arr);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void output2(){
        try (FileWriter fw = new FileWriter("note.txt", true)) { // so here if we do not do anything
            // to the append then it will take by default false so it will overwrite the main file
            // while if we make the append to the true so it will append this in the that file without  overwriting
            // the file
            fw.write("this should be appended");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void output3(){
        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            // so now we can use this also for writng purpose
            bw.write("this is the first line");
            bw.newLine();
            bw.write(78);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
class file{
    // so we are creating file at out own here
    public static void main(String[] args) {
//        file1();  // so now new file is begin created below the git igore
        file2();
        file3();
    }
    public static void file1(){
        try {
            File fo = new File("handlingfile2.txt"); // so it create the file out of it by writing the line belwo
            fo.createNewFile();
        }catch (IOException e ){
            System.out.println(e.getMessage());
        }

    }
    public static void file2(){
        // so now here what if we want to write in the file
        try {
            FileWriter fr = new FileWriter("handlingfile2.txt");
            fr.write("this is the line written inside the main file so here we have to write the git sholok \n");
            fr.write("so this is the new line insde of it let'see how it works");
            fr.close();  // so if we don't close this then it will not write inside of it

        }catch (IOException e ){
            System.out.println(e.getMessage());
        }
    }
    public static void file3(){
        // so now here we have read it
        try {
            BufferedReader br = new BufferedReader(new FileReader("handlingfile2.txt"));
            System.out.println(br.readLine());  // this read the only the first line
           while (br.ready()){
               System.out.println(br.readLine());
           } // this read the whole lines inside of it
        }catch (IOException e ){
            System.out.println(e.getMessage());
        }
    }
}
