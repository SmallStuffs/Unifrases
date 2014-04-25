package br.com.unifrases.activity;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import br.com.unifrases.R;
import br.com.unifrases.adpter.FraseAdapter;
import br.com.unifrases.entity.Frase;

public class MainActivity extends Activity {

	private List<Frase> frasesParaAutoComplete;
	private ArrayAdapter<Frase> arrayAdapter;
	private AutoCompleteTextView autoCompleteTextView;
	private TextView textView;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {

    	super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
        
        popularAutoComplete();
      
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        getMenuInflater().inflate(R.menu.main, menu);
        
        return true;
        
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

    	int id = item.getItemId();
        
    	if (id == R.id.action_settings)
            return true;
        
        return super.onOptionsItemSelected(item);
        
    }
  
    public void popularAutoComplete() {
    	  	
    	Frase fraseUm = new Frase();
    	fraseUm.setDescricao("A Unifrases agora está no celular!");
    	
    	frasesParaAutoComplete = new ArrayList<Frase>();
    	frasesParaAutoComplete.add(fraseUm);
    	
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.auto_complete);
        
        arrayAdapter = new FraseAdapter(this, android.R.layout.simple_list_item_1, frasesParaAutoComplete);
        
        autoCompleteTextView.setAdapter(arrayAdapter);
        
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> adapterView, View view, int posicao,
					long id) {
				
				textView = (TextView) findViewById(R.id.frase_de_saida);
				textView.setText("The Unifrases it's now on mobile!");
				
			}
			
		});
        
    }

}