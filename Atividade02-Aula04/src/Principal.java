public class Principal {
    Terrestre elefante;
    
    public void entraDados() {
        elefante = new Terrestre();
        elefante.setNomeClasse("Mammalia");
        elefante.setOrganismo("heterótrofos");
        elefante.setPeso(6000);
        elefante.setTipo("Vertebrado");
        elefante.setNomeReino("Animalia");
        elefante.setQtdePatas(4);
        elefante.setQtdePresas(2);
    }

    public void mostrarDados() {
        System.out.println(elefante.getNomeClasse());
    }
    
    public static void main(String[] args) throws Exception {
        Principal programa = new Principal();

        programa.entraDados();

        programa.mostrarDados();
    }
}
