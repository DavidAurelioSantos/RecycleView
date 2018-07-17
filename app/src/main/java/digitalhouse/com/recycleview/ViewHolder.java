package digitalhouse.com.recycleview;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ViewHolder extends RecyclerView.ViewHolder{

    private TextView title;
    public ViewHolder(View view){
        super(view);
        title = (TextView) view.findViewById(R.id.title);
    }

    public void bind(String s){
        title.setText(s);
    }
}
