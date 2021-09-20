import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bcantero.contenedores_01.R;

import java.util.ArrayList;

public class AdapterRecycler extends RecyclerView.Adapter<AdapterRecycler.ViewHolderDatos> {

    ArrayList<String> datos;
    public AdapterRecycler(ArrayList<String> datos){
        this.datos = datos;
    }

    @NonNull
    @Override
    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_items, null, false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos holder, int position) {
        holder.asignarDatos(datos.get(position));
    }

    @Override
    public int getItemCount() {
        return datos.size;
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
        }
    }
}
