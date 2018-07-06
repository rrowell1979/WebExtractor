package prototype;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Extractor ext = new Extractor();
        Product product;
        product = ext.parseProductAttributes("54594234","walmart","com");
        Product[] productArray;
        String[] ids = new String[3];
        ids[0] = "14869676";
        ids[1] = "26832646";
        ids[2] = "952592653";
        productArray = ext.parseProductAttributes(ids, "walmart", "com");
        System.out.println("Finished");
    }
}
