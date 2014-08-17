package gdgwomen.com.principal;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Principal extends Activity implements View.OnClickListener{

    EditText txtnombre, txtpassword;
    Button entrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txtnombre= (EditText)findViewById(R.id.txtName);
        txtpassword = (EditText) findViewById(R.id.txtPass);
        entrar = (Button) findViewById(R.id.btnEntrar);
        entrar.setOnClickListener(this);


    }

    public void validar(View v)
    {
        String ingreso;
        ingreso=txtnombre.getText().toString();
        if(ingreso.length()==0)
        {
            txtnombre.setError("Ingresar nombre");
            txtnombre.setBackgroundColor(Color.GREEN);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view)
    {
      if(view==entrar)
      {
          String nombre,pass;
          nombre=txtnombre.getText().toString();
          pass=txtpassword.getText().toString();
          if(nombre.equals("roxy") && pass.equals("123"))
          {
              Toast.makeText(getApplicationContext(),"Bienvenido", Toast.LENGTH_SHORT).show();
          }
          else if(nombre.length()==0)
          {
              txtnombre.setError("Ingresar nombre");
              txtnombre.setBackgroundColor(Color.GREEN);
          }
          else if(!nombre.equals("roxy"))
          {
              txtnombre.setError("Nombre incorreto");
              txtnombre.setBackgroundColor(Color.GREEN);
          }
          else
          {
              Toast.makeText(getApplicationContext(),"Datos incorrectos", Toast.LENGTH_SHORT).show();
          }
      }
    }
}
