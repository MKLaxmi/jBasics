import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {




        int[] num = {1,1,0,1,0};
        System.out.println(Arrays.toString(num));
        int nz=0;
        int z=0;
            while(nz<num.length){
                if(num[nz] != 0){
                    int temp = num[nz];
                    num[nz] = num[z];
                    num[z] = temp;
                    nz++;
                    z++;
                }else{
                    nz++;
                }
            }
            System.out.println(Arrays.toString(num));
        }
    }
