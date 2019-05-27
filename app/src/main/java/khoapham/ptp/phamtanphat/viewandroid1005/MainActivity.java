package khoapham.ptp.phamtanphat.viewandroid1005;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnThongbao;
    EditText edtEmail;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnThongbao = findViewById(R.id.buttonThongbao);
        edtEmail = findViewById(R.id.edittextEmail);
        img = findViewById(R.id.imageview);
//        Toast.makeText(this, runThongbao("Xin chao") , Toast.LENGTH_SHORT).show();
//        function nhan tham so la 1 function

        btnThongbao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email =edtEmail.getText().toString();
                Log.d("BBB",email);
            }
        });
    }
    //Access modifier : private public protected
    // (Định nghĩa phạm vi hoạt động cho đối tượng)

    //1 : Pham vi hoạt động
    //2 : Kiểu dữ liệu trả về
    //3 : ten phương thức nên có động từ và danh từ viết hoa
    //4 : Tham số truyền vào
    private String runThongbao(String thongbao){
        return thongbao;
    }
}
