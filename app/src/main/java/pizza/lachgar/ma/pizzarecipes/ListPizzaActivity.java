package pizza.lachgar.ma.pizzarecipes;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import pizza.lachgar.ma.pizzarecipes.adapter.PizzaAdapter;
import pizza.lachgar.ma.pizzarecipes.beans.Produit;
import pizza.lachgar.ma.pizzarecipes.service.ProduitService;

public class ListPizzaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pizza);

        ProduitService ps = ProduitService.getInstance();

        // ✅ Toutes les pizzas de l'Annexe
        ps.create(new Produit("BARBECUED CHICKEN PIZZA", 3, R.drawable.pizza1, "35 min",
                "- 2 boneless skinless chicken breast halves\n- 1/4 teaspoon pepper\n- 1 cup barbecue sauce\n- 1 tube refrigerated pizza crust\n- 2 teaspoons olive oil\n- 2 cups shredded Gouda cheese\n- 1 small red onion\n- 1/4 cup minced fresh cilantro",
                "So fast and so easy with refrigerated pizza crust, these saucy, smoky pizzas make quick fans. —Alicia Trevithick, Temecula, California",
                "STEP 1:\nSprinkle chicken with pepper; grill 5-7 minutes per side.\n\nSTEP 2:\nPress dough into rectangle; brush with oil. Grill until browned.\n\nSTEP 3:\nSpread barbecue sauce, top with cheese, chicken and onion. Grill 2-3 minutes."));

        ps.create(new Produit("BRUSCHETTA PIZZA", 5, R.drawable.pizza2, "35 min",
                "- 1/2 pound reduced-fat bulk pork sausage\n- 1 prebaked 12-inch pizza crust\n- 1 package sliced turkey pepperoni\n- 2 cups shredded mozzarella cheese\n- 1-1/2 cups chopped plum tomatoes\n- 1/2 cup fresh basil leaves\n- 1 tablespoon olive oil\n- 2 garlic cloves, minced",
                "You might need a knife and fork for this hearty pizza! Loaded with Italian flavor and plenty of fresh tomatoes. —Debra Kell, Owasso, Oklahoma",
                "STEP 1:\nCook sausage; place on crust with pepperoni and cheese. Bake at 450° for 10-12 minutes.\n\nSTEP 2:\nCombine tomatoes, basil, oil, garlic. Spoon over pizza."));

        ps.create(new Produit("SPINACH PIZZA", 2, R.drawable.pizza3, "25 min",
                "- 1 package pizza crust mix\n- 1/2 cup Alfredo sauce\n- 2 medium tomatoes\n- 4 cups chopped fresh spinach\n- 2 cups shredded Italian cheese blend",
                "This tasty pizza is so easy to prepare. My family loves it! —Dawn Bartholomew, Raleigh, North Carolina",
                "STEP 1:\nPrepare pizza dough; press onto greased 12-in. pan.\n\nSTEP 2:\nSpread Alfredo sauce; top with spinach, tomatoes and cheese.\n\nSTEP 3:\nBake at 450° for 10-15 minutes."));

        ps.create(new Produit("DEEP-DISH SAUSAGE PIZZA", 8, R.drawable.pizza4, "45 min",
                "- 1 package active dry yeast\n- 2/3 cup warm water\n- 1-3/4 cups all-purpose flour\n- 1/4 cup vegetable oil\n- 1 teaspoon each dried oregano, basil and marjoram\n- 1/2 teaspoon garlic salt",
                "My Grandma made the tastiest snacks for us when we stayed the night at her farm. —Michele Madden, Washington Court House, Ohio",
                "STEP 1:\nDissolve yeast in water; mix flour and seasonings. Knead dough 6-8 minutes. Let rise 1 hour.\n\nSTEP 2:\nLayer mozzarella, onion, peppers, sausage and tomatoes. Bake at 400° for 20 minutes.\n\nSTEP 3:\nAdd pepperoni; bake 10-15 minutes more."));

        ps.create(new Produit("HOMEMADE PIZZA", 4, R.drawable.pizza5, "50 min",
                "- 1 package active dry yeast\n- 1 teaspoon sugar\n- 1-1/4 cups warm water\n- 1/4 cup canola oil\n- 1 teaspoon salt\n- 3-1/2 cups all-purpose flour\n- 1/2 pound ground beef\n- 1 small onion, chopped\n- 1 can tomato sauce\n- 2 cups shredded mozzarella cheese",
                "This recipe is a hearty, zesty main dish with a crisp, golden crust. —Marianne Edwards, Lake Stevens, Washington",
                "STEP 1:\nDissolve yeast and sugar in water; add oil, salt and flour. Knead 2-3 minutes.\n\nSTEP 2:\nLet rise 45 minutes. Cook beef and onion.\n\nSTEP 3:\nSpread sauce on crust; top with beef and cheese.\n\nSTEP 4:\nBake at 400° for 25-30 minutes."));

        ps.create(new Produit("PESTO CHICKEN PIZZA", 3, R.drawable.pizza6, "50 min",
                "- 2 teaspoons active dry yeast\n- 1 cup warm water\n- 2-3/4 cups bread flour\n- 1 tablespoon olive oil\n- 1/2 pound boneless skinless chicken\n- 1 small onion\n- 1/2 each small green, red and yellow peppers\n- 3 tablespoons prepared pesto\n- 1-1/2 cups shredded mozzarella cheese",
                "This is the only pizza I make now. We love it! —Heather Thompson, Woodland Hills, California",
                "STEP 1:\nDissolve yeast in water; mix flour, oil, sugar and salt. Knead 6-8 minutes.\n\nSTEP 2:\nLet rise 1 hour.\n\nSTEP 3:\nCook chicken, onion, peppers and mushrooms.\n\nSTEP 4:\nSpread pesto on dough; top with chicken mixture and cheese.\n\nSTEP 5:\nBake at 400° for 18-20 minutes."));

        ps.create(new Produit("LOADED MEXICAN PIZZA", 3, R.drawable.pizza7, "30 min",
                "- 1 can black beans\n- 1 medium red onion, chopped\n- 1 small sweet yellow pepper\n- 3 teaspoons chili powder\n- 3 medium tomatoes\n- 1 jalapeno pepper\n- 1 prebaked 12-inch thin pizza crust\n- 2 cups chopped fresh spinach\n- 1/2 cup shredded cheddar cheese\n- 1/2 cup shredded pepper jack cheese",
                "My husband is a picky eater, but this healthy pizza has lots of flavor. —Mary Barker, Knoxville, Tennessee",
                "STEP 1:\nMash black beans; stir in onion, pepper and spices.\n\nSTEP 2:\nSpread on crust; top with tomatoes, spinach and cheeses.\n\nSTEP 3:\nBake at 400° for 12-15 minutes."));

        ps.create(new Produit("BACON CHEESEBURGER PIZZA", 2, R.drawable.pizza8, "20 min",
                "- 1/2 pound ground beef\n- 1 small onion, chopped\n- 1 prebaked Italian bread shell crust\n- 1 can pizza sauce\n- 6 bacon strips, cooked\n- 20 dill pickle slices\n- 2 cups shredded mozzarella cheese\n- 2 cups shredded cheddar cheese",
                "Kids of all ages love pizza and cheeseburgers, and this recipe combines them both! —Cherie Ackerman, Lakeland, Minnesota",
                "STEP 1:\nCook beef and onion until no longer pink.\n\nSTEP 2:\nSpread pizza sauce on crust; top with beef, bacon, pickles and cheeses.\n\nSTEP 3:\nBake at 450° for 8-10 minutes."));

        ps.create(new Produit("PIZZA MARGHERITA", 1, R.drawable.pizza9, "30 min",
                "- 3 teaspoons active dry yeast\n- 1 cup warm water\n- 2 tablespoons olive oil\n- 1 teaspoon sugar\n- 1 teaspoon salt\n- 3 cups bread flour",
                "A classic Pizza Margherita shows off the colors of the Italian flag with red tomatoes, white mozzarella and fresh green basil. —Loretta Lawrence, Myrtle Beach, South Carolina",
                "STEP 1:\nDissolve yeast in water; add oil, sugar, salt and flour. Knead 6-8 minutes.\n\nSTEP 2:\nLet rise 1 hour.\n\nSTEP 3:\nRoll into 13-in. circles; let rest 10 minutes.\n\nSTEP 4:\nSpoon tomatoes; top with basil, cheese and oregano. Bake at 450° for 15-20 minutes."));

        ps.create(new Produit("PEPPERONI-SAUSAGE STUFFED PIZZA", 5, R.drawable.pizza10, "45 min",
                "- 1 package active dry yeast\n- 1-1/4 cups warm water\n- 2 tablespoons olive oil\n- 1-1/2 teaspoons salt\n- 1 teaspoon sugar\n- 3-1/2 cups all-purpose flour",
                "For 30 years, friends have been telling me to open a pizzeria using this recipe. —Elizabeth Wolff, Carmel, Indiana",
                "STEP 1:\nDissolve yeast; mix with oil, salt, sugar and flour. Knead 6-8 minutes. Let rise 1 hour.\n\nSTEP 2:\nPress dough in pan; top with cheeses, sausage and pepperoni.\n\nSTEP 3:\nCover with remaining dough. Bake at 425° for 10 minutes.\n\nSTEP 4:\nReduce to 375°; spread pizza sauce. Bake 30-35 minutes."));

        // Adapter + ListView
        PizzaAdapter adapter = new PizzaAdapter(this, ps.findAll());
        ListView listView = findViewById(R.id.liste);
        listView.setAdapter(adapter);

        // Clic sur une pizza → détails
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Produit pizza = ps.findAll().get(position);
            Intent intent = new Intent(ListPizzaActivity.this, DetailPizzaActivity.class);
            intent.putExtra("id", pizza.getId());
            startActivity(intent);
        });
    }
}