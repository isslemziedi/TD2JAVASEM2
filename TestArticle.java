package td2sem2;

public class TestArticle {

	public static void main(String[] args) {
		
		Stock stock = new Stock();
		
        Article a1 = new Article("Article1", 10);
        Article a2 = new Article("Article2", 20);
        Article a3 = new Article("Article3", 30);

        stock.addNouvArticle(a1,5);
        stock.addNouvArticle(a2,10);
        stock.addNouvArticle(a3,15);
        
        LigneFacture ligneF1 = new LigneFacture(1,10,a1);
        LigneFacture ligneF2 = new LigneFacture(2,20,a2);
        
        System.out.println(" Le montant total de la ligne: \n"+ligneF1+" \n est: "+ligneF1.getMontantTotal());
        System.out.println("\n Le montant total de la ligne: \n"+ligneF2+" \n est :"+ligneF2.getMontantTotal());

        Facture f = new Facture(stock);
        f.addLigne(5, "Article1");
        double m = f.getMontantTotal();
        System.out.println("\n le montant total correspondant a la ligne est : "+m); 
        
        f.removeLigne(1);
        System.out.println("\n"+f);

        System.out.println("\nLe stock trie : ");
        stock.sortStock();
	}

}
