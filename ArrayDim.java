package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author Ni kadek ita purnama dewi 2201010479
 * tgl: 2024-04-22
 */
public class ArrayDim {
    int jdta = 5;
    String[] dteman = new String[jdta];
    Scanner dtIN = new Scanner(System.in);
    
     public void storedata(){
         System.out.println("Isikan Data Teman");
         System.out.println("~~~~~~~~~~~~~~~~~~~");
         
      //for // while
        int num=0;
        for(int i =0; i<jdta;i++ ){
            num++;
            System.out.println("Data ke-"+num+": ");
        dteman[i] = dtIN.nextLine();
        }
     
     }
      public void viewdata(){
        System.out.println("Daftar Teman");
        System.out.println("~~~~");
        int no=0;
        for(int i=0; i<jdta; i++){
            no++;
            System.out.println(no+". "+dteman[i]);
        }
     }
      public void editdata(){
        System.out.println("Ubah Data Teman");
        System.out.println("~~~~");
        System.out.println("Index Data yang di Ubah");
        String id = dtIN.nextLine();
        int idx = dtIN.nextInt();
        System.out.println("Data yang diubah: "+dteman[idx]);
        System.out.println("Diubah menjadi: ");
        String newdt = dtIN.nextLine();
        dteman[idx] = newdt;
        System.out.println("Data Index ke-"+idx+" telah dirubah");
    }
      public void destroydata() {
        System.out.println("Hapus Data Teman");
        System.out.println("~~~~");
        System.out.println("Index Data yang di Hapus");
        String id = dtIN.nextLine();
        int idx = Integer.parseInt(id);
        dteman[idx]="";
        System.out.println("Data index ke-"+idx+" telah dihapus");
      }
}
    /**
         
         System.out.print("Data ke-2: ");
         dteman[1] = dtIN.nextLine();
         
         System.out.print("Data ke-3: ");
         dteman[2] = dtIN.nextLine();
         
         System.out.print("Data ke-4: ");
         dteman[3] = dtIN.nextLine();
         
         System.out.print("Data ke-5: ");
         dteman[4] = dtIN.nextLine();
    **/
        

