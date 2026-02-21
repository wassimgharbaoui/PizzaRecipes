package pizza.lachgar.ma.pizzarecipes;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import pizza.lachgar.ma.pizzarecipes.beans.Produit;
import pizza.lachgar.ma.pizzarecipes.service.ProduitService;

public class DetailPizzaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pizza);

        int id = getIntent().getIntExtra("id", -1);
        Produit pizza = ProduitService.getInstance().findById(id);

        if (pizza != null) {
            ((ImageView) findViewById(R.id.imgDetail)).setImageResource(pizza.getPhoto());
            ((TextView) findViewById(R.id.tvNomDetail)).setText(pizza.getNom());
            ((TextView) findViewById(R.id.tvDescription)).setText(pizza.getDescription());
            ((TextView) findViewById(R.id.tvIngredients)).setText(pizza.getDetailsIngred());
            ((TextView) findViewById(R.id.tvPreparation)).setText(pizza.getPreparation());
        }
    }
}