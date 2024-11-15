public class Main {
    public static void main(String[] args) {
        // Test avec EspritHashSet
        GestionEnseignant gestionHashSet = new EspritHashSet();

        Enseignant e1 = new Enseignant(1, "Ali", "Ben Salah");
        Enseignant e2 = new Enseignant(2, "Ahmed", "Trabelsi");
        Enseignant e3 = new Enseignant(3, "Sara", "Jaziri");

        gestionHashSet.ajouterEnseignant(e1);
        gestionHashSet.ajouterEnseignant(e2);
        gestionHashSet.ajouterEnseignant(e3);

        System.out.println("Enseignants (HashSet) :");
        gestionHashSet.displayEnseignants();

        System.out.println("Rechercher par id (2) : " + gestionHashSet.rechercherEnseignant(2));
        gestionHashSet.supprimerEnseignant(e2);

        System.out.println("Après suppression (HashSet) :");
        gestionHashSet.displayEnseignants();

        // Test avec EspritTreeSet
        GestionEnseignant gestionTreeSet = new EspritTreeSet();
        gestionTreeSet.ajouterEnseignant(e1);
        gestionTreeSet.ajouterEnseignant(e2);
        gestionTreeSet.ajouterEnseignant(e3);

        System.out.println("\nEnseignants (TreeSet) :");
        gestionTreeSet.displayEnseignants();
    }
}
