public class ArrayClasses {

    public static void main(String[] args) {

        final int numCarros=5;
        //int[] num=new int[tamanho];
        Carro[] carros=new Carro[numCarros];
        String[] nomesCarros={"HRV","Golf","Camaro","Mustang","Toro"};

        carros[0]=new Carro("HRV");
        carros[1]=new Carro("Golf");
        carros[2]=new Carro("Camaro");
        carros[3]=new Carro("Mustang");
        carros[4]=new Carro("Toro");

        //Inicializar o array carros
        for(int i=0;i<numCarros;i++){
            carros[i]=new Carro(nomesCarros[i]);
        }

        //Imprimir carros
        for(Carro c:carros){
            c.info();
        }

    }
}