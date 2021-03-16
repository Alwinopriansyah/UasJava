//Import class yang dibutuhkan
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
public class uasalwi { 
    public static void main(String args[]){
        login();}
static void login(){    
        String barang[]=new String[3];
         String data[]={"Alwi","0207"};
         String nama, sandi;
         Scanner apa=new Scanner(System.in);
        
        System.out.print("Nama Pengguna : ");
        nama=apa.nextLine();
        System.out.print("Sandi Pengguna : ");
        sandi=apa.nextLine(); 

        if(nama.equals(data[0])&&sandi.equals(data[1])){
            System.out.println("SELAMAT DATANG");
            pilihan();
        }
        else {
            System.out.print("Maaf sandi yang anda masukan salah");
            login();
        }
    }

static void pilihan(){
	System.out.println("1.  Aplikasi program kasir ");
        System.out.println("2.  Aplikasi program pengurutan ");
        System.out.println("3.  go out ");
        System.out.println("3-null.  go out ");
        Scanner apa=new Scanner(System.in);
        int menu ;
        System.out.print("Silahkan pilih pelayanan yang anda inginkan : ");
        menu=apa.nextInt();
        if(menu==1){
            kasir();
        }
        else if(menu==2){
            Pengurutan();
        }
        else{
            System.exit(0);
        }
    }

	static void kasir(){
        //Inisialisasi objek untuk masing-masing kelas
         Scanner input = new Scanner(System.in);
         DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
         DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
         //Deklarasi variabel
         int jum=0, i=0;
         double total_bayar=0;
        System.out.println("\n\n\n\n\n\n\n\n\n");
        System.out.println("            SELAMAT DATANG DI PROGRAM KASIR ");
        System.out.println("\n");
        System.out.println("           =================================================");
        System.out.println("           =        A       L     W                   W  I =");
        System.out.println("           =       A A      L      W                 W   I =");
        System.out.println("           =      A   A     L       W               W    I =");
        System.out.println("           =     AAAAAAA    L        W             W     I =");
        System.out.println("           =    A       A   L         W     W     W      I =");
        System.out.println("           =   A         A  L          W  W   W  W       I =");
        System.out.println("           =  A           A LLLLLLLL    W       W        I =");
        System.out.println("           ================================================");
        System.out.println("            \n\n");
                System.out.println("                    BISMILLAH BERKAH ISTIQOMAH");
		//        menampilkan menu makanan
        System.out.println("             _________________________________________");
        System.out.println("            |                MENU MAKANAN             |");
        System.out.println("            |_________________________________________|");
        System.out.println("            |       Nama            |       Harga     |");
        System.out.println("            |1. Nasi Goreng         |   Rp 10000,00   |");
        System.out.println("            |2. Nasi Campur         |   Rp 10000,00   |");
        System.out.println("            |3. Nasi Kuning         |   Rp 15000,00   |");
        System.out.println("            |4. Mie Nasi Goreng     |   Rp 13000,00   |");
        System.out.println("            |5. Bakso Daging        |   Rp 10000,00   |");
	    System.out.println("            |6. Miso Ayam           |   Rp 8000,00    |");
        System.out.println("            |7. Mie Ayam bakso      |   Rp 13000,00   |");
        System.out.println("            |8. Mie Ayam Biasa      |   Rp 10000,00   |");
        System.out.println("            |9. Bakso Urat          |   Rp 10000,00   |");
        System.out.println("            |10.Bakso Beranak       |   Rp 15000,00   |");
        System.out.println("            |_______________________|_________________|");
        System.out.println("");


         //Deklarasi array
         int [] kode = new int[5];
         int [] qty = new int[5];
         int [] harga = new int[5];
         double [] sub_total = new double[5];
         double [] diskon= new double [5];
         String [] barang = new String[5];
         
         System.out.println("            KASIR WARUNG MAKAN BERKAH ISTIQOMAH");
         
         System.out.print("            Masukan Jumlah Beli : ");
         jum=input.nextInt();
         System.out.println(" ");
         //Memasukan elemen didalam array
         for (i=0; i<jum;i++){
              System.out.print("            Masukan Kode Barang Ke-"+(i+1)+" : ");
              kode[i]=input.nextInt();
              System.out.print("            Masukan jumlah Ke-"+(i+1)+" : ");
              qty[i]=input.nextInt();
              //Menentukan barang berdasarkan kode yang dimmasukan
              switch (kode[i]){
                  case 1 : 
                            barang[i]="Nasi Goreng  ";
                            harga[i]=10000;
                            diskon[i]=0.1;
                            break;
                  case 2 : 
                            barang[i]="Nasi Campur  ";
                            harga[i]=10000;
                            diskon[i]=0.05;
                            break;
                  case 3 : 
                            barang[i]="Nasi Kuning";
                            harga[i]=15000;
                            diskon[i]=0;
                            break;
                  case 4 : 
                            barang[i]="Mie Nasi Goreng        ";
                            harga[i]=13000;
                            diskon[i]=0.2;
                            break;
                  case 5 : 
                            barang[i]="Bakso Daging     ";
                            harga[i]=10000;
                            diskon[i]=0.1;
                            break;
                  case 6 : 
                            barang[i]="Miso Ayam  ";
                            harga[i]=8000;
                            diskon[i]=0.1;
                            break;
                  case 7 : 
                            barang[i]="Mie Ayam Bakso  ";
                            harga[i]=13000;
                            diskon[i]=0.05;
                            break;
                  case 8 : 
                            barang[i]="Mie Ayam Biasa";
                            harga[i]=10000;
                            diskon[i]=0;
                            break;
                  case 9 : 
                            barang[i]="Bakso Urat        ";
                            harga[i]=10000;
                            diskon[i]=0.2;
                            break;
                  case 10 : 
                            barang[i]="Bakso Beranak     ";
                            harga[i]=15000;
                            diskon[i]=0.1;
                            break;
                  default : 
                            System.out.println("            Kode Barang Tidak Tersedia");
              }
         }
          //Pengaturan format number
          formatRp.setCurrencySymbol("            Rp. ");
          formatRp.setMonetaryDecimalSeparator(',');
          formatRp.setGroupingSeparator('.');
          kursIndonesia.setDecimalFormatSymbols(formatRp);
          
          System.out.println(" ");
          System.out.println("No        Nama Barang                  Harga                       Jumlah        Diskon              Sub Total");  
          //Menampilkan seluruh elemen di dalam array
          for (i=0; i<jum;i++){ 
             sub_total[i]=((qty[i]*harga[i])-(qty[i]*harga[i]*diskon[i]));
             total_bayar+=sub_total[i];
              System.out.println(          +i+1+"       "+barang[i]+"       "+kursIndonesia.format(harga[i])+"              "+qty[i]+"              "+(int)(diskon[i]*100)+"%"+"        "+kursIndonesia.format(sub_total[i])); 
          }
          System.out.println(" ");
          //Menampilkan total bayar
          System.out.println("            Total Bayar : "+kursIndonesia.format(total_bayar));
    }


static void Pengurutan(){

	int jumlah,i,j, swap;
  Scanner scan = new Scanner(System.in);
	 
  System.out.print("Masukkan Jumlah Bilangan Yang Mau DiInputkan :");
  jumlah = scan.nextInt();
 
  int array[] = new int[jumlah];
  
  System.out.println("\nMasukkan " + jumlah+" Buah Bilangan Integer");
  System.out.println("===========================================");
  for(i=0; i<jumlah;i++)
  {
   System.out.print("Bilangan Ke- " + (i+1)+" =");
   array[i]=scan.nextInt();
  }

  System.out.println("\nBilangan Belum Terurutnya");
  for(int a=0;a<jumlah;a++)
  {
   System.out.print(array[a] +" ");
  }

  for(i=0; i<(jumlah-1);i++)
  {
   for(j=0;j<jumlah-i-1;j++)
   {
    if (array[j] > array[j+1])
    {
     swap = array[j];
     array[j] = array[j+1];
     array[j+1]=swap;
    }
   }
  }

  System.out.println("\n\nBilangan Terurutnya adalah :");
  for(i=0;i<jumlah; i++)
	   System.out.print(array[i] +" ");		
	}
}