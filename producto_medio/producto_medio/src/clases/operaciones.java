package clases;
public class operaciones {
    int x0,x1,n;    
    public operaciones(int x00,int x1,int n){
        this.x0=x00;
        this.x1=x1;
        this.n=n;    
    }
    String m1[][]=new String[n][6];       
    public void imprimir(){
        m1=girar();
         for(int i=0;i<n;i++){
             for(int j=0;j<6;j++){
             System.out.print(m1[i][j]+"  ");
             }
             System.out.println();
         }
    }
    public String[][] girar(){     
    String m[][]=new String[n][6];          
        for(int i=0;i<n;i++){
            int j=0;
            m[i][j]=""+(i+1);j++;
            m[i][j]=""+x0;j++;
            m[i][j]=""+x1;j++;
            String mul="";int re=0;
            mul=""+multiplicar_semillas(x0,x1);
            re=Integer.parseInt(tomar_medio(convertir_vector(mul)));
           m[i][j]=mul;j++;
           m[i][j]=""+re;j++;
            double nume_ale=0;
            x0=x1;
            x1=re;
            nume_ale=((double)re)/((double)10000);
            m[i][j]=""+nume_ale;
        }
        return m;
    }        
    public int multiplicar_semillas(int x0,int x1){
        int mul=x0*x1;
        return mul;
    }
     public char[] convertir_vector(String mul){
         char v[]=mul.toCharArray();
     return v;
     } 
     public String tomar_medio(char v[]){
         String resul="";
         for(int i=v.length/2-2;i<v.length/2+2;i++){
             resul=resul+v[i];
         }
         return resul;
     
     }        
}
