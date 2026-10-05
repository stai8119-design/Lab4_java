package ma.ens.classe;

public class TestVoiture {
    public static void main(String[] args) {
        
        
        System.out.println("Création des objets");
        
        Voiture voiture1 = new Voiture();
        voiture1.afficherInformations();

        Voiture voiture2 = new Voiture("Toyota", "Corolla", 0.0, 2023);
        voiture2.afficherInformations();

        Voiture voiture3 = new Voiture(voiture2);
        voiture3.afficherInformations();

 
        System.out.println("\nComparaison des objets");
        System.out.println("voiture1 == voiture2 ? " + (voiture1 == voiture2));
        System.out.println("voiture2 == voiture3 ? " + (voiture2 == voiture3));

        System.out.println("\nModification de voiture2");
        voiture2.accelerer(120);
        voiture2.freiner(30);
        voiture2.afficherInformations();

       
        System.out.println("\nModification de voiture3");
        voiture3.accelerer(80);
        voiture3.afficherInformations();

      
        System.out.println("\nTest des setters avec validation");
        voiture2.setVitesse(-50); 
        voiture2.setAnnee(1800);  
        voiture2.setMarque("");  
        voiture2.afficherInformations();

      
        System.out.println("\nComparaison finale");
        voiture2.afficherInformations();
        voiture3.afficherInformations();

        System.out.println("\nTESTS DES VALIDATIONS");

        Voiture voitureTest = new Voiture("Renault", "Clio", 0.0, 2022);

        System.out.println("\nTest 1 : Vitesse négative");
        voitureTest.setVitesse(-10);
        System.out.println("Vitesse actuelle : " + voitureTest.getVitesse());

        System.out.println("\nTest 2 : Vitesse nulle");
        voitureTest.setVitesse(0);
        System.out.println("Vitesse actuelle : " + voitureTest.getVitesse());

        System.out.println("\nTest 3 : Année invalide (trop ancienne)");
        voitureTest.setAnnee(1800);
        System.out.println("Année actuelle : " + voitureTest.getAnnee());

        System.out.println("\nTest 4 : Année invalide (future)");
        voitureTest.setAnnee(2050);
        System.out.println("Année actuelle : " + voitureTest.getAnnee());

        System.out.println("\nTest 5 : Marque vide");
        voitureTest.setMarque("");
        System.out.println("Marque actuelle : " + voitureTest.getMarque());

        System.out.println("\nTest 6 : Marque null");
        voitureTest.setMarque(null);
        System.out.println("Marque actuelle : " + voitureTest.getMarque());

        System.out.println("\nTest 7 : Accélération négative");
        voitureTest.accelerer(-50);
        System.out.println("Vitesse actuelle : " + voitureTest.getVitesse());

        System.out.println("\nTest 8 : Freinage excessif");
        voitureTest.setVitesse(20);
        voitureTest.freiner(50);
        System.out.println("Vitesse actuelle : " + voitureTest.getVitesse());

        System.out.println("\nInformations finales de voitureTest");
        voitureTest.afficherInformations();
    }
}