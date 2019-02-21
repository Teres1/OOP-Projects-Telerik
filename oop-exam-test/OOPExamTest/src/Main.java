import commands.CommandParserImpl;
import commands.base.CommandParser;
import services.CategoryServiceImpl;
import services.ProductsServiceImpl;
import services.base.CategoriesService;
import services.base.ProductsService;

public class Main {

    public static void main(String[] args) {
        ProductsService productsService = new ProductsServiceImpl();
        CategoriesService categoriesService = new CategoryServiceImpl();
        CommandParser commandParser = new CommandParserImpl();
        Application application = new Application(productsService, categoriesService, commandParser);
        application.run();
    }
}
