package id.co.imastudio.firstkotlin

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSubmit.setOnClickListener {

            if(inputName.text.isNotEmpty()){

                Toast.makeText(this,"ini success",
                        Toast.LENGTH_SHORT).show()

            }
            else {
                var alert = AlertDialog.Builder(this)
                alert.setTitle("hei")
                alert.setMessage("ini alert dialog")
                alert.setPositiveButton("yes", DialogInterface.OnClickListener {
                    dialogInterface, i
                    ->  dialogInterface.dismiss() })
                alert.show()

            }




        }
    }
}
