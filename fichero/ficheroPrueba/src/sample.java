import java.io.*;
public class sample {
    public static void main(String args[]) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));

        // Creating binary file
        FileOutputStream fout=new FileOutputStream("inventory.dat");
        DataOutputStream dout=new DataOutputStream(fout);

        int n, q, pr;
        String str, pc;
        System.out.println("Enter number of products:");
        n=Integer.parseInt(ob.readLine());
        for(int i=1;i<=n;i++) {
            System.out.println("Enter product name");
            str=ob.readLine();
            System.out.println("Enter product code");
            pc=ob.readLine();
            System.out.println("Enter product quantity");
            q=Integer.parseInt(ob.readLine());
            System.out.println("Enter price");
            pr=Integer.parseInt(ob.readLine());

            // Writing data values from memory to binary file
            dout.writeUTF(str);
            dout.writeUTF(pc);
            dout.writeInt(q);
            dout.writeInt(pr);
        }
        // Closing binary file object
        fout.close();
        dout.close();
        ob.close();
    }
}