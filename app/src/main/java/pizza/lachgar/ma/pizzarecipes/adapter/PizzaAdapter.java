package pizza.lachgar.ma.pizzarecipes.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import pizza.lachgar.ma.pizzarecipes.R;
import pizza.lachgar.ma.pizzarecipes.beans.Produit;

public class PizzaAdapter extends ArrayAdapter<Produit> {

    private Context context;
    private List<Produit> produits;

    public PizzaAdapter(Context context, List<Produit> produits) {
        super(context, R.layout.item_pizza, produits);
        this.context = context;
        this.produits = produits;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Produit pizza = produits.get(position);
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_pizza, parent, false);

        ImageView imgPizza = view.findViewById(R.id.imgPizza);
        TextView tvNom = view.findViewById(R.id.tvNom);
        TextView tvNbr = view.findViewById(R.id.tvNbrIngredients);
        TextView tvDuree = view.findViewById(R.id.tvDuree);

        imgPizza.setImageResource(pizza.getPhoto());
        tvNom.setText(pizza.getNom());
        tvNbr.setText(String.valueOf(pizza.getNbrIngredients()));
        tvDuree.setText(pizza.getDuree());

        return view;
    }
}