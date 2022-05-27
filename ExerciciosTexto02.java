import java.util.ArrayList;

public class ExerciciosTexto02
{
    public ExerciciosTexto02(){
    }
    
    public int[] e2_2(int x, int y) {
        int resultado[] = new int[2];
        if(x>y) {
            resultado[0] = x;
            resultado[1] = y;
        }else if(y>x){
            resultado [0] = y;
            resultado [1] = x;
        }
        return resultado; 
    }
     
     public int[] e2_3(int x, int y, int z){
         int[] vet = {x, y, z};
         for (int i = 1; i < vet.length; i++) {
            for (int j = 0; j < i; j++) {
                if (vet[i] > vet[j]) {
                    int cont = vet[i];
                    vet[i] = vet[j];
                    vet[j] = cont;
                }
            }
        }
        return vet;
    }
    
    public double e2_4(double x){
        return Math.sqrt(x);
    }
    
    public String e2_5(String s1, String s2){
        int sresult = s1.indexOf(s2);
        if(sresult == -1){
            return null;
        }
        return "Est� contido";
    }
    
    public String[] e2_6(String s1, String s2){
        if(s1.compareToIgnoreCase(s2) < 0){
            return new String[] {s1, s2};
        }
        return new String[] {s2, s1};
    }
    
    public String[] e2_7( String s1, String s2, String s3){
        String[] vet = {s1, s2, s3};
        String ssub;
        for (int i = 1; i<vet.length; i++){
            for (int j = 0; j < i; j++){
                if (vet[i].compareToIgnoreCase(vet[j]) < 0){
                    ssub = vet[i];
                    vet[i] = vet[j];
                    vet[j] = ssub;
                }
            }
        }
        return vet;
    }
    
    public String[] e2_9 (ArrayList<String> vetString){
    	String str[] = new String[vetString.size()];
    	for (int i = 0; i<vetString.size(); i++){
            str[i] = vetString.get(i).toUpperCase();
            
        }
		return str;
    }
    
    public ArrayList<String> e2_10 (ArrayList<String> vetString){
    	for (int i = 0; i<vetString.size(); i++){
            vetString.set(i, vetString.get(i).toUpperCase());
        }
		return vetString;
    }
    
    public void e2_11(int[] vetInt) {
        for (int i = 1; i < vetInt.length; i++) {
           for (int j = 0; j < i; j++) {
               if (vetInt[i] < vetInt[j]) {
                   int cont = vetInt[i];
                   vetInt[i] = vetInt[j];
                   vetInt[j] = cont;
               }
           }
       }
}
    
    public int e2_12(int[] vetInt) {
    	int contTrocas = 0;
        for (int i = 1; i < vetInt.length; i++) {
           for (int j = 0; j < i; j++) {
               if (vetInt[i] < vetInt[j]) {
                   int cont = vetInt[i];
                   vetInt[i] = vetInt[j];
                   vetInt[j] = cont;
                   contTrocas++;
               }
           }
       }
       return contTrocas;
    }
    
    public void e2_13(String[] vetString){
    	String ssub;
    	for (int i = 1; i<vetString.length; i++){
            for (int j = 0; j < i; j++){
                if (vetString[i].compareToIgnoreCase(vetString[j]) > 0){
                    ssub = vetString[i];
                    vetString[i] = vetString[j];
                    vetString[j] = ssub;
                }
            }
        }
    }
    
    
}
