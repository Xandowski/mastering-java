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
        System.out.println(elefante.getOrganismo());
        System.out.println(elefante.getPeso());
        System.out.println(elefante.getTipo());
        System.out.println(elefante.getNomeReino());
        System.out.println(elefante.getQtdePatas());
        System.out.println(elefante.getQtdePresas());
    }
    
    public static void main(String[] args) throws Exception {
        Principal programa = new Principal();

        programa.entraDados();

        programa.mostrarDados();
    }
}
