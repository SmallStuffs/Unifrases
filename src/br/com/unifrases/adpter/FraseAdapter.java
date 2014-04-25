package br.com.unifrases.adpter;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import br.com.unifrases.entity.Frase;

public class FraseAdapter extends ArrayAdapter<Frase> {
	
	private List<Frase> frases;
	private List<Frase> frasesSugeridas;
	
	public FraseAdapter(Context context, int viewResourceId, List<Frase> frases) {
		
		super(context, viewResourceId, frases);
		
		this.frases = frases;
		this.frasesSugeridas = new ArrayList<Frase>();
		
	}
	
	@Override
	public Filter getFilter() {
		
		Filter filter = new Filter() {
			
			@Override
			protected void publishResults(CharSequence constraint, FilterResults results) {
				
				if (results != null && results.count > 0)
					notifyDataSetChanged();
				
			}
			
			@Override
			protected FilterResults performFiltering(CharSequence constraint) {
				
				FilterResults filterResults =  new FilterResults();
				
				if(constraint != null) {
					
					for(int i = 0; i < frases.size(); i++) {
						
						if(frases.get(i).getDescricao().toLowerCase(Locale.getDefault()).contains(constraint.toString().toLowerCase(Locale.getDefault()))) {
							frasesSugeridas.add(frases.get(i));
						
							filterResults.values = frasesSugeridas;
							filterResults.count = frasesSugeridas.size();
							
						}
					}
				}
				
				return filterResults;
				
			}
			
		};
		
		return filter;
		
	}

}
